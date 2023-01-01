package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio do cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * inteface.
 * 
 * @author lucas
 *
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
