package X;

import android.app.Activity;
import com.google.android.gms.auth.api.credentials.Credential;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Fdj  reason: case insensitive filesystem */
public final class C50523Fdj implements C13675Tek {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final void D5D(Object obj) {
        Activity activity = (Activity) this.A02;
        AnonymousClass63S r8 = (AnonymousClass63S) obj;
        r8.getClass();
        Credential credential = ((C50518Fde) ((C51908G7c) this.A01)).A00;
        AnonymousClass3Qk.A03(credential, "credential must not be null");
        r8.A07(new C8410Qtq(credential, r8)).A07(new C50189FSv(activity, (C49914FEn) this.A00, (C13675Tek) this.A03), TimeUnit.MILLISECONDS, C49914FEn.A05);
    }

    public C50523Fdj(Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = obj3;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
    }
}
