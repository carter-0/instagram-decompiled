package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity;

/* renamed from: X.Pbs  reason: case insensitive filesystem */
public final class C73395Pbs implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass65E A02;
    public final /* synthetic */ C72203OyT A03;
    public final /* synthetic */ EncrypteddBackupsUrlHandlerActivity A04;

    public C73395Pbs(Bundle bundle, UserSession userSession, AnonymousClass65E r3, C72203OyT oyT, EncrypteddBackupsUrlHandlerActivity encrypteddBackupsUrlHandlerActivity) {
        this.A03 = oyT;
        this.A02 = r3;
        this.A04 = encrypteddBackupsUrlHandlerActivity;
        this.A00 = bundle;
        this.A01 = userSession;
    }

    public final void run() {
        C72203OyT oyT = this.A03;
        AnonymousClass65E r1 = this.A02;
        FragmentActivity fragmentActivity = this.A04;
        C69358Njy A002 = C71073Oas.A00(fragmentActivity, r1, oyT, AnonymousClass05K.A15);
        if (A002 != null) {
            Bundle bundle = this.A00;
            UserSession userSession = this.A01;
            bundle.putString("BUNDLE_SCREEN", A002.A00);
            NJT A012 = C71073Oas.A01(bundle, userSession, A002);
            if (A012 != null) {
                DbV.A1O(DbV.A0M(A012, fragmentActivity, userSession));
                return;
            }
            return;
        }
        fragmentActivity.finish();
    }
}
