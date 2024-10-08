package X;

/* renamed from: X.WYa  reason: case insensitive filesystem */
public final class C19407WYa implements X8T {
    public final int A00;
    public final Object A01;

    public C19407WYa(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.UaL, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTg() {
        /*
            r6 = this;
            int r0 = r6.A00
            java.lang.Object r4 = r6.A01
            if (r0 == 0) goto L_0x005f
            X.UaL r4 = (X.C15314UaL) r4
            X.0eM r0 = r4.A0F
            java.lang.Object r2 = r0.getValue()
            X.U8h r2 = (X.C14771U8h) r2
            X.0eM r5 = r4.A0G
            X.U8b r0 = X.C13990Tnq.A0S(r5)
            java.lang.String r1 = r0.A00
            X.U8b r0 = X.C13990Tnq.A0S(r5)
            boolean r0 = r0.A03
            r2.A00(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            X.U8b r0 = X.C13990Tnq.A0S(r5)
            java.lang.String r2 = r0.A0E
            X.U8b r0 = X.C13990Tnq.A0S(r5)
            java.lang.String r0 = r0.A0F
            com.instagram.user.model.User r1 = new com.instagram.user.model.User
            r1.<init>(r2, r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5gg r3 = new X.5gg
            r3.<init>(r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.U8b r0 = X.C13990Tnq.A0S(r5)
            com.instagram.common.session.UserSession r1 = r0.A0B
        L_0x004c:
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.1pE r1 = X.1pE.A01(r2, r4, r1, r0)
            r1.A0B = r3
            r0 = 1
            r1.A0v = r0
            r1.A06()
            return
        L_0x005f:
            X.Umo r4 = (X.C16007Umo) r4
            X.0eM r0 = r4.A03
            java.lang.Object r2 = r0.getValue()
            X.U8h r2 = (X.C14771U8h) r2
            X.0eM r3 = r4.A04
            java.lang.Object r0 = r3.getValue()
            X.U8j r0 = (X.C14773U8j) r0
            java.lang.String r1 = r0.A00
            java.lang.Object r0 = r3.getValue()
            X.Unk r0 = (X.C16057Unk) r0
            boolean r0 = r0.A00
            r2.A00(r1, r0)
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.Object r0 = r3.getValue()
            X.Unk r0 = (X.C16057Unk) r0
            java.lang.String r2 = r0.A06
            java.lang.Object r0 = r3.getValue()
            X.Unk r0 = (X.C16057Unk) r0
            java.lang.String r0 = r0.A07
            com.instagram.user.model.User r1 = new com.instagram.user.model.User
            r1.<init>(r2, r0)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.5gg r3 = new X.5gg
            r3.<init>(r0)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.0eM r0 = r4.A0G
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19407WYa.DTg():void");
    }

    public final void onDismiss() {
        if (this.A00 != 0) {
            C15314UaL.A01((C15314UaL) this.A01);
        } else {
            C16007Umo.A02((C16007Umo) this.A01, true);
        }
    }

    public final void onShow() {
        C14771U8h u8h;
        String str;
        boolean z;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C15314UaL uaL = (C15314UaL) obj;
            u8h = (C14771U8h) uaL.A0F.getValue();
            AnonymousClass0eM r1 = uaL.A0G;
            str = C13990Tnq.A0S(r1).A00;
            z = C13990Tnq.A0S(r1).A03;
        } else {
            C16007Umo umo = (C16007Umo) obj;
            u8h = (C14771U8h) umo.A03.getValue();
            AnonymousClass0eM r12 = umo.A04;
            str = ((C14773U8j) r12.getValue()).A00;
            z = ((C16057Unk) r12.getValue()).A00;
        }
        u8h.A02(str, z);
    }

    public final void DZL() {
        throw AnonymousClass00P.createAndThrow();
    }
}
