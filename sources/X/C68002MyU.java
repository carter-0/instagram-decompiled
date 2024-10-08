package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MyU  reason: case insensitive filesystem */
public final class C68002MyU extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68002MyU(View view) {
        super(view);
        0qQ.A0A(view);
        this.A03 = DbX.A0a(view, R.id.direct_action_row_avatar);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.direct_action_row_name);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.direct_action_row_status);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.direct_action_row_time_stamp);
    }
}
