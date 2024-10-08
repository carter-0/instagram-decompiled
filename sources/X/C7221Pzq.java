package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Pzq  reason: case insensitive filesystem */
public final class C7221Pzq {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C268594df A01;
    public final /* synthetic */ AnonymousClass37F A02;

    public final void A03(Integer num) {
        0qQ.A0B(num, 0);
        AnonymousClass37F r3 = this.A02;
        for (C262944Gp r0 : r3.A0z) {
            r0.D4N();
            r0.D4O(num);
        }
        C10312RqA rqA = r3.A0C;
        if (rqA != null) {
            rqA.A00.FMM(REW.PEEK, C9856RiV.A00(num));
        }
        if (r3.A0Q) {
            r3.A0C();
        }
    }

    public C7221Pzq(Fragment fragment, C268594df r2, AnonymousClass37F r3) {
        this.A02 = r3;
        this.A00 = fragment;
        this.A01 = r2;
    }

    public final void A00() {
        AnonymousClass37F r2 = this.A02;
        if (r2.A0k) {
            AnonymousClass37F.A05(this.A00, r2, AnonymousClass05K.A1I);
            return;
        }
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r2.A0r);
        if (A012 != null) {
            A012.A0X();
        }
    }

    public final void A01(int i, int i2) {
        AnonymousClass37F r3 = this.A02;
        for (C262944Gp DYG : r3.A0z) {
            DYG.DYG(i, i2);
        }
        if (r3.A0Z) {
            float CMx = this.A01.CMx();
            GPw gPw = r3.A0E;
            if (gPw == null || gPw.A00) {
                float A03 = AnonymousClass7TE.A03(AnonymousClass37F.A02(r3));
                float f = A03 - (CMx * A03);
                float f2 = (float) i;
                float A032 = (f2 - f) / (AnonymousClass7TE.A03(AnonymousClass37F.A02(r3)) - f);
                float f3 = 1.0f;
                if (f2 > f) {
                    f3 = 1.0f - A032;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                }
                AnonymousClass37F.A01(r3).setAlpha(f3);
                int i3 = r3.A03;
                if (i3 != 255) {
                    2db.A02(r3.A0r, 2eL.A06(i3, (int) (f3 * 128.0f)));
                }
            }
        }
        if (r3.A0i) {
            float A002 = (float) AnonymousClass0nB.A00(AnonymousClass7TE.A0S(AnonymousClass37F.A02(r3)));
            AnonymousClass1Nd.A00(r3.A0v).A00(new AnonymousClass3KV(C51970G9q.A1T((((double) ((A002 - ((float) i)) / A002)) > 0.8d ? 1 : (((double) ((A002 - ((float) i)) / A002)) == 0.8d ? 0 : -1)))));
        }
    }

    public final void A02(C61065Jw3 jw3) {
        for (C262944Gp Dx6 : this.A02.A0z) {
            Dx6.Dx6(jw3);
        }
    }
}
