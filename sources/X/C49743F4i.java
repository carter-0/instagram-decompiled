package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.F4i  reason: case insensitive filesystem */
public abstract class C49743F4i {
    public static final void A01(FragmentActivity fragmentActivity, AnonymousClass0iw r16, C307786Rm r17, C307896Rx r18, C276544tV r19) {
        String A0K;
        Integer num;
        AnonymousClass0iw r13 = r16;
        boolean A1U = AnonymousClass7TF.A1U(0, fragmentActivity, r13);
        C276544tV r10 = r19;
        0qQ.A0B(r10, 4);
        C358248ab A0X = DbS.A0X(fragmentActivity);
        A0X.A0r(r10.A0R(40, A1U));
        A0X.A0s(r10.A0R(38, false));
        String A0K2 = r10.A0K(45);
        if (!(A0K2 == null || A0K2.length() == 0)) {
            A0X.A05 = A0K2;
        }
        C276544tV A07 = r10.A07(48);
        C307896Rx r11 = r18;
        C307786Rm r12 = r17;
        if (!(A07 == null || (A0K = A07.A0K(38)) == null)) {
            if ((r17 != null && r12.A05 == A1U) || C308206Td.A06(r11).A05.AEv(fragmentActivity)) {
                A0K = DbV.A11(A07, A0K, 40);
            }
            SimpleImageUrl A0V = DbS.A0V(A0K);
            String A0K3 = A07.A0K(36);
            if (A0K3 == null || A0K3.length() == 0) {
                num = AnonymousClass05K.A0Y;
            } else {
                try {
                    String A0k = DbY.A0k(A0K3);
                    if (A0k.equals("SQUARE")) {
                        num = AnonymousClass05K.A00;
                    } else if (A0k.equals("CIRCLE")) {
                        num = AnonymousClass05K.A01;
                    } else if (A0k.equals("RECTANGLE")) {
                        num = AnonymousClass05K.A0C;
                    } else if (A0k.equals("FULL_WIDTH")) {
                        num = AnonymousClass05K.A0N;
                    } else if (A0k.equals("UNKNOWN")) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        throw AnonymousClass7TE.A0w(A0k);
                    }
                } catch (IllegalArgumentException unused) {
                    1Kn.A02("IGBloksActionNavigationOpenDialogImpl", 002.A0R("Dialog header type unknown: ", A0K3));
                    num = AnonymousClass05K.A0Y;
                }
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                A0X.A0p(A0V, r13);
            } else if (intValue == A1U) {
                A0X.A0n(A0V, r13);
            } else if (intValue == 2) {
                A0X.A08 = A1U;
                A0X.A0Z.setImageURL(A0V, r13, (C240963Ni) null);
            } else if (intValue != 3) {
                A0X.A0p(A0V, r13);
                if (A07.A0K(36) != null) {
                    1Kn.A02(C66579MXk.A00(240), 002.A0R("Unknown header render type: ", A07.A0K(36)));
                }
            } else {
                A0X.A0o(A0V, r13);
            }
        }
        String A0I = r10.A0I();
        if (A0I != null && A0I.length() > 0) {
            A0X.A0q(A0I);
        }
        0t0 A01 = AnonymousClass0eN.A01(new MMG(r12, 3));
        C276544tV A072 = r10.A07(44);
        if (A072 != null) {
            String A11 = DbV.A11(A072, "", 38);
            A0X.A0Y(new C50026FJl(r11, A072, (AnonymousClass0eM) A01, 3), A00(A072.A0K(34)), A11, A072.A0R(36, A1U));
        }
        C276544tV A073 = r10.A07(35);
        if (A073 != null) {
            String A112 = DbV.A11(A073, "", 38);
            A0X.A0W(new C50026FJl(r11, A073, (AnonymousClass0eM) A01, 4), A00(A073.A0K(34)), A112, A073.A0R(36, A1U));
        }
        C276544tV A074 = r10.A07(42);
        if (A074 != null) {
            String A113 = DbV.A11(A074, "", 38);
            A0X.A0X(new C50026FJl(r11, A074, (AnonymousClass0eM) A01, 5), A00(A074.A0K(34)), A113, A074.A0R(36, A1U));
        }
        C277014uI A0A = r10.A0A(43);
        if (A0A != null) {
            A0X.A0B(new FHX(A1U ? 1 : 0, A0A, r11));
        }
        DbT.A1V(A0X);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        X.1Kn.A02(X.C66579MXk.A00(240), X.002.A0R("Unknown button style ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        return X.C358278ae.DEFAULT;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C358278ae A00(java.lang.String r1) {
        /*
            if (r1 == 0) goto L_0x0050
            int r0 = r1.hashCode()
            switch(r0) {
                case -785846925: goto L_0x0045;
                case 112785: goto L_0x003a;
                case 3027034: goto L_0x002f;
                case 1544803905: goto L_0x0026;
                case 1949100874: goto L_0x001b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "Unknown button style "
            java.lang.String r1 = X.002.A0R(r0, r1)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.1Kn.A02(r0, r1)
            X.8ae r0 = X.C358278ae.DEFAULT
            return r0
        L_0x001b:
            java.lang.String r0 = "blue_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            return r0
        L_0x0026:
            java.lang.String r0 = "default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x0009
        L_0x002f:
            java.lang.String r0 = "blue"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.8ae r0 = X.C358278ae.BLUE
            return r0
        L_0x003a:
            java.lang.String r0 = "red"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.8ae r0 = X.C358278ae.RED
            return r0
        L_0x0045:
            java.lang.String r0 = "red_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.8ae r0 = X.C358278ae.RED_BOLD
            return r0
        L_0x0050:
            X.8ae r0 = X.C358278ae.DEFAULT
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49743F4i.A00(java.lang.String):X.8ae");
    }
}
