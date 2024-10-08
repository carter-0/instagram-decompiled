package X;

import com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2;

/* renamed from: X.Jia  reason: case insensitive filesystem */
public final class C60279Jia extends 2YL {
    public final float A00;
    public final int A01;
    public final C313666go A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final LES A0B;
    public final C59720JVe A0C;

    public static final int A00(C60279Jia jia) {
        int i;
        if (JTR.A1a(jia.A0B.A0i)) {
            i = jia.A08 * 2;
        } else {
            i = 0;
        }
        int i2 = (int) (((float) (jia.A0A - i)) / 0.5625f);
        int i3 = jia.A09;
        if (i2 > i3) {
            i2 = i3;
        }
        return i3 - i2;
    }

    public C60279Jia(C313666go r6, LES les, C59720JVe jVe, float f, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(les, jVe);
        this.A0B = les;
        this.A0C = jVe;
        this.A02 = r6;
        this.A09 = i;
        this.A0A = i2;
        this.A00 = f;
        this.A01 = i3;
        this.A08 = i4;
        this.A07 = z2;
        02z A012 = 106.A01((Object) null);
        this.A03 = A012;
        this.A06 = 10b.A03(A012);
        Float valueOf = Float.valueOf(0.0f);
        02z A10 = DbS.A10(valueOf);
        this.A05 = A10;
        02z A102 = DbS.A10(valueOf);
        this.A04 = A102;
        JTS.A13(this, MHB.A01(this, (AnonymousClass4D7) null, 32), jVe.A00);
        if (z) {
            JTR.A1H(this, new IgLiveLayoutManagerViewModel$2(this, (AnonymousClass4D7) null), les.A0n, A10, A102);
        }
    }
}
