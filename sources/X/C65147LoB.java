package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

/* renamed from: X.LoB  reason: case insensitive filesystem */
public final class C65147LoB implements C66482MTk {
    public C331157Pu A00;
    public final Context A01;
    public final Fragment A02;
    public final C65507LuV A03 = new C65507LuV(this, 0);
    public final UserSession A04;
    public final C3499582p A05;
    public final String A06 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(C66239MKa.A00);
    public final AnonymousClass3Q2 A08;

    public C65147LoB(Context context, Fragment fragment, UserSession userSession, C3499582p r6, AnonymousClass3Q2 r7) {
        0qQ.A0B(r6, 3);
        this.A01 = context;
        this.A04 = userSession;
        this.A05 = r6;
        this.A02 = fragment;
        this.A08 = r7;
    }

    public final void Exg(C62642Kk4 kk4, C371088xY r26, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        AnonymousClass2k4 r5;
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        UserSession userSession = this.A04;
        SoundPlatformProduct soundPlatformProduct = SoundPlatformProduct.IG_MUSIC_ON_FEED;
        if (C56327Hwe.A01(soundPlatformProduct, userSession)) {
            ((C55924Hpl) this.A07.getValue()).A00(this.A01, C56327Hwe.A00(soundPlatformProduct, userSession), true);
            return;
        }
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        if (audioOverlayTrack == null) {
            JTU.A1A(userSession, num2);
            if (this.A00 == null && !A00()) {
                ImmutableList A0H = JTS.A0H(AnonymousClass30D.A0D(userSession) ? 1 : 0);
                if (JWB.A01(userSession)) {
                    r5 = AnonymousClass2k4.NIGHT;
                } else {
                    r5 = AnonymousClass2k4.DEFAULT;
                }
                AnonymousClass80X r16 = AnonymousClass80X.POST_CAPTURE;
                String str2 = this.A06;
                MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
                0qQ.A0A(A0H);
                K6I A002 = LJS.A00((C62642Kk4) null, C3515589i.SHARE_SHEET, (C371088xY) null, A0H, (ImmutableList) null, musicProduct, userSession, (MusicAttributionConfig) null, (MusicOverlaySearchTab) null, r16, str2, (String) null, (String) null, (Map) null, true, AnonymousClass7TF.A1W(r5, AnonymousClass2k4.DEFAULT), false);
                A002.A03 = this.A03;
                C331127Pr A0e = DbX.A0e(userSession, true);
                A0e.A03 = 1.0f;
                A0e.A0O = r5;
                A0e.A0T = A002;
                this.A00 = A0e.A00().A03(this.A01, A002);
                return;
            }
            return;
        }
        C3499582p r52 = this.A05;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("args_audio_track", audioOverlayTrack2);
        A0a.putParcelable("args_creation_session", JWE.A01(r52));
        A0a.putInt("args_creation_entry_point", r52.A01.ordinal());
        A0a.putBoolean("args_has_existing_snippet_selection", true);
        Fragment fragment = this.A02;
        DbV.A0Y(fragment.requireActivity(), A0a, userSession, ModalActivity.class, C273654mx.A00(626)).A0D(fragment, 1004);
    }

    private final boolean A00() {
        C358248ab A0Y;
        int i;
        AnonymousClass3Q2 r6 = this.A08;
        if (r6.A5i) {
            if (!182.A06(0Tu.A06, this.A04, 36313987142453592L)) {
                A0Y = DbS.A0Y(this.A01);
                A0Y.A09(2131952316);
                i = 2131952315;
                A0Y.A08(i);
                A0Y.A0H((DialogInterface.OnClickListener) null, 2131968772);
                DbT.A1V(A0Y);
                return true;
            }
        }
        if (r6.A1F != AnonymousClass3QO.FAN_CLUB) {
            return false;
        }
        A0Y = DbS.A0Y(this.A01);
        A0Y.A09(2131952316);
        i = 2131952317;
        A0Y.A08(i);
        A0Y.A0H((DialogInterface.OnClickListener) null, 2131968772);
        DbT.A1V(A0Y);
        return true;
    }

    public final void dismiss() {
        DbW.A1K(this.A00);
        this.A00 = null;
    }

    public final void A01(C66569MWx mWx) {
        int i;
        if (!A00()) {
            if (mWx.CAc() == AudioType.ORIGINAL_AUDIO) {
                i = mWx.C95();
            } else {
                i = 30000;
            }
            AudioOverlayTrack A002 = C63347KvU.A00(mWx, i);
            C3499582p r3 = this.A05;
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("args_audio_track", A002);
            A0a.putParcelable("args_creation_session", JWE.A01(r3));
            A0a.putInt("args_creation_entry_point", r3.A01.ordinal());
            A0a.putBoolean("args_has_existing_snippet_selection", false);
            Fragment fragment = this.A02;
            DbV.A0Y(fragment.requireActivity(), A0a, this.A04, ModalActivity.class, C273654mx.A00(626)).A0D(fragment, 1004);
        }
    }
}
