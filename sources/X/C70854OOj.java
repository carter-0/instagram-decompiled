package X;

/* renamed from: X.OOj  reason: case insensitive filesystem */
public final class C70854OOj {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View r3, X.C70854OOj r4, java.lang.StringBuilder r5) {
        /*
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001a
            r2 = 0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
        L_0x000b:
            if (r2 >= r1) goto L_0x0094
            android.view.View r0 = r3.getChildAt(r2)
            X.0qQ.A07(r0)
            A00(r0, r4, r5)
            int r2 = r2 + 1
            goto L_0x000b
        L_0x001a:
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = "w:"
            r5.append(r0)
            r1 = r3
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r1.getWidth()
            r5.append(r0)
            java.lang.String r0 = ",h:"
            r5.append(r0)
            int r0 = r1.getHeight()
            r5.append(r0)
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r0 = r1 instanceof X.C247923h8
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = ",image:"
            r5.append(r0)
            X.3h8 r1 = (X.C247923h8) r1
            java.lang.String r0 = r1.BG3()
        L_0x004c:
            r5.append(r0)
        L_0x004f:
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L_0x008f
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0C
            if (r0 == 0) goto L_0x00aa
            java.lang.String r4 = r0.getUrl()
            if (r4 == 0) goto L_0x0083
            java.lang.String r1 = "oh="
            r3 = 0
            int r0 = r4.length()
            int r0 = r0 + -1
            int r2 = X.00l.A07(r4, r1, r0)
            r1 = -1
            if (r2 == r1) goto L_0x009a
            r0 = 38
            int r0 = X.00l.A04(r4, r0, r2)
            if (r0 == r1) goto L_0x0095
            java.lang.String r1 = X.C51967G9n.A0q(r4, r3, r2)
            java.lang.String r0 = X.C66580MXl.A0z(r4, r0)
            java.lang.String r4 = X.002.A0R(r1, r0)
        L_0x0083:
            java.lang.String r0 = ",url:"
            r5.append(r0)
            if (r4 != 0) goto L_0x008c
            java.lang.String r4 = " not set"
        L_0x008c:
            r5.append(r4)
        L_0x008f:
            java.lang.String r0 = "\n"
            r5.append(r0)
        L_0x0094:
            return
        L_0x0095:
            java.lang.String r4 = r4.substring(r3, r2)
            goto L_0x00a6
        L_0x009a:
            r0 = 63
            int r0 = X.00l.A04(r4, r0, r3)
            if (r0 == r1) goto L_0x0083
            java.lang.String r4 = r4.substring(r3, r0)
        L_0x00a6:
            X.0qQ.A07(r4)
            goto L_0x0083
        L_0x00aa:
            r4 = 0
            goto L_0x0083
        L_0x00ac:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x00d2
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = ",bmp:"
            r5.append(r0)
            int r0 = r1.getWidth()
            r5.append(r0)
            java.lang.String r0 = "x"
            r5.append(r0)
            int r0 = r1.getHeight()
            r5.append(r0)
            goto L_0x004f
        L_0x00d2:
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = ",drawable (no bitmap info):"
            r5.append(r0)
            java.lang.String r0 = X.C66581MXm.A0y(r1)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70854OOj.A00(android.view.View, X.OOj, java.lang.StringBuilder):void");
    }
}
