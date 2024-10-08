package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jla  reason: case insensitive filesystem */
public final class C60442Jla extends 2Rw implements AnonymousClass8XX {
    public final Context A00;
    public final C355618Qr A01;
    public final MUN A02;
    public final List A03 = AnonymousClass7TE.A1C();

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public final /* synthetic */ List BPh() {
        return 0sn.A00;
    }

    public final void Ecr(Integer num, String str, List list) {
        List list2 = this.A03;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium A0W = JTO.A0W(it);
            0qQ.A0B(A0W, 1);
            list2.add(JTR.A0f(A0W));
        }
        notifyDataSetChanged();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r12, int i) {
        MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) r12.itemView;
        GalleryItem galleryItem = (GalleryItem) this.A03.get(i);
        AnonymousClass9I9 r2 = new AnonymousClass9I9();
        MediaPickerItemView mediaPickerItemView2 = mediaPickerItemView;
        GalleryItem galleryItem2 = galleryItem;
        AnonymousClass9I9 r10 = r2;
        AnonymousClass0fU.A00(new C64249LXb(11, this, mediaPickerItemView2, galleryItem2, r10), mediaPickerItemView);
        mediaPickerItemView.setOnLongClickListener(new LYX(2, this, mediaPickerItemView2, galleryItem2, r10));
        mediaPickerItemView.A03(r2, this.A01, galleryItem, false, false, false, false);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C249703kE(new MediaPickerItemView(this.A00));
    }

    public C60442Jla(Context context, C355618Qr r3, MUN mun) {
        this.A00 = context;
        this.A01 = r3;
        this.A02 = mun;
    }

    public final List AN0() {
        return AnonymousClass7TE.A1C();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1695667109);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(-1605918793, A032);
        return size;
    }
}
