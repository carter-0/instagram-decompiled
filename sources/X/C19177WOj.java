package X;

/* renamed from: X.WOj  reason: case insensitive filesystem */
public final class C19177WOj implements X7i {
    public final /* synthetic */ C15279UZh A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DEI(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 1
            r7 = r10
            X.0qQ.A0B(r10, r0)
            if (r9 == 0) goto L_0x001f
            X.UZh r2 = r8.A00
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x001f
            int r0 = r9.length()
            if (r0 != 0) goto L_0x001c
            r0 = 2131970241(0x7f1348c1, float:1.9577428E38)
            java.lang.String r9 = r2.getString(r0)
        L_0x001c:
            X.C59689JTv.A09(r1, r9)
        L_0x001f:
            X.UZh r1 = r8.A00
            X.0eM r0 = r1.A0E
            java.lang.Object r2 = r0.getValue()
            X.VwK r2 = (X.C18662VwK) r2
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r1)
            java.lang.String r5 = r0.A1S
            com.instagram.business.promote.model.PromoteData r0 = X.C15279UZh.A00(r1)
            java.lang.String r6 = r0.A1K
            java.lang.String r3 = "campaign_controls_budget_duration"
            java.lang.String r4 = "edit_budget_duration"
            r2.A0B(r3, r4, r5, r6, r7)
            X.Vvl r0 = r1.A06
            if (r0 == 0) goto L_0x0047
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            return
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19177WOj.DEI(java.lang.String, java.lang.String):void");
    }

    public C19177WOj(C15279UZh uZh) {
        this.A00 = uZh;
    }

    public final void onStart() {
        C18643Vvl vvl = this.A00.A06;
        if (vvl != null) {
            vvl.A01.setIsLoading(true);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onSuccess() {
        C15279UZh uZh = this.A00;
        ((C18662VwK) uZh.A0E.getValue()).A08("campaign_controls_budget_duration", "edit_budget_duration", C15279UZh.A00(uZh).A1S, C15279UZh.A00(uZh).A1K);
        C18643Vvl vvl = uZh.A06;
        if (vvl != null) {
            vvl.A01.setIsLoading(false);
            DbT.A1J(uZh);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
