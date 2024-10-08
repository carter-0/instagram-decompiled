package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E1Q extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "HallPassDisclosureFragment";
    public E7Y A00;
    public String A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final String A03 = "hall_pass_disclosure";

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4.A00 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            r0 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r5, r0)
            X.61u r2 = (X.C3021461u) r2
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x0019
            X.E7Y r1 = r4.A00
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            r0 = 8
        L_0x001b:
            r2.setVisibility(r0)
            java.lang.String r3 = r4.A01
            if (r3 == 0) goto L_0x002c
            r1 = 8
            X.FOr r0 = new X.FOr
            r0.<init>((java.lang.String) r3, (java.lang.Object) r4, (int) r1)
            r2.setPrimaryActionOnClickListener(r0)
        L_0x002c:
            r0 = 2131428521(0x7f0b04a9, float:1.8478689E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r5, r0)
            r0 = 30
            X.FP1.A01(r1, r0, r4)
            X.0eM r0 = r4.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.Boolean r0 = r0.A0K()
            boolean r3 = X.DbX.A1a(r0)
            r0 = 2131429218(0x7f0b0762, float:1.8480103E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954701(0x7f130c0d, float:1.9545909E38)
            r1.setText(r0)
            r0 = 2131429219(0x7f0b0763, float:1.8480105E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954694(0x7f130c06, float:1.9545894E38)
            r1.setText(r0)
            r0 = 2131429220(0x7f0b0764, float:1.8480107E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954696(0x7f130c08, float:1.9545899E38)
            r1.setText(r0)
            r0 = 2131442012(0x7f0b395c, float:1.8506052E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954697(0x7f130c09, float:1.95459E38)
            if (r3 == 0) goto L_0x0080
            r0 = 2131954698(0x7f130c0a, float:1.9545903E38)
        L_0x0080:
            r1.setText(r0)
            r0 = 2131442013(0x7f0b395d, float:1.8506054E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954693(0x7f130c05, float:1.9545892E38)
            r1.setText(r0)
            r0 = 2131442014(0x7f0b395e, float:1.8506056E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954695(0x7f130c07, float:1.9545896E38)
            r1.setText(r0)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r5, r0)
            r0 = 2131954702(0x7f130c0e, float:1.954591E38)
            if (r3 == 0) goto L_0x00ac
            r0 = 2131954699(0x7f130c0b, float:1.9545905E38)
        L_0x00ac:
            r1.setText(r0)
            r0 = 0
            android.content.Context r1 = r4.getContext()
            if (r3 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bf
            r0 = 2131973441(0x7f135541, float:1.9583918E38)
        L_0x00bb:
            java.lang.String r0 = r1.getString(r0)
        L_0x00bf:
            r2.setPrimaryActionText(r0)
            return
        L_0x00c3:
            if (r1 == 0) goto L_0x00bf
            r0 = 2131954115(0x7f1309c3, float:1.954472E38)
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1Q.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        Context context;
        int A022 = AnonymousClass0fD.A02(256967918);
        E1Q.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("hall_pass_id");
        if (requireArguments.getString("hall_pass_primary_button_text") == null && (context = getContext()) != null) {
            context.getString(2131963281);
        }
        AnonymousClass0fD.A09(1987600819, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1564605967);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_disclosure, false);
        AnonymousClass0fD.A09(-1360286757, A022);
        return A0D;
    }
}
