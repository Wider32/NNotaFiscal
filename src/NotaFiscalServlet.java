import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class NotaFiscalServlet extends HttpServlet {

    // Método que será chamado para processar a requisição POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Configurar o tipo de conteúdo da resposta para HTML
        response.setContentType("text/html");
        
        // Obter os dados enviados pelo formulário
        String numero = request.getParameter("numero");
        String valor = request.getParameter("valor");
        String data = request.getParameter("data");
        String destinatario = request.getParameter("destinatario");

        // Obter o objeto PrintWriter para escrever a resposta
        PrintWriter out = response.getWriter();

        // Gerar a resposta HTML para exibir os dados da nota fiscal
        out.println("<html><body>");
        out.println("<h1>Nota Fiscal Gerada</h1>");
        out.println("<p><strong>Número:</strong> " + numero + "</p>");
        out.println("<p><strong>Valor Total:</strong> R$ " + valor + "</p>");
        out.println("<p><strong>Data de Emissão:</strong> " + data + "</p>");
        out.println("<p><strong>Destinatário:</strong> " + destinatario + "</p>");
        out.println("</body></html>");
    }

    //para inicializar o servlet
    @Override
    public void init() throws ServletException {
        super.init();
    }

    //para destruir o servlet (vai q precisa)
    @Override
    public void destroy() {
        super.destroy();
    }
}