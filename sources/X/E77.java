package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.registration.ui.NotificationBar;

public final class E77 extends C273374mT implements C61110lV, AnonymousClass4DR, G8C {
    public static final String __redex_internal_original_name = "AdditionalContactFragment";
    public NotificationBar A00;
    public EEK A01;
    public String A02;
    public String A03;
    public TextView A04;
    public IgdsHeadline A05;
    public final 1P0 A06 = new C47691EDa(this, 4);

    public final void APF() {
    }

    public final void ARL() {
    }

    public final boolean Ca3() {
        return true;
    }

    public final String getModuleName() {
        return "nux_additional_contact";
    }

    public final EXD B6Y() {
        return EXD.A03;
    }

    public final C46634DiE BzS() {
        return C46634DiE.A08;
    }

    public final void DaH(boolean z) {
        this.A04.setEnabled(z);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A02(getSession(), "additional_contact");
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0008: MOVE  (r1v2 X.G8t) = (r1v0 X.G8t)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static void A00(X.E77 r2, boolean r3) {
        /*
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            boolean r0 = r1 instanceof X.C51950G8t
            if (r0 == 0) goto L_0x0010
            X.G8t r1 = (X.C51950G8t) r1
            if (r1 == 0) goto L_0x0010
            r1.Cm0(r3)
            return
        L_0x0010:
            com.instagram.common.session.UserSession r1 = X.DbX.A0U(r2)
            X.FRN r0 = new X.FRN
            r0.<init>(r2, r2, r1)
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E77.A00(X.E77, boolean):void");
    }

    public final void DUM() {
        1OC A052 = C318486p2.A05(DbT.A0X(C227642jf.A02(this)), this.A02, this.A03, false);
        A052.A00 = this.A06;
        schedule(A052);
        C49881FBf.A00.A02(getSession(), "additional_contact");
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1769440619);
        UserSession session = getSession();
        double A002 = Dbb.A00(session);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(session), "step_view_backgrounded");
        DbZ.A1G(A0e, A002, A003);
        FH8.A06(A0e);
        DbW.A12(A0e, A003);
        DbS.A1H(A0e, "additional_contact");
        DbZ.A1E(A0e);
        FH8.A08(A0e, session);
        AnonymousClass0fD.A0A(-1568147908, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-22234090, AnonymousClass0fD.A03(-2005476464));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-400610349);
        E77.super.onCreate(bundle);
        this.A03 = DbU.A0l(requireArguments(), Dbj.A04(39, 17, 26));
        this.A02 = DbU.A0l(requireArguments(), Dbj.A00());
        AnonymousClass0fD.A09(1770111685, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1667755995);
        UserSession session = getSession();
        AnonymousClass7TG.A1N(session, "additional_contact");
        C49938FFr.A01(session, "additional_contact");
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.nux_additional_contact_fragment, Dba.A04(A0C), true);
        this.A00 = Dba.A0M(A0C);
        TextView A0G = DbU.A0G(A0C, R.id.skip_button);
        this.A04 = A0G;
        A0G.setText(2131973923);
        FP0.A00(this.A04, 29, this);
        this.A05 = DbZ.A0U(A0C, R.id.field_title_igds);
        String str = this.A02;
        try {
            PhoneNumberUtil A012 = PhoneNumberUtil.A01(requireActivity());
            str = A012.A0I(A012.A0F(str, C3270479e.A00(requireActivity()).A00), AnonymousClass05K.A0C);
        } catch (C231962sh unused) {
            UserSession session2 = getSession();
            double A002 = Dbb.A00(session2);
            double A003 = DbS.A00();
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(session2), "additional_phone_number_parse_fail");
            DbZ.A1G(A0e, A002, A003);
            FH8.A05(A0e);
            DbY.A1I(A0e, "module", "waterfall_log_in", A003);
            DbZ.A1J(A0e, "additional_contact");
            FH8.A0C(A0e, session2);
        }
        this.A05.setHeadline((CharSequence) 0mp.A06(DbV.A05(this).getString(2131952468), new Object[]{str}));
        this.A05.EZe(R.drawable.phone, true);
        EEK eek = new EEK((TextView) null, getSession(), this, Dba.A0O(A0C));
        this.A01 = eek;
        registerLifecycleListener(eek);
        14i.A08.A0A(this);
        AnonymousClass0fD.A09(1069600968, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-934732912);
        super.onDestroyView();
        unregisterLifecycleListener(this.A01);
        14i.A06(this);
        this.A05 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-754821389, A022);
    }
}
