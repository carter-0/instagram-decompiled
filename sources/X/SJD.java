package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class SJD {
    public final Activity A00;
    public final Context A01;
    public final ViewGroup A02;
    public final RBD A03 = new RBD(this, 1);
    public final C70777OKx A04;
    public final C13760TgW A05;
    public final UserSession A06;

    public SJD(Activity activity, ViewGroup viewGroup, UserSession userSession, C70777OKx oKx, C13760TgW tgW) {
        DbW.A1N(viewGroup, 3, oKx);
        this.A06 = userSession;
        this.A00 = activity;
        this.A02 = viewGroup;
        this.A05 = tgW;
        this.A04 = oKx;
        Context context = viewGroup.getContext();
        this.A01 = context;
        2Yu.A0K(context);
    }

    public static final void A00(SJD sjd, List list, boolean z) {
        C10640RvZ rvZ = new C10640RvZ(sjd, list, z);
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0r.add(((C13791Th6) it.next()).Bbi());
        }
        String[] strArr = (String[]) A0r.toArray(new String[0]);
        C70777OKx oKx = sjd.A04;
        UserSession userSession = sjd.A06;
        0qQ.A0B(strArr, 1);
        Activity activity = oKx.A01;
        int length = strArr.length;
        if (1DL.A08(activity, (String[]) Arrays.copyOf(strArr, length))) {
            rvZ.A00.A05.DWp();
        } else {
            1DL.A04(activity, new T7I(6, rvZ, userSession, strArr, oKx), (String[]) Arrays.copyOf(strArr, length));
        }
    }

    public final boolean A03() {
        if (Build.VERSION.SDK_INT < 33) {
            if (1DL.A07(this.A04.A01, AnonymousClass000.A00(10))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void A01() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        String A002 = AnonymousClass000.A00(1089);
        if (!1DL.A07(this.A04.A01, A002)) {
            A1C.add(new QPn(A002, 2131966510, 2131966513, 2131966512, 2131966511, true));
        }
        A00(this, 00k.A0a(A1C), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        if (X.182.A06(X.0Tu.A05, r12.A06, 36323667999599991L) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = "android.permission.CAMERA"
            X.OKx r1 = r12.A04
            android.app.Activity r3 = r1.A01
            boolean r1 = X.1DL.A07(r3, r6)
            if (r1 != 0) goto L_0x0037
            if (r13 == 0) goto L_0x0022
            com.instagram.common.session.UserSession r5 = r12.A06
            X.0Tu r4 = X.0Tu.A05
            r1 = 36323667999599991(0x810c2f000e2d77, double:3.034572134393574E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            r11 = 0
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r11 = 1
        L_0x0023:
            r7 = 2131954557(0x7f130b7d, float:1.9545617E38)
            r8 = 2131954560(0x7f130b80, float:1.9545623E38)
            r9 = 2131954559(0x7f130b7f, float:1.954562E38)
            r10 = 2131954558(0x7f130b7e, float:1.9545619E38)
            X.QPn r5 = new X.QPn
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r5)
        L_0x0037:
            r1 = 1089(0x441, float:1.526E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            boolean r1 = X.1DL.A07(r3, r2)
            if (r1 != 0) goto L_0x0058
            r3 = 2131966510(0x7f133a2e, float:1.956986E38)
            r4 = 2131966513(0x7f133a31, float:1.9569866E38)
            r5 = 2131966512(0x7f133a30, float:1.9569864E38)
            r6 = 2131966511(0x7f133a2f, float:1.9569862E38)
            r7 = 1
            X.QPn r1 = new X.QPn
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.add(r1)
        L_0x0058:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0064
            X.TgW r0 = r12.A05
            r0.DWp()
            return
        L_0x0064:
            java.util.List r1 = X.00k.A0a(r0)
            r0 = 0
            A00(r12, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SJD.A02(boolean):void");
    }
}
