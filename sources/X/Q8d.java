package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;

public final class Q8d extends View {
    public int A00;
    public int A01;
    public boolean A02 = true;
    public final Matrix A03 = AnonymousClass7TE.A0U();
    public final Matrix A04 = AnonymousClass7TE.A0U();
    public final Paint A05;
    public final C10825Ryl A06;
    public final Object A07 = Pxe.A0p();
    public final List A08 = AnonymousClass7TE.A1C();

    public Q8d(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        JTO.A1N(paint);
        paint.setStrokeWidth(0nA.A00(context, 1.0f));
        this.A05 = paint;
        this.A06 = new C10825Ryl(context, new C20611Wvs(this, 30));
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        A01(canvas, AnonymousClass05K.A00);
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [X.Rv2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v41, types: [X.R2s, X.S0k] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void setUnderlayBitmap(android.graphics.Bitmap r25) {
        /*
            r24 = this;
            r6 = 0
            r2 = r25
            X.0qQ.A0B(r2, r6)
            int r8 = r2.getWidth()
            int r5 = r2.getHeight()
            r4 = 1
            boolean r3 = X.AnonymousClass7TF.A1R(r8)
            java.lang.String r1 = "image width must be positive"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.17k.A0J(r3, r1, r0)
            boolean r3 = X.AnonymousClass7TF.A1R(r5)
            java.lang.String r1 = "image height must be positive"
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.17k.A0J(r3, r1, r0)
            r7 = r24
            java.lang.Object r1 = r7.A07
            monitor-enter(r1)
            r7.A01 = r8     // Catch:{ all -> 0x01b2 }
            r7.A00 = r5     // Catch:{ all -> 0x01b2 }
            r7.A02 = r4     // Catch:{ all -> 0x01b2 }
            monitor-exit(r1)
            r7.postInvalidate()
            monitor-enter(r1)
            java.util.List r0 = r7.A08     // Catch:{ all -> 0x01b2 }
            r0.clear()     // Catch:{ all -> 0x01b2 }
            monitor-exit(r1)
            r7.postInvalidate()
            X.KBA r0 = new X.KBA
            r0.<init>(r2, r7)
            r7.A02(r0)
            X.Ryl r5 = r7.A06
            java.util.Set r10 = r5.A07
            X.REI r0 = X.REI.REDACT
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x019d
            java.util.List r3 = r5.A04
            android.graphics.Paint r1 = r7.A05
            X.KBC r0 = new X.KBC
            r0.<init>(r1, r7, r3)
            r7.A02(r0)
            X.TXi r0 = X.C13373TXi.A00
            r9 = 2
            X.0qQ.A0B(r0, r9)
            X.RQO r11 = r5.A06
            X.MMv r8 = new X.MMv
            r8.<init>(r6, r0, r5)
            long r12 = android.os.SystemClock.elapsedRealtime()
            X.Rv9 r4 = new X.Rv9
            r4.<init>(r2)
            int r23 = r2.getHeight()
            int r22 = r2.getWidth()
            int r21 = r2.getAllocationByteCount()
            java.lang.Class<X.RQ1> r2 = X.RQ1.class
            monitor-enter(r2)
            X.Qw7 r1 = new X.Qw7     // Catch:{ all -> 0x017f }
            r1.<init>()     // Catch:{ all -> 0x017f }
            monitor-enter(r2)     // Catch:{ all -> 0x017f }
            X.R2s r0 = X.RQ1.A00     // Catch:{ all -> 0x017c }
            if (r0 != 0) goto L_0x0094
            X.R2s r0 = new X.R2s     // Catch:{ all -> 0x017c }
            r0.<init>()     // Catch:{ all -> 0x017c }
            X.RQ1.A00 = r0     // Catch:{ all -> 0x017c }
        L_0x0094:
            java.lang.Object r3 = r0.A00(r1)     // Catch:{ all -> 0x017c }
            X.SFp r3 = (X.C11215SFp) r3     // Catch:{ all -> 0x017c }
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            monitor-exit(r2)
            long r19 = X.Pxe.A0C(r12)
            X.XSZ r2 = X.XSZ.A02
            long r17 = android.os.SystemClock.elapsedRealtime()
            java.util.Map r14 = r3.A08
            java.lang.Object r0 = r14.get(r2)
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r14.get(r2)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r15 = r17 - r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 30
            long r12 = r12.toMillis(r0)
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x00d6
        L_0x00c4:
            X.TmZ r2 = r11.A00
            if (r2 == 0) goto L_0x019d
            X.02m r1 = X.C51965G9l.A0l()
            r0 = 391259957(0x17522735, float:6.7904146E-25)
            r1.markerStart(r0, r6)
            X.T90 r2 = (X.T90) r2
            monitor-enter(r2)
            goto L_0x0138
        L_0x00d6:
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            r14.put(r2, r0)
            X.RJ7 r13 = X.RJ7.A02
            X.RJ8 r14 = X.RJ8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            r21 = r21 & r0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r21)
            r23 = r23 & r0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r23)
            r22 = r22 & r0
            java.lang.Integer r16 = java.lang.Integer.valueOf(r22)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r19 = r19 & r0
            java.lang.Long r19 = java.lang.Long.valueOf(r19)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r6)
            X.RyM r12 = new X.RyM
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.Rv2 r0 = new X.Rv2
            r0.<init>()
            r0.A00 = r12
            X.Rsm r13 = new X.Rsm
            r13.<init>(r0)
            X.9GD r1 = r3.A02
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r12 = r1.A06()
            java.lang.String r12 = (java.lang.String) r12
        L_0x0124:
            X.RJJ r1 = X.RJJ.A01
            X.TJt r0 = new X.TJt
            r0.<init>(r2, r3, r13, r12)
            r1.execute(r0)
            goto L_0x00c4
        L_0x012f:
            X.SGm r1 = X.SGm.A01
            java.lang.String r0 = r3.A07
            java.lang.String r12 = r1.A00(r0)
            goto L_0x0124
        L_0x0138:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A04     // Catch:{ all -> 0x017f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0152
            java.lang.String r1 = "This detector is already closed!"
            r0 = 14
            X.RKk r4 = new X.RKk     // Catch:{ all -> 0x017f }
            r4.<init>((java.lang.String) r1, (int) r0)     // Catch:{ all -> 0x017f }
            X.9GD r3 = new X.9GD     // Catch:{ all -> 0x017f }
            r3.<init>()     // Catch:{ all -> 0x017f }
        L_0x014e:
            r3.A0B(r4)     // Catch:{ all -> 0x017f }
            goto L_0x0182
        L_0x0152:
            int r0 = r4.A00     // Catch:{ all -> 0x017f }
            r1 = 32
            if (r0 < r1) goto L_0x016e
            int r0 = r4.A01     // Catch:{ all -> 0x017f }
            if (r0 < r1) goto L_0x016e
            X.R2v r6 = r2.A02     // Catch:{ all -> 0x017f }
            java.util.concurrent.Executor r3 = r2.A03     // Catch:{ all -> 0x017f }
            X.TNI r1 = new X.TNI     // Catch:{ all -> 0x017f }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x017f }
            X.S0c r0 = r2.A00     // Catch:{ all -> 0x017f }
            X.RpW r0 = r0.A00     // Catch:{ all -> 0x017f }
            X.9GD r3 = r6.A01(r0, r1, r3)     // Catch:{ all -> 0x017f }
            goto L_0x0182
        L_0x016e:
            java.lang.String r1 = "InputImage width and height should be at least 32!"
            r0 = 3
            X.RKk r4 = new X.RKk     // Catch:{ all -> 0x017f }
            r4.<init>((java.lang.String) r1, (int) r0)     // Catch:{ all -> 0x017f }
            X.9GD r3 = new X.9GD     // Catch:{ all -> 0x017f }
            r3.<init>()     // Catch:{ all -> 0x017f }
            goto L_0x014e
        L_0x017c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017f }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x017f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0182:
            monitor-exit(r2)
            r0 = 26
            X.J6I r2 = new X.J6I
            r2.<init>(r8, r0)
            r0 = 4
            X.SzH r1 = new X.SzH
            r1.<init>(r0, r2)
            java.util.concurrent.Executor r0 = X.AnonymousClass9GH.A00
            r3.A04(r1, r0)
            X.Sz5 r0 = new X.Sz5
            r0.<init>(r8, r9)
            r3.A09(r0)
        L_0x019d:
            X.REI r0 = X.REI.DRAW
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01b1
            java.util.List r2 = r5.A03
            android.graphics.Paint r1 = r7.A05
            X.KBB r0 = new X.KBB
            r0.<init>(r1, r7, r2)
            r7.A02(r0)
        L_0x01b1:
            return
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q8d.setUnderlayBitmap(android.graphics.Bitmap):void");
    }

    private final void A00() {
        int i;
        int i2;
        if (this.A02 && (i = this.A01) > 0 && (i2 = this.A00) > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) getWidth(), AnonymousClass7TE.A03(this));
            Matrix matrix = this.A04;
            matrix.reset();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            matrix.invert(this.A03);
            this.A02 = false;
        }
    }

    private final void A01(Canvas canvas, Integer num) {
        synchronized (this.A07) {
            A00();
            for (LBv A002 : this.A08) {
                A002.A00(canvas, num);
            }
        }
    }

    public final void A02(LBv lBv) {
        synchronized (this.A07) {
            this.A08.add(lBv);
        }
    }

    public final int getImageHeight() {
        return this.A00;
    }

    public final int getImageWidth() {
        return this.A01;
    }

    public final Matrix getInverseTransformationMatrix() {
        return this.A03;
    }

    public final Paint getPaint() {
        return this.A05;
    }

    public final Matrix getTransformationMatrix() {
        return this.A04;
    }

    public final Bitmap getOverlayBitmap() {
        Bitmap A0B = AnonymousClass7TF.A0B(getWidth(), getHeight());
        A01(JTO.A0B(A0B), AnonymousClass05K.A01);
        return A0B;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1739908528);
        super.onSizeChanged(i, i2, i3, i4);
        synchronized (this.A07) {
            try {
                this.A02 = true;
                A00();
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                AnonymousClass0fD.A0D(-1215230562, A062);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-308163325);
        0qQ.A0B(motionEvent, 0);
        motionEvent.transform(this.A03);
        C10825Ryl ryl = this.A06;
        REI rei = ryl.A02;
        REI rei2 = REI.NONE;
        if (rei == rei2) {
            if (motionEvent.getActionMasked() == 0) {
                Iterator it = ryl.A04.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((L3V) next).A01.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        if (next != null) {
                            rei = REI.REDACT;
                        }
                    }
                }
            }
            rei = REI.DRAW;
            ryl.A02 = rei;
        }
        int ordinal = rei.ordinal();
        if (ordinal == 1) {
            ryl.A01 = new PointF(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                List list = ryl.A03;
                Path path = ryl.A00;
                path.moveTo(motionEvent.getX(), motionEvent.getY());
                list.add(path);
                02m A0l = C51965G9l.A0l();
                A0l.markerStart(391261324, 0);
                A0l.markerEnd(391261324, 0, 2);
            } else if (actionMasked == 1) {
                ryl.A00 = C51965G9l.A0C();
                ryl.A02 = rei2;
            } else if (actionMasked == 2) {
                PointF pointF = new PointF((ryl.A01.x + motionEvent.getX()) / 2.0f, (ryl.A01.y + motionEvent.getY()) / 2.0f);
                ryl.A00.quadTo(pointF.x, pointF.y, motionEvent.getX(), motionEvent.getY());
            }
            ryl.A08.invoke();
        } else if (ordinal == 2) {
            ryl.A05.onTouchEvent(motionEvent);
        }
        AnonymousClass0fD.A0C(949199816, A052);
        return true;
    }
}
