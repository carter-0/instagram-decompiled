package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.OriginalitySourceMediaInfo;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer.GiphyAttributionFragment;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class GBI {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass4DH A02;
    public final ClipsViewerSource A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass93T A06;
    public final C55684Hlh A07;
    public final GF2 A08;
    public final String A09;
    public final 0sL A0A;
    public final 0sK A0B;

    public final void A05(1Xj r12) {
        C2801750l BDc;
        List AZX;
        C2801550j r0;
        String Bkc;
        List AZX2;
        C2801550j r02;
        String str = null;
        C262844Gf r4 = new C262844Gf(this.A02, this.A05, this.A04, (ReelViewerConfig) null);
        User A11 = C51966G9m.A11(r12);
        if (A11 != null && (BDc = r12.A0C.BDc()) != null && (AZX = BDc.AZX()) != null && (r0 = (C2801550j) 00k.A0O(AZX, 0)) != null && (Bkc = r0.Bkc()) != null) {
            Context context = this.A00;
            float A092 = ((float) 0nA.A09(context)) / 2.0f;
            float A082 = ((float) 0nA.A08(context)) / 2.0f;
            C2801750l BDc2 = r12.A0C.BDc();
            if (!(BDc2 == null || (AZX2 = BDc2.AZX()) == null || (r02 = (C2801550j) 00k.A0J(AZX2)) == null)) {
                str = r02.getMediaId();
            }
            r4.A00(new RectF(A092, A082, A092, A082), (C55497Hif) null, AnonymousClass3BQ.HIGHLIGHTS_INDICATOR, A11, Bkc, str);
        }
    }

    public final void A09(1Xj r15) {
        ImageUrl imageUrl;
        String str;
        boolean z;
        1Xj r5 = r15;
        JSO A0l = C51966G9m.A0l(r15);
        if (A0l != null) {
            User Bcj = A0l.Bcj();
            String str2 = null;
            if (Bcj != null) {
                str2 = Bcj.getUsername();
                imageUrl = Bcj.Bh3();
                z = Bcj.isVerified();
                str = Bcj.getId();
            } else {
                imageUrl = null;
                str = null;
                z = false;
            }
            HWQ.A00(this.A01, this.A04, imageUrl, r5, A0l.Bck(), str2, A0l.Bcg(), A0l.Bci(), str, r15.getId(), "reels", z);
        }
    }

    public final void A0D(1Xj r8, boolean z, boolean z2) {
        int i;
        Bundle A002 = A00(r8, this);
        ArrayList A3E = r8.A3E();
        if (z) {
            A3E = LTZ.A06(r8.A3E(), r8.A0C.getCoauthorProducers());
            A3E.add(0, new PeopleTag(C51966G9m.A11(r8)));
            A002.putBoolean(AnonymousClass000.A00(1504), true);
        }
        if (z2) {
            A002.putString(AnonymousClass000.A00(71), "collab_post_follow_button_from_clips_surface");
        }
        A002.putParcelableArrayList("tagged_people", A3E);
        UserSession userSession = this.A04;
        DbU.A1D(A002, userSession);
        A002.putBoolean("is_from_clips", true);
        ArrayList A3I = r8.A3I();
        String A0j = C51973G9u.A0j(userSession, r8);
        if (A3I != null && !A3I.isEmpty() && LOQ.A00.A01(userSession, A0j, r8.A5G()) && !z) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.addAll(A3I);
            A002.putParcelableArrayList(AnonymousClass000.A00(1872), A1C);
        }
        E6X e6x = new E6X();
        e6x.setArguments(A002);
        Context context = this.A00;
        if (z) {
            i = 2131974954;
        } else {
            i = 2131955886;
            if (r8.A5I()) {
                i = 2131961010;
            }
        }
        C51967G9n.A1N(e6x, AnonymousClass7TE.A16(context, i), this.A0B, true);
    }

    public static Bundle A00(1Xj r3, GBI gbi) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", r3.getId());
        bundle.putSerializable("media_type", r3.BR7());
        bundle.putString("prior_module", gbi.A05.getModuleName());
        return bundle;
    }

    public final void A01() {
        C331127Pr A0W = DbS.A0W(this.A04);
        DbZ.A0z(this.A00, A0W, 2131964555);
        A0W.A0c = "Featuring x, y, and z";
        A0W.A00().A02(this.A01, new E0Z());
    }

    public final void A03(1Xj r9) {
        AnonymousClass9OT r2;
        Context context = this.A00;
        UserSession userSession = this.A04;
        String moduleName = this.A05.getModuleName();
        String A2n = r9.A2n();
        if (r9.A5G()) {
            r2 = AnonymousClass9OT.REEL;
        } else {
            r2 = AnonymousClass9OT.POST;
        }
        JUL.A00(context, r2, r9.A1I(), userSession, moduleName, A2n, false);
    }

    public final void A06(1Xj r9) {
        C55316Hfj.A00.A00(this.A01, C391589tK.REELS_ATTRIBUTION, AnonymousClass8ZN.CLIPS_VIEWER_ATTRIBUTION_LINE, this.A04, r9.getId(), this.A05.getModuleName());
    }

    public final void A0B(1Xj r13) {
        UserSession userSession = this.A04;
        UpcomingEvent A27 = r13.A27(userSession);
        if (A27 != null) {
            C57435Iaf iaf = new C57435Iaf();
            1ZC A002 = C63468KxX.A00();
            Context context = this.A00;
            AnonymousClass4DU r4 = this.A05;
            A002.A01(context, userSession, r4, iaf, A27, r13.A1e(userSession).getId(), r4.getModuleName(), "attribute_pills", false, false);
        }
    }

    public final void A0C(1Xj r6) {
        String Bte = r6.A0C.Bte();
        if (Bte != null) {
            FH7.A08(this.A01, this.A04, 2EG.A0m, GJK.A01(Bte), this.A05.getModuleName());
        }
    }

    public /* synthetic */ GBI(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r5, ClipsViewerSource clipsViewerSource, UserSession userSession, AnonymousClass4DU r8, C55684Hlh hlh, GF2 gf2, String str, 0sL r12, 0sK r13) {
        AnonymousClass93T A002 = AnonymousClass93S.A00(userSession);
        0qQ.A0B(userSession, 4);
        C51974G9v.A1N(r8, gf2, clipsViewerSource);
        C51969G9p.A1N(hlh, 9, A002);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A02 = r5;
        this.A04 = userSession;
        this.A05 = r8;
        this.A08 = gf2;
        this.A03 = clipsViewerSource;
        this.A09 = str;
        this.A07 = hlh;
        this.A06 = A002;
        this.A0B = r13;
        this.A0A = r12;
    }

    public final void A02(AnonymousClass8ZN r27, EffectPreviewIntf effectPreviewIntf, 1Xj r29, AnonymousClass3W1 r30) {
        boolean z;
        String A0n = C51972G9s.A0n();
        EffectPreviewIntf effectPreviewIntf2 = effectPreviewIntf;
        Long A0n2 = C51971G9r.A0n(0, effectPreviewIntf2.getId());
        AnonymousClass8ZN r7 = r27;
        1Xj r11 = r29;
        if (A0n2 != null) {
            long longValue = A0n2.longValue();
            AnonymousClass4DU r6 = this.A05;
            UserSession userSession = this.A04;
            C52086GEg.A0L(C54689HOu.A0E, r7, userSession, r11, r6, A0n, this.A06.A01, this.A07.A00, longValue, (long) r30.getPosition());
        }
        GF2.A00(this.A08, AnonymousClass05K.A0C);
        if (!DDx.A04(effectPreviewIntf2)) {
            String id = effectPreviewIntf2.getId();
            String str = this.A09;
            if (str == null || this.A03 != ClipsViewerSource.AR_EFFECT || !str.equals(id)) {
                z = true;
                FragmentActivity fragmentActivity = this.A01;
                UserSession userSession2 = this.A04;
                C52273GLp.A01(fragmentActivity, r7, this.A05, userSession2, effectPreviewIntf2, r11, I7J.A03(r11), A0n, DbT.A0x(r11), I7J.A0A(userSession2, r11), GN9.A00(r11), z);
            }
        }
        z = false;
        FragmentActivity fragmentActivity2 = this.A01;
        UserSession userSession22 = this.A04;
        C52273GLp.A01(fragmentActivity2, r7, this.A05, userSession22, effectPreviewIntf2, r11, I7J.A03(r11), A0n, DbT.A0x(r11), I7J.A0A(userSession22, r11), GN9.A00(r11), z);
    }

    public final void A04(1Xj r5) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("media_id", r5.getId());
        GiphyAttributionFragment giphyAttributionFragment = new GiphyAttributionFragment();
        giphyAttributionFragment.setArguments(A0a);
        this.A0B.invoke(giphyAttributionFragment, AnonymousClass7TE.A16(this.A01, 2131975271), AnonymousClass7TE.A0v());
    }

    public final void A07(1Xj r6) {
        String str;
        User CCd;
        Bundle A002 = A00(r6, this);
        AnonymousClass3Y9 r0 = AnonymousClass3Y9.A00;
        UserSession userSession = this.A04;
        ArrayList A052 = r0.A05(userSession, r6);
        if (!A052.isEmpty()) {
            A002.putParcelableArrayList("tagged_people", A052);
        }
        A002.putString(AnonymousClass000.A00(71), 002.A0R(AnonymousClass000.A00(548), "_bottom_sheet"));
        DbU.A1D(A002, userSession);
        A002.putBoolean("is_from_clips", true);
        OriginalitySourceMediaInfo A003 = AnonymousClass3Y9.A00(r6);
        if (A003 == null || (CCd = A003.CCd()) == null) {
            str = null;
        } else {
            str = CCd.getId();
        }
        String A004 = C66579MXk.A00(38);
        A002.putString(A004, str);
        A002.putString(A004, DbX.A0r(AnonymousClass3Y9.A01(r6)));
        E6X e6x = new E6X();
        e6x.setArguments(A002);
        C51967G9n.A1N(e6x, AnonymousClass7TE.A16(this.A00, 2131955887), this.A0B, true);
    }

    public final void A08(1Xj r6) {
        String str;
        User CCd;
        Bundle A002 = A00(r6, this);
        AnonymousClass3Y9 r0 = AnonymousClass3Y9.A00;
        UserSession userSession = this.A04;
        ArrayList A042 = r0.A04(userSession, r6);
        if (!A042.isEmpty()) {
            A002.putParcelableArrayList("tagged_people", A042);
        }
        A002.putString(AnonymousClass000.A00(71), 002.A0R("clips_viewer_original_content_clips", "_bottom_sheet"));
        DbU.A1D(A002, userSession);
        A002.putBoolean("is_from_clips", true);
        OriginalitySourceMediaInfo A003 = AnonymousClass3Y9.A00(r6);
        if (A003 == null || (CCd = A003.CCd()) == null) {
            str = null;
        } else {
            str = CCd.getId();
        }
        A002.putString(C66579MXk.A00(38), str);
        E6X e6x = new E6X();
        e6x.setArguments(A002);
        C51967G9n.A1N(e6x, AnonymousClass7TE.A16(this.A00, 2131955887), this.A0B, true);
    }

    public final void A0A(1Xj r16) {
        String str;
        ImageUrl imageUrl;
        DUF A0j = C51965G9l.A0j(r16);
        if (A0j != null) {
            DU6 Bch = A0j.Bch();
            User Bge = Bch.Bge();
            boolean z = false;
            String str2 = null;
            if (Bge != null) {
                str = Bge.getUsername();
                User Bge2 = Bch.Bge();
                if (Bge2 != null) {
                    imageUrl = Bge2.Bh3();
                } else {
                    imageUrl = null;
                }
                User Bge3 = Bch.Bge();
                if (Bge3 != null) {
                    z = Bge3.isVerified();
                }
                User Bge4 = Bch.Bge();
                if (Bge4 != null) {
                    str2 = Bge4.getId();
                }
            } else {
                str = null;
                imageUrl = null;
            }
            String id = r16.getId();
            if (id != null) {
                C52273GLp.A04(this.A01, this.A04, Bch.Awq(), imageUrl, A0j.getAttributionAppId(), A0j.getAttributionAppName(), Bch.getContentUrl(), str, str2, Bch.getMediaCount(), id, z);
            }
        }
    }
}
