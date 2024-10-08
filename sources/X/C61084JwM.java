package X;

import android.graphics.Bitmap;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JwM  reason: case insensitive filesystem */
public final class C61084JwM extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static boolean A04(int i, Object obj) {
        if (!(obj instanceof C61084JwM) || ((C61084JwM) obj).A03 != i) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0178, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x017a, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0180, code lost:
        if (r2.A02 == r3.A02) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01b9, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01bb, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01c5, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01c9, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01d6, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01d8, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e2, code lost:
        if (X.0qQ.A0K(r2.A02, r3.A02) != false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01e6, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f3, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01f5, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01ff, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x020a, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x020c, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x020e, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0216, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0219, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0226, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0228, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0232, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0234, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023c, code lost:
        if (X.0qQ.A0K(r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023e, code lost:
        r1 = r2.A01;
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0246, code lost:
        if (X.0qQ.A0K(r1, r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x026b, code lost:
        r1 = r2.A00;
        r0 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x026f, code lost:
        if (r1 == r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:?, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r1 == r0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0115, code lost:
        if (A04(r0, r3) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0117, code lost:
        r3 = (X.C61084JwM) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0121, code lost:
        if (X.0qQ.A0K(r2.A00, r3.A00) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x012b, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012d, code lost:
        r1 = r2.A02;
        r0 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x003a;
                case 2: goto L_0x000a;
                case 3: goto L_0x0050;
                case 4: goto L_0x0069;
                case 5: goto L_0x000f;
                case 6: goto L_0x0019;
                case 7: goto L_0x006e;
                case 8: goto L_0x0005;
                case 9: goto L_0x0073;
                case 10: goto L_0x0079;
                case 11: goto L_0x007f;
                case 12: goto L_0x0085;
                case 13: goto L_0x008b;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x0091;
                case 17: goto L_0x0097;
                case 18: goto L_0x00ab;
                case 19: goto L_0x00b1;
                case 20: goto L_0x00d5;
                case 21: goto L_0x00da;
                case 22: goto L_0x00e0;
                case 23: goto L_0x00e6;
                case 24: goto L_0x00eb;
                case 25: goto L_0x00f0;
                case 26: goto L_0x00f6;
                case 27: goto L_0x00fc;
                case 28: goto L_0x0202;
                case 29: goto L_0x0102;
                case 30: goto L_0x0108;
                case 31: goto L_0x010d;
                case 32: goto L_0x0133;
                case 33: goto L_0x0151;
                case 34: goto L_0x016b;
                case 35: goto L_0x0170;
                case 36: goto L_0x0184;
                case 37: goto L_0x0189;
                case 38: goto L_0x018e;
                case 39: goto L_0x0193;
                case 40: goto L_0x0198;
                case 41: goto L_0x019d;
                case 42: goto L_0x01a2;
                case 43: goto L_0x01a7;
                case 44: goto L_0x01ac;
                case 45: goto L_0x01b1;
                case 46: goto L_0x01ce;
                case 47: goto L_0x021e;
                case 48: goto L_0x01eb;
                case 49: goto L_0x0249;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x0272
            r0 = 2
            goto L_0x0111
        L_0x000f:
            if (r2 == r3) goto L_0x0272
            r0 = 5
            goto L_0x0206
        L_0x0014:
            if (r2 == r3) goto L_0x0272
            r0 = 0
            goto L_0x01ef
        L_0x0019:
            if (r2 == r3) goto L_0x0272
            r0 = 6
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0269
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x026f
        L_0x003a:
            if (r2 == r3) goto L_0x0272
            r0 = 1
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0269
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0065
        L_0x0050:
            if (r2 == r3) goto L_0x0272
            r0 = 3
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            if (r1 != r0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0065:
            if (r1 == r0) goto L_0x00cf
            goto L_0x0269
        L_0x0069:
            if (r2 == r3) goto L_0x0272
            r0 = 4
            goto L_0x01d2
        L_0x006e:
            if (r2 == r3) goto L_0x0272
            r0 = 7
            goto L_0x0222
        L_0x0073:
            if (r2 == r3) goto L_0x0272
            r0 = 9
            goto L_0x0111
        L_0x0079:
            if (r2 == r3) goto L_0x0272
            r0 = 10
            goto L_0x01d2
        L_0x007f:
            if (r2 == r3) goto L_0x0272
            r0 = 11
            goto L_0x01ef
        L_0x0085:
            if (r2 == r3) goto L_0x0272
            r0 = 12
            goto L_0x01ef
        L_0x008b:
            if (r2 == r3) goto L_0x0272
            r0 = 13
            goto L_0x0111
        L_0x0091:
            if (r2 == r3) goto L_0x0272
            r0 = 16
            goto L_0x01d2
        L_0x0097:
            if (r2 == r3) goto L_0x0272
            r0 = 17
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x01e6
            goto L_0x0269
        L_0x00ab:
            if (r2 == r3) goto L_0x0272
            r0 = 18
            goto L_0x01d2
        L_0x00b1:
            if (r2 == r3) goto L_0x0272
            r0 = 19
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 != r0) goto L_0x0269
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00cf
            goto L_0x0269
        L_0x00cf:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x026f
        L_0x00d5:
            if (r2 == r3) goto L_0x0272
            r0 = 20
            goto L_0x0111
        L_0x00da:
            if (r2 == r3) goto L_0x0272
            r0 = 21
            goto L_0x01b5
        L_0x00e0:
            if (r2 == r3) goto L_0x0272
            r0 = 22
            goto L_0x01d2
        L_0x00e6:
            if (r2 == r3) goto L_0x0272
            r0 = 23
            goto L_0x0111
        L_0x00eb:
            if (r2 == r3) goto L_0x0272
            r0 = 24
            goto L_0x0111
        L_0x00f0:
            if (r2 == r3) goto L_0x0272
            r0 = 25
            goto L_0x01d2
        L_0x00f6:
            if (r2 == r3) goto L_0x0272
            r0 = 26
            goto L_0x0222
        L_0x00fc:
            if (r2 == r3) goto L_0x0272
            r0 = 27
            goto L_0x0222
        L_0x0102:
            if (r2 == r3) goto L_0x0272
            r0 = 29
            goto L_0x01b5
        L_0x0108:
            if (r2 == r3) goto L_0x0272
            r0 = 30
            goto L_0x0111
        L_0x010d:
            if (r2 == r3) goto L_0x0272
            r0 = 31
        L_0x0111:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            goto L_0x0242
        L_0x0133:
            if (r2 == r3) goto L_0x0272
            r0 = 32
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x026b
            goto L_0x0269
        L_0x0151:
            if (r2 == r3) goto L_0x0272
            r0 = 33
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 != r0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x0219
            goto L_0x0269
        L_0x016b:
            if (r2 == r3) goto L_0x0272
            r0 = 34
            goto L_0x0174
        L_0x0170:
            if (r2 == r3) goto L_0x0272
            r0 = 35
        L_0x0174:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            if (r1 == r0) goto L_0x01c9
            goto L_0x0269
        L_0x0184:
            if (r2 == r3) goto L_0x0272
            r0 = 36
            goto L_0x01ef
        L_0x0189:
            if (r2 == r3) goto L_0x0272
            r0 = 37
            goto L_0x01b5
        L_0x018e:
            if (r2 == r3) goto L_0x0272
            r0 = 38
            goto L_0x01d2
        L_0x0193:
            if (r2 == r3) goto L_0x0272
            r0 = 39
            goto L_0x01b5
        L_0x0198:
            if (r2 == r3) goto L_0x0272
            r0 = 40
            goto L_0x01d2
        L_0x019d:
            if (r2 == r3) goto L_0x0272
            r0 = 41
            goto L_0x01ef
        L_0x01a2:
            if (r2 == r3) goto L_0x0272
            r0 = 42
            goto L_0x01d2
        L_0x01a7:
            if (r2 == r3) goto L_0x0272
            r0 = 43
            goto L_0x01d2
        L_0x01ac:
            if (r2 == r3) goto L_0x0272
            r0 = 44
            goto L_0x01b5
        L_0x01b1:
            if (r2 == r3) goto L_0x0272
            r0 = 45
        L_0x01b5:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01c9
            goto L_0x0269
        L_0x01c9:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0238
        L_0x01ce:
            if (r2 == r3) goto L_0x0272
            r0 = 46
        L_0x01d2:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x01e6
            goto L_0x0269
        L_0x01e6:
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            goto L_0x0212
        L_0x01eb:
            if (r2 == r3) goto L_0x0272
            r0 = 48
        L_0x01ef:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x020e
            goto L_0x0269
        L_0x0202:
            if (r2 == r3) goto L_0x0272
            r0 = 28
        L_0x0206:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
        L_0x020e:
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0212:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0219
            goto L_0x0269
        L_0x0219:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            goto L_0x0242
        L_0x021e:
            if (r2 == r3) goto L_0x0272
            r0 = 47
        L_0x0222:
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
        L_0x0238:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
        L_0x0242:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0272
            goto L_0x0269
        L_0x0249:
            if (r2 == r3) goto L_0x0272
            r0 = 49
            boolean r0 = A04(r0, r3)
            if (r0 == 0) goto L_0x0269
            X.JwM r3 = (X.C61084JwM) r3
            java.lang.Object r1 = r2.A02
            java.lang.Object r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0269
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x026b
        L_0x0269:
            r0 = 0
            return r0
        L_0x026b:
            java.lang.Object r1 = r2.A00
            java.lang.Object r0 = r3.A00
        L_0x026f:
            if (r1 == r0) goto L_0x0272
            goto L_0x0269
        L_0x0272:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x032e, code lost:
        if (r1 != null) goto L_0x0342;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0330, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0340, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0342, code lost:
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0347, code lost:
        return r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013a, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013c, code lost:
        r2 = (r2 + X.AnonymousClass7TG.A0C(r1)) * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0191, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0193, code lost:
        if (r1 != null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0195, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        r1 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a5, code lost:
        r3 = (r2 + r1) * 31;
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021f, code lost:
        r3 = X.AnonymousClass7TE.A0L(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x022f, code lost:
        r2 = (r2 + X.AnonymousClass7TG.A0C(r1)) * 31;
        r3 = X.AnonymousClass7TE.A0L(r4.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0271, code lost:
        r3 = X.AnonymousClass7TF.A07(r1, r2);
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ab, code lost:
        r3 = X.AnonymousClass7TF.A07(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d7, code lost:
        r2 = X.C51966G9m.A04(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r4 = this;
            int r1 = r4.A03
            switch(r1) {
                case 0: goto L_0x0320;
                case 1: goto L_0x02fa;
                case 2: goto L_0x02e2;
                case 3: goto L_0x02b1;
                case 4: goto L_0x02a3;
                case 5: goto L_0x029b;
                case 6: goto L_0x0279;
                case 7: goto L_0x0267;
                case 8: goto L_0x0005;
                case 9: goto L_0x0257;
                case 10: goto L_0x0247;
                case 11: goto L_0x023e;
                case 12: goto L_0x0225;
                case 13: goto L_0x020c;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                case 16: goto L_0x005f;
                case 17: goto L_0x01fe;
                case 18: goto L_0x01f0;
                case 19: goto L_0x01bc;
                case 20: goto L_0x01ac;
                case 21: goto L_0x018b;
                case 22: goto L_0x0176;
                case 23: goto L_0x0161;
                case 24: goto L_0x0151;
                case 25: goto L_0x0147;
                case 26: goto L_0x0134;
                case 27: goto L_0x0197;
                case 28: goto L_0x012c;
                case 29: goto L_0x0121;
                case 30: goto L_0x0108;
                case 31: goto L_0x00f3;
                case 32: goto L_0x00ce;
                case 33: goto L_0x00b0;
                case 34: goto L_0x007d;
                case 35: goto L_0x0096;
                case 36: goto L_0x0332;
                case 37: goto L_0x0055;
                case 38: goto L_0x005f;
                case 39: goto L_0x0073;
                case 40: goto L_0x005f;
                case 41: goto L_0x0069;
                case 42: goto L_0x005f;
                case 43: goto L_0x005f;
                case 44: goto L_0x0055;
                case 45: goto L_0x0045;
                case 46: goto L_0x0032;
                case 47: goto L_0x0028;
                case 48: goto L_0x001a;
                case 49: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r3 = super.hashCode()
            return r3
        L_0x000a:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            goto L_0x0340
        L_0x001a:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            goto L_0x0340
        L_0x0028:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            goto L_0x013a
        L_0x0032:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TE.A0L(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            goto L_0x0340
        L_0x0045:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x032e
        L_0x0055:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x0271
        L_0x005f:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x02ab
        L_0x0069:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            goto L_0x02ab
        L_0x0073:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A00
            goto L_0x0271
        L_0x007d:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0090;
                case 2: goto L_0x0093;
                default: goto L_0x0086;
            }
        L_0x0086:
            java.lang.String r1 = "Initial"
        L_0x0088:
            int r2 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x01a1
        L_0x0090:
            java.lang.String r1 = "Loading"
            goto L_0x0088
        L_0x0093:
            java.lang.String r1 = "Success"
            goto L_0x0088
        L_0x0096:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00ad;
                default: goto L_0x009f;
            }
        L_0x009f:
            java.lang.String r1 = "Initial"
        L_0x00a1:
            int r2 = X.C51968G9o.A0F(r1, r2)
            goto L_0x0191
        L_0x00a7:
            java.lang.String r1 = "Loading"
            goto L_0x00a1
        L_0x00aa:
            java.lang.String r1 = "Failed"
            goto L_0x00a1
        L_0x00ad:
            java.lang.String r1 = "Success"
            goto L_0x00a1
        L_0x00b0:
            java.lang.Object r1 = r4.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = X.C63246Ktr.A00(r1)
            int r3 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00cb
            java.lang.String r1 = "IN_PROGRESS"
        L_0x00c5:
            int r3 = X.C51971G9r.A0F(r1, r2, r3)
            goto L_0x0340
        L_0x00cb:
            java.lang.String r1 = "DONE"
            goto L_0x00c5
        L_0x00ce:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = X.C63246Ktr.A00(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x00f0
            java.lang.String r1 = "IN_PROGRESS"
        L_0x00ea:
            int r2 = X.C51966G9m.A04(r1, r2)
            goto L_0x0346
        L_0x00f0:
            java.lang.String r1 = "DONE"
            goto L_0x00ea
        L_0x00f3:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            goto L_0x021f
        L_0x0108:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0346
        L_0x0121:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x013c
        L_0x012c:
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0K(r1)
            goto L_0x0340
        L_0x0134:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
        L_0x013a:
            java.lang.Object r1 = r4.A02
        L_0x013c:
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A01
            goto L_0x021f
        L_0x0147:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            goto L_0x022f
        L_0x0151:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            goto L_0x0342
        L_0x0161:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TE.A0L(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A02
            goto L_0x0342
        L_0x0176:
            java.lang.Object r1 = r4.A02
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            goto L_0x021f
        L_0x018b:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
        L_0x0191:
            java.lang.Object r1 = r4.A00
            if (r1 != 0) goto L_0x01a1
            r1 = 0
            goto L_0x01a5
        L_0x0197:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A02
        L_0x01a1:
            int r1 = r1.hashCode()
        L_0x01a5:
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A01
            goto L_0x0342
        L_0x01ac:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            goto L_0x0342
        L_0x01bc:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x01de;
                case 2: goto L_0x01e1;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            java.lang.String r1 = "CANCEL"
        L_0x01c7:
            int r2 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x01e4;
                case 2: goto L_0x01e8;
                case 3: goto L_0x01ec;
                default: goto L_0x01da;
            }
        L_0x01da:
            java.lang.String r1 = "GENERATED_IMAGE_REPORTING_MENU"
            goto L_0x02d7
        L_0x01de:
            java.lang.String r1 = "BACK_CHEVRON"
            goto L_0x01c7
        L_0x01e1:
            java.lang.String r1 = "NONE"
            goto L_0x01c7
        L_0x01e4:
            java.lang.String r1 = "DONE"
            goto L_0x02d7
        L_0x01e8:
            java.lang.String r1 = "X_BACK_BUTTON"
            goto L_0x02d7
        L_0x01ec:
            java.lang.String r1 = "NONE"
            goto L_0x02d7
        L_0x01f0:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            goto L_0x0340
        L_0x01fe:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            goto L_0x0340
        L_0x020c:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
        L_0x021f:
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0346
        L_0x0225:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A02
        L_0x022f:
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A00
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0346
        L_0x023e:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            goto L_0x02ab
        L_0x0247:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
            goto L_0x032e
        L_0x0257:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A02
            goto L_0x032e
        L_0x0267:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A02
        L_0x0271:
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            goto L_0x0342
        L_0x0279:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            switch(r2) {
                case 1: goto L_0x0295;
                case 2: goto L_0x0298;
                default: goto L_0x028e;
            }
        L_0x028e:
            r1 = 593(0x251, float:8.31E-43)
            java.lang.String r1 = X.Pxd.A00(r1)
            goto L_0x02d7
        L_0x0295:
            java.lang.String r1 = "FULL_ACCESS"
            goto L_0x02d7
        L_0x0298:
            java.lang.String r1 = "UNSPECIFIED"
            goto L_0x02d7
        L_0x029b:
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0K(r1)
            goto L_0x0340
        L_0x02a3:
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A01
        L_0x02ab:
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            goto L_0x0340
        L_0x02b1:
            java.lang.Object r1 = r4.A00
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x02df
            java.lang.String r1 = "Usage"
        L_0x02bc:
            int r3 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r2 = r4.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r1 = X.S8H.A01(r2)
            int r3 = X.AnonymousClass7TG.A0B(r2, r1, r3)
            java.lang.Object r1 = r4.A02
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x02dc
            java.lang.String r1 = "Bottomsheet"
        L_0x02d7:
            int r2 = X.C51966G9m.A04(r1, r2)
            goto L_0x0346
        L_0x02dc:
            java.lang.String r1 = "SoftKeyboard"
            goto L_0x02d7
        L_0x02df:
            java.lang.String r1 = "Save"
            goto L_0x02bc
        L_0x02e2:
            java.lang.Object r1 = r4.A00
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TE.A0L(r1)
            goto L_0x0346
        L_0x02fa:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0M(r1)
            r0 = 1
            if (r0 == r2) goto L_0x031d
            java.lang.String r1 = "VERIFIED"
        L_0x0305:
            int r2 = X.C51968G9o.A0F(r1, r2)
            java.lang.Object r1 = r4.A00
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = X.C62969KpL.A00(r1)
            int r2 = r2 + r1
            int r3 = r2 * 31
            java.lang.Object r1 = r4.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = X.C62969KpL.A00(r1)
            goto L_0x0346
        L_0x031d:
            java.lang.String r1 = "NOT_VERIFIED"
            goto L_0x0305
        L_0x0320:
            java.lang.Object r1 = r4.A01
            int r2 = X.AnonymousClass7TE.A0K(r1)
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
            java.lang.Object r1 = r4.A00
        L_0x032e:
            if (r1 != 0) goto L_0x0342
            r2 = 0
            goto L_0x0346
        L_0x0332:
            java.lang.Object r1 = r4.A01
            int r1 = X.AnonymousClass7TG.A0C(r1)
            int r2 = r1 * 31
            java.lang.Object r1 = r4.A02
            int r3 = X.AnonymousClass7TF.A07(r1, r2)
        L_0x0340:
            java.lang.Object r1 = r4.A00
        L_0x0342:
            int r2 = r1.hashCode()
        L_0x0346:
            int r3 = r3 + r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00bb, code lost:
        r1.append(r0);
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c4, code lost:
        return X.AnonymousClass7TG.A0n(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0080, code lost:
        r1.append(r0);
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            int r0 = r2.A03
            switch(r0) {
                case 5: goto L_0x000a;
                case 13: goto L_0x001f;
                case 15: goto L_0x0043;
                case 22: goto L_0x0066;
                case 26: goto L_0x0086;
                case 37: goto L_0x00a1;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "FloatingGridViewModel(items="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x0080
        L_0x001f:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Triplet(first="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            r0 = 82
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", third="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            goto L_0x00c0
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ClipsVoiceoverSegmentUpdates(snippetStartTimeMs="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            r0 = 2047(0x7ff, float:2.868E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            r0 = 2013(0x7dd, float:2.821E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0080
        L_0x0066:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ReelXpostContentEligibilityState(xpostContentFeatureState="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", xarContentEligibilityState="
            r1.append(r0)
            java.lang.Object r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ", ccpContentEligibilityState="
        L_0x0080:
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            goto L_0x00c0
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ContentFields(contentImageUrl="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", title="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", subtitle="
            goto L_0x00bb
        L_0x00a1:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "BoostUpsellBannerUiAction(shouldHideBanner="
            r1.append(r0)
            java.lang.Object r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = ", getBannerPayload="
            r1.append(r0)
            java.lang.Object r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = ", getMediaId="
        L_0x00bb:
            r1.append(r0)
            java.lang.Object r0 = r2.A01
        L_0x00c0:
            java.lang.String r0 = X.AnonymousClass7TG.A0n(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.toString():java.lang.String");
    }

    public static final C61084JwM A00(C61060Jvy jvy, Integer num, List list) {
        DbY.A1S(num, list);
        return new C61084JwM(jvy, num, list);
    }

    public static final C61084JwM A01(QP8 qp8, List list, List list2) {
        AnonymousClass7TG.A1O(list, list2);
        return new C61084JwM(qp8, list, list2);
    }

    public static final C61084JwM A02(OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C62520KhB khB) {
        AnonymousClass7TG.A1O(opalProfileData2, khB);
        return new C61084JwM(opalProfileData, opalProfileData2, khB);
    }

    public static final C61084JwM A03(Integer num, Integer num2, List list) {
        AnonymousClass7TG.A1T(list, num, num2);
        return new C61084JwM(list, num, num2, 32);
    }

    public C61084JwM(AnonymousClass4OA r2, Integer num, List list) {
        this.A03 = 6;
        AnonymousClass7TG.A1P(r2, num);
        this.A00 = r2;
        this.A02 = list;
        this.A01 = num;
    }

    public C61084JwM(C47194Dsg dsg, List list, List list2) {
        this.A03 = 9;
        AnonymousClass7TG.A1O(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = dsg;
    }

    public C61084JwM(N49 n49, C61037Jvb jvb, List list) {
        this.A03 = 23;
        0qQ.A0B(list, 3);
        this.A00 = jvb;
        this.A01 = n49;
        this.A02 = list;
    }

    public C61084JwM(X8K x8k, X8K x8k2, List list) {
        this.A03 = 8;
        0qQ.A0B(x8k, 1);
        this.A00 = x8k;
        this.A02 = x8k2;
        this.A01 = list;
    }

    public C61084JwM(I12 i12, C55638Hkx hkx, YCQ ycq) {
        this.A03 = 20;
        AnonymousClass7TG.A1U(i12, hkx, ycq);
        this.A00 = i12;
        this.A01 = hkx;
        this.A02 = ycq;
    }

    public C61084JwM(C59496JLu jLu, Integer num, Integer num2) {
        this.A03 = 19;
        AnonymousClass7TG.A1U(num, jLu, num2);
        this.A01 = num;
        this.A00 = jLu;
        this.A02 = num2;
    }

    public C61084JwM(Set set, Set set2, Set set3) {
        this.A03 = 11;
        AnonymousClass7TG.A1U(set, set2, set3);
        this.A01 = set;
        this.A02 = set2;
        this.A00 = set3;
    }

    public C61084JwM(Bitmap bitmap, C60975JuX juX, C62498Kgo kgo) {
        this.A03 = 17;
        AnonymousClass7TG.A1U(kgo, bitmap, juX);
        this.A02 = kgo;
        this.A01 = bitmap;
        this.A00 = juX;
    }

    public C61084JwM(AnonymousClass2DO r2, C62320sa r3, C62320sa r4) {
        this.A03 = 45;
        0qQ.A0B(r3, 2);
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public C61084JwM(C66399MQf mQf, C66399MQf mQf2, Object obj) {
        this.A03 = 48;
        0qQ.A0B(mQf, 1);
        this.A01 = mQf;
        this.A02 = mQf2;
        this.A00 = obj;
    }

    public C61084JwM(OpalProfileData opalProfileData, OpalProfileData opalProfileData2, C62520KhB khB) {
        this.A03 = 49;
        this.A02 = opalProfileData;
        this.A01 = opalProfileData2;
        this.A00 = khB;
    }

    public C61084JwM(List list, Integer num, Integer num2, int i) {
        this.A03 = 32;
        this.A02 = list;
        this.A01 = num;
        this.A00 = num2;
    }

    public C61084JwM(C62320sa r2, C62320sa r3, 0sL r4) {
        this.A03 = 44;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public C61084JwM(Integer num, List list, List list2) {
        this.A03 = 34;
        this.A02 = num;
        this.A00 = list;
        this.A01 = list2;
    }

    public C61084JwM(C61060Jvy jvy, Integer num, List list) {
        this.A03 = 35;
        this.A02 = num;
        this.A00 = jvy;
        this.A01 = list;
    }

    public C61084JwM(Bitmap bitmap, List list, List list2) {
        this.A03 = 21;
        this.A02 = list;
        this.A00 = bitmap;
        this.A01 = list2;
    }

    public C61084JwM(QP8 qp8, List list, List list2) {
        this.A03 = 27;
        this.A00 = qp8;
        this.A02 = list;
        this.A01 = list2;
    }

    public C61084JwM(ImageUrl imageUrl, CharSequence charSequence, CharSequence charSequence2) {
        this.A03 = 26;
        this.A00 = imageUrl;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }

    public C61084JwM(List list, List list2, Map map) {
        this.A03 = 24;
        this.A00 = list;
        this.A01 = map;
        this.A02 = list2;
    }

    public C61084JwM(C61065Jw3 jw3, C61057Jvv jvv, List list) {
        this.A03 = 46;
        this.A02 = jvv;
        this.A01 = jw3;
        this.A00 = list;
    }

    public C61084JwM(N4R n4r, 1Xj r3, AnonymousClass3W1 r4) {
        this.A03 = 36;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = n4r;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(com.instagram.opal.impl.data.OpalProfileData r15, com.instagram.opal.impl.data.OpalProfileData r16, X.C62520KhB r17, kotlin.jvm.internal.DefaultConstructorMarker r18, int r19, int r20) {
        /*
            r14 = this;
            r0 = 49
            r14.A03 = r0
            r6 = 0
            r10 = 1
            java.lang.String r2 = ""
            r9 = 0
            X.KhB r1 = X.C62520KhB.Uninitialized
            X.0sn r8 = X.0sn.A00
            com.instagram.opal.impl.data.OpalProfileData r0 = new com.instagram.opal.impl.data.OpalProfileData
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r11 = r9
            r12 = r9
            r13 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.<init>((com.instagram.opal.impl.data.OpalProfileData) r6, (com.instagram.opal.impl.data.OpalProfileData) r0, (X.C62520KhB) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(com.instagram.opal.impl.data.OpalProfileData, com.instagram.opal.impl.data.OpalProfileData, X.KhB, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(C266444Yx r4, C266444Yx r5, Integer num, int i) {
        this(25, (Object) (i & 4) != 0 ? null : num, (Object) (i & 2) != 0 ? null : r5, (Object) r4);
        this.A03 = 25;
    }

    public C61084JwM(QOv qOv, List list, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 4;
        0sn r2 = 0sn.A00;
        QOv qOv2 = new QOv(r2, false);
        0sm A0E = 0Yt.A0E();
        this.A03 = 4;
        AnonymousClass7TG.A1P(r2, A0E);
        this.A02 = r2;
        this.A01 = qOv2;
        this.A00 = A0E;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(C61060Jvy jvy, Integer num, List list, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((C61060Jvy) null, AnonymousClass05K.A00, (List) 0sn.A00);
        this.A03 = 35;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(C59496JLu jLu, Integer num, Integer num2, int i) {
        this((i & 2) != 0 ? IQN.A00 : jLu, (i & 1) != 0 ? AnonymousClass05K.A0C : num, (i & 4) != 0 ? AnonymousClass05K.A0N : num2);
        this.A03 = 19;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(X.QP8 r3, java.util.List r4, java.util.List r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8) {
        /*
            r2 = this;
            r0 = 27
            r2.A03 = r0
            r1 = 0
            X.0sn r0 = X.0sn.A00
            r2.<init>((X.QP8) r1, (java.util.List) r0, (java.util.List) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(X.QP8, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(X8K x8k) {
        this(x8k, (X8K) null, (List) 0sn.A00);
        this.A03 = 8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM() {
        /*
            r2 = this;
            r0 = 21
            r2.A03 = r0
            X.0sn r1 = X.0sn.A00
            r0 = 0
            r2.<init>((android.graphics.Bitmap) r0, (java.util.List) r1, (java.util.List) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>():void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(X.C62320sa r4, X.C62320sa r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r1 = 16
            r3.A03 = r1
            r0 = r6 & 1
            if (r0 == 0) goto L_0x000b
            X.MKU r4 = X.MKU.A00
        L_0x000b:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0011
            X.MKV r5 = X.MKV.A00
        L_0x0011:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0017
            X.MKW r2 = X.MKW.A00
        L_0x0017:
            r3.<init>((X.C62320sa) r4, (X.C62320sa) r5, (X.C62320sa) r2, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(X.0sa, X.0sa, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(java.lang.Integer r4, X.0sn r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r1 = 33
            r3.A03 = r1
            r0 = r6 & 1
            if (r0 == 0) goto L_0x000b
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
        L_0x000b:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x0011
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x0011:
            r0 = r6 & 4
            if (r0 == 0) goto L_0x0017
            X.0sn r5 = X.0sn.A00
        L_0x0017:
            r3.<init>((java.lang.Integer) r4, (java.lang.Integer) r2, (java.util.List) r5, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(java.lang.Integer, java.util.List, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(java.lang.Integer r3, java.util.List r4, java.util.List r5, kotlin.jvm.internal.DefaultConstructorMarker r6, int r7, int r8) {
        /*
            r2 = this;
            r0 = 34
            r2.A03 = r0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.0sn r0 = X.0sn.A00
            r2.<init>((java.lang.Integer) r1, (java.util.List) r0, (java.util.List) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(java.lang.Integer, java.util.List, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(List list, List list2, Map map, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(list, (List) 0sn.A00, (Map) 0Yt.A0E());
        this.A03 = 24;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61084JwM(java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, kotlin.jvm.internal.DefaultConstructorMarker r7, int r8, int r9) {
        /*
            r3 = this;
            r2 = 1
            r3.A03 = r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.<init>((java.lang.Integer) r1, (java.lang.Integer) r0, (java.lang.Integer) r0, (int) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61084JwM.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(Integer num) {
        this((List) 0sn.A00, num, AnonymousClass05K.A01, 32);
        this.A03 = 32;
    }

    public C61084JwM(B39 b39, C317876nz r4) {
        this.A03 = 10;
        0qQ.A0B(r4, 2);
        this.A02 = b39;
        this.A01 = r4;
        this.A00 = null;
    }

    public C61084JwM(UserSession userSession, Capabilities capabilities) {
        this.A03 = 28;
        AnonymousClass7TG.A1O(userSession, capabilities);
        this.A02 = userSession;
        this.A00 = capabilities;
        this.A01 = AnonymousClass0eN.A01(new C73928Pm8(this, 19));
    }

    public C61084JwM(Integer num, Integer num2, List list, int i) {
        this.A03 = i;
        if (33 - i != 0) {
            this.A00 = num;
            this.A02 = num2;
            this.A01 = list;
            return;
        }
        AnonymousClass7TG.A1U(num, num2, list);
        this.A02 = num;
        this.A01 = num2;
        this.A00 = list;
    }

    public C61084JwM(C62320sa r1, C62320sa r2, C62320sa r3, int i) {
        this.A03 = i;
        switch (i) {
            case 16:
                AnonymousClass7TG.A1U(r1, r2, r3);
                break;
            case 37:
                this.A02 = r1;
                this.A00 = r2;
                this.A01 = r3;
                return;
        }
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public C61084JwM(Integer num, Integer num2, Integer num3, int i) {
        this.A03 = i;
        switch (i) {
            case 1:
                AnonymousClass7TG.A1U(num, num2, num3);
                this.A01 = num;
                this.A00 = num2;
                break;
            case 3:
                AnonymousClass7TG.A1U(num, num2, num3);
                this.A00 = num;
                this.A01 = num2;
                break;
            default:
                this.A01 = num;
                this.A02 = num2;
                this.A00 = num3;
                return;
        }
        this.A02 = num3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(C61073JwB jwB, C61073JwB jwB2, C61073JwB jwB3, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(2, (Object) null, (Object) null, (Object) null);
        this.A03 = 2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61084JwM(AnonymousClass2DO r2, C62320sa r3) {
        this(r2, r3, (C62320sa) null);
        this.A03 = 45;
    }

    public C61084JwM(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public C61084JwM(Long l, Map map, Map map2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A03 = 0;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        this.A03 = 0;
        this.A01 = A1H;
        this.A02 = A1H2;
        this.A00 = null;
    }

    public C61084JwM(List list) {
        this.A03 = 5;
        C59721JVf jVf = new C59721JVf(new N4M((GridSelfViewLocation) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (Object) null, 32511, true, false, false, false), (0sP) C73601Pgc.A00);
        this.A03 = 5;
        List list2 = list;
        0qQ.A0B(list2, 1);
        this.A02 = list2;
        this.A00 = jVf;
        this.A01 = AnonymousClass0eN.A01(new C73912Pln(this, 23));
    }
}
