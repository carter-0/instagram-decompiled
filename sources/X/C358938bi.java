package X;

import android.content.Context;

/* renamed from: X.8bi  reason: invalid class name and case insensitive filesystem */
public final class C358938bi {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Integer A09;

    public C358938bi() {
        this((Integer) null, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 1023);
    }

    public final int A00(Context context) {
        0qQ.A0B(context, 1);
        return (int) (this.A03 * ((float) AnonymousClass8XF.A01(context)));
    }

    public /* synthetic */ C358938bi(Integer num, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, int i5) {
        num = (i5 & 1) != 0 ? null : num;
        int i6 = 0;
        i = (i5 & 2) != 0 ? 0 : i;
        i2 = (i5 & 4) != 0 ? 0 : i2;
        i3 = (i5 & 8) != 0 ? 0 : i3;
        i6 = (i5 & 16) == 0 ? i4 : i6;
        float f5 = 0.0f;
        f = (i5 & 32) != 0 ? 0.0f : f;
        f5 = (i5 & 64) == 0 ? f2 : f5;
        f3 = (i5 & 128) != 0 ? 1.0f : f3;
        f4 = (i5 & 256) != 0 ? 0.2f : f4;
        float f6 = (i5 & 512) != 0 ? 0.3f : 0.0f;
        this.A09 = num;
        this.A05 = i;
        this.A06 = i2;
        this.A08 = i3;
        this.A07 = i6;
        this.A02 = f;
        this.A03 = f5;
        this.A00 = f3;
        this.A04 = f4;
        this.A01 = f6;
    }
}
