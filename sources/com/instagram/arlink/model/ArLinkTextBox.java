package com.instagram.arlink.model;

import X.AnonymousClass7TE;
import X.C51965G9l;
import X.JTR;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;

public class ArLinkTextBox {
    public final float mRotationDegree;
    public final Point mSize;
    public final RectF mTextRect;

    public static int getDistance(float f, float f2, float f3, float f4) {
        return (int) JTR.A00(f3 - f, f4 - f2);
    }

    public float getRotationDegree() {
        return this.mRotationDegree;
    }

    public Point getSize() {
        return this.mSize;
    }

    public RectF getTextRect() {
        return this.mTextRect;
    }

    public ArLinkTextBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        RectF A0Y = AnonymousClass7TE.A0Y();
        this.mTextRect = A0Y;
        Point point = new Point();
        this.mSize = point;
        Path A0C = C51965G9l.A0C();
        A0C.moveTo(f, f2);
        A0C.lineTo(f3, f4);
        A0C.lineTo(f7, f8);
        A0C.lineTo(f5, f6);
        A0C.close();
        A0C.computeBounds(A0Y, true);
        float f9 = f3 - f;
        point.x = (int) JTR.A00(f9, f4 - f2);
        point.y = (int) JTR.A00(f5 - f, f6 - f2);
        this.mRotationDegree = (float) Math.toDegrees(Math.atan2((double) (f2 - f4), (double) f9));
    }
}
