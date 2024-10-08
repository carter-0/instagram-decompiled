package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2ll  reason: invalid class name and case insensitive filesystem */
public final class C228492ll implements AnonymousClass0lh {
    public static final C228482lk A09 = new Object();
    public static final HashMap A0A = new HashMap();
    public static final Map A0B = new LinkedHashMap();
    public static final Map A0C = new LinkedHashMap();
    public Long A00;
    public Long A01;
    public Long A02;
    public String A03;
    public final 1QP A04;
    public final UserSession A05;
    public final ArrayList A06 = new ArrayList();
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public C228492ll(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A05 = userSession;
        this.A04 = AnonymousClass1QO.A00(userSession);
    }

    public static final synchronized void A01(1QP r7, 1FS r8, C228492ll r9, String str) {
        synchronized (r9) {
            long generateFlowId = r7.generateFlowId(974460658, r8.A01);
            if (!r7.isOngoingFlow(generateFlowId)) {
                r7.flowStart(generateFlowId, new UserFlowConfig(r8.A04.toString(), false));
                A0A.put(Long.valueOf(generateFlowId), (short) 113);
                r7.flowAnnotate(generateFlowId, "CALLING_SOURCE", str);
                r9.A07.postDelayed(new C241333Ou(r8, r9), 182.A01(0Tu.A05, r9.A05, 36594740564592456L) * 1000);
            }
        }
    }

    public static final synchronized void A03(C228492ll r7, String str) {
        synchronized (r7) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = A0A;
            for (Object next : hashMap.keySet()) {
                0qQ.A07(next);
                long longValue = ((Number) next).longValue();
                1QP r1 = r7.A04;
                if (r1.isOngoingFlow(longValue)) {
                    r1.flowMarkPoint(longValue, str);
                } else {
                    arrayList.add(Long.valueOf(longValue));
                }
            }
            if (!arrayList.isEmpty()) {
                hashMap.keySet().removeAll(arrayList);
            }
        }
    }

    public final void A04(C268654dm r13, AnonymousClass1GU r14, int i) {
        String str;
        StringBuilder sb;
        1FS r8 = r14.A00;
        1QP r7 = this.A04;
        long generateFlowId = r7.generateFlowId(974460658, r8.A01);
        1Zp A012 = 1Zm.A00(this.A05).A01(AnonymousClass05K.A01, AnonymousClass05K.A08, false);
        A012.A03("logview_group_by", "NETWORK_FAILURE_REASON");
        1XP r3 = (1XP) r13.A00();
        String A002 = AnonymousClass000.A00(944);
        String str2 = "UNKNOWN";
        if (r3 != null) {
            str2 = "challenge_required";
            if (!0qQ.A0K(r3.getErrorMessage(), str2)) {
                if (r3.hasErrorType(AnonymousClass000.A00(1358))) {
                    sb.append("feedback_required: ");
                    sb.append(r3.mFeedbackAction);
                } else {
                    sb = new StringBuilder();
                    sb.append("http_status_code: ");
                    sb.append(r3.mStatusCode);
                }
                str2 = sb.toString();
            }
            str = "NETWORK";
            r7.flowAnnotate(generateFlowId, A002, str);
            r7.flowAnnotate(generateFlowId, "FAILURE_NAME", r3.mErrorTitle);
            r7.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", str2);
            A012.A03("NETWORK_FAILURE_REASON", str2);
        } else {
            str = str2;
            Throwable A013 = r13.A01();
            if (A013 != null) {
                if (A013 instanceof RCQ) {
                    A06(r14, "Response returned after being cancelled");
                    return;
                }
                str = "CLIENT";
                r7.flowAnnotate(generateFlowId, A002, str);
                A012.A05(A013);
                String canonicalName = A013.getClass().getCanonicalName();
                if (canonicalName != null) {
                    r7.flowAnnotate(generateFlowId, "FAILURE_NAME", canonicalName);
                }
                String message = A013.getMessage();
                if (message != null) {
                    r7.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", message);
                    A012.A03("NETWORK_FAILURE_REASON", message);
                    str2 = message;
                }
            }
        }
        if (i != -1) {
            r7.flowAnnotate(generateFlowId, "RESPONSE_CODE", i);
            A012.A01("RESPONSE_CODE", i);
        }
        String str3 = r8.A09;
        r7.flowAnnotate(generateFlowId, "REQUEST_ID", str3);
        if (r8.A04 != 1FI.A04) {
            A012.A03("REQUEST_ID", str3);
            A012.A00();
        }
        if (r8.A00() && (!this.A06.isEmpty())) {
            A02(r8);
        }
        r7.flowEndFail(generateFlowId, str, str2);
        C228482lk.A01(A09, generateFlowId);
    }

    public final synchronized void A05(AnonymousClass1GU r9, Long l, String str, String str2, String str3, String str4) {
        0qQ.A0B(r9, 0);
        1FS r5 = r9.A00;
        1QP r4 = this.A04;
        long generateFlowId = r4.generateFlowId(974460658, r5.A01);
        if (!r4.isOngoingFlow(generateFlowId)) {
            A01(r4, r5, this, str2);
            this.A02 = Long.valueOf(generateFlowId);
        }
        if (str != null) {
            r4.flowAnnotate(generateFlowId, "SOURCE", str);
        }
        A00(r4, r9, this);
        r4.flowMarkPoint(generateFlowId, "FEED_RESPONSE_RECEIVED_CACHE");
        if (r5.A00()) {
            UserSession userSession = this.A05;
            if (182.A06(0Tu.A05, userSession, 36323839797440060L)) {
                this.A03 = 1Au.A00(userSession).A01.getString("last_feed_head_load_fetch_reason", (String) null);
                if (l != null) {
                    this.A00 = Long.valueOf(l.longValue());
                }
            }
        }
        if (r5.A04 == 1FI.A06 && this.A08.get()) {
            A0C(r5, "network feed already rendered");
        }
        if (str2.equals("feed_pool_delegate")) {
            if (str3 != null) {
                r4.flowAnnotate(generateFlowId, "TLI_ITEM_TYPE", str3);
            }
            if (str4 != null) {
                r4.flowAnnotate(generateFlowId, "TLI_ITEM_INVENTORY_SOURCE", str4);
            }
        }
    }

    public final void A07(AnonymousClass1GU r10, String str) {
        1FS r0 = r10.A00;
        1QP r6 = this.A04;
        long generateFlowId = r6.generateFlowId(974460658, r0.A01);
        UserSession userSession = this.A05;
        if (182.A06(0Tu.A05, userSession, 36313265588668260L)) {
            1Zp A012 = 1Zm.A00(userSession).A01(AnonymousClass05K.A01, AnonymousClass05K.A08, false);
            A012.A03("NETWORK_FAILURE_REASON", str);
            A012.A03("logview_group_by", "NETWORK_FAILURE_REASON");
            A012.A00();
        }
        r6.flowAnnotate(generateFlowId, AnonymousClass000.A00(944), "CLIENT");
        r6.flowAnnotate(generateFlowId, "FAILURE_NAME", "CacheFailure");
        r6.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", str);
        r6.flowEndFail(generateFlowId, "CLIENT", str);
        C228482lk.A01(A09, generateFlowId);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        r3.flowAnnotate(r0, "FEED_TYPE", r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A08(X.AnonymousClass1GU r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.1FS r4 = r7.A00     // Catch:{ all -> 0x0094 }
            X.1QP r3 = r6.A04     // Catch:{ all -> 0x0094 }
            int r1 = r4.A01     // Catch:{ all -> 0x0094 }
            r0 = 974460658(0x3a1516f2, float:5.687318E-4)
            long r0 = r3.generateFlowId(r0, r1)     // Catch:{ all -> 0x0094 }
            A01(r3, r4, r6, r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "FEED_REQUEST_SENT"
            r3.flowMarkPoint(r0, r2)     // Catch:{ all -> 0x0094 }
            java.util.Map r5 = r4.A0D     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "pagination_source"
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0029
            int r2 = r5.hashCode()     // Catch:{ all -> 0x0094 }
            switch(r2) {
                case -1785238953: goto L_0x0082;
                case -1643839516: goto L_0x0077;
                case -80681014: goto L_0x006c;
                case 765915793: goto L_0x0061;
                case 1493462374: goto L_0x0056;
                default: goto L_0x0029;
            }     // Catch:{ all -> 0x0094 }
        L_0x0029:
            java.lang.String r2 = "CALLING_SOURCE"
            r3.flowAnnotate(r0, r2, r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = "background_prefetcher"
            boolean r2 = r8.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x003b
            java.lang.String r2 = "IS_FROM_BACKGROUND_COLD_START"
            r3.flowAnnotate(r0, r2, r9)     // Catch:{ all -> 0x0094 }
        L_0x003b:
            boolean r2 = X.AnonymousClass1A9.A00()     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r5 = "SEEN_STATE_ITEM_COUNT_FOR_E2E"
            X.0to r2 = r4.A03     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0054
            java.util.Set r2 = r2.A01     // Catch:{ all -> 0x0094 }
            int r2 = r2.size()     // Catch:{ all -> 0x0094 }
        L_0x004d:
            r3.flowAnnotate(r0, r5, r2)     // Catch:{ all -> 0x0094 }
        L_0x0050:
            A00(r3, r7, r6)     // Catch:{ all -> 0x0094 }
            goto L_0x0092
        L_0x0054:
            r2 = 0
            goto L_0x004d
        L_0x0056:
            java.lang.String r2 = "past_posts"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r5 = "OLDER_FEED"
            goto L_0x008c
        L_0x0061:
            java.lang.String r2 = "following"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r5 = "FOLLOWING"
            goto L_0x008c
        L_0x006c:
            java.lang.String r2 = "developer"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r5 = "DEVELOPER"
            goto L_0x008c
        L_0x0077:
            java.lang.String r2 = "feed_recs"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r5 = "FEED_RECS"
            goto L_0x008c
        L_0x0082:
            java.lang.String r2 = "favorites"
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r5 = "FAVORITES"
        L_0x008c:
            java.lang.String r2 = "FEED_TYPE"
            r3.flowAnnotate(r0, r2, r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0029
        L_0x0092:
            monitor-exit(r6)
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228492ll.A08(X.1GU, java.lang.String, boolean):void");
    }

    public final synchronized void A09(1FS r5) {
        0qQ.A0B(r5, 0);
        1QP r3 = this.A04;
        long generateFlowId = r3.generateFlowId(974460658, r5.A01);
        if (r3.isOngoingFlow(generateFlowId)) {
            r3.flowMarkPoint(generateFlowId, "FEED_RESPONSE_RECEIVED");
        }
    }

    public final void A0C(1FS r5, String str) {
        0qQ.A0B(r5, 0);
        1QP r3 = this.A04;
        long generateFlowId = r3.generateFlowId(974460658, r5.A01);
        if (r3.isOngoingFlow(generateFlowId)) {
            r3.flowMarkPoint(generateFlowId, "FEED_UPDATE_DROPPED");
            r3.flowAnnotate(generateFlowId, "CANCEL_REASON", str);
            r3.flowEndCancel(generateFlowId, str);
            C228482lk.A01(A09, generateFlowId);
        }
    }

    public static final void A00(1QP r8, AnonymousClass1GU r9, C228492ll r10) {
        1FS r7 = r9.A00;
        long generateFlowId = r8.generateFlowId(974460658, r7.A01);
        r8.flowAnnotate(generateFlowId, "IS_FIRST_PAGE", r7.A02());
        1FI r4 = r7.A04;
        r8.flowAnnotate(generateFlowId, "FETCH_REASON", r4.toString());
        if (r4 != 1FI.A04) {
            r8.flowAnnotate(generateFlowId, "IS_STREAMING_REQUEST", r9 instanceof AnonymousClass1GS);
            r8.flowAnnotate(generateFlowId, "CURRENT_NAVIGATION_MODULE", C638918c.A01(C61170le.A00).A08);
        }
        UserSession userSession = r10.A05;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36313265588406114L)) {
            r8.flowAnnotate(generateFlowId, "REQUEST_ID", r7.A09);
        }
        if (182.A06(r5, userSession, 36313265588930406L)) {
            for (Map.Entry entry : r7.A0D.entrySet()) {
                r8.flowAnnotate(generateFlowId, (String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private final void A02(1FS r10) {
        1CS r4;
        AnonymousClass3PH r2 = AnonymousClass3PH.A00;
        UserSession userSession = this.A05;
        if (C638918c.A01(C61170le.A00).A0V()) {
            r4 = 1CS.A05;
        } else if (r10.A04 == 1FI.A06) {
            r4 = 1CS.A03;
        } else {
            r4 = 1CS.A06;
        }
        Integer num = AnonymousClass05K.A00;
        ArrayList arrayList = this.A06;
        r2.A01(userSession, r4, num, this.A00, this.A03, arrayList);
    }

    public final void A06(AnonymousClass1GU r5, String str) {
        1FS r0 = r5.A00;
        1QP r3 = this.A04;
        long generateFlowId = r3.generateFlowId(974460658, r0.A01);
        r3.flowAnnotate(generateFlowId, "CANCEL_REASON", str);
        r3.flowEndCancel(generateFlowId, str);
        C228482lk.A01(A09, generateFlowId);
    }

    public final synchronized void A0A(1FS r23, 1XM r24, AnonymousClass3PG r25) {
        String str;
        1Xj A022;
        String str2;
        String BOq;
        Object obj;
        Object obj2;
        1Xj A023;
        String id;
        1Xj A024;
        String id2;
        synchronized (this) {
            1FS r21 = r23;
            0qQ.A0B(r21, 0);
            AnonymousClass3PG r19 = r25;
            0qQ.A0B(r19, 1);
            1QP r7 = this.A04;
            long generateFlowId = r7.generateFlowId(974460658, r21.A01);
            if (r7.isOngoingFlow(generateFlowId)) {
                UserSession userSession = this.A05;
                1XM r20 = r24;
                r7.flowAnnotate(generateFlowId, "PARSED_ITEMS_BEFORE_DEDUPE_COUNT", r20.A00().size());
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                for (1Xg r3 : r20.A00()) {
                    AnonymousClass1Xn r14 = r3.A05;
                    if (1Xi.A02(r14) != null) {
                        if (AnonymousClass3VN.A00(userSession, r3)) {
                            1Xj A025 = 1Xi.A02(r14);
                            if (A025 == null) {
                                throw new IllegalStateException("Required value was null.");
                            } else if (AnonymousClass3VO.A09(A025)) {
                                i3++;
                            } else if (AnonymousClass3VO.A08(A025)) {
                                i4++;
                            } else if (A025.CcK()) {
                                i5++;
                            } else if (AnonymousClass3VP.A04(r3)) {
                                i7++;
                                if (A025.A5D()) {
                                    i8++;
                                }
                                if (A025.A5d()) {
                                    i++;
                                }
                            } else {
                                i6++;
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                if (r21.A02()) {
                    Iterator it = r20.A00().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (AnonymousClass3VP.A00((1Xg) obj)) {
                            break;
                        }
                    }
                    1Xg r32 = (1Xg) obj;
                    if (!(r32 == null || (A024 = 1Xi.A02(r32.A05)) == null || (id2 = A024.getId()) == null)) {
                        boolean A032 = 1UX.A00(userSession.A03.A06(), userSession).A03(id2);
                        Map map = A0B;
                        Long valueOf = Long.valueOf(generateFlowId);
                        if (map.get(valueOf) == null) {
                            map.put(valueOf, Boolean.valueOf(A032));
                            r7.flowAnnotate(generateFlowId, "TOP_AD_SEEN", A032);
                        }
                    }
                    Iterator it2 = r20.A00().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (AnonymousClass3VP.A04((1Xg) obj2)) {
                            break;
                        }
                    }
                    1Xg r33 = (1Xg) obj2;
                    if (!(r33 == null || (A023 = 1Xi.A02(r33.A05)) == null || (id = A023.getId()) == null)) {
                        boolean A033 = 1UX.A00(userSession.A03.A06(), userSession).A03(id);
                        Map map2 = A0C;
                        Long valueOf2 = Long.valueOf(generateFlowId);
                        if (map2.get(valueOf2) == null) {
                            map2.put(valueOf2, Boolean.valueOf(A033));
                            r7.flowAnnotate(generateFlowId, "TOP_ORGANIC_SEEN", A033);
                        }
                    }
                }
                int i9 = 0;
                for (1Xg r142 : r20.A00()) {
                    if (AnonymousClass3VP.A04(r142) && (A022 = 1Xi.A02(r142.A05)) != null) {
                        if (!A022.A5D() || (BOq = A022.A0C.BOq()) == null || BOq.length() == 0) {
                            str2 = A022.getId();
                        } else {
                            str2 = A022.A0C.BOq();
                        }
                        if (str2 != null && 1UX.A00(userSession.A03.A06(), userSession).A03(str2)) {
                            i9++;
                        }
                    }
                }
                int ordinal = r19.ordinal();
                if (ordinal == 1) {
                    str = r19.name();
                } else if (ordinal != 2) {
                    str = null;
                } else {
                    str = r19.name();
                }
                if (r19 == AnonymousClass3PG.NETWORK) {
                    r7.flowAnnotate(generateFlowId, "FILTERED_ITEMS_COUNT", i2);
                    r7.flowAnnotate(generateFlowId, "NETWORK_ORGANIC_SEEN_ITEMS_COUNT", i9);
                    r7.flowAnnotate(generateFlowId, "NETWORK_ORGANIC_LIKED_ITEMS_COUNT", i);
                    r7.flowMarkPoint(generateFlowId, "FEED_RESPONSE_PARSED");
                } else {
                    r7.flowMarkPoint(generateFlowId, "FEED_RESPONSE_PARSED_CACHE");
                }
                r7.flowAnnotate(generateFlowId, "PARSED_IN_FEED_REC_COUNT", i3);
                r7.flowAnnotate(generateFlowId, "PARSED_END_OF_FEED_REC_COUNT", i4);
                r7.flowAnnotate(generateFlowId, "PARSED_ADS_COUNT", i5);
                r7.flowAnnotate(generateFlowId, "PARSED_ORGANIC_ITEMS_COUNT", i7);
                r7.flowAnnotate(generateFlowId, "PARSED_ORGANIC_CAROUSEL_ITEMS_COUNT", i8);
                r7.flowAnnotate(generateFlowId, "PARSED_UNKNOWN_ITEMS_COUNT", i6);
                r7.flowAnnotate(generateFlowId, "LOGGER_VERSION", 1);
                int i10 = i5 + i7 + i3 + i4 + i6;
                r7.flowAnnotate(generateFlowId, "PARSED_ITEMS_COUNT", i10);
                if (str != null) {
                    r7.flowAnnotate(generateFlowId, "SOURCE", str);
                }
                r7.flowAnnotate(generateFlowId, "RESPONSE_CODE", r20.mStatusCode);
                long currentTimeMillis = System.currentTimeMillis();
                long j = generateFlowId;
                r7.flowAnnotate(j, "PARSE_LOCAL_TIME_MS", currentTimeMillis);
                1XM r0 = r20;
                r7.flowAnnotate(j, "RESPONSE_AGE_MS", currentTimeMillis - r0.mResponseTimestamp);
                Boolean bool = r0.A0C;
                if (bool != null) {
                    r7.flowAnnotate(generateFlowId, "TOP_ORGANIC_CHANGED_BY_RANK_AND_MERGE", bool.booleanValue());
                }
                if (r21.A04 == 1FI.A04) {
                    r7.flowEndSuccess(generateFlowId);
                    C228482lk.A01(A09, generateFlowId);
                }
                if (r20.A08 && i10 == 0) {
                    r7.flowAnnotate(generateFlowId, "NETWORK_FAILURE_REASON", "0 feed items parsed");
                    r7.flowAnnotate(generateFlowId, "REQUEST_ID", r21.A09);
                    r7.flowEndFail(generateFlowId, "NO_ITEMS_DELIVERED", "0 feed items parsed");
                    C228482lk.A01(A09, generateFlowId);
                }
            }
        }
    }

    public final void A0B(1FS r12, AnonymousClass3PG r13, Boolean bool, 0eP r15, int i, int i2, boolean z, boolean z2) {
        String str;
        String str2;
        1QP r5 = this.A04;
        long generateFlowId = r5.generateFlowId(974460658, r12.A01);
        if (r5.isOngoingFlow(generateFlowId)) {
            r5.flowAnnotate(generateFlowId, "INITIAL_FEED_ITEM_COUNT", i);
            r5.flowAnnotate(generateFlowId, "FINAL_FEED_ITEM_COUNT", i2);
            Long l = this.A02;
            String str3 = null;
            if (r12.A00()) {
                if (r13 != null) {
                    this.A06.add(r13);
                }
                if (r12.A04 != 1FI.A06) {
                    A02(r12);
                } else if (r13 == AnonymousClass3PG.NETWORK) {
                    this.A08.set(true);
                    if (l != null) {
                        long longValue = l.longValue();
                        if (r5.isOngoingFlow(longValue)) {
                            r5.flowEndCancel(longValue, CancelReason.ACTION_ALREADY_COMPLETED);
                            C228482lk.A01(A09, longValue);
                            this.A02 = null;
                        }
                    }
                    A02(r12);
                }
            }
            if (z2 && i2 != 0) {
                r5.flowAnnotate(generateFlowId, "FIRST_ITEM_CHANGED", z);
                long currentTimeMillis = System.currentTimeMillis();
                Long l2 = this.A01;
                if (l2 != null) {
                    r5.flowAnnotate(generateFlowId, "TIME_SINCE_LAST_RENDER_MS", currentTimeMillis - l2.longValue());
                }
                this.A01 = Long.valueOf(currentTimeMillis);
            }
            r5.flowMarkPoint(generateFlowId, "FEED_RENDERED");
            if (r13 != null) {
                if (r13 != AnonymousClass3PG.NETWORK) {
                    str3 = r13.name();
                }
                r5.flowAnnotate(generateFlowId, "SOURCE", str3);
            }
            if (!(r15 == null || bool == null)) {
                boolean booleanValue = bool.booleanValue();
                Number number = (Number) r15.A00;
                if (number != null) {
                    int intValue = number.intValue();
                    if (booleanValue) {
                        str2 = "IFR_ITEM_REMOVED_BY_IFR_GAP_RULE_DISTANCE";
                    } else {
                        str2 = "IFR_ITEM_VIOLATE_IFR_GAP_RULE_DISTANCE";
                    }
                    r5.flowAnnotate(generateFlowId, str2, intValue);
                }
                Number number2 = (Number) r15.A01;
                if (number2 != null) {
                    int intValue2 = number2.intValue();
                    if (booleanValue) {
                        str = "IFR_ITEM_REMOVED_BY_HP_GAP_RULE_DISTANCE";
                    } else {
                        str = "IFR_ITEM_VIOLATE_HP_GAP_RULE_DISTANCE";
                    }
                    r5.flowAnnotate(generateFlowId, str, intValue2);
                }
            }
            r5.flowEndSuccess(generateFlowId);
            C228482lk.A01(A09, generateFlowId);
        }
    }

    public final void onSessionWillEnd() {
        synchronized (this) {
            HashMap hashMap = A0A;
            for (Object next : hashMap.keySet()) {
                0qQ.A07(next);
                long longValue = ((Number) next).longValue();
                1QP r1 = this.A04;
                r1.flowAnnotate(longValue, "CANCEL_REASON", "Session Ending");
                r1.flowEndCancel(longValue, "Session Ending");
            }
            hashMap.clear();
        }
    }
}
