package X;

import android.view.ViewGroup;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Jkl  reason: case insensitive filesystem */
public final class C60392Jkl extends 2Rw {
    public final MUO A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = MediaPickerItemView.A0X;
        return new C60540JnB(new MediaPickerItemView(AnonymousClass7TE.A0S(viewGroup), (MUN) null, true));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r19, int i) {
        C60540JnB jnB = (C60540JnB) r19;
        0qQ.A0B(jnB, 0);
        GalleryItem galleryItem = (GalleryItem) this.A01.get(i);
        MediaPickerItemView mediaPickerItemView = jnB.A00;
        AnonymousClass0fU.A00(LYA.A00(mediaPickerItemView, galleryItem, this, 14), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new LYU(mediaPickerItemView, 1));
        0qQ.A0B(galleryItem, 0);
        List list = this.A02;
        String str = galleryItem.A0A;
        mediaPickerItemView.A04(new AnonymousClass9I9((DefaultConstructorMarker) null, list.indexOf(str), 0, 4, 3, C51970G9q.A1W(list.indexOf(str), -1), false), galleryItem, C65793Lzl.A00, true, false, false, false, false, true);
    }

    public C60392Jkl(MUO muo) {
        this.A00 = muo;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1077353631);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-622305816, A03);
        return size;
    }
}
