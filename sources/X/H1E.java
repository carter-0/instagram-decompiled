package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

public final class H1E extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C289875eN, C320316sB {
    public static final String __redex_internal_original_name = "HorizonPivotPageFragment";
    public View A00;
    public View A01;
    public C53376Gn6 A02;
    public ShimmerFrameLayout A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public CircularImageView A08;
    public IgImageView A09;
    public C320516sV A0A;
    public IgTextView A0B;
    public 2el A0C;
    public AnonymousClass2uE A0D;
    public C249763kK A0E;
    public String A0F;
    public final String A0G = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0H = C51970G9q.A0n(this, 36);
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final AnonymousClass0eM A0J = DbS.A0I(new MMH(this, 37), new MMH(this, 38), C58690Ivz.A00((Object) null, this, 24), DbS.A0z(C52957GgA.class));
    public final int A0K = 15;
    public final C229132mt A0L = new ISY(this, 5);

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    public final void D46(C267324bN r5, int i) {
        0qQ.A0B(r5, 0);
        AnonymousClass0eM r3 = this.A0I;
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.AR_EFFECT, AnonymousClass7TE.A0l(r3));
        A0i.A1C = r5.getId();
        A0i.A1B = "43";
        A0i.A1F = this.A0G;
        A0i.A12 = this.A0F;
        A0i.A1c = false;
        C250563lf.A0X(requireActivity(), A0i.A00(), AnonymousClass7TE.A0l(r3));
    }

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final /* synthetic */ void DyE() {
    }

    public final void configureActionBar(2da r3) {
        String str;
        0qQ.A0B(r3, 0);
        r3.Eu5(C56801ICy.A00(this, 20), true);
        C53376Gn6 gn6 = this.A02;
        if (gn6 != null && (str = gn6.A04) != null) {
            r3.setTitle(str);
        }
    }

    public final String getModuleName() {
        return "horizon_worlds_pivot_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        H1E.super.onAttach(context);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        Number number;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(view2, R.id.thumbnail_stub);
        viewStub.setLayoutResource(R.layout.layout_clips_effect_page_thumbnail);
        viewStub.inflate();
        this.A07 = DbT.A0a(view2, R.id.title);
        this.A04 = DbT.A0a(view2, R.id.username);
        this.A05 = DbT.A0a(view2, R.id.video_count);
        this.A06 = DbT.A0a(view2, R.id.description);
        this.A08 = (CircularImageView) view2.requireViewById(R.id.user_profile_picture);
        IgTextView igTextView = this.A04;
        String str5 = null;
        if (igTextView == null) {
            str2 = "headerArtist";
        } else {
            igTextView.setVisibility(8);
            ? r5 = this.A08;
            if (r5 == 0) {
                str2 = "headerProfilePicture";
            } else {
                r5.setVisibility(8);
                this.A09 = DbT.A0b(view2, R.id.circular_thumbnail);
                float dimension = DbV.A05(this).getDimension(R.dimen.action_bar_immersive_gradient_height);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dimension / 2.0f);
                gradientDrawable.setColor(-1);
                gradientDrawable.setStroke(1, -8355712);
                IgImageView igImageView = this.A09;
                String str6 = "thumbnail";
                if (igImageView != null) {
                    igImageView.setBackground(gradientDrawable);
                    C53376Gn6 gn6 = this.A02;
                    if (gn6 == null || (number = (Number) gn6.A02) == null) {
                        drawable = null;
                    } else {
                        drawable = requireContext().getDrawable(number.intValue());
                    }
                    IgImageView igImageView2 = this.A09;
                    if (igImageView2 != null) {
                        igImageView2.setImageDrawable(drawable);
                        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0F(view2, R.id.header);
                        C270354gb r10 = new C270354gb();
                        r10.A0I(constraintLayout);
                        r10.A09(R.id.video_count_shimmer_container, 4);
                        r10.A09(R.id.description, 3);
                        r10.A09(R.id.username, 4);
                        r10.A0E(R.id.video_count_shimmer_container, 3, R.id.description, 4, 12);
                        r10.A0E(R.id.description, 3, R.id.username, 4, 12);
                        IgTextView igTextView2 = this.A05;
                        if (igTextView2 == null) {
                            str6 = "headerCount";
                        } else {
                            igTextView2.setTextAppearance(R.style.PrivacyTextStyle);
                            r10.A0G(constraintLayout);
                            IgTextView igTextView3 = this.A07;
                            if (igTextView3 == null) {
                                str6 = "headerTitle";
                            } else {
                                C53376Gn6 gn62 = this.A02;
                                if (gn62 != null) {
                                    str = gn62.A07;
                                } else {
                                    str = null;
                                }
                                igTextView3.setText(str);
                                IgTextView igTextView4 = this.A06;
                                if (igTextView4 == null) {
                                    str6 = "headerDescription";
                                } else {
                                    C53376Gn6 gn63 = this.A02;
                                    if (gn63 != null) {
                                        str5 = gn63.A06;
                                    }
                                    igTextView4.setText(str5);
                                    this.A00 = view2.requireViewById(R.id.use_in_camera_button_scene_root);
                                    this.A0B = DbT.A0a(view2, R.id.use_in_camera_label);
                                    C53376Gn6 gn64 = this.A02;
                                    if (gn64 != null) {
                                        z = AnonymousClass7TF.A1Y(gn64.A03, true);
                                    } else {
                                        z = false;
                                    }
                                    String str7 = "floatingButtonLabel";
                                    str2 = "floatingButton";
                                    View view3 = this.A00;
                                    if (z) {
                                        if (view3 != null) {
                                            view3.setVisibility(0);
                                            IgTextView igTextView5 = this.A0B;
                                            if (igTextView5 != null) {
                                                igTextView5.setVisibility(0);
                                                IgTextView igTextView6 = this.A0B;
                                                if (igTextView6 != null) {
                                                    C53376Gn6 gn65 = this.A02;
                                                    if (gn65 != null) {
                                                        str4 = gn65.A05;
                                                    } else {
                                                        str4 = null;
                                                    }
                                                    igTextView6.setText(str4);
                                                    View view4 = this.A00;
                                                    if (view4 != null) {
                                                        DbT.A1F(view4, R.id.use_in_camera_button, 0);
                                                        View view5 = this.A00;
                                                        if (view5 != null) {
                                                            2eS.A01(view5);
                                                            View requireView = requireView();
                                                            View view6 = this.A00;
                                                            if (view6 != null) {
                                                                Scene scene = new Scene((ViewGroup) view6, (ViewGroup) requireView.findViewById(R.id.use_in_camera_button));
                                                                View view7 = this.A00;
                                                                if (view7 != null) {
                                                                    Scene sceneForLayout = Scene.getSceneForLayout((ViewGroup) view7, R.layout.layout_use_in_camera_button_scrolling, requireActivity());
                                                                    if (sceneForLayout != null) {
                                                                        View requireViewById = requireView.requireViewById(R.id.app_bar_layout);
                                                                        0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
                                                                        ((AppBarLayout) requireViewById).A02(new HG0(1, requireView, scene, this, sceneForLayout));
                                                                        View view8 = this.A00;
                                                                        if (view8 != null) {
                                                                            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view8);
                                                                            A0m.A04 = new C54310H7f(this, 6);
                                                                            A0m.A00();
                                                                        }
                                                                    } else {
                                                                        throw AnonymousClass7TE.A0y();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            0qQ.A0F(str7);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    } else if (view3 != null) {
                                        view3.setVisibility(8);
                                        IgTextView igTextView7 = this.A0B;
                                        if (igTextView7 != null) {
                                            igTextView7.setVisibility(8);
                                        }
                                        0qQ.A0F(str7);
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                    GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
                                    C320516sV r52 = this.A0A;
                                    str2 = "clipsGridAdapter";
                                    if (r52 != null) {
                                        C51971G9r.A14(gridLayoutManager, r52);
                                        C3251871j r12 = new C3251871j(gridLayoutManager, this.A0L, C3251771i.A06, false, false);
                                        View requireViewById2 = view2.requireViewById(R.id.videos_list);
                                        RecyclerView recyclerView = (RecyclerView) requireViewById2;
                                        recyclerView.setLayoutManager(gridLayoutManager);
                                        recyclerView.A15(r12);
                                        C51972G9s.A13(this, recyclerView);
                                        C320516sV r53 = this.A0A;
                                        if (r53 != null) {
                                            recyclerView.setAdapter(r53.A0I);
                                            0qQ.A07(requireViewById2);
                                            2el r54 = this.A0C;
                                            if (r54 == null) {
                                                str7 = "viewpointManager";
                                            } else {
                                                Dba.A0z(recyclerView, r54, this);
                                                this.A03 = (ShimmerFrameLayout) view2.requireViewById(R.id.videos_list_shimmer_container);
                                                C320516sV r55 = this.A0A;
                                                if (r55 != null) {
                                                    if (C320516sV.A00(r55).isEmpty()) {
                                                        C320516sV r6 = this.A0A;
                                                        if (r6 != null) {
                                                            r6.A04(this.A0K);
                                                            ShimmerFrameLayout shimmerFrameLayout = this.A03;
                                                            if (shimmerFrameLayout != null) {
                                                                shimmerFrameLayout.A02();
                                                            }
                                                        }
                                                    }
                                                    View requireViewById3 = view2.requireViewById(R.id.video_count_shimmer);
                                                    this.A01 = requireViewById3;
                                                    C53376Gn6 gn66 = this.A02;
                                                    if (gn66 != null && gn66.A00 != null) {
                                                        if (requireViewById3 != null) {
                                                            requireViewById3.setVisibility(8);
                                                        }
                                                        IgTextView igTextView8 = this.A05;
                                                        str7 = "headerCount";
                                                        if (igTextView8 != null) {
                                                            igTextView8.setVisibility(0);
                                                            IgTextView igTextView9 = this.A05;
                                                            if (igTextView9 != null) {
                                                                C53376Gn6 gn67 = this.A02;
                                                                if (gn67 != null) {
                                                                    str3 = gn67.A00;
                                                                } else {
                                                                    str3 = null;
                                                                }
                                                                igTextView9.setText(str3);
                                                            }
                                                        }
                                                    } else if (requireViewById3 != null) {
                                                        requireViewById3.setVisibility(0);
                                                    }
                                                    AnonymousClass0eM r7 = this.A0J;
                                                    C51969G9p.A15(getViewLifecycleOwner(), ((C52957GgA) r7.getValue()).A00, C59097J6f.A01(this, 28), 20);
                                                    C53376Gn6 gn68 = this.A02;
                                                    if (!(gn68 == null || gn68.A00 == null)) {
                                                        C320516sV r0 = this.A0A;
                                                        if (r0 != null) {
                                                            if (!C320516sV.A00(r0).isEmpty()) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    ((C52957GgA) r7.getValue()).A02.A00.A04((Long) null, (String) null, 0sn.A00, false);
                                                    return;
                                                }
                                            }
                                            0qQ.A0F(str7);
                                            throw AnonymousClass00P.createAndThrow();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str6);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r5, int i) {
        AnonymousClass7TG.A1T(r5, view, motionEvent);
        1Xj r1 = r5.A02;
        if (r1 == null) {
            return false;
        }
        AnonymousClass2uE r0 = this.A0D;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r1, i);
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int A022 = AnonymousClass0fD.A02(1876082928);
        H1E.super.onCreate(bundle);
        String string = requireArguments().getString("source_media_id");
        if (string != null) {
            str = AnonymousClass3VO.A02(string);
        } else {
            str = null;
        }
        this.A0F = str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            str2 = activity.getString(2131963488);
        } else {
            str2 = null;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            str3 = activity2.getString(2131963485);
        } else {
            str3 = null;
        }
        Integer valueOf = Integer.valueOf(R.drawable.horizon_worlds_foa_horizonlogo);
        AnonymousClass0eM r3 = this.A0I;
        Boolean A0R = AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(r3), 36319952851967831L);
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            str4 = activity3.getString(2131963486);
        } else {
            str4 = null;
        }
        FragmentActivity activity4 = getActivity();
        if (activity4 != null) {
            str5 = activity4.getString(2131963489);
        } else {
            str5 = null;
        }
        this.A02 = new C53376Gn6(A0R, valueOf, str2, str3, str4, str5);
        2el A002 = 2el.A00();
        this.A0C = A002;
        this.A0A = new C320516sV(requireContext(), (C321686ua) null, new C320486sS(0.5625f, false, false), this, new C320496sT(AnonymousClass7TE.A0l(r3), A002, this, (String) null), this, AnonymousClass7TE.A0l(r3), (C294875nB) null, (String) null, (String) null, false, false);
        ((C229352nF) this.A0H.getValue()).A02(this.A0G);
        this.A0E = 1L2.A00();
        FragmentActivity requireActivity = requireActivity();
        0hq parentFragmentManager = getParentFragmentManager();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        C249763kK r32 = this.A0E;
        if (r32 == null) {
            str6 = "pivotPageSessionProvider";
        } else {
            C320516sV r1 = this.A0A;
            if (r1 == null) {
                str6 = "clipsGridAdapter";
            } else {
                AnonymousClass2uE r16 = new AnonymousClass2uE(requireActivity, this, parentFragmentManager, A0l, (AnonymousClass57N) null, this, r1, r32, true, true, false);
                r16.A0B = this;
                this.A0D = r16;
                registerLifecycleListener(r16);
                AnonymousClass0fD.A09(-1578069435, A022);
                return;
            }
        }
        0qQ.A0F(str6);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-230126087);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1114924852, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1605213684);
        super.onDestroy();
        ((C229352nF) this.A0H.getValue()).A07(this.A0G);
        AnonymousClass0fD.A09(118484818, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-94465985);
        super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(1815909389, A022);
    }
}
