package com.upiiz.invoices.controllers;

import com.upiiz.invoices.models.Invoice;
import com.upiiz.invoices.services.InvoicesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/invoices")
@RestController
public class InvoicesControllers {
    InvoicesService invoicesService;

    public InvoicesControllers(InvoicesService invoicesService) {
        this.invoicesService = invoicesService;
    }

    // GET - Todas las facturas
    @GetMapping
    public ResponseEntity<List<Invoice>> getFacturas() {
        return ResponseEntity.ok(invoicesService.getAllInvoices());
    }

    // GET - Solo una factura
    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getFactura(@PathVariable Long id) {
        return ResponseEntity.ok(invoicesService.getInvoiceById(id));
    }

    // POST - Crear una factura
    @PostMapping
    public ResponseEntity<Invoice> addInvoice(@RequestBody Invoice factura) {
        return ResponseEntity.ok(invoicesService.createInvoice(factura));
    }

    // PUT - Actualizar una factura
    @PutMapping("/{id}")
    public ResponseEntity<Invoice> updateFactura(@RequestBody Invoice categoria, @PathVariable Long id) {
        categoria.setInvoice_id(id);
        return ResponseEntity.ok(invoicesService.updateInvoice(categoria));
    }

    // DELETE - Eliminar una factura por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFactura(@PathVariable Long id) {
        invoicesService.deleteInvoice(id);
        return ResponseEntity.noContent().build();
    }


}
