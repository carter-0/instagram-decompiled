package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JbL  reason: case insensitive filesystem */
public final class C59896JbL implements C348257y9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C59896JbL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final boolean CWP(Medium medium) {
        String valueOf;
        if (this.A00 != 0) {
            0qQ.A0B(medium, 0);
            Medium medium2 = ((C59739JVx) this.A03).A00;
            if (medium2 == null || (valueOf = String.valueOf(medium2.A05)) == null || !valueOf.equals(String.valueOf(medium.A05))) {
                return false;
            }
            return true;
        }
        0qQ.A0B(medium, 0);
        return 2PP.A00(this.A02, medium);
    }

    public final void DLY(Medium medium, String str) {
        String str2;
        if (this.A00 != 0) {
            0qQ.A0B(medium, 0);
            C59739JVx jVx = (C59739JVx) this.A03;
            Medium medium2 = jVx.A00;
            if (medium2 != null) {
                str2 = String.valueOf(medium2.A05);
            } else {
                str2 = null;
            }
            if (0qQ.A0K(str2, String.valueOf(medium.A05))) {
                JXQ.A02((C376529Ii) this.A02, jVx.A03);
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = ((C59851JaS) this.A01).A00;
                galleryPickerMediaOverlayView.A0B = false;
                galleryPickerMediaOverlayView.invalidate();
                jVx.A01.invalidate();
                return;
            }
            return;
        }
        ((AnonymousClass4D7) this.A01).resumeWith(DbU.A0f());
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        String str;
        Bitmap bitmap2 = bitmap;
        if (this.A00 != 0) {
            0qQ.A0B(medium, 0);
            0qQ.A0B(bitmap, 2);
            C59739JVx jVx = (C59739JVx) this.A03;
            Medium medium2 = jVx.A00;
            if (medium2 != null) {
                str = String.valueOf(medium2.A05);
            } else {
                str = null;
            }
            if (0qQ.A0K(str, String.valueOf(medium.A05))) {
                JXQ.A00.A03(bitmap2, (C376529Ii) this.A02, jVx.A03, (C62320sa) null, medium.A07);
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = ((C59851JaS) this.A01).A00;
                galleryPickerMediaOverlayView.A0B = true;
                galleryPickerMediaOverlayView.invalidate();
                jVx.A01.invalidate();
                return;
            }
            return;
        }
        0qQ.A0B(bitmap, 2);
        ((AnonymousClass4D7) this.A01).resumeWith(new C239793Ih(BlurUtil.blur(bitmap, 0.25f, 15)));
    }
}
