package org.jahia.kotlinSimple

import org.jahia.bin.Action
import org.jahia.bin.ActionResult
import org.jahia.services.content.JCRSessionWrapper
import org.jahia.services.render.RenderContext
import org.jahia.services.render.Resource
import org.jahia.services.render.URLResolver
import javax.servlet.http.HttpServletRequest

class SimpleAction : Action() {
    @Throws(Exception::class)
    override fun doExecute(httpServletRequest: HttpServletRequest, renderContext: RenderContext, resource: Resource,
                           jcrSessionWrapper: JCRSessionWrapper, map: Map<String, List<String>>,
                           urlResolver: URLResolver): ActionResult {
        val response = renderContext.response
        response.writer.write("Hello Kotlin!  The node path is " + resource.node.path)

        return ActionResult.OK
    }
}
