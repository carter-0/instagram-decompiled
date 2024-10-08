package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.2hO  reason: invalid class name and case insensitive filesystem */
public final class C226602hO implements AnonymousClass2hP {
    public static final WeakHashMap A01 = new WeakHashMap();
    public final WeakReference A00;

    public final boolean CFf(Rect rect, Rect rect2, Rect rect3) {
        0qQ.A0B(rect, 0);
        0qQ.A0B(rect2, 1);
        0qQ.A0B(rect3, 2);
        View view = (View) this.A00.get();
        if (view != null) {
            Point point = AnonymousClass3P1.A00;
            if (!view.isShown()) {
                rect.setEmpty();
                rect2.setEmpty();
            } else {
                Point point2 = AnonymousClass3P1.A00;
                if (!view.getGlobalVisibleRect(rect, point2) || !rect.intersect(rect3)) {
                    rect2.setEmpty();
                    rect.setEmpty();
                    return false;
                }
                int i = point2.x;
                rect2.set(i, point2.y, i + view.getWidth(), point2.y + view.getHeight());
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = r4.A00.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L_0x0027
            r2 = 0
            if (r5 == 0) goto L_0x0028
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r4.getClass()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.ref.WeakReference r0 = r4.A00
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0028
            X.2hO r5 = (X.C226602hO) r5
            java.lang.ref.WeakReference r0 = r5.A00
            java.lang.Object r0 = r0.get()
            if (r1 == r0) goto L_0x0027
            r3 = 0
        L_0x0027:
            return r3
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226602hO.equals(java.lang.Object):boolean");
    }

    public final Context getContext() {
        View view = (View) this.A00.get();
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    public final int hashCode() {
        Object obj = this.A00.get();
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C226602hO(View view) {
        this.A00 = new WeakReference(view);
    }
}
