package X;

import android.app.Activity;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

public final class Lo8 implements C66482MTk {
    public C331157Pu A00;
    public final Activity A01;
    public final Context A02;
    public final C65507LuV A03 = new C65507LuV(this, 4);
    public final UserSession A04;
    public final C3515289f A05;
    public final String A06;
    public final L7S A07;

    public final void Exg(C62642Kk4 kk4, C371088xY r13, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        0qQ.A0B(num, 1);
        if (audioOverlayTrack == null) {
            UserSession userSession = this.A04;
            JTU.A1A(userSession, num);
            if (this.A00 == null) {
                AnonymousClass80X r8 = AnonymousClass80X.UNINITIALIZED;
                String BUn = this.A05.BUn();
                MusicProduct musicProduct = MusicProduct.CLIPS_EDIT_METADATA;
                ImmutableList of = ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
                0qQ.A07(of);
                K6I A012 = LJS.A01((C3515589i) null, of, musicProduct, userSession, (MusicOverlaySearchTab) null, r8, BUn, (Map) null);
                A012.A03 = this.A03;
                C331127Pr A0e = DbX.A0e(userSession, true);
                A0e.A03 = 1.0f;
                Context context = this.A02;
                A0e.A06 = context.getColor(2Yu.A0C(context));
                A0e.A0T = A012;
                this.A00 = A0e.A00().A02(this.A01, A012);
            }
        } else {
            Activity activity = this.A01;
            DbV.A0Y(activity, JTU.A07(audioOverlayTrack, this.A06, true), this.A04, ModalActivity.class, "clips_edit_music_editor").A0A(activity, 1004);
        }
        L7S l7s = this.A07;
        1Ln A08 = 1Ln.A08(l7s.A01);
        if (DbT.A1Y(A08)) {
            A08.A0a(C279294yP.CLIPS);
            A08.A0r("SHARE_SHEET_REPLACE_AUDIO");
            A08.A0b(28D.A5J);
            A08.A0T();
            A08.A0U();
            JTO.A1U(A08, l7s.A02);
            A08.A0n(l7s.A00.getModuleName());
            JTS.A1E(A08);
        }
    }

    public final void dismiss() {
        DbW.A1K(this.A00);
        this.A00 = null;
    }

    public Lo8(Activity activity, Context context, UserSession userSession, C3515289f r6, L7S l7s, String str) {
        this.A02 = context;
        this.A01 = activity;
        this.A04 = userSession;
        this.A06 = str;
        this.A07 = l7s;
        this.A05 = r6;
    }
}
