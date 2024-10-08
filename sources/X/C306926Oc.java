package X;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Oc  reason: invalid class name and case insensitive filesystem */
public final class C306926Oc implements AnonymousClass579 {
    public final List A00 = new ArrayList(2);

    public final void DEi(Drawable drawable, Throwable th, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).DEi(drawable, th, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void DFY(Drawable drawable, C240493Lc r11, int i, long j) {
        List list = this.A00;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            try {
                ((AnonymousClass579) list.get(i2)).DFY(drawable, r11, i, j);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void DLP(long j, Throwable th) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).DLP(j, th);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void DLR(C240493Lc r5, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).DLR(r5, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void DXM(Drawable drawable, long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).DXM(drawable, j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void Dd0(long j) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).Dd0(j);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final void Dny(long j, Object obj) {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                ((AnonymousClass579) list.get(i)).Dny(j, obj);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
