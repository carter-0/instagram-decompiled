package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Udp  reason: case insensitive filesystem */
public final class C15500Udp extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15500Udp(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1915311312);
        0qQ.A0B(obj, 2);
        Context context = this.A00;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.DrawableSingleTextArrowViewBinder.Holder");
        VVN vvn = (VVN) tag;
        C17324VRd vRd = (C17324VRd) obj;
        AnonymousClass7TG.A1N(context, vvn);
        0qQ.A0B(vRd, 2);
        vvn.A01.setText(vRd.A01);
        ? r1 = vvn.A02;
        DbU.A13(context, r1, R.drawable.instagram_add_pano_outline_24);
        r1.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        AnonymousClass0fU.A00(vRd.A00, vvn.A00);
        AnonymousClass0fD.A0A(887348857, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1853230325);
        View A09 = DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.image_single_text_arrow_view, false);
        A09.setTag(new VVN(A09, AnonymousClass7TG.A0R(A09, R.id.row_section_title), (RoundedCornerImageView) AnonymousClass7TF.A0F(A09, R.id.row_section_thumbnail)));
        AnonymousClass0fD.A0A(-1768419047, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
