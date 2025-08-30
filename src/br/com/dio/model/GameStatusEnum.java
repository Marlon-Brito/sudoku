package br.com.dio.model;

// Enum que define os status do game
public enum GameStatusEnum {

    // Status
    NON_STARTED("não iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");

    // Atributos
    private String label;

    // Construtor
    GameStatusEnum(final String label){
        this.label = label;
    }

    // Métodos
    public String getLabel() {
        return label;
    }

}
