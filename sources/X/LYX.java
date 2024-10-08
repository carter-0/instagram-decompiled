package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;

public final class LYX implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public LYX(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A03 = obj3;
    }

    public final boolean onLongClick(View view) {
        C62320sa r4;
        MediaPickerItemView mediaPickerItemView;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                GalleryItem galleryItem = (GalleryItem) this.A02;
                boolean A05 = galleryItem.A05();
                boolean A06 = galleryItem.A06();
                boolean z = ((C59739JVx) this.A04).A03.A06;
                MJ0 mj0 = new MJ0(this.A03, 27);
                0qQ.A0B(context, 0);
                if (!A05) {
                    C59848JaO.A01(context, A06);
                    return false;
                } else if (z) {
                    return AnonymousClass7TE.A1a(mj0.invoke());
                } else {
                    return false;
                }
            case 1:
                LQQ lqq = (LQQ) this.A03;
                mediaPickerItemView = lqq.A00;
                r4 = new C58699Iw8(25, this.A01, this.A04, lqq, this.A02);
                break;
            case 2:
                mediaPickerItemView = (MediaPickerItemView) this.A02;
                GalleryItem galleryItem2 = (GalleryItem) this.A03;
                r4 = new MBR((AnonymousClass9I9) this.A04, galleryItem2, mediaPickerItemView, (C60442Jla) this.A01);
                break;
            default:
                return false;
        }
        return C59848JaO.A02(mediaPickerItemView, r4);
    }
}
