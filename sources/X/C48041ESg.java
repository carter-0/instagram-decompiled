package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESg  reason: case insensitive filesystem */
public final class C48041ESg extends AnonymousClass7AK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48041ESg(Context context, 0lg r3, int i) {
        super(Integer.valueOf(i));
        this.A00 = 0;
        this.A01 = context;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r1 = X.182.A04(r2, r3, r0);
        r0 = X.2EG.A2s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        r0 = X.Dba.A0J(r4, r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a6, code lost:
        r0.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r5 = r21
            int r0 = r5.A00
            r1 = r22
            switch(r0) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x008d;
                case 2: goto L_0x0077;
                case 3: goto L_0x0067;
                case 4: goto L_0x0029;
                case 5: goto L_0x0015;
                case 6: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onClick(r1)
            return
        L_0x000d:
            java.lang.Object r0 = r5.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r1)
            return
        L_0x0015:
            java.lang.Object r1 = r5.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.30l r2 = new X.30l
            r2.<init>(r1, r0)
            X.Ki7 r1 = X.C62574Ki7.DIRECT_INBOX_FILTER_NULL_SCREEN
            r0 = 0
            r2.CfX(r1, r0, r0)
            return
        L_0x0029:
            java.lang.Object r4 = r5.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.7I3 r0 = new X.7I3
            r0.<init>(r4)
            X.0wc r0 = r0.A01
            X.1Ln r2 = X.1Ln.A0J(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0051
            r0 = 34
            r2.A0Z(r0)
            r0 = 0
            r2.A0X(r0)
            java.lang.String r1 = "ai_terms"
            java.lang.String r0 = "selected_item"
            r2.A0R(r0, r1)
            r2.Cgf()
        L_0x0051:
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888692422345518(0x830e120010032e, double:3.3918958545085774E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            X.2EG r0 = X.2EG.A3L
            X.SUL r0 = X.Dba.A0J(r3, r4, r0, r1)
            goto L_0x00a6
        L_0x0067:
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36883388139176444(0x83093f002601fc, double:3.388541404473821E-306)
            goto L_0x0086
        L_0x0077:
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36883388139307518(0x83093f002801fe, double:3.388541404556713E-306)
        L_0x0086:
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            X.2EG r0 = X.2EG.A2s
            goto L_0x00a2
        L_0x008d:
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36883388139373055(0x83093f002901ff, double:3.3885414045981586E-306)
            java.lang.String r1 = X.182.A04(r2, r3, r0)
            X.2EG r0 = X.2EG.A3L
        L_0x00a2:
            X.SUL r0 = X.Dba.A0J(r4, r3, r0, r1)
        L_0x00a6:
            r0.A0A()
            return
        L_0x00aa:
            r7 = 0
            X.0qQ.A0B(r1, r7)
            java.lang.Object r3 = r5.A01
            android.content.Context r3 = (android.content.Context) r3
            r0 = 2131964884(0x7f1333d4, float:1.9566562E38)
            java.lang.String r19 = X.AnonymousClass7TE.A16(r3, r0)
            X.FEe r2 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            java.lang.Object r1 = r5.A02
            X.0lg r1 = (X.0lg) r1
            r0 = 634(0x27a, float:8.88E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r20 = X.SQU.A01(r3, r0)
            r5 = 0
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
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20)
            r2.A02(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48041ESg.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48041ESg(Context context, UserSession userSession, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.A01 = context;
                this.A02 = userSession;
                break;
            default:
                this.A02 = userSession;
                this.A01 = context;
                break;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48041ESg(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A00 = 5;
        this.A01 = fragmentActivity;
        this.A02 = userSession;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48041ESg(View.OnClickListener onClickListener, E3X e3x, Integer num) {
        super(num);
        this.A00 = 6;
        this.A01 = e3x;
        this.A02 = onClickListener;
    }
}
