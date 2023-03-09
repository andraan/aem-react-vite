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
package org.apache.sling.scripting.sightly.apps.react__002d__vite.components.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customheaderlibs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _global_page = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
out.write("\n");
_global_clientlib = renderContext.call("use", "/apps/aem-vite/granite/sightly/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar0 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        boolean var_templateoptions1_field$_esmodule = true;
        {
            String var_templateoptions1_field$_categories = "react-vite.base";
            {
                java.util.Map var_templateoptions1 = obj().with("esModule", var_templateoptions1_field$_esmodule).with("categories", var_templateoptions1_field$_categories);
                callUnit(out, renderContext, var_templatevar0, var_templateoptions1);
            }
        }
    }
}
out.write("\n\n\n\n<meta name=\"theme-color\" content=\"#000000\"/>\n<link rel=\"icon\" href=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/favicon.ico\"/>\n<link rel=\"apple-touch-icon\" href=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/logo192.png\"/>\n<link rel=\"manifest\" href=\"/etc.clientlibs/react-vite/clientlibs/clientlib-react/resources/manifest.json\"/>\n\n<!-- AEM page model -->\n");
_global_page = renderContext.call("use", com.adobe.aem.spa.project.core.models.Page.class.getName(), obj());
out.write("<meta property=\"cq:pagemodel_root_url\"");
{
    Object var_attrvalue2 = renderContext.getObjectModel().resolveProperty(_global_page, "hierarchyRootJsonExportUrl");
    {
        Object var_attrcontent3 = renderContext.call("xss", var_attrvalue2, "attribute");
        {
            boolean var_shoulddisplayattr5 = (((null != var_attrcontent3) && (!"".equals(var_attrcontent3))) && ((!"".equals(var_attrvalue2)) && (!((Object)false).equals(var_attrvalue2))));
            if (var_shoulddisplayattr5) {
                out.write(" content");
                {
                    boolean var_istrueattr4 = (var_attrvalue2.equals(true));
                    if (!var_istrueattr4) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent3));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n\n");
{
    Object var_testvariable6 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<meta property=\"cq:datatype\" content=\"JSON\"/>");
    }
}
out.write("\n");
{
    Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit");
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        out.write("<meta property=\"cq:wcmmode\" content=\"edit\"/>");
    }
}
out.write("\n");
{
    Object var_testvariable8 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview");
    if (renderContext.getObjectModel().toBoolean(var_testvariable8)) {
        out.write("<meta property=\"cq:wcmmode\" content=\"preview\"/>");
    }
}
out.write("\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

