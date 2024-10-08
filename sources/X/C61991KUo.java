package X;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.KUo  reason: case insensitive filesystem */
public final class C61991KUo extends C61425K6z implements MU2 {
    public static final String __redex_internal_original_name = "MusicOverlaySearchV2Fragment";
    public C234462xu A00;
    public L20 A01;
    public C65512Lua A02;
    public C66447MSb A03;
    public MusicSearchQueryViewModel A04;
    public AnonymousClass80X A05;
    public int A06;
    public C65513Lub A07;
    public Map A08;
    public boolean A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final String getModuleName() {
        return "music_search";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C65513Lub lub = this.A07;
        if (lub != null) {
            DbV.A1F(getViewLifecycleOwner(), lub.A02.A06, new MP7(lub, 41), 28);
        }
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A04;
        if (musicSearchQueryViewModel != null) {
            DbV.A1F(getViewLifecycleOwner(), musicSearchQueryViewModel.A06, new MP7(this, 36), 27);
            MusicSearchQueryViewModel musicSearchQueryViewModel2 = this.A04;
            if (musicSearchQueryViewModel2 != null) {
                DbV.A1F(getViewLifecycleOwner(), musicSearchQueryViewModel2.A05, new MP7(this, 37), 27);
                MusicSearchQueryViewModel musicSearchQueryViewModel3 = this.A04;
                if (musicSearchQueryViewModel3 != null) {
                    DbV.A1F(getViewLifecycleOwner(), musicSearchQueryViewModel3.A04, new MP7(this, 38), 27);
                    MusicSearchQueryViewModel musicSearchQueryViewModel4 = this.A04;
                    if (musicSearchQueryViewModel4 != null) {
                        DbV.A1F(getViewLifecycleOwner(), musicSearchQueryViewModel4.A03, new MP7(this, 39), 27);
                        MusicSearchQueryViewModel musicSearchQueryViewModel5 = this.A04;
                        if (musicSearchQueryViewModel5 != null) {
                            DbV.A1F(getViewLifecycleOwner(), musicSearchQueryViewModel5.A02, new MP7(this, 40), 27);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F("musicSearchQueryViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C61991KUo kUo, boolean z) {
        String A0f;
        L20 l20;
        L20 l202 = kUo.A01;
        if (l202 != null) {
            C65512Lua lua = kUo.A02;
            String str = null;
            if (lua == null) {
                0qQ.A0F("musicSearchResultsView");
                throw AnonymousClass00P.createAndThrow();
            }
            if (!(!z || (A0f = AnonymousClass7TF.A0f(l202.A00.A0J.A04)) == null || A0f.length() == 0 || (l20 = kUo.A01) == null)) {
                str = AnonymousClass7TF.A0f(l20.A00.A0J.A04);
            }
            C60246Ji3 ji3 = lua.A02.A0G;
            if (!0qQ.A0K(ji3.A03, str)) {
                ji3.A03 = str;
                ji3.A00();
            }
        }
    }

    public static final boolean A01(C61991KUo kUo, String str, boolean z, boolean z2) {
        MusicSearchQueryViewModel musicSearchQueryViewModel = kUo.A04;
        if (musicSearchQueryViewModel == null) {
            0qQ.A0F("musicSearchQueryViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        LFH lfh = new LFH(str, kUo.A06, z, true, z2);
        if (C63354Kvb.A00(lfh)) {
            C63735L4t l4t = musicSearchQueryViewModel.A0G.A03.A01;
            Object A022 = l4t.A01.A02(lfh);
            if (A022 != null) {
                l4t.A00.A0A(new Pair(lfh, A022));
            }
        }
        C63735L4t l4t2 = musicSearchQueryViewModel.A0H.A01.A01;
        Object A023 = l4t2.A01.A02(lfh);
        if (A023 != null) {
            l4t2.A00.A0A(new Pair(lfh, A023));
        }
        return musicSearchQueryViewModel.A0F.A01(lfh);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
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

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int i2;
        C3515589i r8;
        ImmutableList immutableList;
        int A022 = AnonymousClass0fD.A02(129024650);
        C61991KUo.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        setModuleNameV2("music_search");
        C227862kA A0I = DbS.A0I(new C66217MIy(this, 11), new C66217MIy(this, 18), new MJ7(6, (Object) null, this), DbS.A0z(ClipsCreationViewModel.class));
        C227862kA A0I2 = DbS.A0I(new C66217MIy(this, 13), new C58695Iw4(28, (Object) DbS.A0I(new C66217MIy(this, 12), new C66217MIy(this, 17), new MJ7(7, (Object) null, this), DbS.A0z(C3507185x.class)), (Object) this, (Object) A0I), new MJ7(8, (Object) null, this), DbS.A0z(C60090JfW.class));
        C227862kA A0I3 = DbS.A0I(new C66217MIy(this, 10), new C66217MIy(this, 19), new MJ7(5, (Object) null, this), DbS.A0z(C60329JjY.class));
        Serializable serializable = requireArguments.getSerializable("music_product");
        if (serializable != null) {
            MusicProduct musicProduct = (MusicProduct) serializable;
            MJ7 mj7 = new MJ7(10, musicProduct, this);
            AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66217MIy(new C66217MIy(this, 14), 15));
            C227862kA A0I4 = DbS.A0I(new C66217MIy(A002, 16), mj7, new MJ7(9, (Object) null, A002), DbS.A0z(C60246Ji3.class));
            Serializable serializable2 = requireArguments.getSerializable("capture_state");
            String A003 = AnonymousClass000.A00(335);
            0qQ.A0C(serializable2, A003);
            this.A05 = (AnonymousClass80X) serializable2;
            String A0m = JTP.A0m(requireArguments, "browse_session_full_id");
            String A0m2 = JTP.A0m(requireArguments, "browse_session_single_id");
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(C320236s2.A02(requireArguments, AudioTrackType.class, "audio_type_to_exclude"));
            ImmutableList build = builder.build();
            0qQ.A07(build);
            AnonymousClass0eM r5 = this.A0A;
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            AnonymousClass7TG.A1N(A0l, musicProduct);
            if (musicProduct != MusicProduct.CLIPS_CAMERA_FORMAT_V2 ? AnonymousClass30D.A00(musicProduct, A0l) : !182.A06(0Tu.A05, A0l, 36322637207447873L)) {
                i2 = 0;
            } else {
                i2 = 3;
            }
            this.A06 = i2;
            this.A09 = requireArguments.getBoolean("should_use_light_mode", false);
            this.A08 = (Map) requireArguments.getSerializable("visual_features");
            MusicSearchQueryViewModel create = new KEY(this, musicProduct, AnonymousClass7TE.A0l(r5), new L22(this), new L23(this), A0m, A0m2).create(MusicSearchQueryViewModel.class);
            this.A04 = create;
            if (create == null) {
                0qQ.A0F("musicSearchQueryViewModel");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A07 = new C65513Lub(create);
            UserSession A0l2 = AnonymousClass7TE.A0l(r5);
            C66447MSb mSb = this.A03;
            C234462xu r26 = this.A00;
            int i3 = requireArguments.getInt("list_bottom_padding_px");
            Serializable serializable3 = requireArguments.getSerializable("capture_state");
            0qQ.A0C(serializable3, A003);
            AnonymousClass80X r10 = (AnonymousClass80X) serializable3;
            Serializable serializable4 = requireArguments.getSerializable("camera_surface_type");
            0qQ.A0C(serializable4, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
            C59725JVj jVj = (C59725JVj) serializable4;
            Serializable serializable5 = requireArguments.getSerializable("camera_music_browser_entry_point");
            if (serializable5 instanceof C3515589i) {
                r8 = (C3515589i) serializable5;
            } else {
                r8 = null;
            }
            Serializable serializable6 = requireArguments.getSerializable("camera_already_attached_tracks");
            if (serializable6 instanceof ImmutableList) {
                immutableList = (ImmutableList) serializable6;
            } else {
                immutableList = null;
            }
            C65513Lub lub = this.A07;
            if (lub != null) {
                C3515589i r16 = r8;
                C59725JVj jVj2 = jVj;
                C65512Lua lua = new C65512Lua(r16, jVj2, build, immutableList, musicProduct, this, A0l2, (C60090JfW) A0I2.getValue(), (ClipsCreationViewModel) A0I.getValue(), this, r26, new C65511LuZ(this), mSb, lub, (C60246Ji3) A0I4.getValue(), (C60329JjY) A0I3.getValue(), r10, A0m, A0m2, this.A08, i3, this.A09);
                this.A02 = lua;
                C65513Lub lub2 = this.A07;
                if (lub2 != null) {
                    lub2.A00 = lua;
                }
                AnonymousClass0fD.A09(-1214886627, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1142602684;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1676148321;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(49889566);
        0qQ.A0B(layoutInflater, 0);
        if (this.A09) {
            layoutInflater = JTS.A09(getContext(), layoutInflater);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results, viewGroup, false);
        AnonymousClass0fD.A09(2024388062, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1176228912);
        super.onDestroy();
        MusicSearchQueryViewModel musicSearchQueryViewModel = this.A04;
        if (musicSearchQueryViewModel == null) {
            0qQ.A0F("musicSearchQueryViewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        musicSearchQueryViewModel.A0J.A00 = null;
        LFC lfc = musicSearchQueryViewModel.A0F;
        lfc.A01.A00();
        lfc.A02.A00();
        AnonymousClass0fD.A09(1236982431, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSetUserVisibleHint(boolean r4, boolean r5) {
        /*
            r3 = this;
            super.onSetUserVisibleHint(r4, r5)
            X.L20 r0 = r3.A01
            if (r0 == 0) goto L_0x0018
            X.Lub r0 = r3.A07
            if (r0 == 0) goto L_0x0018
            if (r4 == 0) goto L_0x0014
            boolean r1 = r0.isLoading()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            A00(r3, r0)
        L_0x0018:
            com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r2 = r3.A04
            if (r2 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0027
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 28
            X.C51645Fy4.A01(r2, r1, r0)
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61991KUo.onSetUserVisibleHint(boolean, boolean):void");
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
