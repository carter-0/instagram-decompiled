package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.nux.cal.model.ConnectContent;
import com.instagram.nux.cal.model.FXCalAgeInfo;
import com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent;
import java.io.Serializable;

public final class E1F extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AgeMismatchFragment";
    public AnonymousClass0wW A00;
    public EVV A01;
    public ConnectContent A02;
    public FXCalAgeInfo A03;
    public FXCalAgeInfo A04;
    public FXCalAgeRestrictionScreenContent A05;
    public Integer A06;
    public String A07;
    public String A08;

    public final String getModuleName() {
        return "age_mismatch";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2126972393);
        E1F.super.onCreate(bundle);
        requireArguments();
        this.A00 = DbX.A0T(this);
        Parcelable parcelable = requireArguments().getParcelable("argument_content");
        parcelable.getClass();
        this.A02 = (ConnectContent) parcelable;
        this.A06 = Eo6.A00(DbU.A0l(requireArguments(), "argument_flow"));
        Serializable serializable = requireArguments().getSerializable("argument_entry_point");
        serializable.getClass();
        this.A01 = (EVV) serializable;
        FXCalAgeRestrictionScreenContent fXCalAgeRestrictionScreenContent = this.A02.A01;
        fXCalAgeRestrictionScreenContent.getClass();
        this.A05 = fXCalAgeRestrictionScreenContent;
        this.A07 = null;
        this.A08 = null;
        FXCalAgeInfo fXCalAgeInfo = fXCalAgeRestrictionScreenContent.A00;
        fXCalAgeInfo.getClass();
        FXCalAgeInfo fXCalAgeInfo2 = this.A05.A01;
        fXCalAgeInfo2.getClass();
        if (fXCalAgeInfo.A00 > fXCalAgeInfo2.A00) {
            this.A04 = fXCalAgeInfo2;
            this.A03 = fXCalAgeInfo;
        } else {
            this.A04 = fXCalAgeInfo;
            this.A03 = fXCalAgeInfo2;
        }
        AnonymousClass0fD.A09(956589729, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0105, code lost:
        if (r1 == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011b, code lost:
        if (r1 == false) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0126, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
        if (r1 == false) goto L_0x0161;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            r0 = -98938887(0xfffffffffa1a4ff9, float:-2.0030894E35)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r0 = 2131624055(0x7f0e0077, float:1.8875279E38)
            r8 = 0
            android.view.View r3 = r11.inflate(r0, r12, r8)
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r1 = X.Dba.A07(r3, r0)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A04
            r0.getClass()
            r1.setText(r0)
            r0 = 2131428824(0x7f0b05d8, float:1.8479303E38)
            android.widget.TextView r1 = X.Dba.A07(r3, r0)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A02
            r0.getClass()
            r1.setText(r0)
            r0 = 2131434164(0x7f0b1ab4, float:1.8490134E38)
            android.view.View r6 = X.DbU.A0B(r3, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r6 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r6
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.Jev r7 = new X.Jev
            r7.<init>(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.String r0 = r0.A04
            r0.getClass()
            r7.setPrimaryText(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.String r0 = r0.A05
            r0.getClass()
            r7.setSecondaryText(r0)
            r5 = 1
            r1 = 2131440874(0x7f0b34ea, float:1.8503744E38)
            android.widget.TextView r4 = X.AnonymousClass7TE.A0d(r7, r1)
            java.lang.CharSequence r0 = r4.getText()
            r9 = 0
            if (r0 == 0) goto L_0x006f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006f
            r4.setVisibility(r8)
        L_0x006f:
            r6.addView(r7)
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.Jev r4 = new X.Jev
            r4.<init>(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.String r0 = r0.A04
            r0.getClass()
            r4.setPrimaryText(r0)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.String r0 = r0.A05
            r0.getClass()
            r4.setSecondaryText(r0)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r4, r1)
            java.lang.CharSequence r0 = r1.getText()
            if (r0 == 0) goto L_0x00a2
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00a2
            r1.setVisibility(r8)
        L_0x00a2:
            r6.addView(r4)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00b2
            r9 = 1
        L_0x00b2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0154
            r7.setChecked(r5)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
            java.lang.String r0 = r0.A02
            r0.getClass()
            r10.A07 = r0
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A04
        L_0x00ca:
            java.lang.String r0 = r0.A03
            r0.getClass()
            r10.A08 = r0
        L_0x00d1:
            r7 = 2131438169(0x7f0b2a59, float:1.8498257E38)
            android.view.View r4 = X.DbU.A0B(r3, r7)
            r1 = 3
            X.Weu r0 = new X.Weu
            r0.<init>(r1, r4, r10)
            r6.A02 = r0
            android.widget.TextView r4 = X.Dba.A07(r3, r7)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            java.lang.String r0 = r0.A03
            r0.getClass()
            r4.setText(r0)
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            com.instagram.nux.cal.model.FXCalAgeInfo r1 = r0.A00
            r1.getClass()
            com.instagram.nux.cal.model.FXCalAgeRestrictionScreenContent r0 = r10.A05
            com.instagram.nux.cal.model.FXCalAgeInfo r6 = r0.A01
            r6.getClass()
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0107
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0128
            java.lang.Boolean r0 = r6.A01
            if (r0 == 0) goto L_0x011d
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x012b
        L_0x0128:
            r4.setEnabled(r5)
        L_0x012b:
            r0 = 8
            X.FP0.A00(r4, r0, r10)
            X.0wW r4 = r10.A00
            X.EVV r0 = r10.A01
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x0151
            r0 = 2
            if (r1 == r0) goto L_0x014e
            X.DiE r0 = X.C46634DiE.A0z
        L_0x013f:
            java.lang.String r0 = r0.A01
            X.AnonymousClass7TG.A1N(r4, r0)
            X.C49938FFr.A01(r4, r0)
            r0 = -866245146(0xffffffffcc5e25e6, float:-5.8234776E7)
            X.AnonymousClass0fD.A09(r0, r2)
            return r3
        L_0x014e:
            X.DiE r0 = X.C46634DiE.A0M
            goto L_0x013f
        L_0x0151:
            X.DiE r0 = X.C46634DiE.A0P
            goto L_0x013f
        L_0x0154:
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0161
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00d1
            r4.setChecked(r5)
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            java.lang.String r0 = r0.A02
            r0.getClass()
            r10.A07 = r0
            com.instagram.nux.cal.model.FXCalAgeInfo r0 = r10.A03
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1F.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
