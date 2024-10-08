package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8oc  reason: invalid class name and case insensitive filesystem */
public final class C366278oc implements AnonymousClass8DF {
    public final /* synthetic */ C366258oa A00;

    public C366278oc(C366258oa r1) {
        this.A00 = r1;
    }

    public final void DBh(AnonymousClass87G r2) {
        C366258oa.A04(r2, this.A00);
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r19, String str, int i, boolean z) {
        AnonymousClass87G r4 = (AnonymousClass87G) r19;
        0qQ.A0B(r4, 0);
        if (!z || !C366258oa.A04(r4, this.A00)) {
            C366258oa r3 = this.A00;
            if (r4.A04 != AnonymousClass87I.LOADING_AR_EFFECT) {
                AnonymousClass8DM r0 = r3.A05;
                int i2 = i;
                r0.EKh(i2, true);
                r0.Crx(i2);
                C366068o8 r1 = r3.A07;
                AnonymousClass8DO AcK = r0.AcK();
                0qQ.A0B(AcK, 1);
                AnonymousClass84B r2 = AnonymousClass84B.EFFECT_TRAY;
                CameraAREffect A002 = r4.A00();
                if (A002 == null) {
                    C366068o8.A01(r2, r1);
                    return;
                }
                C366098oB r5 = r1.A0F;
                String str2 = A002.A0K;
                0qQ.A07(str2);
                Integer B09 = AcK.B09(str2);
                if (B09 == null) {
                    0kD.A08("PostCaptureEffectLogger", 002.A0R("Could not find effect id: ", A002.A0K), (Throwable) null);
                } else {
                    27r A01 = 27p.A01(r5.A00);
                    int intValue = B09.intValue();
                    A01.A11(C359198cG.A00(r5.A01), (C371088xY) null, A002.A0K, A002.A0M, A002.A0I, intValue, 2, A002.CbC());
                }
                String str3 = 27p.A01(r1.A0B).A04.A0L;
                r1.A05.Ewa(r1.A01, r1.A0C, A002, str3, "dial_select");
                r1.A0I.Epw(A002);
                r1.A0G.A00(r2, A002.A0K);
                C318136oS A003 = C318116oQ.A00(r1);
                C376889Js r42 = new C376889Js(r1, (AnonymousClass4D7) null, 24);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r42, A003);
                C353778Ja r52 = r1.A09;
                AnonymousClass11O.A03(C318116oQ.A00(r1), new C61860pz(new AnonymousClass9K3((Object) r1, (Object) AcK, (AnonymousClass4D7) null, 35), AnonymousClass0Zq.A00(new AnonymousClass9K3(r52, (AnonymousClass4D7) null, 24))));
                ((C3503584i) r52.A00.A00.A00()).EUm(A002);
                AnonymousClass8KC r02 = r1.A02;
                if (r02 != null) {
                    r02.DYN(A002);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r1, int i) {
    }
}
