package X;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.List;
import java.util.Map;

public final class KVJ extends C60518Jmp implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "MusicOverlayPlaylistSpotlightViewHolder";
    public int A00;
    public int A01;
    public MusicSearchPlaylist A02;
    public final Handler A03 = AnonymousClass7TF.A0D();
    public final ViewPager2 A04;
    public final LFN A05;
    public final C60410Jl3 A06;
    public final MU5 A07;
    public final C65913M4c A08 = new C65913M4c(this);
    public final CirclePageIndicator A09;
    public final Map A0A = AnonymousClass7TE.A1H();
    public final boolean A0B;
    public final View A0C;
    public final UserSession A0D;
    public final IgTextView A0E;

    public final void A00(MusicSearchPlaylist musicSearchPlaylist, boolean z) {
        this.A02 = musicSearchPlaylist;
        IgTextView igTextView = this.A0E;
        if (z) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setVisibility(0);
            igTextView.setText(JTQ.A0b(musicSearchPlaylist));
            2eQ.A03(igTextView);
        }
        C60410Jl3 jl3 = this.A06;
        AnonymousClass0eM r2 = musicSearchPlaylist.A01;
        List A15 = JTO.A15(r2);
        0qQ.A0C(A15, "null cannot be cast to non-null type kotlin.collections.List<com.instagram.music.common.model.MusicSearchItem>");
        0qQ.A0B(A15, 0);
        jl3.A00 = A15;
        this.A09.A01(0, JTO.A15(r2).size());
        ViewPager2 viewPager2 = this.A04;
        viewPager2.A03(0, false);
        Map map = this.A0A;
        int i = map.get(musicSearchPlaylist);
        if (i == null) {
            i = 0;
            map.put(musicSearchPlaylist, 0);
        }
        viewPager2.A03(AnonymousClass7TE.A0M(i), false);
        jl3.notifyDataSetChanged();
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KVJ(View view, UserSession userSession, LFN lfn, MU5 mu5) {
        super(view);
        C51974G9v.A1M(mu5, lfn, userSession);
        this.A0C = view;
        this.A07 = mu5;
        this.A05 = lfn;
        this.A0D = userSession;
        boolean A032 = AnonymousClass30D.A03(userSession);
        this.A0B = A032;
        this.A0E = Dba.A0E(view, R.id.playlist_title);
        ViewPager2 viewPager2 = (ViewPager2) AnonymousClass7TE.A0b(view, R.id.playlist_artist_banner);
        this.A04 = viewPager2;
        this.A09 = (CirclePageIndicator) AnonymousClass7TE.A0b(view, R.id.circle_page_indicator);
        C60410Jl3 jl3 = new C60410Jl3(this);
        this.A06 = jl3;
        DbT.A1B(JTS.A07(this), viewPager2.getLayoutParams(), A032 ? R.dimen.action_button_settings_height : R.dimen.audio_dubbing_gen_ai_gif_size);
        viewPager2.setAdapter(jl3);
        viewPager2.setPageTransformer(new C14059Tp7((int) (7.0f * Resources.getSystem().getDisplayMetrics().density)));
        viewPager2.A05(new C60731JqK(this, 6));
        this.A03.postDelayed(this.A08, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        this.A04.addOnAttachStateChangeListener(new W8J(this, 5));
    }
}
