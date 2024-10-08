package X;

public final class GP2 implements C288935cj {
    public final int A00;
    public final Object A01;

    public GP2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r1.Epw(java.lang.Integer.valueOf(((java.lang.Number) r1.getValue()).intValue() + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ce, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x008f;
                case 2: goto L_0x008f;
                case 3: goto L_0x0097;
                case 4: goto L_0x009f;
                case 5: goto L_0x0027;
                case 6: goto L_0x00a7;
                case 7: goto L_0x00af;
                case 8: goto L_0x00b6;
                case 9: goto L_0x003a;
                case 10: goto L_0x00c7;
                case 11: goto L_0x00cf;
                case 12: goto L_0x00d7;
                case 13: goto L_0x0044;
                case 14: goto L_0x00e7;
                case 15: goto L_0x000c;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x00fc;
                case 19: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r3.A01
            X.00I r0 = (X.00I) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x0017:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r1.next()
            X.004 r0 = (X.AnonymousClass004) r0
            r0.cancel()
            goto L_0x0017
        L_0x0027:
            java.lang.Object r2 = r3.A01
            X.6JE r2 = (X.AnonymousClass6JE) r2
            X.5dh r0 = r2.A01
            int r1 = r0.BI6()
            r0 = 0
        L_0x0032:
            if (r0 >= r1) goto L_0x000c
            r2.release()
            int r0 = r0 + 1
            goto L_0x0032
        L_0x003a:
            java.lang.Object r0 = r3.A01
            X.61R r0 = (X.AnonymousClass61R) r0
            if (r0 == 0) goto L_0x000c
            r0.stop()
            return
        L_0x0044:
            java.lang.Object r0 = r3.A01
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            X.6C3 r2 = r0.A04
            java.lang.String r1 = r0.A05
            java.util.Map r0 = r2.A0B
            r0.remove(r1)
            X.5Oz r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x000c
            X.5Oz r1 = r2.A06
            goto L_0x007b
        L_0x0060:
            java.lang.Object r0 = r3.A01
            X.HqK r0 = (X.C55956HqK) r0
            X.Hoq r2 = r0.A01
            java.lang.String r1 = r0.A02
            java.util.Map r0 = r2.A07
            r0.remove(r1)
            X.5Oz r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x000c
            X.5Oz r1 = r2.A05
        L_0x007b:
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.Epw(r0)
            return
        L_0x008f:
            java.lang.Object r0 = r3.A01
            X.I4f r0 = (X.C56606I4f) r0
            r0.A05()
            return
        L_0x0097:
            java.lang.Object r1 = r3.A01
            X.6J7 r1 = (X.AnonymousClass6J7) r1
            r0 = 0
            r1.A01 = r0
            return
        L_0x009f:
            java.lang.Object r1 = r3.A01
            X.6H8 r1 = (X.AnonymousClass6H8) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x00a7:
            java.lang.Object r0 = r3.A01
            X.Gb5 r0 = (X.C52693Gb5) r0
            r0.A08()
            return
        L_0x00af:
            java.lang.Object r0 = r3.A01
            X.5Y4 r0 = (X.AnonymousClass5Y4) r0
            X.0sa r0 = r0.A00
            goto L_0x00cb
        L_0x00b6:
            java.lang.Object r1 = r3.A01
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            r1.A04()
            r0 = 0
            X.C71362ch.A01(r1, r0)
            android.view.WindowManager r0 = r1.A0B
            r0.removeViewImmediate(r1)
            return
        L_0x00c7:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x00cb:
            r0.invoke()
            return
        L_0x00cf:
            java.lang.Object r0 = r3.A01
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.cancel()
            return
        L_0x00d7:
            java.lang.Object r2 = r3.A01
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.IpU r1 = X.C58287IpU.A00
            java.lang.Class<X.HVg> r0 = X.C54849HVg.class
            r2.A01(r0, r1)
            return
        L_0x00e7:
            java.lang.Object r2 = r3.A01
            X.HoB r2 = (X.C55828HoB) r2
            X.4Co r0 = r2.A04
            r1 = 0
            r0.AG7(r1)
            X.4Co r0 = r2.A03
            r0.AG7(r1)
            X.4Co r0 = r2.A05
            r0.AG7(r1)
            return
        L_0x00fc:
            java.lang.Object r0 = r3.A01
            X.LR8 r0 = (X.LR8) r0
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GP2.dispose():void");
    }
}
