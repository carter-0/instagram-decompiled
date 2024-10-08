package X;

import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WTq  reason: case insensitive filesystem */
public final class C19308WTq implements AnonymousClass0qK {
    public final /* synthetic */ VXQ A00;

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String str;
        Integer num;
        String str2 = null;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
        }
        VXQ vxq = this.A00;
        Integer num2 = vxq.A00;
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
        vxq.A00 = num;
        if (num2 != num) {
            List list = vxq.A02;
            0qQ.A06(list);
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onNetworkChange");
            }
        }
    }

    public C19308WTq(VXQ vxq) {
        this.A00 = vxq;
    }
}
