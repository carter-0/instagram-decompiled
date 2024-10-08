package X;

import android.graphics.RectF;

/* renamed from: X.5Eq  reason: invalid class name and case insensitive filesystem */
public final class C282765Eq implements Comparable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public int A0B;
    public int A0C;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A0C - ((C282765Eq) obj).A0C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C282765Eq) || this.A0C != ((C282765Eq) obj).A0C) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A0C;
    }

    public C282765Eq(RectF rectF, float f, int i, int i2, int i3) {
        this(rectF.centerX(), rectF.centerY(), rectF.width(), rectF.height(), f, i, i2, i3);
    }

    public C282765Eq(float f, float f2, float f3, float f4, float f5, int i, int i2, int i3) {
        this.A0B = i;
        float round = (float) Math.round(f);
        this.A00 = round;
        float round2 = (float) Math.round(f2);
        this.A01 = round2;
        float round3 = (float) Math.round(f3);
        this.A0A = round3;
        float round4 = (float) Math.round(f4);
        this.A02 = round4;
        float f6 = (float) i2;
        this.A03 = round / f6;
        float f7 = (float) i3;
        this.A05 = round2 / f7;
        this.A04 = f / f6;
        this.A06 = f2 / f7;
        this.A08 = round3 / f6;
        this.A07 = round4 / f7;
        this.A0C = 0;
        this.A09 = f5;
    }

    public C282765Eq() {
    }
}
