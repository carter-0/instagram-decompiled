package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.VjR  reason: case insensitive filesystem */
public final class C17989VjR {
    public TextView A00;
    public TextView A01;
    public final Resources A02;
    public final C20978X7r A03;

    public final void A01(Context context, 2da r24) {
        2da r5 = r24;
        r5.Eu4(true);
        View ETg = ((2dZ) r5).ETg(R.layout.layout_action_bar, 2Yu.A0G(context, R.attr.actionBarStartSpacing), 0, true);
        r5.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, (Drawable) null, (Drawable) null, new WB9((Object) this, 28), AnonymousClass05K.A00, -2, -2, -2, -2, R.drawable.instagram_x_pano_outline_24, -2, -2, true));
        this.A01 = DbU.A0G(ETg, R.id.pager_title);
        this.A00 = AnonymousClass7TE.A0d(ETg, R.id.pager_indicator);
        TextView textView = this.A01;
        if (textView == null) {
            0qQ.A0F("pageTitle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setText(2131965491);
        }
    }

    public final void A00(int i, int i2, int i3) {
        TextView textView = this.A00;
        if (textView == null) {
            0qQ.A0F("pageIndicator");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setText(this.A02.getString(2131968002, C51968G9o.A1Z(Integer.valueOf(i + 1 + i2), i3 + i2)));
        }
    }

    public C17989VjR(Resources resources, C20978X7r x7r) {
        this.A03 = x7r;
        this.A02 = resources;
    }
}
