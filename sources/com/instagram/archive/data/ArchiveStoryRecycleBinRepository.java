package com.instagram.archive.data;

import X.05G;
import X.0sn;
import X.AnonymousClass0Ud;
import X.AnonymousClass0t1;
import X.C252733pa;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

public final class ArchiveStoryRecycleBinRepository extends C252733pa {
    public List A00 = 0sn.A00;
    public Integer A01;
    public String A02;
    public final UserSession A03;
    public final ReelStore A04;
    public final AnonymousClass0t1 A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r14, boolean r15) {
        /*
            r13 = this;
            r3 = 46
            boolean r0 = X.C66144MDw.A02(r3, r14)
            if (r0 == 0) goto L_0x012a
            r5 = r14
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x012a
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00a8
            if (r0 != r4) goto L_0x0136
            java.lang.Object r6 = r5.A01
            com.instagram.archive.data.ArchiveStoryRecycleBinRepository r6 = (com.instagram.archive.data.ArchiveStoryRecycleBinRepository) r6
            X.0eS.A00(r1)
        L_0x0029:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0086
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.CEq r2 = (X.C43824CEq) r2
            java.lang.String r0 = r2.A05
            r6.A02 = r0
            java.util.List r1 = r6.A00
            java.util.List r0 = r2.A06
            if (r0 != 0) goto L_0x0041
            X.0sn r0 = X.0sn.A00
        L_0x0041:
            java.util.ArrayList r5 = X.00k.A0S(r0, r1)
            r6.A00 = r5
            java.lang.String r0 = r6.A02
            if (r0 == 0) goto L_0x0058
            java.lang.Long r0 = r2.A04
            if (r0 == 0) goto L_0x0083
            long r1 = r0.longValue()
            int r0 = (int) r1
            java.lang.Integer r3 = X.JTO.A0w(r0)
        L_0x0058:
            r6.A01 = r3
            com.instagram.reels.store.ReelStore r3 = r6.A04
            X.0t1 r0 = r6.A05
            com.instagram.user.model.User r2 = r0.A00()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r6.A01
            java.util.LinkedHashMap r5 = X.LHI.A00(r3, r2, r1, r0, r5)
            X.05G r3 = r6.A06
        L_0x006c:
            java.lang.Object r2 = r3.getValue()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.0qQ.A0B(r5, r4)
            X.JVf r0 = new X.JVf
            r0.<init>((java.lang.Integer) r1, (java.util.Map) r5)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x006c
        L_0x0080:
            X.0gF r6 = X.C60340gF.A00
        L_0x0082:
            return r6
        L_0x0083:
            java.lang.Integer r3 = r6.A01
            goto L_0x0058
        L_0x0086:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0131
            X.05G r5 = r6.A06
        L_0x008c:
            java.lang.Object r3 = r5.getValue()
            r0 = r3
            X.JVf r0 = (X.C59721JVf) r0
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            X.0qQ.A0B(r1, r4)
            X.JVf r0 = new X.JVf
            r0.<init>((java.lang.Integer) r2, (java.util.Map) r1)
            boolean r0 = r5.AIY(r3, r0)
            if (r0 == 0) goto L_0x008c
            goto L_0x0080
        L_0x00a8:
            X.0eS.A00(r1)
            if (r15 == 0) goto L_0x0125
            X.0sn r0 = X.0sn.A00
            r13.A00 = r0
            r13.A01 = r3
            r13.A02 = r3
        L_0x00b5:
            X.05G r8 = r13.A06
        L_0x00b7:
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            X.JVf r0 = (X.C59721JVf) r0
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            X.0qQ.A0B(r1, r4)
            X.JVf r0 = new X.JVf
            r0.<init>((java.lang.Integer) r2, (java.util.Map) r1)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x00b7
            com.instagram.common.session.UserSession r12 = r13.A03
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            java.lang.String r11 = r13.A02
            r8 = 0
            X.1Fc r2 = new X.1Fc
            r2.<init>()
            java.lang.String r10 = "max_id"
            r2.A05(r10, r11)
            java.lang.String r0 = "v1:"
            java.lang.String r1 = "archive/reel/scheduled_for_deletion_day_shells_paginated/"
            java.lang.String r0 = X.002.A0R(r0, r1)
            java.lang.String r7 = r2.A01(r0)
            X.0qQ.A07(r7)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r12)
            r2.A0A(r1)
            r2.A9m(r10, r11)
            long r0 = X.1G0.A00()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "timezone_offset"
            r2.A9m(r0, r1)
            r2.A07 = r9
            r2.A0A = r7
            java.lang.Class<X.CEq> r1 = X.C43824CEq.class
            java.lang.Class<X.D0O> r0 = X.D0O.class
            X.1OC r1 = X.DbT.A0R(r3, r2, r1, r0, r8)
            r5.A01 = r13
            r5.A00 = r4
            r0 = 582526129(0x22b8a4b1, float:5.0047674E-18)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 == r6) goto L_0x0082
            r6 = r13
            goto L_0x0029
        L_0x0125:
            java.lang.String r0 = r13.A02
            if (r0 == 0) goto L_0x0080
            goto L_0x00b5
        L_0x012a:
            X.MDw r5 = new X.MDw
            r5.<init>(r13, r14, r3)
            goto L_0x0016
        L_0x0131:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.ArchiveStoryRecycleBinRepository.A00(X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ArchiveStoryRecycleBinRepository(com.instagram.common.session.UserSession r10) {
        /*
            r9 = this;
            com.instagram.reels.store.ReelStore r3 = X.1OP.A05(r10)
            X.0t1 r2 = X.0eE.A00(r10)
            r0 = 1
            int r7 = X.DbW.A03(r0, r10, r2)
            r4 = 0
            r0 = 953251634(0x38d17732, float:9.9880985E-5)
            X.19S r1 = X.AnonymousClass43D.A01(r0, r7)
            java.lang.String r0 = "StoryArchiveRecycleBin"
            r9.<init>(r0, r1)
            r9.A03 = r10
            r9.A04 = r3
            r9.A05 = r2
            r8 = 21
            X.JVf r3 = new X.JVf
            r5 = r4
            r6 = r4
            r3.<init>((java.lang.Integer) r4, (java.util.Map) r5, (kotlin.jvm.internal.DefaultConstructorMarker) r6, (int) r7, (int) r8)
            X.02z r0 = X.DbS.A10(r3)
            r9.A06 = r0
            X.05F r0 = X.10b.A03(r0)
            r9.A07 = r0
            X.0sn r0 = X.0sn.A00
            r9.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.ArchiveStoryRecycleBinRepository.<init>(com.instagram.common.session.UserSession):void");
    }
}
