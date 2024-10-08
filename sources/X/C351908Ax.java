package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.8Ax  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C351908Ax extends 03J implements 0sP {
    public C351908Ax(Object obj) {
        super(1, obj, ClipsCreationDraftViewModel.class, "onCurrentDraftStateChange", "onCurrentDraftStateChange(Lcom/instagram/creation/capture/quickcapture/sundial/model/Resource;)V", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36327387440888212L) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            X.8fx r12 = (X.C361278fx) r12
            r2 = 0
            X.0qQ.A0B(r12, r2)
            java.lang.Object r4 = r11.receiver
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r4 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel) r4
            android.content.Context r9 = r4.A04
            com.instagram.common.session.UserSession r3 = r4.A0E
            java.lang.String r0 = r9.getPackageName()
            java.lang.String r8 = "com.instagram.basel"
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x0028
            X.0Tu r5 = X.0Tu.A05
            r0 = 36327387440888212(0x810f9100083994, double:3.036924324041233E-306)
            boolean r1 = X.182.A06(r5, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r5 = 0
            if (r0 == 0) goto L_0x00cc
            X.5kq r0 = r4.A00
        L_0x002e:
            int r1 = r12.A00
            r10 = 3
            if (r1 != r10) goto L_0x00b2
            java.lang.Object r7 = r12.A00()
            X.5kq r7 = (X.C293505kq) r7
            java.lang.String r6 = r7.A0T
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = r0.A0T
        L_0x003f:
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x009b
            X.8vh r0 = r7.A0C
            if (r0 == 0) goto L_0x008e
            X.8pV r0 = r0.A01
            if (r0 == 0) goto L_0x008e
            X.3QS r0 = r0.A07
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x008e
            java.lang.String r0 = r9.getPackageName()
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 != 0) goto L_0x008e
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327387440888212(0x810f9100083994, double:3.036924324041233E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 != 0) goto L_0x008e
            java.lang.Class<X.8Xy> r0 = X.C357458Xy.class
            java.lang.Object r1 = r3.A00(r0)
            if (r1 == 0) goto L_0x00dd
            X.6oS r3 = X.C318116oQ.A00(r4)
            r0 = 46
            X.9K3 r2 = new X.9K3
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r1, (X.AnonymousClass4D7) r5, (int) r0)
        L_0x007f:
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
        L_0x0086:
            X.05G r0 = r4.A0O
            r0.Epw(r6)
        L_0x008b:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x008e:
            r4.A00 = r7
            X.2gB r1 = r4.A06
            X.7zG r0 = new X.7zG
            r0.<init>(r7, r2)
            r1.A0A(r0)
            goto L_0x0086
        L_0x009b:
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = 1213693484(0x48577e2c, float:220664.69)
            X.0nV r0 = r1.AOJ(r0, r10)
            X.19S r3 = X.19E.A02(r0)
            r0 = 45
            X.9K3 r2 = new X.9K3
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r7, (X.AnonymousClass4D7) r5, (int) r0)
            goto L_0x007f
        L_0x00b0:
            r0 = r5
            goto L_0x003f
        L_0x00b2:
            if (r1 != 0) goto L_0x008b
            r4.A00 = r5
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x008b
            X.2Fj r2 = r4.A09
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.88W r0 = new X.88W
            r0.<init>(r1)
            r2.A0A(r0)
            goto L_0x008b
        L_0x00cc:
            X.2gB r0 = r4.A06
            java.lang.Object r0 = r0.A02()
            X.7zG r0 = (X.C348917zG) r0
            if (r0 == 0) goto L_0x00da
            X.5kq r0 = r0.A01
            goto L_0x002e
        L_0x00da:
            r0 = r5
            goto L_0x002e
        L_0x00dd:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351908Ax.invoke(java.lang.Object):java.lang.Object");
    }
}
