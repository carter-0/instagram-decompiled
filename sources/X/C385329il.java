package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;

/* renamed from: X.9il  reason: invalid class name and case insensitive filesystem */
public final class C385329il extends 1P0 {
    public int A00;
    public final /* synthetic */ UserSession A01;

    public C385329il(UserSession userSession) {
        this.A01 = userSession;
    }

    public final void onFail(C268654dm r12) {
        int A03 = AnonymousClass0fD.A03(198001519);
        int i = this.A00;
        if (i < 7) {
            int pow = ((int) (2.0d * Math.pow(2.0d, (double) i))) * IgNetworkConsentStorage.MAX_ENTRIES;
            this.A00 = i + 1;
            1OC A002 = AnonymousClass93A.A00(this.A01);
            A002.A00 = this;
            1ES.A04(A002, 524, 4, pow, false, false);
        }
        AnonymousClass0fD.A0A(1988293278, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0xY AR4;
        int A03 = AnonymousClass0fD.A03(-1068593234);
        int A032 = AnonymousClass0fD.A03(-2137167357);
        this.A00 = 0;
        0xa r0 = AnonymousClass93A.A00;
        if (!(r0 == null || (AR4 = r0.AR4()) == null)) {
            AR4.E5c(AnonymousClass000.A00(2349), System.currentTimeMillis());
            AR4.apply();
        }
        AnonymousClass0fD.A0A(-1662518003, A032);
        AnonymousClass0fD.A0A(-1248968807, A03);
    }
}
