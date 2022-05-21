package com.dev.cisco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.dev.cisco.domain.Aluno;
import com.dev.cisco.exception.BadResourceException;
import com.dev.cisco.exception.ResourceAlreadyExistsException;
import com.dev.cisco.exception.ResourceNotFoundException;
import com.dev.cisco.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	private boolean existsById(Long id) {
		return alunoRepository.existsById(id);
	}
	
	public Aluno findById(Long id) throws ResourceNotFoundException {
		Aluno aluno = alunoRepository.findById(id).orElse(null);
			if (aluno==null) {
				throw new ResourceNotFoundException("Aluno não encontrado com o id:" + id);
			}
			else return aluno;
	}
	
	public Page<Aluno> findAll(Pageable pageable){
		return alunoRepository.findAll(pageable);
	}
	
	public Page<Aluno> findAllByNome(String nome, Pageable page){
		Page<Aluno> alunos = alunoRepository.findByNome(nome, page);
		return alunos;
	}
	
	public Aluno save(Aluno aluno) throws BadResourceException, ResourceAlreadyExistsException{
		
	}
}
