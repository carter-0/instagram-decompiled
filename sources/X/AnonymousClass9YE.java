package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.9YE  reason: invalid class name */
public final class AnonymousClass9YE extends 2YL {
    public C3503284f A00;
    public C279284yO A01;
    public C3499582p A02;
    public C3499482o A03;
    public C351968Bd A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final UserSession A0J;
    public final AnonymousClass8B2 A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final AnonymousClass0Ud A0N;
    public final C3499582p A0O;
    public final Set A0P;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0215, code lost:
        if (r0 != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0217, code lost:
        r0 = r11.A03.A01.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x022b, code lost:
        if (r11.A03.A01.A0M == false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0245, code lost:
        if (r0.A0F != true) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0282, code lost:
        if (r1.A0J == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x030f, code lost:
        if (r1.A0D() != false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0335, code lost:
        if (X.C305756Jk.A00(r0) != false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0337, code lost:
        r0 = r11.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0352, code lost:
        if (r0.booleanValue() != false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0364, code lost:
        if (r1.A13 != false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x036a, code lost:
        if (r11.A01 == X.AnonymousClass9QA.A00) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x039e, code lost:
        if (r11.A01() != false) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03a0, code lost:
        r0 = r11.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03a4, code lost:
        if (r0 != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03e2, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0413, code lost:
        r5 = r11.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0417, code lost:
        r5 = r11.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (X.C355098Oo.A07(r11.A03) != false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        r0 = r11.A03.A01.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r11.A03.A01.A0M == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r0.A0F != true) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (r11.A02() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r0 = X.AnonymousClass7TF.A1W(r11.A02.A01, X.28D.A2D);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (r11.A01() != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010c, code lost:
        r0 = r11.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0141, code lost:
        if (r0 != false) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0150, code lost:
        if (r0 == false) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.AnonymousClass9YE r11, boolean r12) {
        /*
            X.0Ud r6 = r11.A0N
            java.lang.Object r0 = r6.getValue()
            X.9PK r0 = (X.AnonymousClass9PK) r0
            java.util.List r0 = r0.A04
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0012:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0420
            java.lang.Object r3 = r10.next()
            X.JwK r3 = (X.C61082JwK) r3
            java.lang.Object r0 = r6.getValue()
            X.9PK r0 = (X.AnonymousClass9PK) r0
            java.lang.Integer r0 = r0.A03
            int r1 = r0.intValue()
            r2 = 1
            r0 = 0
            if (r1 == r0) goto L_0x015f
            if (r1 == r2) goto L_0x0155
            r0 = 2
            if (r1 == r0) goto L_0x005b
            r0 = 3
            if (r1 != r0) goto L_0x041b
            boolean r5 = r3.A01
        L_0x0038:
            if (r12 == 0) goto L_0x0059
            java.util.Set r1 = r11.A0P
            java.lang.Object r0 = r3.A00
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
        L_0x0046:
            java.lang.Object r1 = r3.A00
            X.9st r1 = (X.C391399st) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.JwK r0 = new X.JwK
            r0.<init>((X.C391399st) r1, (boolean) r2)
            r4.add(r0)
            goto L_0x0012
        L_0x0057:
            r2 = 0
            goto L_0x0046
        L_0x0059:
            r2 = r5
            goto L_0x0046
        L_0x005b:
            java.lang.Object r0 = r3.A00
            X.9st r0 = (X.C391399st) r0
            int r1 = r0.ordinal()
            r5 = 0
            if (r1 == r5) goto L_0x0117
            r0 = 27
            if (r1 == r0) goto L_0x0111
            r0 = 21
            if (r1 == r0) goto L_0x0131
            switch(r1) {
                case 4: goto L_0x0144;
                case 5: goto L_0x00d9;
                case 6: goto L_0x0417;
                case 7: goto L_0x00d6;
                case 8: goto L_0x00ad;
                case 9: goto L_0x0413;
                case 10: goto L_0x009e;
                case 11: goto L_0x0071;
                case 12: goto L_0x0084;
                case 13: goto L_0x007b;
                case 14: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0038
        L_0x0072:
            X.82o r0 = r11.A03
            boolean r0 = X.C355098Oo.A07(r0)
            if (r0 == 0) goto L_0x0038
            goto L_0x00cb
        L_0x007b:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0038
            boolean r0 = r11.A02()
            goto L_0x0094
        L_0x0084:
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0038
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
        L_0x0094:
            if (r0 != 0) goto L_0x0038
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            goto L_0x0150
        L_0x009e:
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0038
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0038
            goto L_0x010c
        L_0x00ad:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            if (r0 == 0) goto L_0x00c5
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.A0F
            if (r0 != r2) goto L_0x0038
        L_0x00c5:
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0038
        L_0x00cb:
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            goto L_0x0150
        L_0x00d6:
            boolean r0 = r11.A0E
            goto L_0x0150
        L_0x00d9:
            boolean r0 = r11.A02()
            if (r0 != 0) goto L_0x0038
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 != 0) goto L_0x0038
            X.82o r0 = r11.A03
            X.82Y r1 = r0.A01
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x0038
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x0038
            android.content.Context r0 = r11.A0I
            X.0qQ.A06(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0038
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x0038
        L_0x010c:
            boolean r0 = r11.A03()
            goto L_0x0150
        L_0x0111:
            com.instagram.common.session.UserSession r5 = r11.A0J
            X.80M r1 = X.AnonymousClass80M.A00
            goto L_0x0407
        L_0x0117:
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r8 = r11.A0J
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316800346231438(0x8105f00004128e, double:3.030229002749481E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            goto L_0x0141
        L_0x0131:
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x0038
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x0152
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x0152
            boolean r0 = r11.A0F
        L_0x0141:
            if (r0 == 0) goto L_0x0038
            goto L_0x0152
        L_0x0144:
            X.82o r0 = r11.A03
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r11.A05()
        L_0x0150:
            if (r0 != 0) goto L_0x0038
        L_0x0152:
            r5 = 1
            goto L_0x0038
        L_0x0155:
            java.lang.Object r0 = r3.A00
            X.9st r0 = (X.C391399st) r0
            boolean r5 = r11.A08(r0)
            goto L_0x0038
        L_0x015f:
            java.lang.Object r0 = r3.A00
            X.9st r0 = (X.C391399st) r0
            int r0 = r0.ordinal()
            r5 = 1
            switch(r0) {
                case 0: goto L_0x024d;
                case 1: goto L_0x03a8;
                case 2: goto L_0x040f;
                case 3: goto L_0x0312;
                case 4: goto L_0x0303;
                case 5: goto L_0x036d;
                case 6: goto L_0x0417;
                case 7: goto L_0x0249;
                case 8: goto L_0x022f;
                case 9: goto L_0x0413;
                case 10: goto L_0x021f;
                case 11: goto L_0x016b;
                case 12: goto L_0x0205;
                case 13: goto L_0x01fc;
                case 14: goto L_0x01e8;
                case 15: goto L_0x016b;
                case 16: goto L_0x016b;
                case 17: goto L_0x01d8;
                case 18: goto L_0x01c8;
                case 19: goto L_0x01b8;
                case 20: goto L_0x0268;
                case 21: goto L_0x016e;
                case 22: goto L_0x016b;
                case 23: goto L_0x016b;
                case 24: goto L_0x016b;
                case 25: goto L_0x016b;
                case 26: goto L_0x016b;
                case 27: goto L_0x0403;
                case 28: goto L_0x0180;
                case 29: goto L_0x03f5;
                case 30: goto L_0x016b;
                case 31: goto L_0x03e6;
                default: goto L_0x016b;
            }
        L_0x016b:
            r5 = 0
            goto L_0x0038
        L_0x016e:
            boolean r0 = r11.A0C
            if (r0 != 0) goto L_0x016b
            boolean r0 = r11.A07()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x0038
            boolean r0 = r11.A0F
            goto L_0x03e2
        L_0x0180:
            X.82o r0 = r11.A03
            X.8nd r1 = r0.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x016b
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.8Cl r0 = r0.A03()
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.A0E()
            if (r0 != r2) goto L_0x019b
            goto L_0x016b
        L_0x019b:
            com.instagram.common.session.UserSession r8 = r11.A0J
            X.0Tu r7 = X.0Tu.A05
            r0 = 36329504859242656(0x81117e000040a0, double:3.038263387934743E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x016b
            X.8B2 r0 = r11.A0K
            X.05G r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x03e2
        L_0x01b8:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x016b
            X.8pt r1 = X.C366918pt.A00
            com.instagram.common.session.UserSession r0 = r11.A0J
            boolean r0 = r1.A03(r0)
            goto L_0x03e2
        L_0x01c8:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x016b
            X.8pt r1 = X.C366918pt.A00
            com.instagram.common.session.UserSession r0 = r11.A0J
            boolean r0 = r1.A01(r0)
            goto L_0x03e2
        L_0x01d8:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x016b
            X.8pt r1 = X.C366918pt.A00
            com.instagram.common.session.UserSession r0 = r11.A0J
            boolean r0 = r1.A02(r0)
            goto L_0x03e2
        L_0x01e8:
            X.82o r0 = r11.A03
            boolean r0 = X.C355098Oo.A07(r0)
            if (r0 == 0) goto L_0x016b
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            goto L_0x03a4
        L_0x01fc:
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x016b
            boolean r0 = r11.A06()
            goto L_0x0215
        L_0x0205:
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x016b
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
        L_0x0215:
            if (r0 != 0) goto L_0x016b
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            goto L_0x03a4
        L_0x021f:
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x016b
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x016b
            goto L_0x03a0
        L_0x022f:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            if (r0 == 0) goto L_0x0038
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.802 r0 = r0.A02()
            if (r0 == 0) goto L_0x016b
            boolean r0 = r0.A0F
            if (r0 != r2) goto L_0x016b
            goto L_0x0038
        L_0x0249:
            boolean r0 = r11.A0E
            goto L_0x03a4
        L_0x024d:
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r11.A02()
            if (r0 == 0) goto L_0x016b
            com.instagram.common.session.UserSession r8 = r11.A0J
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316800346231438(0x8105f00004128e, double:3.030229002749481E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            goto L_0x03e2
        L_0x0268:
            X.4yO r0 = r11.A01
            X.9QA r8 = X.AnonymousClass9QA.A00
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x0286
            X.82o r1 = r11.A03
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x016b
            X.82Y r1 = r1.A01
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x016b
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x0286
            goto L_0x016b
        L_0x0286:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.8Cl r7 = r0.A03()
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x02d6
            X.4yO r0 = r11.A01
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x02d6
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.8Yz r0 = r0.A0X
            if (r0 == 0) goto L_0x02b2
            X.80m r0 = r0.A09
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            X.8aL r0 = X.C358088aL.A0C
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02b2
            goto L_0x016b
        L_0x02b2:
            int r0 = r7.A09
            float r1 = (float) r0
            float r1 = r1 * r9
            int r0 = r7.A06
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r7.A07
            int r0 = r0 % 180
            if (r0 == 0) goto L_0x02c2
            float r1 = r9 / r1
        L_0x02c2:
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
            com.instagram.common.session.UserSession r0 = r11.A0J
            boolean r0 = X.AnonymousClass8KI.A00(r0)
            goto L_0x02f5
        L_0x02d6:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.7zv r7 = r0.A04()
            if (r7 == 0) goto L_0x016b
            int r0 = r7.A0K
            float r1 = (float) r0
            float r1 = r1 * r9
            int r0 = r7.A08
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1058180956(0x3f128f5c, float:0.5725)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
            X.4yO r0 = r11.A01
            boolean r0 = X.0qQ.A0K(r8, r0)
        L_0x02f5:
            if (r0 == 0) goto L_0x016b
            X.8Bd r1 = r11.A04
            X.8Bd r0 = X.C351968Bd.SMART_TRACKING_PROCESSING_INVALID
            if (r1 == r0) goto L_0x016b
            X.8B2 r0 = r11.A0K
            boolean r0 = r0.A03
            goto L_0x03a4
        L_0x0303:
            X.82o r1 = r11.A03
            X.82Y r0 = r1.A01
            java.lang.String r0 = r0.A0G
            if (r0 != 0) goto L_0x016b
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x016b
            goto L_0x0337
        L_0x0312:
            X.82o r8 = r11.A03
            X.82Y r7 = r8.A01
            java.lang.Integer r1 = r7.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x033c
            java.lang.String r0 = r7.A0G
            if (r0 != 0) goto L_0x033c
            boolean r0 = r7.A0U
            if (r0 != 0) goto L_0x033c
            java.lang.Integer r1 = r8.A03()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x033c
            android.content.Context r0 = r11.A0I
            X.0qQ.A06(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x033c
        L_0x0337:
            boolean r0 = r11.A05()
            goto L_0x03a4
        L_0x033c:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.8Cl r0 = r0.A03()
            if (r0 == 0) goto L_0x0354
            com.instagram.common.gallery.Medium r0 = r0.A0F
            if (r0 == 0) goto L_0x0354
            java.lang.Boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0354
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0366
        L_0x0354:
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            X.7zv r1 = r0.A04()
            if (r1 == 0) goto L_0x016b
            boolean r0 = r1.A1I
            if (r0 != 0) goto L_0x0366
            boolean r0 = r1.A13
            if (r0 == 0) goto L_0x016b
        L_0x0366:
            X.4yO r1 = r11.A01
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x016b
            goto L_0x0337
        L_0x036d:
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x016b
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 != 0) goto L_0x016b
            X.82o r0 = r11.A03
            X.82Y r1 = r0.A01
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x016b
            boolean r0 = r11.A05
            if (r0 != 0) goto L_0x016b
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x016b
            android.content.Context r0 = r11.A0I
            X.0qQ.A06(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x016b
            boolean r0 = r11.A01()
            if (r0 == 0) goto L_0x016b
        L_0x03a0:
            boolean r0 = r11.A03()
        L_0x03a4:
            if (r0 != 0) goto L_0x016b
            goto L_0x0038
        L_0x03a8:
            X.82p r0 = r11.A02
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2D
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r0 != 0) goto L_0x016b
            X.82o r0 = r11.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x016b
            com.instagram.common.session.UserSession r8 = r11.A0J
            java.lang.Boolean r0 = X.C349167zh.A00(r8)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x03d7
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319360146480303(0x81084400001caf, double:3.031847830734351E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x03d7
            goto L_0x0038
        L_0x03d7:
            X.0Tu r7 = X.0Tu.A06
            r0 = 36323960056458883(0x810c7300002e83, double:3.034756832327156E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
        L_0x03e2:
            if (r0 == 0) goto L_0x016b
            goto L_0x0038
        L_0x03e6:
            com.instagram.common.session.UserSession r7 = r11.A0J
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327941491145542(0x81101200003b46, double:3.03727470765495E-306)
            boolean r5 = X.182.A06(r5, r7, r0)
            goto L_0x0038
        L_0x03f5:
            X.8pr r7 = X.C366898pr.A00
            com.instagram.common.session.UserSession r5 = r11.A0J
            X.82o r1 = r11.A03
            X.9QA r0 = X.AnonymousClass9QA.A00
            boolean r5 = r7.A00(r5, r0, r1)
            goto L_0x0038
        L_0x0403:
            com.instagram.common.session.UserSession r5 = r11.A0J
            X.9QA r1 = X.AnonymousClass9QA.A00
        L_0x0407:
            X.82o r0 = r11.A03
            boolean r5 = X.C366928pu.A00(r5, r1, r0)
            goto L_0x0038
        L_0x040f:
            boolean r5 = r11.A07
            goto L_0x0038
        L_0x0413:
            boolean r5 = r11.A08
            goto L_0x0038
        L_0x0417:
            boolean r5 = r11.A0E
            goto L_0x0038
        L_0x041b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0420:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YE.A00(X.9YE, boolean):java.util.List");
    }

    private final boolean A01() {
        C3503284f r2;
        Boolean valueOf;
        C279284yO r1 = this.A01;
        if (r1 == null || (r2 = this.A00) == null || (valueOf = Boolean.valueOf(C365958nx.A00(this.A0J, r1, false).A00(r2, this.A02))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    private final boolean A02() {
        C357638Yz r2 = this.A03.A01.A0X;
        if ((r2 == null || !C357638Yz.A03(C358088aL.A0o, r2)) && !this.A0H) {
            return false;
        }
        return true;
    }

    private final boolean A03() {
        C357638Yz r0 = this.A03.A01.A0X;
        if (r0 == null || !r0.A06().A02) {
            return false;
        }
        return true;
    }

    private final boolean A04() {
        C352218Cl A032 = this.A03.A01.A03();
        if ((A032 == null || !A032.A0E()) && C366918pt.A00.A00(this.A02.A01, this.A01, this.A03.A01(), AnonymousClass7TF.A1V(this.A03.A01.A02()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r3.A0J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A05() {
        /*
            r3 = this;
            X.82o r0 = r3.A03
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x001b
            com.instagram.common.session.UserSession r2 = r3.A0J
            X.8ka r1 = X.C255193tj.A00(r2)
            if (r1 == 0) goto L_0x001b
            int r0 = r1.A00
            if (r0 <= 0) goto L_0x001b
            boolean r0 = X.C255193tj.A03(r2, r1)
            r1 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YE.A05():boolean");
    }

    private final boolean A06() {
        C357638Yz r3 = this.A03.A01.A0X;
        if ((r3 == null || !r3.A0V(C358088aL.A0o, C358088aL.A0p)) && !this.A0H) {
            return false;
        }
        return true;
    }

    private final boolean A07() {
        AnonymousClass80V r0 = ((AnonymousClass9PK) this.A0N.getValue()).A00;
        if (r0 == null) {
            return false;
        }
        switch (r0.ordinal()) {
            case 4:
            case 7:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 17:
            case 19:
            case 20:
            case 21:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 31:
            case 33:
            case 35:
            case 36:
            case 60:
            case 61:
            case 64:
            case 66:
            case 67:
            case 68:
            case 74:
            case 75:
            case 78:
            case 83:
                return true;
            default:
                return false;
        }
    }

    public static final boolean A09(AnonymousClass9YE r7) {
        AnonymousClass0Ud r6 = r7.A0N;
        AnonymousClass80V r5 = ((AnonymousClass9PK) r6.getValue()).A00;
        if (r5 == null) {
            return false;
        }
        boolean z = r7.A0G;
        boolean z2 = r7.A0B;
        boolean z3 = r7.A0F;
        if ((r5 != AnonymousClass80V.MEDIA_EDIT || z || z2 || z3) && (!r7.A0D || ((AnonymousClass9PK) r6.getValue()).A08)) {
            return false;
        }
        return true;
    }

    public AnonymousClass9YE(UserSession userSession, C3499582p r13, AnonymousClass8B2 r14) {
        this.A0J = userSession;
        this.A0O = r13;
        this.A0K = r14;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C391399st jwK : C391399st.values()) {
            A1C.add(new C61082JwK(jwK, false));
        }
        02z A012 = 106.A01(new AnonymousClass9PK((AnonymousClass80V) null, (AnonymousClass80X) null, AnonymousClass05K.A0N, AnonymousClass05K.A0C, A1C, false, false, false, false, false));
        this.A0M = A012;
        this.A0N = 10b.A03(A012);
        this.A0I = userSession.A03.A06().getApplicationContext();
        this.A02 = r13;
        this.A03 = r13.A02;
        C391399st[] r0 = {C391399st.A0I, C391399st.A0A, C391399st.A0D};
        0qQ.A0B(r0, 0);
        this.A0P = 03t.A0K(r0);
        this.A0L = new 02z(false);
        AnonymousClass7TF.A1K(this, C318116oQ.A00(this), 14);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.C391399st r6) {
        /*
            r5 = this;
            int r1 = r6.ordinal()
            r4 = 0
            if (r1 == r4) goto L_0x00f2
            r0 = 14
            if (r1 == r0) goto L_0x0104
            r0 = 21
            if (r1 == r0) goto L_0x00c6
            r0 = 4
            if (r1 == r0) goto L_0x00a4
            r0 = 5
            if (r1 == r0) goto L_0x0058
            r0 = 6
            if (r1 == r0) goto L_0x00ff
            r0 = 7
            if (r1 == r0) goto L_0x0055
            switch(r1) {
                case 9: goto L_0x00fc;
                case 10: goto L_0x00b1;
                case 11: goto L_0x001e;
                case 12: goto L_0x0045;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r1) {
                case 11: goto L_0x00f7;
                case 15: goto L_0x00f4;
                case 16: goto L_0x0022;
                case 22: goto L_0x00d7;
                case 23: goto L_0x00f7;
                case 24: goto L_0x0036;
                case 26: goto L_0x00f7;
                default: goto L_0x0021;
            }
        L_0x0021:
            return r4
        L_0x0022:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r5.A0J
            boolean r0 = X.AnonymousClass30D.A08(r0)
            goto L_0x00f0
        L_0x0036:
            X.9st r0 = X.C391399st.A06
            boolean r0 = r5.A08(r0)
            if (r0 == 0) goto L_0x0021
            com.instagram.common.session.UserSession r0 = r5.A0J
            boolean r0 = X.AnonymousClass30D.A02(r0)
            goto L_0x00c3
        L_0x0045:
            X.9st r0 = X.C391399st.A0X
            boolean r0 = r5.A08(r0)
            if (r0 == 0) goto L_0x0021
            X.9st r0 = X.C391399st.A0S
            boolean r0 = r5.A08(r0)
            goto L_0x00f0
        L_0x0055:
            boolean r0 = r5.A0E
            goto L_0x00c3
        L_0x0058:
            X.82o r0 = r5.A03
            X.82Y r1 = r0.A01
            boolean r0 = r1.A0M
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A0q
            if (r0 != 0) goto L_0x0021
            android.content.Context r0 = r5.A0I
            X.0qQ.A06(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0021
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x0021
            boolean r0 = r5.A03()
            if (r0 != 0) goto L_0x0021
            X.9st r0 = X.C391399st.A0B
            boolean r0 = r5.A08(r0)
            if (r0 != 0) goto L_0x009f
            X.9st r0 = X.C391399st.A0W
            boolean r0 = r5.A08(r0)
            if (r0 != 0) goto L_0x009f
            X.9st r0 = X.C391399st.A0F
            boolean r0 = r5.A08(r0)
            if (r0 != 0) goto L_0x009f
            X.9st r0 = X.C391399st.A0C
            boolean r0 = r5.A08(r0)     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00f2
        L_0x009f:
            X.4yO r0 = r5.A01
            boolean r0 = r0 instanceof X.AnonymousClass80O
            goto L_0x00f0
        L_0x00a4:
            X.82o r0 = r5.A03
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0021
            boolean r0 = r5.A05()
            goto L_0x00c3
        L_0x00b1:
            boolean r0 = r5.A06()
            if (r0 != 0) goto L_0x0021
            X.82o r0 = r5.A03
            X.82Y r0 = r0.A01
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A03()
        L_0x00c3:
            if (r0 != 0) goto L_0x0021
            goto L_0x00f2
        L_0x00c6:
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A07()
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x00f2
            boolean r0 = r5.A0F
            goto L_0x00f0
        L_0x00d7:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x0021
            boolean r0 = r5.A0A
            if (r0 != 0) goto L_0x0021
            com.instagram.common.session.UserSession r3 = r5.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323805438029337(0x810c4f00062e19, double:3.0346590510097127E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x00f0:
            if (r0 == 0) goto L_0x0021
        L_0x00f2:
            r4 = 1
            return r4
        L_0x00f4:
            boolean r4 = r5.A09
            return r4
        L_0x00f7:
            X.4yO r0 = r5.A01
            boolean r4 = r0 instanceof X.AnonymousClass80O
            return r4
        L_0x00fc:
            boolean r4 = r5.A08
            return r4
        L_0x00ff:
            boolean r4 = r5.A0E
            return r4
        L_0x0102:
            r0 = move-exception
            throw r0
        L_0x0104:
            X.82o r0 = r5.A03
            boolean r4 = X.C355098Oo.A07(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YE.A08(X.9st):boolean");
    }
}
