package com.instagram.autoplay.models;

import X.0qQ;
import X.1Xj;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AutoplayOnScreenItemWithMetadata extends AutoplayScreenItemWithoutMetadata {
    public int height;
    public float percentageVisible;
    public int width;
    public int x;
    public int y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoplayOnScreenItemWithMetadata(1Xj r2, long j, int i, int i2, int i3, int i4, float f, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2, j, i, i2, i3, i4, (i5 & 64) != 0 ? 0.0f : f);
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getPercentageVisible() {
        return this.percentageVisible;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setPercentageVisible(float f) {
        this.percentageVisible = f;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final void setY(int i) {
        this.y = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoplayOnScreenItemWithMetadata(1Xj r2, long j, int i, int i2, int i3, int i4, float f) {
        super(r2, j);
        0qQ.A0B(r2, 1);
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
        this.percentageVisible = f;
    }
}
