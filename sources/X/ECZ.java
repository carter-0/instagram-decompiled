package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;

public final class ECZ extends 1P0 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass4DH A01;
    public final /* synthetic */ AnonymousClass6ST A02;
    public final /* synthetic */ AnonymousClass6Z5 A03;

    public ECZ(FragmentActivity fragmentActivity, AnonymousClass4DH r2, AnonymousClass6ST r3, AnonymousClass6Z5 r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A01 = r2;
    }

    public final void onFail(C268654dm r4) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r4, 139709656);
        Throwable A012 = r4.A01();
        if (A012 == null || (str = A012.getMessage()) == null) {
            str = "";
        }
        0wb.A03("Superlative", 002.A0R("See Yours : Fetch Superlative fail - ", str));
        C273384mU r1 = this.A03.A17;
        if (!((ReelViewerFragment) r1).A2q) {
            this.A02.dismiss();
            r1.EHd();
            C59689JTv.A0E(this.A00, "superlative_see_yours_api_network_error");
        }
        AnonymousClass0fD.A0A(1959994089, A0D);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-1835919266);
        ECZ.super.onStart();
        AnonymousClass0fN.A00(this.A02);
        this.A03.A17.EHY("dialog");
        AnonymousClass0fD.A0A(1529111397, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0fD.A03(-1573637369);
        C47305DuY duY = (C47305DuY) obj;
        int A0D = AnonymousClass7TG.A0D(duY, 1022723676);
        AnonymousClass6Z5 r3 = this.A03;
        C273384mU r1 = r3.A17;
        if (!((ReelViewerFragment) r1).A2q) {
            this.A02.dismiss();
            r1.EHd();
            G8W g8w = duY.A00;
            if (g8w == null) {
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
            } else {
                AnonymousClass3HX r12 = ((FTX) g8w).A00;
                AnonymousClass3HX r6 = null;
                if (r12 != null) {
                    UserSession userSession = r3.A09;
                    if (userSession != null) {
                        r6 = r12.FEr(1E4.A00(userSession));
                    }
                    0qQ.A0F("userSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "reelViewerBottomSheetManager";
                if (r6 != null) {
                    Long l = r6.A1K;
                    if (l == null || l.longValue() == 0) {
                        UserSession userSession2 = r3.A09;
                        if (userSession2 != null) {
                            0wb.A03("Superlative", 002.A0R("See Yours : latestReelMedia is null ", AnonymousClass3P9.A03(userSession2, r6)));
                        }
                        0qQ.A0F("userSession");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    LOR.A01.A01(r6.A0F);
                    C317766nn r32 = r3.A0N;
                    if (r32 != null) {
                        r32.A08(this.A00, this.A01, r6, AnonymousClass3BQ.SUPERLATIVE_FROM_SEE_YOURS);
                    }
                }
                C317766nn r2 = r3.A0N;
                if (r2 != null) {
                    r2.A0A(this.A00, AnonymousClass3BQ.SUPERLATIVE_FROM_SEE_YOURS);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(1174846879, A0D);
        AnonymousClass0fD.A0A(-1913851632, A032);
    }
}
