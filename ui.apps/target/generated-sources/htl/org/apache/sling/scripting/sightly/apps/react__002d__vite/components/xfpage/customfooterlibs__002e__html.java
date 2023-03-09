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

public final class customfooterlibs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
out.write("\n\n");
_global_clientlib = renderContext.call("use", "/libs/granite/sightly/templates/clientlib.html", obj());
out.write("\n");
{
    Object var_testvariable0 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")) ? renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit") : renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "preview")));
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        {
            Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
            {
                boolean var_templateoptions2_field$_esmodule = true;
                {
                    Object var_templateoptions2_field$_categories = (new Object[] {"cq.authoring.pagemodel.messaging"});
                    {
                        java.util.Map var_templateoptions2 = obj().with("esModule", var_templateoptions2_field$_esmodule).with("categories", var_templateoptions2_field$_categories);
                        callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
                    }
                }
            }
        }
    }
}
out.write("\n\n");
{
    Object var_templatevar3 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "js");
    {
        boolean var_templateoptions4_field$_esmodule = true;
        {
            Object var_templateoptions4_field$_categories = (new Object[] {"testing-frontend-react.base"});
            {
                java.util.Map var_templateoptions4 = obj().with("esModule", var_templateoptions4_field$_esmodule).with("categories", var_templateoptions4_field$_categories);
                callUnit(out, renderContext, var_templatevar3, var_templateoptions4);
            }
        }
    }
}
out.write("\n\n\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

