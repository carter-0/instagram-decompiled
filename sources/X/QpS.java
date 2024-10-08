package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class QpS extends AnonymousClass63E {
    public static final AnonymousClass63I A01;
    public static final AnonymousClass63G A02;
    public static final AnonymousClass63K A03;
    public final String A00 = C11139SBu.A00();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.63G, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.63I] */
    static {
        ? obj = new Object();
        A02 = obj;
        ? obj2 = new Object();
        A01 = obj2;
        A03 = new AnonymousClass63K(obj2, obj, "Auth.Api.Identity.SignIn.API");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QpS(android.app.Activity r8, X.Sx0 r9) {
        /*
            r7 = this;
            X.63K r5 = A03
            X.63N r6 = X.AnonymousClass63N.A02
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r0 = X.C11139SBu.A00()
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QpS.<init>(android.app.Activity, X.Sx0):void");
    }

    public final SignInCredential A00(Intent intent) {
        SafeParcelable A002;
        SafeParcelable A003;
        if (intent != null) {
            Parcelable.Creator creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            if (byteArrayExtra == null) {
                A002 = null;
            } else {
                A002 = SafeParcelableSerializer.A00(creator, byteArrayExtra);
            }
            Status status = (Status) A002;
            if (status == null) {
                throw new RKT(Status.A04);
            } else if (status.A00 <= 0) {
                Parcelable.Creator creator2 = SignInCredential.CREATOR;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                if (byteArrayExtra2 == null) {
                    A003 = null;
                } else {
                    A003 = SafeParcelableSerializer.A00(creator2, byteArrayExtra2);
                }
                SignInCredential signInCredential = (SignInCredential) A003;
                if (signInCredential != null) {
                    return signInCredential;
                }
                throw new RKT(Status.A06);
            } else {
                throw new RKT(status);
            }
        } else {
            throw new RKT(Status.A06);
        }
    }

    public QpS(Context context, Sx0 sx0) {
        super(context, (AnonymousClass63L) sx0, A03, AnonymousClass63N.A02);
    }
}
