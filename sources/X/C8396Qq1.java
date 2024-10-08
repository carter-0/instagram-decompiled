package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;

/* renamed from: X.Qq1  reason: case insensitive filesystem */
public final class C8396Qq1 extends AnonymousClass645 {
    public final Context A00;

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return !(queryLocalInterface instanceof zzi) ? new zzj(iBinder) : queryLocalInterface;
    }

    public final String A05() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    public final String A06() {
        return "com.google.android.gms.safetynet.service.START";
    }

    public final int getMinApkVersion() {
        return 12200000;
    }

    public C8396Qq1(Context context, Looper looper, AnonymousClass63y r10, AnonymousClass640 r11, AnonymousClass643 r12) {
        super(context, looper, r10, r11, r12, 45);
        this.A00 = context;
    }
}
