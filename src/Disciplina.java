public class Disciplina {
    private String nome;
    private int codigo;
    private String periodo;
    
    public Disciplina(String n,int c,String p){
        setNome(n);
        setCodigo(c);
        setPeriodo(p);
    }
    public String getNome(){
        return this.nome;
    }        
    public int getCodigo(){
        return this.codigo;
    }
    public String getPeriodo(){
        return this.periodo;
    }
    public void setNome(String n){
        this.nome=n;
    }
    public void setCodigo(int c){
        this.codigo=c;
    }
    public void setPeriodo(String p){
        this.periodo=p;
    }
}
