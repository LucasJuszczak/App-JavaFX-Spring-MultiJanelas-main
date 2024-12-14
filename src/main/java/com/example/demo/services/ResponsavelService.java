package com.example.demo.services;


import com.example.demo.entities.Responsavel;
import com.example.demo.repositories.ResponsavelRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ResponsavelService {

    ResponsavelRepository responsavelRepository;

    public ResponsavelService(ResponsavelRepository responsavelRepository) { this.responsavelRepository = responsavelRepository; }

    @Transactional
    public void excluir(Responsavel responsavel) { responsavelRepository.delete(responsavel); }

//    @Transactional
//    public List<Responsavel> buscarPorAlunoId(int id){
//        List<Responsavel> responsaveis = new ArrayList<>();
//        responsavelRepository.findAllByAlunoId(id).forEach(responsaveis::add);
//        return responsaveis;
//    }

    @Transactional
    public Responsavel salvar(Responsavel responsavel){
        return responsavelRepository.save(responsavel);
    }
}
