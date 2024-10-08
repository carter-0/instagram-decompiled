package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ddz  reason: case insensitive filesystem */
public final class C46382Ddz {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;

    public C46382Ddz(View view, UserSession userSession) {
        ImageView A0F = DbU.A0F(view, R.id.row_profile_header_empty_profile_notice_icon);
        ImageView A0F2 = DbU.A0F(view, R.id.row_profile_header_empty_profile_notice_icon_updated);
        if (182.A06(0Tu.A05, userSession, 36329715312640280L)) {
            A0F.setVisibility(8);
            A0F2.setVisibility(0);
            this.A00 = A0F2;
        } else {
            this.A00 = A0F;
        }
        this.A03 = DbU.A0G(view, R.id.row_profile_header_empty_profile_notice_title);
        this.A02 = DbU.A0G(view, R.id.row_profile_header_empty_profile_notice_subtitle);
        this.A01 = (LinearLayout) view.requireViewById(R.id.row_profile_header_empty_profile_notice_container);
    }
}
