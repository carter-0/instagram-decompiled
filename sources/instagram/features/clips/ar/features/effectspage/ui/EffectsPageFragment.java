package instagram.features.clips.ar.features.effectspage.ui;

import X.02m;
import X.0Aj;
import X.0Tu;
import X.0gy;
import X.0qQ;
import X.0xY;
import X.1OP;
import X.1Xj;
import X.2YN;
import X.2Yu;
import X.2dZ;
import X.2el;
import X.AnonymousClass05E;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass2uE;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass3DZ;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DS;
import X.AnonymousClass4DU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass8ZN;
import X.C229132mt;
import X.C230252pH;
import X.C244273av;
import X.C249763kK;
import X.C250563lf;
import X.C252553pI;
import X.C263944Ny;
import X.C267324bN;
import X.C270354gb;
import X.C270634h3;
import X.C289875eN;
import X.C298055sn;
import X.C320306sA;
import X.C320316sB;
import X.C320416sL;
import X.C320516sV;
import X.C320826t1;
import X.C321676uZ;
import X.C3251771i;
import X.C3251871j;
import X.C391589tK;
import X.C50469FcH;
import X.C51965G9l;
import X.C51970G9q;
import X.C51971G9r;
import X.C51972G9s;
import X.C51973G9u;
import X.C52086GEg;
import X.C52273GLp;
import X.C52280GLw;
import X.C52315GNh;
import X.C52975GgS;
import X.C53084GiI;
import X.C54273H5q;
import X.C54689HOu;
import X.C58027IkK;
import X.C59564JOk;
import X.C59689JTv;
import X.C61037Jvb;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.FG7;
import X.GGQ;
import X.HG0;
import X.IB2;
import X.ID1;
import X.IHH;
import X.IMF;
import X.IMZ;
import X.MFg;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.android.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

public class EffectsPageFragment extends AnonymousClass4DH implements AnonymousClass4DS, C320306sA, C289875eN, C320316sB {
    public C391589tK A00;
    public AnonymousClass8ZN A01;
    public C61037Jvb A02;
    public EffectsPageModel A03;
    public C52975GgS A04;
    public C321676uZ A05;
    public C320416sL A06;
    public UserSession A07;
    public 1Xj A08;
    public Reel A09;
    public MusicAttributionConfig A0A;
    public C230252pH A0B;
    public AnonymousClass32A A0C;
    public GradientSpinner A0D;
    public C320516sV A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public 2el A0N;
    public AnonymousClass2uE A0O;
    public C249763kK A0P;
    public String A0Q = AnonymousClass7TF.A0b();
    public final AnonymousClass4DU A0R = new Object();
    public final C53084GiI A0S = new C53084GiI(this);
    public ShimmerFrameLayout mClipsGridShimmerContainer;
    public RecyclerView mClipsRecyclerView;
    public View mContainer;
    public IgImageView mEffectThumbnail;
    public TextView mReelsEmptyMessageView;
    public View mSaveButton;
    public ViewGroup mUseInCameraButton;
    public TextView mVideoCountView;

    public static Bundle A00(C391589tK r3, AnonymousClass8ZN r4, EffectsPageModel effectsPageModel, MusicAttributionConfig musicAttributionConfig, String str, String str2, String str3, String str4, String str5) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("ARGS_EFFECT_MODEL", effectsPageModel);
        A0a.putString("ARGS_MEDIA_ID", str);
        A0a.putString("ARGS_MEDIA_TAP_TOKEN", str2);
        A0a.putString("ARGS_RANKING_INFO_TOKEN", str3);
        A0a.putString("ARGS_PRELOADED_AUDIO_ID", str4);
        A0a.putString("ARGS_PRELOADED_GRID_KEY", (String) null);
        A0a.putString("ARGS_EFFECT_PAGE_ENTRY_POINT", r3.name());
        A0a.putParcelable("ARGS_PRELOADED_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
        A0a.putString("ARGS_BEST_AUDIO_CLUSTER_ID", str5);
        A0a.putSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT", r4);
        return A0a;
    }

    public final List Any() {
        return Collections.singletonList(new C52315GNh(this, 1));
    }

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final void D3i(User user) {
        C52273GLp.A03(requireActivity(), this, this.A07, user.getId(), "EFFECT_PIVOT_PAGE", (String) null, ModalActivity.A08);
    }

    public final void DWX() {
    }

    public final void DWZ() {
    }

    public final void DyE() {
    }

    public final String getModuleName() {
        return "effect_page";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1.equals("HORIZON") == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r5 = this;
            android.view.ViewGroup r1 = r5.mUseInCameraButton
            if (r1 == 0) goto L_0x0066
            r0 = 2131443511(0x7f0b3f37, float:1.8509092E38)
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r1, r0)
            if (r4 == 0) goto L_0x0066
            android.content.Context r1 = r5.requireContext()
            r0 = 2131976205(0x7f13600d, float:1.9589524E38)
            java.lang.String r1 = r1.getString(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = r5.A03
            if (r2 == 0) goto L_0x002e
            java.lang.Integer r0 = r2.A08
            if (r0 == 0) goto L_0x002e
            android.content.Context r1 = r5.requireContext()
            java.lang.Integer r0 = r2.A08
            int r0 = r0.intValue()
            java.lang.String r1 = r1.getString(r0)
        L_0x002e:
            r4.setText(r1)
            if (r2 == 0) goto L_0x0040
            java.lang.String r1 = r2.A0C
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = "HORIZON"
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            android.content.Context r1 = r5.requireContext()
            r0 = 2131976206(0x7f13600e, float:1.9589526E38)
            if (r3 == 0) goto L_0x004d
            r0 = 2131963487(0x7f132e5f, float:1.9563729E38)
        L_0x004d:
            X.DbU.A12(r1, r4, r0)
            X.2eS.A01(r4)
            android.view.ViewGroup r0 = r5.mUseInCameraButton
            X.3NG r2 = X.AnonymousClass7TE.A0m(r0)
            r1 = 1
            X.H7h r0 = new X.H7h
            r0.<init>(r1, r5, r3)
            r2.A04 = r0
            r2.A07 = r1
            r2.A00()
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A01():void");
    }

    public static void A03(EffectsPageFragment effectsPageFragment) {
        Drawable drawable;
        EffectsPageFragment effectsPageFragment2 = effectsPageFragment;
        View view = effectsPageFragment2.mContainer;
        if (view != null && effectsPageFragment2.A03 != null) {
            view.requireViewById(R.id.ghost_header).setVisibility(8);
            effectsPageFragment2.mContainer.requireViewById(R.id.header).setVisibility(0);
            IgImageView A0b = DbT.A0b(effectsPageFragment2.mContainer, R.id.circular_thumbnail);
            EffectsPageModel effectsPageModel = effectsPageFragment2.A03;
            ImageUrl imageUrl = effectsPageModel.A04;
            if (imageUrl != null) {
                A0b.setUrl(imageUrl, effectsPageFragment2.A0R);
            } else if (!(effectsPageModel.A05 == null || (drawable = effectsPageFragment2.requireContext().getDrawable(effectsPageFragment2.A03.A05.intValue())) == null)) {
                A0b.setImageDrawable(drawable);
            }
            DbU.A0G(effectsPageFragment2.mContainer, R.id.title).setText(effectsPageFragment2.A03.A0E);
            TextView textView = effectsPageFragment2.mVideoCountView;
            if (textView != null) {
                textView.setText(effectsPageFragment2.A03.A00);
            }
            String str = effectsPageFragment2.A03.A0A;
            SpannableStringBuilder A0C2 = DbS.A0C(str);
            if (effectsPageFragment2.A03.A0G) {
                C244273av.A08(effectsPageFragment2.requireContext(), A0C2, true);
            }
            TextView A0G2 = DbU.A0G(effectsPageFragment2.mContainer, R.id.username);
            if (A0C2.length() > 0) {
                A0G2.setText(A0C2);
                AnonymousClass0fU.A00(new ID1(effectsPageFragment2, 67), A0G2);
            }
            TextView A0G3 = DbU.A0G(effectsPageFragment2.mContainer, R.id.description);
            ConstraintLayout constraintLayout = (ConstraintLayout) effectsPageFragment2.mContainer.requireViewById(R.id.header);
            C270354gb r11 = new C270354gb();
            r11.A0I(constraintLayout);
            if (str.isEmpty()) {
                r11.A09(R.id.video_count_shimmer_container, 3);
                r11.A09(R.id.video_count_shimmer_container, 4);
                r11.A09(R.id.title, 4);
                if (effectsPageFragment2.A03.A06 == null) {
                    A0G3.setVisibility(8);
                    r11.A0E(R.id.title, 4, R.id.thumbnail_container, 4, 64);
                    r11.A0E(R.id.video_count_shimmer_container, 3, R.id.thumbnail_container, 3, 64);
                    r11.A0D(R.id.video_count_shimmer_container, 4, R.id.thumbnail_container, 4);
                } else {
                    A0G3.setVisibility(0);
                    DbT.A18(effectsPageFragment2.requireContext(), A0G3, effectsPageFragment2.A03.A06.intValue());
                    r11.A09(R.id.description, 3);
                    r11.A09(R.id.description, 4);
                    C270354gb r14 = r11;
                    r14.A0E(R.id.video_count_shimmer_container, 3, R.id.description, 4, 12);
                    r14.A0E(R.id.description, 3, R.id.title_container, 4, 12);
                    DbT.A1F(effectsPageFragment2.mContainer, R.id.user_profile_picture, 8);
                    TextView textView2 = effectsPageFragment2.mVideoCountView;
                    if (textView2 != null) {
                        textView2.setTextAppearance(R.style.PrivacyTextStyle);
                    }
                }
                A0G2.setVisibility(8);
            } else if (effectsPageFragment2.A03.A06 == null) {
                A0G3.setVisibility(8);
                r11.A09(R.id.video_count_shimmer_container, 3);
                r11.A0D(R.id.video_count_shimmer_container, 3, R.id.username, 4);
            } else {
                r11.A0I(constraintLayout);
                r11.A09(R.id.video_count_shimmer_container, 4);
                r11.A09(R.id.description, 3);
                r11.A09(R.id.username, 4);
                A0G3.setVisibility(0);
                DbT.A18(effectsPageFragment2.requireContext(), A0G3, effectsPageFragment2.A03.A06.intValue());
                C270354gb r142 = r11;
                r142.A0E(R.id.video_count_shimmer_container, 3, R.id.description, 4, 12);
                r142.A0E(R.id.description, 3, R.id.username, 4, 12);
                TextView textView3 = effectsPageFragment2.mVideoCountView;
                if (textView3 != null) {
                    textView3.setTextAppearance(R.style.PrivacyTextStyle);
                }
            }
            r11.A0G(constraintLayout);
            A06(effectsPageFragment2, false);
            View view2 = effectsPageFragment2.mView;
            if (view2 != null) {
                IgdsBanner igdsBanner = (IgdsBanner) view2.requireViewById(R.id.age_restricted_note_banner);
                if (effectsPageFragment2.A0L) {
                    Context context = view2.getContext();
                    igdsBanner.setVisibility(0);
                    igdsBanner.setBodyColor(context.getColor(2Yu.A08(context)));
                    igdsBanner.A00 = new C50469FcH(4, context, effectsPageFragment2);
                    return;
                }
                igdsBanner.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r3) {
        /*
            android.view.ViewGroup r2 = r3.mUseInCameraButton
            if (r2 == 0) goto L_0x001d
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r3.A03
            if (r1 == 0) goto L_0x0015
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0015
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x0015
            boolean r0 = r1.A0J
            r1 = 0
            if (r0 != 0) goto L_0x0017
        L_0x0015:
            r1 = 8
        L_0x0017:
            r2.setVisibility(r1)
            r3.A01()
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A04(instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment):void");
    }

    public static void A05(EffectsPageFragment effectsPageFragment, int i) {
        if (effectsPageFragment.A03 == null) {
            C59689JTv.A0F(effectsPageFragment.getActivity(), "clips_effect_failed_toast", i);
            A06(effectsPageFragment, true);
            2dZ.A0t.A03(effectsPageFragment.getActivity()).setIsLoading(true);
            ((ShimmerFrameLayout) effectsPageFragment.mContainer.requireViewById(R.id.ghost_header)).A05();
        }
    }

    public static void A06(EffectsPageFragment effectsPageFragment, boolean z) {
        View view = effectsPageFragment.mView;
        if ((effectsPageFragment.A0M || z) && view != null) {
            View requireViewById = view.requireViewById(R.id.metadata_bar);
            C298055sn r1 = (C298055sn) requireViewById.getLayoutParams();
            r1.A00 = 0;
            requireViewById.setLayoutParams(r1);
            effectsPageFragment.mClipsRecyclerView.setVisibility(8);
            effectsPageFragment.mUseInCameraButton.setVisibility(8);
            if (effectsPageFragment.A02 != null) {
                View A0F2 = DbY.A0F(view, R.id.restricted_banner);
                DbU.A0G(A0F2, R.id.restricted_label).setText(effectsPageFragment.A02.A02);
                if (!TextUtils.isEmpty(effectsPageFragment.A02.A01) && !TextUtils.isEmpty(effectsPageFragment.A02.A00)) {
                    TextView A0G2 = DbU.A0G(A0F2, R.id.restricted_link);
                    A0G2.setText(effectsPageFragment.A02.A01);
                    AnonymousClass0fU.A00(new IB2(effectsPageFragment.A02.A00, effectsPageFragment, 3), A0G2);
                }
            }
        }
    }

    public final C320416sL Ao3() {
        return this.A06;
    }

    public final String B9m() {
        return this.A0Q;
    }

    public final void D46(C267324bN r7, int i) {
        String str;
        boolean z;
        AnonymousClass4DU r0 = this.A0R;
        UserSession userSession = this.A07;
        1Xj r2 = r7.A02;
        r2.getClass();
        C52086GEg.A0Y(r0, userSession, r2, this.A0P, this.A0H, i);
        C270634h3 A0i = C51965G9l.A0i(ClipsViewerSource.AR_EFFECT, this.A07);
        A0i.A1C = r7.getId();
        EffectsPageModel effectsPageModel = this.A03;
        if (effectsPageModel != null) {
            str = effectsPageModel.A0D;
        } else {
            str = null;
        }
        A0i.A1B = str;
        if (effectsPageModel != null) {
            z = effectsPageModel.A01;
        } else {
            z = true;
        }
        A0i.A0P = Boolean.valueOf(z);
        A0i.A1F = this.A0Q;
        A0i.A12 = this.A0H;
        A0i.A13 = this.A0J;
        C250563lf.A0X(requireActivity(), A0i.A00(), this.A07);
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r5, int i) {
        1Xj r0;
        AnonymousClass2uE r1 = this.A0O;
        if (r1 == null || (r0 = r5.A02) == null) {
            return false;
        }
        r1.Dsa(motionEvent, view, r0, i);
        return false;
    }

    public final AnonymousClass0wW getSession() {
        return this.A07;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            java.lang.String r6 = "ARGS_EFFECT_PAGE_ENTRY_POINT"
            r0 = 1552210404(0x5c84d9e4, float:2.99154162E17)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r10 = r22
            r0 = r23
            instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.super.onCreate(r0)
            android.os.Bundle r4 = r10.requireArguments()
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r10)
            r10.A07 = r0
            java.lang.String r0 = "ARGS_PRELOADED_GRID_KEY"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0024
            r10.A0Q = r0
        L_0x0024:
            java.lang.String r2 = "effect_page"
            r10.setModuleNameV2(r2)
            com.instagram.common.session.UserSession r1 = r10.A07
            r5 = 0
            X.0qQ.A0B(r1, r5)
            r0 = 31792025(0x1e51b99, float:8.4160915E-38)
            X.6uZ r7 = new X.6uZ
            r7.<init>(r1, r2, r0)
            r10.A05 = r7
            android.content.Context r1 = r10.requireContext()
            com.instagram.common.session.UserSession r0 = r10.A07
            X.2cc r0 = X.C71342cb.A00(r0)
            r7.A0R(r1, r0, r10)
            X.1L1 r0 = X.1L2.A00()
            r10.A0P = r0
            java.lang.String r0 = "ARGS_BEST_AUDIO_CLUSTER_ID"
            java.lang.String r0 = r4.getString(r0)
            r10.A0G = r0
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            java.lang.String r1 = "ARGS_PIVOT_PAGE_ENTRY_POINT"
            if (r7 < r0) goto L_0x01af
            java.lang.Class<X.8ZN> r0 = X.AnonymousClass8ZN.class
            java.io.Serializable r0 = r4.getSerializable(r1, r0)
        L_0x0062:
            X.8ZN r0 = (X.AnonymousClass8ZN) r0
            r10.A01 = r0
        L_0x0066:
            java.lang.String r0 = "effect_id"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto L_0x011e
            r0 = 0
            r10.A03 = r0
            r10.A0H = r0
            r10.A0F = r0
            r10.A0K = r0
            X.6uZ r0 = r10.A05
            r0.A0U(r1)
            X.IdQ r0 = new X.IdQ
            r0.<init>(r10)
            r10.A02(r0, r1)
            X.9tK r0 = X.C391589tK.DEEP_LINK
            r10.A00 = r0
        L_0x0088:
            X.2el r4 = X.2el.A00()
            r10.A0N = r4
            X.4DU r12 = r10.A0R
            com.instagram.common.session.UserSession r1 = r10.A07
            java.lang.String r0 = r10.A0H
            X.6sT r11 = new X.6sT
            r11.<init>(r1, r4, r12, r0)
            android.content.Context r7 = r10.requireContext()
            com.instagram.common.session.UserSession r13 = r10.A07
            X.6uZ r8 = r10.A05
            X.0Tu r4 = X.DbS.A0J(r13, r5)
            r0 = 36314270610295288(0x8103a3000109f8, double:3.0286291875570305E-306)
            boolean r17 = X.182.A06(r4, r13, r0)
            r0 = 1058013184(0x3f100000, float:0.5625)
            X.6sS r9 = new X.6sS
            r9.<init>(r0, r5, r5)
            r14 = 0
            com.instagram.common.session.UserSession r5 = r10.A07
            r0 = 36328229254085728(0x81105500023c60, double:3.037456690097052E-306)
            boolean r18 = X.DbY.A1Y(r4, r5, r0)
            r0 = 2
            X.0qQ.A0B(r12, r0)
            X.6sV r6 = new X.6sV
            r15 = r14
            r16 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r10.A0E = r6
            X.2t9 r1 = r6.A0I
            X.GiI r0 = r10.A0S
            r1.registerAdapterDataObserver(r0)
            X.0hq r0 = r10.mFragmentManager
            if (r0 == 0) goto L_0x00fc
            androidx.fragment.app.FragmentActivity r14 = r10.requireActivity()
            X.0hq r5 = r10.mFragmentManager
            r21 = 1
            com.instagram.common.session.UserSession r4 = r10.A07
            X.3kK r1 = r10.A0P
            X.6sV r0 = r10.A0E
            X.2uE r13 = new X.2uE
            r15 = r10
            r16 = r5
            r17 = r4
            r18 = r12
            r19 = r0
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r10.A0O = r13
            r13.A0B = r10
        L_0x00fc:
            X.2jd r5 = new X.2jd
            r5.<init>()
            com.instagram.common.session.UserSession r4 = r10.A07
            X.5nD r1 = X.C294895nD.DEFAULT
            X.6sr r0 = new X.6sr
            r0.<init>(r10, r1, r4, r2)
            r5.A0E(r0)
            X.2uE r0 = r10.A0O
            if (r0 == 0) goto L_0x0114
            r5.A0E(r0)
        L_0x0114:
            r10.registerLifecycleListenerSet(r5)
            r0 = 2116878605(0x7e2d010d, float:5.7490475E37)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x011e:
            java.lang.String r0 = "ARGS_EFFECT_MODEL"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            r0.getClass()
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = (com.instagram.ar.features.effectspage.models.EffectsPageModel) r0
            r10.A03 = r0
            boolean r0 = r0.A0F
            r10.A0L = r0
            java.lang.String r0 = "ARGS_MEDIA_ID"
            java.lang.String r1 = r4.getString(r0)
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = X.AnonymousClass3VO.A02(r1)
            r10.A0H = r0
            java.lang.String r0 = X.AnonymousClass3VO.A03(r1)
            r10.A0F = r0
            com.instagram.common.session.UserSession r0 = r10.A07
            X.1Xj r0 = X.DbV.A0U(r0, r1)
            r10.A08 = r0
        L_0x014b:
            java.lang.String r0 = "ARGS_MEDIA_TAP_TOKEN"
            java.lang.String r8 = ""
            java.lang.String r0 = r4.getString(r0, r8)
            r10.A0K = r0
            java.lang.String r0 = "ARGS_RANKING_INFO_TOKEN"
            r7 = 0
            java.lang.String r0 = r4.getString(r0, r7)
            r10.A0J = r0
            X.6uZ r9 = r10.A05
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r10.A03
            java.lang.String r0 = r1.A0D
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = r1.A0B
        L_0x0168:
            r9.A0U(r0)
            java.lang.String r0 = "ARGS_PRELOADED_AUDIO_ID"
            java.lang.String r0 = r4.getString(r0, r7)
            r10.A0I = r0
            java.lang.String r0 = "ARGS_PRELOADED_MUSIC_ATTRIBUTION_CONFIG"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.instagram.music.common.config.MusicAttributionConfig r0 = (com.instagram.music.common.config.MusicAttributionConfig) r0
            r10.A0A = r0
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r10.A03
            if (r1 == 0) goto L_0x018a
            java.lang.String r0 = r1.A0D
            if (r0 != 0) goto L_0x0189
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x018a
        L_0x0189:
            r8 = r0
        L_0x018a:
            X.IdP r0 = new X.IdP
            r0.<init>(r10)
            r10.A02(r0, r8)
            r10.A00 = r7
            java.lang.String r0 = r4.getString(r6)     // Catch:{ IllegalArgumentException -> 0x01a6 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r4.getString(r6)     // Catch:{ IllegalArgumentException -> 0x01a6 }
            X.9tK r0 = X.C391589tK.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x01a6 }
            r10.A00 = r0     // Catch:{ IllegalArgumentException -> 0x01a6 }
            goto L_0x0088
        L_0x01a6:
            java.lang.String r1 = "EffectsPageFragment"
            java.lang.String r0 = "EffectsPageEntryPoint is Invalid"
            X.0wb.A03(r1, r0)
            goto L_0x0088
        L_0x01af:
            java.io.Serializable r0 = r4.getSerializable(r1)
            if (r0 == 0) goto L_0x0066
            java.io.Serializable r0 = r4.getSerializable(r1)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.4DQ, X.07g, instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C263944Ny A002;
        long j;
        String str;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        this.mContainer = view2;
        this.A04 = new 2YN(new C54273H5q(this.A07, requireContext.getApplicationContext()), this).A00(C52975GgS.class);
        this.mContainer.requireViewById(R.id.ghost_header).setVisibility(0);
        DbX.A1B(this.mContainer, R.id.header);
        ViewStub A0D2 = DbU.A0D(view2, R.id.thumbnail_stub);
        A0D2.setLayoutResource(R.layout.layout_clips_effect_page_thumbnail);
        A0D2.inflate();
        this.mVideoCountView = AnonymousClass7TE.A0d(view2, R.id.video_count);
        this.mEffectThumbnail = DbT.A0b(this.mContainer, R.id.circular_thumbnail);
        this.A0D = (GradientSpinner) view2.requireViewById(R.id.effect_icon_reel_ring);
        this.mReelsEmptyMessageView = DbU.A0G(this.mContainer, R.id.empty_video_state);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext, 3);
        C51971G9r.A14(gridLayoutManager, this.A0E);
        RecyclerView A0I2 = DbT.A0I(view2, R.id.videos_list);
        this.mClipsRecyclerView = A0I2;
        A0I2.A11(C320826t1.A00(requireContext, 0, false));
        this.mClipsRecyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = this.mClipsRecyclerView;
        C3251771i r3 = C3251771i.A06;
        C252553pI r2 = recyclerView.A0D;
        r2.getClass();
        recyclerView.A15(new C3251871j(r2, (C229132mt) this.A06, r3));
        this.mClipsRecyclerView.setAdapter(this.A0E.A0I);
        this.A0N.A06(this.mClipsRecyclerView, AnonymousClass3DZ.A00(this));
        this.mClipsGridShimmerContainer = (ShimmerFrameLayout) view2.requireViewById(R.id.videos_list_shimmer_container);
        if (C320516sV.A00(this.A0E).isEmpty()) {
            this.A0E.A04(9);
            this.mClipsGridShimmerContainer.A02();
        } else {
            this.mClipsGridShimmerContainer.A05();
        }
        this.mUseInCameraButton = DbU.A0C(view2, R.id.use_in_camera_button_scene_root);
        A04(this);
        EffectsPageModel effectsPageModel = this.A03;
        boolean z = false;
        if (effectsPageModel != null && effectsPageModel.A01 && !this.A0M && effectsPageModel.A0J) {
            z = true;
        }
        if (z) {
            ImageView A0F2 = DbU.A0F(view2, R.id.use_in_camera_icon);
            EffectsPageModel effectsPageModel2 = this.A03;
            if (!(effectsPageModel2 == null || (str = effectsPageModel2.A0C) == null || !str.equals("HORIZON"))) {
                DbU.A13(requireActivity(), A0F2, R.drawable.instagram_link_pano_filled_24);
            }
            A01();
            View view3 = this.mContainer;
            Scene scene = new Scene(this.mUseInCameraButton, DbU.A0C(view3, R.id.use_in_camera_button));
            Scene sceneForLayout = Scene.getSceneForLayout(this.mUseInCameraButton, R.layout.layout_use_in_camera_button_scrolling, requireActivity());
            sceneForLayout.getClass();
            ((AppBarLayout) view3.requireViewById(R.id.app_bar_layout)).A02(new HG0(0, scene, sceneForLayout, view3, this));
        }
        A03(this);
        EffectsPageModel effectsPageModel3 = this.A03;
        if (effectsPageModel3 != null) {
            string = effectsPageModel3.A0D;
            if (string == null) {
                string = effectsPageModel3.A0B;
            }
        } else {
            string = requireArguments.getString("effect_id");
        }
        string.getClass();
        UserSession userSession = this.A07;
        AnonymousClass328 r1 = new AnonymousClass328(this);
        AnonymousClass4DU r7 = this.A0R;
        this.A0C = new AnonymousClass32A(r7, userSession, r1);
        this.A0B = 1OP.A02(r7, this.A07, (String) null);
        C52975GgS ggS = this.A04;
        if (ggS != null) {
            int hashCode = AnonymousClass7TF.A0b().hashCode();
            UserSession userSession2 = ggS.A01;
            02m r4 = 02m.A0p;
            r4.markerStart(17629205, hashCode);
            r4.markerAnnotate(17629205, hashCode, "effect_id", string);
            C51971G9r.A0T(ggS, new C58027IkK(new AnonymousClass05E(new MFg(userSession2, string, (AnonymousClass4D7) null, hashCode)), 0)).A06(getViewLifecycleOwner(), new IHH(this, 1));
        }
        AnonymousClass0fU.A00(new IB2(string, this, 4), this.mEffectThumbnail);
        EffectsPageModel effectsPageModel4 = this.A03;
        if (effectsPageModel4 == null || effectsPageModel4.A0C == null) {
            string = null;
        } else {
            float dimension = DbV.A05(this).getDimension(R.dimen.action_bar_immersive_gradient_height);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dimension / 2.0f);
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, -8355712);
            this.mEffectThumbnail.setBackground(gradientDrawable);
        }
        UserSession userSession3 = this.A07;
        long id = (long) this.mContainer.getId();
        1Xj r42 = this.A08;
        String str2 = this.A0H;
        String str3 = this.A0F;
        String str4 = this.A0K;
        0qQ.A0B(userSession3, 0);
        0qQ.A0B(r7, 1);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession3), "instagram_organic_effect_page_impression");
        if (A0e.isSampled() && r42 != null) {
            DbW.A16(A0e, r7);
            String str5 = str2;
            if (str2 == null) {
                str5 = "";
            }
            C51965G9l.A1P(A0e, str5);
            C51965G9l.A1C(C54689HOu.A0D, A0e);
            if (str4 == null) {
                str4 = "";
            }
            C51965G9l.A1N(A0e, str4);
            C51970G9q.A1A(A0e, id);
            if (str3 == null) {
                A002 = null;
            } else {
                A002 = C263944Ny.A00(str3);
            }
            A0e.AAE(A002, "media_author_id");
            if (str2 != null) {
                j = null;
                try {
                    j = DbV.A0q(str2);
                } catch (NumberFormatException unused) {
                }
            } else {
                j = -1L;
            }
            C51965G9l.A1E(A0e, j);
            C51970G9q.A19(A0e, 0);
            C51965G9l.A1O(A0e, userSession3.A05);
            A0e.AAJ("viewer_init_media_compound_key", r42.getId());
            C51972G9s.A15(A0e, r42);
            C51973G9u.A14(A0e, "ranking_info_token", DbT.A0x(r42));
            A0e.AAJ("creative_tool_id", string);
            A0e.Cgf();
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    private void A02(C59564JOk jOk, String str) {
        C320416sL r2;
        0gy A002 = AnonymousClass07i.A00(this);
        EffectsPageModel effectsPageModel = this.A03;
        if (effectsPageModel == null || effectsPageModel.A0C == null) {
            Context requireContext = requireContext();
            UserSession userSession = this.A07;
            AnonymousClass4DU r6 = this.A0R;
            boolean A1Y = DbY.A1Y(0Tu.A05, userSession, 36328229254085728L);
            AnonymousClass7TG.A1Q(userSession, r6);
            r2 = new C320416sL(requireContext, A002, new IMZ(str, 0, A1Y), r6, userSession);
        } else {
            Context requireContext2 = requireContext();
            UserSession userSession2 = this.A07;
            AnonymousClass4DU r62 = this.A0R;
            boolean A1Y2 = DbY.A1Y(0Tu.A05, userSession2, 36328229254085728L);
            AnonymousClass7TG.A1Q(userSession2, r62);
            0qQ.A0B(A002, 5);
            r2 = new C320416sL(requireContext2, A002, new IMF(str, A1Y2), r62, userSession2);
        }
        this.A06 = r2;
        r2.A03(new C52280GLw(1, this, jOk));
        this.A06.A04((Long) null, (String) null, Collections.emptyList(), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r1 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r2.getClass()
            r0 = 2131961556(0x7f1326d4, float:1.9559812E38)
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
            r1 = 1
            r4.Eu4(r1)
            r0 = 0
            r4.setIsLoading(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            if (r0 != 0) goto L_0x0021
            r4.setIsLoading(r1)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Integer r0 = r0.A07
            if (r0 == 0) goto L_0x0030
            int r0 = r0.intValue()
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
        L_0x0030:
            com.instagram.common.session.UserSession r0 = r3.A07
            java.lang.String r1 = r0.A06
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = r3.A03
            java.lang.String r0 = r2.A09
            boolean r1 = r1.equals(r0)
            boolean r0 = r2.A0H
            if (r1 != 0) goto L_0x0020
            if (r0 == 0) goto L_0x0020
            X.3JR r2 = X.DbS.A0K()
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00a7
            java.lang.Integer r0 = X.AnonymousClass05K.A06
        L_0x004e:
            r2.A02(r0)
            r1 = 65
            X.ID1 r0 = new X.ID1
            r0.<init>((instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r3, (int) r1)
            r2.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            android.view.View r2 = r4.A8p(r0)
            r3.mSaveButton = r2
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            if (r0 == 0) goto L_0x006f
            boolean r1 = r0.A01
            r0 = 8
            if (r1 == 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r2.setVisibility(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0093
            X.3JR r2 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r2.A02(r0)
            r1 = 66
            X.ID1 r0 = new X.ID1
            r0.<init>((instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment) r3, (int) r1)
            r2.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r2)
            r4.A8p(r0)
        L_0x0093:
            X.3JR r2 = X.DbS.A0K()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r2.A02(r0)
            r1 = 25
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.DbX.A19(r0, r2, r4)
            return
        L_0x00a7:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.configureActionBar(X.2da):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            FG7.A01(requireContext(), this.A07);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1999020552);
        0xY AR4 = GGQ.A00(this.A07).A05.AR4();
        AR4.E5c("LAST_OPENED_EFFECT_PAGE_TIMESTAMP_KEY", System.currentTimeMillis());
        AR4.apply();
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_clips_pivot_page_fragment);
        AnonymousClass0fD.A09(-2009965957, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1512159106);
        super.onDestroy();
        this.A0E.A0I.unregisterAdapterDataObserver(this.A0S);
        AnonymousClass0fD.A09(-1503666120, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1485900533);
        super.onDestroyView();
        this.mClipsRecyclerView.A0b();
        this.A06.A02.A02.clear();
        EffectsPageFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-1867227619, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1673094477);
        EffectsPageFragment.super.onPause();
        AnonymousClass0fD.A09(1329382488, A022);
    }
}
