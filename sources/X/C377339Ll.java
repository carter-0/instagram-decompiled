package X;

/* renamed from: X.9Ll  reason: invalid class name and case insensitive filesystem */
public final class C377339Ll extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377339Ll(Object obj, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        if (((java.lang.Boolean) X.C370798x5.A00.invoke(r6)).booleanValue() == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0035;
                case 2: goto L_0x00a7;
                case 3: goto L_0x0088;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.View r6 = (android.view.View) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
        L_0x0016:
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = r5.A01
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0032
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0032
            int r0 = r1.bottomMargin
            if (r3 != r0) goto L_0x0032
            int r0 = r0 + r2
            r1.bottomMargin = r0
            r6.setLayoutParams(r1)
        L_0x0032:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0035:
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.Object r4 = r5.A02
            X.8Xk r4 = (X.C357318Xk) r4
            android.view.View r0 = r4.A00
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r0 = 1
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r5.A01
            X.0qQ.A0A(r6)
            int r0 = r6.intValue()
            int r1 = r1 + r0
            r2.topMargin = r1
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x00e7
            r0.requestLayout()
            goto L_0x0032
        L_0x0063:
            X.JNS r6 = (X.JNS) r6
            X.5Tp r0 = androidx.compose.foundation.lazy.LazyListState.A0O
            int r3 = r5.A01
            androidx.compose.runtime.snapshots.Snapshot r2 = X.AnonymousClass5PH.A02()
            if (r2 == 0) goto L_0x0086
            X.0sP r1 = r2.A05()
        L_0x0073:
            androidx.compose.runtime.snapshots.Snapshot r0 = X.AnonymousClass5PH.A03(r2)
            X.AnonymousClass5PH.A06(r2, r0, r1)
            r2 = 2
            r1 = 0
        L_0x007c:
            int r0 = r3 + r1
            r6.EKP(r0)
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x0032
            goto L_0x007c
        L_0x0086:
            r1 = 0
            goto L_0x0073
        L_0x0088:
            android.view.View r6 = (android.view.View) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A02
            r1 = 32
            X.LXz r0 = new X.LXz
            r0.<init>(r2, r1)
            X.AnonymousClass0fU.A00(r0, r6)
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            goto L_0x0016
        L_0x00a7:
            X.48S r6 = (X.AnonymousClass48S) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r2 = r5.A02
            X.2EM r2 = (X.2EM) r2
            boolean r0 = r2 instanceof X.2Ej
            if (r0 == 0) goto L_0x00c8
            X.3U9 r0 = r6.A0I
            java.lang.String r1 = r0.Aus()
            X.2Ej r2 = (X.2Ej) r2
            java.lang.String r0 = r2.A00
            boolean r1 = X.0qQ.A0K(r1, r0)
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x00c8:
            int r1 = r5.A01
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x00d6
            X.3U9 r0 = r6.A0I
            int r0 = r0.B6d()
            if (r0 != r1) goto L_0x00e5
        L_0x00d6:
            X.0sP r0 = X.C370798x5.A00
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x00c3
        L_0x00e5:
            r1 = 0
            goto L_0x00c3
        L_0x00e7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x00ed:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377339Ll.invoke(java.lang.Object):java.lang.Object");
    }
}
