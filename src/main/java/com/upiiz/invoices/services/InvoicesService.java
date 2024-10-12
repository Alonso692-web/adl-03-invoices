package com.upiiz.invoices.services;

import com.upiiz.invoices.models.Invoice;
import com.upiiz.invoices.repository.InvoicesRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoicesService {

    InvoicesRespository invoicesRespository;

    public InvoicesService(InvoicesRespository invoicesRespository) {
        this.invoicesRespository = invoicesRespository;
    }

    // GET - Todas las facturas
    public List<Invoice> getAllInvoices() {
        return invoicesRespository.obtenerTodas();
    }

    // GET - Una factura
    public Invoice getInvoiceById(Long id) {
        return invoicesRespository.obtenerFacturaPorId(id);
    }

    // POST
    public Invoice createInvoice(Invoice factura) {
        return invoicesRespository.guardar(factura);
    }

    // PUT
    public Invoice updateInvoice(Invoice factura) {
        return invoicesRespository.actualizar(factura);
    }

    // DELETE
    public void deleteInvoice(Long id) {
        invoicesRespository.eliminar(id);
    }

}
