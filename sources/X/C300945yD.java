package X;

import android.util.LruCache;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5yD  reason: invalid class name and case insensitive filesystem */
public final class C300945yD {
    public TimerTask A00;
    public final LruCache A01 = new LruCache(20);
    public final UserSession A02;
    public final List A03 = new ArrayList();
    public final ConcurrentMap A04 = new ConcurrentHashMap();
    public final ConcurrentMap A05 = new ConcurrentHashMap();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(C300955yE.A00);

    public C300945yD(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0.booleanValue() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(X.C254703su r8, com.instagram.model.direct.DirectThreadKey r9, boolean r10) {
        /*
            r7 = this;
            r0 = 1
            X.0qQ.A0B(r8, r0)
            java.lang.String r2 = r8.A0f()
            boolean r4 = r8.A1S()
            java.lang.Boolean r0 = r8.A19
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.booleanValue()
            r5 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            java.lang.String r3 = r8.A1u
            r0 = r7
            r1 = r9
            r6 = r10
            boolean r0 = r0.A03(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300945yD.A02(X.3su, com.instagram.model.direct.DirectThreadKey, boolean):boolean");
    }

    public final boolean A03(DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2, boolean z3) {
        ConcurrentMap concurrentMap;
        ConcurrentMap concurrentMap2;
        Map map;
        C70689OGk oGk;
        OH2 oh2;
        if (!z2) {
            return false;
        }
        boolean z4 = z;
        if (z3) {
            String str3 = str;
            if (str != null) {
                UserSession userSession = this.A02;
                String str4 = userSession.A06;
                String str5 = str2;
                String str6 = null;
                if (0qQ.A0K(str5, str4) && (oh2 = (OH2) C70177NyV.A00(userSession).A00.get(str3)) != null) {
                    str6 = oh2.A05;
                }
                String str7 = directThreadKey.A00;
                if (str7 != null) {
                    if (z) {
                        concurrentMap = this.A04;
                        concurrentMap2 = this.A05;
                    } else {
                        concurrentMap = this.A05;
                        concurrentMap2 = this.A04;
                    }
                    if (concurrentMap.get(str7) == null) {
                        concurrentMap.putIfAbsent(str7, new ConcurrentHashMap());
                    }
                    if (this.A01.get(str3) == null && ((map = (Map) concurrentMap.get(str7)) == null || !map.containsKey(str3))) {
                        String str8 = str7;
                        C70689OGk oGk2 = new C70689OGk(str8, str3, str6, System.currentTimeMillis(), z4, 0qQ.A0K(str5, str4));
                        Map map2 = (Map) concurrentMap2.get(str7);
                        if (map2 == null || (oGk = (C70689OGk) map2.get(str3)) == null) {
                            List list = this.A03;
                            synchronized (list) {
                                int A1K = 0sr.A1K(list, new C74193PqZ(oGk2, 8), list.size());
                                if (A1K < 0) {
                                    int i = (-A1K) - 1;
                                    list.add(i, oGk2);
                                    if (i == 0) {
                                        A00(this);
                                    }
                                }
                            }
                            Map map3 = (Map) concurrentMap.get(str7);
                            if (map3 != null) {
                                map3.put(str3, oGk2);
                                return z;
                            }
                        } else {
                            long j = oGk2.A00 - oGk.A00;
                            if (!z) {
                                j = -j;
                            }
                            String str9 = oGk2.A03;
                            String str10 = oGk2.A01;
                            boolean z5 = !oGk2.A05;
                            String str11 = oGk2.A02;
                            if (str11 == null) {
                                str11 = oGk.A02;
                            }
                            A01(this, str9, str10, str11, j, true, true, z5);
                            List list2 = this.A03;
                            synchronized (list2) {
                                int indexOf = list2.indexOf(oGk);
                                if (indexOf >= 0) {
                                    list2.remove(indexOf);
                                    if (indexOf == 0) {
                                        A00(this);
                                    }
                                }
                            }
                            Map map4 = (Map) concurrentMap2.get(str7);
                            if (map4 != null) {
                                map4.remove(str3);
                                return z;
                            }
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return z;
    }

    public static final void A00(C300945yD r7) {
        List list = r7.A03;
        synchronized (list) {
            TimerTask timerTask = r7.A00;
            if (timerTask != null) {
                timerTask.cancel();
            }
            r7.A00 = null;
            if (!list.isEmpty()) {
                long currentTimeMillis = (((C70689OGk) list.get(0)).A00 + StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS) - System.currentTimeMillis();
                Timer timer = (Timer) r7.A06.getValue();
                if (currentTimeMillis <= 0) {
                    currentTimeMillis = 0;
                }
                C73551Pei pei = new C73551Pei(r7);
                timer.schedule(pei, currentTimeMillis);
                r7.A00 = pei;
            }
        }
    }

    public static final void A01(C300945yD r7, String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3) {
        long j2;
        UserSession userSession = r7.A02;
        0wc A012 = AnonymousClass0kN.A01(new 0xG("armadillo_express"), userSession);
        0Aj A002 = A012.A00(A012.A00, "armadillo_express_dual_send");
        if (A002.isSampled()) {
            String str4 = "";
            String str5 = str4;
            A002.AAJ("ig_user_id", userSession.A06);
            A002.A7p("is_sender_only_dual_send", false);
            if (str3 != null) {
                str4 = str3;
            }
            A002.AAJ("ig_other_user_id", str4);
            A002.AAJ("e2ee_send_error", str5);
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A002.AAJ("open_send_error", str5);
            A002.A9F("e2ee_latency_ms", Long.valueOf(j));
            A002.A7p("is_receive", Boolean.valueOf(z3));
            A002.A7p("is_e2ee_successful", Boolean.valueOf(z2));
            A002.A7p("is_open_successful", Boolean.valueOf(z));
            A002.AAJ("client_context", str2);
            Long BST = 0eE.A00(userSession).A00().BST();
            if (BST != null) {
                j2 = BST.longValue();
            } else {
                j2 = 0;
            }
            A002.A9F("pk", Long.valueOf(j2));
            A002.Cgf();
        }
        r7.A01.put(str2, 0);
    }
}
