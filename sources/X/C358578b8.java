package X;

/* renamed from: X.8b8  reason: invalid class name and case insensitive filesystem */
public final class C358578b8 implements C358588b9 {
    public String A00;
    public final /* synthetic */ C358368an A01;

    public C358578b8(C358368an r1) {
        this.A01 = r1;
    }

    public final void DMp() {
        C358368an r2 = this.A01;
        AnonymousClass80U r1 = r2.A1W;
        if (r1.CQ0(AnonymousClass80V.COMPOSE_TEXT) || r1.CQ0(AnonymousClass80V.COMPOSE_TEXT_IN_STACKED_TIMELINE)) {
            r2.DMp();
        }
        C358368an.A0F(r2);
        C358368an.A0B(r2);
    }

    public final boolean Dbf(AnonymousClass05V r2) {
        this.A01.A1X.CIk(r2);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.8b5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.8b5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: X.8b5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Diq(com.instagram.ui.text.ConstrainedEditText r11, int r12, int r13) {
        /*
            r10 = this;
            android.text.Editable r6 = r11.getText()
            java.lang.String r5 = r6.toString()
            java.lang.String r0 = r10.A00
            boolean r0 = r5.equals(r0)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00b5
            X.8an r2 = r10.A01
            X.8b6 r0 = r2.A1S
            r0.getClass()
            r0.A01()
            boolean r0 = X.C358368an.A0S(r2)
            if (r0 == 0) goto L_0x002a
            android.view.ViewGroup r0 = r2.A16
            r0.setVisibility(r3)
            X.C358368an.A0C(r2)
        L_0x002a:
            int r0 = r6.length()
            X.6Mr r1 = X.C358948bj.A00(r6, r3, r0)
            X.6Mr r0 = X.C306576Mr.INVERTED
            if (r1 == r0) goto L_0x008f
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            if (r1 == r0) goto L_0x008f
            java.lang.Class<X.8bZ> r0 = X.C358848bZ.class
            java.lang.Object[] r9 = r6.getSpans(r12, r13, r0)
            int r8 = r9.length
            r7 = 0
        L_0x0042:
            if (r7 >= r8) goto L_0x008d
            r5 = r9[r7]
            int r1 = r6.getSpanStart(r5)
            int r0 = r6.getSpanEnd(r5)
            if (r1 > r13) goto L_0x008a
            if (r0 < r12) goto L_0x008a
        L_0x0052:
            X.8bZ r5 = (X.C358848bZ) r5
            if (r5 == 0) goto L_0x005a
            int r0 = r5.A05
        L_0x0058:
            r2.A00 = r0
        L_0x005a:
            int r1 = r2.A00
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = r2.A1m
            r0.setColour(r1)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r2.A1l
            if (r0 == 0) goto L_0x0068
            r0.setColor(r1)
        L_0x0068:
            X.6if r0 = r2.A1f
            java.lang.Object r1 = r0.get()
            X.91N r1 = (X.AnonymousClass91N) r1
            com.instagram.ui.text.ConstrainedEditText r0 = r2.A1j
            android.text.Editable r0 = r0.getText()
            boolean r0 = X.C358948bj.A05(r0)
            r1.A02(r0)
            android.view.ViewGroup r0 = r2.A16
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0086
            r3 = 1
        L_0x0086:
            X.C358368an.A0J(r2, r3, r4)
            return
        L_0x008a:
            int r7 = r7 + 1
            goto L_0x0042
        L_0x008d:
            r5 = 0
            goto L_0x0052
        L_0x008f:
            java.lang.Class<X.6MP> r0 = X.AnonymousClass6MP.class
            java.lang.Object[] r9 = r6.getSpans(r12, r13, r0)
            int r8 = r9.length
            r7 = 0
        L_0x0097:
            if (r7 >= r8) goto L_0x00b3
            r5 = r9[r7]
            int r1 = r6.getSpanStart(r5)
            int r0 = r6.getSpanEnd(r5)
            if (r1 > r13) goto L_0x00b0
            if (r0 < r12) goto L_0x00b0
        L_0x00a7:
            X.6MP r5 = (X.AnonymousClass6MP) r5
            if (r5 == 0) goto L_0x005a
            int r0 = r5.BfU()
            goto L_0x0058
        L_0x00b0:
            int r7 = r7 + 1
            goto L_0x0097
        L_0x00b3:
            r5 = 0
            goto L_0x00a7
        L_0x00b5:
            int[] r0 = X.AnonymousClass91M.A02
            int r0 = android.text.Selection.getSelectionEnd(r6)
            int r0 = r0 + -1
            java.lang.CharSequence r7 = X.AnonymousClass91M.A05(r0, r6)
            if (r7 == 0) goto L_0x0140
            X.8an r2 = r10.A01
            X.82p r0 = r2.A1Q
            X.82o r0 = r0.A02
            boolean r0 = X.C394789yh.A00(r0)
            if (r0 == 0) goto L_0x0140
            int r0 = r7.length()
            if (r0 != 0) goto L_0x0129
            com.instagram.common.session.UserSession r9 = r2.A1J
            X.WT5 r0 = X.C63414Kwa.A00(r9)
            java.util.List r8 = r0.A00()
            X.0Tu r7 = X.0Tu.A05
            r0 = 36317453180998809(0x81068800001499, double:3.030641858085121E-306)
            X.182.A06(r7, r9, r0)
            boolean r0 = r2.AFr()
            if (r0 == 0) goto L_0x011b
            X.8b6 r7 = r2.A1S
            r7.getClass()
            X.8b5 r7 = (X.C358548b5) r7
            java.util.List r1 = r2.A0V
            r7.A01 = r4
            java.util.List r0 = r7.A06
            r0.clear()
            if (r1 == 0) goto L_0x0104
            r0.addAll(r1)
        L_0x0104:
            r7.A03(r8)
        L_0x0107:
            boolean r0 = X.C358368an.A0S(r2)
            if (r0 == 0) goto L_0x0117
            android.view.ViewGroup r1 = r2.A16
            r0 = 8
            r1.setVisibility(r0)
            X.C358368an.A0I(r2, r3)
        L_0x0117:
            r10.A00 = r5
            goto L_0x002a
        L_0x011b:
            boolean r0 = r2.A0b
            X.8b6 r7 = r2.A1S
            r7.getClass()
            if (r0 == 0) goto L_0x0104
            X.8b5 r7 = (X.C358548b5) r7
            r7.A02 = r4
            goto L_0x0104
        L_0x0129:
            X.8b6 r0 = r2.A1S
            r0.getClass()
            r0.A02(r7)
            X.8as r1 = r2.A1V
            r1.A00()
            int r0 = r7.length()
            if (r0 < r4) goto L_0x0107
            r1.A01()
            goto L_0x0107
        L_0x0140:
            X.8an r2 = r10.A01
            X.8b6 r0 = r2.A1S
            r0.getClass()
            r0.A01()
            boolean r0 = X.C358368an.A0S(r2)
            if (r0 == 0) goto L_0x0117
            android.view.ViewGroup r0 = r2.A16
            r0.setVisibility(r3)
            X.C358368an.A0C(r2)
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358578b8.Diq(com.instagram.ui.text.ConstrainedEditText, int, int):void");
    }
}
