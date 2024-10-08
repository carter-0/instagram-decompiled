package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.MpO  reason: case insensitive filesystem */
public final class C67529MpO implements AnonymousClass2gO {
    public final /* synthetic */ C66633Ma2 A00;

    public C67529MpO(C66633Ma2 ma2) {
        this.A00 = ma2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass9VE r0;
        AnonymousClass9VF r02;
        C69619Np1 np1 = (C69619Np1) obj;
        0qQ.A0B(np1, 0);
        if (np1 instanceof C68996NcY) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(C273654mx.A00(2301), ((C68996NcY) np1).A00);
            C66633Ma2 ma2 = this.A00;
            AnonymousClass4DH r2 = ma2.A1J;
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(r2.requireActivity(), A0a, ma2.A0p(), ModalActivity.class, C273654mx.A00(832));
            A03.A0J = ModalActivity.A08;
            DbU.A1K(r2, A03);
            C67541Mpb mpb = ma2.A0k;
            if (mpb != null && (r0 = ((C67550Mpk) mpb.A05.getValue()).A00) != null && (r02 = r0.A03) != null) {
                UserSession userSession = mpb.A02;
                String A0O = 002.A0O("sip_education_notice_interstitial_shown_", r02.hashCode());
                1Av A002 = 1Au.A00(userSession);
                A002.A0z(A0O, A002.A01.getInt(A0O, 0) + 1);
                C68997NcZ ncZ = C68997NcZ.A00;
                AnonymousClass7TE.A1Z(new C66167MGe((Object) mpb, (Object) ncZ, (AnonymousClass4D7) null, 27), C318116oQ.A00(mpb));
            }
        }
    }
}
