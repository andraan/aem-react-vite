/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.react__002d__vite.clientlibs.clientlib__002d__react.resources;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class index__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<!-- This file is only used during development -->\n\n<!DOCTYPE html>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\"/>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n    <meta name=\"theme-color\" content=\"#000000\"/>\n    <meta name=\"description\" content=\"React Vite\"/>\n\n    <link rel=\"icon\" href=\"data:image/x-icon;base64,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\"/>\n    <link rel=\"apple-touch-icon\" href=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/png/logo192.c386396e.png\"/>\n    <link rel=\"manifest\" href=\"data:application/json;base64,ewogICJzaG9ydF9uYW1lIjogIlJlYWN0IFZpdGUiLAogICJuYW1lIjogIlJlYWN0IFZpdGUiLAogICJpY29ucyI6IFsKICAgIHsKICAgICAgInNyYyI6ICJmYXZpY29uLmljbyIsCiAgICAgICJzaXplcyI6ICI2NHg2NCAzMngzMiAyNHgyNCAxNngxNiIsCiAgICAgICJ0eXBlIjogImltYWdlL3gtaWNvbiIKICAgIH0sCiAgICB7CiAgICAgICJzcmMiOiAibG9nbzE5Mi5wbmciLAogICAgICAidHlwZSI6ICJpbWFnZS9wbmciLAogICAgICAic2l6ZXMiOiAiMTkyeDE5MiIKICAgIH0sCiAgICB7CiAgICAgICJzcmMiOiAibG9nbzUxMi5wbmciLAogICAgICAidHlwZSI6ICJpbWFnZS9wbmciLAogICAgICAic2l6ZXMiOiAiNTEyeDUxMiIKICAgIH0KICBdLAogICJzdGFydF91cmwiOiAiL2NvbnRlbnQvcmVhY3Qtdml0ZS91cy9lbi9ob21lLmh0bWwiLAogICJkaXNwbGF5IjogInN0YW5kYWxvbmUiLAogICJ0aGVtZV9jb2xvciI6ICIjMDAwMDAwIiwKICAiYmFja2dyb3VuZF9jb2xvciI6ICIjZmZmZmZmIgp9Cg==\"/>\n\n    <title>React Vite</title>\n\n    <!-- AEM page model -->\n    <meta property=\"cq:pagemodel_root_url\" content=\"%REACT_APP_PAGE_MODEL_PATH%\"/>\n\n    <!-- In development mode, redirect from \"/\" to app root -->\n    <script>\n      if (\n        \"%NODE_ENV%\" === \"development\" &&\n        location.pathname === \"/\" &&\n        \"%REACT_APP_ROOT%\"\n      ) {\n        location.href = \"%REACT_APP_ROOT%\";\n      }\n    </script>\n    <script type=\"module\" crossorigin src=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/js/bundle.5f3d1adc.js\"></script>\n    <link rel=\"stylesheet\" href=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/css/bundle.46a0ed25.css\"/>\n  </head>\n  <body class=\"page basicpage\">\n    <noscript>You need to enable JavaScript to run this app.</noscript>\n    <div id=\"spa-root\"></div>\n    \n  </body>\n</html>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}
