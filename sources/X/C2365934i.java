package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.34i  reason: invalid class name and case insensitive filesystem */
public abstract class C2365934i extends 2Rw implements C2366034j {
    public static long A06 = 1;
    public Reel A00 = null;
    public AnonymousClass3BN A01 = null;
    public final HashMap A02 = new HashMap();
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final Map A05 = new HashMap();

    public final AnonymousClass3BQ A01() {
        int intValue = ((C2365834h) this).A08.intValue();
        if (intValue == 1) {
            return AnonymousClass3BQ.IN_FEED_STORIES_TRAY;
        }
        if (intValue == 2) {
            return AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY;
        }
        if (intValue == 4) {
            return AnonymousClass3BQ.ADS_HISTORY;
        }
        if (intValue != 3) {
            return AnonymousClass3BQ.MAIN_FEED_TRAY;
        }
        return AnonymousClass3BQ.IN_VIEWER_TRAY;
    }

    public int CMG(Reel reel) {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i >= list.size()) {
                return -1;
            }
            String str = reel.A1o;
            String str2 = ((AnonymousClass3BT) list.get(i)).A03.A1o;
            0qQ.A07(str2);
            if (str.equals(str2)) {
                return i;
            }
            i++;
        }
    }

    public final AnonymousClass3BN A00(UserSession userSession) {
        AnonymousClass3BN r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass3BT r02 : this.A04) {
            arrayList.add(r02.A03);
        }
        return new AnonymousClass3BN(userSession, arrayList);
    }

    public final ArrayList A02() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass3BT r0 : this.A04) {
            Reel reel = r0.A03;
            if (!reel.A0a()) {
                arrayList.add(reel);
            }
        }
        return arrayList;
    }

    public final ArrayList A03(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AnonymousClass3BT r0 = (AnonymousClass3BT) this.A02.get(obj);
            if (r0 != null) {
                arrayList.add(r0.A03);
            }
        }
        return arrayList;
    }

    public final Object Bkf(int i) {
        List list = this.A04;
        if (i >= list.size()) {
            return null;
        }
        return ((AnonymousClass3BT) list.get(i)).A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ei9(java.util.List r15, boolean r16, com.instagram.common.session.UserSession r17) {
        /*
            r14 = this;
            r12 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "setReels"
            r0 = 1768165827(0x696411c3, float:1.7232435E25)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0124 }
        L_0x0010:
            java.util.List r8 = r14.A04     // Catch:{ all -> 0x0124 }
            int r11 = r8.size()     // Catch:{ all -> 0x0124 }
            java.util.HashMap r7 = r14.A02     // Catch:{ all -> 0x0124 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0124 }
            r6.<init>(r7)     // Catch:{ all -> 0x0124 }
            r8.clear()     // Catch:{ all -> 0x0124 }
            r7.clear()     // Catch:{ all -> 0x0124 }
            java.util.List r5 = r14.A03     // Catch:{ all -> 0x0124 }
            r5.clear()     // Catch:{ all -> 0x0124 }
            r0 = 0
            r14.A01 = r0     // Catch:{ all -> 0x0124 }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = "addReelsToViewModels"
            r0 = -28465201(0xfffffffffe4da7cf, float:-6.8340763E37)
            X.0fS.A01(r1, r0)     // Catch:{ all -> 0x0116 }
        L_0x0039:
            X.3BN r0 = new X.3BN     // Catch:{ all -> 0x0116 }
            r3 = r17
            r0.<init>(r3, r15)     // Catch:{ all -> 0x0116 }
            r14.A01 = r0     // Catch:{ all -> 0x0116 }
            r4 = 0
        L_0x0043:
            int r0 = r15.size()     // Catch:{ all -> 0x0116 }
            if (r4 >= r0) goto L_0x00dc
            java.lang.Object r2 = r15.get(r4)     // Catch:{ all -> 0x0116 }
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2     // Catch:{ all -> 0x0116 }
            X.3BQ r9 = r14.A01()     // Catch:{ all -> 0x0116 }
            X.1Ns r0 = r2.A0W     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00da
            X.1Ns r0 = r2.A0W     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r0.getId()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00da
            X.1Ns r0 = r2.A0W     // Catch:{ all -> 0x0116 }
            r0.getId()     // Catch:{ all -> 0x0116 }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0116 }
            X.0qQ.A06(r1)     // Catch:{ all -> 0x0116 }
            X.3BS r0 = new X.3BS     // Catch:{ all -> 0x0116 }
            r0.<init>(r1)     // Catch:{ all -> 0x0116 }
        L_0x0070:
            X.3BT r10 = new X.3BT     // Catch:{ all -> 0x0116 }
            r10.<init>(r0, r2, r9)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r2.A1o     // Catch:{ all -> 0x0116 }
            boolean r0 = r6.containsKey(r0)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r2.A1o     // Catch:{ all -> 0x0116 }
            java.lang.Object r0 = r6.remove(r0)     // Catch:{ all -> 0x0116 }
            X.3BT r0 = (X.AnonymousClass3BT) r0     // Catch:{ all -> 0x0116 }
            X.3Pi r0 = r0.A01     // Catch:{ all -> 0x0116 }
            r10.A01 = r0     // Catch:{ all -> 0x0116 }
        L_0x0089:
            java.lang.String r0 = r2.A1o     // Catch:{ all -> 0x0116 }
            r5.add(r0)     // Catch:{ all -> 0x0116 }
            r0 = r14
            X.34h r0 = (X.C2365834h) r0     // Catch:{ all -> 0x0116 }
            java.lang.Integer r0 = r0.A08     // Catch:{ all -> 0x0116 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0116 }
            r0 = 1
            if (r1 == r0) goto L_0x00a5
            r0 = 2
            if (r1 == r0) goto L_0x009f
            r9 = 0
            goto L_0x00be
        L_0x009f:
            X.Wap r9 = new X.Wap     // Catch:{ all -> 0x0116 }
            r9.<init>(r3)     // Catch:{ all -> 0x0116 }
            goto L_0x00aa
        L_0x00a5:
            X.5GF r9 = new X.5GF     // Catch:{ all -> 0x0116 }
            r9.<init>(r3)     // Catch:{ all -> 0x0116 }
        L_0x00aa:
            int r0 = r9.BTD()     // Catch:{ all -> 0x0116 }
            if (r4 <= r0) goto L_0x00be
            int r1 = r15.size()     // Catch:{ all -> 0x0116 }
            r0 = 7
            if (r1 < r0) goto L_0x00be
            boolean r0 = r9.BvI()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00be
            goto L_0x00d6
        L_0x00be:
            r8.add(r10)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r2.A1o     // Catch:{ all -> 0x0116 }
            r7.put(r0, r10)     // Catch:{ all -> 0x0116 }
            if (r9 == 0) goto L_0x00d6
            int r0 = r9.BTD()     // Catch:{ all -> 0x0116 }
            if (r4 != r0) goto L_0x00d6
            boolean r0 = r9.BvI()     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x00d6
            r14.A00 = r2     // Catch:{ all -> 0x0116 }
        L_0x00d6:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x00da:
            r0 = 0
            goto L_0x0070
        L_0x00dc:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00e8
            r0 = -1531801281(0xffffffffa4b2913f, float:-7.744125E-17)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0124 }
        L_0x00e8:
            if (r16 == 0) goto L_0x0106
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x0124 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0124 }
            r0 = 36322044501370784(0x810ab5000527a0, double:3.033545427576121E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0106
            int r1 = r11 + 1
            int r0 = r15.size()     // Catch:{ all -> 0x0124 }
            int r0 = r0 - r11
            r14.notifyItemRangeInserted(r1, r0)     // Catch:{ all -> 0x0124 }
            goto L_0x0109
        L_0x0106:
            r14.notifyDataSetChanged()     // Catch:{ all -> 0x0124 }
        L_0x0109:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0115
            r0 = -1656428709(0xffffffff9d44e75b, float:-2.6059992E-21)
            X.0fS.A00(r0)
        L_0x0115:
            return
        L_0x0116:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0123
            r0 = -1916897436(0xffffffff8dbe7764, float:-1.1738396E-30)
            X.0fS.A00(r0)     // Catch:{ all -> 0x0124 }
        L_0x0123:
            throw r1     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r12)
            if (r0 == 0) goto L_0x0131
            r0 = -501249238(0xffffffffe21f8b2a, float:-7.35765E20)
            X.0fS.A00(r0)
        L_0x0131:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365934i.Ei9(java.util.List, boolean, com.instagram.common.session.UserSession):void");
    }

    public final int CMH(Reel reel, C255773uh r3) {
        return CMG(reel);
    }

    public final long getItemId(int i) {
        long longValue;
        int i2;
        int A032 = AnonymousClass0fD.A03(-1302744933);
        List list = this.A04;
        if (i >= list.size()) {
            0wb.A03("MainFeedTrayAdapter#getItemId", "Item position is larger than the # of known viewModels");
            longValue = (long) i;
            i2 = -2008603130;
        } else {
            String str = ((AnonymousClass3BT) list.get(i)).A03.A1o;
            Map map = this.A05;
            Number number = (Number) map.get(str);
            if (number == null) {
                long j = A06;
                A06 = 1 + j;
                number = Long.valueOf(j);
                map.put(str, number);
            }
            longValue = number.longValue();
            i2 = 356829308;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return longValue;
    }
}
