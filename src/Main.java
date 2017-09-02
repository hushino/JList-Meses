import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        JFrame mimarco= new MarcoDeLista();

        mimarco.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mimarco.setVisible(true);
    }
}

class MarcoDeLista extends JFrame{
    MarcoDeLista(){
        setTitle("Prueba de lista");
        setBounds(400,300,400,300);
    String [] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
        listaDeMeses = new JList<String >(meses);

        listaDeMeses.setVisibleRowCount(4);

        JScrollPane laminaDeDeDesplazamiento= new JScrollPane(listaDeMeses);

        JPanel laminaDeLista = new JPanel();

        laminaDeLista.add(laminaDeDeDesplazamiento);

        listaDeMeses.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                List<String> valores=listaDeMeses.getSelectedValuesList();

                StringBuilder texto=new StringBuilder("Mes seleccionado: ");

                for (String elemento: valores){
                    texto.append(elemento);
                    texto.append(" ");
                }
                rotulo.setText(texto.toString());
            }
        });

        JPanel laminaDeTexto = new JPanel();

        rotulo=new JLabel("Mes seleccionado: ");

        laminaDeTexto.add(rotulo);

        add(laminaDeLista, BorderLayout.NORTH);
        add(laminaDeTexto, BorderLayout.SOUTH);
    }

    private JList<String> listaDeMeses;
    private JLabel rotulo;
}


















