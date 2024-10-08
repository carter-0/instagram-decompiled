package X;

import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2v8  reason: invalid class name */
public final class AnonymousClass2v8 extends AnonymousClass1GX implements C233012uo {
    public int A00;
    public C233042ur A01;
    public C233072uu A02;
    public final UserSession A03;
    public final AnonymousClass2rI A04;
    public final C233002un A05;
    public final AnonymousClass2v7 A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C233092uw A0B;
    public final C233132v0 A0C;
    public final C228472lj A0D;
    public final Set A0E = 0sc.A06(new C233162v9[]{C233162v9.CTA_CLICK, C233162v9.PROFILE_TAP});

    public final boolean A7L(C233632w4 r5, C233042ur r6, C233072uu r7) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r6, 1);
        0qQ.A0B(r5, 2);
        this.A02 = r7;
        this.A01 = r6;
        C233002un r2 = this.A05;
        if (r2 != null) {
            r2.A0A = new C233842wZ(this.A03, r7);
            r2.A09 = new C233852wa(r6);
        }
        C233092uw r1 = this.A0B;
        if (r1 != null) {
            r1.A06 = new C233862wb(r7);
        }
        C233132v0 r0 = this.A0C;
        if (r0 != null) {
            r0.A7L(r5, r6, r7);
        }
        Py1.A00(this.A03).Eir(r7);
        return true;
    }

    public final String B4s() {
        return "FEED_EAGER_REFRESH";
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final void CJE(C376459Ib r18, List list) {
        AnonymousClass2rI r5;
        1Xj r7;
        boolean z;
        1UQ r1;
        Boolean bool;
        String str;
        String str2;
        1Xj A022;
        C376459Ib r4 = r18;
        0qQ.A0B(r4, 0);
        List list2 = list;
        0qQ.A0B(list2, 1);
        AnonymousClass9IV r12 = (AnonymousClass9IV) 00k.A0N(list2);
        if (r12 != null) {
            if (Bsw().contains(r4)) {
                C228472lj r6 = this.A0D;
                AnonymousClass9JO r0 = (AnonymousClass9JO) ((AnonymousClass9J4) r12.A01).A02;
                String str3 = r0.A01;
                String str4 = r0.A04;
                String str5 = ((C233162v9) r4.A01).A01;
                0qQ.A0B(str3, 0);
                0qQ.A0B(str4, 1);
                0qQ.A0B(str5, 2);
                C233312vV r02 = r6.A04;
                if ((r02 == null || r02.A06 != AnonymousClass05K.A01) && (r5 = r6.A06) != null) {
                    int BJU = r5.BJU(str3);
                    if (BJU == -1) {
                        BJU = r5.BJU(str4);
                    }
                    C228512ln r03 = r6.A0W;
                    02m r2 = r03.A00;
                    UserSession userSession = r03.A01;
                    0Tu r13 = 0Tu.A06;
                    r2.A0h(976041859, (long) ((int) 182.A01(r13, userSession, 36604756428657765L)));
                    r2.markerAnnotate(976041859, "asl_session_id", 0LA.A01());
                    r2.markerAnnotate(976041859, "refresh_type", "rti");
                    r2.markerAnnotate(976041859, "trigger_type", str5);
                    r2.markerAnnotate(976041859, "rti_seed_media_id", str4);
                    r2.markerAnnotate(976041859, "rti_seed_media_position", BJU);
                    r2.markerPoint(976041859, "start");
                    1Xg A042 = r5.A04(BJU);
                    if (A042 != null) {
                        r7 = 1Xi.A02(A042.A05);
                    } else {
                        r7 = null;
                    }
                    C233812wV r04 = r6.A0C;
                    if (r04 != null) {
                        int i = r04.A00;
                        int i2 = BJU + 1;
                        1Xg A043 = r5.A04(i2);
                        if (A043 == null || (A022 = 1Xi.A02(A043.A05)) == null) {
                            z = false;
                        } else {
                            z = A022.CcK();
                        }
                        1Xg A044 = r5.A04(i2);
                        if (A044 != null) {
                            r1 = A044.A06;
                        } else {
                            r1 = null;
                        }
                        boolean z2 = false;
                        if (r1 == 1UQ.A06) {
                            z2 = true;
                        }
                        if (r7 != null) {
                            bool = Boolean.valueOf(r6.A0Y.BQr(r7).A2M);
                        } else {
                            bool = null;
                        }
                        boolean A045 = 1Xi.A04(r5.A07());
                        C233312vV r10 = r6.A04;
                        if (r10 != null) {
                            UserSession userSession2 = r6.A0Q;
                            if (r7 == null) {
                                str2 = "NULL_SEED_AD";
                            } else if (C231122qu.A0O(userSession2, r7) && 182.A06(r13, userSession2, 36323281451691053L)) {
                                str2 = "MULTI_ADS_ELIGIBLE_SEED_AD";
                            } else if (z) {
                                str2 = "FIRST_AD_IN_BACK_TO_BACK_ADS";
                            } else if (z2) {
                                str2 = "NEXT_ITEM_AFI";
                            } else {
                                0Tu r11 = 0Tu.A05;
                                if (i < ((int) 182.A01(r11, userSession2, 36604756428788838L)) + BJU) {
                                    str2 = "MIN_SEEN_INDEX_THRESHOLD";
                                } else if (i > BJU + ((int) 182.A01(r11, userSession2, 36604756428461155L))) {
                                    str2 = "MAX_SEEN_INDEX_THRESHOLD";
                                } else if (0qQ.A0K(bool, true)) {
                                    str2 = "SEED_AD_ALREADY_TRIGGERED_FEED_EAGER_REFRESH";
                                } else if (r10.A02 >= ((int) 182.A01(r13, userSession2, 36604756428592228L))) {
                                    str2 = "RATE_LIMIT";
                                } else if (AnonymousClass3VO.A08(r7)) {
                                    str2 = "SEED_AD_IN_FEED_RECS";
                                } else if (A045) {
                                    str2 = "EOF_DEMARCATOR_IN_FEED";
                                }
                            }
                            r2.withMarker(976041859).pointEditor("skip").addPointData("invalidation_reason", str2).markerEditingCompleted();
                            r2.markerEnd(976041859, 3376);
                            return;
                        }
                        C233312vV r14 = r6.A04;
                        if (r14 != null) {
                            r14.A06 = AnonymousClass05K.A01;
                        }
                        int max = Math.max(i, BJU);
                        if (r14 != null) {
                            r14.A00 = max;
                        }
                        if (!(r7 == null || r14 == null)) {
                            r14.A03 = r6.A0Y.BQr(r7);
                        }
                        C233312vV r15 = r6.A04;
                        if (r15 != null) {
                            r15.A07 = r5.A07();
                        }
                        C233312vV r3 = r6.A04;
                        if (r3 != null) {
                            r3.A01 = BJU;
                            r3.A08 = r5.BQW().subList(max + 1, r5.BQW().size());
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C233312vV r05 = r6.A04;
                        if (r05 == null || (str = r05.A01()) == null) {
                            str = "";
                        }
                        linkedHashMap.put("unseen_media_ids", str);
                        linkedHashMap.put("is_feed_eager_refresh", "true");
                        r6.A0X.A00 = r6.A04;
                        r6.A0A(1FI.A0G, (String) null, linkedHashMap);
                    }
                }
            }
        }
    }

    public final boolean CTb() {
        return false;
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
    }

    public final void Cn9(int i) {
    }

    public final boolean D69(int i, int i2) {
        return true;
    }

    public final void DsJ(int i) {
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final AnonymousClass4lJ AN3() {
        return new C272744lK(this);
    }

    public final Set Bsw() {
        Boolean bool;
        UserSession userSession = this.A03;
        0qQ.A0B(userSession, 0);
        if (!182.A06(0Tu.A06, userSession, 36323281451625516L)) {
            return 0sl.A00;
        }
        Set<C233162v9> set = this.A0E;
        ArrayList arrayList = new ArrayList(0Yv.A1E(set, 10));
        for (C233162v9 r0 : set) {
            arrayList.add(r0.A01);
        }
        ArrayList A0U = 00k.A0U(arrayList);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(A0U, 10));
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C233162v9[] values = C233162v9.values();
            int i = 0;
            int length = values.length;
            while (true) {
                bool = null;
                if (i >= length) {
                    break;
                }
                C233162v9 r3 = values[i];
                if (0qQ.A0K(r3.A01, 00l.A0B(str).toString())) {
                    bool = Boolean.valueOf(linkedHashSet.add(new C376459Ib(C230472pg.SPONSORED, r3, C230432pc.FEED)));
                    break;
                }
                i++;
            }
            arrayList2.add(bool);
        }
        ImmutableSet A032 = ImmutableSet.A03(linkedHashSet);
        0qQ.A0A(A032);
        return A032;
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(110));
    }

    public final void deactivate() {
        C233132v0 r0 = this.A0C;
        if (r0 != null) {
            r0.deactivate();
        }
        UserSession userSession = this.A03;
        if (182.A06(0Tu.A05, userSession, 36327907131407139L)) {
            Py1.A00(userSession).EEY();
        }
    }

    public AnonymousClass2v8(UserSession userSession, AnonymousClass2rI r5, C233092uw r6, C233132v0 r7, C233002un r8, AnonymousClass2v7 r9, C228472lj r10) {
        this.A05 = r8;
        this.A0B = r6;
        this.A0C = r7;
        this.A06 = r9;
        this.A03 = userSession;
        this.A04 = r5;
        this.A0D = r10;
        0Tu r2 = 0Tu.A05;
        this.A08 = 182.A06(r2, userSession, 36314558373038764L);
        this.A07 = 182.A06(r2, userSession, 36313957077944653L);
        this.A09 = 182.A06(r2, userSession, 36314558373104301L);
        this.A0A = 182.A06(r2, userSession, 36320601392030361L);
    }

    public final void onScroll(C238133Ar r9, int i, int i2, int i3, int i4, int i5) {
        int i6;
        AnonymousClass1Xn r0;
        1Xj A022;
        int A032 = AnonymousClass0fD.A03(-1901483539);
        0qQ.A0B(r9, 0);
        if (!this.A07) {
            i6 = -613352810;
        } else {
            C231272rL AZK = r9.AZK();
            0qQ.A0C(AZK, "null cannot be cast to non-null type com.instagram.mainfeed.adapter.MainFeedAdapter");
            AnonymousClass2rI r6 = (AnonymousClass2rI) AZK;
            Object item = r6.getItem(r9.BLQ());
            if (item != null) {
                int B5I = r6.B5I();
                for (int i7 = 0; i7 < B5I; i7++) {
                    1Xg A033 = r6.A03(i7);
                    if (A033 != null && (((r0 = A033.A05) != null && r0.equals(item)) || ((A022 = 1Xi.A02(A033.A05)) != null && A022.equals(item)))) {
                        this.A00 = Math.max(this.A00, i7);
                    }
                }
            }
            i6 = -1726528586;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }
}
