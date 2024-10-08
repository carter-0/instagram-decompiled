package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.FGk  reason: case insensitive filesystem */
public final class C49955FGk {
    public static final C49955FGk A00 = new Object();

    public static final void A01(Context context, UserSession userSession, long j) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Context context2 = context;
        if (C324536zU.A00(userSession)) {
            FFO.A02(context, userSession, "account_center");
            return;
        }
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.FULL_SHEET;
        C46471DfZ A03 = fFt.A03();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BitSet A0w = DbS.A0w(0);
        A1H.put("entrypoint", "app_settings");
        A1H.put("caller_name", (Object) null);
        if (A0w.nextClearBit(0) >= 0) {
            LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
            Iterator A0s = AnonymousClass7TF.A0s(A1H);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                if (FRB.A00.contains(A1J.getKey())) {
                    A1H2.put(A1J.getKey(), A1J.getValue());
                }
            }
            C11844ShW shW = new C11844ShW("com.bloks.www.fxcal.settings.FXAccountsCenterHomeScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), A1H2, 857801770, j, true);
            C307506Qj A002 = C48721Ej6.A00(userSession2, false);
            AnonymousClass7TF.A1B(A002, 1, A03);
            shW.E0s(context2, A03, A002);
            return;
        }
        throw DbT.A0n();
    }

    public static final void A02(AnonymousClass4DH r1, UserSession userSession, String str, String str2) {
        0qQ.A0B(userSession, 1);
        A03(r1, userSession, str, str2, true);
    }

    public static final void A03(AnonymousClass4DH r6, UserSession userSession, String str, String str2, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 1);
        if (C324536zU.A00(userSession)) {
            FFO.A02(r6.requireContext(), userSession, "account_center");
        } else {
            r6.scheduleAndGetLoaderId(A00.A00(DbT.A0M(r6, userSession), userSession2, str, str2, z));
        }
    }

    public static final void A04(UserSession userSession, long j) {
        0qQ.A0B(userSession, 0);
        if (!C324536zU.A00(userSession)) {
            C49940FFt fFt = new C49940FFt();
            fFt.A03 = C46626Di6.FULL_SHEET;
            C46471DfZ A03 = fFt.A03();
            boolean A06 = 182.A06(0Tu.A05, userSession, 36321434617128316L);
            LinkedHashMap A1H = AnonymousClass7TE.A1H();
            BitSet A0w = DbS.A0w(0);
            A1H.put("entrypoint", "app_settings");
            A1H.put("caller_name", (Object) null);
            if (A0w.nextClearBit(0) >= 0) {
                C11844ShW shW = new C11844ShW("com.bloks.www.fxcal.settings.FXAccountsCenterHomeScreenQuery", (String) null, (String) null, 0Yt.A0B(A1H), 0Yt.A0E(), 719983200, j, true);
                C307506Qj A002 = C48721Ej6.A00(userSession, false);
                AnonymousClass7TF.A1B(A03, 0, A002);
                shW.E3a(A03, A002, (JPG) null, A06);
                return;
            }
            throw DbT.A0n();
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.base.activity.IgFragmentActivity r9, X.AnonymousClass0iw r10, com.instagram.common.session.UserSession r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r5 = r11
            boolean r1 = X.DbW.A1Y(r11)
            boolean r0 = X.C324536zU.A00(r11)
            if (r0 == 0) goto L_0x0025
            r1 = 0
            java.lang.String r0 = "account_center"
            X.3GP r0 = X.FFO.A00(r9, r11, r0, r1)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Frj r2 = new X.Frj
            r2.<init>(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            return r4
        L_0x0025:
            X.FGk r3 = A00
            X.2nI r4 = X.DbT.A0N(r9, r10, r11)
            r6 = r12
            r7 = r13
            r8 = r14
            X.8ey r0 = r3.A00(r4, r5, r6, r7, r8)
            r9.schedule(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49955FGk.A05(com.instagram.base.activity.IgFragmentActivity, X.0iw, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean):boolean");
    }

    private final C360678ey A00(C229382nI r5, UserSession userSession, String str, String str2, boolean z) {
        Long A10;
        C269474fB r3 = C269474fB.A00;
        C268194cw r2 = new C268194cw(r3);
        if (z) {
            r2.A0C("platform", 1);
            String fbidV2 = DbX.A0m(userSession).getFbidV2();
            if (fbidV2 == null || (A10 = AnonymousClass7TE.A10(fbidV2)) == null) {
                throw AnonymousClass7TE.A0y();
            }
            r2.A0E("identity_id", A10.toString());
        }
        C268194cw r1 = new C268194cw(r3);
        r1.A0E("entrypoint", str);
        r1.A0E("node_identifier", str2);
        r1.A0B(r2, "deeplink_params");
        C360678ey A05 = C359988do.A05(userSession, AnonymousClass000.A00(138), new C20581Wuz(DbX.A0L(r1, r3), 2));
        E84.A00(A05, r5, 15);
        return A05;
    }
}
