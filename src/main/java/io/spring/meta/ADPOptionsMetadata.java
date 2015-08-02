package io.spring.meta;

import org.springframework.xd.module.options.spi.ModuleOption;

public class ADPOptionsMetadata {

	private String csvFilePath;

	public String getCsvFilePath() {
		return csvFilePath;
	}

	@ModuleOption("csv file path")
	public void setCsvFilePath(String csvFilePath) {
		this.csvFilePath = csvFilePath;
	}
}
