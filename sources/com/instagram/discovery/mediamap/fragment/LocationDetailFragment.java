package com.instagram.discovery.mediamap.fragment;

import X.0Tu;
import X.0qQ;
import X.182;
import X.1Ln;
import X.1NY;
import X.1Ng;
import X.1OC;
import X.1OP;
import X.1P0;
import X.1vm;
import X.1vn;
import X.1wn;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass32A;
import X.AnonymousClass3BQ;
import X.AnonymousClass3KA;
import X.AnonymousClass3N3;
import X.AnonymousClass4DU;
import X.AnonymousClass71G;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13990Tnq;
import X.C14227TsA;
import X.C15293UZz;
import X.C15621Ufn;
import X.C15625Ufr;
import X.C15693Ugy;
import X.C16165Upq;
import X.C17427VVg;
import X.C17772Vfj;
import X.C17896Vhn;
import X.C18062Vko;
import X.C18198VnL;
import X.C18216Vng;
import X.C18231Vnv;
import X.C19026WHc;
import X.C19044WHw;
import X.C19221WQb;
import X.C19507Wat;
import X.C20901X3s;
import X.C20902X3t;
import X.C20903X3u;
import X.C20951X6e;
import X.C228602lw;
import X.C46474Dfc;
import X.C46548Dgp;
import X.C51973G9u;
import X.C57066INg;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbY;
import X.DbZ;
import X.Dba;
import X.UXH;
import X.VBY;
import X.VN7;
import X.VS5;
import X.W3Q;
import X.WQB;
import X.WQU;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LocationDetailFragment extends C15293UZz implements AnonymousClass4DU, AnonymousClass71G, C20901X3s, C20903X3u, C20902X3t {
    public float A00;
    public C15693Ugy A01;
    public MediaMapQuery A02;
    public MediaMapPin A03;
    public boolean A04;
    public boolean A05;
    public long A06;
    public AnonymousClass32A A07;
    public String A08;
    public final 1P0 A09 = new C15621Ufn(this, 29);
    public final 1wn A0A = new C19221WQb(this, 19);
    public final 1wn A0B = new WQU(this, 1);
    public final 1wn A0C = new C19221WQb(this, 18);
    public final C17772Vfj A0D = new C17772Vfj(this);
    public final VN7 A0E = new VN7(this);
    public C17427VVg mDirectionsBottomSheetController;
    public VS5 mLocationDetailRedesignExperimentHelper;

    public final void DRX(User user) {
    }

    public final String getModuleName() {
        return "discovery_map_location_detail";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A01() {
        LocationPageInformation locationPageInformation;
        User A002;
        MediaMapPin mediaMapPin = this.A03;
        if (mediaMapPin != null && (locationPageInformation = mediaMapPin.A06) != null && (A002 = locationPageInformation.A00()) != null) {
            AnonymousClass0eM r2 = this.A00;
            if (1OP.A05(AnonymousClass7TE.A0l(r2)).A0M(A002.getId()) == null || !this.A04) {
                1OC A003 = 1OP.A00(AnonymousClass7TE.A0l(r2), A002.getId());
                A003.A00 = this.A09;
                schedule(A003);
            }
        }
    }

    public static void A02(LocationDetailFragment locationDetailFragment) {
        VS5 vs5 = locationDetailFragment.mLocationDetailRedesignExperimentHelper;
        if (vs5 != null) {
            C20951X6e x6e = vs5.A00;
            if (x6e == null) {
                0qQ.A0F("locationDetailActionBarHelper");
                throw AnonymousClass00P.createAndThrow();
            } else {
                x6e.ADS();
            }
        }
    }

    public final float BbN() {
        return this.A00;
    }

    public final void D2y(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        A08(reel, AnonymousClass3BQ.MAP_BOTTOM_SHEET, new C19507Wat(gradientSpinnerAvatarView.A0K, gradientSpinnerAvatarView.A0O));
    }

    public final void DXG(MediaMapPin mediaMapPin) {
        this.A03 = mediaMapPin;
        this.A01.A02 = mediaMapPin;
        C20951X6e x6e = this.mLocationDetailRedesignExperimentHelper.A00;
        if (x6e == null) {
            0qQ.A0F("locationDetailActionBarHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0A(mediaMapPin);
        x6e.Ed7(mediaMapPin);
        if (isResumed()) {
            A02(this);
            C15693Ugy ugy = this.A01;
            LocationPageInformation locationPageInformation = ugy.A02.A06;
            if (!(locationPageInformation == null || locationPageInformation.A00() == null)) {
                if (182.A06(0Tu.A05, ugy.A0I, 36315821093424696L)) {
                    C15693Ugy ugy2 = this.A01;
                    C15693Ugy.A00(ugy2.A00, ugy2, ugy2.A0A);
                }
            }
            C14227TsA.A00(this.A01.A03);
            A01();
        }
    }

    public final void DwV(User user, int i) {
        User A002;
        LocationPageInformation locationPageInformation = this.A03.A06;
        if (locationPageInformation != null && (A002 = locationPageInformation.A00()) != null && getActivity() != null) {
            String id = A002.getId();
            UserSession A0l = AnonymousClass7TE.A0l(this.A00);
            FragmentActivity activity = getActivity();
            AnonymousClass7TG.A1O(A0l, activity);
            C46474Dfc A012 = C46548Dgp.A01(A0l, id, "hashtag_map", "discovery_map_location_detail");
            A012.A0O = null;
            DbY.A0u(activity, C51973G9u.A0A(A0l, A012), A0l, "profile");
        }
    }

    public final boolean onBackPressed() {
        this.A01.A04.A03();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.instagram.discovery.mediamap.fragment.LocationDetailFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.instagram.discovery.mediamap.fragment.LocationDetailFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: com.instagram.discovery.mediamap.fragment.LocationDetailFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.4DU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r8 = r19
            r1 = r20
            r0 = r21
            super.onViewCreated(r1, r0)
            X.2el r2 = X.2el.A00()
            X.3DZ r0 = X.AnonymousClass3DZ.A00(r8)
            r2.A06(r1, r0)
            androidx.fragment.app.Fragment r0 = r8.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            X.T6B r5 = r0.A03
            androidx.fragment.app.FragmentActivity r6 = r8.requireActivity()
            X.0eM r2 = r8.A00
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            X.0gy r7 = X.AnonymousClass07i.A00(r8)
            com.instagram.discovery.mediamap.model.MediaMapPin r15 = r8.A03
            android.content.Context r4 = r5.A02
            com.instagram.common.session.UserSession r3 = r5.A04
            java.lang.String r0 = "MEDIA_MAP"
            boolean r17 = X.1Wr.isLocationPermitted(r4, r3, r0)
            java.lang.String r0 = "LocationDetailFragment"
            android.location.Location r5 = r5.A00(r0)
            boolean r3 = r8.A05
            X.Vfj r10 = r8.A0D
            androidx.fragment.app.Fragment r0 = r8.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            X.WUF r14 = r0.A0G
            X.Ugy r4 = new X.Ugy
            r11 = r8
            r12 = r8
            r13 = r8
            r16 = r8
            r18 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r8.A01 = r4
            r8.A01()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            X.328 r3 = new X.328
            r3.<init>(r8)
            X.32A r0 = new X.32A
            r0.<init>(r8, r4, r3)
            r8.A07 = r0
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r6 = r8.A03
            androidx.fragment.app.Fragment r5 = r8.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r5 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r5
            androidx.fragment.app.Fragment r4 = r8.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r4 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r4
            boolean r3 = r8.A05
            X.VS5 r0 = new X.VS5
            r16 = r3
            r9 = r0
            r10 = r1
            r13 = r5
            r14 = r4
            r15 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.mLocationDetailRedesignExperimentHelper = r0
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            X.VN7 r3 = r8.A0E
            X.VVg r0 = new X.VVg
            r0.<init>(r4, r3)
            r8.mDirectionsBottomSheetController = r0
            A02(r8)
            androidx.fragment.app.Fragment r0 = r8.requireParentFragment()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r0
            X.Vko r3 = r0.A09
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r8.A03
            java.lang.String r0 = X.C18231Vnv.A01(r0)
            r3.A03(r8, r0)
            r0 = 5
            X.WBX.A00(r1, r0, r8)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.WQB> r1 = X.WQB.class
            X.1wn r0 = r8.A0C
            r3.A01(r0, r1)
            java.lang.Class<X.INg> r1 = X.C57066INg.class
            X.1wn r0 = r8.A0A
            r3.A01(r0, r1)
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00d9
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.3KA> r1 = X.AnonymousClass3KA.class
            X.1wn r0 = r8.A0B
            r2.A01(r0, r1)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.LocationDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void A08(Reel reel, AnonymousClass3BQ r7, AnonymousClass3N3 r8) {
        Dba.A0F(this).A09(this.A02, this.A03, "discovery_map_location_detail", false);
        AnonymousClass32A r2 = this.A07;
        C16165Upq.A00(requireActivity(), r8.AeG(), r2, this, 0);
        r2.A0C = this.A08;
        r2.A03(reel, r7, r8);
    }

    public final void DGM(User user, int i) {
        if (user.B6o() == FollowStatus.A05) {
            DbZ.A1a(this.A02, Dba.A0F(this), this.A03, AnonymousClass000.A00(3371));
        }
        C14227TsA.A00(this.A01.A03);
    }

    public final void DwW(View view, User user, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.UZz, androidx.fragment.app.Fragment, com.instagram.discovery.mediamap.fragment.LocationDetailFragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1854753781);
        LocationDetailFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = AnonymousClass7TF.A0b();
        Parcelable parcelable = requireArguments.getParcelable("arg_map_pins");
        parcelable.getClass();
        this.A03 = (MediaMapPin) parcelable;
        AnonymousClass0eM r6 = this.A00;
        this.A05 = 182.A06(0Tu.A06, AnonymousClass7TE.A0l(r6), 36315039409376203L);
        C18062Vko vko = requireParentFragment().A09;
        C17896Vhn vhn = requireParentFragment().A05;
        if (!(!this.A03.A0F || vko == null || vhn == null)) {
            UserSession A0l = AnonymousClass7TE.A0l(r6);
            C228602lw A0Q = DbW.A0Q(requireContext(), this);
            MediaMapPin mediaMapPin = this.A03;
            if (182.A06(0Tu.A05, A0l, 36319635024387628L)) {
                1vn A012 = 1vm.A01(A0l);
                PandoGraphQLRequest A002 = C18216Vng.A00(C18231Vnv.A01(mediaMapPin));
                A012.ATL(new C19026WHc(5), new C19044WHw(0, vhn, vko, mediaMapPin), A002);
            } else {
                List singletonList = Collections.singletonList(C18231Vnv.A01(mediaMapPin));
                C15625Ufr ufr = new C15625Ufr(13, vhn, vko, mediaMapPin);
                String A003 = VBY.A00(singletonList);
                if (A003 != null) {
                    1NY A0N = DbU.A0N(A0l);
                    A0N.A0A("map/location_details_many/");
                    A0N.A9m("location_ids", A003);
                    1OC A0N2 = DbY.A0N(A0N, UXH.class, C18198VnL.class);
                    A0N2.A00 = ufr;
                    A0Q.schedule(A0N2);
                }
            }
        }
        Parcelable parcelable2 = requireArguments.getParcelable("arg_query");
        parcelable2.getClass();
        this.A02 = (MediaMapQuery) parcelable2;
        this.A06 = System.currentTimeMillis();
        AnonymousClass0fD.A09(-296278886, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-83398273);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_location_detail);
        AnonymousClass0fD.A09(1449250355, A022);
        return A0C2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1544231551);
        super.onDestroy();
        W3Q A0F = Dba.A0F(this);
        MediaMapPin mediaMapPin = this.A03;
        MediaMapQuery mediaMapQuery = this.A02;
        1Ln A012 = W3Q.A01(A0F, "instagram_map_exit_location_page");
        C13990Tnq.A12(A012, mediaMapQuery);
        A012.A0Q("session_duration", Long.valueOf(System.currentTimeMillis() - this.A06));
        W3Q.A05(A012, mediaMapPin);
        A012.Cgf();
        AnonymousClass0fD.A09(-699201212, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-380904075);
        super.onDestroyView();
        requireParentFragment().A05.A04.remove(this);
        C18062Vko vko = requireParentFragment().A09;
        Set set = (Set) vko.A01.get(C18231Vnv.A01(this.A03));
        if (set != null) {
            set.remove(this);
        }
        LocationDetailFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0eM r3 = this.A00;
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3));
        A002.A02(this.A0C, WQB.class);
        A002.A02(this.A0A, C57066INg.class);
        if (this.A05) {
            AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3)).A02(this.A0B, AnonymousClass3KA.class);
        }
        AnonymousClass0fD.A09(-1238405944, A022);
    }

    public final void DOp(C17896Vhn vhn) {
        A02(this);
    }
}
