package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.List;

public final class UA3 extends 2Rw {
    public int A00 = -1;
    public ProductVariantDimension A01;
    public L76 A02;
    public final AnonymousClass0iw A03;
    public final List A04 = new ArrayList();
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14860UCo uCo = new C14860UCo(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_variant_tile, false));
        uCo.A00.setPlaceHolderColor(AnonymousClass7TF.A03(DbS.A07(uCo), R.attr.dividerColor));
        return uCo;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C14860UCo uCo = (C14860UCo) r6;
        0qQ.A0B(uCo, 0);
        if (this.A01 == null) {
            uCo.A01.setVisibility(8);
            return;
        }
        ImageUrl imageUrl = (ImageUrl) this.A04.get(i);
        if (imageUrl != null) {
            uCo.A00.setUrl(imageUrl, this.A03);
        }
        ? r2 = uCo.A00;
        r2.setSelected(AnonymousClass7TF.A1S(i, this.A00));
        boolean isSelected = r2.isSelected();
        RoundedCornerFrameLayout roundedCornerFrameLayout = uCo.A01;
        if (isSelected) {
            roundedCornerFrameLayout.setVisibility(0);
        } else {
            roundedCornerFrameLayout.setVisibility(8);
        }
        WB3.A00(r2, uCo, this, i, 9);
    }

    public UA3(AnonymousClass0iw r2) {
        this.A03 = r2;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-326390048);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(-1920399633, A032);
        return size;
    }
}
