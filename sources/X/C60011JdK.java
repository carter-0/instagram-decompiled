package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdK  reason: case insensitive filesystem */
public final class C60011JdK extends Handler {
    public final /* synthetic */ K5H A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60011JdK(Looper looper, K5H k5h) {
        super(looper);
        this.A00 = k5h;
    }

    public final void handleMessage(Message message) {
        FragmentActivity activity;
        Handler handler;
        Runnable m3q;
        int i = message.what;
        if (i == 1) {
            K5H k5h = this.A00;
            if (k5h.A0n == null && (activity = k5h.getActivity()) != null) {
                UserSession userSession = k5h.A0B;
                0qQ.A0B(userSession, 0);
                k5h.A0n = ((C63905LBm) userSession.A01(KSB.class, new C73662Phb(userSession, 41))).createGooglePlayLocationSettingsController(activity, k5h.A0B, k5h.A0d, "nearby_venues", "find_nearby_venues");
                if (k5h.A0n != null) {
                    handler = k5h.A0c;
                    m3q = new M3Q(this);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 2) {
            K5H k5h2 = this.A00;
            if (k5h2.A0n != null) {
                handler = k5h2.A0c;
                m3q = new M3R(this);
            } else {
                return;
            }
        } else {
            return;
        }
        handler.post(m3q);
    }
}
