package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "Please copy all changes to SponsoredContentLoggerKtImpl. They're being AB tested.")
/* renamed from: X.2vM  reason: invalid class name */
public final class AnonymousClass2vM implements AnonymousClass2vG {
    public final C233192vD A00;
    public final 28s A01;
    public final String A02;
    public final UserSession A03;
    public final C233262vP A04;
    public final C233182vC A05;
    public final AnonymousClass2vG A06;
    public final C233282vR A07;

    public final void Cgz(int i, boolean z, long j) {
        Ch0((String) null, i, j, z);
    }

    public final void Ch2(AnonymousClass4LN r14, List list, int i, long j, boolean z) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        HashMap hashMap = new HashMap(arrayList.size());
        for (Object next : list) {
            C233182vC r1 = this.A05;
            arrayList.add(r1.ATn(next));
            Collection ATq = r1.ATq(next);
            ATq.getClass();
            hashMap.put(r1.ATn(next), TextUtils.join(",", ATq));
        }
        this.A06.Ch2(AnonymousClass4LN.A0D, list2, i, j, z);
        this.A01.A00("acp_item_finish_request_success", TextUtils.join(",", arrayList), (String) null, (String) null);
    }

    public final void Cgs(String str, String str2, String str3) {
        this.A06.Cgs(str, str2, str3);
    }

    public final void Cgt(Integer num, Object obj) {
        this.A06.Cgt(num, obj);
        28s r5 = this.A01;
        C233182vC r3 = this.A05;
        r5.A00("acp_ad_delivery", r3.ATn(obj), r3.AU6(obj), (String) null);
        AnonymousClass2oK.A00(this.A03).A04(AnonymousClass05K.A0C, r3.ATn(obj), r3.AU6(obj), r3.AUT(obj), this.A00.A00);
    }

    public final void Cgu(C251373n0 r9, Object obj) {
        this.A06.Cgu(r9, obj);
        28s r4 = this.A01;
        String A002 = AnonymousClass000.A00(2568);
        C233182vC r6 = this.A05;
        Object BTb = r9.BTb();
        r4.A00(A002, r6.ATn(BTb), r6.AU6(BTb), (String) null);
        UserSession userSession = this.A03;
        C242573Va A003 = AnonymousClass4LW.A00(userSession);
        1PW r10 = (1PW) obj;
        0qQ.A0B(r10, 0);
        A003.A00(r10.A0B, this.A00.A00, r6.ATn(BTb), r6.AU6(BTb));
        AnonymousClass2oK.A00(userSession).A01(AnonymousClass05K.A0C, r10.A0B, r6.ATn(BTb));
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
            X.2vG r0 = r7.A06
            r0.Cgv(r8, r9)
            com.instagram.common.session.UserSession r0 = r7.A03
            X.2oL r2 = X.AnonymousClass2oK.A00(r0)
            X.2vC r6 = r7.A05
            java.lang.Object r5 = r8.BTb()
            java.lang.String r1 = r6.ATn(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2.A03(r0, r1)
            X.28s r4 = r7.A01
            java.lang.String r3 = "acp_ad_insertion_success"
            java.lang.String r2 = r6.ATn(r5)
            java.lang.String r1 = r6.AU6(r5)
            r0 = 0
            r4.A00(r3, r2, r1, r0)
            X.2vP r2 = r7.A04
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L_0x0042
            X.HKx r1 = X.C54614HKx.A02
            java.lang.String r0 = r6.ATn(r5)
            if (r0 == 0) goto L_0x0043
            X.HEg r0 = new X.HEg
            r0.<init>()
        L_0x003f:
            r2.FKJ(r0, r1)
        L_0x0042:
            return
        L_0x0043:
            X.HEh r0 = X.C54453HEh.A00
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2vM.Cgv(X.3n0, java.lang.Object):void");
    }

    public final void Cgw(1PW r21, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        Object obj2 = obj;
        String str5 = str;
        this.A06.Cgw(r21, l, obj2, str5, str2, str3, str4, collection, collection2, map, map2, z);
        UserSession userSession = this.A03;
        C242573Va A002 = AnonymousClass4LW.A00(userSession);
        String str6 = this.A00.A00;
        C233182vC r4 = this.A05;
        A002.A02(str5, str6, r4.ATn(obj2), r4.AU6(obj2));
        AnonymousClass2oK.A00(userSession).A05(r4.ATn(obj2), AnonymousClass05K.A0C, str5);
        this.A01.A00(AnonymousClass000.A00(2569), r4.ATn(obj2), r4.AU6(obj2), str5);
    }

    public final void Cgx(Iterable iterable, String str, String str2) {
        this.A06.Cgx(iterable, "hp0_unavailable", str2);
    }

    public final void Cgy(1Xj r18, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        String str6 = str5;
        String str7 = str4;
        Integer num5 = num2;
        Integer num6 = num;
        List list4 = list3;
        1Xj r1 = r18;
        List list5 = list2;
        Integer num7 = num3;
        Integer num8 = num4;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        this.A06.Cgy(r1, num6, num5, num7, num8, str8, str9, str10, str7, str6, hashMap, list, list5, list4, f, i);
    }

    public final void Ch0(String str, int i, long j, boolean z) {
        int i2 = i;
        long j2 = j;
        boolean z2 = z;
        this.A06.Ch0(str, i2, j2, z2);
        this.A01.A00(AnonymousClass000.A00(2570), (String) null, (String) null, 002.A0Q("latency", j));
        AnonymousClass4LW.A00(this.A03).A01(this.A00.A00, i2, j2, z2);
    }

    public final void Ch1(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A06.Ch1(str, str2, str3, str4, z, z2);
    }

    public final void Ch3(AnonymousClass4LN r4, Iterable iterable) {
        this.A06.Ch3(r4, iterable);
        this.A01.A00("acp_item_request", (String) null, (String) null, (String) null);
    }

    public final void Chf(C251373n0 r2, Object obj, String str) {
        this.A06.Chf(r2, obj, str);
    }

    public final void Cj5(C251373n0 r2) {
        this.A06.Cj5(r2);
    }

    public final void Cj9(String str, String str2) {
        this.A06.Cj9(str, str2);
        AnonymousClass2oK.A00(this.A03).A02(C266914aY.A00(str2), str);
    }

    public final void CjA(C251373n0 r6, Iterable iterable) {
        this.A06.CjA(r6, iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A05.ATn(((C251373n0) it.next()).BTb()));
        }
        this.A01.A00("acp_item_exit_pool", TextUtils.join(",", arrayList), (String) null, (String) null);
    }

    public final void CjQ(Object obj) {
        this.A06.CjQ(obj);
        28s r5 = this.A01;
        C233182vC r3 = this.A05;
        r5.A00("acp_netego_delivery", r3.AUE(obj), r3.AU6(obj), (String) null);
        AnonymousClass2oK.A00(this.A03).A04(AnonymousClass05K.A0N, r3.AUE(obj), r3.AU6(obj), r3.AUT(obj), this.A00.A00);
    }

    public final void CjR(C251373n0 r5, Object obj) {
        this.A06.CjR(r5, obj);
        this.A01.A00(AnonymousClass000.A00(2571), (String) null, (String) null, (String) null);
        C229812oL A002 = AnonymousClass2oK.A00(this.A03);
        String AUE = this.A05.AUE(r5.BTb());
        Integer num = AnonymousClass05K.A0N;
        1PW r6 = (1PW) obj;
        0qQ.A0B(r6, 0);
        A002.A01(num, r6.A0B, AUE);
    }

    public final void CjS(C251373n0 r4, Object obj) {
        this.A06.CjS(r4, obj);
        AnonymousClass2oK.A00(this.A03).A03(AnonymousClass05K.A0N, this.A05.AUE(r4.BTb()));
        this.A01.A00("acp_netego_insertion_success", (String) null, (String) null, (String) null);
    }

    public final void CjT(Object obj, String str, Collection collection) {
        this.A06.CjT(obj, str, collection);
        28s r4 = this.A01;
        String A002 = AnonymousClass000.A00(2572);
        C233182vC r3 = this.A05;
        r4.A00(A002, r3.ATn(obj), r3.AU6(obj), str);
        AnonymousClass2oK.A00(this.A03).A05(r3.AUE(obj), AnonymousClass05K.A0N, str);
    }

    public final void Cjj(Integer num, Object obj, String str, List list) {
        this.A06.Cjj(num, obj, str, list);
    }

    public final void Cjk(AnonymousClass9I2 r10, String str, long j, long j2, long j3) {
        this.A06.Cjk(r10, "feed_tbi", j, 0, j3);
    }

    public final void Ckm(AnonymousClass3VZ r2) {
        this.A06.Ckm(r2);
    }

    public final void Dpj(AnonymousClass3VZ r2) {
        this.A06.Dpj(r2);
    }

    public final void ERc(String str) {
        this.A06.ERc(str);
    }

    public final void EVW(int i) {
        this.A06.EVW(i);
        28s r3 = this.A01;
        String str = this.A00.A00;
        String str2 = this.A02;
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        r3.A00 = str;
        r3.A01 = str2;
    }

    public AnonymousClass2vM(UserSession userSession, C233262vP r2, C233182vC r3, C233192vD r4, AnonymousClass2vG r5, C233282vR r6, 28s r7, String str) {
        this.A03 = userSession;
        this.A00 = r4;
        this.A02 = str;
        this.A06 = r5;
        this.A01 = r7;
        this.A05 = r3;
        this.A04 = r2;
        this.A07 = r6;
    }
}
