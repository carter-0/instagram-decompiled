package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.friendmap.view.fragment.FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig;

public final class NJF extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "FriendMapFloatyClusterFragment";
    public CardView A00;
    public RecyclerView A01;
    public AnonymousClass2t9 A02;
    public IgTextView A03;
    public FriendMapAnimatedLikeView A04;
    public OHU A05;
    public ConstraintLayout A06;
    public 2el A07;
    public C58045Ikd A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);
    public final AnonymousClass0eM A0G;
    public final String A0H;

    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        if ((view2 instanceof FrameLayout) && (frameLayout = (FrameLayout) view2) != null) {
            RecyclerView A0I = DbT.A0I(requireView(), R.id.cluster_notes_recycler_view);
            this.A01 = A0I;
            if (A0I != null) {
                A0I.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
                AnonymousClass2tC r5 = new AnonymousClass2tC(getLayoutInflater());
                AnonymousClass0eM r6 = this.A0F;
                AnonymousClass2t9 A0U = DbU.A0U(r5, new NQC(AnonymousClass7TE.A0l(r6), (C72369P3i) this.A0B.getValue(), this));
                this.A02 = A0U;
                RecyclerView recyclerView = this.A01;
                if (recyclerView != null) {
                    recyclerView.setAdapter(A0U);
                    this.A07 = 2el.A00();
                    C58045Ikd ikd = new C58045Ikd(frameLayout, this, AnonymousClass7TE.A0l(r6), C229632nm.A05(new 2HY(0, 10), DbS.A04(0Tu.A05, AnonymousClass7TF.A0L(r6, 0), 36603244603118480L)));
                    this.A08 = ikd;
                    registerLifecycleListener(ikd);
                    UserSession A0l = AnonymousClass7TE.A0l(r6);
                    2el r11 = this.A07;
                    String str = "viewPointManager";
                    if (r11 != null) {
                        C58045Ikd ikd2 = this.A08;
                        if (ikd2 == null) {
                            str = "annotationPlaybackManager";
                        } else {
                            RecyclerView recyclerView2 = this.A01;
                            if (recyclerView2 == null) {
                                str = "notesRecyclerView";
                            } else {
                                this.A05 = new OHU(recyclerView2, A0l, r11, (C71144Ody) this.A0A.getValue(), ikd2);
                                View A0B2 = C66583MXo.A0B(this, R.id.cluster_location_pill_card);
                                CardView cardView = (CardView) A0B2;
                                int A012 = 2db.A01(requireActivity());
                                0qQ.A0B(cardView, 0);
                                0nA.A0e(cardView, A012 + 0nA.A0C(cardView));
                                0qQ.A07(A0B2);
                                this.A00 = cardView;
                                this.A03 = C66584MXp.A0A(this, R.id.cluster_location_pill_text);
                                this.A04 = (FriendMapAnimatedLikeView) C66584MXp.A0A(this, R.id.floaty_cluster_animated_like_view);
                                this.A06 = (ConstraintLayout) C66584MXp.A0A(this, R.id.cluster_root_view);
                                Drawable A0D2 = JTO.A0D(this.A09);
                                if (A0D2 != null) {
                                    ConstraintLayout constraintLayout = this.A06;
                                    if (constraintLayout != null) {
                                        constraintLayout.setBackground(A0D2);
                                    }
                                    0qQ.A0F("rootView");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                ConstraintLayout constraintLayout2 = this.A06;
                                if (constraintLayout2 != null) {
                                    constraintLayout2.setBackgroundColor(0nH.A07(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background), 0.5f));
                                }
                                0qQ.A0F("rootView");
                                throw AnonymousClass00P.createAndThrow();
                                07U r13 = 07U.A05;
                                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                                AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r13, this, (AnonymousClass4D7) null, 31), AnonymousClass07a.A00(viewLifecycleOwner));
                                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view2.findViewById(R.id.cluster_close_button);
                                0qQ.A0A(igSimpleImageView);
                                int A013 = 2db.A01(requireActivity());
                                0qQ.A0B(igSimpleImageView, 0);
                                0nA.A0e(igSimpleImageView, A013);
                                C67587MqL.A07(igSimpleImageView, R.drawable.instagram_x_pano_outline_24);
                                C71402Ok1.A00(igSimpleImageView, 58, this);
                                C71402Ok1.A00(view2, 59, this);
                                2el r0 = this.A07;
                                if (r0 != null) {
                                    Dba.A0z(view2, r0, this);
                                    return;
                                }
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("notesRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final String getModuleName() {
        return this.A0H;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final boolean onBackPressed() {
        FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig = (FriendMapFloatyClusterFragment$FriendMapClusterLaunchConfig) this.A0D.getValue();
        if (friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig == null) {
            return false;
        }
        friendMapFloatyClusterFragment$FriendMapClusterLaunchConfig.A04.invoke();
        return false;
    }

    public NJF() {
        0Yh A0z = DbS.A0z(C69028NdD.class);
        this.A0C = DbS.A0I(C73905Plg.A00(this, 14), C73905Plg.A00(this, 15), new C58185Inp(16, (Object) null, this), A0z);
        C73905Plg A002 = C73905Plg.A00(this, 19);
        C73905Plg A003 = C73905Plg.A00(this, 16);
        0eO r2 = 0eO.A02;
        AnonymousClass0eM A004 = AnonymousClass0eN.A00(r2, C73905Plg.A00(A003, 17));
        this.A0G = DbS.A0I(C73905Plg.A00(A004, 18), A002, new C58185Inp(17, (Object) null, A004), DbS.A0z(NdA.class));
        this.A0D = AnonymousClass1YB.A00(C73905Plg.A00(this, 12));
        this.A09 = AnonymousClass1YB.A00(C73905Plg.A00(this, 9));
        this.A0A = AnonymousClass1YB.A00(C73905Plg.A00(this, 10));
        this.A0B = AnonymousClass0eN.A00(r2, C73905Plg.A00(this, 11));
        this.A0E = AnonymousClass1YB.A00(C73905Plg.A00(this, 13));
        this.A0H = "friend_map_cluster_bottom_sheet_fragment";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1088171033);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.friend_map_cluster_bottom_sheet, false);
        AnonymousClass0fD.A09(663406987, A022);
        return A0D2;
    }
}
