/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.68
 * Generated at: 2016-03-19 04:07:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principalTeste_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Sticky footer &middot; Twitter Bootstrap</title>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <!-- CSS -->\r\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("      \r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("      /* Sticky footer styles\r\n");
      out.write("      -------------------------------------------------- */\r\n");
      out.write("\r\n");
      out.write("      html,\r\n");
      out.write("      body {\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        /* The html and body elements cannot have any padding or margin. */\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Wrapper for page content to push down footer */\r\n");
      out.write("      #wrap {\r\n");
      out.write("        min-height: 100%;\r\n");
      out.write("        height: auto !important;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        /* Negative indent footer by it's height */\r\n");
      out.write("        margin: 0 auto -60px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Set the fixed height of the footer here */\r\n");
      out.write("      #push,\r\n");
      out.write("      #footer {\r\n");
      out.write("        height: 60px;\r\n");
      out.write("      }\r\n");
      out.write("      #footer {\r\n");
      out.write("        background-color: #f5f5f5;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      /* Lastly, apply responsive CSS fixes as necessary */\r\n");
      out.write("      @media (max-width: 767px) {\r\n");
      out.write("        #footer {\r\n");
      out.write("          margin-left: -20px;\r\n");
      out.write("          margin-right: -20px;\r\n");
      out.write("          padding-left: 20px;\r\n");
      out.write("          padding-right: 20px;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      /* Custom page CSS\r\n");
      out.write("      -------------------------------------------------- */\r\n");
      out.write("      /* Not required for template or sticky footer method. */\r\n");
      out.write("\r\n");
      out.write("      #wrap > .container {\r\n");
      out.write("        padding-top: 60px;\r\n");
      out.write("      }\r\n");
      out.write("      .container .credit {\r\n");
      out.write("        margin: 20px 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      code {\r\n");
      out.write("        font-size: 80%;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <!-- Fav and touch icons -->\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../assets/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../assets/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("      <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../assets/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("                    <link rel=\"apple-touch-icon-precomposed\" href=\"../assets/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("                                   <link rel=\"shortcut icon\" href=\"../assets/ico/favicon.png\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Part 1: Wrap all page content here -->\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Fixed navbar -->\r\n");
      out.write("      <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("          <div class=\"container\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("              <span class=\"icon-bar\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"brand\" href=\"#\">Project name</a>\r\n");
      out.write("            <div class=\"nav-collapse collapse\">\r\n");
      out.write("              <ul class=\"nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#about\">About</a></li>\r\n");
      out.write("                <li><a href=\"#contact\">Contact</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                  <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Dropdown <b class=\"caret\"></b></a>\r\n");
      out.write("                  <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li><a href=\"#\">Action</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Another action</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Something else here</a></li>\r\n");
      out.write("                    <li class=\"divider\"></li>\r\n");
      out.write("                    <li class=\"nav-header\">Nav header</li>\r\n");
      out.write("                    <li><a href=\"#\">Separated link</a></li>\r\n");
      out.write("                    <li><a href=\"#\">One more separated link</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Begin page content -->\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"page-header\">\r\n");
      out.write("          <h1>Sticky footer with fixed navbar</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"lead\">Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS. A fixed navbar has been added within <code>#wrap</code> with <code>padding-top: 60px;</code> on the <code>.container</code>.</p>\r\n");
      out.write("        <p>Back to <a href=\"./sticky-footer.html\">the sticky footer</a> minus the navbar.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"push\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <p class=\"muted credit\">Example courtesy <a href=\"http://martinbean.co.uk\">Martin Bean</a> and <a href=\"http://ryanfait.com/sticky-footer/\">Ryan Fait</a>.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Le javascript\r\n");
      out.write("    ================================================== -->\r\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-transition.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-alert.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-modal.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-dropdown.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-scrollspy.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-tab.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-tooltip.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-popover.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-button.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-collapse.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-carousel.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap-typeahead.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
