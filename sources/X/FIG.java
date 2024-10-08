package X;

import android.content.DialogInterface;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

public final class FIG implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public FIG(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        int i3;
        Integer num;
        String str;
        switch (this.A00) {
            case 0:
                if (i != 0) {
                    if (i == 1) {
                        i3 = 8;
                    } else if (i == 2) {
                        i3 = 24;
                    } else if (i == 3) {
                        i2 = -1;
                    } else if (i != 4 || !this.A02) {
                        ((C51902G6w) this.A01).onCancel();
                        return;
                    } else {
                        i2 = 60;
                    }
                    i2 = i3 * ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
                } else {
                    i2 = ARDRemoteModelVersionFetcher.REQUEST_CACHE_TTL_SECONDS;
                }
                ((C51902G6w) this.A01).DBE(i2);
                return;
            case 1:
                C49658F0p f0p = (C49658F0p) this.A01;
                1Z4 r2 = 1Z4.A00;
                UserSession userSession = f0p.A02;
                r2.A01(f0p.A00, f0p.A01, userSession, f0p.A03, f0p.A04, f0p.A05, f0p.A06, this.A02 ^ true ? 1 : 0);
                return;
            case 2:
                boolean z = true;
                if (!this.A02 || 1wB.A00(((ESO) this.A01).A00).A03(CallerContext.A01(ESO.__redex_internal_original_name), "ig_native_linking_cache_logout_linked_accounts", "INSTAGRAM").size() <= 1) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                ESO eso = (ESO) this.A01;
                C319606qt A012 = C319606qt.A01(eso.A00);
                UserSession userSession2 = eso.A00;
                A012.A0A(eso, userSession2, AnonymousClass05K.A0N, userSession2.A06);
                if (valueOf.booleanValue()) {
                    C49132Epv.A00(eso.getContext(), eso, eso.A00, false, true, true, false);
                }
                ESO.A07(eso);
                return;
            case 3:
                FH4 fh4 = (FH4) this.A01;
                FCF.A00(fh4.A03, fh4.A04, "logout_d2_logout_tapped");
                fh4.A0D(EVP.SINGLE, this.A02);
                return;
            case 4:
                C15397Uc0 uc0 = (C15397Uc0) this.A01;
                boolean z2 = this.A02;
                if (z2) {
                    DbW.A1L(AnonymousClass7TF.A0N(uc0.A03), AnonymousClass000.A00(3001));
                }
                Integer num2 = uc0.A0B;
                if (num2 != null) {
                    UserSession userSession3 = uc0.A03;
                    AnonymousClass0iw r1 = uc0.A01;
                    if (z2) {
                        num = AnonymousClass05K.A0N;
                    } else {
                        num = AnonymousClass05K.A0Y;
                    }
                    FCT.A00(r1, userSession3, num2, num);
                }
                uc0.A02.A02(uc0.A07.A01(z2), new C19858Wgk(uc0, 2));
                return;
            default:
                GIY giy = (GIY) this.A01;
                boolean z3 = this.A02;
                UserSession userSession4 = giy.A03;
                C51979GAc gAc = giy.A01;
                if (gAc != null) {
                    String str2 = gAc.A03.A01;
                    0qQ.A0B(str2, 2);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, userSession4), AnonymousClass000.A00(660));
                    if (A0e.isSampled()) {
                        if (z3) {
                            str = "translation_all_keep";
                        } else {
                            str = "translation_audio_keep";
                        }
                        A0e.AAJ(AnonymousClass000.A00(727), str);
                        A0e.AAJ(AnonymousClass000.A00(728), C273654mx.A00(997));
                        A0e.AAJ("containermodule", gAc.getModuleName());
                        A0e.A8k("media_index", 0);
                        A0e.AAJ("viewer_session_id", str2);
                        A0e.Cgf();
                        return;
                    }
                    return;
                }
                0qQ.A0F("analyticsModule");
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
