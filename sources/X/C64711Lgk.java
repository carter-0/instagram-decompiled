package X;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ThumbnailTrayController$onViewCreated$1;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lgk  reason: case insensitive filesystem */
public final class C64711Lgk implements C252243on, AnonymousClass8HH, C355258Ph {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public AnimatorSet A03;
    public View A04;
    public RecyclerView A05;
    public CustomScrollingLinearLayoutManager A06;
    public C60475Jm7 A07;
    public C64340LaF A08;
    public AnonymousClass8RH A09;
    public C59520Ya A0A;
    public final int A0B;
    public final int A0C;
    public final AnonymousClass4DH A0D;
    public final AnonymousClass4DH A0E;
    public final UserSession A0F;
    public final UserSession A0G;
    public final C64706Lge A0H;
    public final C64706Lge A0I;
    public final KM0 A0J;
    public final C66508MUm A0K;
    public final C60369JkK A0L;
    public final C60398Jkr A0M;
    public final ClipsCreationViewModel A0N;
    public final C3511387s A0O;
    public final AnonymousClass8RL A0P;
    public final AnonymousClass8RF A0Q;
    public final C3516889w A0R;
    public final C3516889w A0S;
    public final MXI A0T;
    public final C64701LgW A0U;
    public final ClipsTimelineEditorConfig A0V;
    public final C2801950r A0W;

    /* JADX WARNING: type inference failed for: r0v18, types: [X.MId, X.0Ya] */
    public C64711Lgk(AnonymousClass4DH r9, UserSession userSession, C64706Lge lge, MXI mxi, C64701LgW lgW, KM0 km0, ClipsTimelineEditorConfig clipsTimelineEditorConfig, AnonymousClass8RL r16, AnonymousClass8RF r17, C2801950r r18, C3516889w r19, int i) {
        C2801950r r6 = r18;
        AnonymousClass7TF.A1F(userSession, 2, r6);
        0qQ.A0B(clipsTimelineEditorConfig, 10);
        this.A0D = r9;
        this.A0F = userSession;
        this.A0M = km0;
        AnonymousClass8RF r2 = r17;
        this.A0Q = r2;
        this.A0P = r16;
        int i2 = i;
        this.A0B = i2;
        this.A0H = lge;
        FragmentActivity requireActivity = r9.requireActivity();
        ClipsCreationViewModel A002 = new 2YN(requireActivity).A00(ClipsCreationViewModel.class);
        this.A0N = A002;
        this.A0O = JTO.A0L(new C3511287r(requireActivity, userSession), requireActivity).A00(C3511387s.class);
        Dba.A15(r9, A002.A0G, MP5.A00(this, 30), 1);
        C65071Lmr lmr = new C65071Lmr(this);
        this.A0K = lmr;
        this.A0L = new C60369JkK(userSession, lmr, A002, r2);
        this.A0E = r9;
        this.A0G = userSession;
        this.A0R = r19;
        this.A0T = mxi;
        this.A0J = km0;
        this.A0W = r6;
        this.A0C = i2;
        this.A0V = clipsTimelineEditorConfig;
        this.A0U = lgW;
        this.A0I = lge;
        C3516889w A012 = JTS.A0N(r9).A01("post_capture");
        this.A0S = A012;
        Dba.A15(r9, A012.A07, new C66312MMv(44, r2, this), 2);
        KM0 km02 = (KM0) this.A0M;
        if (km02 != null) {
            km02.A04 = this;
            km02.A02 = new L0S(this);
            km02.A06 = MP5.A00(this, 31);
        }
        km0.A07 = MP5.A00(this, 32);
        lge.A03 = new C66312MMv(45, r2, this);
        this.A0A = JTO.A1C(this, 42);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void E0X(float f) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A04 = view.findViewById(R.id.active_thumbnail_indicator);
        this.A05 = DbT.A0I(view, R.id.clips_editor_video_track_recyclerview);
        this.A06 = new ThumbnailTrayController$onViewCreated$1(view.getContext(), this);
        RecyclerView recyclerView = this.A05;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(A02());
            recyclerView.setAdapter(this.A0M);
            recyclerView.setItemAnimator((AnonymousClass3AS) null);
            C64340LaF laF = new C64340LaF(recyclerView, new C65095LnH(recyclerView, this), false, false);
            this.A08 = laF;
            recyclerView.A13(laF);
            View view2 = this.A04;
            if (view2 != null) {
                C60475Jm7 jm7 = new C60475Jm7(view2);
                recyclerView.A15(jm7);
                this.A07 = jm7;
            }
            if (this.A0B == 2) {
                new C355568Qm(this.A0L).A0A(recyclerView);
            }
        }
        AnonymousClass4DH r0 = this.A0D;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
        MXI mxi = this.A0T;
        mxi.EiY(LY4.A00(this, 63));
        mxi.ET9(LY4.A00(this, 64));
        if (this.A0W == C2801950r.FEED_POST) {
            this.A0Q.A0G(new KM2(0, false));
        }
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C64711Lgk lgk, AnonymousClass8RH r11) {
        int i;
        RecyclerView recyclerView = lgk.A05;
        if (recyclerView != null) {
            Context A0S2 = AnonymousClass7TE.A0S(recyclerView);
            int A062 = AnonymousClass7TG.A06(A0S2);
            int A063 = JTR.A06(A0S2);
            if (!(r11 instanceof AnonymousClass8RG) || ((AnonymousClass8RG) r11).A00) {
                A062 = recyclerView.getPaddingStart();
                i = A062;
            } else {
                int size = lgk.A0J.A03.size();
                Resources resources = recyclerView.getResources();
                if ((A062 * 2) + A063 + (size * (resources.getDimensionPixelSize(R.dimen.action_button_settings_height) + (AnonymousClass7TE.A0C(resources) * 2))) < AnonymousClass7TF.A0E(A0S2).widthPixels) {
                    A062 = A063;
                    i = 0;
                }
                i = A062;
            }
            recyclerView.setPadding(A062, 0, i, 0);
        }
    }

    public static final void A01(C64711Lgk lgk, AnonymousClass831 r15) {
        List list;
        ArrayList arrayList;
        int i;
        Object kmk;
        Object kmm;
        C60398Jkr jkr = lgk.A0M;
        List list2 = jkr.A03;
        list2.clear();
        ArrayList A052 = r15.A05();
        C3511387s r1 = lgk.A0O;
        C270564gw r0 = r1.A04;
        if (r0 != null) {
            list = r0.BrX();
        } else {
            list = null;
        }
        boolean z = r1.A0F;
        if (list == null) {
            arrayList = AnonymousClass7TG.A0r(A052);
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                arrayList.add(new KMM(JTO.A0g(it)));
            }
        } else {
            arrayList = AnonymousClass7TE.A1C();
            int i2 = 0;
            Iterator it2 = A052.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass51M r10 = (AnonymousClass51M) next;
                int A042 = C51967G9n.A04(r10.A0G, i2);
                for (int size = arrayList.size(); size < A042; size++) {
                    if (size < list.size()) {
                        kmm = new KMK(new C60914JtY(size, ((C279454yf) list.get(size)).getDurationInMs(), 1));
                    } else {
                        0kD.A07("TimelineTraySegmentUtil", "More selected segments than allowed in Templates", (Throwable) null);
                        kmm = new KMM(r10);
                    }
                    arrayList.add(kmm);
                }
                arrayList.add(new KMM(r10));
                i2 = i3;
            }
            int size2 = list.size();
            for (int size3 = arrayList.size(); size3 < size2; size3++) {
                C60914JtY jtY = new C60914JtY(size3, ((C279454yf) list.get(size3)).getDurationInMs(), 1);
                if (!AnonymousClass8YL.A03((C279454yf) list.get(size3)) || z) {
                    kmk = new KMK(jtY);
                } else {
                    kmk = new KML(jtY);
                }
                arrayList.add(kmk);
            }
        }
        list2.addAll(arrayList);
        LruCache lruCache = (LruCache) lgk.A0S.A07.A02();
        if (lruCache != null) {
            lgk.A0J.A07(lruCache);
        }
        AnonymousClass8RH A0E2 = lgk.A0Q.A0E();
        if (A0E2 instanceof AnonymousClass8RS) {
            i = ((AnonymousClass8RS) A0E2).getSegmentIndex();
        } else {
            if (!(A0E2 instanceof AnonymousClass8RX)) {
                i = -2;
            }
            jkr.notifyDataSetChanged();
        }
        jkr.A03(i);
        jkr.notifyDataSetChanged();
    }

    public final CustomScrollingLinearLayoutManager A02() {
        CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager = this.A06;
        if (customScrollingLinearLayoutManager != null) {
            return customScrollingLinearLayoutManager;
        }
        0qQ.A0F("scrollingLinearLayoutManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass831 A03() {
        AnonymousClass831 A0K2;
        ClipsCreationViewModel clipsCreationViewModel = this.A0N;
        if (clipsCreationViewModel.A0s() || (A0K2 = JTQ.A0K(clipsCreationViewModel)) == null) {
            return new AnonymousClass831(0sn.A00, false);
        }
        return A0K2;
    }

    public final FilmstripTimelineView A04() {
        C249703kE A0W2;
        C60691Jpc jpc;
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null || (A0W2 = recyclerView.A0W(this.A00)) == null || !(A0W2 instanceof C60691Jpc) || (jpc = (C60691Jpc) A0W2) == null) {
            return null;
        }
        return jpc.A09;
    }

    public final void A05() {
        AnonymousClass831 r4;
        int A022;
        AnonymousClass51M r1;
        AnonymousClass863 A0Z = JTP.A0Z(this.A0H.A07);
        if (A0Z != null) {
            int CEG = A0Z.CEG();
            if (Integer.valueOf(CEG) != null) {
                ClipsCreationViewModel clipsCreationViewModel = this.A0N;
                if (clipsCreationViewModel.A0s() || (r4 = JTO.A0h(clipsCreationViewModel.A0F)) == null) {
                    r4 = new AnonymousClass831(0sn.A00, false);
                }
                if (CEG >= r4.A00) {
                    A022 = C51966G9m.A06(r4.A01);
                } else if (CEG != 0 || !AnonymousClass8YL.A04(r4)) {
                    A022 = r4.A02((long) CEG);
                    Object A0O2 = 00k.A0O(r4.A05(), A022);
                    if ((A0O2 instanceof AnonymousClass51M) && (r1 = (AnonymousClass51M) A0O2) != null) {
                        A022 = C51967G9n.A04(r1.A0G, A022);
                    }
                } else {
                    A022 = -1;
                }
                if (this.A00 != A022 && A022 != -1) {
                    if (this.A0Q.A0E() instanceof AnonymousClass8RG) {
                        C60475Jm7 jm7 = this.A07;
                        if (jm7 != null) {
                            int i = jm7.A02;
                            float f = (((float) (A022 * i)) + (((float) i) / 2.0f)) - jm7.A01;
                            ValueAnimator valueAnimator = jm7.A03;
                            float[] A1b = C51965G9l.A1b();
                            A1b[0] = jm7.A04.getTranslationX() + ((float) jm7.A00);
                            A1b[1] = f;
                            valueAnimator.setFloatValues(A1b);
                            valueAnimator.start();
                        }
                        RecyclerView recyclerView = this.A05;
                        if (recyclerView != null) {
                            recyclerView.A0p((A022 * 2) + 1);
                        }
                    }
                    this.A00 = A022;
                    KM0 km0 = (KM0) this.A0M;
                    int i2 = km0.A00;
                    km0.A00 = A022;
                    km0.notifyItemChanged((i2 * 2) + 1);
                    km0.notifyItemChanged((A022 * 2) + 1);
                }
            }
        }
    }

    public final void DiQ(float f) {
        int i;
        AnonymousClass861 r1 = this.A0I.A07;
        AnonymousClass863 A0Z = JTP.A0Z(r1);
        if (A0Z != null) {
            i = A0Z.Bd7();
        } else {
            i = 0;
        }
        r1.A06((int) (f * ((float) i)));
    }

    public final void DiR(float f) {
        float A012;
        AnonymousClass8RF r3 = this.A0Q;
        AnonymousClass8RH A0E2 = r3.A0E();
        if (A0E2 instanceof AnonymousClass8RS) {
            AnonymousClass51M A0f = JTO.A0f(A03(), ((AnonymousClass8RS) A0E2).getSegmentIndex());
            if (A0f == null) {
                r3.A0G(new AnonymousClass8RG(false));
                return;
            }
            C64706Lge lge = this.A0I;
            AnonymousClass861 r2 = lge.A07;
            if (lge.A06.A0I()) {
                A012 = ((float) A0f.A0F.A03) + (f * ((float) LIC.A00(A0f)));
            } else if (C64706Lge.A03(lge)) {
                A012 = (((float) C64706Lge.A00(lge).A01(lge.A00)) + (f * ((float) LIC.A00(A0f)))) - ((float) A0f.A09);
            } else {
                return;
            }
            r2.A06((int) A012);
        }
    }

    public final void Dsg() {
        C64706Lge lge = this.A0I;
        if (lge.A04) {
            lge.A07.A03();
        }
    }

    public final void Dsh(boolean z) {
        FilmstripTimelineView A042;
        C249703kE A0W2;
        C279294yP r10;
        if (z) {
            RecyclerView recyclerView = this.A05;
            if (!(recyclerView == null || (A0W2 = recyclerView.A0W(this.A00)) == null || !(A0W2 instanceof C60691Jpc))) {
                AnonymousClass8RH A0E2 = this.A0Q.A0E();
                if (A0E2 instanceof AnonymousClass8RS) {
                    AnonymousClass51M A0f = JTO.A0f(A03(), ((AnonymousClass8RS) A0E2).getSegmentIndex());
                    if (A0f != null) {
                        FilmstripTimelineView filmstripTimelineView = ((C60691Jpc) A0W2).A09;
                        int A012 = LIC.A01(A0f, filmstripTimelineView.A0A.getLeftTrimmerValue());
                        int A013 = LIC.A01(A0f, filmstripTimelineView.getRightTrimmerPosition());
                        ClipsCreationViewModel clipsCreationViewModel = this.A0N;
                        ClipsCreationViewModel.A03(C359548d5.VIDEO_CLIP_TRIM, clipsCreationViewModel, true);
                        if (ClipsCreationViewModel.A05(clipsCreationViewModel, this.A00 / 2, A012, A013)) {
                            27r A014 = 27p.A01(this.A0G);
                            if (this.A0W == C2801950r.FEED_POST) {
                                r10 = C279294yP.FEED;
                            } else {
                                r10 = null;
                            }
                            A014.A0x(r10, (double) A012, (double) A013, (long) A0f.A0F.A0F.hashCode());
                            AnonymousClass831 A0K2 = JTQ.A0K(clipsCreationViewModel);
                            if (A0K2 != null && A0K2.A00 > 90000) {
                                clipsCreationViewModel.A0K.A05();
                                C59689JTv.A01(this.A0E.requireContext(), "clips_music_unavailable_for_long_video", 2131955515, 0);
                            }
                        }
                        this.A0I.A07.A08(A012, A013);
                    } else {
                        return;
                    }
                }
            }
            if (this.A0O.A04 == null && (A042 = A04()) != null) {
                A042.setShowSeekbar(true);
            }
            ArgbEvaluator argbEvaluator = C294975nL.A0b;
            AnonymousClass8RF r4 = this.A0Q;
            JTP.A1A(r4.A07, new Object());
            r4.A04 = false;
            AnonymousClass8RH A0E3 = r4.A0E();
            if (A0E3 instanceof KM2) {
                r4.A0G(new KM2(((KM2) A0E3).A00, r4.A04));
            }
            AnonymousClass8RF.A00(r4);
        }
        C64706Lge lge = this.A0I;
        if (lge.A04) {
            lge.A07.A03();
        }
    }

    public final void Dsi() {
        this.A0I.A04();
    }

    public final void Dsj(boolean z) {
        this.A0I.A04();
        if (z) {
            FilmstripTimelineView A042 = A04();
            if (A042 != null) {
                A042.setShowSeekbar(false);
            }
            AnonymousClass8RF r3 = this.A0Q;
            JTP.A1A(r3.A07, new Object());
            r3.A04 = true;
            AnonymousClass8RH A0E2 = r3.A0E();
            if (A0E2 instanceof KM2) {
                r3.A0G(new KM2(((KM2) A0E2).A00, r3.A04));
            }
            AnonymousClass8RF.A00(r3);
        }
    }

    public final void DNK(float f, float f2) {
        DiR(f);
        AnonymousClass51M A0f = JTO.A0f(A03(), this.A00 / 2);
        if (A0f != null) {
            AnonymousClass8RF r2 = this.A0Q;
            r2.A0F(LIC.A01(A0f, f), AnonymousClass05K.A00);
            r2.A0F(LIC.A01(A0f, f2), AnonymousClass05K.A01);
        }
    }

    public final void DNM(float f) {
        DiR(f);
        AnonymousClass51M A0f = JTO.A0f(A03(), this.A00 / 2);
        if (A0f != null) {
            this.A0Q.A0F(LIC.A01(A0f, f), AnonymousClass05K.A00);
        }
    }

    public final void Dfu(float f) {
        DiR(f);
        AnonymousClass51M A0f = JTO.A0f(A03(), this.A00 / 2);
        if (A0f != null) {
            this.A0Q.A0F(LIC.A01(A0f, f), AnonymousClass05K.A01);
        }
    }
}
