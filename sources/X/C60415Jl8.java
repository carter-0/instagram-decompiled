package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Jl8  reason: case insensitive filesystem */
public final class C60415Jl8 extends 2Rw {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public int A02;
    public final C62585KiI A03;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            return new C249703kE(DbT.A0D(JTP.A0G(viewGroup), viewGroup, this.A03.A00, false));
        }
        if (i == 1) {
            return new KMY(DbT.A0D(JTP.A0G(viewGroup), viewGroup, this.A03.A01, false));
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        return new C249703kE(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        if (r0 != null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r7, int r8) {
        /*
            r6 = this;
            X.JmV r7 = (X.C60498JmV) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            boolean r0 = r7 instanceof X.KMY
            if (r0 == 0) goto L_0x007b
            r0 = r7
            X.KMY r0 = (X.KMY) r0
            android.widget.TextView r3 = r0.A00
            android.content.Context r5 = r3.getContext()
            X.KiI r0 = r6.A03
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x005e
            int r4 = r0.intValue()
            java.lang.String r0 = "#.#"
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r0)
            int r0 = r8 + -1
            float r1 = (float) r0
            int r0 = X.LQO.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = r2.format(r0)
            X.0qQ.A07(r0)
            java.lang.String r0 = X.DbW.A0h(r5, r0, r4)
            if (r0 == 0) goto L_0x005e
        L_0x003f:
            r3.setText(r0)
            android.view.View r3 = X.JTO.A0F(r7)
            android.content.Context r1 = X.JTQ.A06(r7)
            int r0 = X.LQO.A03
            int r2 = r0 * 2
            float r0 = X.LQO.A00
            float r1 = X.JTS.A01(r1, r0)
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = X.AnonymousClass1GB.A01(r1)
        L_0x005a:
            X.0nA.A0f(r3, r0)
        L_0x005d:
            return
        L_0x005e:
            java.lang.String r0 = "#.#"
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r2.<init>(r0)
            int r0 = r8 + -1
            float r1 = (float) r0
            int r0 = X.LQO.A03
            float r0 = (float) r0
            float r1 = r1 * r0
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.String r0 = r2.format(r0)
            X.0qQ.A07(r0)
            goto L_0x003f
        L_0x007b:
            boolean r0 = r7 instanceof X.KMX
            if (r0 == 0) goto L_0x005d
            android.view.View r3 = X.JTO.A0F(r7)
            if (r8 != 0) goto L_0x0088
            int r0 = r6.A02
            goto L_0x005a
        L_0x0088:
            int r0 = r6.A00
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60415Jl8.onBindViewHolder(X.3kE, int):void");
    }

    public C60415Jl8(C62585KiI kiI) {
        this.A03 = kiI;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(459221305);
        int i = this.A01 + 2;
        AnonymousClass0fD.A0A(-1599563723, A032);
        return i;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(151726908);
        int i2 = 2;
        if (!(i == 0 || i == this.A01 + 1)) {
            i2 = 1;
            if (i % 2 == 1) {
                i2 = 0;
            }
        }
        AnonymousClass0fD.A0A(1316478473, A032);
        return i2;
    }
}
