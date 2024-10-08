package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;

public final class S55 {
    public FrameLayout A00;
    public R8H A01;
    public C3034368u A02;
    public UserSession A03;
    public boolean A04;
    public View A05;
    public 0hq A06;
    public final AnonymousClass2gO A07 = C11649Sdr.A00(this, 10);
    public final C270254gR A08;
    public final C7580QKv A09;
    public final C7580QKv A0A;
    public final STY A0B;
    public final STY A0C;
    public final Map A0D;

    public S55(View view, 0hq r8, C270254gR r9, C7580QKv qKv, STY sty, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        C51974G9v.A0d(3, view, sty, r8, r9);
        this.A09 = qKv;
        this.A0C = sty;
        this.A08 = r9;
        this.A0A = qKv;
        this.A0B = sty;
        this.A0D = AnonymousClass7TE.A1E();
        this.A06 = r8;
        this.A03 = userSession;
        this.A05 = view;
        C10187Ro3 ro3 = new C10187Ro3(this);
        try {
            2IS A042 = C41845B3m.A04();
            A042.A04("bloks_versioning_id", "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969");
            1OC A002 = SQF.A00(new C239113Fa(A042, C7589QNe.class, "IGIABAutofillBloksGraphQLRootQuery", false), userSession);
            A002.A00 = new C385479j0(ro3, 0);
            SQF.A02(A002);
        } catch (IOException e) {
            0wb.A06("AutofillGraphQLRequest", "Error creating Bloks view query request", e);
        }
    }

    public final void A00() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.A00;
        if (frameLayout2 != null && frameLayout2.getVisibility() != 8 && (frameLayout = this.A00) != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        r5 = r6.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r6 = this;
            X.68u r0 = r6.A02
            if (r0 == 0) goto L_0x009b
            android.widget.FrameLayout r0 = r6.A00
            if (r0 != 0) goto L_0x0068
            android.view.View r0 = r6.A05
            r4 = 2131434039(0x7f0b1a37, float:1.848988E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.A00 = r0
            com.instagram.common.session.UserSession r0 = r6.A03
            java.lang.String r3 = r0.A05
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.R8H r2 = new X.R8H
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r3)
            r2.setArguments(r1)
            X.0hq r1 = r6.A06
            X.0s1 r0 = new X.0s1
            r0.<init>(r1)
            r0.A0A(r2, r4)
            r0.A01()
            X.68u r0 = r6.A02
            if (r0 == 0) goto L_0x00b8
            r2.A01 = r0
            r6.A01 = r2
            r1 = 4
            X.TY5 r0 = new X.TY5
            r0.<init>(r6, r1)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.util.Map r2 = r6.A0D
            java.lang.String r0 = "on_accept_payment_autofill"
            r2.put(r0, r1)
            r1 = 10
            X.TY5 r0 = new X.TY5
            r0.<init>(r6, r1)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "open_browser_settings"
            r2.put(r0, r1)
        L_0x0068:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x009b
            X.QKv r5 = r6.A0A
            android.content.Context r4 = r5.A00
            if (r4 == 0) goto L_0x009b
            X.4gR r3 = r6.A08
            X.1yd r1 = r3.A04
            r0 = 0
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x009c
            X.2Fg r2 = new X.2Fg
            r2.<init>(r4, r3)
            android.content.Context r1 = r2.A04
            java.lang.String r0 = "org.chromium.intent.action.IS_READY_TO_PAY"
            android.content.Intent r0 = X.2Fg.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x009b
            X.07Z r1 = r5.A03()
            if (r1 == 0) goto L_0x009b
            X.Svr r0 = new X.Svr
            r0.<init>(r1, r6, r2)
            r2.A04(r0)
        L_0x009b:
            return
        L_0x009c:
            X.STY r0 = r5.A07
            if (r0 == 0) goto L_0x009b
            X.S33 r3 = r0.A09
            if (r3 == 0) goto L_0x009b
            r0 = 9
            X.Sdr r2 = X.C11649Sdr.A00(r6, r0)
            X.07Z r1 = r5.A03()
            if (r1 == 0) goto L_0x009b
            X.2Fj r0 = r3.A00()
            r0.A06(r1, r2)
            return
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S55.A01():void");
    }
}
