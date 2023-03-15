// const path = require("path");

// const BUILD_DIR = path.join(__dirname, "dist");
// const CLIENTLIB_DIR = path.join(
//   __dirname,
//   "..",
//   "ui.apps",
//   "src",
//   "main",
//   "content",
//   "jcr_root",
//   "apps",
//   "react-vite",
//   "clientlibs"
// );

// // Config for `aem-clientlib-generator`
// module.exports = {
//   context: BUILD_DIR,
//   clientLibRoot: CLIENTLIB_DIR,
//   libs: {
//     name: "clientlib-react",
//     allowProxy: true,
//     categories: ["react-vite.react"],
//     serializationFormat: "xml",
//     cssProcessor: ["default:none", "min:none"],
//     jsProcessor: ["default:none", "min:none"],
//     assets: {
//       // Copy entrypoint scripts and stylesheets into the respective ClientLib
//       // directories (in the order they are in the entrypoints arrays). They
//       // will be bundled by AEM and requested from the HTML. The remaining
//       // chunks (placed in `resources`) will be loaded dynamically
//       // js: entrypoints.filter(fileName => fileName.endsWith('.js')),
//       // css: entrypoints.filter(fileName => fileName.endsWith('.css')),
//       js: {
//         cwd: "clientlib-base",
//         files: ["**/*.js"],
//         flatten: false,
//       },

//       // Copy all other files into the `resources` ClientLib directory
//       resources: {
//         cwd: '.',
//         files: ['**/*.*'],
//         flatten: false,
//       }
//     },
//   },
// };

const path = require('path');

const BUILD_DIR = path.join(__dirname, 'dist');
const CLIENTLIB_DIR = path.join(
  __dirname,
  '..',
  'ui.apps',
  'src',
  'main',
  'content',
  'jcr_root',
  'apps',
  'react-vite',
  'clientlibs'
);

const libsBaseConfig = {
  allowProxy: true,
  serializationFormat: 'xml',
  cssProcessor: ['default:none', 'min:none'],
  jsProcessor: ['default:none', 'min:none'],
};

module.exports = {
  context: BUILD_DIR,
  clientLibRoot: CLIENTLIB_DIR,
  libs: [
    {
      ...libsBaseConfig,
      customProperties: ['moduleIdentifier'],
      moduleIdentifier: 'vite',
      name: 'clientlib-react',
      categories: ['react-vite.react'],
      assets: {
        js: {
          cwd: 'clientlib-react/resources/js',
          files: ['**/*.js'],
          flatten: false
        },
        css: {
          cwd: 'clientlib-react/resources/css',
          files: ['**/*.css'],
          flatten: false
        },
        resources: {
          cwd: '.',
          files: ['**/*.*'],
          flatten: false,
        }
      },
    },
  ],
};
