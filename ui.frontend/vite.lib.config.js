module.exports = {
    libs: [
      {
        manifest: 'dist/manifest.json',
        // resourcesDir: 'dist/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources',
        resourcesDir: 'dist/clientlib-react/resources',
        clientlibDir: '../ui.apps/src/main/content/jcr_root/apps/react-vite/clientlibs/clientlib-react',
        categories: ['demo-category'],
        properties: {
          moduleIdentifier: 'vite',
        },
      },
    ],
  }