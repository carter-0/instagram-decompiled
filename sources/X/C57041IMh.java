package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IMh  reason: case insensitive filesystem */
public final class C57041IMh implements C59547JNt {
    public final /* synthetic */ C56911IHg A00;

    public C57041IMh(C56911IHg iHg) {
        this.A00 = iHg;
    }

    public final void Djf(boolean z) {
        C56911IHg iHg = this.A00;
        FragmentActivity activity = iHg.A04.getActivity();
        if (activity != null) {
            UserSession userSession = iHg.A0A;
            AnonymousClass4DU r9 = iHg.A0F;
            C249763kK r4 = iHg.A0L;
            String sessionId = r4.getSessionId();
            if (sessionId == null) {
                0wj r3 = 0wj.A01;
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("Null session ID from provider ");
                A1A.append(r4);
                A1A.append(" in module ");
                r3.AEf(AnonymousClass7TF.A0l(r9.getModuleName(), A1A), 817890849);
                sessionId = "";
            }
            LTW.A00.A0A(activity, userSession, iHg.A0E, r9, iHg.A0G, sessionId, (String) null, z);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
