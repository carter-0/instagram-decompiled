package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.reels.channelchallenge.model.ChannelChallengeStickerWinnerModel;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MzQ  reason: case insensitive filesystem */
public final class C68059MzQ extends C249703kE implements C328017Dc {
    public static final List A0H = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.winner_media_1), Integer.valueOf(R.id.winner_media_2), Integer.valueOf(R.id.winner_media_3)});
    public static final List A0I = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.winner_mention_1), Integer.valueOf(R.id.winner_mention_2), Integer.valueOf(R.id.winner_mention_3)});
    public C328087Dj A00;
    public final Context A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final IgTextView A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final C252063oV A0C;
    public final O6H A0D;
    public final OIO A0E;
    public final IgdsMediaButton A0F;
    public final View A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68059MzQ(Context context, View view, AnonymousClass0iw r5, UserSession userSession, O6H o6h, OIO oio) {
        super(view);
        0qQ.A0B(context, 1);
        C51974G9v.A0d(2, userSession, oio, r5, o6h);
        this.A01 = context;
        this.A06 = userSession;
        this.A0G = view;
        this.A0E = oio;
        this.A05 = r5;
        this.A0D = o6h;
        this.A02 = AnonymousClass7TE.A0b(view, R.id.card);
        this.A0F = (IgdsMediaButton) AnonymousClass7TE.A0b(view, R.id.cta_button);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.action_status_container);
        this.A07 = Dba.A0E(view, R.id.status);
        this.A08 = C66581MXm.A0T(view, R.id.full_screen_winner_media);
        this.A09 = C66581MXm.A0T(view, R.id.stacked_media_1);
        this.A0A = C66581MXm.A0T(view, R.id.stacked_media_2);
        this.A0B = C66581MXm.A0T(view, R.id.stacked_media_3);
        View findViewById = view.findViewById(R.id.stacked_media_v2);
        0qQ.A0C(findViewById, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) findViewById;
        this.A04 = viewStub;
        this.A0C = 2b1.A00(viewStub);
    }

    public static final LwN A00(NVI nvi) {
        String str;
        String str2;
        String str3;
        String str4;
        NVI nvi2 = nvi;
        UNV unv = new UNV((ChatStickerChannelType) null, (ChatStickerStickerType) null, (Integer) null, (String) null, (String) null, nvi2.A03, (String) null, (String) null, (String) null);
        C42918Bmm bmm = nvi2.A01;
        if (bmm == null || (str = bmm.A09(C67009Mgh.A00())) == null) {
            str = "";
        }
        if (bmm != null) {
            str2 = bmm.A0A("profile_image_uri(size:256)");
        } else {
            str2 = null;
        }
        SimpleImageUrl A0V = DbS.A0V(str2);
        List<C53398GnV> list = nvi2.A06;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C53398GnV gnV : list) {
            Parcelable.Creator creator = User.CREATOR;
            C250663lr r2 = (C250663lr) gnV.A02;
            if (r2 != null) {
                str3 = r2.A08("igid");
                str4 = r2.A0A(C67009Mgh.A00());
            } else {
                str3 = null;
                str4 = null;
            }
            A0r.add(new ChannelChallengeStickerWinnerModel(DbS.A0V(gnV.A03), new User(str3, str4), (String) null));
        }
        return new LwN(unv, A0V, C51968G9o.A0t(list), str, (String) null, (String) null, (String) null, (String) null, (String) null, A0r, (List) null, false);
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
