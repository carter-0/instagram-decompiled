package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.Map;

public final class PDF implements C74551Pwk {
    public final UserSession A00;
    public final C71105Ocj A01;
    public final C74551Pwk A02;
    public final AnonymousClass3Q2 A03;
    public final PendingMediaStoreSerializer A04;
    public final Map A05;

    public /* synthetic */ PDF(UserSession userSession, C74551Pwk pwk, AnonymousClass3Q2 r5, Map map) {
        AnonymousClass0eM r0 = C71105Ocj.A05;
        C71105Ocj A002 = C69851NtF.A00(userSession);
        PendingMediaStoreSerializer A003 = 28E.A00(userSession);
        AnonymousClass7TG.A1S(A002, A003);
        this.A00 = userSession;
        this.A02 = pwk;
        this.A03 = r5;
        this.A05 = map;
        this.A01 = A002;
        this.A04 = A003;
    }

    public final 0xF B3j() {
        return this.A02.B3j();
    }

    public final 0xF BsS() {
        return this.A02.BsS();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DTM(X.C270214gN r11, java.lang.String r12) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0091
            java.util.Map r0 = r10.A05
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r0)
        L_0x0008:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0085
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r9)
            X.Ocj r0 = r10.A01
            java.lang.String r5 = X.DbT.A13(r1)
            java.lang.Object r8 = r1.getValue()
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r8 = (com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport) r8
            boolean r7 = X.AnonymousClass7TG.A1Z(r5, r8)
            X.OyP r6 = r0.A02
            java.lang.String r4 = "ArmadilloExpressMediaFileHelper"
            X.OOC r3 = new X.OOC     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            java.io.File r2 = X.AnonymousClass7TE.A0t(r5)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            X.RDK r1 = X.RDK.A02     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            com.instagram.common.session.UserSession r0 = r6.A02     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            android.content.Context r0 = X.C51966G9m.A0P(r0)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            X.QcM r0 = r1.A00(r0)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            r3.A04(r0, r2, r7)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            X.Ni4 r1 = r3.A00()     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            java.lang.String r0 = X.C71042OaK.A02(r8)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            X.Ni4 r3 = X.OyP.A00(r6, r0)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            boolean r0 = X.0qQ.A0K(r1, r3)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            if (r0 != 0) goto L_0x0008
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            boolean r0 = X.0mb.A09(r3, r2)     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x006d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "failed to copy media file to: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)     // Catch:{ all -> 0x0071 }
            X.0KC.A0C(r4, r0)     // Catch:{ all -> 0x0071 }
        L_0x006d:
            r2.close()     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            goto L_0x0008
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
            throw r0     // Catch:{ FileNotFoundException -> 0x007b, SecurityException -> 0x0078 }
        L_0x0078:
            java.lang.String r0 = "SecurityException occurred copying media file"
            goto L_0x0081
        L_0x007b:
            java.lang.String r0 = "failed to copy media file from: "
            java.lang.String r0 = X.002.A0R(r0, r5)
        L_0x0081:
            X.0KC.A0C(r4, r0)
            goto L_0x0008
        L_0x0085:
            X.3Q2 r1 = r10.A03
            X.3QD r0 = X.AnonymousClass3QD.CONFIGURED
            r1.A0b(r0)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r0 = r10.A04
            r0.A04()
        L_0x0091:
            X.Pwk r0 = r10.A02
            r0.DTM(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDF.DTM(X.4gN, java.lang.String):void");
    }
}
