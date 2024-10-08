package X;

import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaImagesIntf;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7dc  reason: invalid class name and case insensitive filesystem */
public abstract class C335837dc {
    public static final AnonymousClass9IV A00(UserSession userSession, 1bK r24, String str, String str2, Set set, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        Set set2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        String str3 = str;
        0qQ.A0B(str3, 3);
        1bK r15 = r24;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        C335907dj A01 = A01(userSession2, r15, (String) null, str3, str2, z6, z7, z8, false);
        if (A01 == null) {
            return null;
        }
        String str4 = A01.A0K;
        List list = r15.A11;
        if (list != null) {
            ArrayList<1bK> arrayList2 = new ArrayList<>();
            Iterator it = list.iterator();
            while (true) {
                set2 = set;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String str5 = ((1bK) next).A0r;
                if (str5 == null) {
                    str5 = "";
                }
                if (!set2.contains(str5)) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList();
            for (1bK r1 : arrayList2) {
                String str6 = r1.A0r;
                if (str6 != null) {
                    set2.add(str6);
                }
                C335907dj A012 = A01(userSession2, r1, str4, str, str2, z6, z7, z8, true);
                if (A012 != null) {
                    arrayList.add(A012);
                }
            }
        } else {
            arrayList = null;
        }
        Boolean bool = r15.A0G;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = false;
        }
        Integer num = r15.A0c;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        String str7 = r15.A0o;
        Boolean bool2 = r15.A0F;
        if (bool2 != null) {
            z5 = bool2.booleanValue();
        } else {
            z5 = false;
        }
        Integer num2 = r15.A0b;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        String str8 = r15.A0p;
        Integer num3 = AnonymousClass05K.A00;
        C335917dk r4 = new C335917dk(num3, num3, str7, str8, i, i2, z4, z5, false);
        if (arrayList == null) {
            arrayList = 0sn.A00;
        }
        return new AnonymousClass9IV(new C376459Ib(r4, (List) arrayList, (List) 0sn.A00), A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0205, code lost:
        if (r0 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x020b, code lost:
        if (r0 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0211, code lost:
        if (r0 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0217, code lost:
        if (r0 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x021d, code lost:
        if (r0 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C335907dj A01(com.instagram.common.session.UserSession r57, X.1bK r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, boolean r62, boolean r63, boolean r64, boolean r65) {
        /*
            r11 = 0
            r7 = 1
            r4 = r57
            X.0qQ.A0B(r4, r7)
            r0 = 5
            r14 = r60
            X.0qQ.A0B(r14, r0)
            r1 = r58
            java.lang.String r10 = r1.A0r
            com.instagram.user.model.User r13 = r1.A09
            X.1E8 r0 = X.1E7.A00(r4)
            X.1Xj r9 = r0.A02(r14)
            if (r10 == 0) goto L_0x0239
            if (r13 == 0) goto L_0x0239
            r44 = 0
            r37 = r59
            if (r59 == 0) goto L_0x0027
            r44 = 1
        L_0x0027:
            java.lang.String r0 = r1.A0t
            r38 = r0
            com.instagram.api.schemas.CommentGiphyMediaInfo r0 = r1.A02
            if (r0 == 0) goto L_0x0235
            X.7fs r20 = A02(r0)
        L_0x0033:
            X.4fi r0 = r1.A01
            X.571 r25 = X.C252893ps.A00(r0)
            X.4fl r0 = r1.A03
            r12 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = r0.BGT()
            X.572 r0 = new X.572
            r0.<init>(r12, r2)
            r12 = r0
        L_0x0048:
            java.lang.Boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x0231
            boolean r52 = r0.booleanValue()
        L_0x0050:
            java.lang.Integer r0 = r1.A0Z
            r33 = r0
            java.lang.Boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x022d
            boolean r53 = r0.booleanValue()
        L_0x005c:
            com.instagram.api.schemas.ClientDisplayMethod r2 = r1.A00
            com.instagram.api.schemas.ClientDisplayMethod r0 = com.instagram.api.schemas.ClientDisplayMethod.ALWAYS
            r46 = 0
            if (r2 != r0) goto L_0x0066
            r46 = 1
        L_0x0066:
            java.lang.Boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0229
            boolean r47 = r0.booleanValue()
        L_0x006e:
            java.util.List r0 = r1.A0w
            r18 = r0
            java.lang.Boolean r0 = r1.A0K
            if (r0 == 0) goto L_0x0225
            boolean r50 = r0.booleanValue()
        L_0x007a:
            java.lang.Long r15 = r1.A0g
            X.4fo r0 = r1.A06
            if (r0 == 0) goto L_0x0203
            X.1Xj r2 = r0.A00
            if (r2 == 0) goto L_0x0203
            java.lang.String r30 = r2.getId()
        L_0x0088:
            X.1Xj r2 = r0.A00
            if (r2 == 0) goto L_0x0209
            boolean r32 = r2.A5G()
        L_0x0090:
            X.1Xj r2 = r0.A00
            if (r2 == 0) goto L_0x020f
            com.instagram.common.typedurl.ImageUrl r27 = r2.A1Q()
        L_0x0098:
            X.1Xj r2 = r0.A00
            if (r2 == 0) goto L_0x0215
            X.1Xy r2 = r2.A0C
            com.instagram.user.model.User r29 = r2.CCd()
        L_0x00a2:
            X.1Xj r2 = r0.A00
            if (r2 == 0) goto L_0x021b
            java.lang.String r31 = r2.A2n()
        L_0x00aa:
            X.1Xj r0 = r0.A00
            if (r0 == 0) goto L_0x0221
            X.1iA r28 = r0.BR7()
        L_0x00b2:
            X.7dd r24 = new X.7dd
            r26 = r24
            r26.<init>(r27, r28, r29, r30, r31, r32)
            java.lang.Boolean r6 = r1.A0Q
            if (r6 == 0) goto L_0x01ff
            boolean r54 = r6.booleanValue()
        L_0x00c1:
            boolean r55 = r13.isVerified()
            java.lang.Boolean r2 = r1.A0J
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            boolean r3 = X.0qQ.A0K(r2, r0)
            if (r3 == 0) goto L_0x01f5
            X.7de r22 = X.C335857de.COVERED_COMMENT
        L_0x00d3:
            if (r9 == 0) goto L_0x01f1
            X.1Xy r3 = r9.A0C
            com.instagram.user.model.User r3 = r3.CCd()
            if (r3 == 0) goto L_0x01f1
            java.lang.String r41 = r3.getId()
        L_0x00e1:
            com.instagram.api.schemas.CommentRestrictStatus r3 = r1.A04
            com.instagram.api.schemas.CommentRestrictStatus r8 = com.instagram.api.schemas.CommentRestrictStatus.PENDING
            if (r3 != r8) goto L_0x01ed
            X.7df r17 = X.C335867df.RESTRICT_SENSITIVITY_SCREEN
        L_0x00e9:
            X.7aK r23 = X.C333897aK.SHOW_ORIGINAL
            java.lang.Boolean r5 = r1.A0S
            if (r5 == 0) goto L_0x01e9
            boolean r56 = r5.booleanValue()
        L_0x00f3:
            java.lang.Integer r34 = X.AnonymousClass05K.A00
            r5 = r61
            boolean r5 = X.0qQ.A0K(r5, r10)
            if (r5 == 0) goto L_0x01e5
            X.7hL r21 = new X.7hL
            r21.<init>()
        L_0x0102:
            java.lang.Integer r5 = r1.A0f
            r58 = 0
            if (r5 == 0) goto L_0x0110
            int r5 = r5.intValue()
            if (r5 == 0) goto L_0x0110
            if (r5 == r7) goto L_0x014b
        L_0x0110:
            java.lang.Boolean r5 = r1.A0B
            if (r5 == 0) goto L_0x011a
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x014b
        L_0x011a:
            if (r2 == 0) goto L_0x0122
            boolean r5 = r2.booleanValue()
            if (r5 != 0) goto L_0x014b
        L_0x0122:
            if (r6 == 0) goto L_0x012a
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L_0x014b
        L_0x012a:
            com.instagram.api.schemas.CommentRestrictStatus r5 = com.instagram.api.schemas.CommentRestrictStatus.NORMAL
            if (r3 != r5) goto L_0x014b
            java.lang.String r6 = r13.getId()
            java.lang.String r5 = r4.A06
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 != 0) goto L_0x014b
            if (r62 == 0) goto L_0x014b
            X.0Tu r7 = X.0Tu.A05
            r5 = 36318269224785986(0x81074600001842, double:3.031157927462076E-306)
            boolean r5 = X.182.A06(r7, r4, r5)
            if (r5 == 0) goto L_0x014b
            r58 = 1
        L_0x014b:
            if (r62 == 0) goto L_0x01e2
            java.lang.Boolean r5 = r1.A0B
            boolean r5 = X.0qQ.A0K(r5, r0)
            if (r5 != 0) goto L_0x0168
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x01e2
            X.0Tu r0 = X.0Tu.A05
            r5 = 36311045089788328(0x8100b4000001a8, double:3.0265893554003004E-306)
            boolean r0 = X.182.A06(r0, r4, r5)
            if (r0 == 0) goto L_0x01e2
        L_0x0168:
            r59 = 1
        L_0x016a:
            java.lang.Boolean r0 = r1.A0U
            if (r0 == 0) goto L_0x01df
            boolean r60 = r0.booleanValue()
        L_0x0172:
            java.lang.Boolean r0 = r1.A0T
            if (r0 == 0) goto L_0x01dc
            boolean r61 = r0.booleanValue()
        L_0x017a:
            r62 = 0
            if (r3 != r8) goto L_0x0180
            r62 = 1
        L_0x0180:
            X.0Tu r0 = X.0Tu.A05
            r2 = 36606160882636130(0x820d1c00001562, double:3.2132217711331655E-306)
            long r2 = X.182.A01(r0, r4, r2)
            int r0 = (int) r2
            java.util.Map r2 = X.C335897di.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r2.get(r0)
            X.7di r0 = (X.C335897di) r0
            if (r0 != 0) goto L_0x019c
            X.7di r0 = X.C335897di.PRODUCTION
        L_0x019c:
            if (r9 == 0) goto L_0x01da
            X.3gp r2 = r9.A1W()
            if (r2 == 0) goto L_0x01da
            java.lang.String r2 = r2.A0G
        L_0x01a6:
            boolean r63 = X.0qQ.A0K(r2, r10)
            r19 = 0
            X.7dj r16 = new X.7dj
            r45 = r64
            r49 = r65
            r26 = r1
            r27 = r12
            r28 = r19
            r29 = r13
            r30 = r19
            r31 = r19
            r32 = r19
            r35 = r15
            r36 = r10
            r39 = r19
            r40 = r14
            r42 = r18
            r43 = r19
            r48 = r11
            r51 = r11
            r57 = r11
            r64 = r11
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            return r16
        L_0x01da:
            r2 = 0
            goto L_0x01a6
        L_0x01dc:
            r61 = 0
            goto L_0x017a
        L_0x01df:
            r60 = 0
            goto L_0x0172
        L_0x01e2:
            r59 = 0
            goto L_0x016a
        L_0x01e5:
            X.7dg r21 = X.C335877dg.A00
            goto L_0x0102
        L_0x01e9:
            r56 = 0
            goto L_0x00f3
        L_0x01ed:
            X.7df r17 = X.C335867df.APPROVED
            goto L_0x00e9
        L_0x01f1:
            r41 = 0
            goto L_0x00e1
        L_0x01f5:
            if (r63 == 0) goto L_0x01fb
            X.7de r22 = X.C335857de.HIDDEN_COMMENT
            goto L_0x00d3
        L_0x01fb:
            X.7de r22 = X.C335857de.A04
            goto L_0x00d3
        L_0x01ff:
            r54 = 0
            goto L_0x00c1
        L_0x0203:
            r30 = 0
            if (r0 == 0) goto L_0x0209
            goto L_0x0088
        L_0x0209:
            r32 = 0
            if (r0 == 0) goto L_0x020f
            goto L_0x0090
        L_0x020f:
            r27 = 0
            if (r0 == 0) goto L_0x0215
            goto L_0x0098
        L_0x0215:
            r29 = 0
            if (r0 == 0) goto L_0x021b
            goto L_0x00a2
        L_0x021b:
            r31 = 0
            if (r0 == 0) goto L_0x0221
            goto L_0x00aa
        L_0x0221:
            r28 = 0
            goto L_0x00b2
        L_0x0225:
            r50 = 0
            goto L_0x007a
        L_0x0229:
            r47 = 0
            goto L_0x006e
        L_0x022d:
            r53 = 0
            goto L_0x005c
        L_0x0231:
            r52 = 0
            goto L_0x0050
        L_0x0235:
            r20 = 0
            goto L_0x0033
        L_0x0239:
            X.1Zn r2 = X.1Zm.A00(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r0 = 817892535(0x30c00cb7, float:1.3973452E-9)
            X.1Zp r0 = r2.A00(r1, r0, r11, r11)
            r0.A00()
            r16 = 0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335837dc.A01(com.instagram.common.session.UserSession, X.1bK, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean):X.7dj");
    }

    public static final C337197fs A02(CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf) {
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages;
        boolean z;
        String B9F = commentGiphyMediaInfoIntf.B9F();
        CommentGiphyMediaImagesIntf BGR = commentGiphyMediaInfoIntf.BGR();
        if (BGR != null) {
            commentGiphyMediaFixedHeightImages = BGR.B6Q();
        } else {
            commentGiphyMediaFixedHeightImages = null;
        }
        if (B9F == null || commentGiphyMediaFixedHeightImages == null) {
            return null;
        }
        Integer CGY = commentGiphyMediaFixedHeightImages.CGY();
        Integer BCu = commentGiphyMediaFixedHeightImages.BCu();
        String url = commentGiphyMediaFixedHeightImages.getUrl();
        if (CGY == null || BCu == null || url == null) {
            return null;
        }
        int intValue = CGY.intValue();
        int intValue2 = BCu.intValue();
        String CGK = commentGiphyMediaFixedHeightImages.CGK();
        Boolean CcU = commentGiphyMediaInfoIntf.CcU();
        if (CcU != null) {
            z = CcU.booleanValue();
        } else {
            z = false;
        }
        return new C337197fs(B9F, url, CGK, commentGiphyMediaInfoIntf.getUsername(), intValue, intValue2, z);
    }
}
