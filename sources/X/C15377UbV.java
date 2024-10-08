package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UbV  reason: case insensitive filesystem */
public final class C15377UbV extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "PromoteRecommendedInfoBottomSheetFragment";
    public WGU A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final /* synthetic */ void Cyc() {
    }

    public final /* synthetic */ void Cyf() {
    }

    public final String getModuleName() {
        return "promote_education_drawer_bottom_sheet_fragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            android.os.Bundle r1 = r4.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x00d5
            java.lang.String r0 = "recommended_destination"
            java.lang.String r1 = r1.getString(r0)
        L_0x0012:
            X.0eM r0 = r4.A01
            X.WGU r0 = X.JTU.A0D(r0)
            r4.A00 = r0
            r0 = 2131442048(0x7f0b3980, float:1.8506125E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r5, r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.PROFILE_VISITS
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 == 0) goto L_0x006d
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x006b
            r0 = 2131968734(0x7f1342de, float:1.957437E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0036:
            r2.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x004d
            r0 = 2131968733(0x7f1342dd, float:1.9574369E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x004d:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_pv"
        L_0x0052:
            X.WGU r1 = r4.A00
            if (r1 == 0) goto L_0x005b
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            r1.A0H(r0, r2)
        L_0x005b:
            X.WGU r2 = r4.A00
            if (r2 == 0) goto L_0x006a
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "enter_recommended_drawer"
            r2.A0R(r1, r0)
        L_0x006a:
            return
        L_0x006b:
            r0 = r3
            goto L_0x0036
        L_0x006d:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.WEBSITE_CLICK
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 == 0) goto L_0x00a1
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x009f
            r0 = 2131968737(0x7f1342e1, float:1.9574377E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0082:
            r2.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x0099
            r0 = 2131968736(0x7f1342e0, float:1.9574375E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0099:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_wv"
            goto L_0x0052
        L_0x009f:
            r0 = r3
            goto L_0x0082
        L_0x00a1:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.DIRECT_MESSAGE
            boolean r0 = X.Dba.A1X(r0, r1)
            if (r0 == 0) goto L_0x005b
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x00d3
            r0 = 2131968732(0x7f1342dc, float:1.9574367E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00b6:
            r2.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r5, r0)
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x00cd
            r0 = 2131968731(0x7f1342db, float:1.9574365E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x00cd:
            r2.setText(r3)
            java.lang.String r2 = "boost_objective_recommendation_bottomsheet_ctx"
            goto L_0x0052
        L_0x00d3:
            r0 = r3
            goto L_0x00b6
        L_0x00d5:
            r1 = r3
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15377UbV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1802286857);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_recommended_info_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-561365976, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = AnonymousClass0fD.A02(1045906209);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass0fD.A09(1674852110, A02);
    }
}
