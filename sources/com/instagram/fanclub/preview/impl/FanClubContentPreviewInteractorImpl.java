package com.instagram.fanclub.preview.impl;

import X.02z;
import X.05G;
import X.0V1;
import X.106;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0iw;
import X.AnonymousClass57N;
import X.C262204Co;
import X.C314996jB;
import X.C51973G9u;
import X.C58176Ing;
import X.C61770pa;
import X.C64829Lip;
import com.instagram.common.session.UserSession;

public final class FanClubContentPreviewInteractorImpl implements AnonymousClass57N {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C58176Ing(this, 14));
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final C61770pa A06;
    public final C61770pa A07;
    public final C61770pa A08;
    public final C64829Lip A09;
    public final C314996jB A0A;

    public FanClubContentPreviewInteractorImpl(AnonymousClass0iw r4, UserSession userSession, C64829Lip lip, C314996jB r7) {
        C51973G9u.A0r(1, userSession, lip, r7);
        this.A01 = userSession;
        this.A00 = r4;
        this.A09 = lip;
        this.A0A = r7;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        this.A08 = new 0V1((C262204Co) null, A012);
        02z A013 = 106.A01((Object) null);
        this.A04 = A013;
        this.A07 = new 0V1((C262204Co) null, A013);
        02z A014 = 106.A01((Object) null);
        this.A03 = A014;
        this.A06 = new 0V1((C262204Co) null, A014);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AJx(X.1Xj r13, X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r12 = this;
            r4 = 7
            boolean r0 = X.C66137MDp.A02(r4, r14)
            if (r0 == 0) goto L_0x00a9
            r3 = r14
            X.MDp r3 = (X.C66137MDp) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r5) goto L_0x00af
            java.lang.Object r1 = r3.A01
            X.05G r1 = (X.05G) r1
            X.0eS.A00(r0)
        L_0x0027:
            r1.Epw(r0)
        L_0x002a:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x002d:
            X.0eS.A00(r0)
            X.0eM r0 = r12.A02
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "subscription_exclusive_content_public_preview_select"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            X.0iw r0 = r12.A00
            X.C51969G9p.A1A(r6, r0)
            r7 = r13
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r13)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x00b9
            java.lang.String r0 = r0.getId()
            java.lang.Long r1 = X.JTQ.A0T(r0)
            java.lang.String r0 = "creator_igid"
            r6.A9F(r0, r1)
            java.lang.String r0 = r13.A2n()
            if (r0 == 0) goto L_0x00b4
            java.lang.Long r0 = X.JTQ.A0T(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "media_ids"
            r6.AAe(r0, r1)
            java.lang.String r1 = "media_menu"
            java.lang.String r0 = "origin"
            r6.AAJ(r0, r1)
            r6.Cgf()
            X.6jB r0 = r12.A0A
            X.0xa r2 = r0.A01
            java.lang.String r1 = "has_seen_exclusive_content_convert_to_preview_nux"
            boolean r0 = X.DbT.A1a(r2, r1)
            if (r0 != 0) goto L_0x008b
            X.DbX.A1V(r2, r1, r5)
            X.05G r0 = r12.A05
            r0.Epw(r13)
            goto L_0x002a
        L_0x008b:
            X.05G r1 = r12.A04
            X.Lip r8 = r12.A09
            r3.A01 = r1
            r3.A00 = r5
            X.4Cq r0 = r8.A01
            X.4Cc r0 = r0.ArX()
            r9 = 0
            r10 = 15
            X.JTe r6 = new X.JTe
            r11 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r0 = X.1Eo.A00(r3, r0, r6)
            if (r0 != r4) goto L_0x0027
            return r4
        L_0x00a9:
            X.MDp r3 = X.C66137MDp.A00(r12, r14, r4)
            goto L_0x0015
        L_0x00af:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AJx(X.1Xj, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AJy(X.1Xj r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 30
            boolean r0 = X.C66145MDx.A02(r3, r10)
            if (r0 == 0) goto L_0x0096
            r5 = r10
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0096
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r4) goto L_0x009d
            java.lang.Object r9 = r5.A02
            java.lang.Object r7 = r5.A01
            X.05G r7 = (X.05G) r7
            X.0eS.A00(r0)
        L_0x002a:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r9, r0)
            r7.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0034:
            X.0eS.A00(r0)
            X.0eM r0 = r8.A02
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "subscription_exclusive_content_public_preview_remove"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            X.0iw r0 = r8.A00
            X.C51969G9p.A1A(r3, r0)
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r9)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r0.getId()
            java.lang.Long r1 = X.JTQ.A0T(r0)
            java.lang.String r0 = "creator_igid"
            r3.A9F(r0, r1)
            java.lang.String r0 = r9.A2n()
            if (r0 == 0) goto L_0x00a2
            java.lang.Long r0 = X.JTQ.A0T(r0)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r0 = "media_ids"
            r3.AAe(r0, r1)
            java.lang.String r1 = "media_menu"
            java.lang.String r0 = "origin"
            r3.AAJ(r0, r1)
            r3.Cgf()
            X.05G r7 = r8.A03
            X.Lip r3 = r8.A09
            X.C66145MDx.A00(r7, r9, r5, r4)
            X.4Cq r0 = r3.A01
            X.4Cc r2 = r0.ArX()
            r1 = 0
            X.MH0 r0 = new X.MH0
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r3, (X.AnonymousClass4D7) r1, (int) r4)
            java.lang.Object r0 = X.1Eo.A00(r5, r2, r0)
            if (r0 != r6) goto L_0x002a
            return r6
        L_0x0096:
            X.MDx r5 = new X.MDx
            r5.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x009d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.preview.impl.FanClubContentPreviewInteractorImpl.AJy(X.1Xj, X.4D7):java.lang.Object");
    }
}
