
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class AdministrarTodos implements Serializable{
    private JTree miunidad = new JTree();
    private JTree destacados= new JTree();
    private JTree papelera= new JTree();
    private ArrayList<Archivo> archivosdescrgados = new ArrayList();
    
    private final long serialVersionUID = 265275723563L;

    public AdministrarTodos() {
        javax.swing.tree.DefaultMutableTreeNode a = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        miunidad.setModel(new javax.swing.tree.DefaultTreeModel(a));
        javax.swing.tree.DefaultMutableTreeNode b = new javax.swing.tree.DefaultMutableTreeNode("Destacados");
        destacados.setModel(new javax.swing.tree.DefaultTreeModel(b));
        javax.swing.tree.DefaultMutableTreeNode c = new javax.swing.tree.DefaultMutableTreeNode("Papeleria");
        papelera.setModel(new javax.swing.tree.DefaultTreeModel(c));
    }
    

    public JTree getMiunidad() {
//        DefaultTreeModel modelomiunidad = (DefaultTreeModel) miunidad.getModel();
//        DefaultMutableTreeNode MiUnidad = new DefaultMutableTreeNode("Mi Unidad");
//        modelomiunidad.setRoot(MiUnidad);
//        miunidad.setModel(modelomiunidad);
        return miunidad;
    }
    
    

    public void setMiunidad(JTree miunidad) {
        
        this.miunidad = miunidad;
    }

    public JTree getDestacados() {
//        DefaultTreeModel modelodestacados = (DefaultTreeModel) destacados.getModel();
//        DefaultMutableTreeNode desta = new DefaultMutableTreeNode("Destacados");
//        modelodestacados.setRoot(desta);
//        destacados.setModel(modelodestacados);
        return destacados;
    }

    public void setDestacados(JTree destacados) {
        this.destacados = destacados;
    }

    public JTree getPapelera() {
//        DefaultTreeModel modelopapelera = (DefaultTreeModel) papelera.getModel();
//        DefaultMutableTreeNode pape = new DefaultMutableTreeNode("Papelera");
//        modelopapelera.setRoot(pape);
//        papelera.setModel(modelopapelera);
        return papelera;
    }

    public void setPapelera(JTree papelera) {
        this.papelera = papelera;
    }

    @Override
    public String toString() {
        return "AdministrarTodos{" + "miunidad=" + miunidad + ", destacados=" + destacados + ", papelera=" + papelera + '}';
    }
    
    public void CargarArboles(){
        try {
            
        } catch (Exception e) {
        }
    }
    
    public void EscribirArboles(){
        
    }
    
}
