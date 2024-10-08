package com.facebook.smartcapture.diagnostic;

import X.AnonymousClass7TG;
import android.graphics.Point;

public final class SegmentAnnotation {
    public final Color color;
    public final Point firstPoint;
    public final int lineWidth;
    public final Point secondPoint;

    public final Color getColor() {
        return this.color;
    }

    public final Point getFirstPoint() {
        return this.firstPoint;
    }

    public final int getLineWidth() {
        return this.lineWidth;
    }

    public final Point getSecondPoint() {
        return this.secondPoint;
    }

    public SegmentAnnotation(Point point, Point point2, Color color2, int i) {
        AnonymousClass7TG.A1U(point, point2, color2);
        this.firstPoint = point;
        this.secondPoint = point2;
        this.color = color2;
        this.lineWidth = i;
    }
}
