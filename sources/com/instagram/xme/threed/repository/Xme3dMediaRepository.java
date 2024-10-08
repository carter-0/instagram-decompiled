package com.instagram.xme.threed.repository;

import X.05G;
import X.AnonymousClass0lh;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass6WO;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C262224Cq;
import X.C61083JwL;
import X.JTO;
import X.JTQ;
import X.MH6;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;

public final class Xme3dMediaRepository extends C252733pa implements AnonymousClass0lh {
    public final 05G A00 = JTQ.A0q();

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r10, X.AnonymousClass6WO r11, com.instagram.xme.threed.repository.Xme3dMediaRepository r12, java.lang.String r13, X.AnonymousClass4D7 r14) {
        /*
            r7 = r13
            r4 = 16
            r5 = r14
            boolean r0 = X.C66131MDj.A01(r4, r14)
            if (r0 == 0) goto L_0x00ad
            r3 = r5
            X.MDj r3 = (X.C66131MDj) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0018:
            java.lang.Object r1 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0057
            if (r0 != r6) goto L_0x00b4
            java.lang.Object r7 = r3.A02
            java.lang.Object r12 = r3.A01
            com.instagram.xme.threed.repository.Xme3dMediaRepository r12 = (com.instagram.xme.threed.repository.Xme3dMediaRepository) r12
            X.0eS.A00(r1)
        L_0x002d:
            java.io.File r1 = (java.io.File) r1
            if (r1 != 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.JwL r2 = new X.JwL
            r2.<init>((java.lang.Integer) r0)
        L_0x0038:
            X.05G r1 = r12.A00
            java.util.Map r0 = X.JTO.A18(r1)
            java.util.LinkedHashMap r0 = X.0Yt.A03(r0)
            r0.put(r7, r2)
            java.util.Map r0 = X.0Yt.A0B(r0)
            r1.Epw(r0)
        L_0x004c:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x004f:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.JwL r2 = new X.JwL
            r2.<init>((java.io.File) r1, (java.lang.Integer) r0)
            goto L_0x0038
        L_0x0057:
            X.0eS.A00(r1)
            X.05G r5 = r12.A00
            java.util.Map r0 = X.JTO.A18(r5)
            java.lang.Object r1 = r0.get(r13)
            X.JwL r1 = (X.C61083JwL) r1
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r0 = r1.A01
        L_0x006a:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r0 == r4) goto L_0x004c
            if (r1 == 0) goto L_0x00a9
            java.lang.Object r1 = r1.A01
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x004c
            X.JwL r1 = new X.JwL
            r1.<init>((java.lang.Integer) r4)
            java.util.Map r0 = X.JTO.A18(r5)
            java.util.LinkedHashMap r0 = X.0Yt.A03(r0)
            r0.put(r13, r1)
            java.util.Map r0 = X.0Yt.A0B(r0)
            r5.Epw(r0)
            X.C51966G9m.A1P(r12, r13, r3, r6)
            X.12T r1 = X.AnonymousClass12T.A00
            r0 = 1655073067(0x62a6692b, float:1.5348688E21)
            X.0nV r0 = X.JTP.A0V(r1, r0)
            r9 = 26
            X.JaI r4 = new X.JaI
            r6 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r1 = X.1Eo.A00(r3, r0, r4)
            if (r1 != r2) goto L_0x002d
            return r2
        L_0x00a9:
            r1 = r8
            goto L_0x0072
        L_0x00ab:
            r0 = r8
            goto L_0x006a
        L_0x00ad:
            X.MDj r3 = new X.MDj
            r3.<init>(r12, r14, r4)
            goto L_0x0018
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.xme.threed.repository.Xme3dMediaRepository.A00(com.instagram.common.session.UserSession, X.6WO, com.instagram.xme.threed.repository.Xme3dMediaRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    public final void A01(String str, UserSession userSession, AnonymousClass6WO r11) {
        AnonymousClass6WO r2 = r11;
        AnonymousClass7TG.A1T(userSession, str, r11);
        C262224Cq r0 = this.A01;
        AnonymousClass7TE.A1Z(new MH6((Object) r2, (Object) this, (Object) userSession, str, (AnonymousClass4D7) null, 23), r0);
    }

    public final void onSessionWillEnd() {
        Iterator A0v = AnonymousClass7TF.A0v(JTO.A18(this.A00));
        while (A0v.hasNext()) {
            File file = (File) ((C61083JwL) A0v.next()).A00;
            if (file != null) {
                file.delete();
            }
        }
    }

    public Xme3dMediaRepository() {
        super("Xme3dMediaRepository", AnonymousClass43D.A00(1238823130));
    }
}
