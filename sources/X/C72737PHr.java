package X;

import android.view.View;

/* renamed from: X.PHr  reason: case insensitive filesystem */
public final class C72737PHr implements MVB {
    public final int A00;
    public final Object A01;

    public C72737PHr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C310336ap r1, Object obj, int i) {
        r1.A0A = new C72737PHr(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0197, code lost:
        r0.setArguments(r3);
        r2.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x019d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a0, code lost:
        r3.putString("BUNDLE_SCREEN", r1);
        r1 = X.AnonymousClass6W8.A03(r5, r3, X.AnonymousClass7TE.A0l(r2.A00), com.instagram.modal.ModalActivity.class, "encrypted_backups_screen");
        r1.A07();
        r1.A07 = true;
        r1.A0C(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01bc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x0138;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a1;
                case 4: goto L_0x0099;
                case 5: goto L_0x0005;
                case 6: goto L_0x0087;
                case 7: goto L_0x000b;
                case 8: goto L_0x0005;
                case 9: goto L_0x0079;
                case 10: goto L_0x0071;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.DbS.A1U(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r0 = r10.A01
            X.OdL r0 = (X.C71126OdL) r0
            X.Pvt r0 = r0.A0S
            if (r0 == 0) goto L_0x000a
            r0.CpZ()
            return
        L_0x0017:
            java.lang.Object r9 = r10.A01
            X.7Sq r9 = (X.C331857Sq) r9
            X.0sa r8 = r9.A0L
            java.lang.Object r0 = r8.invoke()
            X.7SD r0 = (X.AnonymousClass7SD) r0
            java.util.List r0 = r0.A0b
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x000a
            java.lang.String r7 = r0.getId()
            X.7ZW r0 = r9.A0D
            r6 = 1
            r0.A01(r7, r6)
            X.0eM r5 = r9.A0H
            X.2YL r4 = X.DbS.A0H(r5)
            X.6oS r3 = X.C318116oQ.A00(r4)
            r1 = 0
            r0 = 5
            X.9KX r2 = new X.9KX
            r2.<init>(r4, r7, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
            X.7I3 r2 = r9.A09
            java.lang.Object r0 = r5.getValue()
            X.7Zs r0 = (X.C333637Zs) r0
            java.lang.String r1 = r0.A00()
            java.lang.Object r0 = r8.invoke()
            X.7SD r0 = (X.AnonymousClass7SD) r0
            if (r0 == 0) goto L_0x006f
            X.3t3 r0 = r0.A0P
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = X.C300965yF.A07(r0)
        L_0x006b:
            r2.A0D(r1, r0, r6)
            return
        L_0x006f:
            r0 = 0
            goto L_0x006b
        L_0x0071:
            java.lang.Object r0 = r10.A01
            X.OLH r0 = (X.OLH) r0
            r0.A00()
            return
        L_0x0079:
            java.lang.Object r1 = r10.A01
            X.OMv r1 = (X.C70823OMv) r1
            X.NpG r0 = r1.A02
            X.Nh5 r0 = (X.C69205Nh5) r0
            X.0sP r0 = r0.A01
            r0.invoke(r1)
            return
        L_0x0087:
            java.lang.Object r0 = r10.A01
            X.NIn r0 = (X.C68449NIn) r0
            X.MuH r0 = X.C68449NIn.A02(r0)
            com.instagram.direct.inbox.notes.NotesRepository r2 = r0.A0O
            X.4Cq r1 = r2.A01
            r0 = 22
            X.C73565Pfm.A02(r2, r1, r0)
            return
        L_0x0099:
            java.lang.Object r0 = r10.A01
            X.OTm r0 = (X.C70965OTm) r0
            X.C70965OTm.A00(r0)
            return
        L_0x00a1:
            java.lang.Object r0 = r10.A01
            com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment r0 = (com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment) r0
            r0.A02()
            return
        L_0x00a9:
            r7 = 0
            X.0qQ.A0B(r11, r7)
            java.lang.Object r2 = r10.A01
            X.NV1 r2 = (X.NV1) r2
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r11)
            android.app.Activity r5 = X.C61270mF.A00(r8)
            X.NiX r6 = X.C71145Oe2.A00(r2)
            android.os.Bundle r3 = X.DbY.A08(r2)
            java.lang.String r1 = "RETRY_PIN"
            java.lang.String r0 = "BUNDLE_ENTRY_POINT"
            r3.putString(r0, r1)
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.MtV r0 = (X.C67716MtV) r0
            X.NUN r4 = r0.A08
            java.lang.String r0 = "ENTRY_POINT"
            r4.A0D(r0, r1)
            java.lang.String r1 = "SETUP_TYPE"
            java.lang.String r0 = "PIN_CODE"
            r4.A0D(r1, r0)
            X.NiX r0 = X.C69271NiX.BOTTOM_SHEET
            if (r6 != r0) goto L_0x0135
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7Pr r6 = X.DbS.A0W(r0)
            r0 = 1
            r6.A1I = r0
            r6.A11 = r0
            X.7Ps r4 = X.C51971G9r.A0h(r7)
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            r4.A02 = r0
            r1 = 37
            X.Ok6 r0 = new X.Ok6
            r0.<init>(r5, r1)
            r4.A05 = r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r4.A07 = r0
            X.7Pt r0 = r4.A00()
            r6.A0Q = r0
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x0133
            r0 = 2131969485(0x7f1345cd, float:1.9575894E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0123:
            r6.A0d = r0
            X.7Pu r2 = r6.A00()
            android.app.Activity r1 = X.C61270mF.A00(r8)
            X.NV1 r0 = new X.NV1
            r0.<init>()
            goto L_0x0197
        L_0x0133:
            r0 = 0
            goto L_0x0123
        L_0x0135:
            java.lang.String r1 = "CREATE_PIN"
            goto L_0x01a0
        L_0x0138:
            r6 = 0
            X.0qQ.A0B(r11, r6)
            java.lang.Object r2 = r10.A01
            X.NJT r2 = (X.NJT) r2
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r11)
            android.app.Activity r5 = X.C61270mF.A00(r7)
            X.NiX r1 = X.C71145Oe2.A00(r2)
            android.os.Bundle r3 = X.DbY.A08(r2)
            X.NiX r0 = X.C69271NiX.BOTTOM_SHEET
            if (r1 != r0) goto L_0x019e
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7Pr r4 = X.DbS.A0W(r0)
            r0 = 1
            r4.A1I = r0
            r4.A11 = r0
            X.7Ps r2 = X.C51971G9r.A0h(r6)
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            r2.A02 = r0
            r1 = 32
            X.Ok6 r0 = new X.Ok6
            r0.<init>(r5, r1)
            r2.A05 = r0
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r2.A07 = r0
            X.7Pt r0 = r2.A00()
            r4.A0Q = r0
            r4.A1C = r6
            X.7Pu r2 = r4.A00()
            android.app.Activity r1 = X.C61270mF.A00(r7)
            X.NV0 r0 = new X.NV0
            r0.<init>()
        L_0x0197:
            r0.setArguments(r3)
            r2.A02(r1, r0)
            return
        L_0x019e:
            java.lang.String r1 = "RESTORE_WITH_PIN"
        L_0x01a0:
            java.lang.String r0 = "BUNDLE_SCREEN"
            r3.putString(r0, r1)
            X.0eM r0 = r2.A00
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "encrypted_backups_screen"
            X.6W8 r1 = X.AnonymousClass6W8.A03(r5, r3, r2, r1, r0)
            r1.A07()
            r0 = 1
            r1.A07 = r0
            r1.A0C(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72737PHr.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
        if (9 - this.A00 == 0) {
            ((C70823OMv) this.A01).A00 = null;
        }
    }

    public final void onShow() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }
}
