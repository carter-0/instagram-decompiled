package com.instagram.wellbeing.fundraiser.coverphotopicker;

import X.0cp;
import X.1FR;
import X.1Xj;
import X.AnonymousClass0fD;
import X.AnonymousClass1Xq;
import X.AnonymousClass32J;
import X.AnonymousClass6QE;
import X.AnonymousClass6QJ;
import X.C15485Uda;
import X.C228312lJ;
import X.C228602lw;
import X.C273374mT;
import X.C277014uI;
import X.C294255m9;
import X.C294265mA;
import X.C299275ur;
import X.C307896Rx;
import X.C308276Tl;
import X.C321656uX;
import X.C3251771i;
import X.C3251871j;
import X.C46323Dbr;
import X.DbT;
import X.DbU;
import X.DbW;
import X.Dda;
import X.L9U;
import X.WWL;
import X.WZR;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager;

public class FundraiserPhotoPickerPostsTabFragment extends C273374mT implements AnonymousClass32J {
    public L9U A00;
    public C321656uX A01;
    public C15485Uda A02;
    public RecyclerView mRecyclerView;

    public final boolean DII(MotionEvent motionEvent, View view, AnonymousClass1Xq r4, int i) {
        return false;
    }

    public final String getModuleName() {
        return "fundraiser_photo_picker_posts_tab";
    }

    public static void A00(FundraiserPhotoPickerPostsTabFragment fundraiserPhotoPickerPostsTabFragment, boolean z) {
        C321656uX r1 = fundraiserPhotoPickerPostsTabFragment.A01;
        if (r1 != null && !r1.A02()) {
            boolean z2 = z;
            if (z || r1.A03.A05()) {
                fundraiserPhotoPickerPostsTabFragment.A01.A00((1FR) null, new C46323Dbr(fundraiserPhotoPickerPostsTabFragment.getSession().A06), z2, true, true, false);
            }
        }
    }

    public final void DIH(View view, 1Xj r6, int i) {
        L9U l9u = this.A00;
        if (l9u != null) {
            l9u.A02.A0c();
            String A35 = r6.A35(l9u.A01);
            if (A35 != null) {
                AnonymousClass6QE r0 = AnonymousClass6QE.A02;
                A35 = AnonymousClass6QJ.A00(0cp.A03(A35)).toString();
            }
            C307896Rx r3 = l9u.A03;
            C277014uI r2 = l9u.A04;
            C308276Tl A0T = DbU.A0T(A35);
            A0T.A02(r6.A2n());
            C299275ur.A00(r3, A0T.A00(), r2);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4mT, com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerPostsTabFragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1712057436);
        FundraiserPhotoPickerPostsTabFragment.super.onCreate(bundle);
        Context requireContext = requireContext();
        UserSession session = getSession();
        C228602lw A0Q = DbW.A0Q(requireContext(), this);
        WZR wzr = new WZR(this);
        C294265mA r8 = C294255m9.A09.A00;
        DbW.A1N(session, 2, r8);
        this.A01 = new C321656uX(requireContext, session, A0Q, (C228312lJ) null, wzr, r8, (Dda) null, (String) null, false);
        AnonymousClass0fD.A09(-1900491831, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1376551888);
        this.A02 = new C15485Uda(requireContext(), this, getSession(), this);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker_tab);
        AnonymousClass0fD.A09(-975114133, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = DbT.A0I(view, 16908298);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(requireContext());
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A02);
        this.mRecyclerView.A15(new C3251871j(fastScrollingLinearLayoutManager, new WWL(this, 14), C3251771i.A06, false, false));
        A00(this, true);
    }
}
