package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

public final class KFI extends C232222tE {
    public final 0sP A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.muted_word_list_item, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(2131958511);
        Context context = textView.getContext();
        textView.setCompoundDrawablePadding(C51972G9s.A08(context));
        Drawable A01 = AnonymousClass4Ed.A01(context, R.drawable.instagram_eye_off_pano_outline_24, 2Yu.A0B(context));
        RectF rectF = 0nA.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(A01, (Drawable) null, (Drawable) null, (Drawable) null);
        return new C60559JnU(textView, this.A00);
    }

    public final Class modelClass() {
        return C65308Lr6.class;
    }

    public KFI(0sP r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }
}
