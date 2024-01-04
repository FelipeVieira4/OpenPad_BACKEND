package com.openPad.backEnd.dots;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MensageRecordDto(@NotBlank @NotNull String content, @NotBlank @NotNull String id) {}