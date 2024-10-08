package X;

import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vzv  reason: case insensitive filesystem */
public final class C18760Vzv {
    public C20885X2p A00;
    public C18078Vl7 A01;
    public C17806VgJ A02;
    public X5A A03;
    public X80 A04;
    public C62320sa A05;
    public 0sP A06;
    public 0sL A07;
    public boolean A08;
    public final Context A09;
    public final C17917Vi8 A0A;
    public final C18777W1b A0B;
    public final UserSession A0C;
    public final 1Av A0D;
    public final AnonymousClass0eM A0E = C20695WxR.A00(this, 0eO.A02, 34);

    public static final W0T A00(C18760Vzv vzv) {
        C357488Yc A012 = C357488Yc.A03.A01(vzv.A0C);
        if (A012 != null) {
            return A012.A00();
        }
        return null;
    }

    public final boolean A02() {
        StringBuilder sb;
        C363068j2 r6 = C363058j1.A02;
        r6.A01("sup:MediaStreamControllerDelegate", "Checking bluetooth permissions...");
        String[] A002 = C17132VJh.A00.A00();
        int length = A002.length;
        if (length == 0) {
            sb = new StringBuilder();
            sb.append("Android API ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append(AnonymousClass000.A00(833));
        } else {
            int i = 0;
            do {
                String str = A002[i];
                Context context = this.A09;
                if (!1DL.A07(context, str)) {
                    sb = new StringBuilder();
                    sb.append("Permissions not granted for: ");
                    ArrayList arrayList = new ArrayList();
                    int i2 = 0;
                    do {
                        String str2 = A002[i2];
                        if (!1DL.A07(context, str2)) {
                            arrayList.add(str2);
                        }
                        i2++;
                    } while (i2 < length);
                    sb.append(arrayList);
                } else {
                    i++;
                }
            } while (i < length);
            return true;
        }
        r6.A04("sup:MediaStreamControllerDelegate", sb.toString(), (Throwable) null);
        return false;
    }

    public C18760Vzv(Context context, C17917Vi8 vi8, C18777W1b w1b, UserSession userSession, 1Av r7) {
        this.A0B = w1b;
        this.A09 = context;
        this.A0C = userSession;
        this.A0A = vi8;
        this.A0D = r7;
    }

    public static final boolean A01(C18760Vzv vzv) {
        V4Y v4y;
        W0T A002 = A00(vzv);
        if (!(A002 == null || (v4y = (V4Y) A002.A02.getValue()) == null || !(v4y instanceof K0R))) {
            K0R k0r = (K0R) v4y;
            if (k0r.A01 || ((VR1) k0r.A00.A01).A01 != AnonymousClass05K.A0C) {
                return false;
            }
            return true;
        }
        return false;
    }
}
