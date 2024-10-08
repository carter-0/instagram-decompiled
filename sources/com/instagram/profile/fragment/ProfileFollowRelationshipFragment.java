package com.instagram.profile.fragment;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass32K;
import X.AnonymousClass37D;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C2355930l;
import X.C252063oV;
import X.C273494mf;
import X.C273654mx;
import X.C2808154f;
import X.C358248ab;
import X.C46448DfA;
import X.C51028FnK;
import X.C51255FrA;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.E98;
import X.EVS;
import X.FmJ;
import X.G6T;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.user.model.User;

public final class ProfileFollowRelationshipFragment extends AnonymousClass4DH implements C273494mf, AnonymousClass32K, G6T {
    public C51028FnK A00;
    public C2355930l A01;
    public User A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final String A06 = "following_sheet";
    public RecyclerView recyclerView;

    public final C358248ab ALt(C358248ab r2) {
        0qQ.A0B(r2, 0);
        r2.A0l(this, DbT.A0X(this.A05));
        return r2;
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.07Z, com.instagram.profile.fragment.ProfileFollowRelationshipFragment, androidx.fragment.app.Fragment, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        RecyclerView A0I = DbT.A0I(view2, R.id.profile_follow_rv);
        0qQ.A0B(A0I, 0);
        this.recyclerView = A0I;
        DbY.A15(this, A0I);
        if (this.A00 != null) {
            Context requireContext = requireContext();
            User user = this.A02;
            if (user == null) {
                str = "displayedUser";
            } else {
                C51028FnK fnK = this.A00;
                str = "delegate";
                if (fnK != null) {
                    C2355930l r6 = this.A01;
                    if (r6 == null) {
                        str = "closeFriendsController";
                    } else {
                        C51028FnK fnK2 = fnK;
                        E98 e98 = new E98(requireContext, AnonymousClass07i.A00(this), r6, this, AnonymousClass7TE.A0l(this.A05), fnK, this, fnK2, user, this.A03, this.A04);
                        RecyclerView recyclerView2 = this.recyclerView;
                        if (recyclerView2 != null) {
                            recyclerView2.setAdapter(e98);
                            e98.clear();
                            e98.addModel(e98.A01, (Object) null, e98.A00);
                            e98.notifyDataSetChanged();
                            return;
                        }
                        str = "recyclerView";
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void CtJ(C46448DfA dfA) {
        AnonymousClass37D A0i;
        C51255FrA frA = new C51255FrA(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null) {
            DbU.A1U(new FmJ(3, A0i, frA), A0i, A0i);
        }
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

    public final String getModuleName() {
        return this.A06;
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
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            return C2808154f.A05(recyclerView2);
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1819302910);
        ProfileFollowRelationshipFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(C273654mx.A00(493));
        this.A04 = requireArguments.getBoolean("ProfileFollowRelationShipFragment.ARG_IS_IGTV_PROFILE");
        this.A03 = requireArguments.getString(C273654mx.A00(492));
        AnonymousClass0eM r1 = this.A05;
        User A0j = DbV.A0j(AnonymousClass7TE.A0l(r1), string);
        if (A0j != null) {
            this.A02 = A0j;
            this.A01 = new C2355930l(requireActivity(), AnonymousClass7TE.A0l(r1));
            AnonymousClass0fD.A09(-1450199013, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1595881722, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1236451583);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_relationship_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1381386518, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1117873501);
        super.onDestroyView();
        this.recyclerView = null;
        AnonymousClass0fD.A09(1212011419, A022);
    }
}
