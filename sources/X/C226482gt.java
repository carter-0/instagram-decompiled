package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import com.facebook.common.callercontext.CallerContextable;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2gt  reason: invalid class name and case insensitive filesystem */
public abstract class C226482gt extends Drawable implements Drawable.Callback, AnonymousClass2eH, CallerContextable {
    public static final String __redex_internal_original_name = "AsyncDrawable";
    public AnonymousClass2h2 A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03 = new Rect();
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A05 = new AnonymousClass2h3(this);
    public final AtomicBoolean A06 = new AtomicBoolean();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A01) {
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            Gravity.apply(this.A00.A00, getIntrinsicWidth(), getIntrinsicHeight(), bounds, this.A03, getLayoutDirection());
        }
        this.A01 = false;
        A02();
        C226492gu r0 = ((C226472gs) this).A00;
        if (r0 != null) {
            ((Drawable) r0).draw(canvas);
        }
    }

    public abstract int getIntrinsicHeight();

    public abstract int getIntrinsicWidth();

    public abstract int getOpacity();

    public void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01 = true;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public static final boolean A01(C226482gt r5) {
        if (!r5.A06.compareAndSet(true, false)) {
            return false;
        }
        C226512gw r4 = r5.A00.A02;
        r4.A06.decrementAndGet();
        C226512gw.A01(r4);
        Queue queue = r4.A03;
        Iterator it = queue.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object obj = ((Reference) it.next()).get();
            if (obj == null) {
                it.remove();
            } else if (obj.equals(r5)) {
                it.remove();
                break;
            }
        }
        if (queue.isEmpty() && r4.A04.isEmpty()) {
            AtomicReference atomicReference = r4.A07;
            1TY r1 = (1TY) atomicReference.get();
            if (r1 != null && 1FH.A00(r1, (Object) null, atomicReference)) {
                r1.A04();
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = (X.C226502gv) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A06
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0082
            X.2h2 r0 = r7.A00
            X.2gw r6 = r0.A02
            java.lang.String r1 = "attach_network_drawable"
            r0 = 767846591(0x2dc468bf, float:2.2329137E-11)
            X.0fh.A01(r1, r0)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A06     // Catch:{ all -> 0x007a }
            r0.incrementAndGet()     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r6.A08     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0023
            r0 = -1282289898(0xffffffffb391cf16, float:-6.7897574E-8)
            goto L_0x0076
        L_0x0023:
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x007a }
            r2.<init>(r7)     // Catch:{ all -> 0x007a }
            java.util.Queue r1 = r6.A03     // Catch:{ all -> 0x007a }
            r1.add(r2)     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r6.A08     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x006c
            java.lang.Object r0 = r6.A08     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0073
            java.util.concurrent.atomic.AtomicReference r5 = r6.A07     // Catch:{ all -> 0x007a }
            java.lang.Object r0 = r5.get()     // Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0073
            r1 = r6
            X.2gv r1 = (X.C226502gv) r1     // Catch:{ all -> 0x007a }
            java.lang.String r4 = r1.A02     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0073
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0073
            X.2gp r3 = r1.A05     // Catch:{ all -> 0x007a }
            X.2h0 r2 = X.C226502gv.A06     // Catch:{ all -> 0x007a }
            X.3JY r1 = new X.3JY     // Catch:{ all -> 0x007a }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x007a }
            X.3JZ r0 = new X.3JZ     // Catch:{ all -> 0x007a }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x007a }
            X.Tt1 r1 = new X.Tt1     // Catch:{ all -> 0x007a }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x007a }
            r0 = 0
            boolean r0 = X.1FH.A00(r0, r1, r5)     // Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0068
            java.util.concurrent.Executor r0 = r6.A05     // Catch:{ all -> 0x007a }
            r1.A06(r6, r0)     // Catch:{ all -> 0x007a }
            goto L_0x0073
        L_0x0068:
            r1.A04()     // Catch:{ all -> 0x007a }
            goto L_0x0073
        L_0x006c:
            r1.remove(r2)     // Catch:{ all -> 0x007a }
            r0 = 1027584743(0x3d3fb2e7, float:0.046801474)
            goto L_0x0076
        L_0x0073:
            r0 = -1725957405(0xffffffff991ffae3, float:-8.2707735E-24)
        L_0x0076:
            X.0fh.A00(r0)
            return
        L_0x007a:
            r1 = move-exception
            r0 = 455352837(0x1b242205, float:1.3576754E-22)
            X.0fh.A00(r0)
            throw r1
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226482gt.A02():void");
    }

    public final void EXb(int i) {
        AnonymousClass2h2 r1 = this.A00;
        if (r1.A00 != i) {
            r1.A00 = i;
            this.A01 = true;
            A00(this);
        }
    }

    public final int getAlpha() {
        return this.A00.A01.getAlpha();
    }

    public final Drawable mutate() {
        if (!this.A02 && super.mutate() == this) {
            this.A00 = new AnonymousClass2h2(this.A00);
            this.A02 = true;
        }
        return this;
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (z) {
            A02();
            this.A01 = true;
        } else {
            A01(this);
        }
        return super.setVisible(z, z2);
    }

    public C226482gt(AnonymousClass2h2 r3) {
        this.A00 = r3;
    }

    public static final void A00(C226482gt r2) {
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            r2.A05.run();
        } else {
            r2.A04.post(r2.A05);
        }
    }

    public final void finalize() {
        if (A01(this)) {
            C226512gw r2 = this.A00.A02;
            0I1.A02(C226482gt.class, "AsyncDrawable with id: %d (%s)  wasn't hidden before it was GC'd. Please call setVisible(false, ___ ) in View.onDetachedFromWindow()", new Object[]{Integer.valueOf(r2.A02), r2.A01});
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
