package X;

import android.view.View;

/* renamed from: X.8EH  reason: invalid class name */
public final class AnonymousClass8EH implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass8EA A00;

    public AnonymousClass8EH(AnonymousClass8EA r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9 != 6) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            r7 = 1
            X.0qQ.A0B(r13, r7)
            X.8EA r6 = r11.A00
            java.util.LinkedHashMap r8 = r6.A0D
            java.util.Collection r0 = r8.values()
            java.util.Iterator r10 = r0.iterator()
            r2 = 0
            r4 = 0
        L_0x0014:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r9 = r10.next()
            X.0qQ.A07(r9)
            X.8EL r9 = (X.AnonymousClass8EL) r9
            X.2cs r0 = r9.A0C
            double r0 = r0.A01
            double r4 = java.lang.Math.max(r4, r0)
            X.8EP r0 = r9.A0H
            X.2cs r0 = r0.A06
            double r0 = r0.A01
            double r4 = java.lang.Math.max(r4, r0)
            goto L_0x0014
        L_0x0036:
            r1 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            return r1
        L_0x003c:
            int r9 = r13.getActionMasked()
            int r0 = r13.getActionIndex()
            int r10 = r13.getPointerId(r0)
            r5 = -1
            if (r9 == 0) goto L_0x0086
            r4 = 6
            r1 = 3
            if (r9 == r7) goto L_0x0057
            if (r9 == r1) goto L_0x0057
            r0 = 5
            if (r9 == r0) goto L_0x0086
            if (r9 == r4) goto L_0x0057
        L_0x0056:
            return r7
        L_0x0057:
            int r0 = r6.A00
            if (r10 != r0) goto L_0x0081
            int r0 = r13.getAction()
            if (r0 == r1) goto L_0x0056
            java.util.Collection r0 = r8.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            X.0qQ.A07(r0)
            X.8EL r0 = (X.AnonymousClass8EL) r0
            r0.A07(r2)
            X.8EP r0 = r0.A0H
            r0.A00()
            goto L_0x0069
        L_0x0081:
            if (r9 == r4) goto L_0x0056
            r6.A00 = r5
            return r7
        L_0x0086:
            int r0 = r6.A00
            if (r0 != r5) goto L_0x0056
            r6.A00 = r10
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8EH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
