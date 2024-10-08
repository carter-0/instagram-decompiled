package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.UaQ  reason: case insensitive filesystem */
public final class C15318UaQ extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, X3L {
    public static final String __redex_internal_original_name = "PromoteBeneficiaryAndPayerFragment";
    public Drawable A00;
    public Drawable A01;
    public C18654Vw9 A02;
    public UserSession A03;
    public String A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C20694WxQ(this, 1));
    public final AnonymousClass0eM A06;

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131970220);
        DbX.A1A(new C18887WAz(this, 54), DbX.A0M(), r4);
        r4.Eu4(true);
    }

    public final String getModuleName() {
        return "promote_beneficiary_and_payer_view";
    }

    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        if (r0 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        r0 = "errorIcon";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
        r2.setImageDrawable(r0);
        r1 = X.DbU.A0G(r8, com.instagram.android.R.id.beneficiary_input);
        r1.setText(((X.U8R) r5.getValue()).A00);
        r1.addTextChangedListener(new X.W7Z(0, r2, r7));
        r2 = X.DbX.A0J(r8, com.instagram.android.R.id.payer_status_icon);
        r0 = ((X.U8R) r5.getValue()).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c9, code lost:
        if (r0 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
        if (r0.length() == 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d1, code lost:
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        if (r0 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d6, code lost:
        r0 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
        if (r0 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
        r2.setImageDrawable(r0);
        r1 = X.DbU.A0G(r8, com.instagram.android.R.id.payer_input);
        r1.setText(((X.U8R) r5.getValue()).A01);
        r1.addTextChangedListener(new X.W7Z(1, r2, r7));
        r4 = X.C16678UzE.BENEFICIARY_AND_PAYER;
        r0 = new X.C18654Vw9(r8, r4);
        r7.A02 = r0;
        r0.A01();
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0106, code lost:
        if (r2 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0108, code lost:
        X.C18165Vmf.A01(r7, r2, requireContext().getString(2131970221));
        r3 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0118, code lost:
        if (r3 == null) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011a, code lost:
        r2 = (X.U8R) r5.getValue();
        r0 = r2.A00;
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0123, code lost:
        if (r0 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0129, code lost:
        if (r0.length() == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012b, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012d, code lost:
        if (r0 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0133, code lost:
        if (r0.length() == 0) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0135, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0136, code lost:
        r3.A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0139, code lost:
        X.C13991Tnr.A0w(r7);
        X.C13988Tno.A1J(X.C13990Tnq.A0M(r7.A05), r4);
        super.onViewCreated(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014e, code lost:
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008a, code lost:
        if (r0 == null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r6 = 0
            android.content.Context r1 = X.DbT.A06(r7, r8, r6)
            r0 = 2131970222(0x7f1348ae, float:1.957739E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131970223(0x7f1348af, float:1.9577391E38)
            r4 = 1
            android.text.SpannableStringBuilder r2 = X.DbY.A0D(r1, r3, r0)
            int r1 = X.Dbb.A04(r7)
            X.UsT r0 = new X.UsT
            r0.<init>((X.C15318UaQ) r7, (int) r1)
            X.AnonymousClass7AV.A05(r2, r0, r3)
            r0 = 2131438646(0x7f0b2c36, float:1.8499225E38)
            android.widget.TextView r0 = X.DbU.A0G(r8, r0)
            X.DbX.A1G(r0, r2)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131238258(0x7f081d72, float:1.809279E38)
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r0)
            java.lang.String r3 = "Required value was null."
            if (r2 == 0) goto L_0x0155
            r7.A01 = r2
            android.content.Context r1 = r7.requireContext()
            android.content.Context r0 = r7.getContext()
            int r0 = X.2Yu.A03(r0)
            X.DbX.A11(r1, r2, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131238106(0x7f081cda, float:1.8092481E38)
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
            if (r5 == 0) goto L_0x014f
            r7.A00 = r5
            android.content.Context r2 = r7.requireContext()
            android.content.Context r1 = r7.getContext()
            r0 = 2130970331(0x7f0406db, float:1.754937E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbX.A11(r2, r5, r0)
            r0 = 2131428653(0x7f0b052d, float:1.8478957E38)
            android.widget.ImageView r2 = X.DbX.A0J(r8, r0)
            X.0eM r5 = r7.A06
            java.lang.Object r0 = r5.getValue()
            X.U8R r0 = (X.U8R) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0096
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0096
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 != 0) goto L_0x009d
        L_0x008c:
            java.lang.String r0 = "checkIcon"
        L_0x008e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0096:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 != 0) goto L_0x009d
        L_0x009a:
            java.lang.String r0 = "errorIcon"
            goto L_0x008e
        L_0x009d:
            r2.setImageDrawable(r0)
            r0 = 2131428650(0x7f0b052a, float:1.847895E38)
            android.widget.TextView r1 = X.DbU.A0G(r8, r0)
            java.lang.Object r0 = r5.getValue()
            X.U8R r0 = (X.U8R) r0
            java.lang.String r0 = r0.A00
            r1.setText(r0)
            X.W7Z r0 = new X.W7Z
            r0.<init>(r6, r2, r7)
            r1.addTextChangedListener(r0)
            r0 = 2131437501(0x7f0b27bd, float:1.8496902E38)
            android.widget.ImageView r2 = X.DbX.A0J(r8, r0)
            java.lang.Object r0 = r5.getValue()
            X.U8R r0 = (X.U8R) r0
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00d6
            android.graphics.drawable.Drawable r0 = r7.A00
            if (r0 != 0) goto L_0x00db
            goto L_0x008c
        L_0x00d6:
            android.graphics.drawable.Drawable r0 = r7.A01
            if (r0 != 0) goto L_0x00db
            goto L_0x009a
        L_0x00db:
            r2.setImageDrawable(r0)
            r0 = 2131437499(0x7f0b27bb, float:1.8496898E38)
            android.widget.TextView r1 = X.DbU.A0G(r8, r0)
            java.lang.Object r0 = r5.getValue()
            X.U8R r0 = (X.U8R) r0
            java.lang.String r0 = r0.A01
            r1.setText(r0)
            X.W7Z r0 = new X.W7Z
            r0.<init>(r4, r2, r7)
            r1.addTextChangedListener(r0)
            X.UzE r4 = X.C16678UzE.BENEFICIARY_AND_PAYER
            X.Vw9 r0 = new X.Vw9
            r0.<init>(r8, r4)
            r7.A02 = r0
            r0.A01()
            X.Vw9 r2 = r7.A02
            if (r2 == 0) goto L_0x0149
            android.content.Context r1 = r7.requireContext()
            r0 = 2131970221(0x7f1348ad, float:1.9577387E38)
            java.lang.String r0 = r1.getString(r0)
            X.C18165Vmf.A01(r7, r2, r0)
            X.Vw9 r3 = r7.A02
            if (r3 == 0) goto L_0x0139
            java.lang.Object r2 = r5.getValue()
            X.U8R r2 = (X.U8R) r2
            java.lang.String r0 = r2.A00
            r1 = 0
            if (r0 == 0) goto L_0x0136
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = r2.A01
            if (r0 == 0) goto L_0x0136
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0136
            r1 = 1
        L_0x0136:
            r3.A04(r1)
        L_0x0139:
            X.C13991Tnr.A0w(r7)
            X.0eM r0 = r7.A05
            X.WGU r0 = X.C13990Tnq.A0M(r0)
            X.C13988Tno.A1J(r0, r4)
            super.onViewCreated(r8, r9)
            return
        L_0x0149:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x014f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0155:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15318UaQ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void CtD() {
        String str;
        AnonymousClass0eM r3 = this.A06;
        U8R u8r = (U8R) r3.getValue();
        PromoteData promoteData = u8r.A02;
        promoteData.A2E = true;
        promoteData.A1C = u8r.A00;
        promoteData.A1D = u8r.A01;
        C13990Tnq.A0M(this.A05).A0B(C16678UzE.BENEFICIARY_AND_PAYER, ((U8R) r3.getValue()).A02);
        String str2 = this.A04;
        if (str2 == null) {
            str = "previousStep";
        } else {
            if (JTQ.A1Y(C16678UzE.SUMMARY, str2)) {
                DbT.A1I(this);
            }
            C13990Tnq.A0h();
            C15320UaS uaS = new C15320UaS();
            FragmentActivity requireActivity = requireActivity();
            UserSession userSession = this.A03;
            if (userSession != null) {
                C309516Yo A0B = Dba.A0B(requireActivity, userSession);
                A0B.A0D(uaS);
                A0B.A04();
                return;
            }
            str = "session";
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

    public C15318UaQ() {
        C20694WxQ wxQ = new C20694WxQ(this, 5);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20694WxQ(new C20694WxQ(this, 2), 3));
        this.A06 = new C227862kA(new C20694WxQ(A002, 4), wxQ, new C41566AwY(14, (Object) null, A002), new 0Yh(U8R.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2086088463);
        C15318UaQ.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("step");
            if (string != null) {
                this.A04 = string;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(1668439938, A022);
                throw A0y;
            }
        }
        this.A03 = ((U8R) this.A06.getValue()).A02.A0y;
        AnonymousClass0fD.A09(1778796137, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(774019845);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_beneficiary_and_payer_view, viewGroup, false);
        AnonymousClass0fD.A09(-776821347, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1871407683);
        super.onDestroyView();
        AnonymousClass0fD.A09(1991881752, A022);
    }
}
