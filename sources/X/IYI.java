package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IYI implements AnonymousClass2vG {
    public final C233192vD A00;
    public final AnonymousClass2vG A01;
    public final 28s A02;
    public final String A03;
    public final UserSession A04;
    public final C233262vP A05;
    public final C233182vC A06;
    public final JME A07;

    public IYI(UserSession userSession, C233262vP r3, C233182vC r4, C233192vD r5, AnonymousClass2vG r6, JME jme, 28s r8, String str) {
        DbW.A1N(str, 3, r8);
        this.A00 = r5;
        this.A04 = userSession;
        this.A03 = str;
        this.A01 = r6;
        this.A02 = r8;
        this.A06 = r4;
        this.A05 = r3;
        this.A07 = jme;
    }

    public static AnonymousClass2vG A00(IYI iyi, Object obj) {
        0qQ.A0B(obj, 0);
        return iyi.A01;
    }

    public final void Cgt(Integer num, Object obj) {
        0qQ.A0B(num, 1);
        this.A01.Cgt(num, obj);
        28s r5 = this.A02;
        C233182vC r3 = this.A06;
        r5.A00("acp_ad_delivery", r3.ATn(obj), r3.AU6(obj), (String) null);
        AnonymousClass2oK.A00(this.A04).A04(AnonymousClass05K.A0C, r3.ATn(obj), r3.AU6(obj), r3.AUT(obj), this.A00.A00);
    }

    public final void Cgu(C251373n0 r10, Object obj) {
        0qQ.A0B(r10, 0);
        this.A01.Cgu(r10, obj);
        28s r4 = this.A02;
        String A002 = AnonymousClass000.A00(2568);
        C233182vC r7 = this.A06;
        Object BTb = r10.BTb();
        r4.A00(A002, r7.ATn(BTb), r7.AU6(BTb), (String) null);
        UserSession userSession = this.A04;
        C242573Va A003 = AnonymousClass4LW.A00(userSession);
        1PW r11 = (1PW) obj;
        0qQ.A0B(r11, 0);
        A003.A00(r11.A0B, this.A00.A00, r7.ATn(BTb), r7.AU6(BTb));
        AnonymousClass2oK.A00(userSession).A01(AnonymousClass05K.A0C, r11.A0B, r7.ATn(BTb));
    }

    public final void Cgz(int i, boolean z, long j) {
        Ch0((String) null, i, j, z);
    }

    public final void Ch2(AnonymousClass4LN r13, List list, int i, long j, boolean z) {
        List list2 = list;
        0qQ.A0B(list, 0);
        ArrayList A0m = C51970G9q.A0m(list);
        HashMap hashMap = new HashMap(A0m.size());
        for (Object next : list) {
            C233182vC r1 = this.A06;
            A0m.add(r1.ATn(next));
            Collection ATq = r1.ATq(next);
            String ATn = r1.ATn(next);
            String join = TextUtils.join(",", ATq);
            0qQ.A07(join);
            hashMap.put(ATn, join);
        }
        this.A01.Ch2(AnonymousClass4LN.A0D, list2, i, j, z);
        28s r3 = this.A02;
        String join2 = TextUtils.join(",", A0m);
        0qQ.A07(join2);
        r3.A00("acp_item_finish_request_success", join2, (String) null, (String) null);
    }

    public final void CjR(C251373n0 r6, Object obj) {
        this.A01.CjR(r6, obj);
        this.A02.A00(AnonymousClass000.A00(2571), (String) null, (String) null, (String) null);
        C229812oL A002 = AnonymousClass2oK.A00(this.A04);
        String AUE = this.A06.AUE(r6.BTb());
        Integer num = AnonymousClass05K.A0N;
        1PW r7 = (1PW) obj;
        0qQ.A0B(r7, 0);
        A002.A01(num, r7.A0B, AUE);
    }

    public final void Cgw(1PW r20, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        String str5 = str;
        Collection collection3 = collection;
        Collection collection4 = collection2;
        C51974G9v.A1M(str5, collection3, collection4);
        1PW r7 = r20;
        0qQ.A0B(r7, 11);
        Object obj2 = obj;
        this.A01.Cgw(r7, l, obj2, str5, str2, str3, str4, collection3, collection4, map, map2, z);
        UserSession userSession = this.A04;
        C242573Va A002 = AnonymousClass4LW.A00(userSession);
        String str6 = this.A00.A00;
        C233182vC r4 = this.A06;
        A002.A02(str5, str6, r4.ATn(obj2), r4.AU6(obj2));
        AnonymousClass2oK.A00(userSession).A05(r4.ATn(obj2), AnonymousClass05K.A0C, str5);
        this.A02.A00(AnonymousClass000.A00(2569), r4.ATn(obj2), r4.AU6(obj2), str5);
    }

    public final void Cgx(Iterable iterable, String str, String str2) {
        AnonymousClass7TG.A1T("hp0_unavailable", str2, iterable);
        this.A01.Cgx(iterable, "hp0_unavailable", str2);
    }

    public final void Cgy(1Xj r18, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        List list4 = list;
        List list5 = list3;
        List list6 = list2;
        String str6 = str;
        C51974G9v.A1O(list4, list6, list5, str6);
        HashMap hashMap2 = hashMap;
        String str7 = str2;
        String str8 = str3;
        C51973G9u.A0s(5, str7, str8, hashMap2);
        Integer num5 = num2;
        Integer num6 = num;
        1Xj r1 = r18;
        Integer num7 = num3;
        Integer num8 = num4;
        this.A01.Cgy(r1, num6, num5, num7, num8, str6, str7, str8, str4, str5, hashMap2, list4, list6, list5, f, i);
    }

    public final void Ch0(String str, int i, long j, boolean z) {
        int i2 = i;
        long j2 = j;
        boolean z2 = z;
        this.A01.Ch0(str, i2, j2, z2);
        this.A02.A00(AnonymousClass000.A00(2570), (String) null, (String) null, 002.A0Q(AnonymousClass000.A00(3496), j));
        AnonymousClass4LW.A00(this.A04).A01(this.A00.A00, i2, j2, z2);
    }

    public final void Ch1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A01.Ch1(str, str2, str3, str4, z, z2);
    }

    public final void CjQ(Object obj) {
        this.A01.CjQ(obj);
        28s r5 = this.A02;
        C233182vC r3 = this.A06;
        r5.A00("acp_netego_delivery", r3.AUE(obj), r3.AU6(obj), (String) null);
        AnonymousClass2oK.A00(this.A04).A04(AnonymousClass05K.A0N, r3.AUE(obj), r3.AU6(obj), r3.AUT(obj), this.A00.A00);
    }

    public final void Cjk(AnonymousClass9I2 r10, String str, long j, long j2, long j3) {
        0qQ.A0B(r10, 3);
        this.A01.Cjk(r10, "feed_tbi", j, 0, j3);
    }

    public final void EVW(int i) {
        this.A01.EVW(i);
        28s r3 = this.A02;
        String str = this.A00.A00;
        String str2 = this.A03;
        0qQ.A0B(str, 0);
        r3.A00 = str;
        r3.A01 = str2;
    }

    public final void Cgs(String str, String str2, String str3) {
        A00(this, str).Cgs(str, str2, str3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.HEh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.HEh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.HEh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cgv(X.C251373n0 r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.2vG r0 = A00(r7, r8)
            r0.Cgv(r8, r9)
            com.instagram.common.session.UserSession r0 = r7.A04
            X.2oL r2 = X.AnonymousClass2oK.A00(r0)
            X.2vC r6 = r7.A06
            java.lang.Object r5 = r8.BTb()
            java.lang.String r1 = r6.ATn(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A03(r0, r1)
            X.28s r4 = r7.A02
            java.lang.String r3 = "acp_ad_insertion_success"
            java.lang.String r2 = r6.ATn(r5)
            java.lang.String r1 = r6.AU6(r5)
            r0 = 0
            r4.A00(r3, r2, r1, r0)
            X.2vP r2 = r7.A05
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0044
            X.HKx r1 = X.C54614HKx.A02
            java.lang.String r0 = r6.ATn(r5)
            if (r0 == 0) goto L_0x0045
            X.HEg r0 = new X.HEg
            r0.<init>()
        L_0x0041:
            r2.FKJ(r0, r1)
        L_0x0044:
            return
        L_0x0045:
            X.HEh r0 = X.C54453HEh.A00
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IYI.Cgv(X.3n0, java.lang.Object):void");
    }

    public final void Ch3(AnonymousClass4LN r4, Iterable iterable) {
        AnonymousClass7TG.A1N(r4, iterable);
        this.A01.Ch3(r4, iterable);
        this.A02.A00("acp_item_request", (String) null, (String) null, (String) null);
    }

    public final void Chf(C251373n0 r2, Object obj, String str) {
        A00(this, r2).Chf(r2, obj, str);
    }

    public final void Cj5(C251373n0 r2) {
        A00(this, r2).Cj5(r2);
    }

    public final void Cj9(String str, String str2) {
        A00(this, str).Cj9(str, str2);
        AnonymousClass2oK.A00(this.A04).A02(C266914aY.A00(str2), str);
    }

    public final void CjA(C251373n0 r6, Iterable iterable) {
        AnonymousClass7TG.A1N(r6, iterable);
        this.A01.CjA(r6, iterable);
        ArrayList A0r = AnonymousClass7TG.A0r(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0r.add(this.A06.ATn(((C251373n0) it.next()).BTb()));
        }
        28s r3 = this.A02;
        String join = TextUtils.join(",", A0r);
        0qQ.A07(join);
        r3.A00("acp_item_exit_pool", join, (String) null, (String) null);
    }

    public final void CjS(C251373n0 r4, Object obj) {
        A00(this, r4).CjS(r4, obj);
        AnonymousClass2oK.A00(this.A04).A03(AnonymousClass05K.A0N, this.A06.AUE(r4.BTb()));
        this.A02.A00("acp_netego_insertion_success", (String) null, (String) null, (String) null);
    }

    public final void CjT(Object obj, String str, Collection collection) {
        AnonymousClass7TG.A1O(str, collection);
        this.A01.CjT(obj, str, collection);
        28s r4 = this.A02;
        String A002 = AnonymousClass000.A00(2572);
        C233182vC r3 = this.A06;
        r4.A00(A002, r3.ATn(obj), r3.AU6(obj), str);
        AnonymousClass2oK.A00(this.A04).A05(r3.AUE(obj), AnonymousClass05K.A0N, str);
    }

    public final void Cjj(Integer num, Object obj, String str, List list) {
        AnonymousClass7TG.A1N(str, list);
        this.A01.Cjj(num, obj, str, list);
    }

    public final void Ckm(AnonymousClass3VZ r2) {
        A00(this, r2).Ckm(r2);
    }

    public final void Dpj(AnonymousClass3VZ r2) {
        A00(this, r2).Dpj(r2);
    }

    public final void ERc(String str) {
        A00(this, str).ERc(str);
    }
}
