package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mz4  reason: case insensitive filesystem */
public final class C68037Mz4 extends C249703kE {
    public final UserSession A00;
    public final IgSimpleImageView A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68037Mz4(View view, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1O(view, userSession);
        this.A00 = userSession;
        this.A07 = 182.A06(0Tu.A05, userSession, 36321769626674939L);
        this.A02 = (IgSimpleImageView) view.findViewById(R.id.friend_map_update_row_note);
        this.A06 = JTO.A0X(view, R.id.friend_map_update_row_header_title);
        this.A01 = (IgSimpleImageView) view.findViewById(R.id.friend_map_update_direction_arrow);
        this.A03 = JTO.A0X(view, R.id.friend_map_update_distance);
        this.A05 = JTO.A0X(view, R.id.friend_map_update_row_subtitle);
        this.A04 = JTO.A0X(view, R.id.friend_map_update_row_header_updates_badge);
    }
}
