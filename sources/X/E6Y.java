package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class E6Y extends AnonymousClass32G implements C243853aD, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SupportInboxDetailFragmentImpl";
    public UserSession A00;
    public IgdsBottomButtonLayout A01;
    public C331157Pu A02;
    public C47570E8i A03;
    public DwJ A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public C48077EUv A09;
    public final 1wn A0A = new FXT(this, 7);

    public final void D2Y(FollowStatus followStatus, User user) {
    }

    public final void D2p(User user) {
    }

    public final void DGO(User user) {
    }

    public final void DGP(User user) {
    }

    public final void DGQ(C267064at r1) {
    }

    public final void DGR(EWA ewa, User user) {
    }

    public final String getModuleName() {
        return "support_inbox_detail_fragment";
    }

    public static void A01(E6Y e6y) {
        UserSession userSession = e6y.A00;
        String str = e6y.A06;
        String str2 = e6y.A05;
        String str3 = e6y.A07;
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("reports/support_info_request/");
        A0L.A0Q(DwJ.class, C49816F8d.class);
        A0L.A9m("reported_content_id", str);
        if (str2 != null) {
            A0L.A9m("ctrl_type", str2);
        }
        if (str3 != null) {
            A0L.A9m("ticket_id", str3);
        }
        1OC A0M = A0L.A0M();
        A0M.A00 = new C47685ECu(e6y, 1);
        1ES.A03(A0M);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.E6Y r5) {
        /*
            X.DwJ r0 = r5.A04
            r0.getClass()
            android.content.Context r1 = r5.requireContext()
            com.instagram.common.session.UserSession r0 = r5.A00
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            com.instagram.common.session.UserSession r0 = r5.A00
            X.17i r1 = X.17h.A00(r0)
            X.DwJ r0 = r5.A04
            java.lang.Long r0 = r0.A06
            java.lang.String r0 = r0.toString()
            com.instagram.user.model.User r4 = r1.A02(r0)
            if (r4 == 0) goto L_0x0090
            X.DwJ r0 = r5.A04
            r0.getClass()
            X.DwJ r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x0090;
                case 3: goto L_0x0090;
                case 4: goto L_0x0090;
                case 5: goto L_0x0090;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x003b:
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x0090
            boolean r0 = r4.CPV()
            if (r0 != 0) goto L_0x005a
            r1 = 2131973066(0x7f1353ca, float:1.9583157E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r2 = X.DbV.A0z(r5, r0, r1)
            r1 = 39
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A0A(r2, r0)
        L_0x005a:
            com.instagram.common.session.UserSession r0 = r5.A00
            X.2f1 r0 = X.AnonymousClass2f1.A00(r0)
            boolean r0 = r0.A0Q(r4)
            if (r0 == 0) goto L_0x0090
            r1 = 2131973071(0x7f1353cf, float:1.9583167E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r2 = X.DbV.A0z(r5, r0, r1)
            r1 = 40
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A0C(r2, r0)
            r1 = 2131973067(0x7f1353cb, float:1.958316E38)
            java.lang.String r0 = r4.getUsername()
            java.lang.String r2 = X.DbV.A0z(r5, r0, r1)
            r1 = 41
            X.FP7 r0 = new X.FP7
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r4)
            r3.A0C(r2, r0)
        L_0x0090:
            X.DwJ r0 = r5.A04
            boolean r0 = r0.A0G
            if (r0 == 0) goto L_0x00a3
            r2 = 2131972982(0x7f135376, float:1.9582987E38)
            r1 = 10
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.A04(r0, r2)
        L_0x00a3:
            X.DwJ r0 = r5.A04
            r0.getClass()
            X.DwJ r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00ba;
                case 2: goto L_0x00da;
                case 3: goto L_0x00da;
                case 4: goto L_0x00da;
                case 5: goto L_0x00da;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00ba:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x00da
            r2 = 2131974819(0x7f135aa3, float:1.9586713E38)
            r1 = 11
        L_0x00c3:
            X.FOz r0 = new X.FOz
            r0.<init>((java.lang.Object) r5, (int) r1)
            r3.A04(r0, r2)
        L_0x00cb:
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x00d9
            X.FFy r0 = new X.FFy
            r0.<init>(r3)
            r0.A05(r1)
        L_0x00d9:
            return
        L_0x00da:
            X.DwJ r1 = r5.A04
            java.lang.Integer r0 = r1.A03
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00ec;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00cb;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            java.lang.String r0 = "Invalid support inbox CTRL type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x00ec:
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x00cb
            X.Eye r0 = r1.A02
            if (r0 == 0) goto L_0x00cb
            r2 = 2131974819(0x7f135aa3, float:1.9586713E38)
            r1 = 7
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6Y.A02(X.E6Y):void");
    }

    public final 0lg A0Y() {
        return this.A00;
    }

    public final void configureActionBar(2da r4) {
        int i;
        if (isAdded()) {
            this.A05.getClass();
            Integer A002 = C49245Ero.A00(this.A05);
            A002.getClass();
            switch (A002.intValue()) {
                case 0:
                case 1:
                    i = 2131972171;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i = 2131976692;
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Invalid support inbox CTRL type");
            }
            DbW.A1C(r4, getString(i));
            if (this.A09 == C48077EUv.ACTIVITY_FEED) {
                AnonymousClass3JR A0K = DbS.A0K();
                A0K.A06 = R.drawable.instagram_edit_list_pano_outline_24;
                A0K.A05 = 2131974777;
                DbX.A19(new C50109FOz((Object) this, 8), A0K, r4);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2097480545);
        E6Y.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A06 = DbU.A0l(requireArguments, "SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID");
        this.A05 = requireArguments.getString("SupportInboxDetailFragment.ARG_CTRL_TYPE");
        this.A07 = requireArguments.getString("SupportInboxDetailFragment.ARG_TICKET_ID");
        requireArguments.getString("SupportInboxDetailFragment.ARG_STORY_ID");
        this.A09 = (C48077EUv) requireArguments.getSerializable("SupportInboxDetailFragment.ARG_SOURCE");
        C47570E8i e8i = new C47570E8i(requireContext(), this, this.A00, this, this);
        this.A03 = e8i;
        A0V(e8i);
        AnonymousClass1Nd.A00(this.A00).A01(this.A0A, FWM.class);
        AnonymousClass0fD.A09(1092520571, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(287018854);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.support_inbox_detail_fragment);
        AnonymousClass0fD.A09(38881751, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-805061491);
        super.onDestroy();
        AnonymousClass1Nd.A00(this.A00).A02(this.A0A, FWM.class);
        AnonymousClass0fD.A09(1906865785, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = DbT.A0c(view, R.id.support_inbox_detail_more_options_button_layout);
        A01(this);
    }
}
