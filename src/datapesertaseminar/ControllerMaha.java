/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author M.Thoriq
 */
class ControllerMaha {
    ArrayList<ModelMaha> ArrayData;
    DefaultTableModel tabelModel;
    
    public ControllerMaha() {
        ArrayData = new ArrayList<ModelMaha>();
    }
    
    public void InsertData(String email, String nama, String alamat, boolean jeniskel) {
        ModelMaha mhs = new ModelMaha(email,nama,alamat,jeniskel);
        ArrayData.add(mhs);
    }
    
    public DefaultTableModel showData(){
        String[] kolom = {"EMAIL", "NAMA", "ALAMAT", "JENIS KELAMIN"};
        Object [][] objData = new Object [ArrayData.size()][4];
        int i = 0;
        
        for(ModelMaha n : ArrayData){
            String[] arrData = {n.getEmail(), n.getNama(), n.getAlamat(),(n.isJeniskel())?"Laki-Laki" : "Wanita"};
            objData[i] = arrData;
            i++;
        }
        
        tabelModel = new DefaultTableModel(objData, kolom){
            @Override
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        return tabelModel;
        }
    }