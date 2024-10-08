package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbh;

/* renamed from: X.Qq5  reason: case insensitive filesystem */
public final class C8400Qq5 extends AnonymousClass645 {
    public final Bundle A00;

    public final Bundle A02() {
        return this.A00;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public C8400Qq5(Context context, Looper looper, Sx2 sx2, AnonymousClass63z r12, AnonymousClass641 r13, AnonymousClass643 r14) {
        super(context, looper, r12, r13, r14, 16);
        Bundle A0J;
        if (sx2 == null) {
            A0J = AnonymousClass7TE.A0a();
        } else {
            A0J = Pxe.A0J(sx2.A00);
        }
        this.A00 = A0J;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return queryLocalInterface;
        }
        zza zza = new zza("com.google.android.gms.auth.api.internal.IAuthService", iBinder);
        AnonymousClass0fD.A0A(-422750648, AnonymousClass0fD.A03(-400505182));
        return zza;
    }

    public final boolean requiresSignIn() {
        AnonymousClass643 r2 = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r2.A04.get(C10123Rmz.A02);
            if (r2.A05.isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
