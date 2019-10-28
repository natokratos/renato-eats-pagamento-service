package br.com.caelum.pagamento;

import org.springframework.data.jpa.repository.JpaRepository;

interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
