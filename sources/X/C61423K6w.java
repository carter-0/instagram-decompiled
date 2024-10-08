package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.MusicOverlayResultsListController;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.K6w  reason: case insensitive filesystem */
public final class C61423K6w extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C66542MVw, C229132mt, MU3, MU2 {
    public static final String __redex_internal_original_name = "MusicOverlayBrowseResultsFragment";
    public C3515589i A00;
    public MusicProduct A01;
    public MusicBrowseCategory A02;
    public C234462xu A03;
    public MusicOverlayResultsListController A04;
    public C66447MSb A05;
    public JZH A06;
    public JZH A07;
    public AnonymousClass80X A08;
    public Map A09;
    public boolean A0A;
    public View A0B;
    public ImmutableList A0C;
    public C234502xy A0D;
    public C61265K0a A0E;
    public MusicOverlaySearchTab A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AnonymousClass0eM A0N = DbS.A0I(new C66217MIy(this, 6), MMS.A00(this, 44), new MJ7(3, (Object) null, this), DbS.A0z(C60090JfW.class));
    public final AnonymousClass0eM A0O = DbS.A0I(new C66217MIy(this, 5), MMS.A00(this, 45), new MJ7(2, (Object) null, this), DbS.A0z(C3507185x.class));
    public final AnonymousClass0eM A0P = DbS.A0I(new C66217MIy(this, 4), MMS.A00(this, 46), new MJ7(1, (Object) null, this), DbS.A0z(ClipsCreationViewModel.class));
    public final AnonymousClass0eM A0Q = AnonymousClass0eN.A01(MMS.A00(this, 47));
    public final AnonymousClass0eM A0R = C227642jf.A02(this);
    public final AnonymousClass0eM A0S = AnonymousClass0eN.A01(new C66217MIy(this, 7));
    public final 05G A0T = DbS.A10(C62513Kh3.NOT_STARTED);
    public final long A0U = 1;
    public final MusicBrowseCategory A0V = MusicOverlaySearchTab.A04.A01;
    public final List A0W = AnonymousClass7TE.A1C();

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.0iw, X.K6w, java.lang.Object] */
    public static final void A02(C61423K6w k6w) {
        ? r5 = k6w;
        MusicOverlayResultsListController musicOverlayResultsListController = k6w.A04;
        if (musicOverlayResultsListController == null) {
            0qQ.A0F("resultsListController");
            throw AnonymousClass00P.createAndThrow();
        }
        C3515689j r3 = C3515689j.BROWSER;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("referrer_audio_id", "browserTrendingAudio");
        A0a.putSerializable(AnonymousClass000.A00(1608), r3);
        H1J h1j = new H1J();
        h1j.setArguments(A0a);
        C63353Kva.A00(musicOverlayResultsListController.A0A, h1j, musicOverlayResultsListController.A0L);
        C52086GEg.A0P(C54689HOu.A03, r5, AnonymousClass7TE.A0l(k6w.A0R), (String) null, (String) null, (String) null, k6w.A0U);
        JTS.A10(r5, MGW.A01(r5, (AnonymousClass4D7) null, 30), ((C52963GgG) AnonymousClass7TE.A14(r5.A0S)).A0B);
    }

    public final Object BnI() {
        return null;
    }

    public final /* synthetic */ void DTq(String str, Object obj, int i) {
    }

    public final /* synthetic */ void DTr(int i, Object obj, boolean z) {
    }

    public final void DeV(Object obj, int i) {
        this.A0A = false;
        A00();
    }

    public final boolean Et6() {
        return true;
    }

    public final boolean EtB() {
        return true;
    }

    public final String getModuleName() {
        return "music_overlay_detail";
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, X.K6w, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r1 == 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r4 = 0
            X.0qQ.A0B(r13, r4)
            super.onViewCreated(r13, r14)
            X.0eM r2 = r12.A0R
            X.29H r5 = X.JTS.A0K(r2)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r12.A02
            java.lang.String r11 = "musicBrowseCategory"
            r6 = 0
            if (r0 == 0) goto L_0x0055
            java.lang.String r9 = r0.A00()
            long r0 = r5.A02
            r7 = 17641988(0x10d3204, double:8.7163E-317)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0028
            X.29E r5 = r5.A0E
            java.lang.String r3 = "music_overlay_browse_results_fragment_view_music_category : "
            X.JTP.A1L(r5, r3, r9, r0)
        L_0x0028:
            r0 = 2131428253(0x7f0b039d, float:1.8478145E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.A0B = r0
            r12.A00()
            r0 = 2131433821(0x7f0b195d, float:1.8489439E38)
            android.view.View r5 = r13.findViewById(r0)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r12.A02
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x004a
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 1
        L_0x004b:
            r3 = 8
            if (r0 == 0) goto L_0x0284
            X.80X r1 = r12.A08
            if (r1 != 0) goto L_0x005d
            java.lang.String r11 = "captureState"
        L_0x0055:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005d:
            X.80X r0 = X.AnonymousClass80X.POST_CAPTURE
            if (r1 != r0) goto L_0x019f
            com.instagram.api.schemas.MusicProduct r0 = r12.A01
            if (r0 == 0) goto L_0x019b
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r0 != r1) goto L_0x019f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass30D.A02(r0)
            if (r0 == 0) goto L_0x019f
            boolean r0 = r12.A03()
            r8 = 1
            if (r0 == 0) goto L_0x033f
            com.instagram.api.schemas.MusicProduct r0 = r12.A01
            if (r0 == 0) goto L_0x019b
            if (r0 != r1) goto L_0x033f
            r0 = 2131430178(0x7f0b0b22, float:1.848205E38)
            X.3oV r6 = X.DbV.A0T(r13, r0, r4)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r9 = 2131238802(0x7f081f92, float:1.8093893E38)
            r1 = 2131955286(0x7f130e56, float:1.9547095E38)
            X.KhG r0 = X.C62524KhG.VOLUME
            A01(r0, r7, r9, r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.1KU.A08(r0)
            if (r0 == 0) goto L_0x00ab
            r9 = 2131238989(0x7f08204d, float:1.8094272E38)
            r1 = 2131955235(0x7f130e23, float:1.9546992E38)
            X.KhG r0 = X.C62524KhG.AUDIO_ENHANCE
            A01(r0, r7, r9, r1)
        L_0x00ab:
            r9 = 2131238551(0x7f081e97, float:1.8093384E38)
            r1 = 2131955285(0x7f130e55, float:1.9547093E38)
            X.KhG r0 = X.C62524KhG.VOICEOVER
            A01(r0, r7, r9, r1)
            r9 = 2131238737(0x7f081f51, float:1.8093761E38)
            r1 = 2131967864(0x7f133f78, float:1.9572606E38)
            X.KhG r0 = X.C62524KhG.SAVED
            A01(r0, r7, r9, r1)
            X.0lg r10 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36321361601307950(0x810a160001252e, double:3.033113558826567E-306)
            boolean r0 = X.182.A06(r9, r10, r0)
            if (r0 == 0) goto L_0x00dd
            r10 = 2131237926(0x7f081c26, float:1.8092116E38)
            r1 = 2131975535(0x7f135d6f, float:1.9588165E38)
            X.KhG r0 = X.C62524KhG.TRENDING
            A01(r0, r7, r10, r1)
        L_0x00dd:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r12)
            java.util.List r0 = r0.A0N()
            int r10 = r0.size()
            X.0lg r11 = X.AnonymousClass7TF.A0L(r2, r4)
            r0 = 36314472473692734(0x8103d200000a3e, double:3.028756846782414E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            r1 = 2
            if (r0 == 0) goto L_0x0112
            X.89i r0 = r12.A00
            if (r0 == 0) goto L_0x0107
            int r0 = r0.ordinal()
            if (r0 == r1) goto L_0x0197
            if (r0 != r3) goto L_0x0107
            if (r10 >= r8) goto L_0x0112
        L_0x0107:
            r10 = 2131237921(0x7f081c21, float:1.8092106E38)
            r1 = 2131967815(0x7f133f47, float:1.9572507E38)
            X.KhG r0 = X.C62524KhG.IMPORT
            A01(r0, r7, r10, r1)
        L_0x0112:
            X.0lg r2 = X.AnonymousClass7TF.A0L(r2, r4)
            r0 = 36327202756770019(0x810f66000038e3, double:3.0368075290612245E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x012e
            r2 = 2131238810(0x7f081f9a, float:1.809391E38)
            r1 = 2131955248(0x7f130e30, float:1.9547018E38)
            X.KhG r0 = X.C62524KhG.SFX
            A01(r0, r7, r2, r1)
        L_0x012e:
            int r1 = r7.size()
            r0 = 4
            if (r1 > r0) goto L_0x0136
            r8 = 0
        L_0x0136:
            X.L6s[] r0 = new X.C63786L6s[r4]
            java.lang.Object[] r2 = r7.toArray(r0)
            X.L6s[] r2 = (X.C63786L6s[]) r2
            X.L21 r0 = new X.L21
            r0.<init>(r12)
            X.Jko r1 = new X.Jko
            r1.<init>(r0, r2, r8)
            android.view.View r0 = r6.getView()
            java.lang.String r9 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.0qQ.A0C(r0, r9)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setAdapter(r1)
            if (r8 != 0) goto L_0x0176
            android.content.Context r2 = r12.getContext()
            int r0 = r7.size()
            androidx.recyclerview.widget.GridLayoutManager r1 = new androidx.recyclerview.widget.GridLayoutManager
            r1.<init>(r2, r0)
        L_0x0165:
            android.view.View r0 = r6.getView()
            X.0qQ.A0C(r0, r9)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.setLayoutManager(r1)
            r6.setVisibility(r4)
            goto L_0x033f
        L_0x0176:
            android.view.View r2 = r6.getView()
            X.0qQ.A0C(r2, r9)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            android.content.Context r1 = r12.getContext()
            if (r1 == 0) goto L_0x032c
            X.Jll r0 = new X.Jll
            r0.<init>(r1)
            r2.A11(r0)
            android.content.Context r0 = r12.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r0, r4, r4)
            goto L_0x0165
        L_0x0197:
            if (r10 > r8) goto L_0x0112
            goto L_0x0107
        L_0x019b:
            java.lang.String r11 = "musicProduct"
            goto L_0x0055
        L_0x019f:
            java.util.LinkedHashSet r7 = X.DbS.A0y()
            boolean r0 = r12.A03()
            if (r0 == 0) goto L_0x0202
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.api.schemas.MusicProduct r0 = r12.A01
            java.lang.String r11 = "musicProduct"
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.AnonymousClass30D.A00(r0, r1)
            if (r0 == 0) goto L_0x0202
            X.KhG r0 = X.C62524KhG.SAVED
            r7.add(r0)
            com.instagram.api.schemas.MusicProduct r0 = r12.A01
            if (r0 == 0) goto L_0x0055
            com.instagram.api.schemas.MusicProduct r10 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r0 != r10) goto L_0x01dc
            X.0lg r9 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36321361601242413(0x810a160000252d, double:3.033113558785121E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x01dc
            X.KhG r0 = X.C62524KhG.TRENDING
            r7.add(r0)
        L_0x01dc:
            com.instagram.api.schemas.MusicProduct r0 = r12.A01
            if (r0 == 0) goto L_0x0055
            if (r0 != r10) goto L_0x0202
            X.0lg r9 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36314472473692734(0x8103d200000a3e, double:3.028756846782414E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            if (r0 == 0) goto L_0x0202
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            boolean r0 = X.AnonymousClass30D.A02(r0)
            if (r0 == 0) goto L_0x0202
            X.KhG r0 = X.C62524KhG.IMPORT
            r7.add(r0)
        L_0x0202:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0262
            r0 = 2131429306(0x7f0b07ba, float:1.848028E38)
            android.view.View r1 = X.DbY.A0F(r13, r0)
            X.KhG r0 = X.C62524KhG.SAVED
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0234
            r0 = 2131440659(0x7f0b3413, float:1.8503308E38)
            android.view.View r8 = X.DbY.A0F(r1, r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131967865(0x7f133f79, float:1.9572608E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r8.setContentDescription(r0)
            X.2eS.A01(r8)
            r0 = 11
            X.C64273LXz.A00(r8, r0, r12)
        L_0x0234:
            X.KhG r0 = X.C62524KhG.TRENDING
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x024b
            r0 = 2131443214(0x7f0b3e0e, float:1.850849E38)
            android.view.View r1 = X.DbY.A0F(r13, r0)
            X.2eS.A01(r1)
            r0 = 12
            X.C64273LXz.A00(r1, r0, r12)
        L_0x024b:
            X.KhG r0 = X.C62524KhG.IMPORT
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0262
            r0 = 2131434618(0x7f0b1c7a, float:1.8491055E38)
            android.view.View r1 = X.DbY.A0F(r13, r0)
            X.2eS.A01(r1)
            r0 = 13
            X.C64273LXz.A00(r1, r0, r12)
        L_0x0262:
            X.0lg r4 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321361601373487(0x810a160002252f, double:3.033113558868013E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x033f
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = X.JTP.A0Y(r12)
            X.0V2 r1 = r0.A0W
            r0 = 31
            X.MGW r0 = X.MGW.A01(r12, r6, r0)
            X.JTS.A10(r12, r0, r1)
            goto L_0x033f
        L_0x0284:
            r5.setVisibility(r4)
            r0 = 2131433855(0x7f0b197f, float:1.8489507E38)
            android.widget.TextView r1 = X.DbW.A0B(r5, r0)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r12.A02
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r0.A06
            r1.setText(r0)
            r0 = 2131433815(0x7f0b1957, float:1.8489426E38)
            android.view.View r2 = r5.findViewById(r0)
            com.instagram.music.common.model.MusicBrowseCategory r1 = r12.A02
            if (r1 == 0) goto L_0x0055
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x0328
            java.lang.String r1 = r1.A00()
            java.lang.String r0 = "artist_song_list"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0328
            r2.setVisibility(r4)
            r0 = 14
            X.C64273LXz.A00(r2, r0, r12)
        L_0x02ba:
            r0 = 2131433849(0x7f0b1979, float:1.8489495E38)
            X.3oV r5 = X.DbV.A0T(r5, r0, r4)
            com.instagram.music.common.model.MusicBrowseCategory r0 = r12.A02
            if (r0 == 0) goto L_0x0055
            java.lang.String r2 = r0.A05
            if (r2 == 0) goto L_0x0335
            com.instagram.music.common.model.MusicSearchPlaylistType r1 = r0.A01
            com.instagram.music.common.model.MusicSearchPlaylistType r0 = com.instagram.music.common.model.MusicSearchPlaylistType.SPOTIFY
            if (r1 == r0) goto L_0x02d3
            com.instagram.music.common.model.MusicSearchPlaylistType r0 = com.instagram.music.common.model.MusicSearchPlaylistType.SPOTIFY_RECENTLY_PLAYED
            if (r1 != r0) goto L_0x0335
        L_0x02d3:
            android.view.View r0 = r5.getView()
            r0.setVisibility(r4)
            android.view.View r7 = r5.getView()
            boolean r0 = r7 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0342
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0342
            X.DbT.A1H(r7)
            android.text.Spanned r0 = android.text.Html.fromHtml(r2, r4)
            r7.setText(r0)
            java.lang.CharSequence r0 = r7.getText()
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r0)
            int r1 = r6.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r6.getSpans(r4, r1, r0)
            X.0sC r5 = X.0pe.A00(r0)
        L_0x0307:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0331
            java.lang.Object r3 = r5.next()
            android.text.style.URLSpan r3 = (android.text.style.URLSpan) r3
            java.lang.String r0 = r3.getURL()
            com.instagram.music.search.MusicOverlayBrowseResultsFragment$removeLinksUnderline$1 r2 = new com.instagram.music.search.MusicOverlayBrowseResultsFragment$removeLinksUnderline$1
            r2.<init>(r0)
            int r1 = r6.getSpanStart(r3)
            int r0 = r6.getSpanEnd(r3)
            r6.setSpan(r2, r1, r0, r4)
            goto L_0x0307
        L_0x0328:
            r2.setVisibility(r3)
            goto L_0x02ba
        L_0x032c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0331:
            r7.setText(r6)
            return
        L_0x0335:
            boolean r0 = r5.CVM()
            if (r0 == 0) goto L_0x0342
            android.view.View r5 = r5.getView()
        L_0x033f:
            r5.setVisibility(r3)
        L_0x0342:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61423K6w.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        View view;
        if (182.A06(0Tu.A05, DbY.A0R(this.A0R), 36326846274484262L) && (view = this.A0B) != null) {
            view.setVisibility(DbW.A01(this.A0A ? 1 : 0));
        }
    }

    public static void A01(C62524KhG khG, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C63786L6s(khG, i, i2));
    }

    private final boolean A03() {
        MusicBrowseCategory musicBrowseCategory = this.A02;
        if (musicBrowseCategory != null) {
            if (0qQ.A0K(musicBrowseCategory.A00(), "artist_song_list")) {
                return false;
            }
            MusicBrowseCategory musicBrowseCategory2 = this.A02;
            if (musicBrowseCategory2 != null) {
                if (0qQ.A0K(musicBrowseCategory2.A00(), "saved_music")) {
                    return false;
                }
                MusicBrowseCategory musicBrowseCategory3 = this.A02;
                if (musicBrowseCategory3 != null) {
                    if (0qQ.A0K(musicBrowseCategory3.A00(), "saved_original_audio")) {
                        return false;
                    }
                    MusicBrowseCategory musicBrowseCategory4 = this.A02;
                    if (musicBrowseCategory4 != null) {
                        if (!0qQ.A0K(musicBrowseCategory4.A00(), "playlists")) {
                            return true;
                        }
                        MusicBrowseCategory musicBrowseCategory5 = this.A02;
                        if (musicBrowseCategory5 != null) {
                            if (!0qQ.A0K(musicBrowseCategory5.A04, "bookmarked")) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        0qQ.A0F("musicBrowseCategory");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        JZH jzh = this.A07;
        if (jzh != null) {
            if (jzh.A01.A06()) {
                JZH jzh2 = this.A07;
                if (jzh2 != null) {
                    jzh2.A00(false);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("resultsLoader");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.1OC ANA(X.1NU r21, java.lang.Integer r22, java.lang.Long r23, java.lang.Object r24, java.lang.String r25) {
        /*
            r20 = this;
            r13 = r24
            r4 = 1
            r14 = r22
            X.0qQ.A0B(r14, r4)
            java.lang.String r2 = "parser"
            r12 = r21
            boolean r0 = r12 instanceof X.C12790T7a
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = "pando"
        L_0x0012:
            r3 = r20
            X.K0a r0 = r3.A0E
            if (r0 != 0) goto L_0x0022
            java.lang.String r8 = "navigationPerfLogger"
        L_0x001a:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            r0.A0J(r2, r1)
            com.instagram.music.common.model.MusicBrowseCategory r13 = (com.instagram.music.common.model.MusicBrowseCategory) r13
            if (r13 != 0) goto L_0x0030
            com.instagram.music.common.model.MusicBrowseCategory r13 = r3.A02
            if (r13 != 0) goto L_0x0030
            java.lang.String r8 = "musicBrowseCategory"
            goto L_0x001a
        L_0x0030:
            X.0eM r6 = r3.A0R
            X.0lg r7 = X.DbT.A0X(r6)
            com.instagram.api.schemas.MusicProduct r1 = r3.A01
            java.lang.String r8 = "musicProduct"
            if (r1 == 0) goto L_0x001a
            r0 = 0
            X.0qQ.A0B(r7, r0)
            com.instagram.api.schemas.MusicProduct r2 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r1 != r2) goto L_0x0063
            X.0Tu r5 = X.0Tu.A05
            r0 = 36326300814489274(0x810e94000d36ba, double:3.0362371371310513E-306)
        L_0x004b:
            boolean r0 = X.182.A06(r5, r7, r0)
        L_0x004f:
            r18 = 0
            if (r0 == 0) goto L_0x0081
            com.instagram.music.common.model.MusicSearchPlaylistType r0 = r13.A01
            if (r0 == 0) goto L_0x0081
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0076;
                case 4: goto L_0x0073;
                case 5: goto L_0x0081;
                default: goto L_0x005e;
            }
        L_0x005e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0063:
            boolean r0 = X.C14245TsS.A02(r1)
            if (r0 == 0) goto L_0x0071
            X.0Tu r5 = X.0Tu.A05
            r0 = 36326300814554811(0x810e94000e36bb, double:3.036237137172497E-306)
            goto L_0x004b
        L_0x0071:
            r0 = 0
            goto L_0x004f
        L_0x0073:
            java.lang.String r18 = "spotify_recently_played"
            goto L_0x0081
        L_0x0076:
            java.lang.String r18 = "spotify"
            goto L_0x0081
        L_0x0079:
            java.lang.String r18 = "numbered"
            goto L_0x0081
        L_0x007c:
            java.lang.String r18 = "for_you"
            goto L_0x0081
        L_0x007f:
            java.lang.String r18 = "artist_spotlight"
        L_0x0081:
            X.LSH r9 = X.LSH.A02
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.api.schemas.MusicProduct r10 = r3.A01
            if (r10 == 0) goto L_0x001a
            java.lang.String r5 = r3.A0H
            if (r5 != 0) goto L_0x0092
            java.lang.String r8 = "browseSessionFullId"
            goto L_0x001a
        L_0x0092:
            r6 = 1
            if (r10 != r2) goto L_0x00af
            X.80X r0 = r3.A08
            if (r0 != 0) goto L_0x00a5
            java.lang.String r8 = "captureState"
            goto L_0x001a
        L_0x009d:
            r0 = 3278(0xcce, float:4.593E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0012
        L_0x00a5:
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x00ae
            r0 = 2
            if (r1 == r0) goto L_0x00af
        L_0x00ae:
            r6 = 0
        L_0x00af:
            r4 = 0
            if (r6 == 0) goto L_0x0129
            if (r10 != r2) goto L_0x0127
            X.0eM r0 = r3.A0Q
            java.lang.Object r0 = r0.getValue()
            X.83e r0 = (X.C3500883e) r0
            java.util.List r0 = r0.A04()
            if (r0 == 0) goto L_0x0129
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = r0.iterator()
        L_0x00ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9bo r0 = (X.C381469bo) r0
            java.lang.String r0 = r0.A02
            java.lang.Object r0 = X.JTS.A0h(r0, r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r1)
            goto L_0x00ca
        L_0x00e3:
            java.util.LinkedHashMap r4 = X.C51975G9x.A0o(r3)
            java.util.Iterator r7 = X.AnonymousClass7TF.A0s(r3)
        L_0x00eb:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0129
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r7)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r0 = X.JTT.A08(r1)
            java.util.LinkedHashMap r2 = X.DbS.A0x(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x010b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r6.next()
            X.9bo r0 = (X.C381469bo) r0
            java.lang.String r1 = r0.A01
            float r0 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.put(r1, r0)
            goto L_0x010b
        L_0x0123:
            r4.put(r3, r2)
            goto L_0x00eb
        L_0x0127:
            java.util.Map r4 = r3.A09
        L_0x0129:
            r15 = r23
            r16 = r25
            r17 = r5
            r19 = r4
            X.1OC r0 = r9.A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61423K6w.ANA(X.1NU, java.lang.Integer, java.lang.Long, java.lang.Object, java.lang.String):X.1OC");
    }

    public final boolean CKd() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null) {
            0qQ.A0F("resultsListController");
            throw AnonymousClass00P.createAndThrow();
        }
        C60246Ji3 ji3 = musicOverlayResultsListController.A0G;
        if (ji3.A09.size() > 0 || ji3.A08.size() > 0) {
            return true;
        }
        return false;
    }

    public final void Del(Object obj, int i) {
        String str;
        this.A0T.Epw(C62513Kh3.LOADING);
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null) {
            str = "resultsListController";
        } else {
            musicOverlayResultsListController.A0E.notifyDataSetChanged();
            C61265K0a k0a = this.A0E;
            str = "navigationPerfLogger";
            if (k0a != null) {
                k0a.A00.A04();
                C61265K0a k0a2 = this.A0E;
                if (k0a2 != null) {
                    MusicBrowseCategory musicBrowseCategory = this.A02;
                    if (musicBrowseCategory == null) {
                        str = "musicBrowseCategory";
                    } else {
                        k0a2.A0J("tab", musicBrowseCategory.A00());
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dew(X.C66446MSa r20, java.lang.Object r21, int r22, boolean r23, boolean r24) {
        /*
            r19 = this;
            r6 = r21
            r2 = 0
            r3 = r19
            X.K0a r0 = r3.A0E
            java.lang.String r7 = "navigationPerfLogger"
            r8 = 0
            if (r0 == 0) goto L_0x0065
            X.34p r0 = r0.A00
            r0.A05()
            X.K0a r0 = r3.A0E
            if (r0 == 0) goto L_0x0065
            X.34p r0 = r0.A01
            r0.A08(r8)
            X.CGO r4 = r20.F04()
            X.K0a r5 = r3.A0E
            if (r5 == 0) goto L_0x0065
            boolean r0 = r4.CPt()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "cache"
            r5.A0J(r0, r1)
            X.K0a r5 = r3.A0E
            if (r5 == 0) goto L_0x0065
            r17 = r23
            java.lang.String r1 = java.lang.String.valueOf(r17)
            r0 = 2920(0xb68, float:4.092E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.A0J(r0, r1)
            X.K0a r0 = r3.A0E
            if (r0 == 0) goto L_0x0065
            X.34p r0 = r0.A01
            r0.A05()
            com.instagram.music.common.model.MusicBrowseCategory r0 = r3.A02
            java.lang.String r11 = "musicBrowseCategory"
            if (r0 == 0) goto L_0x00cc
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "playlists"
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.String r10 = "audioTrackTypesToExclude"
            if (r0 == 0) goto L_0x009c
            com.instagram.api.schemas.MusicProduct r1 = r3.A01
            if (r1 != 0) goto L_0x006d
            java.lang.String r7 = "musicProduct"
        L_0x0065:
            X.0qQ.A0F(r7)
        L_0x0068:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006d:
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r1 == r0) goto L_0x009c
            com.google.common.collect.ImmutableList r1 = r3.A0C
            if (r1 == 0) goto L_0x01b9
            com.instagram.music.common.constants.AudioTrackType r0 = com.instagram.music.common.constants.AudioTrackType.ORIGINAL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0186
            java.util.List r0 = r4.A05
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r0.iterator()
        L_0x0087:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r1 = r7.next()
            r0 = r1
            X.JZC r0 = (X.JZC) r0
            X.DHT r0 = r0.A0F
            if (r0 != 0) goto L_0x0087
            r5.add(r1)
            goto L_0x0087
        L_0x009c:
            java.util.List r1 = r4.A05
            com.google.common.collect.ImmutableList r0 = r3.A0C
            if (r0 == 0) goto L_0x01b9
            java.util.ArrayList r5 = X.C64131LPf.A01(r1, r0)
            goto L_0x0188
        L_0x00a8:
            X.JZH r0 = r3.A07
            java.lang.String r10 = "resultsLoader"
            if (r0 == 0) goto L_0x01b9
            X.6z9 r0 = r0.A01
            X.6zA r0 = r0.A03
            r0.A07 = r8
            r0.A0A = r2
            int r1 = r5.size()
            r0 = 15
            if (r1 <= r0) goto L_0x00c0
            r1 = 15
        L_0x00c0:
            java.util.List r1 = X.00k.A0d(r5, r1)
            com.instagram.music.common.model.MusicBrowseCategory r6 = (com.instagram.music.common.model.MusicBrowseCategory) r6
            if (r6 != 0) goto L_0x00d0
            com.instagram.music.common.model.MusicBrowseCategory r6 = r3.A02
            if (r6 != 0) goto L_0x00d0
        L_0x00cc:
            X.0qQ.A0F(r11)
            goto L_0x0068
        L_0x00d0:
            java.lang.String r5 = r6.A00()
            java.lang.String r14 = "trending"
            boolean r0 = X.0qQ.A0K(r5, r14)
            if (r0 == 0) goto L_0x0132
            java.lang.String r0 = r4.A03
            r3.A0J = r0
            android.content.Context r7 = r3.requireContext()
            java.lang.String r6 = r4.A04
            r0 = 1
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0q(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00ef:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r1.next()
            X.JZC r0 = (X.JZC) r0
            X.MWx r0 = r0.A00()
            if (r0 == 0) goto L_0x00ef
            r8.add(r0)
            goto L_0x00ef
        L_0x0105:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r8.iterator()
        L_0x010d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0121
            java.lang.Object r0 = r1.next()
            X.MWx r0 = (X.C66569MWx) r0
            X.MWs r0 = X.LQp.A00(r0)
            r4.add(r0)
            goto L_0x010d
        L_0x0121:
            r1 = 2131967821(0x7f133f4d, float:1.957252E38)
            java.lang.String r0 = "PLAYLIST_ID.FOR_YOU"
            X.JZC r1 = X.LQp.A01(r7, r0, r6, r4, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r1.A0G = r0
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
        L_0x0132:
            boolean r0 = X.0qQ.A0K(r5, r14)
            if (r0 == 0) goto L_0x017f
            r0 = 0
        L_0x0139:
            java.util.List r4 = r3.A0W
            r4.addAll(r0, r1)
            X.JZH r0 = r3.A07
            if (r0 == 0) goto L_0x01b9
            X.6z9 r0 = r0.A01
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            if (r1 == r5) goto L_0x0150
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x01b0
        L_0x0150:
            X.JZH r0 = r3.A06
            if (r0 == 0) goto L_0x01b0
            X.6z9 r0 = r0.A01
            X.6zA r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            if (r1 == r5) goto L_0x0160
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x01b0
        L_0x0160:
            X.05G r1 = r3.A0T
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x017c
            X.Kh3 r0 = X.C62513Kh3.EMPTY
        L_0x016a:
            r1.Epw(r0)
            com.instagram.music.search.MusicOverlayResultsListController r12 = r3.A04
            if (r12 == 0) goto L_0x01b4
            com.instagram.music.common.model.MusicBrowseCategory r13 = r3.A02
            if (r13 == 0) goto L_0x00cc
            java.lang.String r15 = r3.A0J
            r18 = r2
            r16 = r4
            goto L_0x01ad
        L_0x017c:
            X.Kh3 r0 = X.C62513Kh3.LOADED
            goto L_0x016a
        L_0x017f:
            java.util.List r0 = r3.A0W
            int r0 = r0.size()
            goto L_0x0139
        L_0x0186:
            java.util.List r5 = r4.A05
        L_0x0188:
            boolean r0 = r3.A0L
            java.lang.String r9 = "resultsListController"
            if (r0 != 0) goto L_0x00a8
            X.05G r1 = r3.A0T
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01b1
            X.Kh3 r0 = X.C62513Kh3.EMPTY
        L_0x0198:
            r1.Epw(r0)
            com.instagram.music.search.MusicOverlayResultsListController r12 = r3.A04
            if (r12 == 0) goto L_0x01b4
            java.lang.String r14 = java.lang.String.valueOf(r6)
            com.instagram.music.common.model.MusicBrowseCategory r13 = r3.A02
            if (r13 == 0) goto L_0x00cc
            java.lang.String r15 = r4.A03
            r18 = r2
            r16 = r5
        L_0x01ad:
            r12.A09(r13, r14, r15, r16, r17, r18)
        L_0x01b0:
            return
        L_0x01b1:
            X.Kh3 r0 = X.C62513Kh3.LOADED
            goto L_0x0198
        L_0x01b4:
            X.0qQ.A0F(r9)
            goto L_0x0068
        L_0x01b9:
            X.0qQ.A0F(r10)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61423K6w.Dew(X.MSa, java.lang.Object, int, boolean, boolean):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0R);
    }

    public final boolean isScrolledToBottom() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null || musicOverlayResultsListController.A0A()) {
            return true;
        }
        return false;
    }

    public final boolean isScrolledToTop() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null || musicOverlayResultsListController.A0B()) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        if (!this.A0K) {
            MusicBrowseCategory musicBrowseCategory = this.A02;
            if (musicBrowseCategory == null) {
                0qQ.A0F("musicBrowseCategory");
                throw AnonymousClass00P.createAndThrow();
            } else if (musicBrowseCategory.A07) {
                return false;
            }
        }
        0hq r0 = this.mFragmentManager;
        if (r0 == null) {
            return false;
        }
        r0.A0c();
        return true;
    }

    public final void DeK(C268654dm r4, int i) {
        String str;
        Throwable A012 = r4.A01();
        String str2 = null;
        if (A012 != null) {
            str2 = A012.getMessage();
        }
        JTS.A0K(this.A0R).A0E(str2, "");
        C61265K0a k0a = this.A0E;
        if (k0a == null) {
            str = "navigationPerfLogger";
        } else {
            C2366634p r0 = k0a.A00;
            if (str2 == null) {
                str2 = "";
            }
            r0.A07(str2);
            MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
            if (musicOverlayResultsListController == null) {
                str = "resultsListController";
            } else {
                C59689JTv.A0B(musicOverlayResultsListController.A0A.getContext(), "RequestFail");
                musicOverlayResultsListController.A0E.notifyDataSetChanged();
                this.A0T.Epw(C62513Kh3.ERROR);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        C3515589i r1;
        ImmutableList immutableList;
        JZH jzh;
        int A022 = AnonymousClass0fD.A02(1045896943);
        C61423K6w.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            setModuleNameV2("music_overlay_detail");
            JZH jzh2 = null;
            C227862kA A0I2 = DbS.A0I(MMS.A00(this, 48), new C66217MIy(this, 3), MMW.A00((Object) null, this, 49), DbS.A0z(C60329JjY.class));
            C66217MIy mIy = new C66217MIy(this, 2);
            AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66217MIy(MMS.A00(this, 49), 0));
            C227862kA A0I3 = DbS.A0I(new C66217MIy(A002, 1), mIy, new MJ7(0, (Object) null, A002), DbS.A0z(C60246Ji3.class));
            this.A0F = (MusicOverlaySearchTab) bundle2.getParcelable("MusicOverlayBrowseResultsFragment.music_overlay_search_tab");
            this.A02 = (MusicBrowseCategory) C320236s2.A00(bundle2, MusicBrowseCategory.class, "MusicOverlayBrowseResultsFragment.music_browse_category");
            boolean z = false;
            this.A0M = bundle2.getBoolean("MusicOverlayBrowseResultsFragment.should_use_light_mode", false);
            this.A09 = (Map) bundle2.getSerializable("visual_features");
            String A0m = JTP.A0m(bundle2, "MusicOverlayBrowseResultsFragment.audio_browser_surface");
            DbS.A1Y(A0m);
            String str = "preview";
            if (!0qQ.A0K(A0m, str)) {
                if (0qQ.A0K(A0m, "full_list")) {
                    str = "full_list";
                } else {
                    throw AnonymousClass7TF.A0W(AnonymousClass000.A00(2334), A0m);
                }
            }
            this.A0G = str;
            AnonymousClass0eM r51 = this.A0R;
            29H A0K2 = JTS.A0K(r51);
            MusicBrowseCategory musicBrowseCategory = this.A02;
            String str2 = "musicBrowseCategory";
            if (musicBrowseCategory != null) {
                JTP.A1L(A0K2.A0E, "music_overlay_browse_results_fragment_music_category : ", musicBrowseCategory.A00(), A0K2.A02);
                MusicAttributionConfig musicAttributionConfig = (MusicAttributionConfig) bundle2.getParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config");
                Serializable serializable = bundle2.getSerializable("capture_state");
                0qQ.A0C(serializable, AnonymousClass000.A00(335));
                this.A08 = (AnonymousClass80X) serializable;
                Serializable serializable2 = bundle2.getSerializable("music_product");
                0qQ.A0C(serializable2, AnonymousClass000.A00(718));
                this.A01 = (MusicProduct) serializable2;
                this.A0H = JTP.A0m(bundle2, "browse_session_full_id");
                this.A0K = bundle2.getBoolean("MusicOverlayBrowseResultsFragment.is_tabbed_fragment", false);
                this.A0I = bundle2.getString("media_id");
                this.A0C = ImmutableList.copyOf((Collection) C320236s2.A02(bundle2, AudioTrackType.class, "audio_type_to_exclude"));
                Serializable serializable3 = bundle2.getSerializable("camera_surface_type");
                0qQ.A0C(serializable3, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
                C59725JVj jVj = (C59725JVj) serializable3;
                Serializable serializable4 = bundle2.getSerializable("camera_music_browser_entry_point");
                if (serializable4 instanceof C3515589i) {
                    r1 = (C3515589i) serializable4;
                } else {
                    r1 = null;
                }
                this.A00 = r1;
                Serializable serializable5 = bundle2.getSerializable("camera_already_attached_tracks");
                if (serializable5 instanceof ImmutableList) {
                    immutableList = (ImmutableList) serializable5;
                } else {
                    immutableList = null;
                }
                int i = bundle2.getInt("list_bottom_padding_px");
                Context requireContext = requireContext();
                UserSession A0l = AnonymousClass7TE.A0l(r51);
                C234462xu r12 = this.A03;
                AnonymousClass80X r0 = this.A08;
                if (r0 != null) {
                    this.A0D = C234472xv.A00(requireContext, A0l, this, r12, 002.A0R("MusicOverlayBrowseResultsFragment-", r0.name()), C234472xv.A02(A0l));
                    MusicBrowseCategory musicBrowseCategory2 = this.A02;
                    if (musicBrowseCategory2 != null) {
                        if (0qQ.A0K(musicBrowseCategory2.A00(), "trending")) {
                            MusicBrowseCategory musicBrowseCategory3 = this.A02;
                            if (musicBrowseCategory3 != null) {
                                if (musicBrowseCategory3.A07) {
                                    0lg A0X = DbT.A0X(r51);
                                    MusicProduct musicProduct = this.A01;
                                    if (musicProduct != null) {
                                        0qQ.A0B(A0X, 0);
                                        if (musicProduct == MusicProduct.MUSIC_IN_FEED && 182.A06(0Tu.A05, A0X, 36322637208627539L)) {
                                            z = true;
                                        }
                                    }
                                    0qQ.A0F("musicProduct");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                            }
                        }
                        this.A0L = z;
                        UserSession A0l2 = AnonymousClass7TE.A0l(r51);
                        MusicBrowseCategory musicBrowseCategory4 = this.A02;
                        if (musicBrowseCategory4 != null) {
                            this.A07 = new JZH(this, A0l2, musicBrowseCategory4, this, false);
                            if (this.A0L) {
                                jzh2 = new JZH(this, AnonymousClass7TE.A0l(r51), this.A0V, this, false);
                            }
                            this.A06 = jzh2;
                            UserSession A0l3 = AnonymousClass7TE.A0l(r51);
                            MusicProduct musicProduct2 = this.A01;
                            if (musicProduct2 != null) {
                                ImmutableList immutableList2 = this.A0C;
                                if (immutableList2 == null) {
                                    str2 = "audioTrackTypesToExclude";
                                } else {
                                    String str3 = this.A0H;
                                    if (str3 == null) {
                                        str2 = "browseSessionFullId";
                                    } else {
                                        MusicBrowseCategory musicBrowseCategory5 = this.A02;
                                        if (musicBrowseCategory5 != null) {
                                            C66447MSb mSb = this.A05;
                                            C234462xu r25 = this.A03;
                                            C234502xy r11 = this.A0D;
                                            if (r11 == null) {
                                                str2 = "musicPlayer";
                                            } else {
                                                JZH jzh3 = this.A07;
                                                if (jzh3 == null) {
                                                    str2 = "resultsLoader";
                                                } else {
                                                    boolean z2 = this.A0K;
                                                    AnonymousClass80X r9 = this.A08;
                                                    if (r9 != null) {
                                                        C3515589i r24 = this.A00;
                                                        C60090JfW jfW = (C60090JfW) this.A0N.getValue();
                                                        C60329JjY jjY = (C60329JjY) A0I2.getValue();
                                                        C60246Ji3 ji3 = (C60246Ji3) A0I3.getValue();
                                                        ClipsCreationViewModel A0Y = JTP.A0Y(this);
                                                        String str4 = this.A0I;
                                                        boolean z3 = this.A0M;
                                                        Map map = this.A09;
                                                        String str5 = this.A0G;
                                                        if (str5 == null) {
                                                            str2 = "audioBrowserSurface";
                                                        } else {
                                                            MusicOverlayResultsListController musicOverlayResultsListController = new MusicOverlayResultsListController(r24, jVj, immutableList2, immutableList, musicProduct2, this, A0l3, jfW, A0Y, this, musicAttributionConfig, musicBrowseCategory5, r11, r25, mSb, ji3, jjY, jzh3, r9, str3, "music_overlay_detail", str4, str5, map, i, z2, z3);
                                                            musicOverlayResultsListController.A06 = this.A0F;
                                                            this.A04 = musicOverlayResultsListController;
                                                            registerLifecycleListener(musicOverlayResultsListController);
                                                            if (0qQ.A0K(this.A0F, MusicOverlaySearchTab.A07)) {
                                                                this.A02 = C64181LSn.A01("clips_browse");
                                                                MusicOverlayResultsListController musicOverlayResultsListController2 = this.A04;
                                                                if (musicOverlayResultsListController2 == null) {
                                                                    str2 = "resultsListController";
                                                                } else {
                                                                    musicOverlayResultsListController2.A07();
                                                                }
                                                            }
                                                            C61265K0a k0a = new C61265K0a(AnonymousClass7TE.A0l(r51));
                                                            this.A0E = k0a;
                                                            DbY.A0v(requireContext(), k0a, this, r51);
                                                            MusicBrowseCategory musicBrowseCategory6 = this.A02;
                                                            if (musicBrowseCategory6 != null) {
                                                                if (!0qQ.A0K(musicBrowseCategory6.A00(), "gallery") && (jzh = this.A07) != null) {
                                                                    this.A0A = true;
                                                                    jzh.A00(true);
                                                                    JZH jzh4 = this.A06;
                                                                    if (jzh4 != null) {
                                                                        jzh4.A00(true);
                                                                    }
                                                                }
                                                                AnonymousClass0fD.A09(969733350, A022);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F("musicProduct");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    }
                }
                0qQ.A0F("captureState");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("Arguments should be set on the fragment");
        AnonymousClass0fD.A09(-470443161, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1371506090);
        0qQ.A0B(layoutInflater, 0);
        if (this.A0M) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results_detail, viewGroup, false);
        AnonymousClass0fD.A09(1877511350, A022);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ MU2 Edi(C234462xu r1) {
        this.A03 = r1;
        return this;
    }

    public final /* bridge */ /* synthetic */ MU2 Ep4(C66447MSb mSb) {
        this.A05 = mSb;
        return this;
    }
}
