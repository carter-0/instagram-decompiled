package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class EAH extends C231632rz {
    public final LayoutInflater A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAH(Context context, UserSession userSession) {
        this.A00 = LayoutInflater.from(context);
        this.A01 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(428897324);
        C49425EvR evR = (C49425EvR) DbT.A0o(view);
        0qQ.A0B(evR, 0);
        DbX.A1G(evR.A00, (CharSequence) obj);
        AnonymousClass0fD.A0A(-1454279402, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1 == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r8, android.view.ViewGroup r9) {
        /*
            r7 = this;
            r0 = -918611600(0xffffffffc93f1970, float:-782743.0)
            int r6 = X.AnonymousClass0fD.A03(r0)
            android.view.LayoutInflater r5 = r7.A00
            com.instagram.common.session.UserSession r4 = r7.A01
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 0
            if (r4 == 0) goto L_0x0022
            X.0Tu r2 = X.0Tu.A06
            r0 = 36328989463166670(0x81110600003ece, double:3.037937449380956E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 2131628972(0x7f0e13ac, float:1.8885252E38)
            if (r1 != 0) goto L_0x0025
        L_0x0022:
            r0 = 2131628971(0x7f0e13ab, float:1.888525E38)
        L_0x0025:
            android.view.View r1 = r5.inflate(r0, r3)
            X.0qQ.A0A(r1)
            X.EvR r0 = new X.EvR
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = -529468653(0xffffffffe070f313, float:-6.9448968E19)
            X.AnonymousClass0fD.A0A(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAH.createView(int, android.view.ViewGroup):android.view.View");
    }
}
