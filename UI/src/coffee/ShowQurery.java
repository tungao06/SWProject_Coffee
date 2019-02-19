/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.rdf.model.RDFNode;
import static edu.stanford.smi.protegex.owl.swrl.util.P3OWLUtil.getClass;
import java.awt.Image;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.internal.objects.NativeDebug.getClass;

/**
 *
 * @author pc
 */
public class ShowQurery extends javax.swing.JFrame {

    int i = 0;
    String[] COFFEE = new String[999];
    static String coffeeName;

    /**
     * Creates new form ShowQurery
     */
    public ShowQurery() {
        initComponents();
        System.out.println(ShowQurery.coffeeName);
        if (ShowQurery.coffeeName.contains("Latte")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "Milk", "CoffeeBean", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Milk ?CoffeeBean ?Water "
                        + "WHERE { ?Name rdf:type co:Latte ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasMilk ?Milk ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), milks.toString(), coffeebeans.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Flat White")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Milk", "Syrup", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Milk ?CoffeeBean ?Syrup ?Water "
                        + "WHERE { ?Name rdf:type co:Flat_White ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasMilk ?Milk ;"
                        + "co:hasSyrup ?Syrup ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Syrup = sol.get("Syrup");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), milks.toString(), coffeebeans.toString(), syrups.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Ice Chocolate Coffee")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Milk", "Syrup", "Chocolate", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Milk ?CoffeeBean ?Syrup ?Water ?Chocolate "
                        + "WHERE { ?Name rdf:type co:Ice-Chocolate_Coffee ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasMilk ?Milk ;"
                        + "co:hasSyrup ?Syrup ;"
                        + "co:hasChocolate ?Chocolate ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Syrup = sol.get("Syrup");
                    RDFNode Chocolate = sol.get("Chocolate");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Chocolate.toString().indexOf("#") + 1;
                    stop = Chocolate.toString().length();
                    String chocolates = Chocolate.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), milks.toString(), coffeebeans.toString(), syrups.toString(), chocolates.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Macchiato")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Milk", "Syrup", "Chocolate", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Milk ?CoffeeBean ?Syrup ?Water ?Chocolate "
                        + "WHERE { ?Name rdf:type co:Macchiato ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasMilk ?Milk ;"
                        + "co:hasSyrup ?Syrup ;"
                        + "co:hasChocolate ?Chocolate ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Syrup = sol.get("Syrup");
                    RDFNode Chocolate = sol.get("Chocolate");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Chocolate.toString().indexOf("#") + 1;
                    stop = Chocolate.toString().length();
                    String chocolates = Chocolate.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), milks.toString(), coffeebeans.toString(), syrups.toString(), chocolates.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Americano")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Syrup", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?CoffeeBean ?Syrup ?Water "
                        + "WHERE { ?Name rdf:type co:Americano ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasSyrup ?Syrup ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Syrup = sol.get("Syrup");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), coffeebeans.toString(), syrups.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Mocha")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Milk", "Chocolate", "Water", "WhipCream"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Water ?CoffeeBean ?WhipCream ?Chocolate ?Milk  "
                        + "WHERE { ?Name rdf:type co:Mocha ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasMilk ?Milk ;"
                        + "co:hasChocolate ?Chocolate ;"
                        + "co:hasWater ?Water ;"
                        + "co:hasWhipCream ?WhipCream;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Chocolate = sol.get("Chocolate");
                    RDFNode WhipCream = sol.get("WhipCream");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Chocolate.toString().indexOf("#") + 1;
                    stop = Chocolate.toString().length();
                    String chocolates = Chocolate.toString().substring(start, stop);

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = WhipCream.toString().indexOf("#") + 1;
                    stop = WhipCream.toString().length();
                    String whipcreams = WhipCream.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), coffeebeans.toString(), milks.toString(), chocolates.toString(), waters.toString(), whipcreams.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Lemon Black Coffee")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "CoffeeBean", "Honey", "Syrup", "Water"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + "SELECT DISTINCT ?Name ?Honey ?CoffeeBean ?Syrup ?Water "
                        + "WHERE { ?Name rdf:type co:Lemon-Black_Coffee ;"
                        + "co:hasCoffeeBean ?CoffeeBean ;"
                        + "co:hasHoney ?Honey ;"
                        + "co:hasSyrup ?Syrup ;"
                        + "co:hasWater ?Water ;"
                        + "}";
                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Water = sol.get("Water");
                    RDFNode Honey = sol.get("Honey");
                    RDFNode Syrup = sol.get("Syrup");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Honey.toString().indexOf("#") + 1;
                    stop = Honey.toString().length();
                    String honeys = Honey.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), honeys.toString(), coffeebeans.toString(), syrups.toString(), waters.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (ShowQurery.coffeeName.contains("Cappuccino")) {
            try {
                String[] tableColumnsName = {"CoffeeName", "Milk", "Water", "CoffeeBean", "Syrup"};
                DefaultTableModel aModel = (DefaultTableModel) jTable1.getModel();
                aModel.setColumnIdentifiers(tableColumnsName);
                aModel.setRowCount(0);

                String queryString;
                queryString = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
                        + "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
                        + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
                        + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>"
                        + "PREFIX co: <http://www.semanticweb.org/pc/ontologies/2562/1/coffee#>"
                        + " SELECT DISTINCT ?Name ?Milk ?Water ?CoffeeBean ?Syrup "
                        + " WHERE { ?Name rdf:type co:Cappuccino ; "
                        + " co:hasMilk ?Milk ; "
                        + " co:hasWater ?Water ; "
                        + " co:hasCoffeeBean ?CoffeeBean ; "
                        + " co:hasSyrup ?Syrup ; "
                        + " }";

                System.out.println(queryString);
                com.hp.hpl.jena.query.ResultSet results = OpenOWL.ExecSparQl(queryString);
                while (results.hasNext()) {
                    QuerySolution sol = results.nextSolution();
                    RDFNode Name = sol.get("Name");
                    RDFNode Milk = sol.get("Milk");
                    RDFNode Water = sol.get("Water");
                    RDFNode CoffeeBean = sol.get("CoffeeBean");
                    RDFNode Syrup = sol.get("Syrup");

                    int start, stop;
                    start = Name.toString().indexOf("#") + 1;
                    stop = Name.toString().length();
                    String names = Name.toString().substring(start, stop);
                    this.COFFEE[i++] = coffeeName;

                    start = Milk.toString().indexOf("#") + 1;
                    stop = Milk.toString().length();
                    String milks = Milk.toString().substring(start, stop);

                    start = Water.toString().indexOf("#") + 1;
                    stop = Water.toString().length();
                    String waters = Water.toString().substring(start, stop);

                    start = CoffeeBean.toString().indexOf("#") + 1;
                    stop = CoffeeBean.toString().length();
                    String coffeebeans = CoffeeBean.toString().substring(start, stop);

                    start = Syrup.toString().indexOf("#") + 1;
                    stop = Syrup.toString().length();
                    String syrups = Syrup.toString().substring(start, stop);

                    aModel.addRow(new Object[]{names.toString(), milks.toString(), waters.toString(), coffeebeans.toString(), syrups.toString()});
                    jTable1.setModel(aModel);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 610, 110));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/Back.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 230, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee/TableQurery.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        ShowQurery s = new ShowQurery();
        String CoffeeName = s.coffeeName;
        System.out.println(CoffeeName);
        if (CoffeeName == "Latte") {
            new Latte().setVisible(true);
            dispose();
        } else if (CoffeeName == "Mocha") {
            new Mocha().setVisible(true);
            dispose();
        } else if (CoffeeName == "Americano") {
            new Americano().setVisible(true);
            dispose();
        } else if (CoffeeName == "Cappuccino") {
            new Cappuccino().setVisible(true);
            dispose();
        } else if (CoffeeName == "Lemon Black") {
            new LemonBlackCoffee().setVisible(true);
            dispose();
        } else if (CoffeeName == "Lemon Black Coffee") {
            new LemonBlackCoffee().setVisible(true);
            dispose();
        } else if (CoffeeName == "Ice Chocolate Coffee") {
            new IceChocolateCoffee().setVisible(true);
            dispose();
        } else if (CoffeeName == "Macchiato") {
            new Macchiato().setVisible(true);
            dispose();
        } else if (CoffeeName == "Flat White") {
            new FlatWhite().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new UI().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowQurery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowQurery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowQurery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowQurery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowQurery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
