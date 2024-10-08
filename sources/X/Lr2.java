package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class Lr2 implements C66487MTq {
    public final int A00;
    public final Object A01;

    public Lr2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure() {
        Runnable m4f;
        int i = this.A00;
        FragmentActivity A0E = DbT.A0E(this.A01);
        if (i != 0) {
            m4f = new M4H(A0E);
        } else {
            m4f = new M4F(A0E);
        }
        A0E.runOnUiThread(m4f);
    }

    public final void onSuccess() {
        FragmentActivity requireActivity;
        Runnable m4f;
        if (this.A00 != 0) {
            C262224Cq r0 = LNv.A02;
            C61380K4y k4y = (C61380K4y) this.A01;
            UserSession userSession = k4y.A01;
            if (userSession != null) {
                new LNv(userSession).A00("igd_nudity_detection_model_loading_nux");
                k4y.requireActivity().runOnUiThread(new M4I(k4y));
                requireActivity = k4y.requireActivity();
                m4f = new M4H(requireActivity);
            } else {
                0qQ.A0F("session");
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            C61379K4x k4x = (C61379K4x) this.A01;
            k4x.requireActivity().runOnUiThread(new M4G(k4x));
            C70888OQg.A00(1, "DEFAULT_ON_NUX");
            requireActivity = k4x.requireActivity();
            m4f = new M4F(requireActivity);
        }
        requireActivity.runOnUiThread(m4f);
    }
}
