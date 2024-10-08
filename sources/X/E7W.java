package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class E7W extends MYR implements AnonymousClass4DR, G84, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorMessagingCategorySelectionScreenFragment";
    public int A00;
    public FanClubCategoryType A01;
    public IgTextView A02;
    public C48178EaK A03 = C47868EKo.A00;
    public SpinnerImageView A04;
    public String A05;
    public String A06;
    public List A07 = AnonymousClass7TE.A1C();
    public Map A08 = AnonymousClass7TE.A1H();
    public boolean A09;
    public boolean A0A;
    public final C49729F3u A0B = new C49729F3u();
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = AnonymousClass1YB.A00(new GW6(this, 48));
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;

    public final void D1T() {
        this.A09 = false;
        A00(this);
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        String str = this.A05;
        if (str == null) {
            0qQ.A0F("categoryName");
            throw AnonymousClass00P.createAndThrow();
        }
        DbW.A1C(r4, str);
        if (this.A08.size() < 2 || this.A09) {
            r4.AA6(2131957106);
        } else {
            r4.AA9(FPI.A00(this, 2), 2131957106);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view, R.id.recipients_bar);
        C49729F3u f3u = this.A0B;
        AnonymousClass0eM r1 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        AnonymousClass7TG.A1P(A0l, viewGroup);
        f3u.A00 = requireContext();
        f3u.A01 = A0l;
        f3u.A02 = this;
        f3u.A07 = false;
        f3u.A05 = null;
        f3u.A04 = new C49916FEq(viewGroup, A0l, f3u.A08);
        this.A04 = DbX.A0k(view);
        this.A02 = DbT.A0a(view, R.id.text_banner);
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r9, this, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner));
        SpinnerImageView spinnerImageView = this.A04;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            DbS.A1T(spinnerImageView);
            C47870EKq eKq = (C47870EKq) this.A0I.getValue();
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                str = "categoryType";
            } else {
                eKq.A03(fanClubCategoryType, false, 182.A06(0Tu.A06, AnonymousClass7TF.A0L(r1, 0), 36320309334384860L));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(E7W e7w) {
        SpinnerImageView spinnerImageView;
        C255943uy r0;
        boolean z = e7w.A09;
        Window A0G2 = DbV.A0G(e7w);
        if (z) {
            A0G2.addFlags(16);
            spinnerImageView = e7w.A04;
            if (spinnerImageView != null) {
                r0 = C255943uy.LOADING;
            }
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        A0G2.clearFlags(16);
        spinnerImageView = e7w.A04;
        if (spinnerImageView != null) {
            r0 = C255943uy.SUCCESS;
        }
        0qQ.A0F("spinner");
        throw AnonymousClass00P.createAndThrow();
        spinnerImageView.setLoadingStatus(r0);
        0qQ.A0C(e7w.getActivity(), "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Dbb.A0v(e7w);
    }

    public final void FJC() {
        C48146EZo eZo;
        ((C46776Dl3) this.A0I.getValue()).A01();
        if (!this.A0A) {
            C50337FYu fYu = (C50337FYu) this.A0F.getValue();
            FanClubCategoryType fanClubCategoryType = this.A01;
            if (fanClubCategoryType == null) {
                0qQ.A0F("categoryType");
                throw AnonymousClass00P.createAndThrow();
            }
            int ordinal = fanClubCategoryType.ordinal();
            if (ordinal == 3) {
                eZo = C48146EZo.MOST_RECENT_SUBSCRIBERS_LIST;
            } else if (ordinal != 2) {
                if (ordinal == 1) {
                    eZo = C48146EZo.LEAST_INTERACTED_SUBSCRIBERS_LIST;
                }
                this.A0A = true;
            } else {
                eZo = C48146EZo.MOST_INTERACTED_SUBSCRIBERS_LIST;
            }
            C50337FYu.A01(C48147EZp.UNSELECT_ALL_USERS_OPTION, eZo, fYu, "unselect_all", "tap", (Map) null);
            this.A0A = true;
        }
    }

    public final void FLR(User user) {
        ((C46776Dl3) this.A0I.getValue()).A02(user);
        this.A0B.A06(this.A08, true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new Object(), new EHA(this, AnonymousClass7TE.A0l(this.A0G), this.A0B), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3D.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean onBackPressed() {
        if (this.A08.size() == this.A00) {
            return false;
        }
        this.A0B.A03(C50023FJi.A00(this, 29), C50023FJi.A00(this, 30));
        return true;
    }

    public final void onSearchTextChanged(String str) {
        05G r5;
        ArrayList arrayList;
        this.A06 = str;
        C47870EKq eKq = (C47870EKq) this.A0I.getValue();
        String str2 = this.A06;
        05G r6 = eKq.A00;
        r6.Epw(C47867EKn.A00);
        FanClubMemberListCategoryRepository fanClubMemberListCategoryRepository = eKq.A01;
        if (str2 == null || str2.length() == 0) {
            r5 = fanClubMemberListCategoryRepository.A01;
            arrayList = null;
        } else {
            r5 = fanClubMemberListCategoryRepository.A01;
            arrayList = AnonymousClass7TE.A1C();
            for (Object next : (Iterable) fanClubMemberListCategoryRepository.A00.getValue()) {
                if (00p.A0k(((C61103JxE) ((C74527PwM) next)).A00.getUsername(), str2, false)) {
                    arrayList.add(next);
                }
            }
        }
        r5.Epw(arrayList);
        r6.Epw(C47866EKm.A00);
    }

    public E7W() {
        Dbl dbl = new Dbl(this, 2);
        GW6 gw6 = new GW6(this, 49);
        0eO r3 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new Dbl(gw6, 0));
        this.A0I = DbS.A0I(new Dbl(A002, 1), dbl, new C73664Phd(14, A002, (Object) null), DbS.A0z(C47870EKq.class));
        this.A0E = AnonymousClass0eN.A00(r3, new C58719IwS("unknown", this, "entrypoint", 48));
        this.A0D = AnonymousClass0eN.A00(r3, new C51672FyY(this));
        this.A0C = AnonymousClass0eN.A00(r3, new C51673FyZ(this));
        this.A0H = AnonymousClass0eN.A00(r3, new C51674Fya(this));
        this.A0G = C227642jf.A02(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (X.0qQ.A0K(r2.A03, X.C47867EKn.A00) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dbu() {
        /*
            r2 = this;
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r1, r0)
            X.Dbb.A0v(r2)
            java.util.List r0 = r2.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r2.A06
            if (r0 == 0) goto L_0x001e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0029
        L_0x001e:
            X.EaK r1 = r2.A03
            X.EKn r0 = X.C47867EKn.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.F3u r0 = r2.A0B
            if (r1 == 0) goto L_0x0042
            X.FEq r0 = r0.A04
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "recipientsBarController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            android.view.ViewGroup r0 = r0.A00
            X.AnonymousClass7TH.A0R(r0)
            return
        L_0x0042:
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7W.Dbu():void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-815028032);
        E7W.super.onCreate(bundle);
        this.A01 = (FanClubCategoryType) C320236s2.A00(requireArguments(), FanClubCategoryType.class, "fan_club_category_type");
        this.A05 = C320236s2.A01(requireArguments(), "fan_club_category_name");
        AnonymousClass0fD.A09(-547620466, A022);
    }
}
