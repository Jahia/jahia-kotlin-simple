package org.jahia.testKotlin;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class SimpleAction extends Action {

    @Override
    public ActionResult doExecute(HttpServletRequest httpServletRequest, RenderContext renderContext, Resource resource,
                                  JCRSessionWrapper jcrSessionWrapper, Map<String, List<String>> map,
                                  URLResolver urlResolver) throws Exception {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("key", "value");
//
//        return new ActionResult(HttpServletResponse.SC_OK, null, jsonObject);

        final HttpServletResponse response = renderContext.getResponse();

        response.getWriter().write("Hello Example Action!  The node path is " + resource.getNode().getPath());

        return ActionResult.OK;
    }
}
