package X;

import android.view.View;

public final class LYV implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LYV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (r2.isValid() != true) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0024;
                case 2: goto L_0x0075;
                case 3: goto L_0x00dc;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.Jpt r0 = (X.C60708Jpt) r0
            java.lang.Object r2 = r8.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r9.getClass()
            android.content.Context r1 = r9.getContext()
            X.MXT r5 = r0.A01
            r5.getClass()
            java.lang.String r6 = r0.A0G
            X.2eb r4 = r0.A07
            X.JdE r3 = r0.A06
            boolean r1 = r0.A03(r1, r2, r3, r4, r5, r6)
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.Object r3 = r8.A02
            X.Jp4 r3 = (X.C60657Jp4) r3
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.A03
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r0)
            X.8y3 r2 = r3.A02
            r1 = 1
            if (r2 == 0) goto L_0x003a
            boolean r0 = r2.isValid()
            r6 = 1
            if (r0 == r1) goto L_0x0065
        L_0x003a:
            r6 = 0
            if (r2 != 0) goto L_0x0065
            r5 = 0
        L_0x003e:
            X.JVw r0 = r3.A05
            boolean r4 = r0.A06
            X.JaS r0 = r3.A04
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r0 = r0.A00
            X.JbM r0 = r0.A03
            r2 = 0
            int r1 = X.DbU.A02(r0, r2)
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0063
            if (r1 == r2) goto L_0x0063
        L_0x0053:
            java.lang.Object r2 = r8.A01
            r1 = 30
            X.MJ0 r0 = new X.MJ0
            r0.<init>(r2, r1)
            r1 = 0
            if (r6 != 0) goto L_0x0068
            X.C59848JaO.A01(r7, r5)
            return r1
        L_0x0063:
            r3 = 0
            goto L_0x0053
        L_0x0065:
            boolean r5 = r2.A04
            goto L_0x003e
        L_0x0068:
            if (r3 == 0) goto L_0x0023
            if (r4 == 0) goto L_0x0023
            java.lang.Object r0 = r0.invoke()
            boolean r1 = X.AnonymousClass7TE.A1a(r0)
            return r1
        L_0x0075:
            r0 = 2131972799(0x7f1352bf, float:1.9582616E38)
            X.6jx r3 = new X.6jx
            r3.<init>((int) r0)
            java.lang.Object r2 = r8.A01
            X.Jkz r2 = (X.C60406Jkz) r2
            android.content.Context r0 = r2.A02
            android.app.Activity r0 = (android.app.Activity) r0
            X.5Gt r1 = new X.5Gt
            r1.<init>(r0, r3)
            java.lang.Object r0 = r8.A02
            X.Jmn r0 = (X.C60516Jmn) r0
            android.widget.ImageView r0 = r0.A00
            r0.getClass()
            r1.A03(r0)
            r1.A02()
            X.5Gu r0 = X.C283255Gu.A06
            r1.A07(r0)
            r0 = 2
            X.5Gv r1 = X.KSP.A00(r1, r8, r0)
            com.instagram.common.session.UserSession r0 = r2.A03
            r1.A07(r0)
            goto L_0x00dc
        L_0x00a9:
            java.lang.Object r0 = r8.A02
            X.JlU r0 = (X.C60436JlU) r0
            X.Kzz r5 = r0.A04
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r0 = r8.A01
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r4 = X.JTO.A0F(r0)
            X.Jmi r0 = (X.C60511Jmi) r0
            X.MVt r2 = r0.A00
            if (r2 == 0) goto L_0x00dc
            int r1 = r9.getWidth()
            int r0 = r9.getHeight()
            android.graphics.Bitmap r3 = r2.Ayu(r1, r0)
            X.KB5 r2 = r5.A00
            X.MVz r0 = r2.A0R
            int r1 = r0.indexOfChild(r4)
            int r0 = r0.Atv()
            if (r1 != r0) goto L_0x00dc
            X.KB5.A0J(r3, r4, r2)
        L_0x00dc:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYV.onLongClick(android.view.View):boolean");
    }
}
