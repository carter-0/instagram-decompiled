package X;

import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.msys.mci.CQLResultSet;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class PPZ implements C336267eL {
    public C336267eL A00;
    public C337237fw A01;
    public String A02 = "";
    public C74480Pva A03;
    public final long A04;
    public final long A05;
    public final AnonymousClass7BY A06;
    public final OLO A07;
    public final C71842Orj A08;
    public final 2Dm A09;
    public final 17i A0A;
    public final List A0B = new CopyOnWriteArrayList();
    public final Map A0C = new ConcurrentHashMap();
    public final Map A0D = AnonymousClass7TE.A1H();
    public final Map A0E = new ConcurrentHashMap();
    public final ConcurrentHashMap A0F = new ConcurrentHashMap();
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final int A0L;
    public final 1aU A0M;
    public final 1a8 A0N;
    public final UserSession A0O;

    public static void A03(Map map, List list) {
        synchronized (map) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectSearchResult directSearchResult = (DirectSearchResult) it.next();
                if (directSearchResult instanceof DirectShareTarget) {
                    map.put(((DirectShareTarget) directSearchResult).A09(), directSearchResult);
                } else if (directSearchResult != null) {
                    map.put(directSearchResult.toString(), directSearchResult);
                }
            }
        }
    }

    public static String[] A05(CQLResultSet cQLResultSet, int i, int i2) {
        String string = cQLResultSet.getString(i, i2);
        if (!TextUtils.isEmpty(string)) {
            return TextUtils.split(string, ",");
        }
        return new String[0];
    }

    public final void DDU() {
        this.A01 = null;
        OLO olo = this.A07;
        olo.A03.A03.A01();
        olo.A02.A01();
        this.A0N.A01();
        C74480Pva pva = this.A03;
        if (pva != null) {
            pva.stop();
        }
    }

    public static List A00(C257443xP r15, PPZ ppz) {
        C254923tH r7;
        int intValue;
        PendingRecipient pendingRecipient;
        User A022;
        if (r15 == null || !r15.A06()) {
            return Collections.emptyList();
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        C301345z0 r4 = (C301345z0) r15.A03();
        PPZ ppz2 = ppz;
        boolean isEmpty = TextUtils.isEmpty(ppz2.A02);
        int A042 = C66580MXl.A04(r4);
        if (isEmpty) {
            A042 = Math.min(A042, ppz2.A0L);
        }
        for (int i = 0; i < C66580MXl.A04(r4) && A1C.size() < A042; i++) {
            if (!C70116NxW.A00(C66581MXm.A0o(r4.mResultSet, i, 3)).A02) {
                if (r4.mResultSet.getNullableLong(i, 0) != null) {
                    String[] A052 = A05(r4.mResultSet, i, 9);
                    String[] A053 = A05(r4.mResultSet, i, 10);
                    String[] A054 = A05(r4.mResultSet, i, 13);
                    String[] A055 = A05(r4.mResultSet, i, 14);
                    int length = A055.length;
                    int min = Math.min(length, Math.min(A052.length, length));
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (int i2 = 0; i2 < min; i2++) {
                        if (i2 >= A053.length || (A022 = ppz2.A0A.A02(A053[i2])) == null) {
                            Parcelable.Creator creator = PendingRecipient.CREATOR;
                            pendingRecipient = new PendingRecipient(DbS.A0V(A055[i2]), A052[i2], A054[i2]);
                        } else {
                            pendingRecipient = new PendingRecipient(A022);
                        }
                        A1C2.add(pendingRecipient);
                    }
                    long longValue = r4.mResultSet.getNullableLong(i, 0).longValue();
                    Long nullableLong = r4.mResultSet.getNullableLong(i, 1);
                    if (C70093Nx9.A00(r4.mResultSet.getInteger(i, 2))) {
                        r7 = C254923tH.ACT;
                    } else {
                        r7 = C254923tH.MI;
                    }
                    MsysThreadId msysThreadId = new MsysThreadId(r7, nullableLong, longValue);
                    String string = r4.mResultSet.getString(i, 12);
                    if (string == null) {
                        string = "";
                    }
                    if (r4.mResultSet.getNullableInteger(i, 5) == null) {
                        intValue = 0;
                    } else {
                        intValue = r4.mResultSet.getNullableInteger(i, 5).intValue();
                    }
                    DirectShareTarget directShareTarget = new DirectShareTarget(msysThreadId, r4.mResultSet.getNullableBoolean(i, 17), string, (List) A1C2, intValue);
                    if (r4.mResultSet.getString(i, 15) != null) {
                        directShareTarget.A02 = new ExtendedImageUrl(C66580MXl.A0v(r4, i, 15), -1, -1);
                    }
                    A1C.add(directShareTarget);
                }
            }
        }
        return A1C;
    }

    public static List A01(C257443xP r6, PPZ ppz, List list, Map map) {
        C336267eL r4 = ppz.A00;
        r4.getClass();
        OLO olo = ppz.A07;
        olo.getClass();
        String str = ppz.A02;
        String str2 = (String) olo.A01.A0X();
        if (str2 == null) {
            str2 = "";
        }
        if (0mp.A0G(str, str2)) {
            Map map2 = ppz.A0E;
            map2.clear();
            boolean z = ppz.A0H;
            List A002 = A00(r6, ppz);
            if (z) {
                ArrayList A0q = AnonymousClass7TF.A0q(A002, 0);
                for (Object next : A002) {
                    Boolean bool = ((DirectShareTarget) ((DirectSearchResult) next)).A0A;
                    if (bool != null && bool.booleanValue()) {
                        A0q.add(next);
                    }
                }
                A002 = A0q;
            }
            A03(map2, A002);
        }
        if (0mp.A0G(ppz.A02, r4.BiY())) {
            Map map3 = ppz.A0D;
            map3.clear();
            A03(map3, list);
        }
        ppz.A0F.putAll(map);
        if (!ppz.A0I || !list.isEmpty()) {
            A02(ppz);
        }
        return ppz.A0B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.PPZ r13) {
        /*
            java.util.List r6 = r13.A0B
            r6.clear()
            boolean r0 = r13.A0J
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x003c
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r13.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x003c
        L_0x001b:
            r12 = 1
        L_0x001c:
            boolean r0 = r13.A0K
            if (r0 == 0) goto L_0x00a2
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.Map r4 = r13.A0D
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = r13.A02
            int r0 = X.DbX.A05(r0)
            long r2 = (long) r0
            long r0 = r13.A05
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x00a2
            monitor-enter(r4)
            r9 = 0
            goto L_0x003e
        L_0x003c:
            r12 = 0
            goto L_0x001c
        L_0x003e:
            java.util.Iterator r11 = X.AnonymousClass7TF.A0u(r4)     // Catch:{ all -> 0x0096 }
        L_0x0042:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0094
            long r2 = r13.A04     // Catch:{ all -> 0x0096 }
            long r0 = (long) r9     // Catch:{ all -> 0x0096 }
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0094
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r11)     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r2.getValue()     // Catch:{ all -> 0x0096 }
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectShareTarget     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r2.getValue()     // Catch:{ all -> 0x0096 }
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1     // Catch:{ all -> 0x0096 }
            boolean r0 = r1.A0O()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r1.A0A()     // Catch:{ all -> 0x0096 }
            boolean r0 = r13.A04(r0)     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = X.DbT.A0y(r1)     // Catch:{ all -> 0x0096 }
            boolean r0 = r13.A04(r0)     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = r1.A0J     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = ""
        L_0x0081:
            boolean r0 = r13.A04(r0)     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0042
        L_0x0087:
            java.lang.String r0 = X.DbT.A13(r2)     // Catch:{ all -> 0x0096 }
            r8.put(r0, r1)     // Catch:{ all -> 0x0096 }
            int r9 = r9 + 1
            r11.remove()     // Catch:{ all -> 0x0096 }
            goto L_0x0042
        L_0x0094:
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0096 }
            throw r0
        L_0x0099:
            r8.putAll(r4)
            r4.clear()
            r4.putAll(r8)
        L_0x00a2:
            java.util.Map r3 = r13.A0D
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x01c1
            monitor-enter(r3)
            java.util.Iterator r9 = X.AnonymousClass7TF.A0u(r3)     // Catch:{ all -> 0x01be }
        L_0x00af:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x01bc
            java.util.Map$Entry r8 = X.AnonymousClass7TE.A1J(r9)     // Catch:{ all -> 0x01be }
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x01be }
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectShareTarget     // Catch:{ all -> 0x01be }
            if (r0 != 0) goto L_0x00cb
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.DirectSearchResult r0 = (com.instagram.model.direct.DirectSearchResult) r0     // Catch:{ all -> 0x01be }
            r6.add(r0)     // Catch:{ all -> 0x01be }
            goto L_0x00af
        L_0x00cb:
            java.lang.Object r4 = r8.getValue()     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4     // Catch:{ all -> 0x01be }
            boolean r0 = r4.A0R()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00e4
            java.util.Map r1 = r13.A0E     // Catch:{ all -> 0x01be }
            java.lang.String r0 = r4.A09()     // Catch:{ all -> 0x01be }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00e4
            goto L_0x00af
        L_0x00e4:
            boolean r0 = r4.A0S     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00ec
            r6.add(r4)     // Catch:{ all -> 0x01be }
            goto L_0x00af
        L_0x00ec:
            X.3t2 r2 = X.DbS.A0c(r4)     // Catch:{ all -> 0x01be }
            boolean r0 = r2 instanceof X.C254763t0     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00f9
            X.3t0 r2 = (X.C254763t0) r2     // Catch:{ all -> 0x01be }
            java.lang.String r1 = r2.A00     // Catch:{ all -> 0x01be }
            goto L_0x010d
        L_0x00f9:
            boolean r0 = r2 instanceof X.C291175gg     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x013c
            X.2Dm r1 = r13.A09     // Catch:{ all -> 0x01be }
            X.5gg r2 = (X.C291175gg) r2     // Catch:{ all -> 0x01be }
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x01be }
            X.3U9 r0 = r1.B35(r0)     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x013c
            java.lang.String r1 = r0.C6C()     // Catch:{ all -> 0x01be }
        L_0x010d:
            if (r1 == 0) goto L_0x013c
            java.util.concurrent.ConcurrentHashMap r0 = r13.A0F     // Catch:{ all -> 0x01be }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x01be }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x01be }
            if (r2 == 0) goto L_0x013c
            java.util.Map r1 = r13.A0C     // Catch:{ all -> 0x01be }
            java.lang.String r0 = X.DbT.A13(r8)     // Catch:{ all -> 0x01be }
            r1.put(r0, r4)     // Catch:{ all -> 0x01be }
            long r0 = r2.longValue()     // Catch:{ all -> 0x01be }
            r2 = 0
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66580MXl.A0j(r2, r0)     // Catch:{ all -> 0x01be }
            r4.A09 = r0     // Catch:{ all -> 0x01be }
            r4.A0T = r5     // Catch:{ all -> 0x01be }
            r6.add(r4)     // Catch:{ all -> 0x01be }
            java.util.Map r1 = r13.A0E     // Catch:{ all -> 0x01be }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01be }
            r1.remove(r0)     // Catch:{ all -> 0x01be }
            goto L_0x018b
        L_0x013c:
            boolean r0 = r4.A0X()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x0182
            java.util.Map r1 = r13.A0C     // Catch:{ all -> 0x01be }
            java.lang.String r0 = X.DbT.A13(r8)     // Catch:{ all -> 0x01be }
            r1.put(r0, r4)     // Catch:{ all -> 0x01be }
            java.util.List r0 = X.DbT.A14(r4)     // Catch:{ all -> 0x01be }
            int r0 = r0.size()     // Catch:{ all -> 0x01be }
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r5)
            X.17k.A0E(r0)     // Catch:{ all -> 0x01be }
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.DbY.A0W(r4, r7)     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[] r0 = new com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[]{r0}     // Catch:{ all -> 0x01be }
            java.util.List r2 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x01be }
            X.3tH r1 = X.C254923tH.ACT     // Catch:{ all -> 0x01be }
            X.PIO r0 = new X.PIO     // Catch:{ all -> 0x01be }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x01be }
            r4.A09 = r0     // Catch:{ all -> 0x01be }
            r4.A0T = r5     // Catch:{ all -> 0x01be }
            r6.add(r4)     // Catch:{ all -> 0x01be }
            java.util.Map r1 = r13.A0E     // Catch:{ all -> 0x01be }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01be }
            r1.remove(r0)     // Catch:{ all -> 0x01be }
            goto L_0x018b
        L_0x0182:
            java.lang.Object r0 = r8.getValue()     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.DirectSearchResult r0 = (com.instagram.model.direct.DirectSearchResult) r0     // Catch:{ all -> 0x01be }
            r6.add(r0)     // Catch:{ all -> 0x01be }
        L_0x018b:
            if (r12 == 0) goto L_0x00af
            java.util.Map r2 = r13.A0E     // Catch:{ all -> 0x01be }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01be }
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01be }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ all -> 0x01be }
            com.instagram.model.direct.DirectSearchResult r1 = (com.instagram.model.direct.DirectSearchResult) r1     // Catch:{ all -> 0x01be }
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectShareTarget     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00af
            r0 = r1
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0     // Catch:{ all -> 0x01be }
            boolean r0 = r0.A0S()     // Catch:{ all -> 0x01be }
            if (r0 == 0) goto L_0x00af
            r6.add(r1)     // Catch:{ all -> 0x01be }
            java.lang.Object r0 = r8.getKey()     // Catch:{ all -> 0x01be }
            r2.remove(r0)     // Catch:{ all -> 0x01be }
            goto L_0x00af
        L_0x01bc:
            monitor-exit(r3)     // Catch:{ all -> 0x01be }
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01be }
            throw r0
        L_0x01c1:
            java.util.Map r0 = r13.A0E
            java.util.Iterator r4 = X.AnonymousClass7TF.A0v(r0)
        L_0x01c7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r3 = r4.next()
            com.instagram.model.direct.DirectSearchResult r3 = (com.instagram.model.direct.DirectSearchResult) r3
            boolean r0 = r3 instanceof com.instagram.model.direct.DirectShareTarget
            if (r0 == 0) goto L_0x01c7
            java.util.Map r2 = r13.A0C
            r1 = r3
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r0 = r1.A09()
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x01e8
            r1.A0T = r5
        L_0x01e8:
            r6.add(r3)
            goto L_0x01c7
        L_0x01ec:
            X.7BY r6 = r13.A06
            com.google.common.collect.ImmutableList r5 = r6.A01()
            r4 = 0
        L_0x01f3:
            int r0 = r5.size()
            if (r4 >= r0) goto L_0x0270
            java.lang.Object r3 = r5.get(r4)
            com.instagram.model.direct.DirectShareTarget r3 = (com.instagram.model.direct.DirectShareTarget) r3
            java.util.Map r1 = r13.A0C
            java.lang.String r0 = r3.A09()
            boolean r0 = r1.containsKey(r0)
            r8 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0238
            java.util.List r0 = X.DbT.A14(r3)
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0238
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = X.DbY.A0W(r3, r7)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.OXK.A00(r0)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[] r0 = new com.instagram.model.direct.threadkey.impl.MsysPendingRecipient[]{r0}
            java.util.List r8 = java.util.Arrays.asList(r0)
            X.3tH r1 = X.C254923tH.ACT
            X.PIO r0 = new X.PIO
            r0.<init>(r1, r8)
        L_0x022e:
            r3.A0T = r2
            r3.A09 = r0
            r6.A04(r3, r4)
        L_0x0235:
            int r4 = r4 + 1
            goto L_0x01f3
        L_0x0238:
            X.3t2 r9 = X.DbS.A0c(r3)
            boolean r0 = r9 instanceof X.C254763t0
            if (r0 == 0) goto L_0x025b
            X.3t0 r9 = (X.C254763t0) r9
            java.lang.String r9 = r9.A00
        L_0x0244:
            if (r9 == 0) goto L_0x0235
            java.util.concurrent.ConcurrentHashMap r1 = r13.A0F
            boolean r0 = r1.containsKey(r9)
            if (r0 == 0) goto L_0x0235
            java.lang.Object r0 = r1.get(r9)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C66580MXl.A0j(r8, r0)
            goto L_0x022e
        L_0x025b:
            boolean r0 = r9 instanceof X.C291175gg
            if (r0 == 0) goto L_0x0235
            X.2Dm r1 = r13.A09
            X.5gg r9 = (X.C291175gg) r9
            java.util.List r0 = r9.A00
            X.3U9 r0 = r1.B35(r0)
            if (r0 == 0) goto L_0x0235
            java.lang.String r9 = r0.C6C()
            goto L_0x0244
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PPZ.A02(X.PPZ):void");
    }

    private boolean A04(String str) {
        if (0mp.A0B(this.A02) || str == null || !str.toLowerCase(AnonymousClass1Q2.A02()).startsWith(this.A02.toLowerCase(AnonymousClass1Q2.A02()))) {
            return false;
        }
        return true;
    }

    public final String Amq() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.Amq();
        }
        return null;
    }

    public final Object B3J() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.B3J();
        }
        return null;
    }

    public final boolean BBY() {
        C336267eL r0 = this.A00;
        if (r0 == null || !r0.BBY()) {
            return false;
        }
        return true;
    }

    public final String BiY() {
        return this.A02;
    }

    public final String BjE() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.BjE();
        }
        return null;
    }

    public final Integer BlQ() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.BlQ();
        }
        return null;
    }

    public final String BnF() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.BnF();
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object Bo1() {
        return this.A0B;
    }

    public final List Bqo() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.Bqo();
        }
        return null;
    }

    public final boolean CT5() {
        C336267eL r0 = this.A00;
        if (r0 == null || !r0.CT5()) {
            return false;
        }
        return true;
    }

    public final boolean CWX() {
        OLO olo;
        C336267eL r0 = this.A00;
        if (r0 == null || !r0.CWX() || (olo = this.A07) == null) {
            return false;
        }
        Boolean bool = (Boolean) olo.A00.A0X();
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean CYL() {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            return r0.CYL();
        }
        return false;
    }

    public final void EJE() {
        this.A07.A03.A01(new C72605PCk(this.A02));
        C336267eL r0 = this.A00;
        if (r0 != null) {
            r0.EJE();
        }
    }

    public final void ERO(List list) {
        C336267eL r0 = this.A00;
        if (r0 != null) {
            r0.ERO(list);
        }
    }

    public final void EcJ(C337237fw r2) {
        if (this.A01 != r2) {
            this.A01 = r2;
        }
    }

    public final void EhX(String str) {
        if (str == null) {
            str = "";
        }
        this.A02 = str;
        this.A07.A03.A01(new C72605PCk(str));
        C336267eL r1 = this.A00;
        if (r1 != null) {
            r1.EhX(this.A02);
        }
    }

    public final boolean isLoading() {
        Boolean bool = (Boolean) this.A07.A00.A0X();
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        C336267eL r0 = this.A00;
        if (r0 == null || !r0.isLoading()) {
            return false;
        }
        return true;
    }

    public PPZ(UserSession userSession, C336267eL r7, boolean z, boolean z2, boolean z3) {
        1aU A012;
        this.A0O = userSession;
        this.A0A = 17h.A00(userSession);
        this.A0H = z2;
        this.A08 = (C71842Orj) userSession.A01(C71842Orj.class, C73913Plo.A00(userSession, 14));
        this.A0I = z;
        0Tu r2 = 0Tu.A05;
        this.A0K = 182.A06(r2, userSession, 36319411686088074L);
        this.A04 = 182.A01(r2, userSession, 36600886662860845L);
        this.A05 = 182.A01(r2, userSession, 36600886662926382L);
        this.A0L = AnonymousClass7TF.A0Y(r2, userSession, 36595328975112311L).intValue();
        this.A0J = 182.A06(r2, userSession, 36313853998532874L);
        this.A0G = 182.A06(r2, userSession, 36313853998729483L);
        boolean A062 = 182.A06(r2, userSession, 2342156064350996112L);
        this.A06 = AnonymousClass7BY.A00(userSession);
        this.A00 = r7;
        1aU A063 = 1aU.A06(new C72122Owh(this, 10));
        OLO olo = new OLO(MYc.A01(userSession, "MsysSearchResultProvider"));
        this.A07 = olo;
        olo.A00();
        this.A09 = 1bJ.A00(userSession);
        if (A062) {
            C74480Pva A002 = C67252Mkm.A00(userSession);
            this.A03 = A002;
            A002.start();
            this.A03.CgG();
            if (z3) {
                this.A00 = null;
                A012 = 1aU.A01(new OuU((Object) this, 4), olo.A03.A01.A0L(C72099OwC.A00), this.A03.ANW());
            } else {
                A012 = 1aU.A03(new C71996OuW(this), A063, olo.A03.A01.A0L(C72099OwC.A00), this.A03.ANW());
            }
        } else {
            A012 = 1aU.A01(new OuU((Object) this, 5), A063, olo.A03.A01.A0L(C72099OwC.A00));
        }
        this.A0M = A012;
        1a8 A0O2 = C66580MXl.A0O();
        this.A0N = A0O2;
        PU7.A00(A012, A0O2, this, 4);
    }
}
