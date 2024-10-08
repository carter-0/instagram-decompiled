package com.instagram.clips.drafts.model.validation;

import X.0qQ;
import X.0sP;
import X.1Eo;
import X.29E;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass07a;
import X.AnonymousClass12T;
import X.AnonymousClass4D7;
import X.AnonymousClass51M;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass8A1;
import X.AnonymousClass8A2;
import X.C61081JwJ;
import X.DbT;
import X.GO0;
import X.GO1;
import X.MH6;
import com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class ClipsDraftValidator {
    public long A00 = 0;
    public final ClipsDraftLocalDataSource A01;
    public final UserSession A02;
    public final AnonymousClass8A2 A03;
    public final Integer A04;

    public ClipsDraftValidator(ClipsDraftLocalDataSource clipsDraftLocalDataSource, UserSession userSession, Integer num) {
        0qQ.A0B(clipsDraftLocalDataSource, 2);
        this.A02 = userSession;
        this.A01 = clipsDraftLocalDataSource;
        this.A04 = num;
        this.A03 = AnonymousClass8A1.A01(userSession);
    }

    public final void A02(AnonymousClass07Z r10, String str, 0sP r12) {
        0qQ.A0B(str, 1);
        1Eo.A05(AnonymousClass12T.A00.CO6(480314591, 3), new MH6(this, r12, str, (AnonymousClass4D7) null, 3), AnonymousClass07a.A00(r10));
    }

    public final GO1 A00(C61081JwJ jwJ) {
        if (this.A00 == 0) {
            AnonymousClass8A2 r1 = this.A03;
            int hashCode = jwJ.hashCode();
            String A002 = GO0.A00(this.A04);
            29E r5 = r1.A0K;
            long A042 = r5.A04(Integer.valueOf(hashCode), (String) null, 42154153, 12000);
            r5.A09(A042, "draft_hash_code_id", String.valueOf(hashCode));
            r5.A09(A042, "draft_validation_entry_point", A002);
            this.A00 = A042;
        }
        GO1 go1 = new GO1();
        List<AnonymousClass51M> list = (List) jwJ.A00;
        if (list.isEmpty()) {
            go1.A00(AnonymousClass05K.A0N, (String) null);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (AnonymousClass51M r2 : list) {
            if (!new File(r2.A0F.A0F).exists()) {
                A1C.add(r2.A0F.A0F);
            }
        }
        if (DbT.A1b(A1C)) {
            Integer num = AnonymousClass05K.A0Y;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append(A1C.size());
            A1A.append('/');
            A1A.append(list.size());
            A1A.append(" missing: ");
            go1.A00(num, AnonymousClass7TF.A0l(DbT.A0z(", ", A1C, (0sP) null), A1A));
        }
        boolean isEmpty = go1.A00.isEmpty();
        AnonymousClass8A2 r4 = this.A03;
        if (isEmpty) {
            this.A00 = r4.A0K.A02(42154153, this.A00);
            return go1;
        }
        r4.A0K(go1.toString(), this.A00);
        return go1;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        if (r9 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        throw X.AnonymousClass7TE.A11("getMessage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:15:0x0070, B:21:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8 A[Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[ExcHandler: HP3 (unused X.HP3), SYNTHETIC, Splitter:B:15:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r3 = 22
            r4 = r19
            boolean r0 = X.C66128MDg.A01(r3, r4)
            r7 = r17
            if (r0 == 0) goto L_0x0030
            r5 = r4
            X.MDg r5 = (X.C66128MDg) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r9 = r5.A02
            X.1Hj r0 = X.1Hj.A02
            int r1 = r5.A00
            java.lang.String r8 = " : "
            r4 = 1
            r13 = 0
            r3 = 2
            if (r1 == 0) goto L_0x0040
            if (r1 == r4) goto L_0x003b
            if (r1 != r3) goto L_0x0036
            java.lang.Object r6 = r5.A01
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r6 = (com.instagram.clips.drafts.model.validation.ClipsDraftValidator) r6
            goto L_0x00a1
        L_0x0030:
            X.MDg r5 = new X.MDg
            r5.<init>(r7, r4, r3)
            goto L_0x001a
        L_0x0036:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x003b:
            java.lang.Object r6 = r5.A01
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r6 = (com.instagram.clips.drafts.model.validation.ClipsDraftValidator) r6
            goto L_0x008d
        L_0x0040:
            X.0eS.A00(r9)
            X.8A2 r2 = r7.A03
            java.lang.Integer r1 = r7.A04
            java.lang.String r9 = X.GO0.A00(r1)
            r1 = 0
            r6 = r18
            X.0qQ.A0B(r6, r1)
            X.29E r11 = r2.A0K
            int r1 = r6.hashCode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r14 = 42154153(0x28338a9, float:1.9281241E-37)
            r15 = 12000(0x2ee0, double:5.929E-320)
            long r1 = r11.A04(r12, r13, r14, r15)
            java.lang.String r10 = "draft_id"
            r11.A09(r1, r10, r6)
            java.lang.String r10 = "draft_validation_entry_point"
            r11.A09(r1, r10, r9)
            r7.A00 = r1
            com.instagram.common.session.UserSession r10 = r7.A02     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            X.0Tu r9 = X.0Tu.A05     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            r1 = 36320378053796216(0x81093100012178, double:3.0324915594197184E-306)
            boolean r1 = X.182.A06(r9, r10, r1)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x0093
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r7.A01     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            r5.A01 = r7     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            r5.A00 = r4     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            java.lang.Object r9 = r1.A08(r6, r5)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            if (r9 == r0) goto L_0x00fa
            r6 = r7
            goto L_0x0090
        L_0x008d:
            X.0eS.A00(r9)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
        L_0x0090:
            X.JwJ r9 = (X.C61081JwJ) r9     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            goto L_0x00b4
        L_0x0093:
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r1 = r7.A01     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            r5.A01 = r7     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            r5.A00 = r3     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            java.lang.Object r9 = r1.A07(r6, r5)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d5 }
            if (r9 == r0) goto L_0x00fa
            r6 = r7
            goto L_0x00a4
        L_0x00a1:
            X.0eS.A00(r9)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
        L_0x00a4:
            X.5kq r9 = (X.C293505kq) r9     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            if (r9 == 0) goto L_0x00b6
            java.lang.String r2 = r9.A0T     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            java.util.List r1 = r9.A0v     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            r0 = 17
            X.JwJ r9 = new X.JwJ     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            r9.<init>((java.util.List) r1, (int) r0, (java.lang.String) r2)     // Catch:{ HP3 -> 0x00fb, Exception -> 0x00d3 }
            goto L_0x00ce
        L_0x00b4:
            if (r9 != 0) goto L_0x00ce
        L_0x00b6:
            X.8A2 r4 = r6.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r0 = 2196(0x894, float:3.077E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            long r0 = r6.A00
            r4.A0K(r2, r0)
            X.GO1 r0 = new X.GO1
            r0.<init>()
            r0.A00(r3, r13)
            return r0
        L_0x00ce:
            X.GO1 r0 = r6.A00(r9)
            return r0
        L_0x00d3:
            r5 = move-exception
            goto L_0x00d7
        L_0x00d5:
            r5 = move-exception
            r6 = r7
        L_0x00d7:
            X.8A2 r4 = r6.A03
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r0 = 2346(0x92a, float:3.287E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getMessage()
            java.lang.String r2 = X.002.A0g(r1, r8, r0)
            long r0 = r6.A00
            r4.A0K(r2, r0)
            java.lang.String r1 = r5.getMessage()
            X.GO1 r0 = new X.GO1
            r0.<init>()
            r0.A00(r3, r1)
        L_0x00fa:
            return r0
        L_0x00fb:
            java.lang.String r0 = "getMessage"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.drafts.model.validation.ClipsDraftValidator.A01(java.lang.String, X.4D7):java.lang.Object");
    }
}
