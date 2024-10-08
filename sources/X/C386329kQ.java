package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.9kQ  reason: invalid class name and case insensitive filesystem */
public final class C386329kQ extends AnonymousClass3NK {
    public final /* synthetic */ AnonymousClass88A A00;
    public final /* synthetic */ String A01;

    public C386329kQ(AnonymousClass88A r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean Dqe(View view) {
        AnonymousClass88A r2 = this.A00;
        String str = this.A01;
        1aq r3 = 1as.A04.A01;
        C254763t0 r5 = new C254763t0(str);
        UserSession userSession = r2.A04;
        AnonymousClass3U9 C60 = 1bJ.A00(userSession).C60(str);
        if (C60 != null) {
            int C6a = C60.C6a();
            C376169Gw r1 = C376169Gw.A00;
            0sn r0 = 0sn.A00;
            AnonymousClass4DH r12 = r2.A03;
            new AnonymousClass6W8(r12.requireActivity(), r3.A02(r1.createWithAdditionalCapabilities(r0, r0), r5, (Integer) null, C6a, false, false, false), userSession, ModalActivity.class, C273654mx.A00(669)).A0C(r12.requireContext());
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }
}
