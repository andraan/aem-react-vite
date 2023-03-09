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
package org.apache.sling.scripting.sightly.apps.react__002d__vite.components.xfpage;

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

Object _global_page = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _global_clientlib = null;
out.write("\n\n");
_global_page = renderContext.call("use", com.adobe.aem.spa.project.core.models.Page.class.getName(), obj());
out.write("<meta property=\"cq:pagemodel_root_url\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_page, "hierarchyRootJsonExportUrl");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" content");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\n\n<base href=\"/\"/>\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n\n");
{
    Object var_testvariable4 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable4)) {
        out.write("<meta property=\"cq:datatype\" content=\"JSON\"/>");
    }
}
out.write("\n");
{
    Object var_testvariable5 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit");
    if (renderContext.getObjectModel().toBoolean(var_testvariable5)) {
        out.write("<meta property=\"cq:wcmmode\" content=\"edit\"/>");
    }
}
out.write("\n");
{
    Object var_testvariable6 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview");
    if (renderContext.getObjectModel().toBoolean(var_testvariable6)) {
        out.write("<meta property=\"cq:wcmmode\" content=\"preview\"/>");
    }
}
out.write("\n");
{
    Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "disabled");
    if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
        out.write("<meta property=\"cq:wcmmode\" content=\"disabled\"/>");
    }
}
out.write("\n\n");
_global_clientlib = renderContext.call("use", "/apps/aem-vite/granite/sightly/templates/clientlib.html", obj());
out.write("\n\n");
{
    Object var_templatevar8 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "all");
    {
        boolean var_templateoptions9_field$_esmodule = true;
        {
            Object var_templateoptions9_field$_categories = (new Object[] {"coralui3"});
            {
                java.util.Map var_templateoptions9 = obj().with("esModule", var_templateoptions9_field$_esmodule).with("categories", var_templateoptions9_field$_categories);
                callUnit(out, renderContext, var_templatevar8, var_templateoptions9);
            }
        }
    }
}
out.write("\n");
{
    Object var_templatevar10 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        boolean var_templateoptions11_field$_esmodule = true;
        {
            Object var_templateoptions11_field$_categories = (new Object[] {"react-vite.base"});
            {
                java.util.Map var_templateoptions11 = obj().with("esModule", var_templateoptions11_field$_esmodule).with("categories", var_templateoptions11_field$_categories);
                callUnit(out, renderContext, var_templatevar10, var_templateoptions11);
            }
        }
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

