package X;

import com.instagram.api.schemas.FeedItemType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4g9  reason: invalid class name and case insensitive filesystem */
public final class C270074g9 implements 1Nv {
    public AnonymousClass3IN A00;

    public final void A02(List list) {
        AnonymousClass3IN r2 = this.A00;
        0qQ.A0B(r2, 1);
        String str = r2.A03;
        int i = r2.A00;
        boolean z = r2.A08;
        boolean z2 = r2.A09;
        long j = r2.A01;
        boolean z3 = r2.A0A;
        boolean z4 = r2.A0B;
        boolean z5 = r2.A0C;
        boolean z6 = r2.A0D;
        FeedItemType feedItemType = r2.A02;
        boolean z7 = r2.A0E;
        String str2 = r2.A04;
        boolean z8 = r2.A0F;
        boolean z9 = r2.A0G;
        String str3 = r2.A05;
        String str4 = r2.A06;
        List<C306886Nx> list2 = list;
        ArrayList<C241293Oq> arrayList = new ArrayList<>(0Yv.A1E(list2, 10));
        for (C306886Nx r8 : list2) {
            0qQ.A0B(r8, 0);
            C306876Nw r82 = (C306876Nw) r8;
            String str5 = r82.A09;
            String str6 = r82.A0D;
            User user = r82.A02;
            0qQ.A0B(str5, 0);
            0qQ.A0B(str6, 1);
            0qQ.A0B(user, 2);
            C270814hL r22 = null;
            new 1E9(new 1hu((UserSession) null), 6, false);
            C241263On r19 = null;
            C241283Op r17 = new C241283Op((C270814hL) null, (C241273Oo) null, user, (Boolean) null, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, str5, (String) null, (String) null, (String) null, str6, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null);
            String str7 = r17.A09;
            String str8 = r17.A0D;
            User user2 = r17.A02;
            String str9 = r82.A0A;
            String str10 = r82.A0B;
            C241273Oo r9 = r82.A01;
            Boolean bool = r82.A03;
            Boolean bool2 = r82.A04;
            String str11 = r82.A0C;
            Boolean bool3 = r82.A05;
            List list3 = r82.A0F;
            Integer num = r82.A08;
            List list4 = r82.A0G;
            List list5 = r82.A0H;
            C270814hL r0 = r82.A00;
            Float f = r82.A06;
            List list6 = r82.A0I;
            List list7 = r82.A0J;
            String str12 = r82.A0E;
            Float f2 = r82.A07;
            new 1E9(new 1hu((UserSession) null), 6, false);
            if (r9 != null) {
                r19 = r9.F8o();
            }
            if (r0 != null) {
                r22 = r0;
            }
            arrayList.add(new C241283Op(r22, r19, user2, bool, bool2, bool3, f, f2, num, str7, str9, str10, str11, str8, str12, list3, list4, list5, list6, list7));
        }
        1E9 r5 = new 1E9(new 1hu((UserSession) null), 6, false);
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (C241293Oq FC4 : arrayList) {
            arrayList2.add(FC4.FC4(r5));
        }
        this.A00 = new AnonymousClass3IN(feedItemType, str, str2, str3, str4, arrayList2, i, j, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final String ByO(UserSession userSession) {
        return null;
    }

    public final boolean CcK() {
        return false;
    }

    public final List A01() {
        List<C241283Op> list = this.A00.A07;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (C241283Op r1 : list) {
            0qQ.A0B(r1, 0);
            String str = r1.A09;
            if (str == null) {
                str = "unknown";
            }
            String str2 = r1.A0D;
            if (str2 == null) {
                str2 = "";
            }
            User user = r1.A02;
            0qQ.A0B(user, 2);
            C241263On r12 = null;
            new 1E9(new 1hu((UserSession) null), 6, false);
            C270814hL r18 = null;
            C306876Nw r17 = new C306876Nw((C270814hL) null, (C241273Oo) null, user, (Boolean) null, (Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, str, (String) null, (String) null, (String) null, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null);
            String str3 = r17.A09;
            String str4 = r17.A0D;
            User user2 = r17.A02;
            String str5 = r1.A0A;
            String str6 = r1.A0B;
            C241273Oo r10 = r1.A01;
            Boolean bool = r1.A03;
            Boolean bool2 = r1.A04;
            String str7 = r1.A0C;
            Boolean bool3 = r1.A05;
            List list2 = r1.A0F;
            Integer num = r1.A08;
            List list3 = r1.A0G;
            List list4 = r1.A0H;
            C270814hL r7 = r1.A00;
            Float f = r1.A06;
            List list5 = r1.A0I;
            List list6 = r1.A0J;
            String str8 = r1.A0E;
            Float f2 = r1.A07;
            new 1E9(new 1hu((UserSession) null), 6, false);
            if (r10 != null) {
                r12 = r10.F8o();
            }
            if (r7 != null) {
                r18 = r7;
            }
            arrayList.add(new C306876Nw(r18, r12, user2, bool, bool2, bool3, f, f2, num, str3, str5, str6, str7, str4, str8, list2, list3, list4, list5, list6));
        }
        return arrayList;
    }

    public final boolean CUz() {
        return false;
    }

    public final boolean CYg() {
        return false;
    }

    public final String getId() {
        return String.valueOf(this.A00.A01);
    }

    public final List A00() {
        List<C306886Nx> A01 = A01();
        ArrayList arrayList = new ArrayList(0Yv.A1E(A01, 10));
        for (C306886Nx A002 : A01) {
            arrayList.add(C306906Nz.A00(A002).getId());
        }
        return arrayList;
    }
}
