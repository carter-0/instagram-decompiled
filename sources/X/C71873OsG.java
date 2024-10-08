package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.OsG  reason: case insensitive filesystem */
public final class C71873OsG implements AnonymousClass0iw, AnonymousClass7D2 {
    public static final String __redex_internal_original_name = "MusicStickerContentDefinition";
    public final UserSession A00;
    public final C74545Pwe A01;
    public final AnonymousClass7DZ A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C68071Mzc mzc = new C68071Mzc(DbU.A09(layoutInflater, viewGroup, R.layout.igd_music_sticker_layout, false));
        this.A02.A00(mzc);
        return mzc;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r18, AnonymousClass7FW r19) {
        C68071Mzc mzc = (C68071Mzc) r18;
        NYJ nyj = (NYJ) r19;
        AnonymousClass7TF.A1H(mzc, nyj);
        C328667Fr r2 = nyj.A00;
        AnonymousClass777 r1 = r2.A0F;
        if (r1 instanceof AnonymousClass776) {
            IgImageView igImageView = mzc.A03;
            ImageUrl imageUrl = ((AnonymousClass776) r1).A00;
            igImageView.setUrl(imageUrl, this);
            IgImageView igImageView2 = mzc.A04;
            igImageView2.setImageDrawable(new AnonymousClass9Wo(AnonymousClass7TE.A0S(igImageView2), this.A00, imageUrl, AnonymousClass05K.A01, "", "", 0.0f, -1, false, false));
        }
        mzc.A02.setText(r2.A0a);
        mzc.A01.setText(r2.A0Z);
        this.A02.A02(mzc, nyj);
        this.A01.Dz0(mzc, r2.A0L);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        C68071Mzc mzc = (C68071Mzc) r2;
        0qQ.A0B(mzc, 0);
        this.A02.A01(mzc);
        this.A01.Dz1(mzc);
    }

    public C71873OsG(UserSession userSession, C74545Pwe pwe, List list) {
        this.A00 = userSession;
        this.A01 = pwe;
        this.A02 = new AnonymousClass7DZ(list);
    }
}
