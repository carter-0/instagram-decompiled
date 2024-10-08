package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

/* renamed from: X.44d  reason: invalid class name and case insensitive filesystem */
public final class C2600644d {
    public int A00;
    public long A01;
    public C2600844f A02;
    public Runnable A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final Handler A08;
    public final UserSession A09;
    public final C2600544c A0A;
    public final C2600744e A0B;
    public final LinkedList A0C;
    public final Map A0D = new LinkedHashMap();
    public final PriorityQueue A0E;

    public /* synthetic */ C2600644d(Handler handler, UserSession userSession, C2600544c r11) {
        C2600744e r5 = (C2600744e) userSession.A01(C2600744e.class, new C73913Plo(userSession, 6));
        0Tu r4 = 0Tu.A05;
        int A012 = (int) 182.A01(r4, userSession, 36597343318313760L);
        int A013 = (int) 182.A01(r4, userSession, 36597343318641442L);
        0qQ.A0B(handler, 2);
        0qQ.A0B(r5, 4);
        this.A09 = userSession;
        this.A08 = handler;
        this.A0A = r11;
        this.A0B = r5;
        this.A04 = A012;
        this.A07 = ((long) 182.A00(r4, userSession, 37160293271666797L)) * 1000;
        this.A05 = A013;
        this.A06 = (int) 182.A01(r4, userSession, 36597343318838051L);
        C2600844f r6 = C2600844f.ORDERED;
        this.A02 = r6;
        this.A01 = -1;
        this.A0E = new PriorityQueue(5, new C262064Bz());
        this.A0C = new LinkedList();
        C2600944g r52 = C2600944g.VALID_MESSAGE;
        A01(r52, r6, r6);
        C2600944g r42 = C2600944g.HOLE_DETECTED;
        C2600844f r3 = C2600844f.UNORDERED;
        A01(r42, r6, r3);
        C2600944g r2 = C2600944g.GAP_TOLERANCE_EXCEEDED;
        C2600844f r1 = C2600844f.REQUESTING_SNAPSHOT;
        A01(r2, r6, r1);
        A01(r52, r3, r6);
        A01(r42, r3, r3);
        A01(r2, r3, r1);
        A01(C2600944g.TIMEOUT, r3, r1);
        A01(C2600944g.SNAPSHOT_SUCCESS, r1, r6);
        A01(r52, r1, r1);
        A01(r42, r1, r1);
        A01(r2, r1, r1);
    }

    public static final void A00(C2600944g r9, C2600644d r10, AnonymousClass651 r11) {
        Object obj = r10.A0D.get(r10.A02);
        if (obj != null) {
            Object obj2 = ((Map) obj).get(r9);
            if (obj2 != null) {
                C2600844f r0 = (C2600844f) obj2;
                r10.A02 = r0;
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    Runnable runnable = r10.A03;
                    if (runnable != null) {
                        r10.A08.removeCallbacks(runnable);
                    }
                    r10.A03 = null;
                    if (r11 != null) {
                        r10.A0A.A00.A01(r11);
                    }
                    long j = r10.A01;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = r10.A0E.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        AnonymousClass651 r8 = (AnonymousClass651) it.next();
                        Long l = r8.A02;
                        if (l != null) {
                            long longValue = l.longValue();
                            if (longValue > r10.A01) {
                                j++;
                                if (longValue == j) {
                                    arrayList.add(r8);
                                }
                            }
                            it.remove();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        r10.A0A.A00.A02(arrayList);
                    }
                } else if (ordinal == 1) {
                    if (r11 != null) {
                        r10.A0E.add(r11);
                    }
                    long j2 = r10.A07;
                    Runnable runnable2 = r10.A03;
                    if (runnable2 == null || !C69682Nq4.A00(r10.A08, runnable2)) {
                        PWF pwf = new PWF(r10);
                        r10.A03 = pwf;
                        r10.A08.postDelayed(pwf, j2);
                    }
                } else if (ordinal == 2) {
                    if (r9 == C2600944g.VALID_MESSAGE) {
                        C2600544c r02 = r10.A0A;
                        if (r11 != null) {
                            r02.A00.A01(r11);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (r11 != null) {
                        r10.A0E.add(r11);
                    }
                    int i = r10.A00;
                    if (i < r10.A06) {
                        r10.A00 = i + 1;
                        C2598143e r03 = r10.A0A.A00;
                        String str = r03.A01;
                        if (str != null) {
                            r03.A00.A05(ThreadFetchReason.BROADCAST_CHANNEL_SNAPSHOT_REQUEST, (Long) null, str, (String) null, false);
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[OctaneStateMachine] No transition available from ");
                sb.append(r10.A02);
                sb.append(" on event ");
                sb.append(r9);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[OctaneStateMachine] No transitions available from ");
            sb2.append(r10.A02);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private final void A01(C2600944g r3, C2600844f r4, C2600844f r5) {
        Map map = this.A0D;
        Map map2 = (Map) map.get(r4);
        if (map2 == null) {
            map2 = new LinkedHashMap();
            map.put(r4, map2);
        }
        map2.put(r3, r5);
    }
}
