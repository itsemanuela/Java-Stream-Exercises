package entities;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
    private Long id;
    private String status;
    private LocalDate dataOrdine;
    private LocalDate dataSpedizione;
    private List<Prodotto> prodotti;
    private Cliente cliente;

    //costruttore ordine
    public Ordine(Long id, String nome, LocalDate dataOrdine, LocalDate dataSpedizione) {
        this.id=id;
        this.status=status;
        this.dataOrdine=dataOrdine;
        this.dataSpedizione=dataSpedizione;
        this.prodotti=prodotti;
        this.cliente=cliente;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id=id;}

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

    public LocalDate getDataOrdine() {return dataOrdine;}
    public void setDataOrdine(LocalDate dataOrdine) {this.dataOrdine = dataOrdine;}

    public LocalDate getDataSpedizione() {return dataSpedizione;}
    public void setDataSpedizione(LocalDate dataSpedizione) {
        this.dataSpedizione = dataSpedizione;
    }
    public List<Prodotto> getProdotti() {return prodotti;}
    public void setProdotti(List<Prodotto> prodotti) {this.prodotti = prodotti;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}


    @Override
    public String toString() {
        return "Ordine{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", dataOrdine=" + dataOrdine +
                ", dataSpedizione=" + dataSpedizione +
                ", prodotti=" + prodotti +
                ", cliente=" + cliente +
                '}';
    }
}
