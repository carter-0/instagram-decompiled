package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbad;

/* renamed from: X.Qq9  reason: case insensitive filesystem */
public final class C8404Qq9 extends AnonymousClass645 {
    public final Bundle A00 = AnonymousClass7TE.A0a();

    public final Bundle A02() {
        return this.A00;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    public final boolean A08() {
        return true;
    }

    public final boolean A09() {
        return true;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public C8404Qq9(Context context, Looper looper, AnonymousClass63z r11, AnonymousClass641 r12, AnonymousClass643 r13) {
        super(context, looper, r11, r12, r13, 223);
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof zbad) {
            return queryLocalInterface;
        }
        zba zba = new zba("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", iBinder);
        AnonymousClass0fD.A0A(481781316, AnonymousClass0fD.A03(512441702));
        return zba;
    }

    public final Feature[] A0A() {
        return C10137RnE.A08;
    }
}
