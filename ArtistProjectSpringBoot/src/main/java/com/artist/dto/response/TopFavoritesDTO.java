package com.artist.dto.response;

public class TopFavoritesDTO {
	private String paintingId;
	private Long count;

	public TopFavoritesDTO(String paintingId, Long count) {
		this.paintingId = paintingId;
		this.count = count;
	}

	public String getPaintingId() {
		return paintingId;
	}

	public void setPaintingId(String paintingId) {
		this.paintingId = paintingId;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
}