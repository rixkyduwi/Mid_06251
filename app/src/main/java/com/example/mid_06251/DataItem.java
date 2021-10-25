package com.example.mid_06251;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DataItem {
    private String description;
    private String imgId;
    public DataItem(String description, String imgId) {
        this.description = description;
        this.imgId = imgId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImgId() {
        return imgId;
    }
    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}