package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VbE  reason: case insensitive filesystem */
public final class C17622VbE {
    public View A00;
    public IgImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final TextView A04;
    public final TextView A05;
    public final C240963Ni A06 = new WTJ(this, 2);

    public C17622VbE(View view) {
        this.A03 = DbU.A0D(view, R.id.on_this_day_preview_image_stub);
        TextView A0G = DbU.A0G(view, R.id.on_this_day_action_button);
        this.A04 = A0G;
        this.A02 = view.requireViewById(R.id.hide_memories_button);
        this.A05 = DbU.A0G(view, R.id.on_this_day_subtitle);
        0qQ.A0B(A0G, 0);
        1QE.A0G(A0G, A0G);
    }
}
