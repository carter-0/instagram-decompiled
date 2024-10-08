package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jld  reason: case insensitive filesystem */
public final class C60445Jld extends 2Rw implements AnonymousClass8XX {
    public final int A00;
    public final C355618Qr A01;
    public final C66440MRu A02;
    public final Integer A03;
    public final ArrayList A04 = AnonymousClass7TE.A1C();
    public final boolean A05;

    public final void Ecr(Integer num, String str, List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = this.A04;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final void Ejh(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r11, int i) {
        C60702Jpn jpn = (C60702Jpn) r11;
        0qQ.A0B(jpn, 0);
        Medium medium = (Medium) DbZ.A0g(this.A04, i);
        0qQ.A0B(medium, 0);
        jpn.A02 = medium;
        ? r2 = jpn.A04;
        r2.A01 = medium.A07;
        boolean CeS = medium.CeS();
        IgTextView igTextView = jpn.A03;
        if (CeS) {
            igTextView.setText(medium.B8E());
            igTextView.setVisibility(0);
        } else {
            igTextView.setVisibility(4);
        }
        View.OnLayoutChangeListener onLayoutChangeListener = jpn.A00;
        if (onLayoutChangeListener != null) {
            r2.removeOnLayoutChangeListener(onLayoutChangeListener);
            jpn.A00 = null;
        }
        r2.setImageDrawable((Drawable) null);
        JTR.A1B(r2);
        jpn.A01 = this.A01.AGH((C348297yD) null, jpn.A01, medium, jpn, (Integer) null, (Integer) null, (Integer) null);
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0A = DbU.A0A(DbX.A0F(viewGroup, 0), viewGroup, R.layout.gallery_sticker_grid_item, false);
        0nA.A0V(A0A, this.A00);
        return new C60702Jpn(A0A, this.A02, this.A03, this.A05);
    }

    public final /* synthetic */ List BPh() {
        return 0sn.A00;
    }

    public C60445Jld(C355618Qr r2, C66440MRu mRu, Integer num, int i, boolean z) {
        this.A01 = r2;
        this.A00 = i;
        this.A02 = mRu;
        this.A05 = z;
        this.A03 = num;
    }

    public final List AN0() {
        return AnonymousClass7TE.A1C();
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1476487044);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(-684206348, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(-455732734);
        long hashCode = (long) ((Medium) this.A04.get(i)).A0X.hashCode();
        AnonymousClass0fD.A0A(-1594246343, A032);
        return hashCode;
    }
}
