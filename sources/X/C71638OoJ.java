package X;

import com.facebook.msys.mca.MailboxCallback;
import com.instagram.common.session.UserSession;

/* renamed from: X.OoJ  reason: case insensitive filesystem */
public final class C71638OoJ implements MailboxCallback {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ boolean A01;

    public C71638OoJ(boolean z, UserSession userSession) {
        this.A01 = z;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.A01 && bool.booleanValue()) {
            C296405q0.A00.A00(this.A00);
        }
    }
}
