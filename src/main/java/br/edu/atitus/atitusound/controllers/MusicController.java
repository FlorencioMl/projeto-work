package br.edu.atitus.atitusound.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import br.edu.atitus.atitusound.dtos.MusicDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.services.GenericService;

public class MusicController extends GenericController<MusicEntity, MusicDTO>{

	@Override
	public GenericService<MusicEntity> getService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected MusicEntity convertDTO2Entity(MusicDTO dto) {
		ArtistEntity artist = new ArtistEntity();
		artist.setUuid(dto.getArtist().getUuid());
		MusicEntity entidade = new MusicEntity();
		BeanUtils.copyProperties(dto, entidade);
		entidade.setArtist(artist);
		return entidade;
	}

}



