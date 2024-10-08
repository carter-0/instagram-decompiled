package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Gd  reason: invalid class name and case insensitive filesystem */
public final class C328767Gd implements C328777Ge {
    public int A00 = 10;
    public int A01 = -1;
    public final List A02 = new ArrayList();
    public final Set A03 = new HashSet();
    public final UserSession A04;

    public C328767Gd(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
    }

    public final boolean A8m(AnonymousClass9SZ r5) {
        0qQ.A0B(r5, 0);
        List list = this.A02;
        int size = list.size();
        if (size >= this.A00) {
            return false;
        }
        list.add(r5);
        for (AnonymousClass8QO DLn : this.A03) {
            DLn.DLn(r5, size);
        }
        return true;
    }

    public final void AAH(Bitmap bitmap, int i) {
    }

    public final int CMJ(Medium medium) {
        0qQ.A0B(medium, 0);
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (medium.equals(((AnonymousClass9SZ) list.get(i)).A01.A00)) {
                return i;
            }
        }
        return -1;
    }

    public final void A91(AnonymousClass8QO r2) {
        this.A03.add(r2);
    }

    public final AnonymousClass9SZ BJM(int i) {
        return (AnonymousClass9SZ) this.A02.get(i);
    }

    public final int BPA() {
        return this.A00;
    }

    public final List Brk() {
        List unmodifiableList = Collections.unmodifiableList(this.A02);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final AnonymousClass9SZ Brm(int i) {
        return (AnonymousClass9SZ) this.A02.get(i);
    }

    public final int Brp() {
        return this.A01;
    }

    public final Bitmap BxA(int i) {
        AnonymousClass9SZ r0 = (AnonymousClass9SZ) 00k.A0O(this.A02, i);
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public final int CMB(GalleryItem galleryItem) {
        List list = this.A02;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (galleryItem.equals(((AnonymousClass9SZ) list.get(i)).A01)) {
                return i;
            }
        }
        return -1;
    }

    public final void Cof(int i, int i2) {
        List list = this.A02;
        list.add(i2, list.remove(i));
        if (this.A01 == i) {
            this.A01 = i2;
        }
        for (AnonymousClass8QO DMA : this.A03) {
            DMA.DMA(i, i2);
        }
    }

    public final void EaZ(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        for (AnonymousClass8QO DMZ : this.A03) {
            DMZ.DMZ(list);
        }
    }

    public final void Eje(int i) {
        this.A01 = i;
        if (i >= 0) {
            List list = this.A02;
            if (i < list.size()) {
                AnonymousClass9SZ r2 = (AnonymousClass9SZ) list.get(i);
                for (AnonymousClass8QO DMM : this.A03) {
                    DMM.DMM(r2, i);
                }
            }
        }
    }

    public final void clear() {
        this.A02.clear();
        for (AnonymousClass8QO DMW : this.A03) {
            DMW.DMW();
        }
    }

    public final int getCount() {
        return this.A02.size();
    }

    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    public final void removeItem(int i) {
        List list = this.A02;
        if (i < list.size()) {
            AnonymousClass9SZ r2 = (AnonymousClass9SZ) list.remove(i);
            for (AnonymousClass8QO DMJ : this.A03) {
                DMJ.DMJ(r2, i);
            }
            this.A01 = -1;
        }
    }

    public final boolean CbT(GalleryItem galleryItem) {
        if (CMB(galleryItem) != -1) {
            return true;
        }
        return false;
    }

    public final void EDm(GalleryItem galleryItem) {
        int CMB = CMB(galleryItem);
        if (CMB >= 0) {
            removeItem(CMB);
        }
    }

    public final void Eco(int i) {
        this.A00 = i;
    }
}
