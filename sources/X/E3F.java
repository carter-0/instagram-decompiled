package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class E3F extends AnonymousClass4DH implements AnonymousClass4DS, CallerContextable {
    public static final String __redex_internal_original_name = "EditLinksListFragment";
    public C253663rB A00;
    public 1Ng A01;
    public 2Ly A02;
    public E99 A03;
    public AnonymousClass6ST A04;
    public User A05;
    public boolean A06;
    public 1wn A07;
    public final FRV A08 = new Object();
    public final AnonymousClass736 A09 = new Object();
    public final String A0A = "ig_fb_profile_link_integration";
    public final AnonymousClass0eM A0B = C227642jf.A02(this);

    public static final List A01(E3F e3f) {
        E3F e3f2 = e3f;
        Context context = e3f.getContext();
        if (context == null) {
            return 0sn.A00;
        }
        FRV frv = e3f.A08;
        AnonymousClass0eM r1 = e3f.A0B;
        UserSession A0l = AnonymousClass7TE.A0l(r1);
        User user = e3f.A05;
        if (user != null) {
            return frv.A01(context, FRP.A00(AnonymousClass7TE.A0l(r1), user), e3f2, A0l, user);
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131965087);
        User user = this.A05;
        if (user == null) {
            0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw AnonymousClass00P.createAndThrow();
        }
        List Afp = user.A03.Afp();
        if (Afp != null && Afp.size() > 1) {
            r3.ErD(FPC.A00(this, 40), R.drawable.instagram_more_horizontal_pano_outline_24);
        }
        DbX.A1A(FPC.A00(this, 41), DbV.A0K(), r3);
    }

    public final String getModuleName() {
        return "edit_links_list_fragment";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            CallerContext callerContext = 1KM.A00;
            if (i == 64206) {
                G6P flo = new C50961Flo(this, 2);
                AnonymousClass0eM r3 = this.A0B;
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                if (AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(r3)).A1x()) {
                    flo = FCU.A00(requireActivity(), AnonymousClass7TE.A0l(r3), flo);
                }
                1KM.A01(intent, A0l, flo);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d5, code lost:
        if (X.DbW.A1V(r1, r0) != false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r3 = 0
            X.0qQ.A0B(r15, r3)
            r8 = r14
            r0 = r16
            super.onViewCreated(r15, r0)
            X.0eM r5 = r14.A0B
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            r0 = 18
            X.FyG r2 = new X.FyG
            r2.<init>(r14, r0)
            r7 = 19
            X.FyG r1 = new X.FyG
            r1.<init>(r14, r7)
            X.E99 r0 = new X.E99
            r0.<init>(r14, r4, r2, r1)
            r14.A03 = r0
            r4 = 1
            X.Jm0 r6 = new X.Jm0
            r6.<init>(r14)
            r0 = 2131435521(0x7f0b2001, float:1.8492887E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.DbT.A0I(r15, r0)
            android.content.Context r0 = r2.getContext()
            X.DbU.A15(r0, r2, r4, r3)
            X.E99 r1 = r14.A03
            java.lang.String r0 = "accountAdapter"
            if (r1 == 0) goto L_0x0141
            r2.setAdapter(r1)
            r2.A11(r6)
            X.E99 r1 = r14.A03
            if (r1 == 0) goto L_0x0141
            java.util.List r0 = A01(r14)
            r1.A00(r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r6, r3)
            java.lang.Boolean r0 = X.AnonymousClass35I.A00(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0082
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342172144706142026(0x2081112800063f4a, double:4.073332002891271E-152)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0082
            r0 = 2131435523(0x7f0b2003, float:1.849289E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r15, r0)
            X.0xx r2 = X.DbV.A0J(r14)
            r1 = 0
            X.MHL r0 = new X.MHL
            r0.<init>((java.lang.Object) r14, (java.lang.Object) r6, (X.AnonymousClass4D7) r1, (int) r7)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x0082:
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x00bc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "should_show_edit_links_copy_profile_link_banner"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00bc
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330630140674763(0x811284000042cb, double:3.038975020443552E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x00bc
            r0 = 2131430827(0x7f0b0dab, float:1.8483366E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r15, r0)
            com.instagram.igds.components.banner.IgdsInsetBanner r2 = (com.instagram.igds.components.banner.IgdsInsetBanner) r2
            r2.setVisibility(r3)
            r1 = 10
            X.FcG r0 = new X.FcG
            r0.<init>(r14, r1)
            r2.A00 = r0
        L_0x00bc:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0Tu r1 = X.DbS.A0J(r0, r3)
            boolean r0 = X.DbW.A1U(r1, r0)
            if (r0 != 0) goto L_0x00d7
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r0, r3)
            boolean r0 = X.DbW.A1V(r1, r0)
            if (r0 == 0) goto L_0x011b
        L_0x00d7:
            r0 = 2131435519(0x7f0b1fff, float:1.8492882E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r15, r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r0, r3)
            boolean r0 = X.DbW.A1V(r1, r0)
            if (r0 == 0) goto L_0x0116
            r0 = 2131957413(0x7f1316a5, float:1.955141E38)
            java.lang.String r6 = X.DbU.A0m(r14, r0)
            r0 = 2131957415(0x7f1316a7, float:1.9551413E38)
            java.lang.String r2 = X.DbV.A0z(r14, r6, r0)
            X.0qQ.A07(r2)
            android.content.Context r1 = r14.getContext()
            if (r1 == 0) goto L_0x013c
            android.content.Context r0 = r14.getContext()
            int r0 = X.2Yu.A06(r0)
            int r1 = r1.getColor(r0)
            X.ESx r0 = new X.ESx
            r0.<init>((X.E3F) r14, (int) r1)
            X.AnonymousClass7AV.A07(r0, r7, r6, r2)
        L_0x0116:
            r7.setVisibility(r3)
            X.C319106q3.A00 = r4
        L_0x011b:
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.C49072Eoq.A00(r0, r4)
            X.0qQ.A0B(r9, r3)
            if (r0 == 0) goto L_0x013b
            java.lang.String r10 = "subscriber"
            java.lang.String r11 = "impression"
            r0 = 304(0x130, float:4.26E-43)
            java.lang.String r12 = X.C273654mx.A00(r0)
            java.lang.String r13 = "screen"
            X.AnonymousClass736.A07(r8, r9, r10, r11, r12, r13)
        L_0x013b:
            return
        L_0x013c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0141:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if ((r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData) == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(com.instagram.profile.bindergroup.AccountLinkModel r8, X.E3F r9) {
        /*
            com.instagram.user.model.User r0 = r9.A05
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "user"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000e:
            X.4Cl r0 = r0.A03
            java.util.List r6 = r0.Afp()
            if (r6 == 0) goto L_0x006f
            int r5 = r6.size()
            r4 = 0
        L_0x001b:
            if (r4 >= r5) goto L_0x006f
            java.lang.Object r0 = r6.get(r4)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK
            r7 = 1
            if (r1 != r0) goto L_0x006d
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData
            if (r0 != 0) goto L_0x0034
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2
            if (r0 == 0) goto L_0x006d
        L_0x0034:
            r3 = 1
        L_0x0035:
            java.lang.Object r0 = r6.get(r4)
            X.3qn r0 = (X.C253443qn) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BMt()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.FACEBOOK_PAGE
            if (r1 != r0) goto L_0x0048
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData
            r2 = 1
            if (r0 != 0) goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r6.get(r4)
            X.3qn r0 = (X.C253443qn) r0
            java.lang.String r1 = r0.BMn()
            r0 = r8
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r0 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006b
        L_0x0062:
            if (r3 != 0) goto L_0x0070
            if (r2 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            int r4 = r4 + 1
            goto L_0x001b
        L_0x006b:
            r7 = 0
            goto L_0x0062
        L_0x006d:
            r3 = 0
            goto L_0x0035
        L_0x006f:
            r4 = -1
        L_0x0070:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E3F.A00(com.instagram.profile.bindergroup.AccountLinkModel, X.E3F):int");
    }

    public static final void A03(E3F e3f) {
        C375999Gd r0;
        String A002;
        Object obj = new Object();
        AnonymousClass9JK r5 = new AnonymousClass9JK(CallerContext.A01(__redex_internal_original_name), "ig_android_ig_business_asset_fb_profile_discovery", "ig_add_fb_page_link", "add_fb_page_link", "loading");
        AnonymousClass0eM r3 = e3f.A0B;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        0qQ.A0B(A0l, 0);
        C46478Dfh dfh = (C46478Dfh) DbV.A0O(A0l).Au3(r5);
        if (dfh != null && (r0 = dfh.A00) != null && (A002 = r0.A00(r5, A0l)) != null && A002.length() != 0) {
            UserSession A0l2 = AnonymousClass7TE.A0l(r3);
            WO3 wo3 = new WO3(1, obj, e3f);
            0qQ.A0B(A0l2, 0);
            new C17796Vg9(A0l2).A00(r5, AnonymousClass9F1.A00, wo3);
        }
    }

    public final UserSession A04() {
        return AnonymousClass7TE.A0l(this.A0B);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0B);
    }

    public static final void A02(Uri uri, E3F e3f) {
        View A082 = DbU.A08(DbV.A0E(e3f), R.layout.layout_links_fb_dialog);
        0qQ.A07(A082);
        C358248ab A0U = DbW.A0U(e3f);
        A0U.A09(2131970012);
        A0U.A08(2131970006);
        C50021FJg.A01(A0U, e3f, 17, 2131970011);
        A0U.A0C(C50021FJg.A00(e3f, 18));
        if (uri != null) {
            DbX.A0b(A082, R.id.profile_link_facebook_image).setUrl(C253833rU.A00(uri, -1, -1), e3f);
            A0U.A0k(A082);
        }
        DbT.A1V(A0U);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1661867646);
        E3F.super.onCreate(bundle);
        0eE r1 = AnonymousClass0t1.A01;
        AnonymousClass0eM r3 = this.A0B;
        User A012 = r1.A01(AnonymousClass7TE.A0l(r3));
        this.A05 = A012;
        this.A00 = FRP.A00(AnonymousClass7TE.A0l(r3), A012);
        this.A01 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3));
        this.A02 = new 2Ly(AnonymousClass7TE.A0l(r3));
        AnonymousClass6ST A0h = DbV.A0h(requireActivity());
        this.A04 = A0h;
        DbX.A15(requireContext(), A0h);
        Dbc.A0p(this);
        this.A07 = FXZ.A00(this, 57);
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(r3));
        Class<C290845g3> cls = C290845g3.class;
        1wn r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("fbIgLinkChangeListener");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A01(r0, cls);
        0xa A0q = AnonymousClass7TE.A0q(AnonymousClass7TE.A0l(r3));
        if (A0q.getBoolean("should_show_facebook_page_link_dialog", false)) {
            A03(this);
            DbX.A1V(A0q, "should_show_facebook_page_link_dialog", false);
        }
        AnonymousClass0fD.A09(-362813909, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1529397545);
        0qQ.A0B(layoutInflater, 0);
        View A092 = DbW.A09(layoutInflater, viewGroup, R.layout.layout_links_fragment, false);
        AnonymousClass0fD.A09(751484374, A022);
        return A092;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(948366777);
        1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A0B));
        Class<C290845g3> cls = C290845g3.class;
        1wn r0 = this.A07;
        if (r0 == null) {
            0qQ.A0F("fbIgLinkChangeListener");
            throw AnonymousClass00P.createAndThrow();
        }
        A002.A02(r0, cls);
        super.onDestroy();
        AnonymousClass0fD.A09(-1044133139, A022);
    }
}
