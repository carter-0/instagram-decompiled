package X;

import com.instagram.common.gallery.Medium;

public final class IOC implements C348257y9 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IOC(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean CWP(Medium medium) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
                return ((0r1) this.A02).A00;
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.HAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.HAN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.HAM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.HAM} */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DrQ(android.graphics.Bitmap r7, com.instagram.common.gallery.Medium r8, boolean r9) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0024;
                case 2: goto L_0x0011;
                case 3: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r3 = 0
            X.AnonymousClass7TF.A1B(r8, r3, r7)
            java.lang.Object r2 = r6.A01
            X.HAN r2 = (X.HAN) r2
            android.widget.TextView r1 = r2.A00
            goto L_0x0054
        L_0x0011:
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.lang.Object r0 = r6.A01
            X.5Oz r0 = (X.C284945Oz) r0
            r0.Epw(r7)
            java.lang.Object r1 = r6.A02
            X.0r1 r1 = (X.0r1) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0024:
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.lang.Object r5 = r6.A01
            X.JoU r5 = (X.C60621JoU) r5
            java.lang.Object r4 = r6.A02
            com.instagram.igds.components.imagebutton.IgImageButton r3 = r5.A00
            r3.setImageBitmap(r7)
            com.instagram.igds.components.imagebutton.IgImageButton r2 = r5.A01
            r1 = 23
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            X.AnonymousClass0fU.A00(r0, r2)
            r1 = 24
            X.LY7 r0 = new X.LY7
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            X.AnonymousClass0fU.A00(r0, r3)
            return
        L_0x004a:
            r3 = 0
            X.AnonymousClass7TF.A1B(r8, r3, r7)
            java.lang.Object r2 = r6.A01
            X.HAM r2 = (X.HAM) r2
            android.widget.TextView r1 = r2.A00
        L_0x0054:
            boolean r0 = r8.CeS()
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = r8.B8E()
            r1.setText(r0)
        L_0x006c:
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r2.A00
            r0.setImageBitmap(r7)
            java.lang.Object r0 = r6.A02
            X.0r1 r0 = (X.0r1) r0
            r0.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IOC.DrQ(android.graphics.Bitmap, com.instagram.common.gallery.Medium, boolean):void");
    }

    public final void DLY(Medium medium, String str) {
    }
}
