package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.U8z  reason: case insensitive filesystem */
public final class C14788U8z extends 2YL {
    public C15026UKf A00;
    public XIGIGBoostDestination A01;
    public VRT A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final C16176Uq1 A06;
    public final IGBoostPackagesFlowInfo A07;
    public final UserSession A08;
    public final ProductType A09;
    public final String A0A;
    public final String A0B;
    public final Currency A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C20606Wvn(this, 34));
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final 1wn A0G;

    public C14788U8z(XIGIGBoostDestination xIGIGBoostDestination, C16176Uq1 uq1, IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo, UserSession userSession, ProductType productType, String str, String str2, Currency currency, int i) {
        0qQ.A0B(userSession, 1);
        Currency currency2 = currency;
        0qQ.A0B(currency2, 4);
        String str3 = str;
        String str4 = str2;
        C51972G9s.A1E(str3, str4);
        this.A08 = userSession;
        this.A06 = uq1;
        this.A07 = iGBoostPackagesFlowInfo;
        this.A0C = currency2;
        this.A05 = i;
        this.A0A = str3;
        this.A0B = str4;
        this.A01 = xIGIGBoostDestination;
        this.A09 = productType;
        02z r0 = new 02z(new UL6(new ULT(0, -1, 2, 3), new C59721JVf((Integer) null, (List) 0sn.A00, 23), (N4Q) null, (ULZ) null, (String) null, true, false, AnonymousClass7TF.A1V(this.A01)));
        this.A0E = r0;
        this.A0F = r0;
        C318136oS A002 = C318116oQ.A00(this);
        MH8 mh8 = new MH8((Object) this, (AnonymousClass4D7) null, 44);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mh8, A002);
        1Eo.A05(r3, new MH8((Object) this, (AnonymousClass4D7) null, 43), C318116oQ.A00(this));
        this.A0G = new C19221WQb(this, 9);
    }

    public static final void A03(C14788U8z u8z, boolean z) {
        Object value;
        boolean z2;
        ULT ult;
        C59721JVf jVf;
        boolean z3;
        ULZ ulz;
        N4Q n4q;
        String str;
        boolean z4 = z;
        u8z.A04 = z;
        05G r2 = u8z.A0E;
        do {
            value = r2.getValue();
            UL6 ul6 = (UL6) value;
            z2 = ul6.A07;
            ult = ul6.A00;
            jVf = ul6.A01;
            z3 = ul6.A05;
            ulz = ul6.A03;
            n4q = ul6.A02;
            str = ul6.A04;
            AnonymousClass7TG.A1Q(ult, jVf);
        } while (!r2.AIY(value, new UL6(ult, jVf, n4q, ulz, str, z2, z4, z3)));
    }

    public final void A04(Integer num) {
        Object value;
        UL6 ul6;
        ULT ult;
        C59721JVf jVf;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 1;
        Integer num2 = num;
        if (num == null) {
            i = 0;
        }
        WGU.A00(this.A08).A0F(C16678UzE.BOOST_PACKAGES, AnonymousClass7TG.A0m(num2, "boost_packages_option_", new StringBuilder()));
        05G r2 = this.A0E;
        do {
            value = r2.getValue();
            ul6 = (UL6) value;
            ULT ult2 = ul6.A00;
            ult = new ULT(i, ult2.A01, ult2.A03, 3);
            List list = (List) ul6.A01.A00;
            0qQ.A0B(list, 1);
            jVf = new C59721JVf(num2, list, 23);
            z = ul6.A07;
            z2 = ul6.A06;
            z3 = ul6.A05;
        } while (!r2.AIY(value, new UL6(ult, jVf, ul6.A02, ul6.A03, ul6.A04, z, z2, z3)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x004b: MOVE  (r1v3 X.XAI) = (r1v2 X.XAI)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static final void A00(X.C14788U8z r8) {
        /*
            X.0Ud r3 = r8.A0F
            java.lang.Object r0 = r3.getValue()
            X.UL6 r0 = (X.UL6) r0
            X.Jw3 r2 = r0.A01()
            if (r2 == 0) goto L_0x0095
            X.VRT r1 = r8.A02
            if (r1 == 0) goto L_0x0079
            java.lang.Object r0 = r3.getValue()
            X.UL6 r0 = (X.UL6) r0
            X.JVf r0 = r0.A01
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = X.DbX.A02(r0)
            java.lang.Object r6 = r2.A02
            java.util.Currency r6 = (java.util.Currency) r6
            int r5 = r2.A00
            java.lang.Object r0 = r3.getValue()
            X.UL6 r0 = (X.UL6) r0
            int r0 = r0.A00()
            int r5 = r5 * r0
            java.lang.Object r0 = r3.getValue()
            X.UL6 r0 = (X.UL6) r0
            int r4 = r0.A00()
            r0 = 1
            X.0qQ.A0B(r6, r0)
            X.Ua6 r0 = r1.A01
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            boolean r0 = r1 instanceof X.XAI
            if (r0 == 0) goto L_0x0079
            X.XAI r1 = (X.XAI) r1
            if (r1 == 0) goto L_0x0079
            com.instagram.business.promote.model.PromoteData r3 = r1.Bhh()
            java.util.List r0 = r3.A21
            r0.clear()
            com.instagram.business.promote.model.IGBoostPackagesFlowInfo r0 = r3.A0m
            if (r0 == 0) goto L_0x006e
            com.instagram.business.promote.model.PromoteAudience r2 = r0.A01
            if (r2 == 0) goto L_0x006e
            java.lang.String r0 = r2.A05
            r3.A1Z = r0
            java.util.Map r1 = r3.A22
            X.0qQ.A06(r1)
            java.lang.String r0 = r2.A05
            r1.put(r0, r2)
        L_0x006e:
            r3.A0H = r7
            r3.A1j = r6
            r3.A0I = r5
            r3.A0A = r4
            r0 = 0
            r3.A2v = r0
        L_0x0079:
            X.VRT r0 = r8.A02
            if (r0 == 0) goto L_0x0095
            X.Ua6 r0 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            boolean r0 = r2 instanceof X.X3Q
            if (r0 == 0) goto L_0x0095
            X.X3Q r2 = (X.X3Q) r2
            if (r2 == 0) goto L_0x0095
            X.UzE r1 = X.C16678UzE.BOOST_PACKAGES
            X.WOe r0 = new X.WOe
            r0.<init>(r8)
            r2.AMi(r1, r0)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14788U8z.A00(X.U8z):void");
    }

    public static final void A01(C14788U8z u8z, String str) {
        if (!0qQ.A0K(u8z.A03, str)) {
            u8z.A03 = str;
            AnonymousClass7TE.A1Z(new MGE(u8z, str, (AnonymousClass4D7) null, 22), C318116oQ.A00(u8z));
        }
    }

    public static final void A02(C14788U8z u8z, String str, String str2) {
        u8z.A06.A00 = new HashMap();
        String str3 = null;
        u8z.A03 = null;
        u8z.A00 = null;
        UserSession userSession = u8z.A08;
        AnonymousClass1Nd.A00(userSession).A01(u8z.A0G, WQL.class);
        WGU A002 = WGU.A00(userSession);
        C16678UzE uzE = C16678UzE.BOOST_PACKAGES;
        A002.A0R(uzE.toString(), str2);
        WGU A003 = WGU.A00(userSession);
        String str4 = str;
        WGU.A06(A003, A003.A01, C16678UzE.REQUIRED_BILLING_WIZARD.toString(), str);
        VRT vrt = u8z.A02;
        if (vrt != null) {
            String A0t = DbS.A0t(u8z.A0D);
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject put = new JSONObject().put("currency", u8z.A0C.getCurrencyCode());
                N4Q n4q = ((UL6) u8z.A0F.getValue()).A02;
                if (n4q != null) {
                    jSONObject.put("payment_amount", put.put("amount", n4q.A00));
                    str3 = jSONObject.toString();
                }
            } catch (JSONException unused) {
            }
            0qQ.A0B(A0t, 0);
            C15299Ua6 ua6 = vrt.A01;
            FragmentActivity activity = ua6.getActivity();
            if (activity != null) {
                AnonymousClass0eM r3 = ua6.A0F;
                JTU.A0D(r3).A0R(uzE.toString(), 002.A0R("open_billing_wizard_", str));
                C18676VwZ.A02(activity, new WOH(activity, ua6, A0t, str4, str3), AnonymousClass7TE.A0l(r3), false);
            }
        }
    }
}
