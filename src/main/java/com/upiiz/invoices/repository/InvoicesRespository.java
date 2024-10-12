package com.upiiz.invoices.repository;

import com.upiiz.invoices.models.Invoice;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InvoicesRespository {

    private List<Invoice> facturas = new ArrayList<Invoice>();

    private AtomicLong id = new AtomicLong();

    // GET
    public List<Invoice> obtenerTodas() {
        return facturas;
    }

    // GET - ID
    public Invoice obtenerFacturaPorId(Long invoice_id) {
        return facturas.stream().filter(factura -> factura.getInvoice_id().equals(invoice_id)).findFirst().orElse(null);
    }

    // POST
    public Invoice guardar(Invoice factura) {
        factura.setInvoice_id(id.incrementAndGet());
        facturas.add(factura);
        return factura;
    }

    // DELETE
    public void eliminar(Long id) {
        facturas.removeIf(factura -> factura.getInvoice_id().equals(id));
    }

    // PUT
    public Invoice actualizar(Invoice factura) {
        eliminar(factura.getInvoice_id());
        facturas.add(factura);
        return factura;
    }

}
