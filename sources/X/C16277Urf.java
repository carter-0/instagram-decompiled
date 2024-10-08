package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Urf  reason: case insensitive filesystem */
public final class C16277Urf extends UBP {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final List A05 = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16277Urf(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.product_thumbnail_container);
        this.A00 = (LinearLayout) view;
        this.A04 = DbX.A0b(view, R.id.merchant_avatar);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.merchant_username);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.merchant_secondary_info);
    }
}
