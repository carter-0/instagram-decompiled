package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.search.MusicOverlayResultsListController;
import java.util.Map;

/* renamed from: X.KUp  reason: case insensitive filesystem */
public final class C61992KUp extends C61425K6z implements C66542MVw, MU2 {
    public static final String __redex_internal_original_name = "MusicOverlaySearchResultsFragment";
    public C234462xu A00;
    public LAU A01;
    public C65512Lua A02;
    public C66447MSb A03;
    public JZH A04;
    public AnonymousClass80X A05;
    public int A06;
    public ImmutableList A07;
    public MusicProduct A08;
    public C60090JfW A09;
    public LFC A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public static final boolean A01(C61992KUp kUp, String str, boolean z, boolean z2) {
        LFH lfh = new LFH(str, kUp.A06, z, false, z2);
        LFC lfc = kUp.A0A;
        String str2 = "searchQueryLimiter";
        if (lfc != null) {
            if (lfc.A00(lfh)) {
                return false;
            }
            C65512Lua lua = kUp.A02;
            if (lua == null) {
                str2 = "musicSearchResultsView";
            } else {
                String str3 = lfh.A01;
                0qQ.A0B(str3, 0);
                MusicOverlayResultsListController musicOverlayResultsListController = lua.A02;
                musicOverlayResultsListController.A0C.EHu(false);
                musicOverlayResultsListController.A0G.A04 = str3;
                lua.A00 = false;
                LFC lfc2 = kUp.A0A;
                if (lfc2 != null) {
                    lfc2.A01(lfh);
                    return true;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DTq(String str, Object obj, int i) {
        0qQ.A0B(str, 2);
        JTS.A0K(this.A0F).A0C(String.valueOf(obj), i, str);
    }

    public final void DeV(Object obj, int i) {
    }

    public final void Del(Object obj, int i) {
    }

    public final boolean EtB() {
        return true;
    }

    public final String getModuleName() {
        return "music_overlay_search_results";
    }

    public static final LFH A00(C61992KUp kUp) {
        LFC lfc = kUp.A0A;
        if (lfc == null) {
            0qQ.A0F("searchQueryLimiter");
            throw AnonymousClass00P.createAndThrow();
        }
        Object obj = lfc.A01.A01;
        0qQ.A0A(obj);
        return (LFH) obj;
    }

    public final boolean CKd() {
        C65512Lua lua = this.A02;
        if (lua == null) {
            0qQ.A0F("musicSearchResultsView");
            throw AnonymousClass00P.createAndThrow();
        }
        C60246Ji3 ji3 = lua.A02.A0G;
        if (ji3.A09.size() > 0 || ji3.A08.size() > 0) {
            return true;
        }
        return false;
    }

    public final void DTr(int i, Object obj, boolean z) {
        JTS.A0K(this.A0F).A0D(String.valueOf(obj), i, z);
    }

    public final void DeK(C268654dm r4, int i) {
        C65512Lua lua = this.A02;
        if (lua == null) {
            0qQ.A0F("musicSearchResultsView");
            throw AnonymousClass00P.createAndThrow();
        }
        MusicOverlayResultsListController musicOverlayResultsListController = lua.A02;
        C59689JTv.A0B(musicOverlayResultsListController.A0A.getContext(), "RequestFail");
        musicOverlayResultsListController.A0E.notifyDataSetChanged();
    }

    public final boolean Et6() {
        C65512Lua lua = this.A02;
        if (lua != null) {
            return lua.A00;
        }
        0qQ.A0F("musicSearchResultsView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final boolean isScrolledToBottom() {
        C65512Lua lua = this.A02;
        if (lua != null) {
            return lua.A02.A0A();
        }
        0qQ.A0F("musicSearchResultsView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isScrolledToTop() {
        C65512Lua lua = this.A02;
        if (lua != null) {
            return lua.A02.A0B();
        }
        0qQ.A0F("musicSearchResultsView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final 1OC ANA(1NU r13, Integer num, Long l, Object obj, String str) {
        String str2;
        String str3;
        LFH A002 = A00(this);
        AnonymousClass0eM r0 = this.A0F;
        0lg A0X = DbT.A0X(r0);
        String str4 = A002.A01;
        boolean z = A002.A03;
        boolean z2 = A002.A04;
        MusicProduct musicProduct = this.A08;
        if (musicProduct == null) {
            str3 = "musicProduct";
        } else {
            String str5 = this.A0B;
            if (str5 == null) {
                str3 = "browseSessionFullId";
            } else {
                String str6 = JTS.A0K(r0).A07;
                AnonymousClass7TG.A1N(A0X, str4);
                1NY A0a = AnonymousClass7TG.A0a(A0X);
                0Tu r4 = 0Tu.A05;
                if (182.A06(r4, A0X, 36329629413425377L)) {
                    str2 = "music/search_v2/";
                } else {
                    str2 = "music/search/";
                }
                A0a.A0E = str2;
                String A003 = C14245TsS.A00(musicProduct);
                if (A003 == null) {
                    A003 = "";
                }
                JTQ.A1D(A0a, A003, str5);
                A0a.A9m("q", str4);
                A0a.A9m("search_session_id", str6);
                A0a.A0H("from_typeahead", z);
                A0a.A0P(r13);
                if (182.A06(r4, A0X, 36329629413490914L)) {
                    A0a.A0H("from_search", z2);
                }
                String str7 = str;
                if (str != null) {
                    A0a.A9m("cursor", str7);
                }
                String A0R = 002.A0R("music/search/", str4);
                Integer num2 = AnonymousClass05K.A0Y;
                if (str == null) {
                    A0a.A07 = num2;
                    A0a.A0A = A0R;
                    A0a.A01 = 86400000;
                    A0a.A00 = 4000;
                }
                1OC A0M = A0a.A0M();
                A0M.A01 = new C64587LeV(this, str4, A0M.hashCode());
                return A0M;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Object BnI() {
        return A00(this).A01;
    }

    public final void Dew(C66446MSa mSa, Object obj, int i, boolean z, boolean z2) {
        CGO F04 = mSa.F04();
        AnonymousClass0eM r4 = this.A0F;
        JTS.A0K(r4).A0H(String.valueOf(obj), z2, F04.A05.size());
        if (0qQ.A0K(A00(this).A01, obj)) {
            JTS.A0K(r4).A0G(String.valueOf(obj), F04.CPt());
            C65512Lua lua = this.A02;
            if (lua == null) {
                0qQ.A0F("musicSearchResultsView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                lua.A02(F04, A00(this), z);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: X.KUp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: X.4DU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r44) {
        /*
            r43 = this;
            r0 = -417676350(0xffffffffe71ac3c2, float:-7.308555E23)
            int r18 = X.AnonymousClass0fD.A02(r0)
            r10 = r43
            r0 = r44
            X.C61992KUp.super.onCreate(r0)
            android.os.Bundle r0 = r10.requireArguments()
            java.lang.String r1 = "music_product"
            java.io.Serializable r2 = r0.getSerializable(r1)
            r1 = 718(0x2ce, float:1.006E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r1)
            com.instagram.api.schemas.MusicProduct r2 = (com.instagram.api.schemas.MusicProduct) r2
            r10.A08 = r2
            java.lang.String r4 = "capture_state"
            java.io.Serializable r2 = r0.getSerializable(r4)
            r1 = 335(0x14f, float:4.7E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            X.0qQ.A0C(r2, r3)
            X.80X r2 = (X.AnonymousClass80X) r2
            r10.A05 = r2
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            X.0eM r1 = r10.A0F
            r42 = r1
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r42)
            X.2YL r9 = X.JTS.A0E(r10, r2, r1)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r9 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r9
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            r1 = r42
            X.85w r1 = X.JTS.A0M(r10, r1)
            X.2YN r2 = X.JTO.A0L(r1, r2)
            java.lang.Class<X.85x> r1 = X.C3507185x.class
            X.2YL r8 = r2.A00(r1)
            X.85x r8 = (X.C3507185x) r8
            androidx.fragment.app.FragmentActivity r7 = r10.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r42)
            androidx.fragment.app.FragmentActivity r5 = r10.requireActivity()
            java.lang.String r2 = r9.A0S
            X.KDr r1 = new X.KDr
            r1.<init>(r5, r6, r8, r2)
            X.2YN r2 = X.JTO.A0L(r1, r7)
            java.lang.Class<X.JfW> r1 = X.C60090JfW.class
            X.2YL r1 = r2.A00(r1)
            X.JfW r1 = (X.C60090JfW) r1
            r10.A09 = r1
            r1 = 9
            X.MIy r8 = new X.MIy
            r8.<init>(r10, r1)
            java.lang.Class<X.JjY> r1 = X.C60329JjY.class
            X.0Yh r7 = X.DbS.A0z(r1)
            r1 = 8
            X.MIy r6 = new X.MIy
            r6.<init>(r10, r1)
            r17 = 0
            r5 = 4
            X.MJ7 r2 = new X.MJ7
            r1 = r17
            r2.<init>(r5, r1, r10)
            X.2kA r16 = X.DbS.A0I(r6, r8, r2, r7)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r42)
            com.instagram.api.schemas.MusicProduct r2 = r10.A08
            java.lang.String r14 = "musicProduct"
            if (r2 == 0) goto L_0x01d6
            X.KCw r1 = new X.KCw
            r1.<init>(r2, r5)
            X.2YN r2 = X.JTO.A0L(r1, r10)
            java.lang.Class<X.Ji3> r1 = X.C60246Ji3.class
            X.2YL r8 = r2.A00(r1)
            X.Ji3 r8 = (X.C60246Ji3) r8
            java.lang.String r1 = "browse_session_full_id"
            java.lang.String r1 = X.JTP.A0m(r0, r1)
            r10.A0B = r1
            java.lang.String r1 = "browse_session_single_id"
            java.lang.String r1 = X.JTP.A0m(r0, r1)
            r10.A0C = r1
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            java.lang.Class<com.instagram.music.common.constants.AudioTrackType> r2 = com.instagram.music.common.constants.AudioTrackType.class
            java.lang.String r1 = "audio_type_to_exclude"
            java.util.ArrayList r1 = X.C320236s2.A02(r0, r2, r1)
            r5.addAll(r1)
            com.google.common.collect.ImmutableList r1 = r5.build()
            r10.A07 = r1
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r42)
            r24 = 1
            X.JZH r1 = new X.JZH
            r19 = r1
            r20 = r10
            r22 = r17
            r23 = r10
            r19.<init>(r20, r21, r22, r23, r24)
            r10.A04 = r1
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r42)
            com.instagram.api.schemas.MusicProduct r2 = r10.A08
            if (r2 == 0) goto L_0x01d6
            r11 = 0
            X.0qQ.A0B(r6, r11)
            com.instagram.api.schemas.MusicProduct r1 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            if (r2 != r1) goto L_0x01cb
            X.0Tu r5 = X.0Tu.A05
            r1 = 36322637207447873(0x810b3f000e2941, double:3.033920257285908E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x01d3
        L_0x0116:
            r1 = 3
        L_0x0117:
            r10.A06 = r1
            com.instagram.api.schemas.MusicProduct r13 = r10.A08
            if (r13 == 0) goto L_0x01d6
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r42)
            java.lang.String r12 = r10.A0B
            java.lang.String r7 = "browseSessionFullId"
            if (r12 == 0) goto L_0x01c7
            java.lang.String r6 = r10.A0C
            java.lang.String r5 = "browseSessionSingleId"
            if (r6 == 0) goto L_0x016a
            int r2 = r10.A06
            X.LAU r1 = new X.LAU
            r20 = r13
            r21 = r10
            r24 = r12
            r25 = r6
            r26 = r2
            r19 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r10.A01 = r1
            java.lang.String r1 = "should_use_light_mode"
            boolean r1 = r0.getBoolean(r1, r11)
            r10.A0E = r1
            java.lang.String r1 = "visual_features"
            java.io.Serializable r1 = r0.getSerializable(r1)
            java.util.Map r1 = (java.util.Map) r1
            r10.A0D = r1
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r42)
            X.MSb r1 = r10.A03
            r20 = r1
            X.2xu r1 = r10.A00
            r19 = r1
            com.instagram.api.schemas.MusicProduct r15 = r10.A08
            if (r15 == 0) goto L_0x01d6
            com.google.common.collect.ImmutableList r14 = r10.A07
            if (r14 != 0) goto L_0x0172
            java.lang.String r5 = "audioTrackTypesToExclude"
        L_0x016a:
            X.0qQ.A0F(r5)
        L_0x016d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0172:
            java.lang.String r13 = r10.A0B
            if (r13 == 0) goto L_0x01c7
            java.lang.String r12 = r10.A0C
            if (r12 == 0) goto L_0x016a
            java.lang.String r1 = "list_bottom_padding_px"
            int r40 = r0.getInt(r1)
            java.io.Serializable r11 = r0.getSerializable(r4)
            X.0qQ.A0C(r11, r3)
            X.80X r11 = (X.AnonymousClass80X) r11
            java.lang.String r1 = "camera_surface_type"
            java.io.Serializable r7 = r0.getSerializable(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes"
            X.0qQ.A0C(r7, r1)
            X.JVj r7 = (X.C59725JVj) r7
            java.lang.String r1 = "camera_music_browser_entry_point"
            java.io.Serializable r6 = r0.getSerializable(r1)
            boolean r1 = r6 instanceof X.C3515589i
            if (r1 == 0) goto L_0x01b8
            X.89i r6 = (X.C3515589i) r6
        L_0x01a2:
            java.lang.String r1 = "camera_already_attached_tracks"
            java.io.Serializable r5 = r0.getSerializable(r1)
            boolean r0 = r5 instanceof com.google.common.collect.ImmutableList
            if (r0 == 0) goto L_0x01b5
            com.google.common.collect.ImmutableList r5 = (com.google.common.collect.ImmutableList) r5
        L_0x01ae:
            X.JZH r4 = r10.A04
            if (r4 != 0) goto L_0x01bb
            java.lang.String r5 = "entityFeedResultsLoader"
            goto L_0x016a
        L_0x01b5:
            r5 = r17
            goto L_0x01ae
        L_0x01b8:
            r6 = r17
            goto L_0x01a2
        L_0x01bb:
            X.LuY r3 = new X.LuY
            r3.<init>(r10)
            X.JfW r2 = r10.A09
            if (r2 != 0) goto L_0x01da
            java.lang.String r5 = "clipsAudioMixEditorViewModel"
            goto L_0x016a
        L_0x01c7:
            X.0qQ.A0F(r7)
            goto L_0x016d
        L_0x01cb:
            boolean r1 = X.AnonymousClass30D.A00(r2, r6)
            if (r1 != 0) goto L_0x01d3
            goto L_0x0116
        L_0x01d3:
            r1 = 0
            goto L_0x0117
        L_0x01d6:
            X.0qQ.A0F(r14)
            goto L_0x016d
        L_0x01da:
            java.lang.Object r1 = r16.getValue()
            X.JjY r1 = (X.C60329JjY) r1
            boolean r0 = r10.A0E
            r17 = r0
            java.util.Map r0 = r10.A0D
            r16 = r0
            X.Lua r0 = new X.Lua
            r24 = r15
            r25 = r10
            r27 = r2
            r28 = r9
            r29 = r10
            r30 = r19
            r31 = r3
            r32 = r20
            r33 = r4
            r34 = r8
            r35 = r1
            r36 = r11
            r37 = r13
            r38 = r12
            r39 = r16
            r41 = r17
            r19 = r0
            r20 = r6
            r21 = r7
            r22 = r14
            r23 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r10.A02 = r0
            X.Lue r6 = new X.Lue
            r6.<init>(r10)
            X.0lg r2 = X.DbT.A0X(r42)
            X.0Tu r5 = X.0Tu.A05
            r0 = 36611104389994702(0x82119b000018ce, double:3.216348065092633E-306)
            java.lang.Long r4 = X.AnonymousClass7TF.A0Y(r5, r2, r0)
            X.0lg r2 = X.DbT.A0X(r42)
            r0 = 36611104390060239(0x82119b000118cf, double:3.2163480651340786E-306)
            java.lang.Long r3 = X.AnonymousClass7TF.A0Y(r5, r2, r0)
            X.0lg r2 = X.DbT.A0X(r42)
            r0 = 36329629413556451(0x81119b000440e3, double:3.0383421565843267E-306)
            boolean r1 = X.182.A06(r5, r2, r0)
            X.LFC r0 = new X.LFC
            r0.<init>(r6, r4, r3, r1)
            r10.A0A = r0
            r1 = 749718465(0x2cafcbc1, float:4.9964204E-12)
            r0 = r18
            X.AnonymousClass0fD.A09(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61992KUp.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2120721179);
        0qQ.A0B(layoutInflater, 0);
        if (this.A0E) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results, viewGroup, false);
        AnonymousClass0fD.A09(-12638255, A022);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ MU2 Edi(C234462xu r1) {
        this.A00 = r1;
        return this;
    }

    public final /* bridge */ /* synthetic */ MU2 Ep4(C66447MSb mSb) {
        this.A03 = mSb;
        return this;
    }
}
