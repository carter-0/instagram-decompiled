package com.instagram.archive.fragment;

import X.1NY;
import X.1OC;
import X.2Rw;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass2t9;
import X.AnonymousClass328;
import X.AnonymousClass32A;
import X.AnonymousClass32D;
import X.AnonymousClass3BQ;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass7TF;
import X.C14909UEo;
import X.C15621Ufn;
import X.C15768UiD;
import X.C16160Upl;
import X.C18130Vly;
import X.C273374mT;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.UX0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Collections;
import java.util.List;

public class ArchiveReelPeopleFragment extends C273374mT implements AnonymousClass4DR, AnonymousClass4DS {
    public AnonymousClass2t9 A00;
    public boolean A01;
    public boolean A02;
    public AnonymousClass32A A03;
    public String A04;
    public GridLayoutManager mLayoutManager;
    public View mLoadingSpinner;
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "calendar_archive";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public static void A00(ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        View view = archiveReelPeopleFragment.mLoadingSpinner;
        if (view != null && archiveReelPeopleFragment.mRecyclerView != null) {
            if (archiveReelPeopleFragment.A01) {
                view.setVisibility(0);
                archiveReelPeopleFragment.mRecyclerView.setVisibility(8);
                return;
            }
            view.setVisibility(8);
            archiveReelPeopleFragment.mRecyclerView.setVisibility(0);
        }
    }

    public static void A01(ArchiveReelPeopleFragment archiveReelPeopleFragment, C14909UEo uEo, Reel reel) {
        if (archiveReelPeopleFragment.A03 == null) {
            archiveReelPeopleFragment.A03 = new AnonymousClass32A(archiveReelPeopleFragment, archiveReelPeopleFragment.getSession(), new AnonymousClass328(archiveReelPeopleFragment));
        }
        List singletonList = Collections.singletonList(reel);
        AnonymousClass32A r2 = archiveReelPeopleFragment.A03;
        r2.A0C = archiveReelPeopleFragment.A04;
        AnonymousClass32D r1 = new AnonymousClass32D();
        r1.A06 = false;
        r2.A03 = new ReelViewerConfig(r1);
        r2.A0D = archiveReelPeopleFragment.getSession().A06;
        r2.A05 = new C16160Upl(archiveReelPeopleFragment, 0);
        r2.A06(reel, AnonymousClass3BQ.CALENDAR, uEo, singletonList, singletonList, 0);
    }

    public final void configureActionBar(2da r2) {
        r2.Eom(2131969335);
        r2.Eu4(AnonymousClass7TF.A1R(getParentFragmentManager().A0M()));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1520477185);
        ArchiveReelPeopleFragment.super.onCreate(bundle);
        this.A04 = AnonymousClass7TF.A0b();
        this.A00 = DbU.A0U(DbV.A0S(this), new C15768UiD(this, this));
        1NY A0M = DbZ.A0M(getSession());
        A0M.A0A("archive/reel/friends_with_history/");
        1OC A0S = DbU.A0S(A0M, UX0.class, C18130Vly.class);
        C15621Ufn.A00(A0S, this, 1);
        schedule(A0S);
        AnonymousClass0fD.A09(1466135547, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1108266523);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_people);
        AnonymousClass0fD.A09(566371820, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(671410285);
        super.onDestroyView();
        this.mRecyclerView.setAdapter((2Rw) null);
        ArchiveReelPeopleFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(895487777, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(925330512);
        ArchiveReelPeopleFragment.super.onStart();
        DbZ.A1P(this, 8);
        AnonymousClass0fD.A09(-1497138575, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-2008998280);
        ArchiveReelPeopleFragment.super.onStop();
        DbZ.A1P(this, 0);
        AnonymousClass0fD.A09(-699461300, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingSpinner = view.requireViewById(R.id.loading_spinner);
        RecyclerView A0K = DbX.A0K(view);
        this.mRecyclerView = A0K;
        A0K.setAdapter(this.A00);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        this.mLayoutManager = gridLayoutManager;
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        A00(this);
    }
}
