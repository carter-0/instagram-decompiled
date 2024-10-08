package X;

import android.view.Choreographer;

public final class W81 implements Choreographer.FrameCallback {
    public final int A00;
    public final Object A01;

    public W81(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: X.VRK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: X.VRK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: X.VRK} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r1 < 3) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x025b;
                case 1: goto L_0x021d;
                case 2: goto L_0x0215;
                case 3: goto L_0x017c;
                case 4: goto L_0x00ba;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r13.A01
            X.U1A r2 = (X.U1A) r2
            android.view.View r6 = r2.A0F
            boolean r0 = r6.isLaidOut()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r6.isAttachedToWindow()
            if (r0 == 0) goto L_0x004e
            android.graphics.Rect r7 = r2.A0D
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x005d
            r6.getWindowVisibleDisplayFrame(r7)
            int r0 = r7.width()
            if (r0 <= 0) goto L_0x002e
            int r0 = r7.height()
            if (r0 > 0) goto L_0x005d
        L_0x002e:
            java.lang.String r1 = "BlurDrawable"
            java.lang.String r0 = ": content width and height must be > 0"
            java.lang.String r5 = X.002.A0R(r1, r0)
            java.lang.String r4 = "Owner is "
            java.lang.String r3 = r2.A0G
            java.lang.String r1 = " retry="
            int r0 = r2.A00
            java.lang.String r0 = X.002.A07(r0, r4, r3, r1)
            X.0wb.A03(r5, r0)
            int r1 = r2.A00
            int r0 = r1 + 1
            r2.A00 = r0
            r0 = 3
            if (r1 >= r0) goto L_0x0056
        L_0x004e:
            X.WjA r0 = new X.WjA
            r0.<init>(r2)
            X.0nA.A0q(r6, r0)
        L_0x0056:
            r2.invalidateSelf()
            r0 = 0
            r2.A08 = r0
        L_0x005c:
            return
        L_0x005d:
            android.graphics.drawable.shapes.RoundRectShape r5 = r2.A0E
            if (r5 == 0) goto L_0x0092
            android.graphics.Bitmap r0 = r2.A05
            if (r0 != 0) goto L_0x0092
            int r4 = r2.A03
            if (r4 == 0) goto L_0x0092
            int r3 = r2.A01
            if (r3 == 0) goto L_0x0092
            float r1 = (float) r4
            float r0 = (float) r3
            r5.resize(r1, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r3, r0)
            r2.A05 = r1
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r2.A06 = r0
            r0 = 7
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r0)
            r2.A07 = r1
            r0 = -1
            r1.setColor(r0)
            android.graphics.Paint r0 = r2.A07
            X.AnonymousClass7TE.A1Q(r0)
        L_0x0092:
            boolean r0 = r2.A09
            r4 = 0
            if (r0 == 0) goto L_0x00a7
            r3 = 0
        L_0x0098:
            android.graphics.Rect[] r1 = r2.A0I
            int r0 = r1.length
            if (r3 >= r0) goto L_0x00a7
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0098
        L_0x00a7:
            android.view.View[] r10 = r2.A0J
            int r11 = r2.A0C
            int r12 = r2.A0B
            android.graphics.Rect[] r9 = r2.A0I
            android.graphics.Bitmap[] r8 = r2.A0H
            android.graphics.Bitmap r0 = X.C56598I3o.A01(r7, r8, r9, r10, r11, r12)
            r2.A04 = r0
            r2.A09 = r4
            goto L_0x0056
        L_0x00ba:
            java.lang.Object r4 = r13.A01
            X.ViO r4 = (X.C17933ViO) r4
            long r5 = r4.A00
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0126
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r11 - r5
        L_0x00cb:
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            X.VM5 r0 = r4.A07
            android.widget.ListView r0 = r0.A00
            int r9 = r0.getFirstVisiblePosition()
            int r8 = r0.getLastVisiblePosition()
        L_0x00dd:
            r6 = 0
            if (r9 > r8) goto L_0x013a
            java.util.Queue r10 = r4.A09
            java.lang.Object r7 = r10.poll()
            X.VRK r7 = (X.VRK) r7
            if (r7 != 0) goto L_0x00ef
            X.VRK r7 = new X.VRK
            r7.<init>()
        L_0x00ef:
            r2 = 0
        L_0x00f1:
            java.util.List r0 = r4.A03
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x011a
            java.util.List r0 = r4.A03
            java.lang.Object r5 = r0.get(r6)
            X.VRK r5 = (X.VRK) r5
            int r0 = r5.A00
            if (r0 != r9) goto L_0x0117
            long r2 = r5.A01
            long r2 = r2 + r11
            java.util.List r0 = r4.A03
            r0.remove(r6)
            r0 = -1
            r5.A00 = r0
            r0 = -1
            r5.A01 = r0
            r10.offer(r5)
        L_0x0117:
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x011a:
            r7.A00 = r9
            r7.A01 = r2
            java.util.List r0 = r4.A01
            r0.add(r7)
            int r9 = r9 + 1
            goto L_0x00dd
        L_0x0126:
            r11 = 0
            goto L_0x00cb
        L_0x0129:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x013d
            java.util.Queue r1 = r4.A09
            java.util.List r0 = r4.A03
            java.lang.Object r0 = r0.remove(r6)
            r1.offer(r0)
        L_0x013a:
            java.util.List r0 = r4.A03
            goto L_0x0129
        L_0x013d:
            java.util.List r2 = r4.A02
            r2.clear()
            java.util.List r0 = r4.A01
            r2.addAll(r0)
            java.util.List r0 = r4.A08
            java.util.Iterator r1 = r0.iterator()
        L_0x014d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r1.next()
            X.X3G r0 = (X.X3G) r0
            r0.DvO(r2)
            goto L_0x014d
        L_0x015d:
            java.util.List r1 = r4.A03
            java.util.List r0 = r4.A01
            r4.A03 = r0
            r4.A01 = r1
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005c
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r3 = r4.A06
            r0.removeFrameCallback(r3)
            android.view.Choreographer r2 = android.view.Choreographer.getInstance()
            long r0 = r4.A05
            r2.postFrameCallbackDelayed(r3, r0)
            return
        L_0x017c:
            java.lang.Object r7 = r13.A01
            X.U0x r7 = (X.C14676U0x) r7
            long r8 = r7.A00
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x018f
            r3 = 16000000(0xf42400, double:7.9050503E-317)
            long r8 = r14 - r3
            r7.A00 = r8
        L_0x018f:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r14 - r8
            long r3 = r0.toMillis(r3)
            r7.A00 = r14
            java.util.List r8 = r7.A07
            java.util.Iterator r12 = r8.iterator()
        L_0x019f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r10 = r12.next()
            X.VhV r10 = (X.C17878VhV) r10
            float r5 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 / r0
            X.VvC r11 = r10.A03
            r11.A01(r5)
            X.VuP r9 = r10.A04
            r11.A02(r9, r5)
            long r5 = r10.A00
            long r5 = r5 + r3
            r10.A00 = r5
            android.graphics.Rect r0 = r7.getBounds()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x019f
            float r5 = r11.A09
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            float r6 = r9.A06
            X.VXd r0 = r10.A02
            int r0 = r0.A00
            float r5 = (float) r0
            float r0 = r9.A03
            float r5 = r5 * r0
            float r6 = r6 - r5
            android.graphics.Rect r0 = r7.getBounds()
            int r0 = r0.bottom
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x019f
            r12.remove()
            goto L_0x019f
        L_0x01e9:
            r7.invalidateSelf()
            boolean r0 = X.AnonymousClass7TE.A1b(r8)
            if (r0 == 0) goto L_0x01fa
            android.view.Choreographer r1 = r7.A04
            android.view.Choreographer$FrameCallback r0 = r7.A03
            r1.postFrameCallback(r0)
            return
        L_0x01fa:
            r7.A00 = r1
            X.X0y r0 = r7.A01
            if (r0 == 0) goto L_0x005c
            X.WKz r0 = (X.C19092WKz) r0
            android.view.ViewGroup r1 = r0.A00
            X.U3J r0 = r0.A01
            r1.removeView(r0)
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L_0x005c
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0215:
            java.lang.Object r0 = r13.A01
            X.7Nm r0 = (X.C330607Nm) r0
            r0.A00(r14)
            return
        L_0x021d:
            java.lang.Object r10 = r13.A01
            X.SOf r10 = (X.C11346SOf) r10
            java.util.ArrayDeque[] r9 = r10.A03
            monitor-enter(r9)
            r0 = 0
            r10.A02 = r0     // Catch:{ all -> 0x0258 }
            int r8 = r9.length     // Catch:{ all -> 0x0258 }
            r7 = 0
        L_0x0229:
            if (r7 >= r8) goto L_0x0253
            r4 = r9[r7]     // Catch:{ all -> 0x0258 }
            int r3 = r4.size()     // Catch:{ all -> 0x0258 }
            r2 = 0
        L_0x0232:
            if (r2 >= r3) goto L_0x0250
            java.lang.Object r0 = r4.pollFirst()     // Catch:{ all -> 0x0258 }
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0     // Catch:{ all -> 0x0258 }
            if (r0 == 0) goto L_0x0246
            r0.doFrame(r14)     // Catch:{ all -> 0x0258 }
            int r0 = r10.A00     // Catch:{ all -> 0x0258 }
            int r0 = r0 + -1
            r10.A00 = r0     // Catch:{ all -> 0x0258 }
            goto L_0x024d
        L_0x0246:
            java.lang.String r1 = "ReactNative"
            java.lang.String r0 = "Tried to execute non-existent frame callback"
            X.0I1.A03(r1, r0)     // Catch:{ all -> 0x0258 }
        L_0x024d:
            int r2 = r2 + 1
            goto L_0x0232
        L_0x0250:
            int r7 = r7 + 1
            goto L_0x0229
        L_0x0253:
            X.C11346SOf.A00(r10)     // Catch:{ all -> 0x0258 }
            monitor-exit(r9)
            return
        L_0x0258:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x025b:
            java.lang.Object r7 = r13.A01
            X.WH5 r7 = (X.WH5) r7
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0269
            android.view.Choreographer r0 = r7.A03
            r0.removeFrameCallback(r13)
            return
        L_0x0269:
            long r3 = r7.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x027b
            r7.A00 = r14
            r7.A01 = r14
        L_0x0275:
            android.view.Choreographer r0 = r7.A03
            r0.postFrameCallback(r13)
            return
        L_0x027b:
            long r3 = r7.A01
            long r1 = r14 - r3
            r7.A01 = r14
            X.0KI r0 = r7.A04
            r0.DGv(r1)
            goto L_0x0275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W81.doFrame(long):void");
    }
}
