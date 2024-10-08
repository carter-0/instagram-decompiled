package X;

/* renamed from: X.FxF  reason: case insensitive filesystem */
public final class C51626FxF implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARNING: type inference failed for: r6v2, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r13, X.AnonymousClass4D7 r14) {
        /*
            r12 = this;
            r7 = r13
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0185;
                case 1: goto L_0x0129;
                case 2: goto L_0x0076;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 31
            boolean r0 = X.ME6.A02(r3, r14)
            if (r0 == 0) goto L_0x0070
            r6 = r14
            X.ME6 r6 = (X.ME6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x001c:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r4) goto L_0x01d4
            X.0eS.A00(r1)
        L_0x002a:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002d:
            X.0eS.A00(r1)
            java.lang.Object r3 = r12.A02
            X.02o r3 = (X.02o) r3
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r0 = r12.A01
            X.LvP r0 = (X.C65549LvP) r0
            java.util.Map r2 = r0.A01
            java.lang.String r1 = r12.A03
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0061
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.0qQ.A0C(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
        L_0x004f:
            int r1 = r1.intValue()
        L_0x0053:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r6.A00 = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L_0x002a
            return r5
        L_0x0061:
            java.lang.Object r1 = r7.get(r1)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x006e
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x006e
            goto L_0x004f
        L_0x006e:
            r1 = 0
            goto L_0x0053
        L_0x0070:
            X.ME6 r6 = new X.ME6
            r6.<init>(r12, r14, r3)
            goto L_0x001c
        L_0x0076:
            X.EaJ r7 = (X.C48177EaJ) r7
            X.EKk r0 = X.C47864EKk.A00
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x00da
            java.lang.Object r5 = r12.A02
            X.E41 r5 = (X.E41) r5
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            com.instagram.fanclub.gifting.FanClubGiftingViewModel r0 = (com.instagram.fanclub.gifting.FanClubGiftingViewModel) r0
            java.lang.Object r3 = r12.A01
            java.lang.String r2 = r12.A03
            X.Lio r0 = r0.A01
            java.util.Map r1 = r0.A02
            X.0eP r0 = X.AnonymousClass7TE.A1L(r3, r2)
            r1.remove(r0)
            X.DbX.A1I(r5)
            X.0eM r0 = r5.A03
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.C227642jf.A04(r2, r0)
            X.0eM r0 = r5.A02
            java.lang.String r1 = X.DbS.A0t(r0)
            java.lang.String r0 = "recipient_user_id"
            r2.putString(r0, r1)
            X.0eM r0 = r5.A01
            java.lang.String r1 = X.DbS.A0t(r0)
            java.lang.String r0 = "origin"
            r2.putString(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            r0 = 2344(0x928, float:3.285E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbV.A0Y(r1, r2, r4, r3, r0)
            X.DbT.A1M(r5, r0)
            goto L_0x002a
        L_0x00da:
            boolean r0 = r7 instanceof X.C47860EKg
            if (r0 == 0) goto L_0x002a
            X.EKg r7 = (X.C47860EKg) r7
            X.RFl r1 = r7.A00
            X.RFl r0 = X.C8918RFl.SERVER_QUOTING_FAILED
            if (r1 != r0) goto L_0x0107
            java.lang.Object r2 = r12.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.8ab r1 = X.DbW.A0U(r2)
            r0 = 2131974095(0x7f1357cf, float:1.9585244E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A05 = r0
            r0 = 2131962019(0x7f1328a3, float:1.9560751E38)
            X.DbU.A1J(r2, r1, r0)
            r0 = 55
        L_0x00ff:
            X.C50023FJi.A01(r1, r2, r0)
            X.DbT.A1V(r1)
            goto L_0x002a
        L_0x0107:
            X.RFl r0 = X.C8918RFl.USER_CANCELLED_PAYMENT
            if (r1 == r0) goto L_0x002a
            X.RFl r0 = X.C8918RFl.USER_PAYMENT_FAILED
            if (r1 == r0) goto L_0x002a
            java.lang.Object r2 = r12.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.8ab r1 = X.DbW.A0U(r2)
            r0 = 2131962021(0x7f1328a5, float:1.9560755E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A05 = r0
            r0 = 2131962020(0x7f1328a4, float:1.9560753E38)
            X.DbU.A1J(r2, r1, r0)
            r0 = 56
            goto L_0x00ff
        L_0x0129:
            X.EKl r0 = X.C47865EKl.A00
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x013b
            java.lang.Object r1 = r12.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            X.17M r0 = X.17M.A07
            r1.A02 = r0
            goto L_0x002a
        L_0x013b:
            X.EKi r0 = X.C47862EKi.A00
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x002a
            X.EKj r0 = X.C47863EKj.A00
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x017d
            X.EKh r0 = X.C47861EKh.A00
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r13 instanceof X.C47860EKg
            if (r0 != 0) goto L_0x017d
            X.EKk r0 = X.C47864EKk.A00
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r2 = r12.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r0 = 1
            r2.A1I(r0)
        L_0x0167:
            java.lang.Object r1 = r12.A02
            X.Lio r1 = (X.C64828Lio) r1
            com.instagram.common.session.UserSession r0 = r1.A00
            r2.A0d(r0)
            java.util.Map r1 = r1.A02
            java.lang.String r0 = r12.A03
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
            r1.remove(r0)
            goto L_0x002a
        L_0x017d:
            java.lang.Object r2 = r12.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r2.A0a()
            goto L_0x0167
        L_0x0185:
            X.Jvk r7 = (X.C61046Jvk) r7
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x019c
            java.lang.Object r1 = r12.A01
            X.61u r1 = (X.C3021461u) r1
            r0 = 0
            r1.setPrimaryButtonEnabled(r0)
            r1.setSecondaryButtonEnabled(r0)
            r0 = 1
            r1.setPrimaryActionIsLoading(r0)
            goto L_0x002a
        L_0x019c:
            java.lang.Object r8 = r12.A02
            java.lang.Object r9 = r12.A01
            X.61u r9 = (X.C3021461u) r9
            java.lang.String r10 = r12.A03
            r11 = 1
            r9.setPrimaryButtonEnabled(r11)
            r9.setSecondaryButtonEnabled(r11)
            r0 = 0
            r9.setPrimaryActionIsLoading(r0)
            android.content.Context r3 = r9.getContext()
            r0 = 2131964902(0x7f1333e6, float:1.9566599E38)
            java.lang.String r2 = r3.getString(r0)
            r1 = 3
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r10, (java.lang.Object) r8, (int) r1)
            r9.setPrimaryAction(r2, r0)
            r0 = 2131957576(0x7f131748, float:1.955174E38)
            java.lang.String r0 = r3.getString(r0)
            X.FOu r6 = new X.FOu
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.String) r10, (int) r11)
            r9.setSecondaryAction(r0, r6)
            goto L_0x002a
        L_0x01d4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01d9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51626FxF.emit(java.lang.Object, X.4D7):java.lang.Object");
    }

    public C51626FxF(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
    }
}
