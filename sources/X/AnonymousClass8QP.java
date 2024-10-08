package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8QP  reason: invalid class name */
public final class AnonymousClass8QP implements C328787Gf {
    public int A00;
    public final List A01 = new ArrayList();
    public final Set A02 = new HashSet();

    public final int A00(String str) {
        Object obj;
        0qQ.A0B(str, 0);
        List list = this.A01;
        Iterator it = 0sr.A1R(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass9SZ) list.get(((Number) obj).intValue())).A01.A0A, str)) {
                break;
            }
        }
        Number number = (Number) obj;
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final boolean A01(AnonymousClass9SZ r5, int i) {
        List list = this.A01;
        if (list.size() >= 10) {
            return false;
        }
        list.add(i, r5);
        for (AnonymousClass8QO DLn : this.A02) {
            DLn.DLn(r5, i);
        }
        return true;
    }

    public final boolean A8m(AnonymousClass9SZ r2) {
        0qQ.A0B(r2, 0);
        return A01(r2, this.A01.size());
    }

    public final void clear() {
        this.A00 = 0;
        this.A01.clear();
        for (AnonymousClass8QO DMW : this.A02) {
            DMW.DMW();
        }
    }

    public final void A91(AnonymousClass8QO r2) {
        this.A02.add(r2);
    }

    public final void AAH(Bitmap bitmap, int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                ((AnonymousClass9SZ) list.get(i)).A00 = bitmap;
            }
        }
    }

    public final AnonymousClass9SZ BJM(int i) {
        return (AnonymousClass9SZ) this.A01.get(i);
    }

    public final int Brp() {
        return this.A00;
    }

    public final Bitmap BxA(int i) {
        return ((AnonymousClass9SZ) this.A01.get(i)).A00;
    }

    public final void Cof(int i, int i2) {
        List list = this.A01;
        list.add(i2, list.remove(i));
        if (this.A00 == i) {
            this.A00 = i2;
        }
        for (AnonymousClass8QO DMA : this.A02) {
            DMA.DMA(i, i2);
        }
    }

    public final void EDm(GalleryItem galleryItem) {
        int A002 = A00(galleryItem.A0A);
        if (A002 >= 0) {
            removeItem(A002);
        }
    }

    public final void EaZ(List list) {
        List list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        for (AnonymousClass8QO DMZ : this.A02) {
            DMZ.DMZ(list);
        }
    }

    public final void Eje(int i) {
        this.A00 = i;
        for (AnonymousClass8QO DMM : this.A02) {
            DMM.DMM((AnonymousClass9SZ) this.A01.get(i), i);
        }
    }

    public final int getCount() {
        return this.A01.size();
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final void removeItem(int i) {
        if (i >= 0) {
            List list = this.A01;
            if (i < list.size()) {
                AnonymousClass9SZ r2 = (AnonymousClass9SZ) list.remove(i);
                int i2 = this.A00;
                if (i < i2 || i2 >= list.size()) {
                    this.A00--;
                }
                for (AnonymousClass8QO DMJ : this.A02) {
                    DMJ.DMJ(r2, i);
                }
            }
        }
    }
}
