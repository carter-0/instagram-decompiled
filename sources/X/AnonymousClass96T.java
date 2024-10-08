package X;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.96T  reason: invalid class name */
public final class AnonymousClass96T {
    public final C3734195g A00;
    public final AnonymousClass96P A01;
    public final AnonymousClass96U A02;
    public final C3735495z A03;
    public final Executor A04;

    public static final AnonymousClass9GD A00(Bundle bundle, AnonymousClass96T r5, String str, String str2, String str3) {
        String str4;
        Set unmodifiableSet;
        Set unmodifiableSet2;
        String A0T;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, str);
        C3734195g r0 = r5.A00;
        C3734195g.A01(r0);
        bundle.putString("gmp_app_id", r0.A01.A00);
        AnonymousClass96P r2 = r5.A01;
        bundle.putString("gmsv", Integer.toString(r2.A04()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", r2.A05());
        synchronized (r2) {
            if (r2.A00 == null) {
                AnonymousClass96P.A02(r2);
            }
            str4 = r2.A00;
        }
        bundle.putString("app_ver_name", str4);
        bundle.putString("cliv", "fiid-12451000");
        C3735495z r1 = r5.A03;
        Set set = r1.A00.A00;
        synchronized (set) {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        if (unmodifiableSet.isEmpty()) {
            A0T = r1.A01;
        } else {
            String str5 = r1.A01;
            synchronized (set) {
                unmodifiableSet2 = Collections.unmodifiableSet(set);
            }
            A0T = 002.A0T(str5, C3735495z.A00(unmodifiableSet2), ' ');
        }
        bundle.putString("Firebase-Client", A0T);
        C365498nD r22 = new C365498nD();
        r5.A04.execute(new TJ8(bundle, r22, r5));
        return r22.A00;
    }

    public AnonymousClass96T(C3734195g r3, AnonymousClass96P r4, C3735495z r5, Executor executor) {
        C3734195g.A01(r3);
        AnonymousClass96U r0 = new AnonymousClass96U(r3.A00, r4);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r0;
        this.A04 = executor;
        this.A03 = r5;
    }
}
