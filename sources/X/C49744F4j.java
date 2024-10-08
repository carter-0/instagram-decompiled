package X;

import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.F4j  reason: case insensitive filesystem */
public abstract class C49744F4j {
    public static Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        HashMap A0H = C308206Td.A0H((Map) r8.A02());
        C277014uI A0S = DbX.A0S(r8, 2);
        0lg A0B = C308206Td.A0B(r7);
        FragmentActivity A04 = C308206Td.A04(r7);
        A01(A04, r7, (C276544tV) r8.A01(), A0S, A0B, "no_animations", A0H);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.app.Activity r10, X.C307896Rx r11, X.C276544tV r12, X.C277014uI r13, X.0lg r14, java.lang.String r15, java.util.HashMap r16) {
        /*
            X.2nI r6 = X.C308206Td.A06(r11)
            r0 = 40
            X.4tV r0 = r12.A07(r0)
            if (r0 != 0) goto L_0x0065
            r8 = 0
        L_0x000d:
            r0 = 46
            r5 = 0
            boolean r4 = r12.A0R(r0, r5)
            r0 = 50
            boolean r3 = r12.A0R(r0, r5)
            r0 = 53
            boolean r2 = r12.A0R(r0, r5)
            r0 = 41
            X.4tV r7 = r12.A07(r0)
            if (r7 == 0) goto L_0x0063
            java.lang.String r1 = r7.A0D()
        L_0x002c:
            java.lang.String r0 = r12.A0F()
            r9 = r16
            X.DiU r9 = X.C46649DiU.A04(r0, r9)
            X.Dhv r0 = X.C46616Dhw.A01(r11, r7)
            com.instagram.bloks.hosting.IgBloksScreenConfig r7 = X.DbS.A0N(r14)
            if (r0 == 0) goto L_0x0043
            r7.A07(r0)
        L_0x0043:
            r7.A0R = r1
            r7.A07 = r8
            r0 = 44
            boolean r0 = r12.A0R(r0, r5)
            r7.A0l = r0
            r1 = 1
            r7.A0i = r1
            r7.A0h = r2
            r7.A0g = r3
            r7.A0f = r4
            boolean r0 = r6.A00
            r7.A0c = r0
            java.lang.String r0 = r12.A0D()
            if (r0 == 0) goto L_0x0077
            goto L_0x006a
        L_0x0063:
            r1 = 0
            goto L_0x002c
        L_0x0065:
            X.68u r8 = X.C3034368u.A00(r11, r0)
            goto L_0x000d
        L_0x006a:
            int r0 = X.AnonymousClass6Su.A05(r0)     // Catch:{ 3yO -> 0x0071 }
            r7.A00 = r0     // Catch:{ 3yO -> 0x0071 }
            goto L_0x0077
        L_0x0071:
            r8 = move-exception
            java.lang.String r0 = "IgBloksNavigationExtensions"
            X.1Kn.A03(r0, r8)
        L_0x0077:
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r7 = X.C49891FBs.A00(r7, r9)
            java.lang.String r0 = "bloks"
            X.6W8 r7 = X.DbS.A0b(r10, r7, r14, r8, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "fade"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00c9
            int[] r0 = com.instagram.modal.ModalActivity.A06
        L_0x0093:
            r7.A0J = r0
        L_0x0095:
            java.util.List r0 = X.C61290mR.A00
            if (r0 == 0) goto L_0x009f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00b0
        L_0x009f:
            if (r4 != 0) goto L_0x00a5
            if (r3 != 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00b0
        L_0x00a5:
            r7.A0H = r5
            r7.A0C = r1
            if (r4 != 0) goto L_0x00ad
            if (r3 == 0) goto L_0x00ae
        L_0x00ad:
            r5 = 1
        L_0x00ae:
            r7.A0B = r5
        L_0x00b0:
            androidx.fragment.app.Fragment r0 = r6.A02
            r2 = 32779(0x800b, float:4.5933E-41)
            if (r0 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00c1
            X.EEI r0 = new X.EEI
            r0.<init>((X.C307896Rx) r11, (X.C277014uI) r13, (int) r1)
            X.C308206Td.A0K(r11, r0)
        L_0x00c1:
            androidx.fragment.app.Fragment r0 = X.DbU.A0H(r11)
            r7.A0D(r0, r2)
            return
        L_0x00c9:
            java.lang.String r0 = "push"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00d5
            r7.A08()
            goto L_0x0095
        L_0x00d5:
            java.lang.String r0 = "no_animations"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00e0
            int[] r0 = com.instagram.modal.ModalActivity.A08
            goto L_0x0093
        L_0x00e0:
            r7.A07()
            goto L_0x0095
        L_0x00e4:
            if (r13 == 0) goto L_0x00ed
            java.lang.String r1 = "bloks_present_modal"
            java.lang.String r0 = "Callback ignored because we're presenting modal from a native surface"
            X.1Kn.A02(r1, r0)
        L_0x00ed:
            r7.A0A(r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49744F4j.A01(android.app.Activity, X.6Rx, X.4tV, X.4uI, X.0lg, java.lang.String, java.util.HashMap):void");
    }
}
