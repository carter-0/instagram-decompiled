package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.session.UserSession;

/* renamed from: X.U1u  reason: case insensitive filesystem */
public final class C14695U1u extends Handler {
    public final Activity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final String A03 = "openSystemSettingDialog";
    public final String A04 = "InstagramDevicePermissionLocationCoreAPI";

    public final void handleMessage(Message message) {
        Activity activity;
        Runnable wkC;
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i != 1) {
            if (i == 2 && C16715V2y.A01 != null) {
                wkC = C20363Wq2.A00;
            } else {
                return;
            }
        } else if (C16715V2y.A01 == null && (activity = this.A00) != null) {
            UserSession userSession = this.A02;
            0qQ.A0B(userSession, 0);
            C13673Tei tei = C16715V2y.A02;
            0qQ.A0A(tei);
            C16715V2y.A01 = ((C63905LBm) userSession.A01(KSB.class, new C73662Phb(userSession, 41))).createGooglePlayLocationSettingsController(activity, userSession, tei, this.A04, this.A03);
            if (C16715V2y.A01 != null) {
                wkC = new C20052WkC(this);
            } else {
                return;
            }
        } else {
            return;
        }
        post(wkC);
    }

    public C14695U1u(Activity activity, Looper looper, AnonymousClass4DH r5, UserSession userSession) {
        super(looper);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r5;
    }
}
