package X;

import android.view.View;
import android.widget.RadioButton;
import com.instagram.android.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E6s  reason: case insensitive filesystem */
public final class C47531E6s extends C273374mT {
    public static final String __redex_internal_original_name = "ChangeAccountPrivacyFragment";
    public RadioButton A00;
    public RadioButton A01;
    public ProgressButton A02;
    public FRN A03;

    public final String getModuleName() {
        return "account_privacy_nux";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0022: MOVE  (r1v3 X.G8t) = (r1v2 X.G8t)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A02(X.C47531E6s r3) {
        /*
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r3.getSession()
            com.instagram.user.model.User r1 = r1.A01(r0)
            android.widget.RadioButton r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.isChecked()
            if (r0 != r2) goto L_0x0032
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0017:
            r1.A0q(r0)
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            boolean r0 = r1 instanceof X.C51950G8t
            if (r0 == 0) goto L_0x002a
            X.G8t r1 = (X.C51950G8t) r1
            if (r1 == 0) goto L_0x002a
            r1.Cm0(r2)
        L_0x0029:
            return
        L_0x002a:
            X.FRN r0 = r3.A03
            if (r0 == 0) goto L_0x0029
            r0.A01()
            return
        L_0x0032:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47531E6s.A02(X.E6s):void");
    }

    private final void A00(View view) {
        DbU.A13(requireContext(), DbX.A0J(view, R.id.icon), R.drawable.instagram_unlock_pano_outline_24);
        AnonymousClass7TG.A0R(view, R.id.title_view).setText(2131952090);
        AnonymousClass7TG.A0R(view, R.id.content_view).setText(2131952091);
        this.A01 = (RadioButton) view.requireViewById(R.id.radio_button);
        FP0.A00(view, 39, this);
    }

    private final void A01(View view, boolean z) {
        DbU.A13(requireContext(), DbX.A0J(view, R.id.icon), R.drawable.instagram_lock_pano_outline_24);
        AnonymousClass7TG.A0R(view, R.id.title_view).setText(2131952088);
        AnonymousClass7TG.A0R(view, R.id.content_view).setText(2131952089);
        RadioButton radioButton = (RadioButton) view.requireViewById(R.id.radio_button);
        this.A00 = radioButton;
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
        FP0.A00(view, 38, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 167319104(0x9f91640, float:5.9965493E-33)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            android.view.View r3 = X.DbT.A0C(r9, r10, r0)
            X.0qQ.A07(r3)
            r5 = 2131628049(0x7f0e1011, float:1.888338E38)
            android.view.ViewGroup r0 = X.Dba.A04(r3)
            r1 = 1
            r9.inflate(r5, r0, r1)
            com.instagram.common.session.UserSession r0 = r8.getSession()
            com.instagram.user.model.User r6 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.Integer r5 = r6.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r7 = 0
            if (r5 != r0) goto L_0x00aa
            r1 = 0
            X.4Cl r0 = r6.A03
            java.lang.Boolean r0 = r0.BiF()
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00aa
            r0 = 2131443080(0x7f0b3d88, float:1.8508218E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            r8.A00(r0)
            r0 = 2131428937(0x7f0b0649, float:1.8479533E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            r8.A01(r0, r4)
        L_0x0054:
            r0 = 2131438591(0x7f0b2bff, float:1.8499113E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r8.A02 = r0
            if (r0 == 0) goto L_0x0064
            r0.setEnabled(r1)
        L_0x0064:
            com.instagram.ui.widget.progressbutton.ProgressButton r5 = r8.A02
            if (r5 == 0) goto L_0x006d
            r0 = 8
            X.FPG.A00(r5, r0, r6, r8)
        L_0x006d:
            com.instagram.common.session.UserSession r5 = r8.getSession()
            java.lang.String r0 = "nux_account_privacy"
            X.C49938FFr.A01(r5, r0)
            com.instagram.common.session.UserSession r6 = r8.getSession()
            com.instagram.common.session.UserSession r0 = r8.getSession()
            java.lang.String r5 = r0.A06
            android.widget.RadioButton r0 = r8.A00
            if (r0 == 0) goto L_0x0088
            boolean r7 = r0.isChecked()
        L_0x0088:
            X.0qQ.A0B(r6, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "android_pbd_nux_impression"
            X.C49214ErJ.A00(r6, r4, r1, r5, r0)
            com.instagram.common.session.UserSession r1 = r8.getSession()
            X.FRN r0 = new X.FRN
            r0.<init>(r8, r8, r1)
            r8.A03 = r0
            r0 = 753774414(0x2cedaf4e, float:6.755408E-12)
            X.AnonymousClass0fD.A09(r0, r2)
            return r3
        L_0x00aa:
            r0 = 2131443080(0x7f0b3d88, float:1.8508218E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            r8.A01(r0, r1)
            r0 = 2131428937(0x7f0b0649, float:1.8479533E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            r8.A00(r0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47531E6s.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1662567347);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(-1538899994, A022);
    }
}
