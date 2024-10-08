package X;

import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.JVv  reason: case insensitive filesystem */
public abstract class C59737JVv {
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.0bY] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[ExcHandler: SecurityException (unused java.lang.SecurityException), SYNTHETIC, Splitter:B:28:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C62948Kp0 A00(android.content.Context r12, com.instagram.common.session.UserSession r13, java.lang.String r14, boolean r15) {
        /*
            r0 = 2
            X.0qQ.A0B(r13, r0)
            if (r14 == 0) goto L_0x00b7
            int r0 = r14.length()
            if (r0 == 0) goto L_0x00b7
            if (r15 == 0) goto L_0x0023
            java.lang.String r1 = X.C364678lo.A07(r14)
            int r0 = r1.length()
            if (r0 > 0) goto L_0x001c
            java.lang.String r1 = X.C364678lo.A06(r14)
        L_0x001c:
            X.0sn r0 = X.0sn.A00
            X.Kp0 r0 = A01(r13, r1, r0)
            return r0
        L_0x0023:
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r2 = X.0cp.A00(r0, r14)
            if (r2 == 0) goto L_0x0049
            X.Q0h r1 = X.C9955RkA.A00
            X.Q0e r0 = new X.Q0e
            r0.<init>(r1)
            X.Q0d r0 = r0.AU7(r2)     // Catch:{ IOException -> 0x003f }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x003f }
            java.lang.String r5 = r0.A0E     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "MediaMetadataUtils"
            java.lang.String r0 = "exception occurred when reading video metadata"
            X.0KC.A0F(r1, r0, r2)
            r5 = 0
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            X.0TC r0 = new X.0TC
            r0.<init>()
            android.net.Uri r0 = X.0cp.A00(r0, r14)
            if (r0 == 0) goto L_0x005f
            java.lang.String r4 = X.C59782JYb.A00(r0)
        L_0x0059:
            java.lang.String r3 = ""
            r2 = r3
            if (r12 == 0) goto L_0x00a6
            goto L_0x0061
        L_0x005f:
            r4 = 0
            goto L_0x0059
        L_0x0061:
            java.lang.String r0 = "external"
            android.net.Uri r7 = android.provider.MediaStore.Video.Media.getContentUri(r0)     // Catch:{  }
            r9 = 0
            if (r7 == 0) goto L_0x00a6
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            java.lang.String[] r10 = X.C59805JYz.A00     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            java.lang.String r8 = "_data=?"
            java.lang.String[] r11 = new java.lang.String[]{r14}     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            r12 = -1427303013(0xffffffffaaed159b, float:-4.211465E-13)
            android.database.Cursor r6 = X.0fM.A01(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            if (r6 == 0) goto L_0x00a6
            int r0 = r6.getCount()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0089
            r6.close()     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            goto L_0x00a6
        L_0x0089:
            r6.moveToFirst()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "description"
            int r0 = r6.getColumnIndex(r0)     // Catch:{ all -> 0x009c }
            if (r0 <= 0) goto L_0x0098
            java.lang.String r9 = r6.getString(r0)     // Catch:{ all -> 0x009c }
        L_0x0098:
            r6.close()     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            goto L_0x00a3
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
            throw r0     // Catch:{ SecurityException -> 0x00a6, SecurityException -> 0x00a6 }
        L_0x00a3:
            if (r9 == 0) goto L_0x00a6
            r3 = r9
        L_0x00a6:
            java.lang.String[] r1 = new java.lang.String[]{r3, r5, r4}
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = X.03t.A0I(r1)
            X.Kp0 r0 = A01(r13, r2, r0)
            return r0
        L_0x00b7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59737JVv.A00(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, boolean):X.Kp0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r10.isEmpty() != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r10.isEmpty() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r10.isEmpty() == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r10.isEmpty() == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r10.isEmpty() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r5 != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r1 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1.hasNext() == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (X.C59788JYh.A00(r8, (java.lang.String) r1.next()) == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0071, code lost:
        return X.C59788JYh.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r5 == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        r3 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r3.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        r2 = (java.lang.String) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r2 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (X.00l.A0d(r2, "greatwhite", true) == true) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        if (X.00l.A0d(r2, "com.facebook.greatwhite", false) != true) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        return X.C62155KbD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        if (r5 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009e, code lost:
        r1 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
        if (r1.hasNext() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b2, code lost:
        if (X.C59790JYj.A00((java.lang.String) r1.next()) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        return X.C59790JYj.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b7, code lost:
        if (r5 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        r7 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if (r7.hasNext() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c5, code lost:
        r6 = (java.lang.String) r7.next();
        r3 = X.C62157KbF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d9, code lost:
        if (X.182.A06(X.0Tu.A05, r8, 36316327899566308L) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00db, code lost:
        if (r6 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e3, code lost:
        if (X.00l.A0d(r6, "mos_version", false) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00eb, code lost:
        if (X.0qQ.A0K(r6, "Merlot") != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        if (X.0qQ.A0K(r6, "com.wearable.facebook.monza") == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f6, code lost:
        if (r5 == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fa, code lost:
        r3 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0102, code lost:
        if (r3.hasNext() == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0104, code lost:
        r2 = (java.lang.String) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010a, code lost:
        if (r2 == null) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0113, code lost:
        if (X.00l.A0d(r2, "com.facebook.horizon", false) != true) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0117, code lost:
        return X.C62156KbE.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C62948Kp0 A01(X.0lg r8, java.lang.String r9, java.util.List<java.lang.String> r10) {
        /*
            r4 = 1
            X.0qQ.A0B(r10, r4)
            if (r9 == 0) goto L_0x0013
            boolean r0 = X.00l.A0W(r9)
            if (r0 != 0) goto L_0x0013
            java.util.List r10 = java.util.Collections.singletonList(r9)
            X.0qQ.A07(r10)
        L_0x0013:
            boolean r5 = r10 instanceof java.util.Collection
            if (r5 == 0) goto L_0x003d
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x003d
        L_0x001d:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0059
        L_0x0023:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0075
        L_0x0029:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x009e
        L_0x002f:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00bb
        L_0x0035:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00fa
        L_0x003b:
            r3 = 0
        L_0x003c:
            return r3
        L_0x003d:
            java.util.Iterator r1 = r10.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            X.JYi r3 = X.C59789JYi.A01
            boolean r0 = r3.A04(r8, r0)
            if (r0 == 0) goto L_0x0041
            return r3
        L_0x0056:
            if (r5 == 0) goto L_0x0059
            goto L_0x001d
        L_0x0059:
            java.util.Iterator r1 = r10.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C59788JYh.A00(r8, r0)
            if (r0 == 0) goto L_0x005d
            X.JYh r3 = X.C59788JYh.A02
            return r3
        L_0x0072:
            if (r5 == 0) goto L_0x0075
            goto L_0x0023
        L_0x0075:
            java.util.Iterator r3 = r10.iterator()
        L_0x0079:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0079
            java.lang.String r0 = "greatwhite"
            boolean r0 = X.00l.A0d(r2, r0, r4)
            if (r0 == r4) goto L_0x0098
            java.lang.String r1 = "com.facebook.greatwhite"
            r0 = 0
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 != r4) goto L_0x0079
        L_0x0098:
            X.KbD r3 = X.C62155KbD.A00
            return r3
        L_0x009b:
            if (r5 == 0) goto L_0x009e
            goto L_0x0029
        L_0x009e:
            java.util.Iterator r1 = r10.iterator()
        L_0x00a2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C59790JYj.A00(r0)
            if (r0 == 0) goto L_0x00a2
            X.JYj r3 = X.C59790JYj.A01
            return r3
        L_0x00b7:
            if (r5 == 0) goto L_0x00bb
            goto L_0x002f
        L_0x00bb:
            java.util.Iterator r7 = r10.iterator()
        L_0x00bf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r6 = r7.next()
            java.lang.String r6 = (java.lang.String) r6
            X.KbF r3 = X.C62157KbF.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316327899566308(0x810582000010e4, double:3.0299302255760625E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            r1 = 0
            if (r0 == 0) goto L_0x00bf
            if (r6 == 0) goto L_0x00e5
            java.lang.String r0 = "mos_version"
            boolean r0 = X.00l.A0d(r6, r0, r1)
            if (r0 != 0) goto L_0x003c
        L_0x00e5:
            java.lang.String r0 = "Merlot"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "com.wearable.facebook.monza"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x00bf
            return r3
        L_0x00f6:
            if (r5 == 0) goto L_0x00fa
            goto L_0x0035
        L_0x00fa:
            java.util.Iterator r3 = r10.iterator()
        L_0x00fe:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00fe
            java.lang.String r1 = "com.facebook.horizon"
            r0 = 0
            boolean r0 = X.00l.A0d(r2, r1, r0)
            if (r0 != r4) goto L_0x00fe
            X.KbE r3 = X.C62156KbE.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59737JVv.A01(X.0lg, java.lang.String, java.util.List):X.Kp0");
    }

    public static final String A02(0lg r1, String str, List list) {
        0qQ.A0B(list, 1);
        C62948Kp0 A01 = A01(r1, str, list);
        if (A01 != null) {
            return A01.A01();
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0bY] */
    public static final String A03(String str) {
        String str2;
        0qQ.A0B(str, 0);
        Uri A00 = 0cp.A00(new Object(), str);
        if (A00 != null) {
            str2 = C59782JYb.A00(A00);
        } else {
            str2 = null;
        }
        return A04(str2);
    }

    public static final boolean A06(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        C62948Kp0 A01 = A01(userSession, str, 0sn.A00);
        if (A01 == null || !A01.A03() || !182.A06(0Tu.A05, userSession, 36329285815975896L)) {
            return false;
        }
        return true;
    }

    public static final String A04(String str) {
        List<String> A18;
        List A1P;
        if (!(str == null || (A18 = DbV.A18(str, "&")) == null)) {
            LinkedHashMap A0x = DbS.A0x(JTT.A08(A18));
            for (String str2 : A18) {
                if (00l.A0R(str2, new String[]{"="}, 0).size() == 2) {
                    A1P = 00l.A0R(str2, new String[]{"="}, 0);
                } else {
                    A1P = 0sr.A1P(new String[]{"", ""});
                }
                A0x.put(A1P.get(0), A1P.get(1));
            }
            String A0r = DbS.A0r("gid", A0x);
            if (A0r != null) {
                return A0r;
            }
        }
        return "";
    }

    public static final void A05(Medium medium, UserSession userSession, 0sP r4) {
        try {
            0nY.A00().ATE(new KJ1(medium, userSession, r4));
        } catch (OutOfMemoryError unused) {
            r4.invoke((Object) null);
        }
    }
}
