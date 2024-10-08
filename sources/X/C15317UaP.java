package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UaP  reason: case insensitive filesystem */
public final class C15317UaP extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X3L {
    public static final String __redex_internal_original_name = "PromoteUpdateAccountSpendLimitFragment";
    public C18654Vw9 A00;
    public UserSession A01;
    public String A02;
    public final AnonymousClass0eM A03 = C20703Wxa.A00(this, 36);
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eom(2131970815);
        Dbc.A0k(r2);
        r2.Eu4(true);
    }

    public final String getModuleName() {
        return "promote_update_account_spend_limit_view";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.String r1 = r4.A02
            if (r1 != 0) goto L_0x0012
            java.lang.String r0 = "previousStep"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0012:
            X.UzE r0 = X.C16678UzE.PROMOTE_PREVALIDATION_LOADING
            boolean r0 = X.JTQ.A1Y(r0, r1)
            r2 = 8
            if (r0 == 0) goto L_0x006f
            r0 = 2131434548(0x7f0b1c34, float:1.8490913E38)
            X.DbT.A1F(r5, r0, r3)
            r0 = 2131438711(0x7f0b2c77, float:1.8499357E38)
            X.DbT.A1F(r5, r0, r2)
            r0 = 2131438644(0x7f0b2c34, float:1.849922E38)
            android.widget.TextView r1 = X.DbU.A0G(r5, r0)
            r0 = 2131970820(0x7f134b04, float:1.9578602E38)
            r1.setText(r0)
            r0 = 2131438645(0x7f0b2c35, float:1.8499223E38)
            android.widget.TextView r1 = X.DbU.A0G(r5, r0)
            r0 = 2131970818(0x7f134b02, float:1.9578598E38)
        L_0x003f:
            r1.setText(r0)
        L_0x0042:
            X.UzE r1 = X.C16678UzE.UPDATE_ACCOUNT_SPEND_LIMIT
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r5, r1)
            r4.A00 = r0
            r0.A01()
            X.Vw9 r2 = r4.A00
            if (r2 == 0) goto L_0x00c7
            android.content.Context r1 = r4.requireContext()
            r0 = 2131970816(0x7f134b00, float:1.9578594E38)
            java.lang.String r0 = r1.getString(r0)
            X.C18165Vmf.A01(r4, r2, r0)
            X.Vw9 r1 = r4.A00
            if (r1 == 0) goto L_0x0068
            r0 = 1
            r1.A04(r0)
        L_0x0068:
            X.C13991Tnr.A0w(r4)
            super.onViewCreated(r5, r6)
            return
        L_0x006f:
            X.UzE r0 = X.C16678UzE.SUMMARY
            boolean r0 = X.JTQ.A1Y(r0, r1)
            if (r0 != 0) goto L_0x007f
            X.UzE r0 = X.C16678UzE.BOOST_PACKAGES
            boolean r0 = X.JTQ.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0042
        L_0x007f:
            r0 = 2131438006(0x7f0b29b6, float:1.8497927E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            android.view.View r1 = r0.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            X.0eM r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.U8O r0 = (X.U8O) r0
            com.instagram.business.promote.model.PromoteData r0 = r0.A01
            com.instagram.common.typedurl.ImageUrl r0 = r0.A11
            X.0qQ.A06(r0)
            r1.setUrl(r0, r4)
            r0 = 2131438711(0x7f0b2c77, float:1.8499357E38)
            X.DbT.A1F(r5, r0, r3)
            r0 = 2131434548(0x7f0b1c34, float:1.8490913E38)
            X.DbT.A1F(r5, r0, r2)
            r0 = 2131438644(0x7f0b2c34, float:1.849922E38)
            android.widget.TextView r1 = X.DbU.A0G(r5, r0)
            r0 = 2131970819(0x7f134b03, float:1.95786E38)
            r1.setText(r0)
            r0 = 2131438645(0x7f0b2c35, float:1.8499223E38)
            android.widget.TextView r1 = X.DbU.A0G(r5, r0)
            r0 = 2131970817(0x7f134b01, float:1.9578596E38)
            goto L_0x003f
        L_0x00c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15317UaP.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("previousStep");
            throw AnonymousClass00P.createAndThrow();
        } else if (!JTQ.A1Y(C16678UzE.PROMOTE_PREVALIDATION_LOADING, str)) {
            return false;
        } else {
            ((U8O) this.A04.getValue()).A01.A2w = true;
            WGU A0M = C13990Tnq.A0M(this.A03);
            if (A0M != null) {
                A0M.A0F(C16678UzE.PROMOTE_PREVALIDATION_ERROR, "cancel_button");
            }
            DbT.A1K(this);
            return false;
        }
    }

    public C15317UaP() {
        C20703Wxa wxa = new C20703Wxa(this, 40);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20703Wxa(new C20703Wxa(this, 37), 38));
        this.A04 = new C227862kA(new C20703Wxa(A002, 39), wxa, new C41566AwY(12, (Object) null, A002), new 0Yh(U8O.class));
    }

    public final void CtD() {
        FragmentActivity requireActivity = requireActivity();
        UserSession userSession = this.A01;
        if (userSession != null) {
            C18676VwZ.A02(requireActivity, new WOB(this, 0), userSession, true);
        } else {
            DbS.A14();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-337398522);
        C15317UaP.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("step");
            if (string != null) {
                this.A02 = string;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(989727707, A022);
                throw A0y;
            }
        }
        this.A01 = ((U8O) this.A04.getValue()).A01.A0y;
        AnonymousClass0fD.A09(553764036, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1038611858);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_update_account_spend_limit_view, viewGroup, false);
        AnonymousClass0fD.A09(-1804638645, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-93126396);
        super.onDestroyView();
        AnonymousClass0fD.A09(-2013533565, A022);
    }
}
