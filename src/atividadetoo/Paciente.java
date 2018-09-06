
package atividadetoo;

import javax.swing.JOptionPane;


public class Paciente extends Pessoa {
    
    private int codPaciente=0;
    private String senhaPaciente="";
    
    public boolean Logar(String senha){
        
        String senhaPaciente="";
        boolean certa = false;
        
        senha=JOptionPane.showInputDialog(null, "Senha: ");
        if(senha == senhaPaciente ){
            certa=true;
    }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta" );
        }
        return certa;
    }
    
    public int getCodPaciente(){
        int codPaciente=0;
        return this.codPaciente;
        
    }
    
    // codFuncionario não existente 
    
    public void setCodPaciente(int codPaciente){
       if (codPaciente != 0) {
       this.codPaciente = codPaciente;
        }
    }

}
