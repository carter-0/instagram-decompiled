package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uez  reason: case insensitive filesystem */
public final class C15571Uez extends C336937fQ {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C21002X8z A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        DbW.A1I(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0081, code lost:
        if (r14.length() == 0) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r17 = this;
            r1 = r21
            r3 = r19
            r0 = 90449485(0x564264d, float:1.0727543E-35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r11 = r20
            X.AnonymousClass7TG.A1Q(r11, r1)
            r5 = 4
            r6 = r22
            X.0qQ.A0B(r6, r5)
            r8 = r17
            if (r19 != 0) goto L_0x003b
            android.content.Context r12 = r8.A00
            boolean r10 = r8.A04
            boolean r9 = r8.A06
            boolean r7 = r8.A05
            r3 = 0
            android.view.LayoutInflater r2 = X.DbT.A0B(r12)
            r0 = 2131629195(0x7f0e148b, float:1.8885704E38)
            android.view.View r3 = X.DbU.A0A(r2, r11, r0, r3)
            X.Vcp r11 = new X.Vcp
            r13 = r3
            r14 = r10
            r15 = r9
            r16 = r7
            r11.<init>(r12, r13, r14, r15, r16)
            r3.setTag(r11)
        L_0x003b:
            X.X8z r12 = r8.A03
            java.lang.Object r7 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.user.requested.adapter.row.RequestedUserRowViewBinder.Holder"
            X.0qQ.A0C(r7, r0)
            X.Vcp r7 = (X.C17720Vcp) r7
            android.content.Context r15 = r8.A00
            com.instagram.common.session.UserSession r10 = r8.A02
            X.0iw r9 = r8.A01
            X.GmF r1 = (X.C53329GmF) r1
            int r2 = X.AnonymousClass7TE.A0M(r6)
            r6 = 0
            X.0qQ.A0B(r12, r6)
            r11 = 1
            X.DbZ.A0t(r11, r7, r15, r10)
            X.DbW.A1N(r9, r5, r1)
            com.instagram.user.model.User r8 = r1.A01
            r12.DgG(r8, r2)
            android.view.View r5 = r7.A01
            r0 = 11
            X.WB3.A00(r5, r12, r8, r2, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r7.A0B
            X.DbU.A1S(r9, r0, r8)
            android.widget.TextView r13 = r7.A0A
            X.DbU.A1H(r13, r8)
            java.lang.String r14 = r8.getFullName()
            if (r14 == 0) goto L_0x0083
            int r0 = r14.length()
            r16 = 0
            if (r0 != 0) goto L_0x0085
        L_0x0083:
            r16 = 1
        L_0x0085:
            r5 = 8
            android.widget.TextView r0 = r7.A09
            if (r16 == 0) goto L_0x011d
            r0.setVisibility(r5)
        L_0x008e:
            boolean r0 = r8.isVerified()
            X.C244273av.A0B(r13, r0)
            android.widget.TextView r13 = r7.A07
            boolean r0 = X.C308436Ug.A02(r8)
            int r0 = X.DbW.A01(r0)
            r13.setVisibility(r0)
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x011a
            android.widget.TextView r14 = r7.A05
        L_0x00a8:
            boolean r13 = r8.A1e()
            r0 = 2131956481(0x7f131301, float:1.9549519E38)
            if (r13 == 0) goto L_0x00b4
            r0 = 2131972388(0x7f135124, float:1.9581782E38)
        L_0x00b4:
            X.DbT.A18(r15, r14, r0)
            r0 = 30
            X.WBE.A00(r14, r0, r12, r1)
            android.widget.TextView r1 = r7.A06
            r0 = 12
            X.WB3.A00(r1, r12, r8, r2, r0)
            android.view.View r1 = r7.A02
            r0 = 13
            X.WB3.A00(r1, r12, r8, r2, r0)
            android.view.View r1 = r7.A03
            r0 = 14
            X.WB3.A00(r1, r12, r8, r2, r0)
            com.instagram.user.follow.FollowButton r2 = r7.A0C
            r2.A0A = r11
            X.4at r1 = r2.A0J
            r0 = 0
            r1.A00 = r0
            X.3aK r0 = X.C243923aK.MEDIUM
            r2.setBaseStyle(r0)
            r1.A03(r9, r10, r8)
            boolean r1 = r8.A2D()
            android.view.View r0 = r7.A00
            if (r1 != 0) goto L_0x0113
            r0.setVisibility(r5)
            r2.setVisibility(r6)
        L_0x00f0:
            X.4Cl r0 = r8.A03
            java.lang.String r1 = r0.BxN()
            if (r1 == 0) goto L_0x010d
            int r0 = r1.length()
            if (r0 == 0) goto L_0x010d
            android.widget.TextView r0 = r7.A08
            r0.setVisibility(r6)
            r0.setText(r1)
        L_0x0106:
            r0 = -1040064499(0xffffffffc201e00d, float:-32.4688)
            X.AnonymousClass0fD.A0A(r0, r4)
            return r3
        L_0x010d:
            android.widget.TextView r0 = r7.A08
            r0.setVisibility(r5)
            goto L_0x0106
        L_0x0113:
            r0.setVisibility(r6)
            r2.setVisibility(r5)
            goto L_0x00f0
        L_0x011a:
            android.widget.TextView r14 = r7.A04
            goto L_0x00a8
        L_0x011d:
            r0.setText(r14)
            r0.setVisibility(r6)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15571Uez.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }

    public C15571Uez(Context context, AnonymousClass0iw r2, UserSession userSession, C21002X8z x8z, boolean z, boolean z2, boolean z3) {
        AnonymousClass7TG.A1Q(userSession, r2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = x8z;
        this.A04 = z;
        this.A06 = z2;
        this.A05 = z3;
    }
}
