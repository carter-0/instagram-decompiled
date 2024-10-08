package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.KFj  reason: case insensitive filesystem */
public final class C61633KFj extends C232222tE {
    public final int A00;
    public final C63587Kza A01;
    public final C355618Qr A02;

    public C61633KFj(C63587Kza kza, C355618Qr r3, int i) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A00 = i;
        this.A01 = kza;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = MediaPickerItemView.A0X;
        MediaPickerItemView mediaPickerItemView = new MediaPickerItemView(AnonymousClass7TE.A0S(viewGroup), (MUN) null, false);
        mediaPickerItemView.setMinimumHeight(this.A00);
        return new C60523Jmu(mediaPickerItemView);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r20, C249703kE r21) {
        C64755LhX lhX = (C64755LhX) r20;
        C60523Jmu jmu = (C60523Jmu) r21;
        AnonymousClass7TF.A1H(lhX, jmu);
        MediaPickerItemView mediaPickerItemView = jmu.A00;
        AnonymousClass0fU.A00(LYA.A00(lhX, mediaPickerItemView, this, 2), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new LYU(mediaPickerItemView, 0));
        GalleryItem galleryItem = lhX.A00;
        mediaPickerItemView.A03(new AnonymousClass9I9((DefaultConstructorMarker) null, 0, 0, 15, 3, false, false), this.A02, galleryItem, false, false, false, false);
    }

    public final Class modelClass() {
        return C64755LhX.class;
    }
}
