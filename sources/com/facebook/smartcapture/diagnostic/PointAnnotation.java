package com.facebook.smartcapture.diagnostic;

import X.AnonymousClass7TG;
import android.graphics.Point;

public final class PointAnnotation {
    public final Color color;
    public final Point point;
    public final int radius;

    public final Color getColor() {
        return this.color;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final int getRadius() {
        return this.radius;
    }

    public PointAnnotation(Point point2, Color color2, int i) {
        AnonymousClass7TG.A1O(point2, color2);
        this.point = point2;
        this.color = color2;
        this.radius = i;
    }
}
