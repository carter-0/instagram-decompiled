package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.8px  reason: invalid class name and case insensitive filesystem */
public final class C366958px implements C367608rH {
    public final /* synthetic */ C355048Oj A00;

    public C366958px(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void onClick() {
        AnonymousClass8BA r1 = this.A00.A0q.A00;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r1.A1D.A03.A02;
        FragmentActivity requireActivity = r1.A0s.requireActivity();
        UserSession userSession = r1.A0v;
        String moduleName = r1.A0u.getModuleName();
        C250563lf.A0P(requireActivity, AnonymousClass9OT.STORY, mediaGenAIDetectionMethod, userSession, r1.A0R, moduleName, (String) null);
    }
}
