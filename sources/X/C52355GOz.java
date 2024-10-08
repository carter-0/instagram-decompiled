package X;

/* renamed from: X.GOz  reason: case insensitive filesystem */
public final class C52355GOz implements C288935cj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C52355GOz(AnonymousClass0hF r1, AnonymousClass07Z r2, int i) {
        this.A00 = i;
        switch (i) {
            case 11:
            case 14:
                this.A01 = r2;
                this.A02 = r1;
                break;
            default:
                this.A02 = r2;
                this.A01 = r1;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        r1.unregisterComponentCallbacks(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0.A0A((X.AnonymousClass07Y) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        r0 = r1.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
        r0.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0124;
                case 2: goto L_0x0015;
                case 3: goto L_0x012d;
                case 4: goto L_0x002b;
                case 5: goto L_0x00a7;
                case 6: goto L_0x0048;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00bf;
                case 9: goto L_0x00cb;
                case 10: goto L_0x00d8;
                case 11: goto L_0x006b;
                case 12: goto L_0x00e8;
                case 13: goto L_0x0074;
                case 14: goto L_0x006b;
                case 15: goto L_0x0093;
                case 16: goto L_0x00f4;
                case 17: goto L_0x0105;
                case 18: goto L_0x0114;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A02
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.07V r0 = r0.getLifecycle()
            java.lang.Object r1 = r4.A01
        L_0x000f:
            X.07Y r1 = (X.AnonymousClass07Y) r1
            r0.A0A(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.I4f r1 = (X.C56606I4f) r1
            java.lang.Object r0 = r4.A01
            X.HqQ r0 = (X.C55959HqQ) r0
            X.5Oz r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            X.IFn r0 = (X.C56866IFn) r0
            if (r0 == 0) goto L_0x0014
            X.IFp r2 = r0.A02
            goto L_0x0133
        L_0x002b:
            java.lang.Object r2 = r4.A01
            X.I4O r2 = (X.I4O) r2
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            int r0 = r2.A00
            int r0 = r0 + -1
            r2.A00 = r0
            if (r0 != 0) goto L_0x0014
            r0 = 0
            X.AnonymousClass03j.A00(r1, r0)
            X.04a.A01(r1, r0)
            X.Gg6 r0 = r2.A06
            r1.removeOnAttachStateChangeListener(r0)
            return
        L_0x0048:
            java.lang.Object r2 = r4.A02
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r0 = r2.getValue()
            X.IEq r0 = (X.C56843IEq) r0
            if (r0 == 0) goto L_0x0014
            X.IEt r1 = new X.IEt
            r1.<init>(r0)
            java.lang.Object r0 = r4.A01
            X.5aT r0 = (X.C287605aT) r0
            if (r0 == 0) goto L_0x0066
            X.5aS r0 = (X.AnonymousClass5aS) r0
            X.0V2 r0 = r0.A00
            r0.FIA(r1)
        L_0x0066:
            r0 = 0
            r2.Epw(r0)
            return
        L_0x006b:
            java.lang.Object r0 = r4.A01
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.07V r0 = r0.getLifecycle()
            goto L_0x0097
        L_0x0074:
            java.lang.Object r0 = r4.A02
            X.5Oz r0 = (X.C284945Oz) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0014
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x0014
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r0)
            return
        L_0x0093:
            java.lang.Object r0 = r4.A01
            X.07V r0 = (X.AnonymousClass07V) r0
        L_0x0097:
            java.lang.Object r1 = r4.A02
            goto L_0x000f
        L_0x009b:
            java.lang.Object r0 = r4.A01
            X.GRI r0 = (X.GRI) r0
            java.lang.Object r1 = r4.A02
            X.5Pl r0 = r0.A03
            r0.A0B(r1)
            return
        L_0x00a7:
            java.lang.Object r0 = r4.A02
            X.6Hz r0 = (X.C305436Hz) r0
            java.util.Set r1 = r0.A02
            java.lang.Object r0 = r4.A01
            r1.add(r0)
            return
        L_0x00b3:
            java.lang.Object r0 = r4.A02
            X.I0h r0 = (X.I0h) r0
            X.6HD r1 = r0.A02
            java.lang.Object r0 = r4.A01
            r1.remove((java.lang.Object) r0)
            return
        L_0x00bf:
            java.lang.Object r1 = r4.A02
            X.2Fk r1 = (X.2Fk) r1
            java.lang.Object r0 = r4.A01
            X.2gO r0 = (X.AnonymousClass2gO) r0
            r1.A08(r0)
            return
        L_0x00cb:
            java.lang.Object r0 = r4.A02
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.Object r0 = r4.A01
            X.5Y7 r0 = (X.AnonymousClass5Y7) r0
            goto L_0x00e4
        L_0x00d8:
            java.lang.Object r0 = r4.A02
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.Object r0 = r4.A01
            X.5Y9 r0 = (X.AnonymousClass5Y9) r0
        L_0x00e4:
            r1.unregisterComponentCallbacks(r0)
            return
        L_0x00e8:
            java.lang.Object r1 = r4.A01
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            java.lang.Object r0 = r4.A02
            android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener r0 = (android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener) r0
            r1.removeTouchExplorationStateChangeListener(r0)
            return
        L_0x00f4:
            java.lang.Object r2 = r4.A01
            X.3E6 r2 = (X.AnonymousClass3E6) r2
            java.lang.Object r1 = r4.A02
            X.0sL r1 = (X.0sL) r1
            X.IkE r0 = new X.IkE
            r0.<init>(r1)
            r2.EEH(r0)
            return
        L_0x0105:
            java.lang.Object r1 = r4.A02
            X.IR5 r1 = (X.IR5) r1
            r0 = 0
            r1.A00 = r0
            java.lang.Object r0 = r4.A01
            X.7Dt r0 = (X.C328167Dt) r0
            r0.A01()
            return
        L_0x0114:
            java.lang.Object r0 = r4.A02
            X.3gM r0 = (X.C247453gM) r0
            X.3W1 r3 = r0.A09
            java.lang.Object r2 = r4.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            r1 = 0
            r0 = 1
            r3.A0M(r2, r1, r0)
            return
        L_0x0124:
            java.lang.Object r0 = r4.A01
            X.I4f r0 = (X.C56606I4f) r0
            java.lang.Object r2 = r4.A02
            X.6HD r0 = r0.A0A
            goto L_0x0135
        L_0x012d:
            java.lang.Object r1 = r4.A01
            X.I4f r1 = (X.C56606I4f) r1
            java.lang.Object r2 = r4.A02
        L_0x0133:
            X.6HD r0 = r1.A09
        L_0x0135:
            r0.remove((java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52355GOz.dispose():void");
    }

    public C52355GOz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
