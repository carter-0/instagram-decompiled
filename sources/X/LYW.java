package X;

import android.view.View;

public final class LYW implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public LYW(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r0.isValid() != true) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r2.isValid() != true) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x008d;
                case 1: goto L_0x005c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A02
            android.view.View r0 = (android.view.View) r0
            android.content.Context r7 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Object r3 = r9.A03
            X.JpL r3 = (X.C60674JpL) r3
            boolean r6 = r3.A03
            com.instagram.common.gallery.RemoteMedia r2 = r3.A02
            r1 = 1
            if (r2 == 0) goto L_0x001f
            boolean r0 = r2.isValid()
            r8 = 1
            if (r0 == r1) goto L_0x0059
        L_0x001f:
            r8 = 0
            if (r2 != 0) goto L_0x0059
            r5 = 0
        L_0x0023:
            X.JVw r0 = r3.A08
            boolean r4 = r0.A06
            X.JaS r0 = r3.A07
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r0 = r0.A00
            X.JbM r0 = r0.A03
            r2 = 0
            int r1 = X.DbU.A02(r0, r2)
            r3 = 1
            r0 = 2
            if (r1 == r0) goto L_0x0057
            if (r1 == r2) goto L_0x0057
        L_0x0038:
            java.lang.Object r2 = r9.A01
            r0 = 29
            X.MJ0 r1 = new X.MJ0
            r1.<init>(r2, r0)
            r0 = 0
            if (r6 != 0) goto L_0x0049
            if (r8 != 0) goto L_0x004a
            X.C59848JaO.A01(r7, r5)
        L_0x0049:
            return r0
        L_0x004a:
            if (r3 == 0) goto L_0x0049
            if (r4 == 0) goto L_0x0049
            java.lang.Object r0 = r1.invoke()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            return r0
        L_0x0057:
            r3 = 0
            goto L_0x0038
        L_0x0059:
            boolean r5 = r2.A09
            goto L_0x0023
        L_0x005c:
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r0)
            java.lang.Object r4 = r9.A03
            X.Jp3 r4 = (X.C60656Jp3) r4
            com.instagram.common.gallery.Draft r0 = r4.A01
            r1 = 1
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isValid()
            r3 = 1
            if (r0 == r1) goto L_0x0075
        L_0x0074:
            r3 = 0
        L_0x0075:
            com.instagram.common.gallery.Draft r0 = r4.A01
            if (r0 == 0) goto L_0x008b
            boolean r2 = r0.A06
        L_0x007b:
            X.JaS r0 = r4.A04
            com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView r0 = r0.A00
            X.JbM r1 = r0.A03
            r0 = 0
            X.0qQ.A0B(r1, r0)
            if (r3 != 0) goto L_0x0049
            X.C59848JaO.A01(r5, r2)
            return r0
        L_0x008b:
            r2 = 0
            goto L_0x007b
        L_0x008d:
            java.lang.Object r2 = r9.A01
            X.KB5 r2 = (X.KB5) r2
            java.lang.Object r4 = r9.A02
            X.MVt r4 = (X.C66539MVt) r4
            java.lang.Object r3 = r9.A03
            android.view.View r3 = (android.view.View) r3
            X.6SR r1 = X.AnonymousClass6SR.A01()
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            com.instagram.common.session.UserSession r7 = r2.A0P
            X.27r r0 = X.27p.A01(r7)
            r5 = 1
            r0.A24(r5)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324647251488969(0x810d13000430c9, double:3.0351914172312947E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x00e4
            X.LPC r0 = X.C63515KyQ.A00
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x00e2
            com.instagram.creation.fragment.AlbumEditFragment r0 = r2.A0T
            boolean r0 = r0.A0Q()
            if (r0 != 0) goto L_0x00e2
            X.LYc r0 = new X.LYc
            r0.<init>()
            r2.A0C = r0
            r3.setOnTouchListener(r0)
            X.MVz r0 = r2.A0R
            r0.requestDisallowInterceptTouchEvent(r5)
            java.util.List r0 = r2.A0E
            int r0 = r0.indexOf(r4)
            r2.A0N(r5, r0)
        L_0x00e2:
            r0 = 0
            return r0
        L_0x00e4:
            int r0 = r2.A03
            int r1 = r0 / 2
            int r0 = r2.A02
            int r0 = r0 / 2
            android.graphics.Bitmap r0 = r4.Ayu(r1, r0)
            boolean r0 = X.KB5.A0J(r0, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYW.onLongClick(android.view.View):boolean");
    }
}
