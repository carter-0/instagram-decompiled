package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.JXo  reason: case insensitive filesystem */
public final class C59771JXo implements C328787Gf {
    public int A00 = -1;
    public final List A01 = AnonymousClass7TE.A1C();
    public final Set A02 = AnonymousClass7TE.A1F();

    public final void A00(AnonymousClass831 r19) {
        AnonymousClass831 r3 = r19;
        ArrayList A0q = AnonymousClass7TF.A0q(r3, 0);
        int A08 = JTO.A08(r3);
        for (int i = 0; i < A08; i++) {
            AnonymousClass51R r5 = ((AnonymousClass51M) r3.A03(i)).A0F;
            boolean A1P = AnonymousClass7TF.A1P(r5.A08);
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = r5.A09;
            int i3 = r5.A05;
            int i4 = r5.A07;
            A0q.add(new AnonymousClass9SZ(new GalleryItem(new C349307zv(AnonymousClass7TE.A0t(r5.A0F), (Integer) null, r5.A0D, i2, i3, i4, currentTimeMillis, currentTimeMillis, false, A1P, true)), (Bitmap) null));
        }
        EaZ(A0q);
    }

    public final boolean A8m(AnonymousClass9SZ r4) {
        0qQ.A0B(r4, 0);
        List list = this.A01;
        int size = list.size();
        list.add(size, r4);
        for (AnonymousClass8QO DLn : this.A02) {
            DLn.DLn(r4, size);
        }
        return true;
    }

    public final void A91(AnonymousClass8QO r2) {
        0qQ.A0B(r2, 0);
        this.A02.add(r2);
    }

    public final void EDm(GalleryItem galleryItem) {
        String str = galleryItem.A0A;
        0qQ.A0B(str, 0);
        List list = this.A01;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (!0qQ.A0K(((AnonymousClass9SZ) list.get(i)).A01.A0A, str)) {
                i++;
            } else if (i >= 0) {
                removeItem(i);
                return;
            } else {
                return;
            }
        }
    }

    public final void clear() {
        throw AnonymousClass00P.createAndThrow();
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

    public final void EaZ(List list) {
        List list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        for (AnonymousClass8QO DMZ : this.A02) {
            DMZ.DMZ(list);
        }
    }

    public final void Eje(int i) {
        AnonymousClass9SZ r0;
        this.A00 = i;
        for (AnonymousClass8QO r1 : this.A02) {
            if (i == -1) {
                r0 = null;
            } else {
                r0 = (AnonymousClass9SZ) this.A01.get(i);
            }
            r1.DMM(r0, i);
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
