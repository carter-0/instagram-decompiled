package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.user.model.User;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.GWg  reason: case insensitive filesystem */
public final class C52529GWg {
    public ExploreTopicCluster A00;
    public String A01;
    public final Context A02;
    public final AnonymousClass07i A03;
    public final UserSession A04;
    public final C232682uF A05;
    public final C228232l0 A06;
    public final String A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final List A09 = AnonymousClass7TE.A1C();
    public final Map A0A = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0B = C58675Ivk.A00(this, 11);
    public final AnonymousClass0eM A0C = C58675Ivk.A00(this, 12);
    public final AnonymousClass0eM A0D = C58675Ivk.A00(this, 14);
    public final C324266yu A0E;
    public final AnonymousClass0eM A0F = C58675Ivk.A00(this, 13);

    public C52529GWg(Context context, AnonymousClass07i r3, UserSession userSession, ExploreTopicCluster exploreTopicCluster, C324266yu r6, C232682uF r7, C228232l0 r8, String str) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A04 = userSession;
        this.A05 = r7;
        this.A03 = r3;
        this.A0E = r6;
        this.A07 = str;
        this.A06 = r8;
        this.A00 = exploreTopicCluster;
    }

    private final void A00() {
        Object obj;
        boolean z;
        JQF jqf;
        if (A04()) {
            List list = this.A08;
            if (((long) list.size()) <= AnonymousClass7TE.A0R(AnonymousClass7TE.A14(this.A0B)) && this.A00 != null) {
                Context context = this.A02;
                Iterator it = this.A09.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!list.contains(obj)) {
                        break;
                    }
                }
                1Xj r1 = (1Xj) obj;
                if (r1 != null) {
                    list.add(r1);
                    String id = r1.getId();
                    UUID randomUUID = UUID.randomUUID();
                    UserSession userSession = this.A04;
                    User A2A = r1.A2A(userSession);
                    if (A2A != null && id != null) {
                        String id2 = A2A.getId();
                        C54664HMv hMv = C54664HMv.A05;
                        int i = r1.BR7().A00;
                        String B2y = r1.A0C.B2y();
                        String obj2 = randomUUID.toString();
                        String A2R = r1.A2R();
                        int A002 = C51973G9u.A00();
                        if (A002 == 0) {
                            z = false;
                        } else if (A002 == 3) {
                            z = true;
                        } else {
                            throw AnonymousClass7TE.A0w("All channel-related arguments must be provided");
                        }
                        String str = null;
                        DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(hMv, (VideoFeedType) null, (Boolean) null, (Integer) null, id, id2, B2y, (String) null, (String) null, obj2, (String) null, (String) null, (String) null, A2R, (String) null, (String) null, (String) null, (String) null, (String) null, i, z);
                        ExploreTopicCluster exploreTopicCluster = this.A00;
                        if (exploreTopicCluster != null) {
                            String id3 = r1.getId();
                            C232682uF r15 = this.A05;
                            AnonymousClass07i r14 = this.A03;
                            String obj3 = randomUUID.toString();
                            String str2 = this.A07;
                            if (id3 != null) {
                                str = DbT.A11(id3, C52550GXb.A00(userSession).A02);
                            }
                            C228232l0 r13 = this.A06;
                            if (discoveryChainingItem.A0K) {
                                VideoFeedType videoFeedType = discoveryChainingItem.A02;
                                videoFeedType.getClass();
                                int ordinal = videoFeedType.ordinal();
                                if (ordinal == 1) {
                                    jqf = new IRA(context, userSession, discoveryChainingItem, exploreTopicCluster, r15, r13, obj3, "topical_explore", "explore_auto_play");
                                } else if (ordinal == 0 || ordinal == 2 || ordinal == 4 || ordinal == 3) {
                                    jqf = new IR9(context, userSession, discoveryChainingItem, r15, r13, str2);
                                } else {
                                    throw AnonymousClass7TF.A0W("Invalid VideoFeedType: ", videoFeedType.toString());
                                }
                            } else {
                                jqf = new IRA(context, userSession, discoveryChainingItem, exploreTopicCluster, r15, r13, obj3, "topical_explore", "explore_media_grid");
                            }
                            C56006HrC hrC = new C56006HrC(context, r14, userSession, jqf, r15, str, (HashMap) null, false);
                            hrC.A01 = new IRE(userSession, this, id);
                            hrC.A00(new IRT(r1));
                        }
                    }
                }
            }
        }
    }

    public static final void A01(C52529GWg gWg, String str) {
        UserSession userSession = gWg.A04;
        C52551GXc A002 = C52550GXb.A00(userSession);
        0qQ.A0B(str, 0);
        A002.A02.remove(str);
        A002.A01.remove(str);
        Map map = A002.A00;
        synchronized (map) {
            map.remove(str);
        }
        gWg.A0A.remove(str);
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            gWg.A02(A0U);
        }
    }

    public final void A03(String str) {
        Object obj;
        this.A0A.put(str, C51968G9o.A0u());
        List list = this.A09;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(C51966G9m.A1E(obj), str)) {
                break;
            }
        }
        0u4.A00(list).remove(obj);
        0u4.A00(this.A08).remove(obj);
        A00();
    }

    public final boolean A04() {
        Object value = this.A0F.getValue();
        0qQ.A07(value);
        return ((Boolean) value).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.C52550GXb.A00(r4.A04).A00.containsKey(r1) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.1Xj r5) {
        /*
            r4 = this;
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0037
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x001b
            com.instagram.common.session.UserSession r0 = r4.A04
            X.GXc r0 = X.C52550GXb.A00(r0)
            java.util.Map r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            java.util.List r0 = r4.A08
            boolean r2 = r0.contains(r5)
            java.util.List r1 = r4.A09
            boolean r0 = r1.contains(r5)
            if (r3 != 0) goto L_0x0037
            if (r2 != 0) goto L_0x0037
            if (r0 != 0) goto L_0x0037
            r5.getId()
            r1.add(r5)
            r4.A00()
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52529GWg.A02(X.1Xj):void");
    }
}
