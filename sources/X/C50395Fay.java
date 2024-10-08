package X;

import android.os.BaseBundle;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;

/* renamed from: X.Fay  reason: case insensitive filesystem */
public final class C50395Fay implements C51927G7v {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50395Fay(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object Aqc() {
        if (this.A00 != 0) {
            return this.A02;
        }
        return ((DirectShareSheetFragment) this.A01).A0P.A0B();
    }

    public final boolean CWy() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = ((DirectShareSheetFragment) this.A01).A0P.A0M.A01;
        }
        if (obj == 2FW.A1h || obj == 2FW.A0c) {
            return false;
        }
        return true;
    }

    public final boolean CWz() {
        if (this.A00 != 0) {
            return false;
        }
        return AnonymousClass000.A00(4651).equals(((BaseBundle) this.A02).getString(AnonymousClass000.A00(107), AnonymousClass000.A00(4652)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        r0 = r2.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CX1() {
        /*
            r6 = this;
            int r0 = r6.A00
            if (r0 != 0) goto L_0x0089
            java.lang.Object r0 = r6.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r2 = r0.A0P
            X.ExY r1 = r2.A0M
            X.2FW r5 = r1.A01
            X.2FW r0 = X.2FW.A0S
            r4 = 1
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A0R
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A0T
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A1h
            r3 = 0
            if (r5 == r0) goto L_0x004e
            X.2FW r0 = X.2FW.A1Q
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A0c
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A1O
            if (r5 == r0) goto L_0x0088
            X.2FW r0 = X.2FW.A1N
            if (r5 == r0) goto L_0x004e
            X.2FW r0 = X.2FW.A0H
            if (r5 != r0) goto L_0x004f
            com.instagram.common.session.UserSession r4 = r2.A0L
            X.0qQ.A0B(r4, r3)
            boolean r0 = X.AnonymousClass9B8.A07(r4)
            if (r0 == 0) goto L_0x004d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319398806101254(0x81084d004b1d06, double:3.0318722792343105E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r3 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            return r3
        L_0x004f:
            X.2FW r0 = X.2FW.A10
            if (r5 != r0) goto L_0x0067
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.fragment.sharesheet.mvvm.data.DirectIfyContentShareContentModel"
            X.0qQ.A0C(r1, r0)
            X.EJB r1 = (X.EJB) r1
            com.instagram.model.direct.DirectIfyXma r0 = r1.A00
            if (r0 == 0) goto L_0x0065
            X.EVp r1 = r0.A01
        L_0x0060:
            X.EVp r0 = X.C48097EVp.MEMU
            if (r1 != r0) goto L_0x0089
            return r4
        L_0x0065:
            r1 = 0
            goto L_0x0060
        L_0x0067:
            X.1Xj r1 = r2.A04
            if (r1 == 0) goto L_0x004e
            com.instagram.common.session.UserSession r0 = r2.A0L
            com.instagram.user.model.User r2 = r1.A2A(r0)
            if (r2 == 0) goto L_0x004e
            boolean r0 = X.2R8.A04(r0, r2)
            if (r0 != 0) goto L_0x0088
            java.lang.Integer r1 = r2.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0089
            boolean r0 = r2.A27()
            if (r0 != 0) goto L_0x0089
            return r4
        L_0x0088:
            return r4
        L_0x0089:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50395Fay.CX1():boolean");
    }
}
