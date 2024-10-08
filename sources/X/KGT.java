package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KGT extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.row_center_text_with_drawable, false);
        C60577Jnm jnm = new C60577Jnm(A09);
        A09.setTag(jnm);
        0qQ.A0C(jnm, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleCenterTextRowWithDrawableViewBinder.Holder");
        return jnm;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C61161JyD jyD = (C61161JyD) r7;
        C60577Jnm jnm = (C60577Jnm) r8;
        boolean A1Z = AnonymousClass7TG.A1Z(jyD, jnm);
        Context context = jyD.A00;
        FGF fgf = jyD.A02;
        Drawable drawable = jyD.A01;
        AnonymousClass7TF.A1B(context, A1Z ? 1 : 0, fgf);
        if (drawable != null) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.auth_edit_field_text_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            TextView textView = jnm.A00;
            textView.setCompoundDrawablePadding(DbY.A01(context));
            DbU.A10(context, drawable, 2Yu.A08(context));
            textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView2 = jnm.A00;
        DbT.A1H(textView2);
        fgf.A02(textView2);
    }

    public final Class modelClass() {
        return C61161JyD.class;
    }
}
