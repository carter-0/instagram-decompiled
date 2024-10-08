package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.2qE  reason: invalid class name */
public final class AnonymousClass2qE implements C230772qF {
    public final UserSession A00;
    public final C228182kv A01;
    public final C230762qD A02;
    public final C227872kC A03;

    public AnonymousClass2qE(UserSession userSession, C228182kv r3, C230762qD r4, C227872kC r5) {
        0qQ.A0B(r3, 2);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = userSession;
    }

    public final void DEt(String str) {
        String A002 = AnonymousClass000.A00(1352);
        UserSession userSession = this.A00;
        C228182kv r3 = this.A01;
        String moduleName = AnonymousClass2kO.A00.getModuleName();
        FragmentActivity activity = this.A03.A00.getActivity();
        if (activity != null) {
            new C2355930l(activity, userSession).A04(moduleName, r3.getSessionId(), A002);
        }
    }

    public final void DFa() {
        C227872kC r1 = this.A03;
        1FI r0 = 1FI.A0B;
        C227802jw r5 = r1.A00;
        r5.A09 = r0;
        UserSession userSession = this.A00;
        if (!2Lv.A00(userSession).A00(CallerContext.A00(C227802jw.class), "ig_find_new_friends")) {
            C48920EmK.A00().A01(r5, userSession, new C51129Fp1(this.A02)).A06("ig_fb_nux_main_screen", (List) null);
        } else if (FC6.A02()) {
            C309516Yo r4 = new C309516Yo(r5.requireActivity(), userSession);
            r4.A08();
            r4.A0B((Bundle) null, FC6.A00().A00().A01("empty_feed", r5.getString(2131962465)));
            r4.A04();
        }
    }
}
