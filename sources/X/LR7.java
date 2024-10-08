package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class LR7 {
    public LRD A00;
    public final C63966LFs A01;
    public final Map A02 = AnonymousClass7TE.A1E();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r6 != r3) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (r9 == r2) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.LR7 r7, X.C63966LFs r8, X.C62530KhM r9) {
        /*
            X.KhM r6 = r8.A00
            if (r6 == r9) goto L_0x0020
            java.lang.String r5 = "ConferenceState"
            X.11Z.A00()
            if (r6 == r9) goto L_0x0013
            X.KhM r4 = X.C62530KhM.CONNECTED
            if (r6 != r4) goto L_0x0021
            X.KhM r0 = X.C62530KhM.CONNECTING
            if (r9 != r0) goto L_0x0021
        L_0x0013:
            java.lang.String r1 = "Disallowed state transition %s -> %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r9}
            java.lang.String r0 = X.0mp.A06(r1, r0)
            X.0wb.A03(r5, r0)
        L_0x0020:
            return
        L_0x0021:
            X.KhM r0 = X.C62530KhM.DISMISSED
            if (r6 != r0) goto L_0x002e
            X.KhM r0 = X.C62530KhM.DISCONNECTED
            if (r9 == r0) goto L_0x0013
            X.KhM r0 = X.C62530KhM.DISCONNECTING
            if (r9 != r0) goto L_0x002e
            goto L_0x0013
        L_0x002e:
            X.KhM r3 = X.C62530KhM.ACTIVE
            if (r9 != r3) goto L_0x0039
            if (r6 == r4) goto L_0x0039
            X.KhM r0 = X.C62530KhM.STALLED
            if (r6 == r0) goto L_0x0039
            goto L_0x0013
        L_0x0039:
            X.KhM r2 = X.C62530KhM.STALLED
            if (r9 != r2) goto L_0x0040
            if (r6 == r3) goto L_0x0052
            goto L_0x0013
        L_0x0040:
            if (r9 != r4) goto L_0x0052
            if (r6 != r3) goto L_0x0052
            java.lang.String r1 = "Unexpected state transition %s -> %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r9}
            java.lang.String r0 = X.0mp.A06(r1, r0)
            X.0wb.A03(r5, r0)
            goto L_0x0013
        L_0x0052:
            r8.A00 = r9
            boolean r1 = r8.A01
            X.KhM r0 = X.C62530KhM.INVITED
            boolean r0 = X.C51969G9p.A1a(r9, r0)
            r1 = r1 & r0
            r8.A01 = r1
            if (r9 == r4) goto L_0x0066
            if (r9 == r3) goto L_0x0066
            r0 = 0
            if (r9 != r2) goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            r0 = r0 | r1
            r8.A01 = r0
            X.LRD r0 = r7.A00
            if (r0 == 0) goto L_0x0020
            r0.A02(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LR7.A01(X.LR7, X.LFs, X.KhM):void");
    }

    public LR7(String str) {
        this.A01 = A00(this, str);
    }

    public static C63966LFs A00(LR7 lr7, String str) {
        11Z.A00();
        Map map = lr7.A02;
        C63966LFs lFs = (C63966LFs) map.get(str);
        if (lFs != null) {
            return lFs;
        }
        C63966LFs lFs2 = new C63966LFs(str);
        map.put(str, lFs2);
        return lFs2;
    }

    public final HashSet A02(Set set, boolean z) {
        HashSet A1F = AnonymousClass7TE.A1F();
        Iterator A0v = AnonymousClass7TF.A0v(this.A02);
        while (A0v.hasNext()) {
            C63966LFs lFs = (C63966LFs) A0v.next();
            if (set.contains(lFs.A00) && (z || lFs != this.A01)) {
                A1F.add(lFs);
            }
        }
        return A1F;
    }
}
