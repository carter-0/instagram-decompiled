package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.common.math.matrix.Matrix4;
import com.google.android.material.tabs.TabLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.K6s  reason: case insensitive filesystem */
public final class C61421K6s extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C352278Cs {
    public static final String __redex_internal_original_name = "IGTVUploadCanvasFragment";
    public ViewGroup A00;
    public Toast A01;
    public TabLayout A02;
    public ConstrainedTextureView A03;
    public C378369Pn A04;
    public C378379Po A05;
    public FilterGroupModel A06;
    public C63776L6i A07;
    public ImageView A08;
    public C64721Lgy A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = C66306MMp.A00(this, C66306MMp.A02(this, 21), new C73666Phf(2, (Object) null, this), DbS.A0z(C60266JiN.class), 22);
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = C66306MMp.A00(this, C66306MMp.A02(this, 19), new C73666Phf(1, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 20);

    public final String getModuleName() {
        return "igtv_upload_canvas_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.ADk] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        view2.setPadding(0, 2Yu.A0G(view2.getContext(), R.attr.actionBarHeight), 0, 0);
        AnonymousClass0eM r6 = this.A0D;
        AnonymousClass3Q2 r10 = JTR.A0o(r6).A02;
        C378379Po r3 = this.A05;
        if (r3 != null) {
            ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(requireContext());
            r3.A03 = constrainedTextureView;
            constrainedTextureView.setAspectRatio(JTO.A0k(r6).A0M.A00);
            this.A03 = constrainedTextureView;
            FrameLayout.LayoutParams A0D2 = JTS.A0D();
            A0D2.gravity = 17;
            ViewGroup A0C2 = DbU.A0C(view2, R.id.creation_image_container);
            ConstrainedTextureView constrainedTextureView2 = this.A03;
            if (constrainedTextureView2 != null) {
                A0C2.addView(constrainedTextureView2, 0, A0D2);
                this.A00 = A0C2;
                if (JTO.A0k(r6).A0M.A0C != null) {
                    AnonymousClass0eM r5 = this.A0A;
                    JTP.A19(JTT.A0V(r5).A01, JTR.A0o(r6).A01.B5s());
                    JTP.A19(JTT.A0V(r5).A02, JTR.A0o(r6).A01.B5v());
                }
                int B5s = JTR.A0o(r6).A01.B5s();
                int B5v = JTR.A0o(r6).A01.B5v();
                FilterGroupModel filterGroupModel = this.A06;
                if (filterGroupModel != null) {
                    C63122Krq.A00(((FilterGroupModelImpl) filterGroupModel).A02, B5s, B5v);
                    Matrix4 matrix4 = C378369Pn.A0R;
                    Context requireContext = requireContext();
                    ? obj = new Object();
                    ViewGroup viewGroup = this.A00;
                    if (viewGroup != null) {
                        obj.A01(viewGroup.findViewById(R.id.play_button));
                        ViewGroup viewGroup2 = this.A00;
                        if (viewGroup2 != null) {
                            obj.A01 = viewGroup2.findViewById(R.id.seek_frame_indicator);
                            AnonymousClass0eM r52 = this.A0C;
                            C378369Pn r12 = new C378369Pn(requireContext, AnonymousClass7TE.A0l(r52), obj, "live", false, true);
                            r12.A08(r10, 0);
                            C378379Po r0 = this.A05;
                            if (r0 != null) {
                                0qQ.A0B(r12, 0);
                                r0.A06 = r12;
                                C378459Pw r02 = r12.A08;
                                if (r02 != null) {
                                    r02.A0L(true);
                                }
                                r12.A07(this);
                                this.A04 = r12;
                                ConstrainedTextureView constrainedTextureView3 = this.A03;
                                if (constrainedTextureView3 != null) {
                                    AnonymousClass0fU.A00(r12, constrainedTextureView3);
                                    C378379Po r03 = this.A05;
                                    if (r03 != null) {
                                        constrainedTextureView3.setSurfaceTextureListener(r03);
                                        AnonymousClass0eM r9 = this.A0A;
                                        Dba.A15(getViewLifecycleOwner(), JTT.A0V(r9).A01, new MPB(9, (Object) r10, (Object) this), 64);
                                        Dba.A15(getViewLifecycleOwner(), JTT.A0V(r9).A02, new MPB(10, (Object) r10, (Object) this), 64);
                                        Dba.A15(getViewLifecycleOwner(), JTT.A0V(r9).A03, MPA.A00(this, 18), 64);
                                        Dba.A15(getViewLifecycleOwner(), JTT.A0V(r9).A05, MPA.A00(this, 19), 64);
                                        C60725JqE jqE = new C60725JqE(AnonymousClass7TE.A0l(r52), this);
                                        View requireViewById = view2.requireViewById(R.id.view_pager);
                                        ViewPager2 viewPager2 = (ViewPager2) requireViewById;
                                        viewPager2.setAdapter(jqE);
                                        viewPager2.A03(C62547Khd.FILTER.A00, true);
                                        viewPager2.setUserInputEnabled(false);
                                        0qQ.A07(requireViewById);
                                        TabLayout tabLayout = (TabLayout) view2.requireViewById(R.id.tab_layout);
                                        this.A02 = tabLayout;
                                        if (tabLayout == null) {
                                            0qQ.A0F("tabLayout");
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                        new C66992MgQ(viewPager2, tabLayout, new C64447Lc2(this, 1)).A00();
                                        Dba.A15(getViewLifecycleOwner(), JTT.A0V(r9).A06, MPA.A00(this, 17), 64);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("previewViewContainer");
                    throw AnonymousClass00P.createAndThrow();
                }
                throw AnonymousClass7TE.A0y();
            }
            0qQ.A0F("previewTextureView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("videoRenderController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dxn(int i) {
        JTP.A1W(JTT.A0V(this.A0A).A07, i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A07 == null) {
            str = "creationLogger";
        } else {
            C64721Lgy lgy = this.A09;
            if (lgy != null) {
                return lgy.onBackPressed();
            }
            str = "draftsUnsavedChangesHandlerDelegate";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C61421K6s() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66306MMp.A02(C66306MMp.A02(this, 23), 24));
        0Yh A0z = DbS.A0z(C60206JhP.class);
        this.A0A = DbS.A0I(C66306MMp.A02(A002, 25), new C73666Phf(4, A002, this), new C73666Phf(3, (Object) null, A002), A0z);
        this.A0C = C227642jf.A02(this);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        ImageView imageView = this.A08;
        if (imageView == null) {
            0qQ.A0F("toggleAudioButton");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.ETh(imageView);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = getString(2131968361);
        DbX.A19(LY6.A00(this, 9), A0K, r3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1746950833);
        C61421K6s.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("igtv_creation_session_id_arg", AnonymousClass7TG.A0j());
        String string2 = requireArguments.getString("igtv_viewer_session_id_arg", (String) null);
        AnonymousClass0eM r6 = this.A0C;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        0qQ.A0A(string);
        C63775L6h l6h = new C63775L6h(A0l, string, string2);
        this.A07 = new C63776L6i(l6h.A00, l6h.A01, l6h.A02);
        this.A09 = new C64721Lgy(requireContext(), this, string);
        AnonymousClass0eM r4 = this.A0D;
        AnonymousClass3Q2 r7 = JTR.A0o(r4).A02;
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(true);
        surfaceCropFilter.A0K(JW0.A00(r7.A02, r7.A0H, r7.A0G, 0, false), r7.A0H, r7.A0G, 0, true);
        FilterGroupModelImpl A002 = AnonymousClass9TB.A00();
        A002.EWj(surfaceCropFilter.A00, 3);
        r7.A1D = A002;
        this.A06 = A002;
        C378379Po r72 = new C378379Po(requireContext(), (C368028rx) null, AnonymousClass7TE.A0l(r6), (AnonymousClass80G) null, A002, (Integer) null, "live", false, false, false, false, true, false, false, false);
        int i = JTR.A0o(r4).A02.A1N.A09;
        int i2 = JTR.A0o(r4).A02.A1N.A06;
        r72.A01 = i;
        r72.A00 = i2;
        this.A05 = r72;
        AnonymousClass0fD.A09(-690456201, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-415616804);
        0qQ.A0B(layoutInflater, 0);
        View inflate = getLayoutInflater().inflate(R.layout.upload_toggle_audio_button, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        AnonymousClass0fU.A00(new LY7(14, (Object) imageView, (Object) this), imageView);
        this.A08 = imageView;
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.igtv_upload_canvas_fragment, false);
        AnonymousClass0fD.A09(297450045, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1779973459);
        C378369Pn r1 = this.A04;
        if (r1 == null) {
            0qQ.A0F("videoPreviewDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A0N.remove(this);
        C378459Pw r0 = r1.A08;
        if (r0 != null) {
            r0.A0A.remove(this);
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(541089494, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1763855788);
        C378369Pn r0 = this.A04;
        if (r0 != null) {
            r0.A04();
            C378369Pn r02 = this.A04;
            if (r02 != null) {
                r02.A01();
                C61421K6s.super.onPause();
                AnonymousClass0fD.A09(-1678711745, A022);
                return;
            }
        }
        0qQ.A0F("videoPreviewDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(1484847130);
        super.onResume();
        C378379Po r2 = this.A05;
        if (r2 == null) {
            str = "videoRenderController";
        } else {
            C378369Pn r0 = this.A04;
            str = "videoPreviewDelegate";
            if (r0 != null) {
                r2.A06 = r0;
                r0.A04();
                C378369Pn r02 = this.A04;
                if (r02 != null) {
                    r02.A03();
                    AnonymousClass0fD.A09(-1227973505, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
