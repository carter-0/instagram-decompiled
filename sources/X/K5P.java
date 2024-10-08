package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

public final class K5P extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsPostCapTimelineFragment";
    public int A00;
    public C60408Jl1 A01;
    public LAJ A02;
    public ClipsTimelineActionBarViewController A03;
    public ClipsCreationViewModel A04;
    public C60094Jfa A05;
    public AnonymousClass8RL A06;
    public AnonymousClass861 A07;
    public C354388Lv A08;
    public C60109Jfp A09;
    public AnonymousClass88B A0A;
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public final String getModuleName() {
        return "clips_postcap_timeline_fragment";
    }

    public final boolean onBackPressed() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.findViewById(R.id.drawer_edit_button);
        igdsMediaButton.setLabel(igdsMediaButton.getResources().getString(2131955443));
        LY4.A01(igdsMediaButton, 8, this);
        IgdsMediaButton igdsMediaButton2 = (IgdsMediaButton) view.findViewById(R.id.drawer_next_button);
        igdsMediaButton2.setEndAddOn(C62567Khx.CREATION_ARROW);
        igdsMediaButton2.setLabel(igdsMediaButton2.getResources().getString(2131955521));
        LY4.A01(igdsMediaButton2, 9, this);
        if (182.A06(0Tu.A06, AnonymousClass7TF.A0L(this.A0B, 0), 36327327311214933L)) {
            C60094Jfa jfa = this.A05;
            if (jfa == null) {
                str = "miniTimelineViewModel";
            } else {
                DbZ.A1C(this, MGV.A01(this, (AnonymousClass4D7) null, 4), jfa.A00);
                ClipsCreationViewModel clipsCreationViewModel = this.A04;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    DbZ.A1C(this, new C59819JZr((AnonymousClass4D7) null, (Object) this, (Object) view, 35), clipsCreationViewModel.A0c);
                    AnonymousClass861 r0 = this.A07;
                    str = "videoPlaybackViewModel";
                    if (r0 != null) {
                        Dba.A16(getViewLifecycleOwner(), r0.A0G, MP5.A00(this, 13), 68);
                        AnonymousClass861 r02 = this.A07;
                        if (r02 != null) {
                            Dba.A16(getViewLifecycleOwner(), r02.A0A, new C66312MMv(43, view, this), 68);
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C60109Jfp jfp = this.A09;
        if (jfp == null) {
            str = "clipsTimelineActionBarViewModel";
        } else {
            ArrayList A1C = AnonymousClass7TE.A1C();
            C60109Jfp.A05(jfp, A1C, false, true);
            jfp.A0C.Epw(A1C);
            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A03;
            str = "actionBarViewController";
            if (clipsTimelineActionBarViewController != null) {
                ClipsTimelineActionBarViewController.A01(LY4.A00(this, 11), C62636KjH.A0N, clipsTimelineActionBarViewController);
                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController2 = this.A03;
                if (clipsTimelineActionBarViewController2 != null) {
                    ClipsTimelineActionBarViewController.A01(LY4.A00(this, 12), C62636KjH.A06, clipsTimelineActionBarViewController2);
                    ClipsTimelineActionBarViewController clipsTimelineActionBarViewController3 = this.A03;
                    if (clipsTimelineActionBarViewController3 != null) {
                        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 13), C62636KjH.A05, clipsTimelineActionBarViewController3);
                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController4 = this.A03;
                        if (clipsTimelineActionBarViewController4 != null) {
                            ClipsTimelineActionBarViewController.A01(LY4.A00(this, 14), C62636KjH.A02, clipsTimelineActionBarViewController4);
                            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController5 = this.A03;
                            if (clipsTimelineActionBarViewController5 != null) {
                                ClipsTimelineActionBarViewController.A01(LY4.A00(this, 15), C62636KjH.A0f, clipsTimelineActionBarViewController5);
                                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController6 = this.A03;
                                if (clipsTimelineActionBarViewController6 != null) {
                                    ClipsTimelineActionBarViewController.A01(LY4.A00(this, 16), C62636KjH.A0h, clipsTimelineActionBarViewController6);
                                    ClipsTimelineActionBarViewController clipsTimelineActionBarViewController7 = this.A03;
                                    if (clipsTimelineActionBarViewController7 != null) {
                                        ClipsTimelineActionBarViewController.A01(LY4.A00(this, 17), C62636KjH.A0S, clipsTimelineActionBarViewController7);
                                        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController8 = this.A03;
                                        if (clipsTimelineActionBarViewController8 != null) {
                                            ClipsTimelineActionBarViewController.A01(LY4.A00(this, 18), C62636KjH.A0G, clipsTimelineActionBarViewController8);
                                            ClipsTimelineActionBarViewController clipsTimelineActionBarViewController9 = this.A03;
                                            if (clipsTimelineActionBarViewController9 != null) {
                                                ClipsTimelineActionBarViewController.A01(LY4.A00(this, 19), C62636KjH.A03, clipsTimelineActionBarViewController9);
                                                ClipsTimelineActionBarViewController clipsTimelineActionBarViewController10 = this.A03;
                                                if (clipsTimelineActionBarViewController10 != null) {
                                                    ClipsTimelineActionBarViewController.A01(LY4.A00(this, 10), C62636KjH.A0F, clipsTimelineActionBarViewController10);
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
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.4DH} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = -737988011(0xffffffffd4033255, float:-2.25394059E12)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r5 = r19
            r0 = r20
            X.K5P.super.onCreate(r0)
            android.os.Bundle r2 = r5.requireArguments()
            java.lang.Class<com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider> r1 = com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider.class
            java.lang.String r0 = "ARG_TARGET_VIEW_SIZE_PROVIDER"
            android.os.Parcelable r0 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig) r0
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            int r0 = r0.A06
            r5.A00 = r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.0eM r6 = r5.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r6)
            X.2YL r0 = X.JTS.A0E(r5, r1, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r5.A04 = r0
            X.2YN r1 = X.DbW.A0F(r5)
            java.lang.Class<X.88B> r0 = X.AnonymousClass88B.class
            X.2YL r0 = r1.A00(r0)
            X.88B r0 = (X.AnonymousClass88B) r0
            r5.A0A = r0
            androidx.fragment.app.FragmentActivity r8 = r5.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r5.A04
            java.lang.String r7 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x007b
            X.83m r1 = r0.A0Q
            X.8Lu r0 = new X.8Lu
            r0.<init>(r2, r3, r1)
            X.2YN r1 = X.JTO.A0L(r0, r8)
            java.lang.Class<X.8Lv> r0 = X.C354388Lv.class
            X.2YL r0 = r1.A00(r0)
            X.8Lv r0 = (X.C354388Lv) r0
            r5.A08 = r0
            androidx.fragment.app.FragmentActivity r9 = r5.requireActivity()
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r13 = r5.A04
            if (r13 == 0) goto L_0x007b
            X.88B r0 = r5.A0A
            if (r0 != 0) goto L_0x0083
            java.lang.String r7 = "clipsSourceMediaViewModel"
        L_0x007b:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            r11 = 0
            X.8Lv r12 = r5.A08
            if (r12 != 0) goto L_0x008b
            java.lang.String r7 = "clipsColorFilterViewModel"
            goto L_0x007b
        L_0x008b:
            X.KEd r8 = new X.KEd
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.2YN r1 = X.JTO.A0L(r8, r5)
            java.lang.Class<X.Jfp> r0 = X.C60109Jfp.class
            X.2YL r0 = r1.A00(r0)
            X.Jfp r0 = (X.C60109Jfp) r0
            r5.A09 = r0
            X.860 r1 = X.JTS.A0N(r5)
            java.lang.String r0 = "post_capture"
            X.861 r0 = r1.A00(r0)
            r5.A07 = r0
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            X.KBg r0 = new X.KBg
            r0.<init>(r1)
            X.2YN r1 = X.JTO.A0L(r0, r5)
            java.lang.Class<X.Jfa> r0 = X.C60094Jfa.class
            X.2YL r0 = r1.A00(r0)
            X.Jfa r0 = (X.C60094Jfa) r0
            r5.A05 = r0
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.8RK r0 = new X.8RK
            r0.<init>(r2, r1)
            X.2YN r1 = X.JTO.A0L(r0, r3)
            java.lang.Class<X.8RL> r0 = X.AnonymousClass8RL.class
            X.2YL r0 = r1.A00(r0)
            X.8RL r0 = (X.AnonymousClass8RL) r0
            r5.A06 = r0
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r6)
            int r3 = r5.A00
            r14 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r5.A04
            if (r2 == 0) goto L_0x007b
            X.Jfp r1 = r5.A09
            if (r1 != 0) goto L_0x00fa
            java.lang.String r7 = "clipsTimelineActionBarViewModel"
            goto L_0x007b
        L_0x00fa:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r0 = new com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController
            r10 = r1
            r12 = r11
            r13 = r3
            r6 = r0
            r7 = r5
            r9 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.A03 = r0
            r5.registerLifecycleListener(r0)
            r0 = -886260387(0xffffffffcb2cbd5d, float:-1.1320669E7)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5P.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(2134275479);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_timeline_editor_postcap_fragment, viewGroup, false);
        this.A01 = new C60408Jl1();
        Context requireContext = requireContext();
        C60408Jl1 jl1 = this.A01;
        if (jl1 == null) {
            str = "miniTimelineAdapter";
        } else {
            RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(inflate, R.id.mini_timeline);
            AnonymousClass861 r10 = this.A07;
            if (r10 == null) {
                str = "videoPlaybackViewModel";
            } else {
                ClipsCreationViewModel clipsCreationViewModel = this.A04;
                if (clipsCreationViewModel == null) {
                    str = "clipsCreationViewModel";
                } else {
                    this.A02 = new LAJ(requireContext, recyclerView, jl1, r10, JTO.A07(clipsCreationViewModel));
                    if (182.A06(0Tu.A06, AnonymousClass7TF.A0L(this.A0B, 0), 36327327311214933L)) {
                        Dbb.A0t(inflate, R.id.mini_timeline_container, 0);
                        LAJ laj = this.A02;
                        if (laj == null) {
                            str = "miniTimelineController";
                        } else {
                            ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1 clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1 = laj.A05;
                            clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1.A0w(false);
                            RecyclerView recyclerView2 = laj.A03;
                            recyclerView2.setVisibility(0);
                            recyclerView2.setLayoutManager(clipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1);
                            recyclerView2.setAdapter(laj.A04);
                            recyclerView2.setItemAnimator((AnonymousClass3AS) null);
                            C60473Jm5.A00(recyclerView2, laj, 7);
                            recyclerView2.A13(new C64338LaD(laj));
                        }
                    }
                    AnonymousClass0fD.A09(-1425755562, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
