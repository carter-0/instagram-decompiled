package com.instagram.archive.data;

import X.0eE;
import X.0sn;
import X.1OP;
import X.AnonymousClass0t1;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C51972G9s;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

public final class ArchiveStoryRepository extends C252733pa {
    public List A00 = 0sn.A00;
    public Integer A01;
    public String A02;
    public final UserSession A03;
    public final ReelStore A04;
    public final AnonymousClass0t1 A05;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r9, X.AnonymousClass4D7 r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r6 = 1
            boolean r0 = X.JUN.A00(r6, r10)
            if (r0 == 0) goto L_0x00e4
            r5 = r10
            X.JUN r5 = (X.JUN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e4
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 0
            if (r0 == 0) goto L_0x00ba
            if (r0 != r6) goto L_0x00f0
            boolean r11 = r5.A04
            java.lang.Object r4 = r5.A01
            com.instagram.archive.data.ArchiveStoryRepository r4 = (com.instagram.archive.data.ArchiveStoryRepository) r4
            X.0eS.A00(r1)
        L_0x0029:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b1
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r6 = r1.A00
            X.CEq r6 = (X.C43824CEq) r6
            java.lang.String r0 = r6.A05
            r4.A02 = r0
            java.util.List r1 = r4.A00
            java.util.List r0 = r6.A06
            if (r0 != 0) goto L_0x0041
            X.0sn r0 = X.0sn.A00
        L_0x0041:
            java.util.ArrayList r7 = X.00k.A0S(r0, r1)
            r4.A00 = r7
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x00af
            java.lang.Long r0 = r6.A04
            if (r0 == 0) goto L_0x00ac
            long r1 = r0.longValue()
            int r0 = (int) r1
            java.lang.Integer r0 = X.JTO.A0w(r0)
        L_0x0058:
            r4.A01 = r0
            com.instagram.reels.store.ReelStore r5 = r4.A04
            X.0t1 r0 = r4.A05
            com.instagram.user.model.User r2 = r0.A00()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = r4.A01
            java.util.LinkedHashMap r2 = X.LHI.A00(r5, r2, r1, r0, r7)
            X.CsF r0 = r6.A00
            if (r0 == 0) goto L_0x00aa
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x00aa
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r1 = X.00k.A0J(r1)
            X.1Xj r1 = (X.1Xj) r1
        L_0x007e:
            X.L3M r0 = new X.L3M
            r0.<init>(r1, r2)
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0087:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00eb
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            r4.A02 = r3
            java.lang.StringBuilder r1 = X.JTQ.A0d(r0)
            java.lang.String r0 = ": isFirstPage = "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x00a9:
            return r1
        L_0x00aa:
            r1 = r3
            goto L_0x007e
        L_0x00ac:
            java.lang.Integer r0 = r4.A01
            goto L_0x0058
        L_0x00af:
            r0 = r3
            goto L_0x0058
        L_0x00b1:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0087
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ba:
            X.0eS.A00(r1)
            if (r11 == 0) goto L_0x00c7
            X.0sn r0 = X.0sn.A00
            r8.A00 = r0
            r8.A01 = r3
            r8.A02 = r3
        L_0x00c7:
            com.instagram.common.session.UserSession r2 = r8.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            java.lang.String r0 = r8.A02
            r5.A01 = r8
            r5.A04 = r11
            r5.A00 = r6
            X.1OC r1 = X.AnonymousClass738.A03(r2, r1, r0, r9, r12)
            r0 = 953251634(0x38d17732, float:9.9880985E-5)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x00e1
            return r4
        L_0x00e1:
            r4 = r8
            goto L_0x0029
        L_0x00e4:
            X.JUN r5 = new X.JUN
            r5.<init>(r8, r10, r6)
            goto L_0x0015
        L_0x00eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.ArchiveStoryRepository.A00(java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArchiveStoryRepository(UserSession userSession) {
        super("StoryArchive", AnonymousClass43D.A00(953251634));
        ReelStore A052 = 1OP.A05(userSession);
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        C51972G9s.A1B(userSession, A002);
        this.A03 = userSession;
        this.A04 = A052;
        this.A05 = A002;
    }
}
