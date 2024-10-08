package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GWb  reason: case insensitive filesystem */
public final class C52524GWb implements AnonymousClass0lh {
    public static final HashMap A01 = AnonymousClass7TE.A1E();
    public final UserSession A00;

    public C52524GWb(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r0 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (r0 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r4.A03("FAILURE_REASON", r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C268654dm r10, X.C3723390k r11) {
        /*
            r9 = this;
            r3 = 0
            com.instagram.common.session.UserSession r0 = r9.A00
            X.1Zn r2 = X.1Zm.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            java.lang.Integer r0 = X.AnonymousClass05K.A06
            X.1Zp r4 = r2.A01(r1, r0, r3)
            java.lang.Object r8 = r10.A00()
            X.1XP r8 = (X.1XP) r8
            java.lang.String r2 = "FAILURE_REASON"
            java.lang.String r3 = "FAILURE_NAME"
            r0 = 944(0x3b0, float:1.323E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            if (r8 == 0) goto L_0x0099
            int r1 = r8.mStatusCode
            java.lang.String r0 = "RESPONSE_CODE"
            r4.A01(r0, r1)
            java.lang.String r0 = "NETWORK"
            r4.A03(r6, r0)
            java.lang.String r0 = r8.mErrorTitle
            if (r0 == 0) goto L_0x0034
            r4.A03(r3, r0)
        L_0x0034:
            java.lang.String r0 = r8.getErrorMessage()
            if (r0 == 0) goto L_0x0099
        L_0x003a:
            r4.A03(r2, r0)
        L_0x003d:
            r4.A00()
        L_0x0040:
            int r7 = r11.A01
            java.util.HashMap r0 = A01
            java.lang.Object r0 = X.C51968G9o.A0z(r0, r7)
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0074
            X.02m r5 = X.02m.A0p
            r4 = 1011615852(0x3c4c086c, float:0.01245318)
            if (r8 == 0) goto L_0x0075
            int r1 = r8.mStatusCode
            java.lang.String r0 = "RESPONSE_CODE"
            r5.markerAnnotate(r4, r7, r0, r1)
            java.lang.String r0 = "NETWORK"
            r5.markerAnnotate(r4, r7, r6, r0)
            java.lang.String r0 = r8.mErrorTitle
            r5.markerAnnotate(r4, r7, r3, r0)
            java.lang.String r0 = r8.getErrorMessage()
        L_0x006a:
            r5.markerAnnotate(r4, r7, r2, r0)
        L_0x006d:
            X.0qQ.A0A(r5)
            r0 = 3
        L_0x0071:
            A00(r5, r7, r0)
        L_0x0074:
            return
        L_0x0075:
            java.lang.Throwable r1 = r10.A01()
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1 instanceof X.RCQ
            if (r0 == 0) goto L_0x0084
            X.0qQ.A0A(r5)
            r0 = 4
            goto L_0x0071
        L_0x0084:
            java.lang.String r0 = "CLIENT"
            r5.markerAnnotate(r4, r7, r6, r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r5.markerAnnotate(r4, r7, r3, r0)
            java.lang.String r0 = r1.getMessage()
            goto L_0x006a
        L_0x0099:
            java.lang.Throwable r1 = r10.A01()
            if (r1 == 0) goto L_0x003d
            boolean r0 = r1 instanceof X.RCQ
            if (r0 != 0) goto L_0x0040
            r4.A05(r1)
            java.lang.String r0 = "CLIENT"
            r4.A03(r6, r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            X.0qQ.A07(r0)
            r4.A03(r3, r0)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x003d
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52524GWb.A01(X.4dm, X.90k):void");
    }

    public static final void A00(02m r2, int i, short s) {
        if (A01.remove(Integer.valueOf(i)) != null) {
            r2.markerEnd(1011615852, i, s);
        }
    }

    public final void A02(C3723890q r6, C3723390k r7, boolean z) {
        int i = r7.A01;
        if (AnonymousClass7TF.A1V(C51968G9o.A0z(A01, i))) {
            02m r3 = 02m.A0p;
            r3.markerPoint(1011615852, i, "GRID_RESPONSE_PARSED");
            if (r6.CPt()) {
                r3.markerAnnotate(1011615852, i, "SOURCE", "CACHED");
            }
            if (!z) {
                A00(r3, i, 2);
            }
        }
    }

    public final void A03(C3723390k r5) {
        int i = r5.A01;
        if (AnonymousClass7TF.A1V(C51968G9o.A0z(A01, i))) {
            02m.A0p.markerPoint(1011615852, i, "GRID_RESPONSE_RECEIVED");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r5 == X.AnonymousClass05K.A0j) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C3723390k r7, java.lang.Integer r8) {
        /*
            r6 = this;
            X.02m r4 = X.02m.A0p
            java.util.HashMap r2 = A01
            int r3 = r7.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 113(0x71, float:1.58E-43)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r2.put(r1, r0)
            r2 = 1011615852(0x3c4c086c, float:0.01245318)
            r0 = 30000(0x7530, double:1.4822E-319)
            r4.A0S(r2, r3, r0)
            java.lang.Integer r5 = r7.A03
            int r0 = r5.intValue()
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x005c;
                case 2: goto L_0x005f;
                case 3: goto L_0x0062;
                case 4: goto L_0x0069;
                case 5: goto L_0x006c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r1 = "cache_fetch"
        L_0x0026:
            java.lang.String r0 = "FETCH_REASON"
            r4.markerAnnotate(r2, r3, r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r5 == r0) goto L_0x0034
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r1 = 0
            if (r5 != r0) goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            java.lang.String r0 = "IS_PREFETCH"
            r4.markerAnnotate(r2, r3, r0, r1)
            java.lang.String r0 = "GRID_REQUEST_SENT"
            r4.markerPoint(r2, r3, r0)
            java.lang.String r1 = "GRID_TYPE"
            java.lang.String r0 = "EXPLORE"
            r4.markerAnnotate(r2, r3, r1, r0)
            boolean r1 = r7.A0E
            java.lang.String r0 = "IS_FIRST_PAGE"
            r4.markerAnnotate(r2, r3, r0, r1)
            if (r8 == 0) goto L_0x0058
            int r1 = r8.intValue()
            java.lang.String r0 = "INITIAL_GRID_ITEM_COUNT"
            r4.markerAnnotate(r2, r3, r0, r1)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r1 = "surface_created"
            goto L_0x0026
        L_0x005c:
            java.lang.String r1 = "auto_refresh"
            goto L_0x0026
        L_0x005f:
            java.lang.String r1 = "pull_to_refresh"
            goto L_0x0026
        L_0x0062:
            r0 = 3718(0xe86, float:5.21E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0026
        L_0x0069:
            java.lang.String r1 = "foreground_prefetch"
            goto L_0x0026
        L_0x006c:
            java.lang.String r1 = "background_prefetch"
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52524GWb.A04(X.90k, java.lang.Integer):void");
    }

    public final void onSessionWillEnd() {
        02m.A0p.endAllInstancesOfMarker(1011615852, 4);
        A01.clear();
    }
}
