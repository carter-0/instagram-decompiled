package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class K45 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsTrialSettingsBottomSheetFragment";
    public 0sP A00;
    public final String A01 = __redex_internal_original_name;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C66296MMf.A00(this, 22));

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r1 == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            r0 = 2131430280(0x7f0b0b88, float:1.8482257E38)
            android.view.View r1 = r5.findViewById(r0)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            if (r1 == 0) goto L_0x0018
            r0 = 2131956028(0x7f13113c, float:1.95486E38)
            r1.setHeadline((int) r0)
        L_0x0018:
            r0 = 2131430277(0x7f0b0b85, float:1.848225E38)
            android.view.View r3 = r5.findViewById(r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r3 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r3
            r2 = 0
            if (r3 == 0) goto L_0x0043
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            r3.setIcon((int) r0)
            X.0eM r0 = r4.A02
            X.0lg r0 = X.DbT.A0X(r0)
            boolean r1 = X.JTU.A1U(r0)
            r0 = 2131956021(0x7f131135, float:1.9548586E38)
            if (r1 == 0) goto L_0x003c
            r0 = 2131956022(0x7f131136, float:1.9548588E38)
        L_0x003c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setText((java.lang.Integer) r2, (java.lang.Integer) r0)
        L_0x0043:
            r0 = 2131430279(0x7f0b0b87, float:1.8482254E38)
            android.view.View r1 = r5.findViewById(r0)
            com.instagram.igds.components.bulletcell.IgdsBulletCell r1 = (com.instagram.igds.components.bulletcell.IgdsBulletCell) r1
            if (r1 == 0) goto L_0x005e
            r0 = 2131238943(0x7f08201f, float:1.8094179E38)
            r1.setIcon((int) r0)
            r0 = 2131956023(0x7f131137, float:1.954859E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setText((java.lang.Integer) r2, (java.lang.Integer) r0)
        L_0x005e:
            r0 = 2131442930(0x7f0b3cf2, float:1.8507914E38)
            android.widget.ImageView r1 = X.DbS.A0G(r5, r0)
            if (r1 == 0) goto L_0x006d
            r0 = 2131237926(0x7f081c26, float:1.8092116E38)
            r1.setImageResource(r0)
        L_0x006d:
            r0 = 2131442940(0x7f0b3cfc, float:1.8507934E38)
            android.widget.TextView r2 = X.AnonymousClass7TE.A0d(r5, r0)
            if (r2 == 0) goto L_0x0095
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r4.A02
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            X.4Cl r0 = r0.A03
            java.lang.Boolean r0 = r0.BCS()
            if (r0 == 0) goto L_0x008f
            boolean r1 = r0.booleanValue()
            r0 = 2131956027(0x7f13113b, float:1.9548598E38)
            if (r1 != 0) goto L_0x0092
        L_0x008f:
            r0 = 2131956026(0x7f13113a, float:1.9548596E38)
        L_0x0092:
            r2.setText(r0)
        L_0x0095:
            X.0eM r0 = r4.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r4.A03
            java.lang.String r0 = X.DbS.A0t(r0)
            X.LSk r3 = X.LK1.A01(r4, r1, r0)
            r0 = 2131442920(0x7f0b3ce8, float:1.8507893E38)
            android.view.View r2 = r5.findViewById(r0)
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            if (r2 == 0) goto L_0x00c6
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L_0x00f4
            java.lang.String r0 = "initial_auto_graduation_key"
            boolean r0 = r1.getBoolean(r0)
        L_0x00ba:
            r2.setChecked(r0)
            r1 = 3
            X.LZI r0 = new X.LZI
            r0.<init>(r1, r4, r3)
            r2.setOnCheckedChangeListener(r0)
        L_0x00c6:
            r0 = 2131430281(0x7f0b0b89, float:1.8482259E38)
            android.view.View r2 = r5.findViewById(r0)
            X.61u r2 = (X.C3021461u) r2
            if (r2 == 0) goto L_0x00ea
            r0 = 62
            X.LYG r0 = X.LYG.A01(r4, r3, r0)
            r2.setPrimaryActionOnClickListener(r0)
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 63
            X.LYG r0 = X.LYG.A01(r4, r3, r0)
            r2.setSecondaryAction(r1, r0)
        L_0x00ea:
            java.lang.String r2 = "client"
            java.lang.String r1 = "trial_settings"
            java.lang.String r0 = "impression"
            X.LSk.A03(r3, r2, r1, r0)
            return
        L_0x00f4:
            r0 = 0
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K45.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(856037325);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_trial_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(693022287, A022);
        return inflate;
    }
}
