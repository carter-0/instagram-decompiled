package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class VTI {
    public final TextView A00;
    public final VTH A01;

    public VTI(View view, C15353Ub4 ub4) {
        Context context = view.getContext();
        this.A01 = new VTH(view);
        TextView A0G = DbU.A0G(view, R.id.see_all);
        this.A00 = A0G;
        Drawable drawable = context.getDrawable(R.drawable.forward_arrow);
        drawable.mutate().setColorFilter(context.getColor(R.color.countdown_sticker_title_text_color), PorterDuff.Mode.SRC_IN);
        A0G.setCompoundDrawablePadding(DbY.A01(context));
        A0G.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        AnonymousClass3NG r2 = new AnonymousClass3NG(A0G);
        r2.A07 = true;
        r2.A04 = new C15845UjV(6, this, ub4);
        r2.A00();
    }
}
