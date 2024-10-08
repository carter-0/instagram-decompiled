package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jlb  reason: case insensitive filesystem */
public final class C60443Jlb extends 2Rw implements AnonymousClass8XX {
    public final int A00;
    public final int A01;
    public final C355618Qr A02;
    public final C64712Lgl A03;
    public final List A04 = AnonymousClass7TE.A1C();

    public final void Ecr(Integer num, String str, List list) {
        0qQ.A0B(list, 0);
        List list2 = this.A04;
        list2.clear();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((Medium) next).A03 >= 5000) {
                A1C.add(next);
            }
        }
        list2.addAll(A1C);
        notifyDataSetChanged();
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r10, int i) {
        C60699Jpk jpk = (C60699Jpk) r10;
        0qQ.A0B(jpk, 0);
        Medium medium = (Medium) this.A04.get(i);
        0qQ.A0B(medium, 0);
        IgImageView igImageView = jpk.A04;
        0qQ.A0C(igImageView, "null cannot be cast to non-null type android.widget.ImageView");
        igImageView.setImageBitmap((Bitmap) null);
        DbS.A1C(jpk.A03);
        jpk.A01 = medium;
        jpk.A00 = jpk.A02.AGH((C348297yD) null, jpk.A00, medium, jpk, (Integer) null, (Integer) null, (Integer) null);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0D = DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.gallery_grid_item, false);
        A0D.setVisibility(0);
        0nA.A0g(A0D, this.A01, this.A00);
        return new C60699Jpk(A0D, this.A02, this);
    }

    public final List AN0() {
        return 0sn.A00;
    }

    public final /* synthetic */ List BPh() {
        return 0sn.A00;
    }

    public C60443Jlb(C355618Qr r2, C64712Lgl lgl, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
        this.A03 = lgl;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1315933809);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(588774928, A032);
        return size;
    }
}
