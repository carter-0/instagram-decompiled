package X;

import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9SF  reason: invalid class name */
public abstract class AnonymousClass9SF {
    public static final C321056tV A00(Drawable drawable) {
        if (drawable instanceof AnonymousClass5MI) {
            AnonymousClass5MI r2 = (AnonymousClass5MI) drawable;
            if (r2 != null) {
                drawable = r2.AfT();
            } else {
                drawable = null;
            }
        }
        if (drawable instanceof C347017w8) {
            drawable = ((C347017w8) drawable).A04();
        }
        if (drawable instanceof C321056tV) {
            return (C321056tV) drawable;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r2 instanceof X.AnonymousClass9X8) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9X8 A01(android.graphics.drawable.Drawable r2) {
        /*
            boolean r0 = r2 instanceof X.C347017w8
            if (r0 == 0) goto L_0x000a
            X.7w8 r2 = (X.C347017w8) r2
            android.graphics.drawable.Drawable r2 = r2.A04()
        L_0x000a:
            boolean r0 = r2 instanceof X.AnonymousClass9X8
            if (r0 != 0) goto L_0x001f
            boolean r0 = r2 instanceof X.B1L
            r1 = 0
            if (r0 == 0) goto L_0x0024
            X.B1L r2 = (X.B1L) r2
            if (r2 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r2 = r2.Aco()
        L_0x001b:
            boolean r0 = r2 instanceof X.AnonymousClass9X8
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            X.9X8 r2 = (X.AnonymousClass9X8) r2
            return r2
        L_0x0022:
            r2 = r1
            goto L_0x001b
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9SF.A01(android.graphics.drawable.Drawable):X.9X8");
    }

    public static final AnonymousClass5MJ A02(Drawable drawable) {
        if (drawable instanceof C347017w8) {
            drawable = ((C347017w8) drawable).A04();
        }
        if (drawable instanceof AnonymousClass5MJ) {
            return (AnonymousClass5MJ) drawable;
        }
        return null;
    }

    public static final boolean A03(Drawable drawable) {
        C306386Ly r1;
        if (!(drawable instanceof C306386Ly) || (r1 = (C306386Ly) drawable) == null || r1.A0I == null) {
            return false;
        }
        return true;
    }

    public static final boolean A05(Set set) {
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C321056tV A00 = A00(AnonymousClass7TE.A0Z(it));
                if (A00 != null && ((C321016tR) A00).A0s) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A04(Drawable drawable) {
        if (A00(drawable) == null && A02(drawable) == null && !A03(drawable)) {
            return false;
        }
        return true;
    }
}
