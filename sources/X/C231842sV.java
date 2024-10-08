package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sV  reason: invalid class name and case insensitive filesystem */
public final class C231842sV extends C231632rz {
    public C238223Ba A00;
    public final Context A01;
    public final UserSession A02;

    public final String getBinderGroupName() {
        return "ReelFeed";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        this.A00 = (C238223Ba) obj;
        r2.A7U(0);
    }

    public C231842sV(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        ViewGroup viewGroup;
        int A03 = AnonymousClass0fD.A03(-2140336967);
        C238223Ba r0 = this.A00;
        r0.getClass();
        View C02 = r0.A00.C02();
        this.A00.getClass();
        if (view != null) {
            obj3 = view.getTag();
        } else {
            obj3 = null;
        }
        C240733Ma r1 = (C240733Ma) obj3;
        if (C02 != null) {
            ViewGroup viewGroup2 = (ViewGroup) C02.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(C02);
            }
            if (!(r1 == null || (viewGroup = r1.A00) == null)) {
                viewGroup.addView(C02, 0);
            }
        }
        AnonymousClass0fD.A0A(175995539, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (X.182.A06(r3, r7, 36320313630400752L) != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r9, android.view.ViewGroup r10) {
        /*
            r8 = this;
            r0 = -1541471685(0xffffffffa41f023b, float:-3.447952E-17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            if (r9 != 0) goto L_0x0099
            X.3Ba r0 = r8.A00
            if (r0 != 0) goto L_0x001f
            java.lang.String r5 = "ReelFeedBinderGroup"
            java.lang.String r4 = "Model is null in createView for viewType = "
            r3 = 0
            java.lang.String r1 = " and parent = "
            java.lang.String r0 = r10.toString()
            java.lang.String r0 = X.002.A05(r3, r4, r1, r0)
            X.0wb.A03(r5, r0)
        L_0x001f:
            android.content.Context r5 = r8.A01
            com.instagram.common.session.UserSession r1 = r8.A02
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            X.1NN r6 = X.1NM.A00(r1)
            com.instagram.common.session.UserSession r7 = r6.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320313630335215(0x810922001120ef, double:3.032450817763569E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 != 0) goto L_0x004e
            r0 = 36320313630400752(0x810922001220f0, double:3.032450817805015E-306)
            boolean r1 = X.182.A06(r3, r7, r0)
            r0 = 0
            if (r1 == 0) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            if (r0 == 0) goto L_0x0072
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131625937(0x7f0e07d1, float:1.8879096E38)
        L_0x005a:
            android.view.View r1 = r1.inflate(r0, r10, r4)
            X.0qQ.A0C(r1, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.3Ma r0 = new X.3Ma
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = 708698273(0x2a3de0a1, float:1.6864506E-13)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        L_0x0072:
            boolean r0 = X.1NN.A00(r6)
            if (r0 != 0) goto L_0x0091
            X.0eM r0 = r6.A01
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0091
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131629489(0x7f0e15b1, float:1.88863E38)
            goto L_0x005a
        L_0x0091:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131629494(0x7f0e15b6, float:1.888631E38)
            goto L_0x005a
        L_0x0099:
            r0 = 33
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            r0 = 530500778(0x1f9eccaa, float:6.725419E-20)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231842sV.createView(int, android.view.ViewGroup):android.view.View");
    }
}
