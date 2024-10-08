package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Twd  reason: case insensitive filesystem */
public final class C14455Twd implements C337267fz {
    public boolean A00;
    public final /* synthetic */ C14138TqY A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r0.length() == 0) goto L_0x001d;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Der(X.C15050ULg r17, X.C67451Mo6 r18) {
        /*
            r16 = this;
            r3 = 0
            r7 = r17
            r6 = r18
            boolean r2 = X.AnonymousClass7TF.A1U(r3, r7, r6)
            r0 = r16
            X.TqY r5 = r0.A01
            java.lang.String r4 = r7.A01
            X.C14138TqY.A0A(r5, r4)
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r1 = 1
        L_0x001e:
            java.lang.String r15 = "searchQueryPerfLogger"
            java.lang.String r14 = "dataSource"
            X.Trv r0 = r5.A0D
            if (r1 == 0) goto L_0x022b
            if (r0 == 0) goto L_0x0243
            r0.A03(r4)
            X.Trv r8 = r5.A0D
            if (r8 == 0) goto L_0x0243
            r10 = 0
            X.Trf r0 = r5.A07
            if (r0 == 0) goto L_0x006e
            X.Trd r0 = r0.A01
            java.util.List r0 = r0.A00
            int r12 = r0.size()
            r13 = r3
            r11 = r3
            r9 = r4
            r8.A04(r9, r10, r11, r12, r13)
            java.lang.String r1 = "TopSearchResponse"
            java.lang.String r0 = "Invalid TopSearchResponse format, missing rankToken"
            X.0wb.A03(r1, r0)
        L_0x0049:
            boolean r0 = r6.A05
            r5.A0J = r0
            java.lang.String r1 = r7.A00
            java.lang.String r8 = "fbsearch/keyword_typeahead/"
            boolean r0 = X.0qQ.A0K(r1, r8)
            if (r0 == 0) goto L_0x0064
            boolean r0 = r6.A06
            r5.A0I = r0
            r0 = r5
            X.TqX r0 = (X.C14137TqX) r0
            X.C14137TqX.A03(r0)
            X.C14137TqX.A02(r0)
        L_0x0064:
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x0088
            X.Trn r0 = r5.A0E
            if (r0 != 0) goto L_0x0076
            java.lang.String r14 = "searchResultsProvider"
        L_0x006e:
            X.0qQ.A0F(r14)
        L_0x0071:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0076:
            X.0qQ.A0B(r4, r3)
            java.util.Set r0 = r0.A08
            boolean r0 = r0.add(r4)
            if (r0 == 0) goto L_0x0088
            X.Trf r0 = r5.A07
            if (r0 == 0) goto L_0x006e
            r0.A04()
        L_0x0088:
            X.N3M r9 = r6.A00
            if (r9 == 0) goto L_0x0093
            X.Trl r0 = r5.A08
            if (r0 == 0) goto L_0x0227
            r0.A01(r9, r4)
        L_0x0093:
            X.OEW r9 = r6.A01
            if (r9 == 0) goto L_0x00a3
            X.TwT r0 = r5.A0C
            if (r0 == 0) goto L_0x0223
            X.0qQ.A0B(r4, r3)
            java.util.concurrent.ConcurrentMap r0 = r0.A01
            r0.put(r4, r9)
        L_0x00a3:
            java.util.List r13 = r6.getItems()
            X.ULg r0 = r5.A01
            java.lang.String r0 = r0.A01
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x0206
            r5.A0H = r3
            java.util.Map r12 = r5.A0G
            java.lang.Object r0 = r12.get(r1)
            X.Jvg r0 = (X.C61042Jvg) r0
            if (r0 == 0) goto L_0x00c1
            r0.A01 = r3
            r0.A00 = r2
        L_0x00c1:
            java.lang.String r9 = "fbsearch/ig_typeahead/"
            boolean r0 = X.0qQ.A0K(r1, r9)
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "fbsearch/typeahead_stream/"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00e1
        L_0x00d1:
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A03 = r3
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A07 = r2
        L_0x00e1:
            java.lang.Object r0 = r12.get(r9)
            X.Jvg r0 = (X.C61042Jvg) r0
            java.lang.Object r1 = r12.get(r8)
            X.Jvg r1 = (X.C61042Jvg) r1
            if (r0 == 0) goto L_0x0108
            boolean r0 = r0.A00
            if (r0 != r2) goto L_0x0108
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0108
        L_0x00f9:
            android.os.Handler r11 = r5.A0b
            r0 = 2
            android.os.Message r10 = r11.obtainMessage(r0, r7)
            X.0qQ.A07(r10)
            r0 = 300(0x12c, double:1.48E-321)
            r11.sendMessageDelayed(r10, r0)
        L_0x0108:
            java.lang.Object r0 = r12.get(r8)
            X.Jvg r0 = (X.C61042Jvg) r0
            if (r0 == 0) goto L_0x0141
            boolean r0 = r0.A00
            if (r0 != r2) goto L_0x0141
            java.util.List r0 = r6.getItems()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0121
            X.C14138TqY.A08(r7, r5)
        L_0x0121:
            boolean r1 = r5.A0O
            X.Trf r0 = r5.A07
            if (r1 != 0) goto L_0x019e
            if (r0 == 0) goto L_0x006e
            X.0qQ.A0B(r4, r3)
            java.util.List r0 = X.C14200Trf.A01(r0, r4)
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x019a
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A04 = r2
        L_0x013e:
            r0.A00()
        L_0x0141:
            X.Trf r0 = r5.A07
            if (r0 == 0) goto L_0x006e
            X.Trd r8 = r0.A01
            X.X4Z r0 = r5.A0h
            boolean r0 = r0.CYJ()
            if (r0 == 0) goto L_0x0165
            X.TwE r0 = r5.A06
            if (r0 == 0) goto L_0x0165
            X.Trd r2 = r0.A00
            if (r2 == 0) goto L_0x0202
            java.util.List r1 = r8.A00
            java.util.List r0 = r2.A00
            r1.addAll(r0)
            java.util.List r1 = r8.A01
            java.util.List r0 = r2.A01
            r1.addAll(r0)
        L_0x0165:
            java.lang.String r0 = r7.A00
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x017c
            X.Twd r0 = r5.A0o
            X.TqY r0 = r0.A01
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x017c
        L_0x0175:
            X.Trv r4 = r5.A0D
            if (r4 != 0) goto L_0x01e7
            r14 = r15
            goto L_0x006e
        L_0x017c:
            X.8av r4 = r5.A0D()
            X.ULg r0 = r5.A01
            java.lang.String r2 = r0.A01
            X.X6r r0 = r5.A0i
            java.lang.String r1 = r0.E50(r7)
            X.Tx2 r0 = r5.A04
            if (r0 != 0) goto L_0x0192
            java.lang.String r14 = "loggingFilter"
            goto L_0x006e
        L_0x0192:
            X.TxB r0 = X.C67452Mo7.A00(r8)
            r4.CkP(r0, r2, r1)
            goto L_0x0175
        L_0x019a:
            X.C14138TqY.A09(r5)
            goto L_0x0141
        L_0x019e:
            if (r0 == 0) goto L_0x006e
            X.0qQ.A0B(r4, r3)
            java.util.List r0 = X.C14200Trf.A01(r0, r4)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x01c8
            X.C14138TqY.A09(r5)
        L_0x01b0:
            X.Trf r0 = r5.A07
            if (r0 == 0) goto L_0x006e
            java.util.List r0 = X.C14200Trf.A01(r0, r4)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x01d4
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A05 = r3
            goto L_0x013e
        L_0x01c8:
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A04 = r2
            r0.A00()
            goto L_0x01b0
        L_0x01d4:
            X.0eM r0 = X.0mp.A09
            int r1 = r4.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0141
            X.TxA r0 = r5.A0F()
            X.Trz r0 = r0.A01
            r0.A05 = r2
            goto L_0x013e
        L_0x01e7:
            java.lang.String r2 = r7.A01
            java.lang.String r1 = r6.A03
            int r7 = r13.size()
            X.Trf r0 = r5.A07
            if (r0 == 0) goto L_0x006e
            X.Trd r0 = r0.A01
            java.util.List r0 = r0.A00
            int r8 = r0.size()
            r5 = r2
            r6 = r1
            r9 = r3
            r4.A04(r5, r6, r7, r8, r9)
            return
        L_0x0202:
            java.lang.String r14 = "searchHeaderResultEntries"
            goto L_0x006e
        L_0x0206:
            X.Trv r2 = r5.A0D
            if (r2 == 0) goto L_0x0243
            java.lang.String r0 = r6.A03
            int r8 = r13.size()
            X.0qQ.A0B(r4, r3)
            r5 = r2
            r6 = r4
            r7 = r0
            r9 = r3
            r10 = r3
            X.C14216Trv.A00(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = "SEARCH_QUERY_RESULTS_NOT_DISPLAYED"
            r0 = 467(0x1d3, float:6.54E-43)
            X.C14216Trv.A02(r2, r4, r1, r0)
            return
        L_0x0223:
            java.lang.String r14 = "seeMoreController"
            goto L_0x006e
        L_0x0227:
            java.lang.String r14 = "informModuleController"
            goto L_0x006e
        L_0x022b:
            if (r0 == 0) goto L_0x0243
            X.0qQ.A0B(r4, r3)
            java.lang.String r8 = "SEARCH_QUERY_REQUEST_COMPLETE"
            java.lang.String r1 = "query_success"
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            X.TwP r0 = (X.C14441TwP) r0
            if (r0 == 0) goto L_0x0049
            r0.A01(r8, r1)
            goto L_0x0049
        L_0x0243:
            X.0qQ.A0F(r15)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14455Twd.Der(X.ULg, X.Mo6):void");
    }

    public final 1OC AMw(C15050ULg uLg, String str) {
        0qQ.A0B(uLg, 0);
        C14138TqY tqY = this.A01;
        C337287g2 r0 = tqY.A0B;
        if (r0 == null) {
            0qQ.A0F("cache");
            throw AnonymousClass00P.createAndThrow();
        }
        return C14501TxN.A00((UserSession) tqY.A0t.getValue(), uLg.A01, "typeahead_search_page", str, r0.BiW(uLg).A04, uLg.A00, 30);
    }

    public final 1OC AMx(String str, String str2) {
        String str3 = str;
        0qQ.A0B(str, 0);
        C14138TqY tqY = this.A01;
        C337287g2 r0 = tqY.A0B;
        if (r0 == null) {
            0qQ.A0F("cache");
            throw AnonymousClass00P.createAndThrow();
        }
        return C14501TxN.A00((UserSession) tqY.A0t.getValue(), str3, "typeahead_search_page", str2, r0.BiX(str).A04, "fbsearch/ig_typeahead/", 30);
    }

    public final 1GP AMy(C15050ULg uLg, String str) {
        0qQ.A0B(uLg, 0);
        C14138TqY tqY = this.A01;
        C337287g2 r0 = tqY.A0B;
        if (r0 == null) {
            0qQ.A0F("cache");
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = r0.BiW(uLg).A04;
        UserSession userSession = (UserSession) tqY.A0t.getValue();
        String str3 = uLg.A01;
        0qQ.A0B(userSession, 0);
        Location performIntegrityChecks = 1Wr.performIntegrityChecks((Location) null);
        1FZ r2 = new 1FZ(userSession, 768890804, 1, false);
        r2.A05();
        r2.A0A("fbsearch/typeahead_stream/");
        r2.A00 = new 1Fj(new 0bH(userSession), new 1NX((File) null), C67448Mo3.class, true, false);
        r2.A06 = 1CE.A04;
        r2.A0V = true;
        r2.A9m("query", str3);
        r2.A9m("count", String.valueOf(30));
        r2.A9m("context", "blended");
        String str4 = null;
        r2.A9m("lat", C13989Tnp.A0n(performIntegrityChecks));
        if (performIntegrityChecks != null) {
            str4 = Double.valueOf(performIntegrityChecks.getLongitude()).toString();
        }
        C13989Tnp.A1N(r2, "lng", str4);
        r2.A9m("search_surface", "typeahead_search_page");
        r2.A0G("rank_token", str2);
        r2.A0G("page_token", str);
        return r2.A0M();
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C14216Trv trv = this.A01.A0D;
        if (trv == null) {
            0qQ.A0F("searchQueryPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C14216Trv.A00(trv, str2, (String) null, 0, 0, false);
        C14216Trv.A02(trv, str, "SEARCH_QUERY_REQUEST_DROPPED", 2);
    }

    public final void DeJ(C15050ULg uLg, C268654dm r11) {
        0qQ.A0B(uLg, 0);
        C14138TqY tqY = this.A01;
        String str = uLg.A01;
        C14138TqY.A0A(tqY, str);
        C61042Jvg jvg = (C61042Jvg) tqY.A0G.get(uLg.A00);
        if (jvg != null) {
            jvg.A00 = true;
            jvg.A01 = false;
        }
        tqY.A0H = true;
        C14138TqY.A09(tqY);
        tqY.A0I(str, false);
        C14216Trv trv = tqY.A0D;
        String str2 = "searchQueryPerfLogger";
        if (trv != null) {
            trv.A03(str);
            C14216Trv trv2 = tqY.A0D;
            if (trv2 != null) {
                C14200Trf trf = tqY.A07;
                if (trf == null) {
                    str2 = "dataSource";
                } else {
                    trv2.A04(str, (String) null, 0, trf.A01.A00.size(), false);
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DeM(C268654dm r10, String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        C14138TqY tqY = this.A01;
        C14138TqY.A0A(tqY, str);
        tqY.A0H = true;
        C14138TqY.A09(tqY);
        tqY.A0I(str, false);
        C14216Trv trv = tqY.A0D;
        String str3 = "searchQueryPerfLogger";
        if (trv != null) {
            trv.A03(str);
            C14216Trv trv2 = tqY.A0D;
            if (trv2 != null) {
                C14200Trf trf = tqY.A07;
                if (trf == null) {
                    str3 = "dataSource";
                } else {
                    trv2.A04(str2, (String) null, 0, trf.A01.A00.size(), false);
                    return;
                }
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
        0qQ.A0B(str, 0);
        C14216Trv trv = this.A01.A0D;
        if (trv == null) {
            0qQ.A0F("searchQueryPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        C14441TwP twP = (C14441TwP) trv.A00.get(str);
        if (twP != null) {
            twP.A01("SEARCH_QUERY_REQUEST_START", (String) null);
        }
    }

    public C14455Twd(C14138TqY tqY) {
        this.A01 = tqY;
    }

    public final AnonymousClass4D6 Bpf() {
        return this.A01;
    }

    public final boolean Cch() {
        return this.A01.A0R;
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r2, String str) {
        C67451Mo6 mo6 = (C67451Mo6) r2;
        AnonymousClass7TG.A1N(str, mo6);
        Der(new C15050ULg(str), mo6);
    }

    public final void Dnw(boolean z) {
        String str;
        if (this.A00 != z) {
            this.A00 = z;
            if (z) {
                C14138TqY tqY = this.A01;
                C358448av A0D = tqY.A0D();
                String str2 = tqY.A01.A01;
                String E50 = tqY.A0i.E50(new C15050ULg(str2, "fbsearch/ig_typeahead/", 8));
                C14200Trf trf = tqY.A07;
                if (trf == null) {
                    str = "dataSource";
                } else {
                    C14198Trd trd = trf.A01;
                    if (tqY.A04 == null) {
                        str = "loggingFilter";
                    } else {
                        A0D.CkP(C67452Mo7.A00(trd), str2, E50);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
