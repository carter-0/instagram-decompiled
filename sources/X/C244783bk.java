package X;

import android.graphics.PathEffect;

/* renamed from: X.3bk  reason: invalid class name and case insensitive filesystem */
public final class C244783bk extends 2TR {
    public 2V1 A00;
    public 2Tn A01;
    public int[] A02;
    public boolean[] A03;
    public final 2TR A04;
    public final 2VJ A05;

    public final void A0C(PathEffect pathEffect, float[] fArr, int[] iArr, int[] iArr2) {
        0qQ.A0B(iArr2, 1);
        0qQ.A0B(fArr, 2);
        int[] iArr3 = new int[4];
        System.arraycopy(iArr, 0, iArr3, 0, 4);
        System.arraycopy(iArr2, 0, this.A0u, 0, 4);
        System.arraycopy(fArr, 0, this.A0t, 0, 4);
        this.A09 = pathEffect;
        this.A02 = iArr3;
    }

    public C244783bk(2V1 r2, 2TR r3, 2VJ r4) {
        2VJ A002;
        this.A04 = r3;
        this.A00 = r2;
        if (r4 == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass3XP.A00(r4);
        }
        this.A05 = A002;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass2TY A06(C245043cC r3) {
        2V1 A052 = A05();
        0qQ.A0B(A052, 1);
        return new AnonymousClass2TY(A052, this, r3);
    }

    public C244783bk() {
        this((2V1) null, (2TR) null, (2VJ) null);
    }
}
