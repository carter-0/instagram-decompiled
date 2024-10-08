package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicSearchPlaylist;

public final class KVF extends C60518Jmp {
    public final C66450MSe A00;
    public final ImageView A01;
    public final TextView A02;

    public final void A00(MusicSearchPlaylist musicSearchPlaylist) {
        this.A02.setText(JTQ.A0b(musicSearchPlaylist));
        JYP.A00(this.A01, musicSearchPlaylist.A00().BEO());
        LY7.A00(this.itemView, 30, musicSearchPlaylist, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVF(View view, UserSession userSession, C66450MSe mSe) {
        super(view);
        AnonymousClass7TG.A1Q(userSession, mSe);
        this.A00 = mSe;
        boolean A03 = AnonymousClass30D.A03(userSession);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.grouping_name);
        ImageView A0J = DbX.A0J(view, R.id.cover_photo);
        this.A01 = A0J;
        C60518Jmp.A00(JTQ.A06(this), JTS.A07(this), A0J, A03 ? R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size : R.dimen.alert_dialog_button_cell_height);
    }
}
