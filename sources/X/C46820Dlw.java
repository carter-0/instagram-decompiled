package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Dlw  reason: case insensitive filesystem */
public final class C46820Dlw extends 2Rw {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final List A02;

    public final void onBindViewHolder(C249703kE r9, int i) {
        0qQ.A0B(r9, 0);
        if (r9 instanceof C46904DnK) {
            C46904DnK dnK = (C46904DnK) r9;
            C46279DTi dTi = (C46279DTi) this.A02.get(i);
            AnonymousClass0iw r4 = this.A01;
            0qQ.A0B(dTi, 0);
            TextView A0d = AnonymousClass7TE.A0d(dnK.itemView, R.id.username_text_view);
            TextView A0d2 = AnonymousClass7TE.A0d(dnK.itemView, R.id.title_text_view);
            IgImageView findViewById = dnK.itemView.findViewById(R.id.thumbnail_image);
            Context context = dnK.A00;
            DbX.A13(context, A0d, dTi.getUsername(), 2131963090);
            A0d2.setText(dTi.getTitle());
            if (dTi.C75() == null || 0qQ.A0K(dTi.C75(), "")) {
                findViewById.setColorFilter(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_grey_06));
                findViewById.setScaleType(ImageView.ScaleType.CENTER);
                DbU.A13(context, findViewById, R.drawable.instagram_gif_pano_outline_24);
                return;
            }
            findViewById.setColorFilter((ColorFilter) null);
            findViewById.setScaleType(ImageView.ScaleType.CENTER_CROP);
            DbV.A1P(r4, findViewById, dTi.C75());
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context context = this.A00;
        return new C46904DnK(context, DbT.A0D(LayoutInflater.from(context), viewGroup, R.layout.giphy_attribution_item, false));
    }

    public C46820Dlw(Context context, AnonymousClass0iw r2, List list) {
        this.A00 = context;
        this.A02 = list;
        this.A01 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1367550389);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-1852787164, A03);
        return size;
    }
}
