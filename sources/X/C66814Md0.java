package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Md0  reason: case insensitive filesystem */
public final class C66814Md0 {
    public final AnonymousClass0iw A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public final void A00(String str) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A01;
        AnonymousClass0iw r8 = this.A00;
        String moduleName = r8.getModuleName();
        0qQ.A0B(moduleName, 0);
        0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(160), moduleName);
        0eP A1L2 = AnonymousClass7TE.A1L(AnonymousClass000.A00(196), DbY.A0j("OPEN_PROACTIVE_WARNING_FLOW"));
        0eP A1L3 = AnonymousClass7TE.A1L("trigger_session_id", C51972G9s.A0n());
        LinkedHashMap A07 = 0Yt.A07(AnonymousClass7TH.A0h(AnonymousClass000.A00(317), AnonymousClass7TF.A0c(), A1L, A1L2, A1L3));
        A07.put("proactive_warning_request_context", str2);
        Map A0B = 0Yt.A0B(A07);
        new C67614Mqm(fragmentActivity, (F1F) null, r8, userSession, (C331157Pu) null, new C69227Nhh(), (Boolean) null, AnonymousClass05K.A00, "com.bloks.www.ig.ixt.triggers.bottom_sheet.proactive_warning_flow", "", A0B).A04();
    }

    public C66814Md0(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = r2;
    }
}
