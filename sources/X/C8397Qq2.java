package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbt;

/* renamed from: X.Qq2  reason: case insensitive filesystem */
public final class C8397Qq2 extends AnonymousClass645 {
    public final Sx4 A00;

    public final String A05() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public C8397Qq2(Context context, Looper looper, Sx4 sx4, AnonymousClass63y r14, AnonymousClass640 r15, AnonymousClass643 r16) {
        super(context, looper, r14, r15, r16, 68);
        this.A00 = new Sx4(C11139SBu.A00(), Boolean.valueOf((sx4 == null ? Sx4.A02 : sx4).A01));
    }

    public final Bundle A02() {
        Sx4 sx4 = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("consumer_package", (String) null);
        A0a.putBoolean("force_save_dialog", sx4.A01);
        A0a.putString("log_session_id", sx4.A00);
        return A0a;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbt) {
            return queryLocalInterface;
        }
        zba zba = new zba("com.google.android.gms.auth.api.credentials.internal.ICredentialsService", iBinder);
        AnonymousClass0fD.A0A(2115474116, AnonymousClass0fD.A03(-1893778955));
        return zba;
    }
}
