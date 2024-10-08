package X;

import com.facebook.mqtt.service.MqttSubscribeListener;
import com.instagram.api.schemas.ProductTileTextStyleType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwH  reason: case insensitive filesystem */
public final class C61079JwH extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61079JwH) || ((C61079JwH) obj).A03 != i) {
            return false;
        }
        return true;
    }

    public static boolean A01(C61079JwH jwH, C61079JwH jwH2) {
        return 0qQ.A0K(jwH.A02, jwH2.A02);
    }

    public static boolean A02(C61079JwH jwH, C61079JwH jwH2) {
        return 0qQ.A0K(jwH.A01, jwH2.A01);
    }

    public final C61079JwH A03(C60937Jtv jtv) {
        String str = jtv.A03;
        String str2 = this.A02;
        if (0qQ.A0K(str, str2)) {
            ArrayList A0T = 00k.A0T(jtv, (Collection) this.A00);
            if (str2 == null) {
                str2 = str;
            }
            ImageUrl imageUrl = (ImageUrl) this.A01;
            if (imageUrl == null) {
                imageUrl = jtv.A00;
            }
            return new C61079JwH(imageUrl, str2, (List) A0T);
        }
        throw AnonymousClass7TE.A0z("Attempting to store an account which display name does not match this aggregate display name");
    }

    public final 1Xl A04() {
        C69217NhX nhX;
        C62875Knp knp = (C62875Knp) this.A01;
        if (!(knp instanceof C69217NhX) || (nhX = (C69217NhX) knp) == null) {
            return null;
        }
        return nhX.A01;
    }

    public final String A05() {
        Object obj;
        Iterator A1H = C51966G9m.A1H(this.A00);
        while (true) {
            if (!A1H.hasNext()) {
                obj = null;
                break;
            }
            obj = A1H.next();
            if (((C60937Jtv) obj).A04 != null) {
                break;
            }
        }
        C60937Jtv jtv = (C60937Jtv) obj;
        if (jtv != null) {
            return jtv.A04;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x018b, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01c9, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01cb, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01d1, code lost:
        if (A01(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01d7, code lost:
        if (r2.A01 == r3.A01) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01db, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01e8, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01ea, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f0, code lost:
        if (A01(r2, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01f6, code lost:
        if (r2.A00 == r3.A00) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0202, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0204, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x020a, code lost:
        if (r2.A01 == r3.A01) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x020e, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022d, code lost:
        if (X.0qQ.A0K(r0, r1) != false) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0231, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0250, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0254, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x025c, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b9, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bb, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c5, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        r0 = r2.A02;
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e3, code lost:
        r0 = X.0qQ.A0K(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f1, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f3, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f9, code lost:
        if (r2.A00 != r3.A00) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ff, code lost:
        if (r2.A01 == r3.A01) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 != false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0146, code lost:
        if (A00(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0148, code lost:
        r3 = (X.C61079JwH) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014e, code lost:
        if (A02(r2, r3) != false) goto L_0x020e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0024;
                case 2: goto L_0x0029;
                case 3: goto L_0x002e;
                case 4: goto L_0x0033;
                case 5: goto L_0x0038;
                case 6: goto L_0x004f;
                case 7: goto L_0x0054;
                case 8: goto L_0x006a;
                case 9: goto L_0x0082;
                case 10: goto L_0x0099;
                case 11: goto L_0x00b1;
                case 12: goto L_0x00cd;
                case 13: goto L_0x00e9;
                case 14: goto L_0x0103;
                case 15: goto L_0x0109;
                case 16: goto L_0x0121;
                case 17: goto L_0x0139;
                case 18: goto L_0x013e;
                case 19: goto L_0x0152;
                case 20: goto L_0x0158;
                case 21: goto L_0x015d;
                case 22: goto L_0x0175;
                case 23: goto L_0x0191;
                case 24: goto L_0x01a9;
                case 25: goto L_0x01c1;
                case 26: goto L_0x01e0;
                case 27: goto L_0x01fa;
                case 28: goto L_0x0213;
                case 29: goto L_0x0236;
                default: goto L_0x0005;
            }
        L_0x0005:
            if (r2 == r3) goto L_0x0260
            r0 = 30
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A01(r2, r3)
        L_0x001b:
            if (r0 != 0) goto L_0x01db
        L_0x001d:
            r0 = 0
            return r0
        L_0x001f:
            if (r2 == r3) goto L_0x0260
            r0 = 0
            goto L_0x01c5
        L_0x0024:
            if (r2 == r3) goto L_0x0260
            r0 = 1
            goto L_0x01e4
        L_0x0029:
            if (r2 == r3) goto L_0x0260
            r0 = 2
            goto L_0x00b5
        L_0x002e:
            if (r2 == r3) goto L_0x0260
            r0 = 3
            goto L_0x00ed
        L_0x0033:
            if (r2 == r3) goto L_0x0260
            r0 = 4
            goto L_0x01fe
        L_0x0038:
            if (r2 == r3) goto L_0x0260
            r0 = 5
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x00e3
        L_0x004f:
            if (r2 == r3) goto L_0x0260
            r0 = 6
            goto L_0x0142
        L_0x0054:
            if (r2 == r3) goto L_0x0260
            r0 = 7
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A02(r2, r3)
            goto L_0x001b
        L_0x006a:
            if (r2 == r3) goto L_0x0260
            r0 = 8
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
            goto L_0x018b
        L_0x0082:
            if (r2 == r3) goto L_0x0260
            r0 = 9
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x001d
            boolean r0 = A01(r2, r3)
            goto L_0x001b
        L_0x0099:
            if (r2 == r3) goto L_0x0260
            r0 = 10
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A02(r2, r3)
            goto L_0x001b
        L_0x00b1:
            if (r2 == r3) goto L_0x0260
            r0 = 11
        L_0x00b5:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.A02
            java.lang.String r1 = r3.A02
            goto L_0x0229
        L_0x00cd:
            if (r2 == r3) goto L_0x0260
            r0 = 12
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x001d
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x00e3:
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x001b
        L_0x00e9:
            if (r2 == r3) goto L_0x0260
            r0 = 13
        L_0x00ed:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x001d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0254
            goto L_0x001d
        L_0x0103:
            if (r2 == r3) goto L_0x0260
            r0 = 14
            goto L_0x01fe
        L_0x0109:
            if (r2 == r3) goto L_0x0260
            r0 = 15
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A01(r2, r3)
            goto L_0x001b
        L_0x0121:
            if (r2 == r3) goto L_0x0260
            r0 = 16
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A01(r2, r3)
            goto L_0x001b
        L_0x0139:
            if (r2 == r3) goto L_0x0260
            r0 = 17
            goto L_0x0142
        L_0x013e:
            if (r2 == r3) goto L_0x0260
            r0 = 18
        L_0x0142:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 != 0) goto L_0x020e
            goto L_0x001d
        L_0x0152:
            if (r2 == r3) goto L_0x0260
            r0 = 19
            goto L_0x01e4
        L_0x0158:
            if (r2 == r3) goto L_0x0260
            r0 = 20
            goto L_0x01c5
        L_0x015d:
            if (r2 == r3) goto L_0x0260
            r0 = 21
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A02(r2, r3)
            goto L_0x001b
        L_0x0175:
            if (r2 == r3) goto L_0x0260
            r0 = 22
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x018b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            goto L_0x001b
        L_0x0191:
            if (r2 == r3) goto L_0x0260
            r0 = 23
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A02(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A01(r2, r3)
            goto L_0x001b
        L_0x01a9:
            if (r2 == r3) goto L_0x0260
            r0 = 24
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            boolean r0 = A02(r2, r3)
            goto L_0x001b
        L_0x01c1:
            if (r2 == r3) goto L_0x0260
            r0 = 25
        L_0x01c5:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x01db
            goto L_0x001d
        L_0x01db:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0258
        L_0x01e0:
            if (r2 == r3) goto L_0x0260
            r0 = 26
        L_0x01e4:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 == r0) goto L_0x0231
            goto L_0x001d
        L_0x01fa:
            if (r2 == r3) goto L_0x0260
            r0 = 27
        L_0x01fe:
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x020e
            goto L_0x001d
        L_0x020e:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x024c
        L_0x0213:
            if (r2 == r3) goto L_0x0260
            r0 = 28
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            boolean r0 = A01(r2, r3)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r2.A00
            java.lang.Object r1 = r3.A00
        L_0x0229:
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x0231
            goto L_0x001d
        L_0x0231:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0258
        L_0x0236:
            if (r2 == r3) goto L_0x0260
            r0 = 29
            boolean r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x001d
            X.JwH r3 = (X.C61079JwH) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x001d
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x024c:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0254
            goto L_0x001d
        L_0x0254:
            java.lang.String r1 = r2.A02
            java.lang.String r0 = r3.A02
        L_0x0258:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0260
            goto L_0x001d
        L_0x0260:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61079JwH.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r3 = X.AnonymousClass7TF.A07(r1, r2);
        r2 = r4.A02.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        r2 = r4.A00.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0151, code lost:
        r3 = r1 * 31;
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016c, code lost:
        r2 = (r2 + r1) * 31;
        r3 = X.AnonymousClass7TE.A0L(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0177, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        return r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a8, code lost:
        r2 = (r2 + X.AnonymousClass7TG.A0C(r1)) * 31;
        r3 = X.AnonymousClass7TE.A0L(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ed, code lost:
        if (r1 != null) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ef, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f8, code lost:
        r2 = r1 * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01fc, code lost:
        r2 = (r2 + X.AnonymousClass7TG.A0C(r1)) * 31;
        r3 = X.C41845B3m.A00(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0245, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0249, code lost:
        r3 = (r2 + r3) * 31;
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x024e, code lost:
        r2 = r1.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A03
            switch(r1) {
                case 0: goto L_0x023d;
                case 1: goto L_0x0224;
                case 2: goto L_0x020b;
                case 3: goto L_0x01f2;
                case 4: goto L_0x01b7;
                case 5: goto L_0x019e;
                case 6: goto L_0x0193;
                case 7: goto L_0x0179;
                case 8: goto L_0x015e;
                case 9: goto L_0x0142;
                case 10: goto L_0x012e;
                case 11: goto L_0x0115;
                case 12: goto L_0x01df;
                case 13: goto L_0x010b;
                case 14: goto L_0x0005;
                case 15: goto L_0x00fe;
                case 16: goto L_0x00ef;
                case 17: goto L_0x00e3;
                case 18: goto L_0x0005;
                case 19: goto L_0x00b8;
                case 20: goto L_0x009b;
                case 21: goto L_0x008b;
                case 22: goto L_0x0079;
                case 23: goto L_0x0071;
                case 24: goto L_0x002f;
                case 25: goto L_0x0065;
                case 26: goto L_0x0052;
                case 27: goto L_0x0049;
                case 28: goto L_0x0039;
                case 29: goto L_0x0027;
                case 30: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
        L_0x000d:
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.String r1 = r4.A02
            int r2 = r1.hashCode()
        L_0x0017:
            int r2 = r2 + r3
            return r2
        L_0x0019:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A08(r1, r2)
            goto L_0x013a
        L_0x0027:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            goto L_0x01f8
        L_0x002f:
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x0245
        L_0x0039:
            java.lang.String r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x01ed
        L_0x0049:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x000d
        L_0x0052:
            java.lang.String r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r2 = r1.hashCode()
            goto L_0x0017
        L_0x0065:
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            goto L_0x01a8
        L_0x0071:
            java.lang.Object r1 = r4.A01
            int r1 = r1.hashCode()
            goto L_0x0151
        L_0x0079:
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            if (r1 == 0) goto L_0x0177
            int r1 = r1.hashCode()
            goto L_0x016c
        L_0x008b:
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0249
        L_0x009b:
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00b2;
                case 2: goto L_0x00b5;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            java.lang.String r1 = "RADIO"
        L_0x00ac:
            int r2 = X.C51966G9m.A04(r1, r2)
            goto L_0x0249
        L_0x00b2:
            java.lang.String r1 = "CHECK"
            goto L_0x00ac
        L_0x00b5:
            java.lang.String r1 = "TOGGLE"
            goto L_0x00ac
        L_0x00b8:
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00d1;
                case 2: goto L_0x00d4;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00da;
                case 5: goto L_0x00dd;
                case 6: goto L_0x00e0;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            java.lang.String r1 = "QUESTION"
        L_0x00c9:
            int r3 = X.C51971G9r.A0F(r1, r2, r3)
            java.lang.Object r1 = r4.A01
            goto L_0x024e
        L_0x00d1:
            java.lang.String r1 = "THANK_YOU_PAGE"
            goto L_0x00c9
        L_0x00d4:
            java.lang.String r1 = "DISQUALIFY_PAGE"
            goto L_0x00c9
        L_0x00d7:
            java.lang.String r1 = "NEXT"
            goto L_0x00c9
        L_0x00da:
            java.lang.String r1 = "LOADING"
            goto L_0x00c9
        L_0x00dd:
            java.lang.String r1 = "ERROR"
            goto L_0x00c9
        L_0x00e0:
            java.lang.String r1 = "UNKNOWN"
            goto L_0x00c9
        L_0x00e3:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x01fc
        L_0x00ef:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A08(r1, r2)
            goto L_0x013a
        L_0x00fe:
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0K(r1)
            java.lang.String r1 = r4.A02
            if (r1 != 0) goto L_0x0155
            r2 = 0
            goto L_0x0249
        L_0x010b:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x000d
        L_0x0115:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0017
        L_0x012e:
            java.lang.String r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
        L_0x013a:
            java.lang.Object r1 = r4.A00
            int r2 = r1.hashCode()
            goto L_0x0017
        L_0x0142:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x015b
            java.lang.String r1 = "BACK"
        L_0x014d:
            int r1 = X.C51966G9m.A04(r1, r2)
        L_0x0151:
            int r3 = r1 * 31
            java.lang.String r1 = r4.A02
        L_0x0155:
            int r2 = r1.hashCode()
            goto L_0x0249
        L_0x015b:
            java.lang.String r1 = "CANCEL"
            goto L_0x014d
        L_0x015e:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0177
            int r1 = r1.hashCode()
        L_0x016c:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0017
        L_0x0177:
            r1 = 0
            goto L_0x016c
        L_0x0179:
            java.lang.String r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            X.5RW r1 = (X.AnonymousClass5RW) r1
            if (r1 == 0) goto L_0x01ef
            long r1 = r1.A00
            int r2 = X.C51968G9o.A03(r1)
            goto L_0x0017
        L_0x0193:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x01fc
        L_0x019e:
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
        L_0x01a8:
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0017
        L_0x01b7:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x01d6;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01dc;
                default: goto L_0x01c0;
            }
        L_0x01c0:
            java.lang.String r1 = "INITIAL"
        L_0x01c2:
            int r2 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x01ef
            int r2 = r1.hashCode()
            goto L_0x0017
        L_0x01d6:
            java.lang.String r1 = "LOADING"
            goto L_0x01c2
        L_0x01d9:
            java.lang.String r1 = "SUCCESS"
            goto L_0x01c2
        L_0x01dc:
            java.lang.String r1 = "ERROR"
            goto L_0x01c2
        L_0x01df:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A08(r1, r2)
            java.lang.Object r1 = r4.A00
        L_0x01ed:
            if (r1 != 0) goto L_0x024e
        L_0x01ef:
            r2 = 0
            goto L_0x0017
        L_0x01f2:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
        L_0x01f8:
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
        L_0x01fc:
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r4.A02
            int r3 = X.C41845B3m.A00(r1)
            goto L_0x0017
        L_0x020b:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0017
        L_0x0224:
            java.lang.String r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0E(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0017
        L_0x023d:
            java.lang.String r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0O(r1)
            java.lang.Object r1 = r4.A01
        L_0x0245:
            int r2 = r1.hashCode()
        L_0x0249:
            int r2 = r2 + r3
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
        L_0x024e:
            int r2 = r1.hashCode()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61079JwH.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        r1.append(r0);
        r1.append(r2.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r1.append(')');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a2, code lost:
        return r1.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0086;
                case 10: goto L_0x005e;
                case 13: goto L_0x003b;
                case 20: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "FilteringHeader(sectionHeader="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", selectorType="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0038
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0032;
                case 2: goto L_0x0035;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.String r0 = "RADIO"
        L_0x002c:
            r1.append(r0)
            java.lang.String r0 = ", includedFilters="
            goto L_0x0078
        L_0x0032:
            java.lang.String r0 = "CHECK"
            goto L_0x002c
        L_0x0035:
            java.lang.String r0 = "TOGGLE"
            goto L_0x002c
        L_0x0038:
            java.lang.String r0 = "null"
            goto L_0x002c
        L_0x003b:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "UiState(challengeDuration="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", challengePrizeType="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", challengeCustomPrize="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            goto L_0x0080
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "SoundEffectTrack(name="
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", icon="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", audio="
        L_0x0078:
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
        L_0x0080:
            r0 = 41
            r1.append(r0)
            goto L_0x009e
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Subscription topic:"
            r1.append(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = " qos:"
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
        L_0x009e:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61079JwH.toString():java.lang.String");
    }

    public C61079JwH(C62811Kmn kmn, String str, List list) {
        this.A03 = 15;
        0qQ.A0B(kmn, 3);
        this.A01 = list;
        this.A02 = str;
        this.A00 = kmn;
    }

    public C61079JwH(C69373NkD nkD, String str, List list) {
        this.A03 = 14;
        this.A01 = nkD;
        this.A00 = list;
        this.A02 = str;
    }

    public C61079JwH(C3034368u r2, String str, HashMap hashMap) {
        this.A03 = 28;
        this.A02 = str;
        this.A00 = hashMap;
        this.A01 = r2;
    }

    public C61079JwH(ImageUrl imageUrl, String str, List list) {
        this.A03 = 21;
        this.A02 = str;
        this.A01 = imageUrl;
        this.A00 = list;
    }

    public C61079JwH(String str, List list, Map map) {
        this.A03 = 23;
        this.A01 = list;
        this.A02 = str;
        this.A00 = map;
    }

    public C61079JwH(C381809cM r2, ImageUrl imageUrl, String str) {
        this.A03 = 10;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = imageUrl;
        this.A00 = r2;
    }

    public C61079JwH(MqttSubscribeListener mqttSubscribeListener, C2605346a r3, String str) {
        this.A03 = 0;
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = mqttSubscribeListener;
    }

    public C61079JwH(C61082JwK jwK, ProductTileTextStyleType productTileTextStyleType, String str) {
        this.A03 = 26;
        AnonymousClass7TG.A1U(str, productTileTextStyleType, jwK);
        this.A02 = str;
        this.A00 = productTileTextStyleType;
        this.A01 = jwK;
    }

    public C61079JwH(List list, List list2, String str) {
        this.A03 = 18;
        AnonymousClass7TG.A1U(list, list2, str);
        this.A01 = list;
        this.A00 = list2;
        this.A02 = str;
    }

    public C61079JwH(GTI gti, 1Xj r3, String str) {
        this.A03 = 16;
        this.A01 = r3;
        this.A02 = str;
        this.A00 = gti;
    }

    public C61079JwH(C62743Klh klh, Integer num, String str) {
        this.A03 = 8;
        this.A01 = klh;
        this.A02 = str;
        this.A00 = num;
    }

    public C61079JwH(C62748Klm klm, Integer num, String str) {
        this.A03 = 9;
        this.A01 = num;
        this.A02 = str;
        this.A00 = klm;
    }

    public C61079JwH(C69369Nk9 nk9, C69373NkD nkD, String str) {
        this.A03 = 13;
        this.A00 = nk9;
        this.A01 = nkD;
        this.A02 = str;
    }

    public C61079JwH(XTW xtw, MR1 mr1, String str) {
        this.A03 = 24;
        this.A02 = str;
        this.A01 = mr1;
        this.A00 = xtw;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61079JwH(C60937Jtv jtv) {
        this(jtv.A00, jtv.A03, AnonymousClass7TE.A1I(jtv));
        this.A03 = 21;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61079JwH(String str, List list, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this("", (List) 0sn.A00, (Map) 0Yt.A0E());
        this.A03 = 23;
    }

    public C61079JwH(Integer num, 0sn r5, int i) {
        this.A03 = 4;
        num = (i & 1) != 0 ? AnonymousClass05K.A00 : num;
        r5 = (i & 2) != 0 ? 0sn.A00 : r5;
        this.A03 = 4;
        AnonymousClass7TG.A1O(num, r5);
        this.A01 = num;
        this.A00 = r5;
        this.A02 = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61079JwH() {
        this((Object) null, (Object) null, "", 1);
        this.A03 = 1;
    }

    public C61079JwH(C62320sa r4) {
        this.A03 = 7;
        this.A03 = 7;
        0qQ.A0B(r4, 2);
        this.A02 = "Action";
        this.A01 = r4;
        this.A00 = null;
    }

    public C61079JwH(Integer num, String str, List list, int i) {
        this.A03 = i;
        AnonymousClass7TG.A1U(str, num, list);
        this.A02 = str;
        if (19 - i != 0) {
            this.A01 = num;
            this.A00 = list;
            return;
        }
        this.A00 = num;
        this.A01 = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61079JwH(String str, Long l) {
        this((Object) l, (Object) null, str, 5);
        this.A03 = 5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61079JwH(C62743Klh klh, Integer num) {
        this(klh, num, (String) null);
        this.A03 = 8;
    }

    public C61079JwH(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61079JwH(int r5) {
        /*
            r4 = this;
            r4.A03 = r5
            switch(r5) {
                case 22: goto L_0x004d;
                case 23: goto L_0x003d;
                case 24: goto L_0x0005;
                case 25: goto L_0x000e;
                case 26: goto L_0x0005;
                case 27: goto L_0x0021;
                case 28: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 0
            r0 = 29
        L_0x0008:
            r4.A03 = r0
            r4.<init>((java.lang.Object) r1, (java.lang.Object) r1, (java.lang.String) r1, (int) r0)
            return
        L_0x000e:
            r1 = 0
            r0 = 25
            goto L_0x0008
        L_0x0012:
            r2 = 0
            r0 = 28
            r4.A03 = r0
            java.lang.String r1 = ""
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r4.<init>((X.C3034368u) r2, (java.lang.String) r1, (java.util.HashMap) r0)
            return
        L_0x0021:
            r0 = 0
            r3 = 27
            r4.A03 = r3
            X.KhY r2 = X.C62542KhY.UNKNOWN
            X.K1c r1 = new X.K1c
            r1.<init>()
            r1.A00 = r0
            java.lang.String r0 = ""
            r4.A03 = r3
            r4.<init>()
            r4.A01 = r2
            r4.A00 = r1
            r4.A02 = r0
            return
        L_0x003d:
            r0 = 23
            r4.A03 = r0
            X.0sn r2 = X.0sn.A00
            java.lang.String r1 = ""
            X.0sm r0 = X.0Yt.A0E()
            r4.<init>((java.lang.String) r1, (java.util.List) r2, (java.util.Map) r0)
            return
        L_0x004d:
            r2 = 0
            r1 = 22
            r4.A03 = r1
            java.lang.Integer r0 = X.C51967G9n.A0k()
            r4.<init>((java.lang.Object) r0, (java.lang.Object) r0, (java.lang.String) r2, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61079JwH.<init>(int):void");
    }
}
