package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8iT  reason: invalid class name and case insensitive filesystem */
public final class C362778iT implements C328777Ge {
    public int A00 = 10;
    public List A01;
    public List A02;
    public List A03 = new ArrayList();
    public final C355638Qt A04 = new C355638Qt(0);
    public final Set A05 = new HashSet();

    public final boolean A8m(AnonymousClass9SZ r4) {
        0qQ.A0B(r4, 0);
        if (this.A01.size() >= this.A00) {
            return false;
        }
        this.A01 = 00k.A0T(r4, this.A01);
        A01(this);
        return true;
    }

    public final void AAH(Bitmap bitmap, int i) {
    }

    public final int Brp() {
        return -1;
    }

    public final Bitmap BxA(int i) {
        return null;
    }

    public final int CMJ(Medium medium) {
        0qQ.A0B(medium, 0);
        int i = 0;
        for (AnonymousClass9SZ r0 : this.A01) {
            if (medium.equals(r0.A01.A00)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void Cof(int i, int i2) {
    }

    private final int A00(GalleryItem galleryItem) {
        int i = 0;
        for (AnonymousClass9SZ r0 : this.A01) {
            if (galleryItem.equals(r0.A01)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void A01(C362778iT r20) {
        C362778iT r3 = r20;
        List list = r3.A01;
        List list2 = r3.A02;
        C355638Qt r6 = r3.A04;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (!list2.isEmpty()) {
            int size = list2.size();
            for (int size2 = list.size(); size2 < size; size2++) {
                int durationInMs = (int) ((C279454yf) list2.get(size2)).getDurationInMs();
                arrayList.add(new AnonymousClass9SZ(new GalleryItem((Draft) null, (GeneratedMediaMetadata) null, (Medium) null, (RemoteMedia) null, (AnonymousClass8y3) null, (ImageUrl) null, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A1F, String.valueOf(r6.A00(002.A0O("empty_segment_", size2))), durationInMs), (Bitmap) null));
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        0qQ.A07(unmodifiableList);
        r3.A03 = unmodifiableList;
        boolean isEmpty = unmodifiableList.isEmpty();
        Iterator it = r3.A05.iterator();
        if (isEmpty) {
            while (it.hasNext()) {
                ((AnonymousClass8QO) it.next()).DMW();
            }
            return;
        }
        while (it.hasNext()) {
            ((AnonymousClass8QO) it.next()).DMZ(00k.A0a(r3.A03));
        }
    }

    public final void A91(AnonymousClass8QO r2) {
        this.A05.add(r2);
    }

    public final AnonymousClass9SZ BJM(int i) {
        return (AnonymousClass9SZ) this.A03.get(i);
    }

    public final int BPA() {
        return this.A00;
    }

    public final List Brk() {
        return this.A01;
    }

    public final AnonymousClass9SZ Brm(int i) {
        return (AnonymousClass9SZ) this.A01.get(i);
    }

    public final void Eje(int i) {
        for (AnonymousClass8QO DMM : this.A05) {
            DMM.DMM((AnonymousClass9SZ) this.A03.get(i), i);
        }
    }

    public final void clear() {
        this.A01 = 0sn.A00;
        A01(this);
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final boolean isEmpty() {
        return this.A03.isEmpty();
    }

    public final void removeItem(int i) {
        if (i >= 0 && i < this.A01.size()) {
            List list = this.A01;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                if (i2 != i) {
                    arrayList.add(next);
                }
                i2 = i3;
            }
            this.A01 = arrayList;
            A01(this);
        }
    }

    public C362778iT() {
        0sn r0 = 0sn.A00;
        this.A01 = r0;
        this.A02 = r0;
    }

    public final int CMB(GalleryItem galleryItem) {
        return A00(galleryItem);
    }

    public final boolean CbT(GalleryItem galleryItem) {
        if (A00(galleryItem) != -1) {
            return true;
        }
        return false;
    }

    public final void EDm(GalleryItem galleryItem) {
        removeItem(A00(galleryItem));
    }

    public final void EaZ(List list) {
        this.A01 = 00k.A0a(list);
        A01(this);
    }

    public final void Eco(int i) {
        this.A00 = i;
    }
}
