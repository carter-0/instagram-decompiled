package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class W6B implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public W6B(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean handleMessage(Message message) {
        String str;
        switch (this.A00) {
            case 0:
                C22007Xqi xqi = (C22007Xqi) this.A01;
                Iterator it = xqi.A04.iterator();
                while (it.hasNext()) {
                    C21482XcZ xcZ = (C21482XcZ) it.next();
                    C20871X1x x1x = xqi.A03;
                    if (xcZ.A01) {
                        C21495Xct A002 = xcZ.A00.A00();
                        xcZ.A00 = new C21479XcS();
                        xcZ.A01 = false;
                        x1x.CNx(A002, xcZ.A02);
                    }
                    if (((C22061Xun) xqi.A02).A00.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                W2z w2z = (W2z) this.A01;
                W2z.A04(w2z);
                Object obj = message.obj;
                obj.getClass();
                C20365Wq5 wq5 = (C20365Wq5) obj;
                int i = message.what;
                Object obj2 = w2z.A04.get();
                obj2.getClass();
                PackageManager packageManager = w2z.A01;
                SharedPreferences sharedPreferences = w2z.A00;
                sharedPreferences.getClass();
                wq5.A00 = W2z.A03((Context) obj2, sharedPreferences, packageManager, i);
                w2z.A02.post(wq5);
                return true;
            case 2:
                if (message.what == 1) {
                    AnonymousClass9S5 r2 = (AnonymousClass9S5) this.A01;
                    if (r2.A0B) {
                        List list = r2.A0A;
                        int i2 = message.arg1;
                        if (list == null || i2 >= list.size()) {
                            return true;
                        }
                        Object obj3 = list.get(i2);
                        list.get(0);
                        list.get(DbT.A02(list, 1));
                        List list2 = r2.A06.A00;
                        int size = list2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            if (AnonymousClass8GT.A00((AnonymousClass8GT) list2.get(i3), AnonymousClass000.A00(3693)) != null) {
                                0mp.A06(AnonymousClass000.A00(3694), C51968G9o.A1Z(obj3, i2));
                            }
                        }
                        return true;
                    }
                }
                if (message.what != 2) {
                    return false;
                }
                Throwable th = (Throwable) message.obj;
                List list3 = ((AnonymousClass9S5) this.A01).A06.A00;
                int size2 = list3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    list3.get(i4);
                    if (th != null) {
                        str = th.getLocalizedMessage();
                    } else {
                        str = "";
                    }
                    0KC.A0C("CameraZoomController", 0mp.A06("onZoomError(): %s", new Object[]{str}));
                }
                return true;
            case 3:
                if (message.what != 0) {
                    return false;
                }
                C18800W2n w2n = (C18800W2n) this.A01;
                VV6 vv6 = (VV6) message.obj;
                synchronized (w2n.A03) {
                    if (w2n.A00 == vv6 || w2n.A01 == vv6) {
                        C18800W2n.A04(vv6, w2n, 2);
                    }
                }
                return true;
            default:
                0qQ.A0B(message, 0);
                int i5 = message.what;
                if (i5 == 5) {
                    AnonymousClass7TH.A0R(((C61868KPh) this.A01).A03);
                    return true;
                } else if (i5 != 6) {
                    return false;
                } else {
                    View view = ((C61868KPh) this.A01).A03;
                    if (view == null) {
                        return true;
                    }
                    view.setVisibility(0);
                    return true;
                }
        }
    }
}
