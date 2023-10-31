package br.edu.atitus.atitusound.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.atitusound.dtos.ArtistDTO;
import br.edu.atitus.atitusound.dtos.PlaylistDTO;
import br.edu.atitus.atitusound.entities.ArtistEntity;
import br.edu.atitus.atitusound.entities.MusicEntity;
import br.edu.atitus.atitusound.entities.PlaylistEntity;
import br.edu.atitus.atitusound.services.ArtistService;
import br.edu.atitus.atitusound.services.GenericService;
import br.edu.atitus.atitusound.services.PlaylistService;

@RestController
@RequestMapping("playlists")

public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO>{
	
	
	
	private final PlaylistService playlistService;

	public PlaylistController(PlaylistService playlistService) {
		super();
		this.playlistService = playlistService;
		System.out.println("ddjldkj");
	}


	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		PlaylistEntity entidade = new PlaylistEntity();
		BeanUtils.copyProperties(dto, entidade);
		return entidade;
	}
	@Override
	public GenericService<PlaylistEntity> getService(){
		return playlistService;
	}



	
}