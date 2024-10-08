package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import java.util.LinkedHashMap;
import kotlin.Deprecated;

@Deprecated(message = "Only used on ECP 1.0")
/* renamed from: X.QhO  reason: case insensitive filesystem */
public final class C8130QhO extends QCJ implements C13732Tg4 {
    public ContextThemeWrapper A00;
    public 00Y A01;
    public C13844TiK A02;
    public QEe A03;
    public LoggingContext A04;
    public boolean A05;
    public ECPHandler A06;
    public final 0sP A07 = TY2.A00(this, 41);
    public final 0sP A08 = TY2.A00(this, 42);
    public final 0sL A09 = new MPO(this, 14);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r5 = 0
            r8 = r25
            X.0qQ.A0B(r8, r5)
            r3 = r24
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "ECP_ENABLE_REDESIGN"
            boolean r0 = r1.getBoolean(r0)
            r3.A05 = r0
            r0 = r26
            super.onViewCreated(r8, r0)
            r0 = 2131432160(0x7f0b12e0, float:1.848607E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r8, r0)
            r0 = 2131430689(0x7f0b0d21, float:1.8483086E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r8, r0)
            boolean r0 = r3.A05
            r6 = 0
            if (r0 != 0) goto L_0x0137
            r1.setMinimumHeight(r5)
        L_0x002f:
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 == 0) goto L_0x00f8
            r0 = 2131439338(0x7f0b2eea, float:1.8500628E38)
            android.view.View r2 = r8.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r0 = 1
            X.DbU.A15(r1, r2, r0, r5)
            r2.setItemAnimator(r6)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "ECP_FORM_NAV_BAR_STYLE"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0151
            X.RFs r0 = (X.C8924RFs) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x005c
            X.SSH r0 = X.C9961RkG.A00
            r0.A04(r2)
        L_0x005c:
            com.facebookpay.logging.LoggingContext r1 = r3.A04
            java.lang.String r15 = "loggingContext"
            if (r1 == 0) goto L_0x0140
            X.RH6 r0 = X.RH6.A0p
            X.QeQ r14 = new X.QeQ
            r14.<init>(r0, r1, r5)
            X.0sP r0 = r3.A07
            X.Qek r13 = new X.Qek
            r13.<init>(r1, r0, r5, r5)
            X.0sP r1 = r3.A08
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qec r12 = new X.Qec
            r12.<init>(r0, r1)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qeh r11 = new X.Qeh
            r11.<init>(r0, r1, r5)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qeb r10 = new X.Qeb
            r10.<init>(r0, r1)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qee r9 = new X.Qee
            r9.<init>(r0, r1)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qea r8 = new X.Qea
            r8.<init>(r0, r1)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qed r7 = new X.Qed
            r7.<init>(r0, r1)
            com.facebookpay.logging.LoggingContext r0 = r3.A04
            if (r0 == 0) goto L_0x0140
            X.Qef r6 = new X.Qef
            r6.<init>(r0, r1, r5)
            com.facebookpay.logging.LoggingContext r5 = r3.A04
            if (r5 == 0) goto L_0x0140
            boolean r4 = r3.A05
            X.RH6 r1 = X.RH6.A0u
            X.QeR r0 = new X.QeR
            r0.<init>(r1, r5, r4)
            X.0eP r14 = X.QEW.A05(r14)
            X.0eP r15 = X.QEW.A05(r13)
            X.0eP r16 = X.QEW.A05(r12)
            X.0eP r17 = X.QEW.A05(r11)
            X.0eP r18 = X.QEW.A05(r10)
            X.0eP r19 = X.QEW.A05(r9)
            X.0eP r20 = X.QEW.A05(r8)
            X.0eP r21 = X.QEW.A05(r7)
            X.0eP r22 = X.QEW.A05(r6)
            X.0eP r23 = X.QEW.A05(r0)
            X.0eP[] r0 = new X.0eP[]{r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.util.LinkedHashMap r1 = X.0Yt.A06(r0)
            X.QEe r0 = new X.QEe
            r0.<init>(r1)
            r3.A03 = r0
            r2.setAdapter(r0)
        L_0x00f8:
            X.TiK r0 = r3.A02
            java.lang.String r15 = "viewModel"
            if (r0 == 0) goto L_0x0140
            X.2Fk r1 = r0.ELG()
            r0 = 43
            X.TY2 r0 = X.TY2.A00(r3, r0)
            r5 = 10
            X.C51969G9p.A15(r3, r1, r0, r5)
            X.TiK r0 = r3.A02
            if (r0 == 0) goto L_0x0140
            X.2Fj r1 = r0.AuQ()
            r0 = 44
            X.TY2 r0 = X.TY2.A00(r3, r0)
            X.C51969G9p.A15(r3, r1, r0, r5)
            X.TiK r4 = r3.A02
            if (r4 == 0) goto L_0x0140
            boolean r0 = r4 instanceof X.QDR
            if (r0 == 0) goto L_0x0136
            X.QDR r4 = (X.QDR) r4
            if (r4 == 0) goto L_0x0136
            X.2Fj r2 = r4.A09
            r1 = 6
            X.J6l r0 = new X.J6l
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            X.C51969G9p.A15(r3, r2, r0, r5)
        L_0x0136:
            return
        L_0x0137:
            X.SQz r4 = X.C9972RkR.A00
            android.view.ContextThemeWrapper r2 = r3.A00
            if (r2 != 0) goto L_0x0148
            java.lang.String r15 = "viewContext"
        L_0x0140:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0148:
            r1 = 28
            X.REP r0 = X.REP.ALL_BORDERED_ALL_ROUNDED
            r4.A03(r2, r7, r0, r1)
            goto L_0x002f
        L_0x0151:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8130QhO.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void EUk(ECPHandler eCPHandler) {
        this.A06 = eCPHandler;
    }

    public static final void A02(C21267XRm xRm, C8130QhO qhO, Long l, String str, String str2, String str3, String str4, Throwable th) {
        C12411Sto A002 = C11353SOm.A00();
        LoggingContext loggingContext = qhO.A04;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        if (th != null) {
            str4 = C11302SKm.A01(th);
        }
        LinkedHashMap A0n = Pxi.A0n(loggingContext);
        if (str3 != null) {
            A0n.put("TARGET_NAME", str3);
        }
        if (str2 != null) {
            A0n.put("VIEW_NAME", str2);
        }
        if (l != null) {
            A0n.put("component_data_id", Long.valueOf(l.longValue()));
        }
        A0n.put("CREDENTIAL_TYPE", xRm);
        if (str4 != null) {
            SUU.A0C(str4, "error_message", A0n);
        }
        ImmutableMap copyOf = ImmutableMap.copyOf(A0n);
        0qQ.A07(copyOf);
        A002.Cgl(str, copyOf);
    }

    public final /* synthetic */ boolean D0T(LoggingContext loggingContext, Integer num) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.00i] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r6.A02 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if ((r3 instanceof X.QDR) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r3 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        r6.A01 = registerForActivityResult(new java.lang.Object(), new X.C11536Sbx(r3, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        X.06F.A00(r6, "selectionContentRequestKey", r6.A09);
        X.AnonymousClass0fD.A09(-1473812502, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1916313150(0x72389e3e, float:3.656739E30)
            int r4 = X.AnonymousClass0fD.A02(r0)
            X.C8130QhO.super.onCreate(r7)
            android.os.Parcelable r0 = X.Pxj.A0H(r6)
            com.facebookpay.logging.LoggingContext r0 = (com.facebookpay.logging.LoggingContext) r0
            r6.A04 = r0
            r3 = 0
            if (r0 != 0) goto L_0x001d
            X.Pxh.A11()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            X.QDN r5 = X.C11086S9g.A01(r6, r3, r0)
            android.os.Bundle r0 = r6.mArguments
            java.lang.String r2 = "ECP_SELECTION_FRAGMENT_COMPONENT_ID"
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r0.getString(r2)
            if (r1 == 0) goto L_0x0034
            int r0 = r1.hashCode()
            switch(r0) {
                case -1583857130: goto L_0x0043;
                case -794429895: goto L_0x004e;
                case -670538355: goto L_0x0059;
                case 909774403: goto L_0x0064;
                default: goto L_0x0034;
            }
        L_0x0034:
            java.lang.String r1 = "No ViewModel support for "
            android.os.Bundle r0 = r6.mArguments
            if (r0 == 0) goto L_0x003e
            java.lang.String r3 = r0.getString(r2)
        L_0x003e:
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r3)
            throw r0
        L_0x0043:
            java.lang.String r0 = "FULFILLMENT_OPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.QDR r3 = r5.A1N
            goto L_0x006e
        L_0x004e:
            java.lang.String r0 = "PAYMENT_METHODS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.QDT r3 = r5.A1R
            goto L_0x006e
        L_0x0059:
            java.lang.String r0 = "CONTACT_INFO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.QDU r3 = r5.A1K
            goto L_0x006e
        L_0x0064:
            java.lang.String r0 = "SHIPPING_ADDRESS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0034
            X.QDS r3 = r5.A1U
        L_0x006e:
            r6.A02 = r3
            boolean r0 = r3 instanceof X.QDR
            if (r0 == 0) goto L_0x0087
            if (r3 == 0) goto L_0x0087
            X.0yl r2 = new X.0yl
            r2.<init>()
            r1 = 5
            X.Sbx r0 = new X.Sbx
            r0.<init>(r3, r1)
            X.00Y r0 = r6.registerForActivityResult(r2, r0)
            r6.A01 = r0
        L_0x0087:
            X.0sL r1 = r6.A09
            java.lang.String r0 = "selectionContentRequestKey"
            X.06F.A00(r6, r0, r1)
            r0 = -1473812502(0xffffffffa82767ea, float:-9.292895E-15)
            X.AnonymousClass0fD.A09(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8130QhO.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1658319163);
        ContextThemeWrapper A002 = QCJ.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_selection_content_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1541630284, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-554390041);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            0qQ.A0F("viewContext");
            throw AnonymousClass00P.createAndThrow();
        }
        Object obj = requireArguments().get("ECP_SELECTION_NAV_BAR_STYLE");
        if (obj != null) {
            C9656Rea.A00(contextThemeWrapper, this, (C8924RFs) obj, requireArguments().getString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE"), (String) null, new C13346TVt(this, 8), new C13346TVt(this, 9), false, false);
            AnonymousClass0fD.A09(553046914, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1433258805, A022);
        throw A0y;
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1182375987);
        C8130QhO.super.onStop();
        C13844TiK tiK = this.A02;
        if (tiK == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        tiK.EIE();
        AnonymousClass0fD.A09(842122490, A022);
    }
}
