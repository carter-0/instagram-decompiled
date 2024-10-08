package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.4Fy  reason: invalid class name and case insensitive filesystem */
public final class C262774Fy {
    public 0sL A00;
    public final UserSession A01;
    public final C262714Fq A02;

    public final C246843fK A00(C262754Fw r10, AnonymousClass4DU r11) {
        0qQ.A0B(r11, 0);
        C262714Fq r1 = this.A02;
        1Xj r5 = r10.A0D;
        AnonymousClass3W1 r7 = r10.A0G;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r7, 1);
        return new C246843fK(r1.A01, (AnonymousClass3WV) null, (AnonymousClass416) null, r5, r11, r7, r1.A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0117, code lost:
        if (r8 == null) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r11, X.C262754Fw r12, int r13) {
        /*
            r10 = this;
            r0 = 1
            X.0qQ.A0B(r12, r0)
            r1 = 2
            X.4Fq r0 = r10.A02
            X.1Xj r4 = r12.A0D
            X.3W1 r6 = r12.A0G
            r7 = 1
            X.0qQ.A0B(r4, r7)
            X.0qQ.A0B(r6, r1)
            com.instagram.common.session.UserSession r5 = r0.A01
            boolean r3 = r4.A4V()
            boolean r2 = r4.CcK()
            int r1 = r4.A0o()
            int r0 = r4.A13()
            boolean r0 = X.C247023fe.A01(r5, r1, r0, r3, r2)
            if (r0 == 0) goto L_0x002f
            if (r13 <= 0) goto L_0x002f
            X.C247023fe.A00(r5, r4, r6)
        L_0x002f:
            com.instagram.common.session.UserSession r5 = r10.A01
            boolean r3 = r4.A4V()
            boolean r2 = r4.CcK()
            int r1 = r4.A0o()
            int r0 = r4.A13()
            boolean r0 = X.C247023fe.A01(r5, r1, r0, r3, r2)
            if (r0 == 0) goto L_0x0071
            int r1 = r6.A02
            int r0 = r4.A0o()
            int r0 = r0 - r7
            r3 = 0
            if (r1 != r0) goto L_0x0052
            r3 = 1
        L_0x0052:
            int r2 = r4.A0o()
            int r1 = r4.A13()
            r0 = 0
            if (r2 >= r1) goto L_0x005e
            r0 = 1
        L_0x005e:
            if (r3 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0071
            X.Vsi r2 = new X.Vsi
            r2.<init>(r5, r4, r6)
            r0 = 3345(0xd11, float:4.687E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
            X.C18487Vsi.A00(r2, r0, r1, r0)
        L_0x0071:
            int r0 = r4.A14()
            if (r13 != r0) goto L_0x0171
            java.lang.String r3 = r4.A2n()
            if (r3 == 0) goto L_0x0171
            X.LRh r2 = new X.LRh
            r2.<init>(r5, r11)
            X.1Xy r0 = r4.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0150
            java.lang.String r9 = r0.getId()
        L_0x008e:
            X.4Gw r8 = X.C263014Gw.A00
            r6 = 0
            java.lang.String r1 = r5.A06
            X.1Xy r0 = r4.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = r0.getId()
        L_0x009f:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x011a
            X.0Tu r7 = X.0Tu.A05
            r0 = 2342163288484683945(0x2081091a001720a9, double:4.0658226783470025E-152)
            boolean r0 = X.182.A06(r7, r5, r0)
            if (r0 != 0) goto L_0x011a
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
        L_0x00b4:
            com.instagram.common.session.UserSession r0 = r2.A07
            X.0iw r7 = r2.A05
            X.0wc r4 = X.AnonymousClass0kN.A01(r7, r0)
            r0 = 661(0x295, float:9.26E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r1)
            r5 = -1
            r0 = -1
            if (r8 == 0) goto L_0x0115
            int r1 = r8.intValue()
            if (r1 == r5) goto L_0x0115
            if (r1 == r6) goto L_0x0112
            X.HOu r5 = X.C54689HOu.OPEN_CAROUSEL_ADD_TO_POST_DISABLED
        L_0x00d6:
            int r0 = r8.intValue()
        L_0x00da:
            r1 = 0
            if (r0 == r6) goto L_0x00e8
            if (r8 == 0) goto L_0x00e8
            int r0 = r8.intValue()
            switch(r0) {
                case 1: goto L_0x0103;
                case 2: goto L_0x0106;
                case 3: goto L_0x0109;
                case 4: goto L_0x010c;
                case 5: goto L_0x010f;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            java.lang.String r1 = "need_to_follow"
        L_0x00e8:
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = "action_source"
            r4.A8M(r5, r0)
            java.lang.String r5 = r7.getModuleName()
            java.lang.String r0 = "containermodule"
            r4.AAJ(r0, r5)
            java.lang.String r0 = "ineligibility_reason"
            r4.AAJ(r0, r1)
            r1 = 0
            goto L_0x0153
        L_0x0103:
            java.lang.String r1 = "reach_media_max"
            goto L_0x00e8
        L_0x0106:
            java.lang.String r1 = "reach_per_user_max"
            goto L_0x00e8
        L_0x0109:
            java.lang.String r1 = "self_cannot_add"
            goto L_0x00e8
        L_0x010c:
            java.lang.String r1 = "open_carousel_closed"
            goto L_0x00e8
        L_0x010f:
            java.lang.String r1 = "general"
            goto L_0x00e8
        L_0x0112:
            X.HOu r5 = X.C54689HOu.FOLLOW_BUTTON
            goto L_0x00d6
        L_0x0115:
            X.HOu r5 = X.C54689HOu.OPEN_CAROUSEL_ADD_TO_POST
            if (r8 != 0) goto L_0x00d6
            goto L_0x00da
        L_0x011a:
            boolean r0 = r8.A03(r5, r4)
            if (r0 == 0) goto L_0x0123
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            goto L_0x00b4
        L_0x0123:
            boolean r0 = r4.A6S(r5)
            if (r0 == 0) goto L_0x012c
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            goto L_0x00b4
        L_0x012c:
            java.lang.Integer r0 = X.C263014Gw.A00(r4)
            if (r0 == 0) goto L_0x0140
            int r1 = r0.intValue()
            int r0 = X.C56645I6a.A00(r5)
            if (r1 < r0) goto L_0x0140
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x00b4
        L_0x0140:
            boolean r0 = r4.A6V(r5)
            if (r0 != 0) goto L_0x014a
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            goto L_0x00b4
        L_0x014a:
            r8 = 0
            goto L_0x00b4
        L_0x014d:
            r0 = 0
            goto L_0x009f
        L_0x0150:
            r9 = 0
            goto L_0x008e
        L_0x0153:
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r3)     // Catch:{ NumberFormatException -> 0x0159 }
        L_0x0159:
            java.lang.String r0 = "media_id"
            r4.A9F(r0, r1)
            java.lang.Long r1 = X.LRh.A00(r9)
            java.lang.String r0 = "media_author_id"
            r4.A9F(r0, r1)
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "nav_chain"
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262774Fy.A01(android.content.Context, X.4Fw, int):void");
    }

    public final void A02(Context context, C262754Fw r7, AnonymousClass4DU r8, Integer num, int i) {
        ExtendedImageUrl simpleImageUrl;
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 2);
        int i2 = i + 1;
        C262714Fq r1 = this.A02;
        1Xj r4 = r7.A0D;
        0qQ.A0B(r4, 0);
        if (i2 < r4.A0o()) {
            1Xj A1c = r4.A1c(i2);
            if (A1c == null || (simpleImageUrl = A1c.A1n(context)) == null) {
                simpleImageUrl = new SimpleImageUrl("");
            }
            r1.A00.A0J(simpleImageUrl, r8.getModuleName()).A01();
        }
        if (num != null) {
            int i3 = i - 1;
            if (num != AnonymousClass05K.A00 || i3 < 0) {
                if (num == AnonymousClass05K.A01 && i2 < r4.A0o()) {
                    i3 = i2;
                    if (i2 < 0) {
                        return;
                    }
                } else {
                    return;
                }
            }
            1Xj A1c2 = r4.A1c(i3);
            if (A1c2 != null && A1c2.CeS()) {
                AnonymousClass3WR CEL = A1c2.CEL();
                0sL r12 = this.A00;
                if (r12 != null) {
                    r12.invoke(CEL, r8.getModuleName());
                }
            }
        }
    }

    public final void A03(C262754Fw r9, AnonymousClass3TA r10, int i, int i2) {
        1Xj r3;
        AnonymousClass3TA r1 = r10;
        0qQ.A0B(r10, 0);
        0qQ.A0B(r9, 3);
        1Xj r2 = r9.A0D;
        AnonymousClass3W1 r0 = r9.A0G;
        int i3 = r9.A04;
        int i4 = i;
        1Xj A1c = r2.A1c(i);
        if (A1c == null) {
            0wb.A03(AnonymousClass000.A00(2141), AnonymousClass000.A00(2139));
            return;
        }
        int i5 = i2;
        if (i2 >= 0) {
            r3 = r2.A1c(i2);
        } else {
            r3 = null;
        }
        r0.A0B(i);
        r1.D1F(r2, r3, A1c, i3, i5, i4);
    }

    public final void A04(C262754Fw r8, AnonymousClass3TA r9, AnonymousClass3V3 r10, int i) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r8, 3);
        int i2 = i;
        1Xj A1c = r8.A0D.A1c(i);
        if (A1c != null) {
            r9.AmC().AmB().Dl8(A1c, (GQ0) null, r10, r8.A0G, r8.A04, i2);
        }
    }

    public final void A05(C262754Fw r9, AnonymousClass3V3 r10, AnonymousClass2xS r11) {
        0qQ.A0B(r11, 0);
        0qQ.A0B(r10, 1);
        0qQ.A0B(r9, 2);
        1Xj r3 = r9.A0D;
        AnonymousClass3W1 r5 = r9.A0G;
        r11.A09(r3, r10, r5, new C263414Lx(false, false, false, false), r5.A31);
    }

    public final void A06(AnonymousClass3W1 r4) {
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A02.A01;
        if (!C238173Av.A00(userSession)) {
            return;
        }
        if (C238173Av.A02(userSession, C66579MXk.A00(896)) || C238173Av.A02(userSession, C66579MXk.A00(333))) {
            1R7 C82 = AnonymousClass1Qz.A00(userSession).C82();
            0qQ.A07(C82);
            C266444Yx A002 = C70348O3a.A00(C82, (String) null);
            C232822uV r0 = C232822uV.A0A;
            0qQ.A08(r0);
            r4.A0H(A002, r0, R.drawable.spinsta_data_white);
        }
    }

    public C262774Fy(UserSession userSession, C262714Fq r2) {
        this.A02 = r2;
        this.A01 = userSession;
    }
}
