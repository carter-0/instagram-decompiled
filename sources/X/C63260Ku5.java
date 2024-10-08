package X;

/* renamed from: X.Ku5  reason: case insensitive filesystem */
public abstract class C63260Ku5 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: X.6uG} */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.HAO r10, X.C320726sq r11, X.C320576sb r12, java.util.Queue r13, int r14) {
        /*
            r9 = 0
            r2 = 1
            X.AnonymousClass7TG.A1Q(r12, r13)
            boolean r0 = r12.CVD()
            if (r0 == 0) goto L_0x00c7
            android.widget.CheckBox r5 = r10.A00
            r5.setVisibility(r9)
            boolean r0 = r11.CbS()
            r5.setChecked(r0)
            boolean r0 = r11.CbS()
            com.instagram.igds.components.imagebutton.IgImageButton r4 = r10.A00
            if (r0 == 0) goto L_0x00c4
            X.6uN r0 = X.C321556uN.SELECTED
        L_0x0021:
            r4.setMediaOverlay(r0)
            r4.setEnableTouchOverlay(r9)
            X.0nA.A0W(r5, r14)
            android.content.Context r1 = r5.getContext()
            boolean r0 = r12.EtM()
            if (r0 == 0) goto L_0x00a4
            android.content.Context r8 = X.JTQ.A06(r10)
            boolean r0 = r11.CbS()
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            boolean r0 = r1 instanceof X.C321486uG
            if (r0 == 0) goto L_0x0049
            r13.offer(r1)
        L_0x0049:
            r0 = 2131231149(0x7f0801ad, float:1.807837E38)
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r0)
        L_0x0050:
            r5.setBackground(r7)
            boolean r0 = r11.isEnabled()
            if (r0 != 0) goto L_0x0065
            X.LWj r0 = new X.LWj
            r0.<init>(r2)
            X.AnonymousClass0fU.A00(r0, r4)
            r0 = 0
            r4.setOnTouchListener(r0)
        L_0x0065:
            return
        L_0x0066:
            java.lang.Object r7 = r13.poll()
            X.6uG r7 = (X.C321486uG) r7
            if (r7 != 0) goto L_0x0073
            X.6uG r7 = new X.6uG
            r7.<init>(r8)
        L_0x0073:
            boolean r0 = r11.CbS()
            r7.A04 = r0
            r7.invalidateSelf()
            int r0 = r11.Bry()
            r7.A00(r0)
            int r6 = r5.getWidth()
            int r3 = r5.getHeight()
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r9, r9, r6, r3)
            r7.setBounds(r1)
            boolean r1 = r11.isEnabled()
            if (r1 == 0) goto L_0x00a1
            r0 = 2130970165(0x7f040635, float:1.7549032E38)
            int r0 = X.AnonymousClass7TF.A03(r8, r0)
        L_0x00a1:
            r7.A02 = r0
            goto L_0x0050
        L_0x00a4:
            boolean r0 = r11.isEnabled()
            if (r0 == 0) goto L_0x00b2
            r0 = 2131231149(0x7f0801ad, float:1.807837E38)
            android.graphics.drawable.Drawable r7 = r1.getDrawable(r0)
            goto L_0x0050
        L_0x00b2:
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            android.graphics.drawable.Drawable r7 = r1.getDrawable(r0)
            X.0qQ.A0A(r7)
            int r0 = X.2Yu.A05(r1)
            X.DbX.A11(r1, r7, r0)
            goto L_0x0050
        L_0x00c4:
            r0 = 0
            goto L_0x0021
        L_0x00c7:
            android.widget.CheckBox r1 = r10.A00
            r0 = 8
            r1.setVisibility(r0)
            com.instagram.igds.components.imagebutton.IgImageButton r1 = r10.A00
            r0 = 0
            r1.setMediaOverlay(r0)
            r1.setEnableTouchOverlay(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63260Ku5.A00(X.HAO, X.6sq, X.6sb, java.util.Queue, int):void");
    }
}
