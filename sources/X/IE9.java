package X;

import android.view.View;
import android.widget.AbsListView;

public final class IE9 implements AbsListView.RecyclerListener, JLS {
    public final C238133Ar A00;
    public final /* synthetic */ C234172xD A01;

    public final void onMovedToScrapHeap(View view) {
        A00(view, false);
    }

    public IE9(C234172xD r1, C238133Ar r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r5.A0B == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007f, code lost:
        if (r5 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0081, code lost:
        r5.A0B = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r0 = r11;
        r3 = r10.A06;
        r2 = (X.JOD) r3.remove(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if (r2 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r0 = X.1Xi.A02(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r0 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        r2 = (X.JOD) r3.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r2 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        r2.Ds4(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if ((r11 instanceof X.1Xj) == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r15 == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a8, code lost:
        r8.CEd().post(new X.C57836IhF(r11, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        if (r3.isEmpty() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        r10.A00 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bc, code lost:
        r14.setTag(com.instagram.android.R.id.row_tombstone_item, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        if (r10.A01 == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c5, code lost:
        r8.Ejm(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ca, code lost:
        r8.CEd().post(new X.C57837IhG(r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d9, code lost:
        r1.Cs9(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dd, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r14, boolean r15) {
        /*
            r13 = this;
            X.2xD r10 = r13.A01
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0041
            r14.getClass()
            r9 = 2131440552(0x7f0b33a8, float:1.850309E38)
            java.lang.Object r11 = r14.getTag(r9)
            X.1Xn r11 = (X.AnonymousClass1Xn) r11
            if (r11 == 0) goto L_0x0041
            X.2rR r1 = r10.A05
            boolean r0 = r1.CRD()
            if (r0 != 0) goto L_0x0041
            java.lang.Object r0 = r14.getTag()
            r0.getClass()
            X.GjT r0 = (X.C53157GjT) r0
            X.3W1 r0 = r0.A03
            if (r0 == 0) goto L_0x0042
            X.3WA r2 = r0.A0m
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS
            if (r2 == r0) goto L_0x0041
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_CONNECTED
            if (r2 == r0) goto L_0x0041
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_HIDE_POST_ONLY
            if (r2 == r0) goto L_0x0041
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_NOT_INTERESTED
            if (r2 == r0) goto L_0x0041
            X.3WA r0 = X.AnonymousClass3WA.ORGANIC_SHOW_LESS_HIDE_POSTS_FROM_ACCOUNT
            if (r2 != r0) goto L_0x0042
        L_0x0041:
            return
        L_0x0042:
            X.3Ar r8 = r13.A00
            int r0 = r8.AnH()
            if (r0 <= 0) goto L_0x0041
            int r6 = r8.B6L()
            r7 = 0
            android.view.View r0 = r8.AnC(r7)
            int r12 = r0.getTop()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0075
            r2 = 0
        L_0x005c:
            int r0 = r8.AnH()
            if (r2 >= r0) goto L_0x0075
            android.view.View r0 = r8.AnC(r2)
            if (r0 == r14) goto L_0x00df
            int r6 = r8.B6L()
            int r6 = r6 + r2
            android.view.View r0 = r8.AnC(r2)
            int r12 = r0.getTop()
        L_0x0075:
            X.2js r5 = r10.A04
            if (r5 == 0) goto L_0x007e
            boolean r0 = r5.A0B
            r4 = 1
            if (r0 != 0) goto L_0x0081
        L_0x007e:
            r4 = 0
            if (r5 == 0) goto L_0x0083
        L_0x0081:
            r5.A0B = r7
        L_0x0083:
            r0 = r11
            java.util.Map r3 = r10.A06
            java.lang.Object r2 = r3.remove(r11)
            X.JOD r2 = (X.JOD) r2
            if (r2 != 0) goto L_0x009c
            X.1Xj r0 = X.1Xi.A02(r11)
            if (r0 == 0) goto L_0x009f
            java.lang.Object r2 = r3.remove(r0)
            X.JOD r2 = (X.JOD) r2
            if (r2 == 0) goto L_0x009f
        L_0x009c:
            r2.Ds4(r0)
        L_0x009f:
            r2 = 0
            boolean r0 = r11 instanceof X.1Xj
            if (r0 == 0) goto L_0x00dd
            X.1Xj r11 = (X.1Xj) r11
        L_0x00a6:
            if (r15 == 0) goto L_0x00d9
            android.view.ViewGroup r1 = r8.CEd()
            X.IhF r0 = new X.IhF
            r0.<init>(r11, r13)
            r1.post(r0)
        L_0x00b4:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00bc
            r10.A00 = r7
        L_0x00bc:
            r14.setTag(r9, r2)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x00d7
            int r6 = r6 + -1
        L_0x00c5:
            r8.Ejm(r6, r7)
            if (r5 == 0) goto L_0x0041
            android.view.ViewGroup r1 = r8.CEd()
            X.IhG r0 = new X.IhG
            r0.<init>(r5, r4)
            r1.post(r0)
            return
        L_0x00d7:
            r7 = r12
            goto L_0x00c5
        L_0x00d9:
            r1.Cs9(r11)
            goto L_0x00b4
        L_0x00dd:
            r11 = r2
            goto L_0x00a6
        L_0x00df:
            int r2 = r2 + 1
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IE9.A00(android.view.View, boolean):void");
    }

    public IE9() {
    }
}
