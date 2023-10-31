package br.edu.atitus.atitusound.entities;

import java.time.Duration;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class PlaylistEntity extends GenericEntity {
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_playlist_music")
	private List<MusicEntity> musics;

	private boolean public_share;

	public List<MusicEntity> getMusics() {
		return musics;
	}

	public void setMusics(List<MusicEntity> musics) {
		this.musics = musics;
	}

	public boolean isPublic_share() {
		return public_share;
	}

	public void setPublic_share(boolean public_share) {
		this.public_share = public_share;
	}
	
	

}
