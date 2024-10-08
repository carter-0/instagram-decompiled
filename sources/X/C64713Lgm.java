package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Draft;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.Lgm  reason: case insensitive filesystem */
public final class C64713Lgm implements C41814B1u {
    public final /* synthetic */ C376529Ii A00;
    public final /* synthetic */ C60656Jp3 A01;

    public final void DrR(Bitmap bitmap, Draft draft) {
        String str;
        String str2 = draft.A04;
        C60656Jp3 jp3 = this.A01;
        Draft draft2 = jp3.A01;
        if (draft2 != null) {
            str = draft2.A04;
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str)) {
            Bitmap bitmap2 = bitmap;
            if (bitmap != null) {
                JXQ.A00.A03(bitmap2, this.A00, jp3.A05, (C62320sa) null, 0);
            } else {
                JXQ.A02(this.A00, jp3.A05);
            }
            GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = jp3.A04.A00;
            galleryPickerMediaOverlayView.A0B = AnonymousClass7TF.A1V(bitmap);
            galleryPickerMediaOverlayView.invalidate();
            jp3.A03.invalidate();
        }
    }

    public C64713Lgm(C376529Ii r1, C60656Jp3 jp3) {
        this.A01 = jp3;
        this.A00 = r1;
    }

    public final boolean CWO(Draft draft) {
        Draft draft2 = this.A01.A01;
        if (draft2 == null || !0qQ.A0K(draft.A04, draft2.A04)) {
            return false;
        }
        return true;
    }
}
