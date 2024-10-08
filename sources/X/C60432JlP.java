package X;

import android.view.ViewGroup;

/* renamed from: X.JlP  reason: case insensitive filesystem */
public abstract class C60432JlP extends 2Rw {
    public C63569KzI A00 = new C63569KzI(false);

    public abstract C249703kE A00(ViewGroup viewGroup, C63569KzI kzI);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if ((r5 instanceof X.C60333Jjc) != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if ((r1 instanceof X.C60333Jjc) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C63569KzI r5) {
        /*
            r4 = this;
            r3 = 0
            X.KzI r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0028
            X.KzI r1 = r4.A00
            boolean r0 = r1 instanceof X.C60334Jjd
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1 instanceof X.C60333Jjc
            r2 = 0
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            boolean r0 = r5 instanceof X.C60334Jjd
            if (r0 != 0) goto L_0x001e
            boolean r1 = r5 instanceof X.C60333Jjc
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            if (r2 == 0) goto L_0x002d
            if (r0 != 0) goto L_0x0029
            r4.notifyItemRemoved(r3)
        L_0x0026:
            r4.A00 = r5
        L_0x0028:
            return
        L_0x0029:
            r4.notifyItemChanged(r3)
            goto L_0x0026
        L_0x002d:
            if (r0 == 0) goto L_0x0026
            r4.notifyItemInserted(r3)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60432JlP.A01(X.KzI):void");
    }

    public abstract void A02(C63569KzI kzI, C249703kE r2);

    public final void onBindViewHolder(C249703kE r2, int i) {
        0qQ.A0B(r2, 0);
        A02(this.A00, r2);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        return A00(viewGroup, this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r0 != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemCount() {
        /*
            r3 = this;
            r0 = 1158300841(0x450a44a9, float:2212.2913)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.KzI r1 = r3.A00
            boolean r0 = r1 instanceof X.C60334Jjd
            if (r0 != 0) goto L_0x0012
            boolean r0 = r1 instanceof X.C60333Jjc
            r1 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r0 = -255448387(0xfffffffff0c62abd, float:-4.906376E29)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60432JlP.getItemCount():int");
    }

    public final int getItemViewType(int i) {
        AnonymousClass0fD.A0A(379697631, AnonymousClass0fD.A03(-1942535748));
        return 0;
    }
}
