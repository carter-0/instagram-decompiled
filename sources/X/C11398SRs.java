package X;

import android.os.Build;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.SRs  reason: case insensitive filesystem */
public final class C11398SRs {
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        if (r4 < 29) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0091, code lost:
        if (r4 == X.AnonymousClass4OA.STORAGE_WRITE) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(android.app.Activity r8, X.C61084JwM r9) {
        /*
            r7 = 0
            r6 = 1
            java.lang.Object r4 = r9.A00
            java.lang.Object r2 = r9.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r9.A01
            X.4OA r0 = X.AnonymousClass4OA.STORAGE_READ
            java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
            r3 = 29
            if (r4 == r0) goto L_0x0025
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x008f
            X.REc r0 = X.C8885REc.LOCATION
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x008f
            boolean r0 = X.1DL.A05(r8, r1)
            if (r0 != 0) goto L_0x008f
            return r7
        L_0x0025:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r4 < r0) goto L_0x003c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r5 != r0) goto L_0x0051
            r0 = 38
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.1DL.A05(r8, r0)
            if (r0 != 0) goto L_0x0051
            return r7
        L_0x003c:
            r0 = 33
            if (r4 >= r0) goto L_0x0051
            X.REc r0 = X.C8885REc.STORAGE
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
        L_0x004a:
            boolean r0 = X.1DL.A05(r8, r0)
            if (r0 != 0) goto L_0x007e
            return r7
        L_0x0051:
            X.REc r0 = X.C8885REc.IMAGE
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            boolean r0 = X.1DL.A05(r8, r0)
            if (r0 != 0) goto L_0x0062
            return r7
        L_0x0062:
            X.REc r0 = X.C8885REc.AUDIO
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            boolean r0 = X.1DL.A05(r8, r0)
            if (r0 != 0) goto L_0x0073
            return r7
        L_0x0073:
            X.REc r0 = X.C8885REc.VIDEO
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            goto L_0x004a
        L_0x007e:
            if (r4 < r3) goto L_0x0093
        L_0x0080:
            X.REc r0 = X.C8885REc.LOCATION
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0093
            boolean r0 = X.1DL.A05(r8, r1)
            if (r0 != 0) goto L_0x0093
            return r7
        L_0x008f:
            X.4OA r0 = X.AnonymousClass4OA.STORAGE_WRITE
            if (r4 != r0) goto L_0x0025
        L_0x0093:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11398SRs.A03(android.app.Activity, X.JwM):boolean");
    }

    public static final List A00(C61084JwM jwM, C11398SRs sRs) {
        Collection collection;
        int ordinal = ((AnonymousClass4OA) jwM.A00).ordinal();
        if (ordinal == 5) {
            collection = sRs.A02(jwM);
        } else if (ordinal == 6) {
            List list = (List) jwM.A02;
            collection = DbS.A0y();
            if (Build.VERSION.SDK_INT >= 29 && list.contains(C8885REc.LOCATION)) {
                collection.add("android.permission.ACCESS_MEDIA_LOCATION");
            }
            collection.add(AnonymousClass000.A00(10));
        } else if (ordinal != 7) {
            return 0sn.A00;
        } else {
            Set A02 = sRs.A02(jwM);
            List list2 = (List) jwM.A02;
            LinkedHashSet A0y = DbS.A0y();
            if (Build.VERSION.SDK_INT >= 29 && list2.contains(C8885REc.LOCATION)) {
                A0y.add("android.permission.ACCESS_MEDIA_LOCATION");
            }
            A0y.add(AnonymousClass000.A00(10));
            collection = 094.A00(A0y, A02);
        }
        return 00k.A0a(collection);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (r3.contains(X.C8885REc.VIDEO) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set A02(X.C61084JwM r8) {
        /*
            r7 = this;
            java.lang.Object r3 = r8.A02
            java.util.List r3 = (java.util.List) r3
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r6 < r0) goto L_0x0070
            java.lang.Object r1 = r8.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0070
            X.REc r1 = X.C8885REc.LOCATION
            java.lang.String r0 = "android.permission.ACCESS_MEDIA_LOCATION"
            X.0eP r5 = X.AnonymousClass7TE.A1L(r1, r0)
            X.REc r1 = X.C8885REc.AUDIO
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            X.0eP r4 = X.AnonymousClass7TE.A1L(r1, r0)
            X.REc r1 = X.C8885REc.IMAGE
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r0)
            X.REc r1 = X.C8885REc.VIDEO
            java.lang.String r0 = "android.permission.READ_MEDIA_VIDEO"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r1, r0, r5, r4, r2)
            java.util.LinkedHashMap r5 = X.0Yt.A06(r0)
            r0 = 38
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.Set r2 = X.0sc.A06(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x004a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r1.next()
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x004a
            r4.add(r0)
            goto L_0x004a
        L_0x005e:
            java.util.Iterator r1 = r4.iterator()
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            r2.add(r0)
            goto L_0x0062
        L_0x0070:
            java.util.LinkedHashSet r2 = X.DbS.A0y()
            java.lang.String r5 = "android.permission.ACCESS_MEDIA_LOCATION"
            r0 = 33
            if (r6 < r0) goto L_0x00ad
            X.REc r0 = X.C8885REc.AUDIO
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "android.permission.READ_MEDIA_AUDIO"
            r2.add(r0)
        L_0x0087:
            X.REc r0 = X.C8885REc.IMAGE
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "android.permission.READ_MEDIA_IMAGES"
            r2.add(r0)
        L_0x0094:
            X.REc r0 = X.C8885REc.VIDEO
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = "android.permission.READ_MEDIA_VIDEO"
        L_0x009e:
            r2.add(r1)
        L_0x00a1:
            X.REc r0 = X.C8885REc.LOCATION
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00ac
            r2.add(r5)
        L_0x00ac:
            return r2
        L_0x00ad:
            r4 = 29
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            X.REc r0 = X.C8885REc.STORAGE
            boolean r0 = r3.contains(r0)
            if (r6 < r4) goto L_0x00d4
            if (r0 != 0) goto L_0x009e
            X.REc r0 = X.C8885REc.AUDIO
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x009e
            X.REc r0 = X.C8885REc.IMAGE
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x009e
            X.REc r0 = X.C8885REc.VIDEO
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00a1
            goto L_0x009e
        L_0x00d4:
            if (r0 != 0) goto L_0x00ee
            X.REc r0 = X.C8885REc.AUDIO
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x00ee
            X.REc r0 = X.C8885REc.IMAGE
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L_0x00ee
            X.REc r0 = X.C8885REc.VIDEO
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x00ac
        L_0x00ee:
            r2.add(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11398SRs.A02(X.JwM):java.util.Set");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (X.0qQ.A0K(r6, "android.permission.READ_MEDIA_VIDEO") != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r12.A01 != X.AnonymousClass05K.A00) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map A01(X.C61084JwM r12, X.C11398SRs r13, java.util.Map r14) {
        /*
            java.util.LinkedHashMap r2 = X.AnonymousClass7TE.A1H()
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 34
            if (r0 < r5) goto L_0x0011
            java.lang.Object r1 = r12.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r11 = 1
            if (r1 == r0) goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            java.util.List r4 = A00(r12, r13)
            java.util.Iterator r10 = r4.iterator()
            r9 = 0
        L_0x001b:
            boolean r0 = r10.hasNext()
            java.lang.String r8 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r7 = "android.permission.READ_MEDIA_VIDEO"
            if (r0 == 0) goto L_0x0067
            java.lang.Object r6 = r10.next()
            java.lang.Object r3 = r14.get(r6)
            if (r3 != 0) goto L_0x003c
            X.REc r0 = X.C8885REc.UNSPECIFIED
            java.lang.String r1 = r0.toString()
            X.4OB r0 = X.AnonymousClass4OB.STATUS_ERROR
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r1, r0)
        L_0x003b:
            return r2
        L_0x003c:
            X.4OB r0 = X.AnonymousClass4OB.GRANTED
            if (r3 == r0) goto L_0x0063
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x0063
            if (r9 != 0) goto L_0x0055
            boolean r0 = X.0qQ.A0K(r6, r8)
            if (r0 != 0) goto L_0x0055
            boolean r0 = X.0qQ.A0K(r6, r7)
            r9 = 0
            if (r0 == 0) goto L_0x0056
        L_0x0055:
            r9 = 1
        L_0x0056:
            r0 = 38
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0063
            r11 = 0
        L_0x0063:
            r2.put(r6, r3)
            goto L_0x001b
        L_0x0067:
            if (r11 == 0) goto L_0x003b
            if (r9 == 0) goto L_0x003b
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x003b
            boolean r0 = r4.contains(r7)
            if (r0 == 0) goto L_0x007a
            X.4OB r0 = X.AnonymousClass4OB.STORAGE_PARTIAL
            r2.put(r7, r0)
        L_0x007a:
            boolean r0 = r4.contains(r8)
            if (r0 == 0) goto L_0x003b
            X.4OB r0 = X.AnonymousClass4OB.STORAGE_PARTIAL
            r2.put(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11398SRs.A01(X.JwM, X.SRs, java.util.Map):java.util.Map");
    }
}
