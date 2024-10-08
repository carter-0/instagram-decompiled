package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.VZb  reason: case insensitive filesystem */
public final class C17522VZb {
    public C57248IUj A00;
    public final View A01;
    public final TextView A02;
    public final ColorFilterAlphaImageView A03;
    public final C17366VSt A04;

    public C17522VZb(View view, Context context) {
        this.A01 = view.requireViewById(R.id.footer_cta);
        this.A02 = DbU.A0G(view, R.id.footer_main_action_text);
        this.A03 = (ColorFilterAlphaImageView) view.requireViewById(R.id.footer_glyph);
        this.A04 = new C17366VSt(DbU.A01(context), context.getColor(R.color.cta_highlight_background_color));
    }
}
