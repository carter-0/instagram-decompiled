package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class E7X extends MYR implements AnonymousClass4DR, G84, AnonymousClass4DS, C51872G5j {
    public static final String __redex_internal_original_name = "CreatorMessagingSelectionScreenFragment";
    public int A00;
    public IgTextView A01;
    public C48178EaK A02;
    public SpinnerImageView A03;
    public String A04;
    public ArrayList A05;
    public List A06;
    public List A07;
    public Map A08;
    public boolean A09;
    public boolean A0A;
    public C254793t3 A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public final C49729F3u A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I = Dbl.A00(this, 5);
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;

    public final void D1T() {
        this.A09 = false;
        A01(this);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle requireArguments = requireArguments();
        this.A0B = (C254793t3) AnonymousClass9H0.A00(requireArguments, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        this.A0C = requireArguments.getString("thread_v2_id");
        this.A0A = AnonymousClass7TF.A1V(this.A0B);
        this.A0D = requireArguments.getStringArrayList("excluded_ids");
        this.A05 = requireArguments.getParcelableArrayList("existing_thread_members");
        this.A0E = requireArguments.getBoolean("has_epd_restricted_members");
        boolean z = this.A0A;
        int i2 = R.id.recipients_bar;
        if (z) {
            i2 = R.id.add_people_recipients_bar;
        }
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view2, i2);
        C49729F3u f3u = this.A0F;
        AnonymousClass0eM r6 = this.A0J;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        C254793t3 r8 = this.A0B;
        String str = this.A0C;
        List list = this.A0D;
        ArrayList arrayList = this.A05;
        boolean z2 = this.A0E;
        0qQ.A0B(A0l, 1);
        f3u.A00 = DbT.A06(this, viewGroup, 3);
        f3u.A01 = A0l;
        f3u.A02 = this;
        f3u.A07 = AnonymousClass7TF.A1V(r8);
        f3u.A05 = list;
        f3u.A04 = new C49916FEq(viewGroup, A0l, f3u.A08);
        if (r8 != null) {
            AnonymousClass7ZA A002 = C69942Nui.A00(A0l, r8);
            C67089Mi7 A003 = C67089Mi7.A00(A0l, false);
            A003.A04(2);
            if (arrayList != null) {
                String str2 = str;
                C254793t3 r17 = r8;
                C67089Mi7 mi7 = A003;
                f3u.A03 = new FBR(this, A0l, A002, mi7, r17, C67350MmR.DEFAULT, str2, arrayList, 28, 2, false, false, z2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A03 = DbX.A0k(view2);
        0lg A0L2 = AnonymousClass7TF.A0L(r6, 0);
        0Tu r5 = 0Tu.A06;
        if (182.A06(r5, A0L2, 36320309334515934L)) {
            i = 2131957138;
        } else {
            i = 2131957136;
            if (182.A06(r5, AnonymousClass7TF.A0L(r6, 0), 36320309334384860L)) {
                i = 2131957137;
            }
        }
        IgTextView A0a = DbT.A0a(view2, R.id.text_banner);
        DbU.A1G(A0a, this, i);
        this.A01 = A0a;
        07U r62 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r62, this, (AnonymousClass4D7) null, 29), AnonymousClass07a.A00(viewLifecycleOwner));
        getRecyclerView().A15(new C3251871j(getRecyclerView().A0D, new C50436Fbj(this, 0), C3251771i.A0A, false, false));
        SpinnerImageView spinnerImageView = this.A03;
        if (spinnerImageView == null) {
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        DbS.A1T(spinnerImageView);
        ((C47869EKp) this.A0L.getValue()).A03(true, (String) null);
    }

    public static final void A00(FanClubCategoryType fanClubCategoryType, E7X e7x, String str) {
        C48147EZp eZp;
        Serializable serializable;
        C50337FYu fYu = (C50337FYu) e7x.A0I.getValue();
        int ordinal = fanClubCategoryType.ordinal();
        if (ordinal == 3) {
            eZp = C48147EZp.MOST_RECENT_SUGGESTED_CATEGORY_ITEM;
        } else if (ordinal != 2) {
            if (ordinal == 1) {
                eZp = C48147EZp.LEAST_INTERACTED_SUGGESTED_CATEGORY_ITEM;
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putParcelable("fan_club_category_type", fanClubCategoryType);
            A0a.putString("fan_club_category_name", str);
            Bundle bundle = e7x.mArguments;
            if (!(bundle == null || (serializable = bundle.getSerializable("entrypoint")) == null)) {
                A0a.putSerializable("entrypoint", serializable);
            }
            C309516Yo A0N = DbX.A0N(e7x.requireActivity(), e7x.A0J);
            A0N.A0B(A0a, new E7W());
            A0N.A04();
        } else {
            eZp = C48147EZp.MOST_INTERACTED_SUGGESTED_CATEGORY_ITEM;
        }
        C50337FYu.A01(eZp, C48146EZo.NEW_SUBSCRIBER_CHAT, fYu, "chat_creation_sheet_rendered", "tap", (Map) null);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putParcelable("fan_club_category_type", fanClubCategoryType);
        A0a2.putString("fan_club_category_name", str);
        Bundle bundle2 = e7x.mArguments;
        A0a2.putSerializable("entrypoint", serializable);
        C309516Yo A0N2 = DbX.A0N(e7x.requireActivity(), e7x.A0J);
        A0N2.A0B(A0a2, new E7W());
        A0N2.A04();
    }

    public static final void A01(E7X e7x) {
        SpinnerImageView spinnerImageView;
        C255943uy r0;
        boolean z = e7x.A09;
        Window A0G2 = DbV.A0G(e7x);
        if (z) {
            A0G2.addFlags(16);
            spinnerImageView = e7x.A03;
            if (spinnerImageView != null) {
                r0 = C255943uy.LOADING;
            }
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        A0G2.clearFlags(16);
        spinnerImageView = e7x.A03;
        if (spinnerImageView != null) {
            r0 = C255943uy.SUCCESS;
        }
        0qQ.A0F("spinner");
        throw AnonymousClass00P.createAndThrow();
        spinnerImageView.setLoadingStatus(r0);
        0qQ.A0C(e7x.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Dbb.A0v(e7x);
    }

    public final void D1J(FanClubCategoryType fanClubCategoryType, String str) {
        if (!this.A08.isEmpty()) {
            this.A0F.A03(new C50018FJd((Object) fanClubCategoryType, (Object) this, str, 2), C50023FJi.A00(this, 33));
        } else {
            A00(fanClubCategoryType, this, str);
        }
    }

    public final void FJC() {
        ((C46776Dl3) this.A0L.getValue()).A01();
    }

    public final void FLR(User user) {
        int i;
        if (!this.A08.containsKey(user.getUsername())) {
            C49729F3u f3u = this.A0F;
            List list = f3u.A05;
            if (list == null || (i = DbT.A02(list, 1)) < 0) {
                i = 0;
            }
            int size = i + f3u.A06.size();
            AnonymousClass0eM r3 = f3u.A09;
            if (size >= DbX.A07(r3)) {
                C358248ab A0U = DbW.A0U(this);
                A0U.A09(2131957116);
                A0U.A0q(DbV.A0z(this, Integer.valueOf(DbX.A07(r3)), 2131957115));
                A0U.A0H(C50023FJi.A00(this, 34), 2131968772);
                DbT.A1V(A0U);
                return;
            }
        }
        ((C46776Dl3) this.A0L.getValue()).A02(user);
        this.A0F.A06(this.A08, true);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new Object(), new C47784EGv(this), new EHA(this, AnonymousClass7TE.A0l(this.A0J), this.A0F), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3E.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0J);
    }

    public final boolean onBackPressed() {
        if (this.A0A || !(!this.A08.isEmpty())) {
            return false;
        }
        this.A0F.A03(C50023FJi.A00(this, 31), C50023FJi.A00(this, 32));
        return true;
    }

    public final void onSearchTextChanged(String str) {
        this.A04 = str;
        ((C47869EKp) this.A0L.getValue()).A03(true, this.A04);
    }

    public E7X() {
        Dbl dbl = new Dbl(this, 9);
        Dbl dbl2 = new Dbl(this, 6);
        0eO r5 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r5, new Dbl(dbl2, 7));
        this.A0L = DbS.A0I(new Dbl(A002, 8), dbl, new C73664Phd(15, A002, (Object) null), DbS.A0z(C47869EKp.class));
        this.A0H = AnonymousClass0eN.A00(r5, new C51675Fyb(this));
        this.A0G = AnonymousClass0eN.A00(r5, new C51676Fyc(this));
        this.A0K = AnonymousClass0eN.A00(r5, new C51677Fyd(this));
        this.A0F = new C49729F3u();
        this.A07 = AnonymousClass7TE.A1C();
        this.A08 = AnonymousClass7TE.A1H();
        this.A02 = C47868EKo.A00;
        this.A0J = C227642jf.A02(this);
    }

    public final void Dbu() {
        String str;
        0qQ.A0C(getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Dbb.A0v(this);
        if (!this.A07.isEmpty() || (!((str = this.A04) == null || str.length() == 0) || 0qQ.A0K(this.A02, C47867EKn.A00))) {
            this.A0F.A02();
            return;
        }
        C49916FEq fEq = this.A0F.A04;
        if (fEq == null) {
            0qQ.A0F("recipientsBarController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass7TH.A0R(fEq.A00);
        }
    }

    public final void configureActionBar(2da r3) {
        int i;
        int i2;
        Dbb.A1I(r3);
        boolean z = this.A0A;
        Resources A052 = DbV.A05(this);
        if (z) {
            r3.setTitle(A052.getString(2131957128));
            if (!this.A08.isEmpty()) {
                i = 2131957126;
                i2 = 4;
            } else {
                return;
            }
        } else {
            r3.setTitle(A052.getString(2131957110));
            if (this.A08.size() < 2 || this.A09) {
                r3.AA6(2131957106);
                return;
            } else {
                i = 2131957106;
                i2 = 5;
            }
        }
        r3.AA9(FPI.A00(this, i2), i);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(10353221);
        super.onDestroy();
        FBR fbr = this.A0F.A03;
        if (fbr != null) {
            fbr.A04.A01();
        }
        AnonymousClass0fD.A09(-1844037793, A022);
    }
}
