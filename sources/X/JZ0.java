package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.AudioBrowserBrowseLandingPageFragment;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class JZ0 implements C66441MRv, MVN, C66447MSb {
    public C252063oV A00;
    public C61425K6z A01;
    public MusicOverlaySearchTab A02;
    public String A03 = AnonymousClass7TG.A0j();
    public Map A04;
    public C62487Kgc A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final View A0A;
    public final 0hq A0B;
    public final C3515589i A0C;
    public final C59725JVj A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final MusicProduct A0G;
    public final 1wn A0H = new LgJ(this, 8);
    public final UserSession A0I;
    public final JZL A0J;
    public final C3499982t A0K;
    public final MusicAttributionConfig A0L;
    public final C234462xu A0M;
    public final MVD A0N;
    public final L20 A0O;
    public final MU0 A0P;
    public final AnonymousClass80X A0Q;
    public final String A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final Button A0U;
    public final Integer A0V;
    public final HashMap A0W = AnonymousClass7TE.A1E();
    public final List A0X;

    public final void A06() {
        if (!this.A08) {
            this.A08 = true;
            Button button = this.A0U;
            if (button != null) {
                int i = 8;
                if (!this.A0J.A04.hasFocus()) {
                    i = 0;
                }
                button.setVisibility(i);
            }
        }
    }

    public final void A07(MusicOverlaySearchTab musicOverlaySearchTab, Integer num) {
        C62487Kgc kgc;
        this.A02 = musicOverlaySearchTab;
        if (!this.A07) {
            this.A07 = true;
            this.A03 = AnonymousClass7TF.A0b();
            if (this.A06) {
                this.A0J.A05(true);
                kgc = C62487Kgc.SEARCH;
            } else {
                kgc = C62487Kgc.BROWSE;
                this.A05 = kgc;
            }
            A05(kgc, false);
        }
        JZL jzl = this.A0J;
        jzl.A00 = true;
        if (jzl.A04.hasFocus() && jzl.A01.getVisibility() == 8) {
            jzl.A05(true);
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            View view = this.A0A;
            view.setTranslationY(0.0f);
            AnonymousClass7TG.A1A(view, true);
        } else if (intValue != 2) {
            this.A0A.setVisibility(0);
        } else {
            View view2 = this.A0A;
            view2.setVisibility(0);
            view2.setTranslationY(AnonymousClass7TE.A03(view2) * 0.15f);
            C294975nL A012 = C294975nL.A01(view2, 0);
            A012.A0I(1.0f);
            A012.A0K(0.0f);
            A012.A0F(true).A0H();
        }
        Fragment A013 = A01(this);
        if (A013 != null) {
            A013.setUserVisibleHint(true);
        }
        AnonymousClass1Nd.A00(this.A0I).A01(this.A0H, C64658Lfk.class);
        this.A0N.DT1();
    }

    public final void A08(Integer num) {
        if (this.A07) {
            this.A0J.A01();
            A09(num);
            for (C62487Kgc kgc : this.A0X) {
                String Aef = this.A0P.Aef(kgc);
                0hq r2 = this.A0B;
                if (AnonymousClass06S.A01(r2)) {
                    r2.A19(Aef, 1);
                }
                C294975nL.A05(new View[]{A00(kgc)}, false);
            }
            this.A01 = null;
            this.A0N.DSz();
            27p.A01(this.A0I).A03.A01();
        }
        this.A07 = false;
    }

    public final void Cw6(String str) {
        0qQ.A0B(str, 0);
        if (!AnonymousClass30D.A01(this.A0G, this.A0I)) {
            if (str.length() == 0) {
                A05(C62487Kgc.BROWSE, true);
            } else {
                A04();
            }
        }
        if (!this.A06) {
            C61425K6z k6z = this.A01;
            if (k6z == null) {
                return;
            }
            if (k6z.isResumed()) {
                k6z.A02(str);
            } else {
                k6z.A00 = new C66000M7l(k6z, str);
            }
        } else {
            this.A06 = false;
        }
    }

    public final void Cw7(String str) {
        C61425K6z k6z = this.A01;
        if (k6z != null && k6z.isResumed()) {
            k6z.A03(str, false);
        }
    }

    public final void Dt4(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str) {
        0qQ.A0B(mWx, 0);
        this.A0N.DTF(mWx, musicBrowseCategory, str, AnonymousClass7TF.A0f(this.A0J.A04));
    }

    private final View A00(C62487Kgc kgc) {
        HashMap hashMap = this.A0W;
        View view = (View) hashMap.get(kgc);
        if (view != null) {
            return view;
        }
        View requireViewById = this.A0A.requireViewById(this.A0P.B7t(kgc));
        hashMap.put(kgc, requireViewById);
        return requireViewById;
    }

    public static final C62487Kgc A03(JZ0 jz0) {
        Object obj;
        Iterator it = jz0.A0X.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jz0.A00((C62487Kgc) obj).getVisibility() == 0) {
                break;
            }
        }
        return (C62487Kgc) obj;
    }

    private final void A04() {
        MU0 mu0 = this.A0P;
        C62487Kgc kgc = C62487Kgc.SEARCH;
        0hq r4 = this.A0B;
        0qQ.A0B(kgc, 1);
        C61425K6z A0P2 = r4.A0P(mu0.B7t(kgc));
        if (!(A0P2 == null || A0P2 == this.A01)) {
            String Aef = mu0.Aef(kgc);
            if (AnonymousClass06S.A01(r4)) {
                r4.A19(Aef, 0);
            }
        }
        A05(kgc, true);
    }

    public final void A09(Integer num) {
        this.A0J.A02();
        int intValue = num.intValue();
        if (intValue == 1) {
            AnonymousClass7TE.A1U(this.A0A, true);
        } else if (intValue == 2) {
            View view = this.A0A;
            C294975nL A012 = C294975nL.A01(view, 0);
            A012.A0I(0.0f);
            A012.A0K(AnonymousClass7TE.A03(view) * 0.15f);
            C65724Lye.A00(A012.A0F(true), this, 21);
        } else if (intValue == 0) {
            this.A0A.setVisibility(4);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        Fragment A013 = A01(this);
        if (A013 != null) {
            A013.setUserVisibleHint(false);
        }
        this.A0N.DT0();
        AnonymousClass1Nd.A00(this.A0I).A02(this.A0H, C64658Lfk.class);
    }

    public final Integer Aci() {
        return this.A0V;
    }

    public final void Cw4() {
        UserSession userSession = this.A0I;
        if (AnonymousClass30D.A01(this.A0G, userSession)) {
            A05(this.A05, true);
        }
        if (this.A08) {
            AnonymousClass7TG.A1A(this.A0U, true);
        }
        27p.A01(userSession).A03.A07 = "not_search";
    }

    public final void Cw5() {
        if (this.A08) {
            AnonymousClass7TE.A1U(this.A0U, true);
        }
        if (AnonymousClass30D.A01(this.A0G, this.A0I)) {
            C62487Kgc A032 = A03(this);
            C62487Kgc kgc = C62487Kgc.SEARCH;
            if (A032 != kgc || !(A01(this) instanceof C61423K6w)) {
                A04();
                return;
            }
            C61425K6z k6z = this.A01;
            if (k6z != null) {
                MU0 mu0 = this.A0P;
                0hq r3 = this.A0B;
                0qQ.A0B(kgc, 1);
                int B7t = mu0.B7t(kgc);
                String Aef = mu0.Aef(kgc);
                0s1 r0 = new 0s1(r3);
                r0.A0A(k6z, B7t);
                r0.A0I(Aef);
                r0.A01();
            }
        }
    }

    public final boolean Erv() {
        return !AnonymousClass30D.A01(this.A0G, this.A0I);
    }

    public static final Fragment A01(JZ0 jz0) {
        C62487Kgc A032 = A03(jz0);
        if (A032 == null) {
            return null;
        }
        return jz0.A0B.A0P(jz0.A0P.B7t(A032));
    }

    private final Fragment A02(C62487Kgc kgc) {
        Fragment audioBrowserBrowseLandingPageFragment;
        String str;
        MusicBrowseCategory A012;
        MusicAttributionConfig musicAttributionConfig;
        String BUn;
        MusicOverlaySearchTab musicOverlaySearchTab;
        boolean z;
        Map map;
        String str2;
        String str3;
        ArrayList A1C;
        Fragment kUp;
        Bundle A0a = AnonymousClass7TE.A0a();
        UserSession userSession = this.A0I;
        DbU.A1D(A0a, userSession);
        MusicProduct musicProduct = this.A0G;
        A0a.putSerializable("music_product", musicProduct);
        ImmutableList immutableList = this.A0F;
        A0a.putParcelableArrayList("audio_type_to_exclude", AnonymousClass7TE.A1D(immutableList));
        C3499982t r1 = this.A0K;
        A0a.putSerializable("browse_session_full_id", r1.BUn());
        AnonymousClass80X r8 = this.A0Q;
        A0a.putSerializable("capture_state", r8);
        C59725JVj jVj = this.A0D;
        A0a.putSerializable("camera_surface_type", jVj);
        C3515589i r6 = this.A0C;
        A0a.putSerializable("camera_music_browser_entry_point", r6);
        ImmutableList immutableList2 = this.A0E;
        A0a.putSerializable("camera_already_attached_tracks", immutableList2);
        int i = this.A09;
        A0a.putInt("list_bottom_padding_px", i);
        String str4 = this.A0R;
        A0a.putString("media_id", str4);
        int ordinal = kgc.ordinal();
        if (ordinal == 0) {
            if (AnonymousClass30D.A03(userSession)) {
                A0a.putSerializable("music_product", musicProduct);
                A0a.putBoolean("should_use_light_mode", this.A0T);
                A0a.putParcelableArrayList("ineligible_audio_types", AnonymousClass7TE.A1D(immutableList));
                A0a.putSerializable("music_browser_entry_point", r6);
                if (immutableList2 != null) {
                    A1C = AnonymousClass7TE.A1D(immutableList2);
                } else {
                    A1C = AnonymousClass7TE.A1C();
                }
                A0a.putParcelableArrayList("attached_tracks", A1C);
                A0a.putSerializable("browse_session_id", r1.BUn());
                A0a.putSerializable("surface_type", jVj);
                A0a.putString("media_id", str4);
                A0a.putSerializable("capture_state", r8);
                audioBrowserBrowseLandingPageFragment = new K70();
                audioBrowserBrowseLandingPageFragment.A08 = this;
                audioBrowserBrowseLandingPageFragment.A05 = this.A0M;
            } else {
                if (AnonymousClass30D.A00(musicProduct, userSession)) {
                    if (musicProduct == MusicProduct.CLIPS_EDIT_METADATA || musicProduct == MusicProduct.CLIPS_CAMERA_FORMAT_V2) {
                        str = "clips_browse";
                    } else if (musicProduct == MusicProduct.MUSIC_IN_FEED) {
                        str = "feed_browse";
                    } else if (C14245TsS.A02(musicProduct)) {
                        str = "stories_browse";
                    } else if (musicProduct == MusicProduct.MUSIC_NOTES) {
                        str = "notes_browse";
                    }
                    A012 = C64181LSn.A01(str);
                    musicAttributionConfig = this.A0L;
                    BUn = r1.BUn();
                    musicOverlaySearchTab = this.A02;
                    z = this.A0T;
                    map = this.A04;
                    str2 = null;
                    str3 = "preview";
                }
                audioBrowserBrowseLandingPageFragment = new AudioBrowserBrowseLandingPageFragment();
                audioBrowserBrowseLandingPageFragment.A0A = this;
                audioBrowserBrowseLandingPageFragment.A08 = this.A0M;
                C252063oV r12 = this.A00;
                if (r12 != null) {
                    audioBrowserBrowseLandingPageFragment.A09 = new F0K(audioBrowserBrowseLandingPageFragment, userSession, r12);
                }
                MusicOverlaySearchTab musicOverlaySearchTab2 = this.A02;
                if (musicOverlaySearchTab2 != null) {
                    A0a.putParcelable("defaultFocusedTab", musicOverlaySearchTab2);
                }
                A0a.putBoolean("shouldUseLightMode", this.A0T);
                A0a.putSerializable("visualFeatures", (Serializable) this.A04);
                A0a.putParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config", this.A0L);
            }
            audioBrowserBrowseLandingPageFragment.setArguments(A0a);
            return audioBrowserBrowseLandingPageFragment;
        } else if (ordinal == 1) {
            if (AnonymousClass30D.A00(musicProduct, userSession)) {
                kUp = new C61991KUo();
                C234462xu r13 = this.A0M;
                L20 l20 = this.A0O;
                kUp.A03 = this;
                kUp.A00 = r13;
                kUp.A01 = l20;
            } else {
                kUp = new C61992KUp();
                kUp.A03 = this;
                kUp.A00 = this.A0M;
            }
            A0a.putString("browse_session_single_id", this.A03);
            A0a.putSerializable("capture_state", r8);
            A0a.putBoolean("should_use_light_mode", this.A0T);
            A0a.putSerializable("visual_features", (Serializable) this.A04);
            kUp.setArguments(A0a);
            C61425K6z k6z = (C61425K6z) kUp;
            this.A01 = k6z;
            return k6z;
        } else if (ordinal == 2) {
            A012 = C64181LSn.A02("bookmarked", AnonymousClass7TE.A16(this.A0A.getContext(), 2131967864));
            musicAttributionConfig = this.A0L;
            BUn = r1.BUn();
            musicOverlaySearchTab = this.A02;
            z = this.A0T;
            map = this.A04;
            str2 = null;
            str3 = "full_list";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        MusicProduct musicProduct2 = musicProduct;
        ImmutableList immutableList3 = immutableList2;
        ImmutableList immutableList4 = immutableList;
        C59725JVj jVj2 = jVj;
        C3515589i r122 = r6;
        C61423K6w A002 = C63352KvZ.A00(r122, jVj2, immutableList4, immutableList3, musicProduct2, userSession, musicAttributionConfig, A012, musicOverlaySearchTab, r8, BUn, str2, str3, map, i, false, z);
        A002.A05 = this;
        A002.A03 = this.A0M;
        return A002;
    }

    private final void A05(C62487Kgc kgc, boolean z) {
        if (kgc != A03(this)) {
            for (C62487Kgc kgc2 : this.A0X) {
                if (kgc2 != kgc) {
                    AnonymousClass7TE.A1U(A00(kgc2), z);
                    MU0 mu0 = this.A0P;
                    0hq r1 = this.A0B;
                    0qQ.A0B(kgc2, 1);
                    Fragment A0P2 = r1.A0P(mu0.B7t(kgc2));
                    if (A0P2 != null) {
                        A0P2.setUserVisibleHint(false);
                    }
                }
            }
            MU0 mu02 = this.A0P;
            0hq r5 = this.A0B;
            0qQ.A0B(kgc, 1);
            C61425K6z A0P3 = r5.A0P(mu02.B7t(kgc));
            if (A0P3 != null) {
                C62487Kgc kgc3 = C62487Kgc.SEARCH;
                if (kgc == kgc3) {
                    C61425K6z k6z = A0P3;
                    if (A0P3 instanceof C61423K6w) {
                        k6z = A02(kgc3);
                    }
                    this.A01 = k6z;
                }
                if (A0P3 instanceof MU2) {
                    MU2 mu2 = (MU2) A0P3;
                    mu2.Ep4(this);
                    mu2.Edi(this.A0M);
                }
            } else {
                A0P3 = A02(kgc);
                AnonymousClass7TF.A1C(kgc, 1, A0P3);
                int B7t = mu02.B7t(kgc);
                String Aef = mu02.Aef(kgc);
                0s1 r0 = new 0s1(r5);
                r0.A0A(A0P3, B7t);
                r0.A0I(Aef);
                r0.A01();
            }
            AnonymousClass7TG.A1A(A00(kgc), z);
            A0P3.setUserVisibleHint(true);
        }
    }

    public final boolean A0A() {
        Editable text;
        AnonymousClass4DR A012 = A01(this);
        if ((A012 instanceof AnonymousClass4DR) && A012.onBackPressed()) {
            return true;
        }
        JZL jzl = this.A0J;
        SearchEditText searchEditText = jzl.A04;
        if ((!searchEditText.hasFocus() || (text = searchEditText.getText()) == null || text.length() == 0) && AnonymousClass7TF.A0f(searchEditText).length() <= 0) {
            return false;
        }
        jzl.A01();
        return true;
    }

    public JZ0(View view, 0hq r6, C3515589i r7, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, C3499982t r12, MusicAttributionConfig musicAttributionConfig, C234462xu r14, MVD mvd, MU0 mu0, AnonymousClass80X r17, String str, String str2, Map map, int i, boolean z, boolean z2, boolean z3) {
        C59725JVj jVj;
        DbW.A1O(musicProduct, 1, userSession);
        this.A0G = musicProduct;
        this.A0F = immutableList;
        this.A0P = mu0;
        this.A0A = view;
        this.A0B = r6;
        this.A0I = userSession;
        this.A0K = r12;
        this.A0M = r14;
        this.A0Q = r17;
        this.A0C = r7;
        this.A0E = immutableList2;
        this.A0L = musicAttributionConfig;
        this.A09 = i;
        this.A0N = mvd;
        this.A06 = z;
        this.A0R = str;
        this.A0S = z2;
        this.A0T = z3;
        this.A04 = map;
        C62487Kgc kgc = C62487Kgc.BROWSE;
        this.A05 = kgc;
        this.A0V = AnonymousClass05K.A00;
        int ordinal = this.A0Q.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            jVj = C59725JVj.PRE_CAPTURE;
        } else if (ordinal != 2) {
            jVj = C59725JVj.NO_CAMERA_SESSION;
        } else if (this.A0S) {
            jVj = C59725JVj.SHARE_SHEET;
        } else {
            jVj = C59725JVj.POST_CAPTURE;
        }
        this.A0D = jVj;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0X = A1C;
        A1C.add(kgc);
        A1C.add(C62487Kgc.SEARCH);
        A1C.add(C62487Kgc.SAVED);
        View A0H2 = JTP.A0H(JTR.A0X(view, R.id.search_bar_container_view_stub), R.layout.asset_search_bar);
        0qQ.A07(A0H2);
        JZL jzl = new JZL(A0H2, userSession, this, this);
        this.A0J = jzl;
        Button button = (Button) view.findViewById(R.id.music_cancel_button);
        this.A0U = button;
        if (button != null) {
            C64273LXz.A00(button, 10, this);
        }
        View findViewById = view.findViewById(R.id.qp_megaphone_stub);
        if (findViewById != null) {
            this.A00 = 2b1.A00(findViewById);
        }
        String str3 = str2;
        if (str2 != null) {
            SearchEditText searchEditText = jzl.A04;
            if (!str3.equals(AnonymousClass7TF.A0f(searchEditText))) {
                searchEditText.setText(str3);
            }
        }
        this.A0O = new L20(this);
    }
}
