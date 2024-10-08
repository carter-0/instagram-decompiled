package com.instagram.settings2.core.model;

import X.00k;
import X.018;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C48010EQt;
import X.C50957Flk;
import X.C63416Kwc;
import X.C64185LSs;
import X.C66419MQz;
import java.util.ArrayList;
import java.util.List;

public final class PostCommitValue$ShowModal extends C48010EQt {
    public final C64185LSs A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof PostCommitValue$ShowModal) && 0qQ.A0K(this.A00, ((PostCommitValue$ShowModal) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final C66419MQz A05() {
        return C50957Flk.A00;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r3 = 29
            boolean r0 = X.MEB.A03(r3, r8)
            if (r0 == 0) goto L_0x003a
            r4 = r8
            X.MEB r4 = (X.MEB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003a
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r1) goto L_0x0042
            X.0eS.A00(r3)
        L_0x0024:
            X.Jvx r3 = (X.C61059Jvx) r3
            X.Drn r0 = new X.Drn
            r0.<init>((X.C61059Jvx) r3)
            return r0
        L_0x002c:
            X.0eS.A00(r3)
            X.LSs r0 = r5.A00
            r4.A00 = r1
            java.lang.Object r3 = r7.A01(r0, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003a:
            r0 = 42
            X.MEB r4 = new X.MEB
            r4.<init>(r5, r8, r3, r0)
            goto L_0x0016
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.PostCommitValue$ShowModal.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.4D7):java.lang.Object");
    }

    public final List A08() {
        List<C64185LSs> A1I = AnonymousClass7TE.A1I(this.A00);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C64185LSs A002 : A1I) {
            018.A16(C63416Kwc.A00(A002), A1C);
        }
        return 00k.A0W(A1C);
    }

    public PostCommitValue$ShowModal(C64185LSs lSs) {
        this.A00 = lSs;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.toString());
        A1A.append(": { ");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(" }", A1A);
    }
}
