package X;

import android.content.Context;
import android.location.Location;
import com.instagram.common.gallery.Medium;
import java.util.NoSuchElementException;

public abstract class LJ1 {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0142 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(android.content.Context r21, android.location.Location r22, com.instagram.common.session.UserSession r23, X.C390879rz r24, X.C227382jA r25, java.util.List r26) {
        /*
            r14 = r24
            r0 = r25
            X.AnonymousClass7TG.A1R(r14, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599477915094561(0x82070800180e21, double:3.208995435549727E-306)
            r3 = r23
            int r13 = X.DbS.A04(r2, r3, r0)
            r0 = 36599477914439196(0x820708000e0e1c, double:3.2089954351352714E-306)
            int r5 = X.DbS.A04(r2, r3, r0)
            X.9rz r0 = X.C390879rz.SMART_ALBUMS
            if (r14 != r0) goto L_0x0173
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x0024:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r6 = 0
            r12 = 0
            android.location.Location r8 = new android.location.Location
            r8.<init>(r6)
            java.util.Iterator r18 = r26.iterator()
        L_0x0037:
            boolean r1 = r18.hasNext()
            r2 = r21
            r0 = r22
            if (r1 == 0) goto L_0x017e
            com.instagram.common.gallery.Medium r7 = X.JTO.A0W(r18)
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x006a
            r9.add(r7)
            java.lang.String r2 = r7.A0V
            if (r2 == 0) goto L_0x005b
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.JwE r6 = new X.JwE
            r0 = 1
            r6.<init>((java.lang.String) r2, (java.lang.Integer) r1, (int) r0)
            goto L_0x0037
        L_0x005b:
            java.lang.String r2 = r7.A0Z
            if (r2 == 0) goto L_0x0068
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.JwE r6 = new X.JwE
            r0 = 1
            r6.<init>((java.lang.String) r2, (java.lang.Integer) r1, (int) r0)
            goto L_0x0037
        L_0x0068:
            r6 = r12
            goto L_0x0037
        L_0x006a:
            java.lang.Object r4 = X.00k.A0K(r9)
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            if (r22 == 0) goto L_0x009e
            java.lang.Float r0 = A00(r2, r0, r8, r7)
            if (r0 == 0) goto L_0x009e
            float r1 = r0.floatValue()
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r16 = java.lang.Float.valueOf(r1)
        L_0x0083:
            android.content.ContentResolver r0 = X.JTP.A0B(r2)
            double[] r15 = r4.A07(r0)
            if (r15 == 0) goto L_0x00c3
            android.location.Location r3 = new android.location.Location
            r3.<init>(r12)
            r1 = 0
            int r0 = r15.length
            if (r0 != 0) goto L_0x00a1
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x009e:
            r16 = r12
            goto L_0x0083
        L_0x00a1:
            r0 = r15[r1]
            r3.setLatitude(r0)
            int r0 = r15.length
            if (r0 != 0) goto L_0x00b1
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x00b1:
            int r0 = r0 + -1
            r0 = r15[r0]
            r3.setLongitude(r0)
            java.lang.Float r0 = A00(r2, r3, r8, r7)
            if (r0 == 0) goto L_0x00c3
            float r17 = r0.floatValue()
            goto L_0x00c6
        L_0x00c3:
            r17 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x00c6:
            r2 = 480(0x1e0, float:6.73E-43)
            if (r16 == 0) goto L_0x00de
            float r1 = r16.floatValue()
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00de
            r0 = 1148846080(0x447a0000, float:1000.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r2 = 2880(0xb40, float:4.036E-42)
            if (r0 >= 0) goto L_0x00de
            r2 = 1440(0x5a0, float:2.018E-42)
        L_0x00de:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r2
            long r15 = r3.toMillis(r0)
            long r2 = r4.A0D
            long r0 = r7.A0D
            long r2 = r2 - r0
            long r1 = java.lang.Math.abs(r2)
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0142
            r0 = 1203982336(0x47c35000, float:100000.0)
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0142
            r9.add(r7)
            java.lang.String r1 = r4.A0V
            if (r1 == 0) goto L_0x0112
            java.lang.String r0 = r7.A0V
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0112
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x010a:
            r0 = 1
            X.JwE r6 = new X.JwE
            r6.<init>((java.lang.String) r1, (java.lang.Integer) r2, (int) r0)
            goto L_0x0037
        L_0x0112:
            java.lang.String r1 = r4.A0Z
            if (r1 == 0) goto L_0x0121
            java.lang.String r0 = r7.A0Z
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0121
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x010a
        L_0x0121:
            java.lang.String r1 = r4.A0L
            if (r1 == 0) goto L_0x0130
            java.lang.String r0 = r7.A0L
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0130
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x010a
        L_0x0130:
            java.lang.String r1 = r4.A0R
            if (r1 == 0) goto L_0x013f
            java.lang.String r0 = r7.A0R
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            goto L_0x010a
        L_0x013f:
            r6 = 0
            goto L_0x0037
        L_0x0142:
            if (r6 == 0) goto L_0x014d
            int r0 = r9.size()
            if (r0 < r5) goto L_0x014d
            X.AnonymousClass7TF.A1I(r6, r9, r11)
        L_0x014d:
            r2 = 1
            com.instagram.common.gallery.Medium[] r0 = new com.instagram.common.gallery.Medium[]{r7}
            java.util.ArrayList r9 = X.0sr.A1M(r0)
            java.lang.String r1 = r7.A0V
            if (r1 == 0) goto L_0x0163
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.JwE r6 = new X.JwE
            r6.<init>((java.lang.String) r1, (java.lang.Integer) r0, (int) r2)
            goto L_0x0037
        L_0x0163:
            java.lang.String r1 = r7.A0Z
            if (r1 == 0) goto L_0x0170
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.JwE r6 = new X.JwE
            r6.<init>((java.lang.String) r1, (java.lang.Integer) r0, (int) r2)
            goto L_0x0037
        L_0x0170:
            r6 = r12
            goto L_0x0037
        L_0x0173:
            r0 = 36599477914897951(0x82070800150e1f, double:3.20899543542539E-306)
            int r10 = X.DbS.A04(r2, r3, r0)
            goto L_0x0024
        L_0x017e:
            if (r6 == 0) goto L_0x0189
            int r1 = r9.size()
            if (r1 < r5) goto L_0x0189
            X.AnonymousClass7TF.A1I(r6, r9, r11)
        L_0x0189:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r11.iterator()
        L_0x0191:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x01aa
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.0eP r1 = (X.0eP) r1
            java.lang.Object r1 = r1.A01
            int r1 = X.DbS.A05(r1)
            if (r1 < r5) goto L_0x0191
            r6.add(r3)
            goto L_0x0191
        L_0x01aa:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r15 = r6.iterator()
        L_0x01b2:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0210
            X.0eP r1 = X.JTO.A1A(r15)
            java.lang.Object r8 = r1.A00
            X.JwE r8 = (X.C61076JwE) r8
            java.lang.Object r6 = r1.A01
            java.util.List r6 = (java.util.List) r6
            int r1 = r6.size()
            if (r1 <= r10) goto L_0x01d4
            r1 = 19
            java.util.List r1 = X.MAY.A00(r6, r1)
            java.util.List r6 = X.00k.A0d(r1, r10)
        L_0x01d4:
            X.0eP r26 = X.C63278KuN.A00(r6)
            r11 = 0
            X.AnonymousClass7TF.A1H(r8, r6)
            int r9 = r6.size()
            java.util.ArrayList r4 = X.DbS.A0v(r9)
            r3 = 0
        L_0x01e5:
            if (r3 >= r9) goto L_0x01ef
            X.KgE r1 = X.C62464KgE.LAYOUT
            r4.add(r1)
            int r3 = r3 + 1
            goto L_0x01e5
        L_0x01ef:
            X.KhF r18 = X.C62523KhF.A04
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r11)
            java.lang.String r3 = r8.A01
            java.lang.String r21 = ""
            X.Juu r1 = new X.Juu
            r16 = r1
            r17 = r14
            r19 = r12
            r22 = r21
            r23 = r3
            r24 = r6
            r25 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7.add(r1)
            goto L_0x01b2
        L_0x0210:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r7.iterator()
        L_0x0218:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0231
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.Juu r1 = (X.C60998Juu) r1
            java.util.List r1 = r1.A07
            int r1 = r1.size()
            if (r1 < r5) goto L_0x0218
            r6.add(r3)
            goto L_0x0218
        L_0x0231:
            r1 = 18
            java.util.List r1 = X.MAY.A00(r6, r1)
            java.util.List r8 = X.00k.A0d(r1, r13)
            r7 = 0
            X.0qQ.A0B(r8, r7)
            if (r0 == 0) goto L_0x02a6
            android.location.Location r6 = new android.location.Location
            r6.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x024a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x02a6
            java.lang.Object r9 = r12.next()
            X.Juu r9 = (X.C60998Juu) r9
            java.util.List r3 = r9.A07
            boolean r1 = r3 instanceof java.util.Collection
            r11 = 1
            if (r1 == 0) goto L_0x026b
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x026b
        L_0x0263:
            r11 = 0
        L_0x0264:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            r9.A03 = r1
            goto L_0x024a
        L_0x026b:
            java.util.Iterator r10 = r3.iterator()
        L_0x026f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0263
            com.instagram.common.gallery.Medium r3 = X.JTO.A0W(r10)
            android.content.ContentResolver r1 = X.JTP.A0B(r2)
            double[] r5 = r3.A07(r1)
            if (r5 == 0) goto L_0x026f
            int r1 = r5.length
            if (r1 != 0) goto L_0x028e
            java.lang.String r1 = "Array is empty."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x028e:
            r3 = r5[r7]
            r6.setLatitude(r3)
            int r1 = r1 + -1
            r3 = r5[r1]
            r6.setLongitude(r3)
            float r3 = r0.distanceTo(r6)
            r1 = 1203982336(0x47c35000, float:100000.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x026f
            goto L_0x0264
        L_0x02a6:
            java.util.Iterator r2 = r8.iterator()
        L_0x02aa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r1 = r2.next()
            X.Juu r1 = (X.C60998Juu) r1
            java.util.List r0 = r1.A07
            X.KhF r0 = X.C63276KuL.A00(r0)
            r1.A01 = r0
            goto L_0x02aa
        L_0x02bf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LJ1.A01(android.content.Context, android.location.Location, com.instagram.common.session.UserSession, X.9rz, X.2jA, java.util.List):java.util.List");
    }

    public static final Float A00(Context context, Location location, Location location2, Medium medium) {
        double[] A07 = medium.A07(JTP.A0B(context));
        if (A07 == null) {
            return null;
        }
        int length = A07.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        location2.setLatitude(A07[0]);
        location2.setLongitude(A07[length - 1]);
        return Float.valueOf(location.distanceTo(location2));
    }
}
