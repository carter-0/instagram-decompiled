package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.service.zai;
import com.google.android.gms.internal.base.zaa;

/* renamed from: X.Qq4  reason: case insensitive filesystem */
public final class C8399Qq4 extends AnonymousClass645 {
    public final Sx3 A00;

    public final String A05() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String A06() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean A08() {
        return true;
    }

    public final int getMinApkVersion() {
        return 203400000;
    }

    public C8399Qq4(Context context, Looper looper, AnonymousClass63z r10, AnonymousClass641 r11, AnonymousClass643 r12, Sx3 sx3) {
        super(context, looper, r10, r11, r12, 270);
        this.A00 = sx3;
    }

    public final Bundle A02() {
        Sx3 sx3 = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        String str = sx3.A00;
        if (str != null) {
            A0a.putString("api", str);
        }
        return A0a;
    }

    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof zai) {
            return queryLocalInterface;
        }
        zaa zaa = new zaa("com.google.android.gms.common.internal.service.IClientTelemetryService", iBinder);
        AnonymousClass0fD.A0A(-459638206, AnonymousClass0fD.A03(-1403828755));
        return zaa;
    }

    public final Feature[] A0A() {
        return C10083RmL.A01;
    }
}
