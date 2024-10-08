package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public final class PJ3 implements G6H {
    public final Fragment A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r8.equals(r7) != false) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI0(android.net.Uri r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r5 = 0
            X.0qQ.A0B(r10, r5)
            com.instagram.common.session.UserSession r6 = r9.A01
            X.OyN r1 = X.OyN.A00(r6)
            X.0qQ.A07(r1)
            monitor-enter(r1)
            r0 = 0
            r1.A05 = r0     // Catch:{ all -> 0x00a4 }
            monitor-exit(r1)
            r1.A05()
            java.lang.String r0 = "purpose"
            java.lang.String r8 = r10.getQueryParameter(r0)
            java.lang.String r7 = "enable_status"
            r4 = r7
            java.lang.String r3 = "auto_response"
            java.lang.String r2 = "import"
            if (r8 == 0) goto L_0x003d
            int r1 = r8.hashCode()
            r0 = -1184795739(0xffffffffb96173a5, float:-2.1500753E-4)
            if (r1 == r0) goto L_0x0098
            r0 = 946560209(0x386b5cd1, float:5.6114808E-5)
            if (r1 == r0) goto L_0x0090
            r0 = 1270808110(0x4bbefe2e, float:2.503382E7)
            if (r1 != r0) goto L_0x003d
            boolean r0 = r8.equals(r7)
            if (r0 != 0) goto L_0x003f
        L_0x003d:
            java.lang.String r7 = "default"
        L_0x003f:
            int r0 = r7.hashCode()
            switch(r0) {
                case -1184795739: goto L_0x0065;
                case 946560209: goto L_0x005c;
                case 1270808110: goto L_0x0053;
                case 1544803905: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            return
        L_0x0047:
            java.lang.String r0 = "default"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0046
            r5 = 1
            java.lang.String r1 = "inbox_qp_creation_flow"
            goto L_0x006d
        L_0x0053:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "inbox_qp_enable_status_flow"
            goto L_0x006d
        L_0x005c:
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "inbox_qp_auto_response"
            goto L_0x006d
        L_0x0065:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = "inbox_qp_import"
        L_0x006d:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "entry_point"
            r4.putString(r0, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.Fragment r2 = r9.A00
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = 265(0x109, float:3.71E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.Dba.A0K(r1, r4, r6, r3, r0)
            if (r5 == 0) goto L_0x00a0
            r0 = 14167(0x3757, float:1.9852E-41)
            r1.A0D(r2, r0)
            return
        L_0x0090:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L_0x003d
            r7 = r3
            goto L_0x003f
        L_0x0098:
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x003d
            r7 = r2
            goto L_0x003f
        L_0x00a0:
            X.DbT.A1L(r2, r1)
            return
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJ3.CI0(android.net.Uri, android.os.Bundle):void");
    }

    public PJ3(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
