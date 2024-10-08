package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.Mzj  reason: case insensitive filesystem */
public final class C68078Mzj extends C249703kE implements JOK {
    public N4t A00;
    public final ViewGroup A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final C63939LEc A09 = new C63939LEc();
    public final OEH A0A;
    public final PGT A0B;
    public final IgBouncyUfiButtonImageView A0C;

    public final N4t B8A() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68078Mzj(View view, AnonymousClass0iw r6, UserSession userSession, OEH oeh, PGT pgt) {
        super(view);
        C51974G9v.A1M(userSession, r6, pgt);
        0qQ.A0B(oeh, 5);
        this.A03 = userSession;
        this.A02 = r6;
        this.A0B = pgt;
        this.A0A = oeh;
        this.A08 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.friend_map_h_scroll_avatar);
        this.A06 = Dba.A0E(view, R.id.friend_map_h_scroll_title);
        this.A05 = Dba.A0E(view, R.id.friend_map_h_scroll_subtitle);
        this.A04 = Dba.A0E(view, R.id.friend_map_presence_reply_text);
        this.A07 = Dba.A0E(view, R.id.friend_map_presence_additional_text);
        this.A0C = (IgBouncyUfiButtonImageView) AnonymousClass7TE.A0b(view, R.id.friend_map_note_like_button);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TE.A0b(view, R.id.friend_map_h_scroll_emoji_reply_container);
        this.A01 = viewGroup;
        if (182.A06(0Tu.A05, userSession, 36321769627133698L)) {
            viewGroup.setVisibility(0);
            OSM.A01(AnonymousClass7TE.A0S(view), viewGroup, this, pgt);
        }
    }
}
