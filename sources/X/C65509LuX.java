package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

/* renamed from: X.LuX  reason: case insensitive filesystem */
public final class C65509LuX implements MU0, MVD {
    public JZ0 A00;
    public View A01;
    public final int A02;
    public final ViewStub A03;
    public final 0hq A04;
    public final UserSession A05;
    public final C357768Zo A06;
    public final C3499982t A07;
    public final MusicAttributionConfig A08;
    public final C234462xu A09;

    public C65509LuX(View view, 0hq r3, UserSession userSession, C357768Zo r5, C3499982t r6, MusicAttributionConfig musicAttributionConfig, C234462xu r8, int i) {
        0qQ.A0B(r8, 5);
        this.A04 = r3;
        this.A05 = userSession;
        this.A07 = r6;
        this.A09 = r8;
        this.A08 = musicAttributionConfig;
        this.A02 = i;
        this.A06 = r5;
        this.A03 = JTR.A0X(view, R.id.music_search_stub_background);
    }

    public final int B7t(C62487Kgc kgc) {
        int A022 = DbU.A02(kgc, 0);
        if (A022 == 1) {
            return R.id.music_search_precapture_search_results_container;
        }
        if (A022 == 0) {
            return R.id.music_search_precapture_landing_page_container;
        }
        if (A022 == 2) {
            return R.id.music_search_precapture_saved_container;
        }
        throw AnonymousClass7TE.A0w("Unsupported MusicSearchMode");
    }

    public final void DSz() {
    }

    public final void DT1() {
    }

    public final void A00(MusicProduct musicProduct) {
        if (this.A01 == null) {
            View inflate = this.A03.inflate();
            this.A01 = inflate;
            if (inflate != null) {
                Context context = inflate.getContext();
                if (context != null) {
                    DbT.A16(context, inflate, R.color.background);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            View view = this.A01;
            if (view != null) {
                JTR.A1C(view, R.id.capture_format_picker_background_stub);
                ImmutableList of = ImmutableList.of();
                0qQ.A07(of);
                View view2 = this.A01;
                if (view2 != null) {
                    MusicProduct musicProduct2 = musicProduct;
                    this.A00 = new JZ0(view2, this.A04, C3515589i.PRE_CAPTURE, of, (ImmutableList) null, musicProduct2, this.A05, this.A07, this.A08, this.A09, this, this, AnonymousClass80X.PRE_CAPTURE, (String) null, (String) null, (Map) null, this.A02, false, false, false);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        JZ0 jz0 = this.A00;
        if (jz0 != null) {
            jz0.A06();
            JZ0 jz02 = this.A00;
            if (jz02 != null) {
                jz02.A07((MusicOverlaySearchTab) null, AnonymousClass05K.A01);
            }
        }
    }

    public final void A01(MusicProduct musicProduct) {
        JZ0 jz0 = this.A00;
        if (jz0 == null) {
            A00(musicProduct);
            return;
        }
        jz0.A06();
        JZ0 jz02 = this.A00;
        if (jz02 != null) {
            jz02.A07((MusicOverlaySearchTab) null, AnonymousClass05K.A0C);
        }
    }

    public final void DT0() {
        this.A06.DT0();
    }

    public final void DTF(C66569MWx mWx, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A06.Dt3(mWx);
    }

    public final String Aef(C62487Kgc kgc) {
        return AnonymousClass7TG.A0m(kgc, "MusicPrecaptureSearchController", C51975G9x.A0l(kgc));
    }
}
