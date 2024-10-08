package X;

import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.WFt  reason: case insensitive filesystem */
public final class C18992WFt implements 0BT {
    public final /* synthetic */ C18447Vru A00;

    public C18992WFt(C18447Vru vru) {
        this.A00 = vru;
    }

    public final void DCo(Object obj) {
        C58900Bc r3 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r3) {
            SparseArray sparseArray = r3.A01;
            if (sparseArray.get(identityHashCode, (Object) null) != null) {
                sparseArray.remove(identityHashCode);
                r3.A02.delete(identityHashCode);
                r3.A00.remove(identityHashCode);
            }
        }
    }

    public final void DVA(Object obj) {
        C58900Bc r5 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r5) {
            Throwable th = new Throwable();
            r5.A01.append(identityHashCode, th);
            r5.A02.append(identityHashCode, true);
            r5.A00.append(identityHashCode, Long.valueOf(SystemClock.uptimeMillis()));
            if (14i.A08()) {
                r5.A04.Ew5(new 0Ba(AnonymousClass05K.A01, th, Collections.unmodifiableList(new ArrayList(r5.A05))), "CameraLeakListener:ON_OPEN_IN_BACKGROUND");
            }
        }
    }

    public final void Dd2(Object obj) {
        C58900Bc r7 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r7) {
            SparseBooleanArray sparseBooleanArray = r7.A02;
            if (sparseBooleanArray.get(identityHashCode, false)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                SparseArray sparseArray = r7.A00;
                if (sparseArray.get(identityHashCode, (Object) null) != null && uptimeMillis - ((Long) sparseArray.get(identityHashCode)).longValue() > 6000) {
                    r7.A04.Ew5(new 0Ba(AnonymousClass05K.A0C, (Throwable) r7.A01.get(identityHashCode), Collections.unmodifiableList(new ArrayList(r7.A05))), "CameraLeakListener:RELEASE_WITHOUT_PREVIEW");
                }
                sparseBooleanArray.delete(identityHashCode);
            }
            r7.A01.remove(identityHashCode);
            r7.A00.remove(identityHashCode);
        }
    }

    public final void DmY(Object obj) {
        C58900Bc r2 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r2) {
            r2.A02.delete(identityHashCode);
        }
    }

    public final void DnP(Object obj) {
    }
}
