package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.48N  reason: invalid class name */
public abstract class AnonymousClass48N {
    public static final long A00;

    public static User A04(UserSession userSession, C254703su r4, 2Et r5) {
        User CCf;
        if (r4 != null) {
            String str = r4.A1u;
            if (r5 != null && (CCf = r5.CCf(str)) != null) {
                return CCf;
            }
            if (userSession.A06.equals(str)) {
                return 0eE.A00(userSession).A00();
            }
            17i A002 = 17h.A00(userSession);
            if (A002 != null) {
                return A002.A02(str);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = (r0 = (r0 = r3.Aue(r4)).A02).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0A(X.2Eq r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L_0x001a
            X.3SZ r0 = r3.Aue(r4)
            if (r0 == 0) goto L_0x001a
            X.3Sc r0 = r0.A02
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x001a
            java.util.Comparator r0 = X.AnonymousClass48V.A01
            int r0 = r0.compare(r1, r5)
            if (r0 < 0) goto L_0x001a
            r2 = 1
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48N.A0A(X.2Eq, java.lang.String, java.lang.String):boolean");
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A00 = timeUnit.toMillis(30);
        timeUnit.toMillis(60);
    }

    public static C254703su A01(2Eu r4) {
        C254703su BKv;
        if (1AW.A06(0Tu.A06, 18299919345388039L)) {
            BKv = r4.BKw();
        } else {
            BKv = r4.BKv();
        }
        C254703su BXx = r4.BXx();
        C254703su BLF = r4.BLF();
        if (BKv == null || !BKv.A1P()) {
            if (BXx != null) {
                return BXx;
            }
            if (r4.CKu()) {
                if (BLF != null) {
                    return BLF;
                }
                0wb.A03("DirectThreadUtil", "last permanent message is null");
                return BKv;
            }
        }
        return BKv;
    }

    public static AnonymousClass3SZ A02(UserSession userSession, AnonymousClass2Ep r5, boolean z) {
        String str = userSession.A06;
        if (z) {
            return r5.Aue(str);
        }
        if (r5.CUG()) {
            return null;
        }
        for (Map.Entry entry : r5.CCo().entrySet()) {
            if (!str.equals(entry.getKey())) {
                return (AnonymousClass3SZ) entry.getValue();
            }
        }
        return null;
    }

    public static User A05(AnonymousClass2Ep r2) {
        if (r2 == null || r2.CUG() || r2.BRZ().size() != 1) {
            return null;
        }
        return (User) r2.BRZ().get(0);
    }

    public static Long A06(AnonymousClass2Ep r2) {
        C272964li Axk;
        Integer num;
        if (r2 == null || !r2.Axj() || (Axk = r2.Axk()) == null || (num = Axk.A02) == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.SECONDS.toMillis(num.longValue()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return X.002.A0b(r5, " +", r1 - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return X.AnonymousClass50n.A02(r3, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        if (r7 == false) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r7 != false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r6.size() <= 1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r5 = ((X.AnonymousClass17C) r6.get(0)).getUsername();
        r1 = r6.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r1 == 1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A08(android.content.Context r3, com.instagram.common.session.UserSession r4, java.lang.String r5, java.util.List r6, boolean r7) {
        /*
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x000f
            if (r7 != 0) goto L_0x0011
        L_0x000e:
            return r5
        L_0x000f:
            if (r7 == 0) goto L_0x0031
        L_0x0011:
            int r0 = r6.size()
            r2 = 1
            if (r0 <= r2) goto L_0x0031
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            X.17C r0 = (X.AnonymousClass17C) r0
            java.lang.String r5 = r0.getUsername()
            int r1 = r6.size()
            if (r1 == r2) goto L_0x000e
            java.lang.String r0 = " +"
            int r1 = r1 - r2
            java.lang.String r5 = X.002.A0b(r5, r0, r1)
            return r5
        L_0x0031:
            java.lang.String r5 = X.AnonymousClass50n.A02(r3, r1, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48N.A08(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.util.List, boolean):java.lang.String");
    }

    public static String A09(2Eq r2) {
        if (r2 == null || r2.CUG() || r2.BRV().size() != 1) {
            return null;
        }
        return (String) r2.BRV().get(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass34S A00(com.instagram.common.session.UserSession r6, X.AnonymousClass2Ep r7) {
        /*
            X.4jH r0 = r7.C6F()
            r4 = 0
            if (r0 == 0) goto L_0x0028
            r7.C6F()
            X.4jH r0 = r7.C6F()
            com.instagram.model.mediasize.ImageInfoImpl r0 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A04(r0, r1)
            if (r0 == 0) goto L_0x0028
            X.4jH r0 = r7.C6F()
            com.instagram.model.mediasize.ImageInfoImpl r0 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A04(r0, r1)
        L_0x0022:
            X.34S r0 = new X.34S
            r0.<init>(r1, r4)
            return r0
        L_0x0028:
            int r0 = r7.C6a()
            boolean r0 = X.AnonymousClass48O.A02(r0)
            if (r0 == 0) goto L_0x0041
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r7.Asg()
            if (r0 == 0) goto L_0x0041
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r7.Asg()
            com.instagram.common.typedurl.ImageUrl r1 = r0.A00
        L_0x003e:
            if (r1 == 0) goto L_0x008d
            goto L_0x0022
        L_0x0041:
            int r1 = r7.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x0055
            r0 = r7
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x0055
            com.instagram.common.typedurl.ImageUrl r1 = r0.A04
            goto L_0x003e
        L_0x0055:
            int r0 = r7.C6a()
            boolean r0 = X.AnonymousClass48O.A01(r0)
            if (r0 == 0) goto L_0x008d
            X.3su r0 = r7.BKv()
            if (r0 == 0) goto L_0x008b
            com.instagram.user.model.User r5 = A04(r6, r0, r7)
        L_0x0069:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r3 = r0.A01(r6)
            java.util.List r2 = r7.BRZ()
            java.lang.String r1 = r7.AsX()
            r1.getClass()
            if (r5 == 0) goto L_0x0089
            java.lang.String r0 = r5.getId()
            com.instagram.common.typedurl.ImageUrl r4 = r5.Bh3()
        L_0x0084:
            X.34S r0 = X.AnonymousClass3UE.A00(r4, r3, r1, r0, r2)
            return r0
        L_0x0089:
            r0 = r4
            goto L_0x0084
        L_0x008b:
            r5 = r4
            goto L_0x0069
        L_0x008d:
            X.3su r0 = r7.BKv()
            if (r0 == 0) goto L_0x00c4
            com.instagram.user.model.User r3 = A04(r6, r0, r7)
        L_0x0097:
            java.util.List r2 = r7.BRZ()
            if (r3 == 0) goto L_0x00aa
            boolean r0 = r3.A1X()
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L_0x00aa
            r3 = r4
        L_0x00aa:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r6)
            if (r3 == 0) goto L_0x00c2
            java.lang.String r0 = r3.getId()
            com.instagram.common.typedurl.ImageUrl r4 = r3.Bh3()
        L_0x00ba:
            r7.CUG()
            X.34S r0 = X.AnonymousClass3UE.A02(r4, r1, r0, r2)
            return r0
        L_0x00c2:
            r0 = r4
            goto L_0x00ba
        L_0x00c4:
            r3 = r4
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48N.A00(com.instagram.common.session.UserSession, X.2Ep):X.34S");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    public static DirectThreadKey A03(AnonymousClass2Es r4) {
        String C6C = r4.C6C();
        String C6k = r4.C6k();
        ArrayList A002 = DirectThreadKey.A00(AnonymousClass48M.A01(r4.BRZ()));
        ? obj = new Object();
        obj.A00 = C6C;
        obj.A02 = A002;
        Collections.sort(A002);
        obj.A01 = C6k;
        return obj;
    }

    public static String A07(Context context, UserSession userSession, AnonymousClass2Es r6) {
        String C6f = r6.C6f();
        List BRZ = r6.BRZ();
        User A01 = AnonymousClass0t1.A01.A01(userSession);
        if (TextUtils.isEmpty(C6f)) {
            return AnonymousClass50n.A02(context, A01, BRZ);
        }
        return C6f;
    }

    public static boolean A0B(2Eq r6, String str, String str2, String str3) {
        if (str3.equals(str)) {
            return true;
        }
        AnonymousClass3SZ Aue = r6.Aue(str);
        if (str2 == null || Aue == null || ((Aue.A02.length() == 38 && 1AW.A06(0Tu.A05, 18312344686049232L)) || AnonymousClass48V.A01.compare(Aue.A02, str2) < 0)) {
            return false;
        }
        return true;
    }

    public static boolean A0C(AnonymousClass2Ep r2) {
        if ((!r2.CUG() || r2.C6F() != null || r2.C6a() == 29 || AnonymousClass48O.A02(r2.C6a())) && !AnonymousClass48O.A01(r2.C6a())) {
            return false;
        }
        return true;
    }
}
