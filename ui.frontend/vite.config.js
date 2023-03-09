import { defineConfig } from "vite";
import { viteForAem } from "@aem-vite/vite-aem-plugin";
import react from "@vitejs/plugin-react";
import babel from "vite-plugin-babel";

export default defineConfig(({ command, mode }) => ({
  base: command === "build" ? "/etc.clientlibs/react-vite/clientlibs/" : "/",
  publicDir: command === "build" ? false : "src/assets",
  optimizeDeps: {
    esbuildOptions: {
      loader: {
        ".js": "jsx",
      },
    },
  },
  build: {
    brotliSize: false,
    minify: mode === "development" ? false : "esbuild",
    outDir: "dist/clientlib-esmodule",
    manifest: true,
    sourcemap: command === "serve" ? "inline" : false,

    rollupOptions: {
      output: {
        assetFileNames:
          "clientlib-base/[ext]/[name].[hash][extname]",
        chunkFileNames:
          "clientlib-base/chunks/[name].[hash].js",
        entryFileNames:
          "clientlib-base/js/[name].[hash].js",
        // assetFileNames:
        //   "etc.clientlibs/react-vite/clientlibs/clientlib-esmodule/resources/[ext]/[name].[hash][extname]",
        // chunkFileNames:
        //   "etc.clientlibs/react-vite/clientlibs/clientlib-esmodule/resources/chunks/[name].[hash].js",
        // entryFileNames:
        //   "etc.clientlibs/react-vite/clientlibs/clientlib-esmodule/resources/js/[name].[hash].js",
      },
      input: {
        app: "src/index.js",
        styles: "src/index.css",
      },
    },
  },
  plugins: [
    viteForAem({
      contentPaths: ["/content/react-vite/us/en"],
      publicPath: "/etc.clientlibs/react-vite/clientlibs/clientlib-base",
    }),
    react(),
    babel(),
  ],
  server: {
    port: 3000,
    strictPort: true,
  },
}));
