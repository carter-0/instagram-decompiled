package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class KVE extends C60518Jmp {
    public final C66449MSd A00;
    public final ImageView A01;
    public final TextView A02;

    public final void A00(JZC jzc) {
        0qQ.A0B(jzc, 0);
        JV7 jv7 = jzc.A01;
        if (jv7 != null) {
            this.A02.setText(jv7.A02);
            JYP.A00(this.A01, (ImageUrl) jv7.A00);
            LY7.A00(this.itemView, 28, jv7, this);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVE(View view, UserSession userSession, C66449MSd mSd) {
        super(view);
        AnonymousClass7TG.A1Q(userSession, mSd);
        this.A00 = mSd;
        boolean A03 = AnonymousClass30D.A03(userSession);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.grouping_name);
        ImageView A0J = DbX.A0J(view, R.id.cover_photo);
        this.A01 = A0J;
        C60518Jmp.A00(JTQ.A06(this), JTS.A07(this), A0J, A03 ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.alert_dialog_button_cell_height);
    }
}
