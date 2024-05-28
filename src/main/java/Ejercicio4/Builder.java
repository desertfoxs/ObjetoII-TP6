package Ejercicio4;

public class Builder {

    private Combo combo;
    private Hamburguesas hamburguesasFinal;

    public Builder(Combo combo) {
        this.combo = combo;
        this.hamburguesasFinal = combo;
    }

    public Builder conTomate(){
        this.hamburguesasFinal = new Tomate(this.hamburguesasFinal);
        return this;
    }

    public Builder conPapa(){
        this.hamburguesasFinal = new Papa(this.hamburguesasFinal);
        return this;
    }

    public Builder conCarne(){
        this.hamburguesasFinal = new Carne(this.hamburguesasFinal);
        return this;
    }

    public Builder conQueso(){
        this.hamburguesasFinal = new Queso(this.hamburguesasFinal);
        return this;
    }

    public Hamburguesas pedirHamburguesa(){
        return this.hamburguesasFinal;
    }



}
