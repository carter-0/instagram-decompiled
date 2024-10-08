package com.instagram.friendmap.data;

import X.00k;
import X.02z;
import X.05G;
import X.094;
import X.0qQ;
import X.0sl;
import X.0sn;
import X.106;
import X.1E4;
import X.1E5;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass4A4;
import X.AnonymousClass4A5;
import X.AnonymousClass4D7;
import X.AnonymousClass4HW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C335967dq;
import X.C41845B3m;
import X.C43684C5g;
import X.C43693C5p;
import X.C43694C5q;
import X.C51971G9r;
import X.C59822JZw;
import X.C61040Jve;
import X.C61082JwK;
import X.C66192MHi;
import X.DbS;
import X.DbV;
import X.Dbc;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class FriendMapAudienceListRepository {
    public String A00;
    public final AnonymousClass4HW A01 = C335967dq.A00(C59822JZw.A00);
    public final UserSession A02;
    public final AnonymousClass4A4 A03;
    public final Set A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass4A5 A08;
    public final Set A09;

    public static final void A00(FriendMapAudienceListRepository friendMapAudienceListRepository, C43694C5q c5q, boolean z, boolean z2) {
        Object value;
        C61040Jve jve;
        String str;
        ImmutableList immutableList;
        Collection A0S;
        ArrayList A1C;
        FriendMapAudienceListRepository friendMapAudienceListRepository2 = friendMapAudienceListRepository;
        05G r1 = friendMapAudienceListRepository2.A06;
        do {
            value = r1.getValue();
            jve = (C61040Jve) value;
            str = null;
            C43694C5q c5q2 = c5q;
            if (c5q == null || (immutableList = c5q2.getOptionalCompactedTreeListField(9, "users", C43693C5p.class, 776072309)) == null) {
                immutableList = 0sn.A00;
            }
            AbstractCollection A0r = AnonymousClass7TG.A0r(immutableList);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr reinterpretRequired = C41845B3m.A0V(it).reinterpretRequired(0, C43684C5g.class, 261567527);
                1E5 A002 = 1E4.A00(friendMapAudienceListRepository2.A02);
                Parcelable.Creator creator = User.CREATOR;
                User A0A = Dbc.A0A(reinterpretRequired, A002);
                0qQ.A07(A0A);
                A0r.add(new C61082JwK(A0A, DbV.A1a(A0A, (Set) friendMapAudienceListRepository2.A07.getValue()), 28));
            }
            if (z) {
                if (z2) {
                    A0r = 094.A00(A0r, friendMapAudienceListRepository2.A09);
                }
                A0S = A0r;
            } else {
                A0S = 00k.A0S(A0r, (Collection) jve.A01);
            }
            HashSet A1F = AnonymousClass7TE.A1F();
            A1C = AnonymousClass7TE.A1C();
            for (Object next : A0S) {
                C51971G9r.A1O(DbS.A0q(((C61082JwK) next).A00), next, A1F, A1C);
            }
            if (c5q != null) {
                str = c5q2.A0C("next_max_id");
            }
        } while (!r1.AIY(value, new C61040Jve(str, A1C, false, false, jve.A03, jve.A06)));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c A[LOOP:0: B:10:0x0036->B:12:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c A[LOOP:2: B:22:0x0096->B:24:0x009c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5 A[LOOP:3: B:26:0x00bf->B:28:0x00c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r4 = 14
            boolean r0 = X.C66137MDp.A02(r4, r13)
            if (r0 == 0) goto L_0x0085
            r2 = r13
            X.MDp r2 = (X.C66137MDp) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0085
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0016:
            java.lang.Object r5 = r2.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L_0x004b
            if (r0 != r8) goto L_0x00de
            java.lang.Object r4 = r2.A01
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.0eS.A00(r5)
        L_0x0028:
            X.N4R r5 = (X.N4R) r5
            java.lang.Object r0 = r5.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0036:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008a
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            r1 = 28
            X.JwK r0 = new X.JwK
            r0.<init>((com.instagram.user.model.User) r2, (boolean) r8, (int) r1)
            r7.add(r0)
            goto L_0x0036
        L_0x004b:
            X.0eS.A00(r5)
            X.05G r4 = r12.A06
        L_0x0050:
            java.lang.Object r1 = r4.getValue()
            r0 = r1
            X.Jve r0 = (X.C61040Jve) r0
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r0.A02
            boolean r9 = r0.A05
            boolean r10 = r0.A03
            boolean r11 = r0.A06
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.Jve r5 = new X.Jve
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r4.AIY(r1, r5)
            if (r0 == 0) goto L_0x0050
            X.4A4 r0 = r12.A03
            X.4A5 r1 = r12.A08
            r2.A01 = r12
            r2.A00 = r8
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r0.A00
            java.lang.Object r5 = r0.A04(r1, r2)
            if (r5 != r3) goto L_0x0083
            return r3
        L_0x0083:
            r4 = r12
            goto L_0x0028
        L_0x0085:
            X.MDp r2 = X.C66137MDp.A00(r12, r13, r4)
            goto L_0x0016
        L_0x008a:
            java.lang.Object r0 = r5.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x0096:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ac
            com.instagram.user.model.User r3 = X.DbT.A0k(r5)
            r2 = 0
            r1 = 28
            X.JwK r0 = new X.JwK
            r0.<init>((com.instagram.user.model.User) r3, (boolean) r2, (int) r1)
            r6.add(r0)
            goto L_0x0096
        L_0x00ac:
            java.util.Set r1 = r4.A09
            java.util.ArrayList r0 = X.00k.A0S(r6, r7)
            r1.addAll(r0)
            java.util.Set r3 = r4.A04
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x00bf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r1.next()
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.DbU.A1V(r0, r2)
            goto L_0x00bf
        L_0x00d3:
            r3.addAll(r2)
            X.05G r0 = r4.A07
            r0.Epw(r3)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapAudienceListRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r4 = 15
            boolean r0 = X.C66137MDp.A02(r4, r13)
            if (r0 == 0) goto L_0x00ac
            r3 = r13
            X.MDp r3 = (X.C66137MDp) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ac
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r3.A00
            r11 = 1
            if (r1 == 0) goto L_0x005d
            if (r1 != r11) goto L_0x00b2
            java.lang.Object r4 = r3.A01
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.0eS.A00(r0)
        L_0x0028:
            X.05G r3 = r4.A06
        L_0x002a:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jve r1 = (X.C61040Jve) r1
            r11 = 0
            java.lang.Object r7 = r1.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r1.A02
            boolean r8 = r1.A04
            boolean r9 = r1.A05
            boolean r10 = r1.A03
            X.0qQ.A0B(r7, r11)
            X.Jve r5 = new X.Jve
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r1 = r3.AIY(r2, r5)
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x005c
            java.util.Set r2 = r4.A04
            r2.clear()
            X.05G r1 = r4.A07
            java.util.Collection r1 = X.JTO.A13(r1)
            r2.addAll(r1)
        L_0x005c:
            return r0
        L_0x005d:
            X.0eS.A00(r0)
            X.05G r2 = r12.A06
        L_0x0062:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.Jve r0 = (X.C61040Jve) r0
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r0.A02
            boolean r8 = r0.A04
            boolean r9 = r0.A05
            boolean r10 = r0.A03
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.Jve r5 = new X.Jve
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.AIY(r1, r5)
            if (r0 == 0) goto L_0x0062
            X.4A4 r7 = r12.A03
            X.4A5 r6 = r12.A08
            X.05G r5 = r12.A07
            java.lang.Iterable r0 = X.JTO.A0x(r5)
            java.util.Set r1 = r12.A04
            java.util.Set r2 = X.00k.A0m(r0, r1)
            java.lang.Iterable r0 = X.JTO.A0x(r5)
            java.util.Set r1 = X.00k.A0m(r1, r0)
            r3.A01 = r12
            r3.A00 = r11
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r7.A00
            java.lang.Object r0 = r0.A03(r6, r2, r1, r3)
            if (r0 != r4) goto L_0x00a9
            return r4
        L_0x00a9:
            r4 = r12
            goto L_0x0028
        L_0x00ac:
            X.MDp r3 = X.C66137MDp.A00(r12, r13, r4)
            goto L_0x0016
        L_0x00b2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapAudienceListRepository.A02(X.4D7):java.lang.Object");
    }

    public FriendMapAudienceListRepository(UserSession userSession, AnonymousClass4A4 r7, AnonymousClass4A5 r8) {
        this.A02 = userSession;
        this.A08 = r8;
        this.A03 = r7;
        02z A012 = 106.A01(0sl.A00);
        this.A07 = A012;
        this.A09 = DbS.A0y();
        this.A04 = DbS.A0y();
        02z A10 = DbS.A10(new C61040Jve());
        this.A06 = A10;
        this.A05 = AnonymousClass10H.A03(new C66192MHi((Object) this, (AnonymousClass4D7) null, 9), A10, A012);
    }
}
