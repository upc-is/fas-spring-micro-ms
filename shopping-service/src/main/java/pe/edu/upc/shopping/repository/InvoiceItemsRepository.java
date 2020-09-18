package pe.edu.upc.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
