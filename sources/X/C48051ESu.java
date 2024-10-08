package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESu  reason: case insensitive filesystem */
public final class C48051ESu extends C2806552w {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(FragmentActivity fragmentActivity, UserSession userSession, String str, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d2, code lost:
        r1 = X.Dba.A0J(r3, r2, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ef, code lost:
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r3.A02(r2, r1, new com.instagram.simplewebview.SimpleWebViewConfig((java.lang.String) null, (java.lang.String) null, r7, r7, r7, r7, r7, true, r7, r7, true, r7, r7, r7, r4.A03, r20));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r4 = r21
            int r0 = r4.A00
            r1 = r22
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x0061;
                case 2: goto L_0x00c6;
                case 3: goto L_0x009f;
                case 4: goto L_0x003c;
                case 5: goto L_0x0092;
                case 6: goto L_0x007c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r4.A02
            X.H1d r0 = (X.C54159H1d) r0
            X.0eM r0 = r0.A03
            X.0lg r1 = X.DbT.A0X(r0)
            java.lang.String r20 = "https://help.instagram.com/1146896693058557?ref=learn_more"
        L_0x001f:
            r5 = 0
            java.lang.String r0 = r4.A03
            r12 = 1
            com.instagram.simplewebview.SimpleWebViewConfig r4 = new com.instagram.simplewebview.SimpleWebViewConfig
            r6 = r5
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            r13 = r7
            r14 = r7
            r15 = r12
            r16 = r7
            r17 = r7
            r18 = r7
            r19 = r0
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r3.A02(r2, r1, r4)
        L_0x003b:
            return
        L_0x003c:
            java.lang.Object r5 = r4.A02
            X.Ums r5 = (X.C16011Ums) r5
            android.app.Activity r3 = r5.getRootActivity()
            if (r3 == 0) goto L_0x003b
            java.lang.String r9 = r4.A03
            java.lang.Object r8 = r4.A01
            X.D9d r8 = (X.C45884D9d) r8
            X.Vze r2 = X.C18744Vze.A00
            X.0eM r0 = r5.A09
            java.lang.Object r0 = r0.getValue()
            X.UnR r0 = (X.C16038UnR) r0
            com.instagram.common.session.UserSession r6 = r0.A04
            android.os.Bundle r4 = r5.requireArguments()
            r7 = r5
            r2.A01(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0061:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r4.A02
            X.E2f r0 = (X.C47433E2f) r0
            X.0eM r0 = r0.A03
            X.0lg r1 = X.DbT.A0X(r0)
            r0 = 15
            java.lang.String r20 = X.C66579MXk.A00(r0)
            goto L_0x001f
        L_0x007c:
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r2 = r4.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r4.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.String r5 = r4.A03
            X.2EG r4 = X.2EG.A2X
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00ef
        L_0x0092:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r4.A03
            X.2EG r0 = X.2EG.A0Y
            goto L_0x00d2
        L_0x009f:
            java.lang.Object r0 = r4.A02
            X.Gs1 r0 = (X.C53648Gs1) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.WGU r2 = X.WGU.A00(r0)
            X.UzE r1 = X.C16678UzE.FEED_CONTEXTUAL_SELF_PROFILE
            java.lang.String r0 = "learn_more_text"
            r2.A0F(r1, r0)
            X.14B r2 = X.DbT.A0e()
            java.lang.Object r1 = r4.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r4.A03
            android.net.Uri r0 = X.DbT.A09(r0)
            android.content.Intent r0 = r2.A04(r1, r0)
            X.0kR.A0B(r1, r0)
            return
        L_0x00c6:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.String r1 = r4.A03
            X.2EG r0 = X.2EG.A1V
        L_0x00d2:
            X.SUL r1 = X.Dba.A0J(r3, r2, r0, r1)
            goto L_0x00ef
        L_0x00d7:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r1 = X.2EG.A0e
            r0 = 14
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = r4.A03
            r1.A0S = r0
        L_0x00ef:
            r1.A0A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48051ESu.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 6;
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(C16011Ums ums, C45884D9d d9d, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A02 = ums;
        this.A03 = str;
        this.A01 = d9d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(Context context, C54159H1d h1d, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 7;
        this.A01 = context;
        this.A02 = h1d;
        this.A03 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(Context context, C47433E2f e2f, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 1;
        this.A01 = context;
        this.A02 = e2f;
        this.A03 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48051ESu(Context context, C53648Gs1 gs1, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A02 = gs1;
        this.A01 = context;
        this.A03 = str;
    }
}
