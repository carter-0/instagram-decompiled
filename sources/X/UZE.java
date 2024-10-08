package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

public final class UZE extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteSaveDraftBottomSheetFragment";
    public WGU A00;
    public C18784W1k A01;
    public PromoteData A02;
    public UserSession A03;
    public View A04;
    public View A05;
    public View A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C20690WxM(this, 47));

    public final String getModuleName() {
        return "promote_save_draft_bottom_sheet";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r1.A0D() != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            super.onViewCreated(r8, r9)
            r0 = 2131440632(0x7f0b33f8, float:1.8503253E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131440631(0x7f0b33f7, float:1.850325E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r8, r0)
            r0 = 2131440619(0x7f0b33eb, float:1.8503226E38)
            android.view.View r0 = r8.requireViewById(r0)
            r7.A06 = r0
            r0 = 2131431873(0x7f0b11c1, float:1.8485487E38)
            android.view.View r0 = r8.requireViewById(r0)
            r7.A05 = r0
            r0 = 2131429538(0x7f0b08a2, float:1.8480752E38)
            android.view.View r0 = r8.requireViewById(r0)
            r7.A04 = r0
            com.instagram.business.promote.model.PromoteData r1 = r7.A02
            java.lang.String r0 = "promoteData"
            if (r1 != 0) goto L_0x003e
            X.0qQ.A0F(r0)
        L_0x0039:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003e:
            boolean r0 = r1.A2R
            if (r0 == 0) goto L_0x0049
            boolean r1 = r1.A0D()
            r0 = 1
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r3 = 1
            java.lang.String r6 = "saveButtonRow"
            java.lang.String r5 = "discardButtonRow"
            android.content.res.Resources r1 = X.DbV.A05(r7)
            if (r0 == 0) goto L_0x00df
            r0 = 2131970744(0x7f134ab8, float:1.9578448E38)
            X.DbU.A1A(r1, r4, r0)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970743(0x7f134ab7, float:1.9578446E38)
            X.DbU.A1A(r1, r2, r0)
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0127
            r4 = 2131438649(0x7f0b2c39, float:1.849923E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r0, r4)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970742(0x7f134ab6, float:1.9578444E38)
            X.DbU.A1A(r1, r2, r0)
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0127
            X.WB8.A00(r0, r3, r7)
            android.view.View r0 = r7.A06
            if (r0 == 0) goto L_0x0127
            r0.setClickable(r3)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x0122
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r0, r4)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970739(0x7f134ab3, float:1.9578438E38)
            X.DbU.A1A(r1, r2, r0)
            android.content.Context r1 = r7.requireContext()
            android.content.Context r0 = r7.getContext()
            int r0 = X.2Yu.A03(r0)
            X.DbT.A17(r1, r2, r0)
            android.view.View r1 = r7.A05
            if (r1 == 0) goto L_0x0122
            r0 = 2
        L_0x00ae:
            X.WB8.A00(r1, r0, r7)
            android.view.View r0 = r7.A05
            if (r0 == 0) goto L_0x0122
            r0.setClickable(r3)
            android.view.View r1 = r7.A04
            java.lang.String r5 = "cancelButtonRow"
            if (r1 == 0) goto L_0x0122
            r0 = 2131438649(0x7f0b2c39, float:1.849923E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970458(0x7f13499a, float:1.9577868E38)
            X.DbU.A1A(r1, r2, r0)
            android.view.View r1 = r7.A04
            if (r1 == 0) goto L_0x0122
            r0 = 4
            X.WB8.A00(r1, r0, r7)
            android.view.View r0 = r7.A04
            if (r0 == 0) goto L_0x0122
            r0.setClickable(r3)
            return
        L_0x00df:
            r0 = 2131970741(0x7f134ab5, float:1.9578442E38)
            X.DbU.A1A(r1, r4, r0)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970740(0x7f134ab4, float:1.957844E38)
            X.DbU.A1A(r1, r2, r0)
            android.view.View r1 = r7.A06
            if (r1 == 0) goto L_0x0127
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r7.A05
            if (r1 == 0) goto L_0x0122
            r0 = 2131438649(0x7f0b2c39, float:1.849923E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.res.Resources r1 = X.DbV.A05(r7)
            r0 = 2131970739(0x7f134ab3, float:1.9578438E38)
            X.DbU.A1A(r1, r2, r0)
            android.content.Context r1 = r7.requireContext()
            android.content.Context r0 = r7.getContext()
            int r0 = X.2Yu.A03(r0)
            X.DbT.A17(r1, r2, r0)
            android.view.View r1 = r7.A05
            if (r1 == 0) goto L_0x0122
            r0 = 3
            goto L_0x00ae
        L_0x0122:
            X.0qQ.A0F(r5)
            goto L_0x0039
        L_0x0127:
            X.0qQ.A0F(r6)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZE.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final String A00(UZE uze) {
        C16678UzE uzE;
        PromoteData promoteData = uze.A02;
        if (promoteData == null) {
            0qQ.A0F("promoteData");
            throw AnonymousClass00P.createAndThrow();
        }
        if (promoteData.A2R) {
            uzE = C16678UzE.SUMMARY;
        } else if (promoteData.A2Q) {
            uzE = C16678UzE.BUDGET_DURATION;
        } else if (promoteData.A2P) {
            uzE = C16678UzE.AUDIENCE_SELECTION;
        } else {
            uzE = C16678UzE.OBJECTIVE;
        }
        return uzE.toString();
    }

    public static final void A01(UZE uze, boolean z) {
        String str;
        View view = uze.A06;
        if (view == null) {
            str = "saveButtonRow";
        } else {
            view.setClickable(z);
            View view2 = uze.A05;
            if (view2 == null) {
                str = "discardButtonRow";
            } else {
                view2.setClickable(z);
                View view3 = uze.A04;
                if (view3 == null) {
                    str = "cancelButtonRow";
                } else {
                    view3.setClickable(z);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A03;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1513602894);
        UZE.super.onCreate(bundle);
        PromoteData A002 = XAI.A00(this);
        this.A02 = A002;
        UserSession userSession = A002.A0y;
        this.A03 = userSession;
        this.A01 = C18784W1k.A01(this, userSession);
        UserSession userSession2 = this.A03;
        if (userSession2 != null) {
            this.A00 = WGU.A00(userSession2);
            AnonymousClass0fD.A09(647245184, A022);
            return;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1605742993);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.promote_save_draft_bottom_sheet_view, false);
        AnonymousClass0fD.A09(-468981724, A022);
        return A0D;
    }
}
