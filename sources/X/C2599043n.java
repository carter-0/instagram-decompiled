package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.43n  reason: invalid class name and case insensitive filesystem */
public final class C2599043n implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2599043n(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r16, AnonymousClass653 r17, List list, Map map, 0sL r20, 0sL r21, boolean z) {
        AnonymousClass1qK r8;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        AnonymousClass651 r6 = r16;
        0qQ.A0B(r6, 1);
        AnonymousClass653 r5 = r17;
        0qQ.A0B(r5, 2);
        0sL r7 = r20;
        0qQ.A0B(r7, 5);
        String str = (String) map2.get(RealtimeProtocol.THREAD_ID);
        String str2 = (String) map2.get(RealtimeProtocol.ITEM_ID);
        if (str == null || str2 == null || !"add".equals(r5.A00)) {
            return AnonymousClass6BO.A00;
        }
        2Eq r1 = (2Eq) r7.invoke(str, r6);
        if (r1 == null) {
            return C21215XPd.A00;
        }
        try {
            C70148Ny2.A00(this.A00, r6, str, (String) null);
            2Dr r4 = this.A01;
            DirectThreadKey BJy = r1.BJy();
            C45210CsN parseFromJson = C44656Cia.parseFromJson(16P.A00(r5.A02));
            0qQ.A07(parseFromJson);
            ArrayList arrayList = new ArrayList();
            for (C45277Ctg ctg : parseFromJson.A00) {
                String str3 = ctg.A01;
                if (str3 != null) {
                    arrayList.add(new DirectCountBasedReaction(str3, ctg.A00, false));
                } else {
                    0qQ.A0F("emoji");
                    th = AnonymousClass00P.createAndThrow();
                    throw th;
                }
            }
            2Dr r42 = r4;
            AnonymousClass48S A0P = r42.A0P(BJy);
            if (A0P == null) {
                0wb.A03("Null thread entry", "Entry should exist before function call");
            } else {
                synchronized (A0P) {
                    try {
                        C254703su A0J = A0P.A0J(str2);
                        if (A0J == null) {
                            0wj.A01.AEf("Message is missing from thread entry", 20134884).report();
                            r8 = null;
                        } else {
                            UserSession userSession = A0P.A0H;
                            synchronized (A0J) {
                                HashMap hashMap = new HashMap();
                                List<DirectCountBasedReaction> list2 = A0J.A22;
                                if (list2 != null) {
                                    for (DirectCountBasedReaction directCountBasedReaction : list2) {
                                        hashMap.put(directCountBasedReaction.A01, directCountBasedReaction);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    boolean z2 = true;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    DirectCountBasedReaction directCountBasedReaction2 = (DirectCountBasedReaction) it.next();
                                    String str4 = directCountBasedReaction2.A01;
                                    DirectCountBasedReaction directCountBasedReaction3 = (DirectCountBasedReaction) hashMap.get(str4);
                                    int i = directCountBasedReaction2.A00;
                                    if (i > 0) {
                                        if (directCountBasedReaction3 == null || !directCountBasedReaction3.A02) {
                                            z2 = false;
                                        }
                                        hashMap.put(str4, new DirectCountBasedReaction(str4, i, z2));
                                    } else {
                                        hashMap.remove(str4);
                                    }
                                }
                                C254703su.A04(userSession, A0J, ImmutableList.copyOf(hashMap.values()));
                                A0J.A2C = true;
                                C254703su.A06(A0J);
                            }
                            r8 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A1I, (List) null, (List) null, Collections.singletonList(A0J), true);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                if (r8 != null) {
                    r42.A06.A00(r8);
                    r42.A09.accept(r8);
                }
            }
            return AnonymousClass6BL.A00;
        } catch (IOException | IndexOutOfBoundsException e) {
            0wb.A01.Ew2("invalid_direct_count_based_reaction_format", "Invalid DirectCountBasedReaction format", e);
            return new AnonymousClass6BQ(e, "invalid_direct_count_based_reaction_format", "Invalid DirectCountBasedReaction format");
        }
    }
}
