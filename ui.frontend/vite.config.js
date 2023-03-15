import { defineConfig } from "vite";
import { viteForAem } from "@aem-vite/vite-aem-plugin";
import { bundlesImportRewriter } from "@aem-vite/import-rewriter";
import react from "@vitejs/plugin-react";

export default defineConfig(({ command, mode }) => ({
  // Enable load JS files instead of JSX
  // optimizeDeps: {
  //   esbuildOptions: {
  //     loader: {
  //       ".js": "jsx",
  //     },
  //   },
  // },

  base: command === "build" ? "/etc.clientlibs/react-vite/clientlibs/" : "/",
  publicDir: command === "build" ? false : "public",
  build: {
    brotliSize: false,
    manifest: true,
    minify: mode === "development" ? false : "esbuild",
    outDir: "dist",
    sourcemap: command === "serve" ? "inline" : false,

    rollupOptions: {
      output: {
        assetFileNames:
          "clientlib-react/resources/[ext]/[name].[hash][extname]",
        chunkFileNames: "clientlib-react/resources/chunks/[name].[hash].js",
        entryFileNames: "clientlib-react/resources/js/[name].[hash].js",
      },
      input: {
        bundle: "index.html",
      },
    },
  },
  plugins: [
    react(),
    viteForAem({
      contentPaths: [
        "/content/react-vite/us/en",
        "/",
        "./",
        "/content/react-vite/us/en/home.html",
      ],
      publicPath: "/etc.clientlibs/react-vite/clientlibs/clientlib-react",
    }),
    bundlesImportRewriter({
      publicPath: "/etc.clientlibs/react-vite/clientlibs/clientlib-react",
      resourcesPath: "resources/js",
    }),
  ],
  server: {
    port: 3000,
    strictPort: true,
  },
}));
