package etapa3;

public class Dependente {

    private int idadeDependente;

    public Dependente(int idadeDependente) {
        this.idadeDependente = idadeDependente;
    }

    public int getIdadeDependente() {
        return idadeDependente;
    }

    public void setIdadeDependente(int idadeDependente) {
        this.idadeDependente = idadeDependente;
    }
    
    public boolean estaNaIdadeLimite(int idadeLimite){
        if(this.idadeDependente <= idadeLimite){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Dependente{" + "idadeDependente=" + idadeDependente + '}';
    }

}
