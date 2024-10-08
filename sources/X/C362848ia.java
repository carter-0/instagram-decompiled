package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ia  reason: invalid class name and case insensitive filesystem */
public final class C362848ia implements AnonymousClass1MK {
    public List A00 = 0sn.A00;
    public final /* synthetic */ C362048hG A01;

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        0qQ.A0B(r6, 1);
        Bitmap bitmap = r6.A01;
        if (bitmap != null) {
            C362048hG r2 = this.A01;
            int i = 0;
            Medium medium = ((GalleryItem) this.A00.get(0)).A00;
            if (medium != null) {
                i = medium.A07;
            }
            C362048hG.A07(bitmap, r2, i);
            AnonymousClass8XA r1 = r2.A0w;
            List unmodifiableList = Collections.unmodifiableList(this.A00);
            0qQ.A07(unmodifiableList);
            r1.A0J(r2, unmodifiableList);
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public C362848ia(C362048hG r2) {
        this.A01 = r2;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        C362048hG r2 = this.A01;
        AnonymousClass8XA r1 = r2.A0w;
        List unmodifiableList = Collections.unmodifiableList(this.A00);
        0qQ.A07(unmodifiableList);
        r1.A0J(r2, unmodifiableList);
    }
}
