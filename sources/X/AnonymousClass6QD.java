package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.6QD  reason: invalid class name */
public abstract class AnonymousClass6QD {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.net.Uri} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri A00(X.C307786Rm r7, X.C276544tV r8) {
        /*
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r4 = 36
            java.lang.String r3 = r8.A0K(r4)
            r2 = 41
            java.lang.String r1 = r8.A0K(r2)
            if (r3 == 0) goto L_0x001e
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x001e
        L_0x001a:
            r6 = 0
            if (r3 == 0) goto L_0x0064
            goto L_0x0020
        L_0x001e:
            r3 = r1
            goto L_0x001a
        L_0x0020:
            X.6QE r0 = X.AnonymousClass6QE.A02     // Catch:{ SecurityException -> 0x0055, Exception -> 0x002e }
            android.net.Uri r0 = X.0cp.A03(r3)     // Catch:{ SecurityException -> 0x0055, Exception -> 0x002e }
            X.0qQ.A07(r0)     // Catch:{ SecurityException -> 0x0055, Exception -> 0x002e }
            android.net.Uri r6 = X.AnonymousClass6QJ.A01(r0, r5)     // Catch:{ SecurityException -> 0x0055, Exception -> 0x002e }
            goto L_0x0064
        L_0x002e:
            r5 = move-exception
            java.lang.Object r0 = X.C276544tV.A00(r8, r4)     // Catch:{ Exception -> 0x0054 }
            java.lang.Object r4 = X.C276544tV.A00(r8, r2)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r3 = "ImageNodeHelper"
            java.lang.String r2 = "Error getting urls - darkUrl: "
            if (r0 == 0) goto L_0x0051
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0054 }
        L_0x0041:
            java.lang.String r0 = ", url: "
            if (r4 == 0) goto L_0x0049
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x0054 }
        L_0x0049:
            java.lang.String r0 = X.002.A0u(r2, r1, r0, r6)     // Catch:{ Exception -> 0x0054 }
            X.1Kn.A00(r7, r3, r0, r5)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0053
        L_0x0051:
            r1 = r6
            goto L_0x0041
        L_0x0053:
            throw r5
        L_0x0054:
            throw r5
        L_0x0055:
            r2 = move-exception
            java.lang.String r1 = "Parse uri \""
            java.lang.String r0 = "\" failed."
            java.lang.String r1 = X.002.A0g(r1, r3, r0)
            java.lang.String r0 = "UriParser"
            X.1Kn.A00(r7, r0, r1, r2)
            return r6
        L_0x0064:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6QD.A00(X.6Rm, X.4tV):android.net.Uri");
    }

    public static final AnonymousClass579 A01(C307786Rm r4, C276544tV r5) {
        AnonymousClass6Oa r3;
        C306926Oc r2;
        0qQ.A0B(r4, 0);
        C277014uI A0A = r5.A0A(44);
        if (A0A != null) {
            r3 = new AnonymousClass6Oa(r4, r5, A0A);
        } else {
            r3 = null;
        }
        List A0N = r5.A0N(133);
        0qQ.A07(A0N);
        if (!(!A0N.isEmpty()) || (r2 = (C306926Oc) C307476Qg.A06(r4, r5)) == null) {
            return r3;
        }
        if (r3 == null) {
            return r2;
        }
        C306926Oc r1 = new C306926Oc();
        List list = r1.A00;
        list.add(r3);
        list.add(r2);
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.UIY, X.763, android.graphics.drawable.Drawable] */
    public static final 1U1 A02(C307786Rm r10, C276544tV r11) {
        PointF pointF;
        AnonymousClass1U5 r0;
        1UK r02;
        Drawable drawable;
        int A00;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r11, 1);
        Context context = r10.A00;
        boolean A0R = r11.A0R(66, false);
        C276544tV A07 = r11.A07(61);
        if (A07 != null) {
            pointF = new PointF(A07.A02(35, 0.5f), A07.A02(36, 0.5f));
        } else {
            pointF = null;
        }
        AnonymousClass1U3 A002 = AnonymousClass1UL.A00(1U1.A0b);
        String A0K = r11.A0K(40);
        if (pointF != null) {
            r0 = AnonymousClass1U5.A0A;
        } else {
            if (A0K != null) {
                try {
                    int i = AnonymousClass6QO.A00[AnonymousClass6Su.A0A(A0K).ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            r0 = AnonymousClass1U5.A04;
                        } else if (i == 3) {
                            r0 = AnonymousClass1U5.A08;
                        }
                    }
                } catch (C258053yO e) {
                    1Kn.A00((C307786Rm) null, "ImageNodeHelper", 002.A0R("Error parsing image scale type: ", A0K), e);
                }
            }
            r0 = AnonymousClass1U5.A01;
        }
        A002.A00(r0);
        C276544tV A072 = r11.A07(35);
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (!(A072 == null || (A00 = AnonymousClass6TP.A00(r10, A072, 0)) == 0)) {
            porterDuffColorFilter = new PorterDuffColorFilter(A00, PorterDuff.Mode.SRC_ATOP);
        }
        A002.A06 = porterDuffColorFilter;
        A002.A0S = true;
        A002.A0V = false;
        A002.A0a = A0R;
        A002.A0Z = A0R;
        A002.A0Y = r11.A0R(69, false);
        C276544tV A073 = r11.A07(46);
        if (A073 == null || !A073.A0R(41, false)) {
            r02 = 1UK.A01;
        } else {
            r02 = 1UK.A03;
        }
        A002.A01 = r02;
        A002.A09 = pointF;
        C276544tV A074 = r11.A07(65);
        if (A074 != null) {
            A002.A0R = Integer.valueOf(AnonymousClass6TP.A00(r10, A074, 0));
            A002.A03 = 0;
            A002.A0C = null;
        }
        if (0qQ.A0K(r11.A0K(67), "fade")) {
            A002.A01 = 100;
        }
        if (r11.A0R(76, false)) {
            A002.A0M = C268754dw.A01;
        }
        if (r11.A0R(48, false) && (drawable = context.getDrawable(R.drawable.spinner_large)) != null) {
            ? r1 = new AnonymousClass763(drawable);
            r1.A00 = 0.0f;
            r1.A03 = false;
            r1.A01 = 850;
            r1.A02 = true;
            A002.A0D = r1;
        }
        return new 1U1(A002);
    }

    public static final void A03(C307786Rm r3, C276544tV r4, C277014uI r5, String str, long j) {
        C308276Tl r2 = new C308276Tl();
        r2.A03(str, 0);
        r2.A03(Long.valueOf(j), 1);
        r2.A03(r3, 2);
        C307886Rw.A03(r3, r4, new AnonymousClass6Tm(r2.A00), r5);
    }
}
