package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GXy  reason: case insensitive filesystem */
public final class C52573GXy extends C249703kE {
    public final View A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final /* synthetic */ AnonymousClass4AO A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52573GXy(View view, AnonymousClass4AO r3) {
        super(view);
        this.A05 = r3;
        this.A03 = AnonymousClass7TE.A0b(view, R.id.map_image);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.map_current_location_dot);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.map_current_city_name);
        this.A01 = Dba.A0E(view, R.id.map_pog_label);
        this.A04 = AnonymousClass7TE.A0b(view, R.id.map_update_cluster_view);
    }

    public static final void A00(AnonymousClass4A9 r3, C52573GXy gXy, boolean z) {
        String str = r3.A05;
        if (str == null || str.length() == 0 || !z) {
            gXy.A02.setVisibility(8);
            return;
        }
        IgImageView igImageView = gXy.A02;
        igImageView.setVisibility(0);
        C54308H7d h7d = new C54308H7d(AnonymousClass7TE.A0S(gXy.itemView), str);
        igImageView.setImageDrawable(h7d);
        ViewGroup.LayoutParams layoutParams = igImageView.getLayoutParams();
        if (layoutParams != null) {
            C306386Ly r1 = h7d.A00;
            layoutParams.width = r1.A0A;
            layoutParams.height = r1.A06;
            igImageView.setLayoutParams(layoutParams);
            return;
        }
        throw AnonymousClass7TE.A11(C273654mx.A00(3));
    }
}
