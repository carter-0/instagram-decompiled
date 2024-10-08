package X;

import android.net.NetworkInfo;
import java.util.List;

/* renamed from: X.WTs  reason: case insensitive filesystem */
public final class C19310WTs implements AnonymousClass0qK {
    public final /* synthetic */ C17843Vgw A00;

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String str;
        Integer num;
        String str2 = null;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
        }
        C17843Vgw vgw = this.A00;
        Integer num2 = vgw.A00;
        if (networkInfo != null) {
            str = networkInfo.getTypeName();
        } else {
            str = null;
        }
        if (0qQ.A0K(str, "WIFI")) {
            num = AnonymousClass05K.A00;
        } else if (0qQ.A0K(str, "MOBILE")) {
            if (networkInfo != null) {
                str2 = networkInfo.getSubtypeName();
            }
            if (0qQ.A0K(str2, "NRNSA")) {
                num = AnonymousClass05K.A01;
            } else if (0qQ.A0K(str2, "LTE")) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A0N;
            }
        } else {
            num = AnonymousClass05K.A0Y;
        }
        vgw.A00 = num;
        if (num2 != num) {
            List<C63907LBp> list = vgw.A02;
            0qQ.A06(list);
            for (C63907LBp A002 : list) {
                A002.A00(vgw.A00);
            }
        }
    }

    public C19310WTs(C17843Vgw vgw) {
        this.A00 = vgw;
    }
}
