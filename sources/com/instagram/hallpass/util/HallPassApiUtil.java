package com.instagram.hallpass.util;

import X.0bH;
import X.0qQ;
import X.1NT;
import X.1NX;
import X.1NY;
import X.1OC;
import X.AnonymousClass7TG;
import X.D1N;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class HallPassApiUtil {
    public static final HallPassApiUtil A00 = new Object();

    public static final 1OC A00(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("stories/hallpass/hallpass_add_people_search/");
        A0b.A0G("query", str);
        A0b.A02 = new 1NT(new 0bH(userSession), new 1NX((File) null), D1N.class, false);
        return A0b.A0M();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.common.session.UserSession r6, java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = X.ME3.A03(r4, r8)
            if (r0 == 0) goto L_0x0051
            r3 = r8
            X.ME3 r3 = (X.ME3) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0051
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            if (r1 == 0) goto L_0x0030
            if (r1 != r4) goto L_0x005e
            X.0eS.A00(r0)
        L_0x0022:
            r2 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x002f
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0059
            X.5sO r2 = X.DbU.A0f()
        L_0x002f:
            return r2
        L_0x0030:
            X.0eS.A00(r0)
            X.1NY r1 = X.AnonymousClass7TG.A0a(r6)
            java.lang.String r0 = "stories/hallpass/remove_self/"
            r1.A0A(r0)
            java.lang.String r0 = "hallpass_id"
            X.DbX.A1M(r1, r0, r7)
            X.1OC r1 = r1.A0M()
            r3.A00 = r4
            r0 = 858569580(0x332cbb6c, float:4.021733E-8)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L_0x0022
            return r2
        L_0x0051:
            r0 = 42
            X.ME3 r3 = new X.ME3
            r3.<init>(r5, r8, r4, r0)
            goto L_0x0015
        L_0x0059:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A05(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r0 == r4) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = X.ME3.A03(r3, r8)
            if (r0 == 0) goto L_0x0076
            r5 = r8
            X.ME3 r5 = (X.ME3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0056
            if (r1 != r3) goto L_0x0083
            X.0eS.A00(r0)
        L_0x0023:
            r4 = r0
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003c
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.Dub r0 = (X.C47308Dub) r0
            X.MWG r0 = r0.A00
            if (r0 != 0) goto L_0x0045
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003c:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0049
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0045:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x0049:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0075
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007e
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x0056:
            X.0eS.A00(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r0 = "stories/hallpass/suggested_users/"
            r2.A0A(r0)
            java.lang.Class<X.Dub> r1 = X.C47308Dub.class
            java.lang.Class<X.F4O> r0 = X.F4O.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 210658095(0xc8e632f, float:2.1938258E-31)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0023
        L_0x0075:
            return r4
        L_0x0076:
            r0 = 42
            X.ME3 r5 = new X.ME3
            r5.<init>(r6, r8, r3, r0)
            goto L_0x0015
        L_0x007e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0083:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A07(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r0 == r2) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.util.List r11, X.AnonymousClass4D7 r12) {
        /*
            r7 = this;
            r4 = 47
            boolean r0 = X.C66136MDo.A01(r4, r12)
            if (r0 == 0) goto L_0x009d
            r3 = r12
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009d
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 != r5) goto L_0x00ab
            X.0eS.A00(r0)
        L_0x0024:
            r2 = r0
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.Dua r0 = (X.C47307Dua) r0
            X.JxH r0 = r0.A00
            if (r0 != 0) goto L_0x0046
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x004a:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x009c
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a6
            X.5sO r2 = X.DbU.A0f()
            return r2
        L_0x0057:
            X.0eS.A00(r0)
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0063:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            X.DbT.A1W(r1, r6)
            goto L_0x0063
        L_0x006d:
            X.1NY r4 = X.AnonymousClass7TG.A0a(r8)
            java.lang.String r0 = "stories/hallpass/create/"
            r4.A0A(r0)
            java.lang.String r0 = "name"
            r4.A9m(r0, r9)
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "member_ids"
            r4.A9m(r0, r1)
            java.lang.String r0 = "color"
            r4.A9m(r0, r10)
            java.lang.Class<X.Dua> r1 = X.C47307Dua.class
            java.lang.Class<X.F4M> r0 = X.F4M.class
            X.1OC r1 = X.DbU.A0S(r4, r1, r0)
            r3.A00 = r5
            r0 = 266501256(0xfe27c88, float:2.2333288E-29)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L_0x0024
        L_0x009c:
            return r2
        L_0x009d:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r7, r12, r4, r0)
            goto L_0x0016
        L_0x00a6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        if (r0 == r2) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r9, java.lang.String r10, java.util.List r11, java.util.List r12, X.AnonymousClass4D7 r13) {
        /*
            r8 = this;
            r4 = 46
            boolean r0 = X.C66136MDo.A01(r4, r13)
            if (r0 == 0) goto L_0x00bc
            r3 = r13
            X.MDo r3 = (X.C66136MDo) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r4 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 != r4) goto L_0x00ca
            X.0eS.A00(r0)
        L_0x0024:
            r2 = r0
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.Dur r0 = (X.C47324Dur) r0
            X.MWF r0 = r0.A00
            if (r0 != 0) goto L_0x0046
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            X.3Ih r2 = X.C41845B3m.A0d(r0)
        L_0x004a:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00bb
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c5
            X.5sO r2 = X.DbU.A0f()
            return r2
        L_0x0057:
            X.0eS.A00(r0)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x0068:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0072
            X.DbT.A1W(r1, r7)
            goto L_0x0068
        L_0x0072:
            java.util.Iterator r1 = r12.iterator()
        L_0x0076:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0080
            X.DbT.A1W(r1, r6)
            goto L_0x0076
        L_0x0080:
            X.1NY r5 = X.AnonymousClass7TG.A0a(r9)
            java.lang.String r0 = "stories/hallpass/bulk_update_members/"
            r5.A0A(r0)
            java.lang.String r0 = "hallpass_id"
            r5.A9m(r0, r10)
            java.lang.String r1 = r7.toString()
            r0 = 1078(0x436, float:1.51E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r1)
            java.lang.String r1 = r6.toString()
            r0 = 1759(0x6df, float:2.465E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A9m(r0, r1)
            java.lang.Class<X.Dur> r1 = X.C47324Dur.class
            java.lang.Class<X.F4N> r0 = X.F4N.class
            X.1OC r1 = X.DbU.A0S(r5, r1, r0)
            r3.A00 = r4
            r0 = 2081267221(0x7c0d9e15, float:2.9412806E36)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L_0x0024
        L_0x00bb:
            return r2
        L_0x00bc:
            r0 = 42
            X.MDo r3 = new X.MDo
            r3.<init>(r8, r13, r4, r0)
            goto L_0x0016
        L_0x00c5:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A02(com.instagram.common.session.UserSession, java.lang.String, java.util.List, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r0 == r4) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.common.session.UserSession r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 48
            boolean r0 = X.C66136MDo.A01(r3, r9)
            if (r0 == 0) goto L_0x007f
            r5 = r9
            X.MDo r5 = (X.C66136MDo) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 != r3) goto L_0x008c
            X.0eS.A00(r0)
        L_0x0024:
            r4 = r0
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.CDu r0 = (X.C43802CDu) r0
            X.BF1 r0 = r0.A00
            if (r0 != 0) goto L_0x0046
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            X.3Ih r4 = X.C41845B3m.A0d(r0)
        L_0x004a:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x007e
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0087
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x0057:
            X.0eS.A00(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r0 = "stories/hallpass/hallpass_participation/"
            r2.A0A(r0)
            r1 = 0
            X.FTG r0 = new X.FTG
            r0.<init>(r8, r1)
            r2.A04 = r0
            java.lang.Class<X.CDu> r1 = X.C43802CDu.class
            java.lang.Class<X.Cyr> r0 = X.C45579Cyr.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 62624287(0x3bb921f, float:1.102442E-36)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0024
        L_0x007e:
            return r4
        L_0x007f:
            r0 = 42
            X.MDo r5 = new X.MDo
            r5.<init>(r6, r9, r3, r0)
            goto L_0x0016
        L_0x0087:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A03(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (r0 == r3) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.common.session.UserSession r7, java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r6 = this;
            r3 = 49
            boolean r0 = X.C66136MDo.A01(r3, r9)
            if (r0 == 0) goto L_0x0084
            r4 = r9
            X.MDo r4 = (X.C66136MDo) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L_0x0057
            if (r1 != r5) goto L_0x0091
            X.0eS.A00(r0)
        L_0x0024:
            r3 = r0
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x003d
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.Dur r0 = (X.C47324Dur) r0
            X.MWF r0 = r0.A00
            if (r0 != 0) goto L_0x0046
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003d:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0046:
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x004a:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0083
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008c
            X.5sO r3 = X.DbU.A0f()
            return r3
        L_0x0057:
            X.0eS.A00(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r1 = "stories/hallpass/"
            java.lang.String r0 = "/members/"
            java.lang.String r0 = X.002.A0g(r1, r8, r0)
            r2.A0A(r0)
            X.FTG r0 = new X.FTG
            r0.<init>(r8, r5)
            r2.A04 = r0
            java.lang.Class<X.Dur> r1 = X.C47324Dur.class
            java.lang.Class<X.F4N> r0 = X.F4N.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r4.A00 = r5
            r0 = 197584665(0xbc6e719, float:7.661454E-32)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L_0x0024
        L_0x0083:
            return r3
        L_0x0084:
            r0 = 42
            X.MDo r4 = new X.MDo
            r4.<init>(r6, r9, r3, r0)
            goto L_0x0016
        L_0x008c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0091:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A04(com.instagram.common.session.UserSession, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        if (r0 == r4) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(com.instagram.common.session.UserSession r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 31
            boolean r0 = X.C66137MDp.A02(r3, r8)
            if (r0 == 0) goto L_0x0097
            r5 = r8
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L_0x0075
            if (r1 != r3) goto L_0x00a3
            java.lang.Object r7 = r5.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0eS.A00(r0)
        L_0x0028:
            r4 = r0
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0041
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.CDD r0 = (X.CDD) r0
            X.Dso r3 = r0.A00
            if (r3 != 0) goto L_0x004a
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0041:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0068
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004a:
            X.1Av r1 = X.1Au.A00(r7)
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.0xY r1 = X.AnonymousClass7TE.A0p(r1)
            r0 = 3207(0xc87, float:4.494E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.E5Z(r0, r2)
            r1.apply()
            X.3Ih r4 = X.C41845B3m.A0d(r3)
        L_0x0068:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0096
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x009e
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x0075:
            X.0eS.A00(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r7)
            java.lang.String r0 = "stories/hallpass/share_info/"
            r2.A0A(r0)
            java.lang.Class<X.CDD> r1 = X.CDD.class
            java.lang.Class<X.Cys> r0 = X.C45580Cys.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A01 = r7
            r5.A00 = r3
            r0 = 1241356902(0x49fd9a66, float:2077516.8)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L_0x0028
        L_0x0096:
            return r4
        L_0x0097:
            X.MDp r5 = new X.MDp
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x009e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A06(com.instagram.common.session.UserSession, X.4D7):java.lang.Object");
    }
}
