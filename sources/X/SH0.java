package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SH0 {
    public static final AtomicBoolean A02 = JTQ.A0k();
    public final C60840jk A00;
    public final C60830jj A01;

    /* JADX WARNING: type inference failed for: r3v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void A00(String str, String str2, String str3) {
        1vn A002;
        0Qc r1;
        0pD r0;
        if (!this.A00.A00.A01.getBoolean("PHONEID_APP_DEVICEID_SYNCED", false) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && A02.compareAndSet(false, true)) {
            0Df A03 = C41845B3m.A03(GraphQlCallInput.A02, str, "family_device_id");
            0Df.A00(A03, str3, PublicKeyCredentialControllerUtility.JSON_KEY_APPID);
            0Df.A00(A03, str2, "app_scoped_id");
            try {
                SnD snD = (SnD) C41847B3o.A17(C11064S8j.class, "create", 0);
                DbW.A18(A03, snD.A00, "input");
                snD.A01 = true;
                PandoGraphQLRequest A003 = snD.build();
                C60830jj r02 = this.A01;
                ? obj = new Object();
                UserSession userSession = r02.A00;
                if (userSession instanceof UserSession) {
                    A002 = 1vm.A01(userSession);
                    0qQ.A0A(A003);
                    r1 = new 0Qc(obj, 0);
                    r0 = new 0pD(obj, 0);
                } else {
                    0qQ.A0C(userSession, AnonymousClass000.A00(36));
                    A002 = 1vm.A00((AnonymousClass0aP) userSession);
                    0qQ.A0A(A003);
                    r1 = new 0Qc(obj, 1);
                    r0 = new 0pD(obj, 1);
                }
                A002.ATL(r0, r1, A003);
                C255183ti.A04(new T0J(this, 3), obj, 1Lf.A01);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C41845B3m.A0j(e);
            }
        }
    }

    public SH0(C60830jj r1, C60840jk r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
