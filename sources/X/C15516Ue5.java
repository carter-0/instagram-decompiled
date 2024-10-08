package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Ue5  reason: case insensitive filesystem */
public final class C15516Ue5 extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C15516Ue5(Context context, AnonymousClass0iw r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 2023900255);
        0qQ.A0B(obj, 2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.ImageTextArrowViewBinder.Holder");
        VZJ vzj = (VZJ) tag;
        C17566VaK vaK = (C17566VaK) obj;
        AnonymousClass0iw r7 = this.A01;
        Context context = this.A00;
        AnonymousClass7TF.A1H(vzj, vaK);
        0qQ.A0B(r7, 2);
        vzj.A03.setText(vaK.A05);
        String str = vaK.A04;
        TextView textView = vzj.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        ImageUrl imageUrl = vaK.A01;
        View view2 = vzj.A00;
        View A0G = AnonymousClass7TF.A0G(view2, R.id.double_image_view);
        if (imageUrl != null) {
            ImageUrl imageUrl2 = vaK.A02;
            if (imageUrl2 != null) {
                DbT.A0b(view2, R.id.front_thumbnail).setUrl(imageUrl2, r7);
            }
            DbT.A0b(view2, R.id.back_thumbnail).setUrl(imageUrl, r7);
            A0G.setVisibility(0);
            vzj.A04.setVisibility(8);
        } else {
            A0G.setVisibility(8);
            ImageUrl imageUrl3 = vaK.A02;
            if (imageUrl3 != null) {
                vzj.A04.setUrl(imageUrl3, r7);
            }
        }
        Integer num = vaK.A03;
        if (!(num == null || context == null)) {
            ? r1 = vzj.A04;
            r1.setScaleType(ImageView.ScaleType.CENTER);
            DbU.A13(context, r1, num.intValue());
        }
        AnonymousClass0fU.A00(vaK.A00, vzj.A01);
        AnonymousClass0fD.A0A(551197128, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1984161568);
        View A09 = DbW.A09(LayoutInflater.from(this.A00), viewGroup, R.layout.image_text_arrow_view, false);
        View A0F = DbY.A0F(A09, R.id.double_thumbnail_view_stub);
        0qQ.A0A(A0F);
        A09.setTag(new VZJ(A09, A0F, C13991Tnr.A08(A09, R.id.row_section_title), C13991Tnr.A08(A09, R.id.row_section_subtitle), (RoundedCornerImageView) AnonymousClass7TF.A0G(A09, R.id.row_section_thumbnail)));
        AnonymousClass0fD.A0A(274041976, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
