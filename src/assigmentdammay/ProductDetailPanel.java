/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigmentdammay;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tu Anh
 */
public class ProductDetailPanel extends javax.swing.JPanel {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
    /**
     * Creates new form ProductDetailPanel
     */
    public ProductDetailPanel() {
        initComponents();
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
        ListProductDetail = new javax.swing.JList<>();
        Refresh = new javax.swing.JButton();
        AddProductDetail = new javax.swing.JButton();
        UpdateProductDetail = new javax.swing.JButton();
        DeleteProductDetail = new javax.swing.JButton();
        ProductDetailName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Searchbox = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        ListProduct = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        ListProductDetail.setModel(new javax.swing.AbstractListModel<ProductDetail>() {
            ProductDetail[] strings = {new ProductDetail("a","b","c")};
            public int getSize() { return strings.length; }
            public ProductDetail getElementAt(int i) { return strings[i]; }
        });
        ListProductDetail.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListProductDetailValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListProductDetail);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        AddProductDetail.setText("Thêm");
        AddProductDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProductDetailActionPerformed(evt);
            }
        });

        UpdateProductDetail.setText("Sửa");
        UpdateProductDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProductDetailActionPerformed(evt);
            }
        });

        DeleteProductDetail.setText("Xóa");
        DeleteProductDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteProductDetailActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên sản phẩm");

        SearchButton.setText("Search");
        SearchButton.setToolTipText("");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ListProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new Product[] {new Product("1","1","1","1","1")}));
        ListProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListProductActionPerformed(evt);
            }
        });

        jLabel2.setText("Thuộc mặt hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Refresh)
                        .addGap(65, 65, 65)
                        .addComponent(Searchbox, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductDetailName)
                            .addComponent(ListProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchButton)
                    .addComponent(AddProductDetail)
                    .addComponent(UpdateProductDetail)
                    .addComponent(DeleteProductDetail))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Refresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductDetailName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddProductDetail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateProductDetail)
                            .addComponent(ListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(DeleteProductDetail)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void addItemtoList(){
 conn = MysqlConnect.connectDB();
            String sql = "SELECT * FROM product_detail";
            try{
                pst = conn.prepareStatement(sql);
               
                rs =  pst.executeQuery();
               while(rs.next()){
                  ProductDetail pd = new ProductDetail(rs.getString("Pro_id"),rs.getString("Pro_name"),rs.getString("Product_id"));
                  add(pd);
               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
}
 DefaultListModel<ProductDetail> dm = new DefaultListModel();
private void add(ProductDetail pd){
    ListProductDetail.setModel(dm);
    
    dm.addElement(pd);
    
}
    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
         dm.removeAllElements();
        addItemtoList();
        dc.removeAllElements();
        addItemtoComboBox();
    }//GEN-LAST:event_RefreshActionPerformed

    private void AddProductDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProductDetailActionPerformed
        // TODO add your handling code here:
         conn = MysqlConnect.connectDB();
            String sql = "INSERT INTO product_detail (Pro_name,Product_id) VALUES (?,?)";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, ProductDetailName.getText());
               
                 Product product = (Product)ListProduct.getSelectedItem();
                 pst.setString(2,product.getId());
                 

                int a =pst.executeUpdate();
                if(a>0){
                    JOptionPane.showMessageDialog(null, "Add Product Detail Success");
                      dm.removeAllElements();
                     addItemtoList();
                }else{
                JOptionPane.showMessageDialog(null, "Add Product Detail Failure");}
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Co loi xay ra"+e);}
        
    }//GEN-LAST:event_AddProductDetailActionPerformed

     public void addItemtoComboBox(){
    conn = MysqlConnect.connectDB();
            String sql = "SELECT * FROM product";
            try{
                pst = conn.prepareStatement(sql);
               
                rs =  pst.executeQuery();
               while(rs.next()){
                  Product pr = new Product(rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Price"),rs.getString("Img"),rs.getString("Brand_Id"));
                  addCombox(pr);
               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
    }
     DefaultComboBoxModel<Product> dc = new DefaultComboBoxModel();
private void addCombox(Product pr){
    ListProduct.setModel(dc);
    
   dc.addElement(pr);
    
}
    private void ListProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListProductActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ListProductActionPerformed

    private void UpdateProductDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProductDetailActionPerformed
        // TODO add your handling code here:
         conn = MysqlConnect.connectDB();
            String sql = "UPDATE product_detail SET Pro_name =?, Product_id =? WHERE Pro_id =?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, ProductDetailName.getText());
                ProductDetail productdetail = ListProductDetail.getSelectedValue();
                String id = productdetail.getId();
                pst.setString(3, id);
                Product product = (Product)ListProduct.getSelectedItem();
                String productId = product.getId();
                pst.setString(2,productId);
               
                int a =  pst.executeUpdate();
               if(a>0){
                                   JOptionPane.showMessageDialog(null, "Update Brand Success");
                                     dm.removeAllElements();
                                     addItemtoList();

               }else{
                                   JOptionPane.showMessageDialog(null, "Update Brand Failure");

               }
            }catch(SQLException | HeadlessException e){
             System.out.println("Co loi xay ra "+e);}
    }//GEN-LAST:event_UpdateProductDetailActionPerformed

    private void ListProductDetailValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListProductDetailValueChanged
        // TODO add your handling code here:
         ProductDetail productdetail = ListProductDetail.getSelectedValue();
        ProductDetailName.setText(productdetail.ProductDetailName);
        
        
       
          conn = MysqlConnect.connectDB();
                String sql = "SELECT * FROM product WHERE Product_id  =?";       
             try{
                pst = conn.prepareStatement(sql);
               pst.setString(1,productdetail.ProductId);
               
                 rs =  pst.executeQuery();
             while(rs.next()){
                  Product pr = new Product(rs.getString("Product_id"),rs.getString("Product_name"),rs.getString("Price"),rs.getString("Img"),rs.getString("Brand_Id"));
                  ListProduct.setSelectedItem(pr);
              }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
    }//GEN-LAST:event_ListProductDetailValueChanged

    private void DeleteProductDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteProductDetailActionPerformed
        // TODO add your handling code here:
         conn = MysqlConnect.connectDB();
            String sql = " DELETE FROM product_detail WHERE Pro_id  =?";
            try{
                pst = conn.prepareStatement(sql);
               
                ProductDetail productdetail = ListProductDetail.getSelectedValue();
                pst.setString(1,productdetail.getId());
                int a =  pst.executeUpdate();
               if(a>0){
                                   JOptionPane.showMessageDialog(null, "Delete Product Detail Success");
                                     dm.removeAllElements();
                                      addItemtoList();

               }else{
                                   JOptionPane.showMessageDialog(null, "Delete Product Detail Failure");

               }
            }catch(Exception e){
            
              JOptionPane.showMessageDialog(null, "Delete Product Failure \n"+e);
            }
    }//GEN-LAST:event_DeleteProductDetailActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        conn = MysqlConnect.connectDB();
            String sql = "SELECT * FROM product_detail WHERE Pro_name =?";
            
            try{
                  String proName  = Searchbox.getText();
             
                pst = conn.prepareStatement(sql);
                pst.setString(1,proName);
               
             
                rs =  pst.executeQuery();
               while(rs.next()){
                  ProductDetail pr = new ProductDetail(rs.getString("Pro_id"),rs.getString("Pro_name"),rs.getString("Product_id"));
                  dm.removeAllElements();
                add(pr);
               }
            }catch(Exception e){
             System.out.println("Co loi xay ra "+e);}
    }//GEN-LAST:event_SearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProductDetail;
    private javax.swing.JButton DeleteProductDetail;
    private javax.swing.JComboBox<Product> ListProduct;
    private javax.swing.JList<ProductDetail> ListProductDetail;
    private javax.swing.JTextField ProductDetailName;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField Searchbox;
    private javax.swing.JButton UpdateProductDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
