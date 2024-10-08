package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Ljm  reason: case insensitive filesystem */
public final class C64886Ljm implements C2365734g {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64886Ljm(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DKS(View view) {
        Integer valueOf;
        if (this.A00 != 0) {
            View requireViewById = view.requireViewById(R.id.indicator_background_view);
            C62940Kos kos = (C62940Kos) this.A01;
            kos.A00 = DbU.A0F(view, R.id.indicator_icon_view);
            TextView A0G = DbU.A0G(view, R.id.indicator_text_view);
            kos.A01 = A0G;
            int lineHeight = A0G.getLineHeight();
            Context context = (Context) this.A02;
            int dimensionPixelSize = (lineHeight - context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
            requireViewById.setBackground(C247763gs.A00(context, lineHeight));
            0nA.A0f(kos.A00, lineHeight);
            0nA.A0V(kos.A00, lineHeight);
            kos.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return;
        }
        0qQ.A0B(view, 0);
        L9J l9j = (L9J) this.A02;
        l9j.A01 = view;
        l9j.A00 = view.requireViewById(R.id.indicator_background_view);
        View requireViewById2 = view.requireViewById(R.id.indicator_icon_view);
        ImageView imageView = (ImageView) requireViewById2;
        l9j.A02 = imageView;
        0qQ.A07(requireViewById2);
        TextView A0G2 = DbU.A0G(view, R.id.indicator_text_view);
        l9j.A03 = A0G2;
        if (A0G2 != null) {
            A0G2.setTextSize(0, DbU.A05((View) this.A01).getDimension(R.dimen.abc_text_size_menu_header_material));
        }
        TextView textView = l9j.A03;
        if (!(textView == null || (valueOf = Integer.valueOf(textView.getLineHeight())) == null)) {
            View view2 = (View) this.A01;
            int intValue = valueOf.intValue();
            View view3 = l9j.A00;
            if (view3 != null) {
                view3.setBackground(C247763gs.A00(view2.getContext(), intValue));
            }
            0nA.A0f(imageView, intValue);
            0nA.A0V(imageView, intValue);
        }
        Context context2 = view.getContext();
        DbU.A13(context2, imageView, R.drawable.instagram_camera_filled_16);
        DbU.A13(context2, imageView, R.drawable.instagram_camera_filled_16);
    }
}
