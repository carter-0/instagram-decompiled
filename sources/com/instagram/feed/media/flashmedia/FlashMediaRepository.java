package com.instagram.feed.media.flashmedia;

import X.00k;
import X.05G;
import X.0Tu;
import X.0eP;
import X.0qQ;
import X.0sn;
import X.106;
import X.14i;
import X.15Y;
import X.182;
import X.18g;
import X.19B;
import X.19E;
import X.1Au;
import X.1Eo;
import X.1UV;
import X.1Xj;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0lh;
import X.AnonymousClass0vF;
import X.AnonymousClass12U;
import X.AnonymousClass12V;
import X.AnonymousClass19S;
import X.AnonymousClass1HX;
import X.AnonymousClass4D7;
import X.AnonymousClass93C;
import X.AnonymousClass93F;
import X.AnonymousClass93K;
import X.AnonymousClass93L;
import X.AnonymousClass9FV;
import X.AnonymousClass9FX;
import X.C262224Cq;
import X.C376909Ju;
import X.C55926Hpo;
import X.C61110lV;
import X.C61170le;
import X.C61610nw;
import X.C61620nx;
import X.C638918c;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class FlashMediaRepository implements C61110lV, AnonymousClass93F, AnonymousClass0lh {
    public 1Xj A00;
    public C55926Hpo A01;
    public Integer A02;
    public List A03 = new ArrayList();
    public Set A04 = new LinkedHashSet();
    public boolean A05;
    public boolean A06;
    public final AnonymousClass12V A07;
    public final 14i A08;
    public final UserSession A09;
    public final AnonymousClass0vF A0A;
    public final FlashMediaLocalDataSource A0B;
    public final AnonymousClass93L A0C;
    public final Set A0D = new LinkedHashSet();
    public final C262224Cq A0E;
    public final 05G A0F = 106.A01(0sn.A00);

    public /* synthetic */ FlashMediaRepository(UserSession userSession) {
        FlashMediaLocalDataSource flashMediaLocalDataSource = new FlashMediaLocalDataSource(userSession);
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "FlashMediaRepository";
        AnonymousClass0vF r4 = new AnonymousClass0vF(A002);
        AnonymousClass12U r3 = new AnonymousClass12U(r4);
        14i r2 = 14i.A08;
        AnonymousClass19S A022 = 19E.A02(r3.AOJ(749047880, 3));
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 5);
        0qQ.A0B(A022, 6);
        this.A09 = userSession;
        this.A0B = flashMediaLocalDataSource;
        this.A0A = r4;
        this.A07 = r3;
        this.A08 = r2;
        this.A0E = A022;
        this.A0C = AnonymousClass93K.A00(userSession);
        18g A012 = C638918c.A01(C61170le.A00);
        A012.A0O(A012.A02, "REELS_FLASH_CACHE_LOAD_START");
        14i.A04(15Y.A02, this, false, false);
        this.A05 = 1Au.A00(userSession).A01.getLong("latest_reels_flash_cache_stored_time", 0) > System.currentTimeMillis() - 43200000;
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376909Ju(this, (AnonymousClass4D7) null, 16), A022);
    }

    public final void EE4(1Xj r7, AnonymousClass93C r8) {
        Object value;
        ArrayList arrayList;
        0qQ.A0B(r7, 1);
        Set set = this.A04;
        if (set == null) {
            05G r5 = this.A0F;
            do {
                value = r5.getValue();
                arrayList = new ArrayList();
                for (Object next : (List) value) {
                    if (!0qQ.A0K(next, r7)) {
                        arrayList.add(next);
                    }
                }
            } while (!r5.AIY(value, arrayList));
            return;
        }
        set.add(r7);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.9Ja, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.feed.media.flashmedia.FlashMediaRepository r9, java.util.List r10, X.AnonymousClass4D7 r11) {
        /*
            r3 = 28
            boolean r0 = X.C376709Ja.A00(r3, r11)
            if (r0 == 0) goto L_0x00d0
            r5 = r11
            X.9Ja r5 = (X.C376709Ja) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d0
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r8 = 1
            if (r0 == 0) goto L_0x0065
            if (r0 != r8) goto L_0x00d7
            java.lang.Object r10 = r5.A02
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaRepository r9 = (com.instagram.feed.media.flashmedia.FlashMediaRepository) r9
            X.0eS.A00(r1)
        L_0x002c:
            X.05G r1 = r9.A0F
        L_0x002e:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r10)
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r9.A02 = r0
            X.0wX r0 = X.C61170le.A00
            X.18g r4 = X.C638918c.A01(r0)
            int r2 = r10.size()
            java.lang.String r1 = "REELS_FLASH_CACHE_LOAD_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            r4.A0O(r0, r1)
            long r2 = (long) r2
            java.lang.String r1 = "reels_flash_cache_item_count"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            X.18g.A04(r0, r1, r2)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0065:
            X.0eS.A00(r1)
            java.util.Set r7 = r9.A04
            r6 = 0
            if (r7 == 0) goto L_0x008a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r10.iterator()
        L_0x0076:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008b
            java.lang.Object r1 = r2.next()
            boolean r0 = r7.contains(r1)
            if (r0 != 0) goto L_0x0076
            r3.add(r1)
            goto L_0x0076
        L_0x008a:
            r3 = r6
        L_0x008b:
            r9.A04 = r6
            if (r3 == 0) goto L_0x0090
            r10 = r3
        L_0x0090:
            r5.A01 = r9
            r5.A02 = r10
            r5.A00 = r8
            java.util.Set r2 = r9.A0D
            java.util.Iterator r1 = r2.iterator()
        L_0x009c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r1.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A00
            X.9FX r0 = (X.AnonymousClass9FX) r0
            r0.DOO()
            goto L_0x009c
        L_0x00b0:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2.clear()
            X.12V r0 = r9.A07
            X.12U r0 = (X.AnonymousClass12U) r0
            X.4CZ r2 = r0.A04
            r1 = 47
            X.9Jz r0 = new X.9Jz
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r3, (X.AnonymousClass4D7) r6, (int) r1)
            java.lang.Object r0 = X.1Eo.A00(r5, r2, r0)
            if (r0 == r4) goto L_0x00cd
            X.0gF r0 = X.C60340gF.A00
        L_0x00cd:
            if (r0 != r4) goto L_0x002c
            return r4
        L_0x00d0:
            X.9Ja r5 = new X.9Ja
            r5.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x00d7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaRepository.A00(com.instagram.feed.media.flashmedia.FlashMediaRepository, java.util.List, X.4D7):java.lang.Object");
    }

    public final 1Xj E2E(AnonymousClass93C r3) {
        return (1Xj) 00k.A0O((List) this.A0F.getValue(), 0);
    }

    public final void EBM(AnonymousClass93C r2, List list) {
        List list2 = this.A03;
        list2.clear();
        list2.addAll(list);
    }

    public final void EDG(AnonymousClass93C r4) {
        Set set = this.A04;
        if (set == null) {
            05G r2 = this.A0F;
            do {
            } while (!r2.AIY(r2.getValue(), 0sn.A00));
            return;
        }
        set.addAll((Collection) this.A0F.getValue());
    }

    public final void A9J(AnonymousClass93C r9, List list, boolean z) {
        Object value;
        ArrayList arrayList;
        ArrayList A0U = 00k.A0U(list);
        05G r3 = this.A0F;
        A0U.addAll((Collection) r3.getValue());
        do {
        } while (!r3.AIY(r3.getValue(), 00k.A0a(00k.A0j(A0U))));
        if (!z) {
            List A0a = 00k.A0a(this.A03);
            do {
                value = r3.getValue();
                arrayList = new ArrayList();
                for (Object next : (List) value) {
                    if (!A0a.isEmpty() && (!(A0a instanceof Collection) || !A0a.isEmpty())) {
                        Iterator it = A0a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            1UV r0 = (1UV) it.next();
                            if (r0 != null) {
                                if (!r0.apply(next)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(next);
                }
            } while (!r3.AIY(value, arrayList));
            Integer num = this.A02;
            if (num != null && ((List) r3.getValue()).size() > num.intValue() + 1) {
                this.A02 = Integer.valueOf(((List) r3.getValue()).size());
                AnonymousClass19S A022 = AnonymousClass1HX.A02(749047880, 3);
                C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 17);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
            }
        }
    }

    public final void B5y(AnonymousClass9FX r3, AnonymousClass9FV r4, AnonymousClass93C r5) {
        r3.DHz();
        if (this.A04 == null) {
            r3.DHy();
            r4.Dfb((Collection) this.A0F.getValue());
            return;
        }
        r3.DOP();
        this.A0D.add(new 0eP(r3, r4));
    }

    public final void onAppBackgrounded() {
        C262224Cq A022;
        int A032 = AnonymousClass0fD.A03(-1464402639);
        if (!182.A06(0Tu.A06, this.A09, 36331089702962066L)) {
            A022 = this.A0E;
        } else {
            A022 = AnonymousClass1HX.A02(749047880, 3);
        }
        C376909Ju r3 = new C376909Ju(this, (AnonymousClass4D7) null, 18);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r3, A022);
        AnonymousClass0fD.A0A(953219976, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-1517158178, AnonymousClass0fD.A03(-1203728563));
    }

    public final void onSessionWillEnd() {
        14i.A07(this);
    }
}
