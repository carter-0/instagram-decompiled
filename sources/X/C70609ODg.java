package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.ODg  reason: case insensitive filesystem */
public final class C70609ODg {
    public View A00;
    public final Context A01;
    public final C66759Mc4 A02;

    public C70609ODg(Context context, C66759Mc4 mc4) {
        this.A01 = context;
        this.A02 = mc4;
        View inflate = View.inflate(context, R.layout.layout_igds_banner_with_cta, (ViewGroup) null);
        0qQ.A07(inflate);
        this.A00 = inflate;
        DbX.A0J(inflate, R.id.icon).setImageResource(R.drawable.instagram_alert_check_pano_outline_24);
        View view = this.A00;
        TextView A0F = C66582MXn.A0F(view);
        Context context2 = this.A01;
        DbT.A18(context2, A0F, 2131963775);
        DbT.A18(context2, AnonymousClass7TG.A0R(view, R.id.body), 2131963773);
        View view2 = this.A00;
        IgdsButton A0n = JTR.A0n(view2, R.id.cta_button);
        A0n.setText(this.A01.getString(2131963774));
        C71401Ok0.A01(A0n, 44, this);
        C71401Ok0.A01(AnonymousClass7TF.A0G(view2, R.id.dismiss_button), 45, this);
    }
}
