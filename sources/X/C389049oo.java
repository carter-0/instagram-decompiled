package X;

import java.util.Set;

/* renamed from: X.9oo  reason: invalid class name and case insensitive filesystem */
public final class C389049oo extends AnonymousClass369 {
    public final C389359pJ A00;
    public final Set A01 = AnonymousClass7TE.A1F();
    public final AnonymousClass71P A02;

    public final Class C9I() {
        return C3251571g.class;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ca A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Cs1(java.lang.Object r17, int r18) {
        /*
            r16 = this;
            r3 = r17
            X.71g r3 = (X.C3251571g) r3
            r2 = 0
        L_0x0005:
            int r0 = r3.A01()
            if (r2 >= r0) goto L_0x020d
            java.lang.Object r4 = r3.A02(r2)
            boolean r0 = r4 instanceof X.C317876nz
            if (r0 == 0) goto L_0x00ca
            X.6nz r4 = (X.C317876nz) r4
            r5 = r16
            java.util.Set r1 = r5.A01
            java.lang.String r0 = r4.A0Z
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L_0x00ca
            X.9pJ r1 = r5.A00
            java.lang.String r5 = r4.A0Z
            X.6nz r0 = X.C317876nz.A1R
            java.lang.String r8 = r0.A0Z
            boolean r0 = r5.equals(r8)
            if (r0 == 0) goto L_0x013b
            com.instagram.common.session.UserSession r7 = r1.A03
            X.0iw r13 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0035:
            X.C49959FGr.A06(r13, r7, r0)
            X.3Ar r0 = r1.A04
            r4 = r18
            android.view.View r4 = r0.AnC(r4)
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00ca
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r11 = r4.getChildAt(r2)
            if (r11 == 0) goto L_0x00ca
            r9 = 0
            X.0qQ.A0B(r7, r9)
            java.lang.Class<X.8nb> r6 = X.C365738nb.class
            r4 = 6
            X.Plc r0 = new X.Plc
            r0.<init>(r7, r4)
            java.lang.Object r14 = r7.A01(r6, r0)
            X.8nb r14 = (X.C365738nb) r14
            android.content.Context r10 = r1.A00
            android.view.ViewGroup r12 = r1.A01
            X.0qQ.A0B(r10, r9)
            r7 = 1
            X.AnonymousClass7TF.A1B(r13, r7, r12)
            boolean r0 = X.C365738nb.A01(r14)
            if (r0 == 0) goto L_0x00ca
            X.1Bk r6 = r14.A06
            java.lang.String r4 = "has_seen_tooltip"
            boolean r0 = r6.A0G(r4, r9)
            if (r0 != 0) goto L_0x00ca
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r14.A07
            com.instagram.user.model.User r0 = r1.A01(r0)
            java.lang.String r1 = r0.getUsername()
            X.6nz r0 = X.C317876nz.A1P
            java.lang.String r0 = r0.A0Z
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.Boolean r0 = r14.A03
            if (r0 != 0) goto L_0x0099
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r14.A03 = r0
        L_0x0099:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x00ce
            android.content.res.Resources r5 = r10.getResources()
            r0 = 2131974813(0x7f135a9d, float:1.95867E38)
        L_0x00ae:
            java.lang.String r15 = X.AnonymousClass7TF.A0e(r5, r1, r0)
            if (r15 == 0) goto L_0x00ca
        L_0x00b4:
            int r0 = r15.length()
            if (r0 == 0) goto L_0x00ca
            X.Aqk r9 = new X.Aqk
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0 = 250(0xfa, double:1.235E-321)
            r12.postDelayed(r9, r0)
            r6.A0E(r4, r7)
            r6.A09()
        L_0x00ca:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x00ce:
            boolean r0 = r5.equals(r8)
            if (r0 == 0) goto L_0x00e6
            java.lang.Boolean r0 = X.C365738nb.A00(r14)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x00e6
            android.content.res.Resources r5 = r10.getResources()
            r0 = 2131974816(0x7f135aa0, float:1.9586707E38)
            goto L_0x00ae
        L_0x00e6:
            boolean r0 = r5.equals(r8)
            if (r0 == 0) goto L_0x0137
            java.lang.Boolean r0 = r14.A01
            r8 = 0
            if (r0 != 0) goto L_0x00f7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r14.A01 = r0
        L_0x00f7:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0124
            java.lang.Boolean r0 = X.C365738nb.A00(r14)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0124
            java.lang.Boolean r0 = r14.A03
            if (r0 != 0) goto L_0x0115
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r14.A03 = r0
        L_0x0115:
            boolean r0 = r0.booleanValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0124
            r8 = 1
        L_0x0124:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x0137
            android.content.res.Resources r5 = r10.getResources()
            r0 = 2131974817(0x7f135aa1, float:1.9586709E38)
            goto L_0x00ae
        L_0x0137:
            java.lang.String r15 = ""
            goto L_0x00b4
        L_0x013b:
            X.6nz r0 = X.C317876nz.A1P
            java.lang.String r0 = r0.A0Z
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x014d
            com.instagram.common.session.UserSession r7 = r1.A03
            X.0iw r13 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0035
        L_0x014d:
            X.6nz r0 = X.C317876nz.A1Q
            java.lang.String r0 = r0.A0Z
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0162
            com.instagram.common.session.UserSession r4 = r1.A03
            X.0iw r1 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C49959FGr.A06(r1, r4, r0)
            goto L_0x00ca
        L_0x0162:
            X.6nz r0 = X.C317876nz.A1Y
            java.lang.String r4 = r0.A0Z
            boolean r0 = r5.equals(r4)
            if (r0 == 0) goto L_0x01c6
            com.instagram.common.session.UserSession r7 = r1.A03
            X.0iw r0 = r1.A02
            r6 = 0
            X.0qQ.A0B(r7, r6)
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r7)
            java.lang.String r0 = "instagram_smb_partner_flow_producer"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r7.A06
            r7 = 10
            java.lang.Long r0 = X.00y.A0n(r7, r0)
            if (r0 == 0) goto L_0x01c3
            long r0 = r0.longValue()
        L_0x018c:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "igid"
            r5.A9F(r0, r1)
            java.lang.String r1 = "share_business_sticker_tray"
            java.lang.String r0 = "step"
            r5.AAJ(r0, r1)
            java.lang.String r1 = "view"
            java.lang.String r0 = "action"
            r5.AAJ(r0, r1)
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            r0 = 46
            java.lang.String r0 = X.AnonymousClass9NM.A00(r6, r7, r0)
            r5.AAJ(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "is_support_partner_enabled"
            r5.A7p(r0, r1)
            java.lang.String r0 = "sticker_type"
        L_0x01bb:
            r5.AAJ(r0, r4)
            r5.Cgf()
            goto L_0x00ca
        L_0x01c3:
            r0 = 0
            goto L_0x018c
        L_0x01c6:
            X.6nz r0 = X.C317876nz.A1W
            java.lang.String r0 = r0.A0Z
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01de
            com.instagram.common.session.UserSession r4 = r1.A03
            X.0iw r1 = r1.A02
            X.AnonymousClass7TG.A1N(r4, r1)
            java.lang.String r0 = "view"
            X.LQK.A00(r1, r4, r0)
            goto L_0x00ca
        L_0x01de:
            java.lang.String r0 = "ig_bio_product_sticker_bundle_id"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ca
            com.instagram.common.session.UserSession r0 = r1.A03
            X.JbO r4 = X.JZM.A00(r0)
            X.0wc r1 = r4.A04
            r0 = 302(0x12e, float:4.23E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            X.KkS r1 = X.C62666KkS.BIO_IG_STORY
            java.lang.String r0 = "entry_point"
            r5.A8M(r1, r0)
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "seller_igid"
            r5.AAJ(r0, r1)
            java.lang.String r4 = "seller_view_bio_sticker_in_sticker_tray"
            java.lang.String r0 = "event"
            goto L_0x01bb
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389049oo.Cs1(java.lang.Object, int):void");
    }

    public final void FN9(AnonymousClass345 r4, int i) {
        AnonymousClass71P r1 = this.A02;
        Object item = r1.getItem(i);
        item.getClass();
        r4.FNB(AnonymousClass7TF.A0h(item), item, r1.BQA(AnonymousClass7TF.A0h(item)).A00);
    }

    public C389049oo(C389359pJ r2, AnonymousClass71P r3) {
        this.A02 = r3;
        this.A00 = r2;
    }
}
