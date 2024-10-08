package X;

import android.content.DialogInterface;

/* renamed from: X.FIb  reason: case insensitive filesystem */
public final class C49992FIb implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C49992FIb(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj3;
        this.A04 = z;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x015a, code lost:
        if (((X.C66538MVs) r15.A01).Cbn() == false) goto L_0x015c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0145;
                case 2: goto L_0x00b0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A02
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            if (r0 == 0) goto L_0x0010
            r1 = r16
            r0.onDismiss(r1)
        L_0x0010:
            java.lang.Object r4 = r15.A01
            X.Vah r4 = (X.C17589Vah) r4
            boolean r3 = r15.A04
            r2 = 0
            java.lang.String r1 = "cancel"
            java.lang.String r0 = "dialog"
            X.VFY.A00(r4, r1, r0, r2, r3)
            java.lang.Object r0 = r15.A03
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Vkw r0 = X.C49089EpE.A00(r0)
            r0.A00()
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r6 = r15.A03
            X.LG3 r6 = (X.LG3) r6
            com.instagram.common.session.UserSession r4 = r6.A05
            java.lang.Object r5 = r15.A02
            com.instagram.model.reels.Reel r5 = (com.instagram.model.reels.Reel) r5
            java.lang.String r0 = r5.getId()
            X.0qQ.A07(r0)
            r12 = 0
            r3 = 1
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "highlights/%s/delete_reel/"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            r11 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r4)
            r2.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0O(r11, r1, r0, r12)
            X.1OC r3 = X.DbT.A0U(r2, r3)
            java.lang.String r2 = r5.getId()
            X.0qQ.A07(r2)
            java.lang.Object r1 = r15.A01
            X.MRV r1 = (X.MRV) r1
            X.KAM r0 = new X.KAM
            r0.<init>(r1, r6, r2)
            r3.A00 = r0
            X.0hq r0 = r6.A01
            X.SQH.A02(r0)
            android.content.Context r8 = r6.A00
            X.07i r9 = r6.A02
            X.1ES.A00(r8, r9, r3)
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x0029
            X.3kF r0 = X.C249713kF.A00
            X.LEt r7 = r0.A0V(r4)
            X.0iw r10 = r6.A03
            r7.A00(r8, r9, r10, r11, r12)
            java.util.List r0 = r5.A0O(r4)
            int r3 = r0.size()
            X.0wc r1 = X.AnonymousClass0kN.A01(r10, r4)
            java.lang.String r0 = "instagram_shopping_shop_highlight_deleted"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A8k(r0, r1)
            r2.Cgf()
            return
        L_0x00b0:
            java.lang.Object r2 = r15.A01
            X.FH4 r2 = (X.FH4) r2
            com.instagram.common.session.UserSession r7 = r2.A04
            X.0iw r1 = r2.A03
            java.lang.String r0 = "logout_d2_logout_tapped"
            X.FCF.A01(r1, r7, r0)
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r14 = r15.A02
            java.util.HashMap r14 = (java.util.HashMap) r14
            X.AnonymousClass7TG.A1N(r7, r14)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            java.lang.String r9 = "logout_password_saving_multiaccount_logout_all_clicked"
            java.lang.String r10 = "logout_spi"
            java.lang.String r11 = "logout"
            java.lang.String r12 = "logout_interaction"
            r13 = 0
            X.C319616qu.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x00d6:
            X.3EO r1 = X.AnonymousClass3EO.A00(r7)
            java.util.HashMap r0 = r1.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0123
            java.util.HashMap r0 = r1.A02
            java.util.Collection r0 = r0.values()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x00f2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r1 = r6.next()
            X.Exs r1 = (X.C49557Exs) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00f2
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r5 = r0.getId()
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r4 = r0.getUsername()
            com.instagram.user.model.User r0 = r1.A00
            com.instagram.common.typedurl.ImageUrl r3 = r0.Bh3()
            java.lang.String r0 = r1.A01
            X.6qx r1 = new X.6qx
            r1.<init>(r3, r5, r4, r0)
            X.6qt r0 = X.C319606qt.A01(r7)
            r0.A0E(r1)
            goto L_0x00f2
        L_0x0123:
            X.3EO r1 = X.AnonymousClass3EO.A00(r7)
            java.util.HashMap r0 = r1.A02
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x013e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r1.A02 = r0
            java.util.Collection r0 = r0.values()
            r1.A05(r0)
        L_0x013e:
            X.EVP r1 = X.EVP.ALL
            r0 = 1
            r2.A0D(r1, r0)
            return
        L_0x0145:
            java.lang.Object r2 = r15.A02
            X.Ki7 r2 = (X.C62574Ki7) r2
            X.Ki7 r0 = X.C62574Ki7.SELF_REEL
            if (r2 != r0) goto L_0x015c
            boolean r0 = r15.A04
            if (r0 == 0) goto L_0x015c
            java.lang.Object r0 = r15.A01
            X.MVs r0 = (X.C66538MVs) r0
            boolean r0 = r0.Cbn()
            r1 = 1
            if (r0 != 0) goto L_0x015d
        L_0x015c:
            r1 = 0
        L_0x015d:
            java.lang.Object r0 = r15.A03
            X.LFp r0 = (X.C63964LFp) r0
            X.30m r0 = r0.A01
            r0.CfX(r2, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49992FIb.onClick(android.content.DialogInterface, int):void");
    }
}
