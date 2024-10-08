package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.instagram.android.R;
import com.instagram.api.schemas.ReelTappableObjectType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;

public final class K7T extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "TrendingPromptsFragment";
    public C66493MTw A00;
    public C60403Jkw A01;
    public SpinnerImageView A02;
    public RecyclerView A03;
    public C59725JVj A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "trending_prompts_page";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.A03 = A0K;
        String str = "recyclerView";
        if (A0K != null) {
            C60403Jkw jkw = this.A01;
            if (jkw == null) {
                str = "promptsAdapter";
            } else {
                A0K.setAdapter(jkw);
                RecyclerView recyclerView = this.A03;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        C60467Jlz.A00(recyclerView2, this, 10);
                        AnonymousClass0eM r3 = this.A06;
                        DbV.A1F(getViewLifecycleOwner(), ((C60151JgW) r3.getValue()).A00, MPA.A00(this, 43), 1);
                        2YL A0H = DbS.A0H(r3);
                        AnonymousClass7TE.A1Z(new MFT(A0H, (AnonymousClass4D7) null, 10), C318116oQ.A00(A0H));
                        AnonymousClass0eM r7 = this.A05;
                        27r A0g = C51971G9r.A0g(r7);
                        C59725JVj jVj = this.A04;
                        str = "cameraSurface";
                        if (jVj != null) {
                            0Aj A0e = AnonymousClass7TE.A0e(A0g.A01, "ig_camera_sticker_aggregation_page_impression");
                            AnonymousClass283 r2 = A0g.A04;
                            String str2 = r2.A0L;
                            if (!(!A0e.isSampled() || A0g.A0J() == null || str2 == null)) {
                                AnonymousClass7TH.A0W(A0e, A0g);
                                JTO.A1S(A0e, str2);
                                AnonymousClass7TH.A0U(A0e);
                                A0e.AAJ("sticker_id", ReelTappableObjectType.A0e.A00);
                                AnonymousClass7TE.A1W(A0e, "entity_type", 21);
                                C51965G9l.A1A(jVj, A0e);
                                JTS.A19(A0e, r2);
                                AnonymousClass7TH.A0V(A0e);
                            }
                            27r A0g2 = C51971G9r.A0g(r7);
                            C59725JVj jVj2 = this.A04;
                            if (jVj2 != null) {
                                0Aj A0e2 = AnonymousClass7TE.A0e(A0g2.A01, "ig_camera_sticker_page_impression");
                                AnonymousClass283 r22 = A0g2.A04;
                                String str3 = r22.A0L;
                                if (!(!A0e2.isSampled() || A0g2.A0J() == null || str3 == null)) {
                                    String str4 = null;
                                    if (jVj2 == C59725JVj.PRE_CAPTURE) {
                                        str4 = AnonymousClass000.A00(2807);
                                    } else if (jVj2 == C59725JVj.POST_CAPTURE) {
                                        str4 = "clips_postcapture_camera";
                                    }
                                    AnonymousClass7TH.A0W(A0e2, A0g2);
                                    JTO.A1S(A0e2, str3);
                                    if (str4 == null) {
                                        str4 = 27x.A08.getModuleName();
                                    }
                                    DbS.A1K(A0e2, str4);
                                    AnonymousClass7TE.A1W(A0e2, "entity_type", 21);
                                    C51965G9l.A1A(jVj2, A0e2);
                                    JTS.A19(A0e2, r22);
                                    AnonymousClass7TH.A0V(A0e2);
                                }
                                if (182.A06(0Tu.A05, DbT.A0X(r7), 36318922059815676L)) {
                                    View A0G = AnonymousClass7TF.A0G(view, R.id.use_in_camera_button_scene_root);
                                    A0G.setVisibility(0);
                                    View A0F = AnonymousClass7TF.A0F(A0G, R.id.use_in_camera_button);
                                    TextView A0R = AnonymousClass7TG.A0R(A0G, R.id.use_in_camera_label);
                                    ImageView A0J = DbX.A0J(A0G, R.id.use_in_camera_icon);
                                    A0F.setClickable(true);
                                    LY7.A00(A0F, 19, view, this);
                                    Context context = view.getContext();
                                    DbU.A11(context, A0F, R.drawable.use_in_camera_button_background_emphasized);
                                    DbT.A17(context, A0R, 2Yu.A0E(getContext()));
                                    A0R.setText(getText(2131952431));
                                    DbU.A14(context, A0J, 2Yu.A05(getContext()));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null || !JTP.A1Y(recyclerView)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K7T() {
        C73660PhZ phZ = new C73660PhZ(this, 7);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73660PhZ(new C73660PhZ(this, 4), 5));
        this.A06 = DbS.A0I(new C73660PhZ(A002, 6), phZ, new C73666Phf(28, (Object) null, A002), DbS.A0z(C60151JgW.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2054078175);
        K7T.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("TRENDING_PROMPTS_CAMERA_SURFACE_ARG");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
        this.A04 = (C59725JVj) serializable;
        AnonymousClass0fD.A09(-1523897053, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(2147325044);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_trending_prompts_fragment, viewGroup, false);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        C59725JVj jVj = this.A04;
        if (jVj == null) {
            str = "cameraSurface";
        } else {
            C66493MTw mTw = this.A00;
            if (mTw == null) {
                str = "promptsAdapterListener";
            } else {
                this.A01 = new C60403Jkw(requireContext, jVj, A0l, mTw);
                this.A02 = DbX.A0k(inflate);
                AnonymousClass0fD.A09(835804937, A022);
                return inflate;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
