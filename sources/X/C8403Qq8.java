package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbaa;

/* renamed from: X.Qq8  reason: case insensitive filesystem */
public final class C8403Qq8 extends AnonymousClass645 {
    public final Bundle A00;

    public final Bundle A02() {
        return this.A00;
    }

    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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

    public C8403Qq8(Context context, Looper looper, Sx1 sx1, AnonymousClass63z r16, AnonymousClass641 r17, AnonymousClass643 r18) {
        super(context, looper, r16, r17, r18, 219);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(SAn.A00(0, 10, 33), sx1.A00);
        this.A00 = A0a;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        if (queryLocalInterface instanceof zbaa) {
            return queryLocalInterface;
        }
        zba zba = new zba("com.google.android.gms.auth.api.identity.internal.IAuthorizationService", iBinder);
        AnonymousClass0fD.A0A(283120400, AnonymousClass0fD.A03(-1148752177));
        return zba;
    }

    public final Feature[] A0A() {
        return C10137RnE.A08;
    }
}
