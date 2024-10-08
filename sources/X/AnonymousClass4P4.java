package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4P4  reason: invalid class name */
public final class AnonymousClass4P4 {
    public static final AnonymousClass4P6[] A0c = {AnonymousClass4P6.A02, AnonymousClass4P6.A05, AnonymousClass4P6.A06};
    public float A00 = 1.0f;
    public C264114Oq A01;
    public AnonymousClass4OI A02;
    public ServiceEventCallbackImpl A03;
    public C290485fO A04;
    public AnonymousClass4S8 A05;
    public AnonymousClass4SF A06;
    public AnonymousClass4PE A07;
    public AnonymousClass4PG A08;
    public C264474Qa A09;
    public AnonymousClass4R5 A0A;
    public AnonymousClass4P7 A0B = AnonymousClass4P7.A03;
    public C265164Su A0C;
    public C256633w6 A0D;
    public C264614Qo A0E;
    public boolean A0F = false;
    public AnonymousClass4PL[] A0G;
    public 29t A0H;
    public C257163wx A0I;
    public C264184Ox A0J;
    public AtomicReference A0K;
    public final Context A0L;
    public final Handler A0M;
    public final C264004Oe A0N;
    public final AnonymousClass4OS A0O;
    public final AnonymousClass4P8 A0P;
    public final HeroPlayerSetting A0Q;
    public final List A0R = new CopyOnWriteArrayList();
    public final C264124Or A0S;
    public final 28T A0T;
    public final C290435fJ A0U;
    public final C290445fK A0V;
    public final 1xV A0W;
    public final AnonymousClass4P6 A0X;
    public final Map A0Y;
    public final AtomicBoolean A0Z;
    public final AtomicBoolean A0a;
    public final AtomicBoolean A0b;

    public final boolean A0C(C256633w6 r3) {
        return r3 != null && r3.A0Q.size() > 0 && !r3.A02(0).A03.isEmpty() && !((C256773wK) r3.A02(0).A03.get(0)).A05.isEmpty();
    }

    public static String A00(C256633w6 r6) {
        C256793wM A022;
        List<C256773wK> list;
        String str;
        if (r6 == null || r6.A0Q.size() < 1 || (A022 = r6.A02(0)) == null || (list = A022.A03) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C256773wK r2 : list) {
            if (r2.A01 == 3) {
                arrayList.add(r2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list2 = ((C256773wK) it.next()).A07;
            if (list2 != null && !list2.isEmpty()) {
                arrayList2.add(list2.get(0));
            }
        }
        if (arrayList2.size() != 1 || (str = ((C256733wG) arrayList2.get(0)).A02.A0V) == null) {
            return null;
        }
        return str;
    }

    private void A01() {
        AnonymousClass4OI r0 = this.A02;
        if (r0 != null && !r0.A0M.isEmpty()) {
            for (2D2 r2 : this.A02.A0M) {
                if (r2.A01 == 2Cz.A0I) {
                    2CY.A01(r2);
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.4R2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.5Mu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: X.4R2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: X.4R2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: X.4R2} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, X.4Qj, X.4Qi] */
    /* JADX WARNING: type inference failed for: r8v2, types: [X.4Qk, java.lang.Object, X.4Qj] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.4Ql, X.4Qm, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c8, code lost:
        if (r1.A10.A0G != false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01f1, code lost:
        if (r9.A09 != false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x025f, code lost:
        if (r6.A0R != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x031f, code lost:
        if (r3.A0R != false) goto L_0x0321;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        if (r5.A0v != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        if (r3.A0V == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e5, code lost:
        if (r3.A0G == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0161, code lost:
        if (r0.A0C(r0.A0D) != false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r6.A0T == false) goto L_0x0029;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0196 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A02(X.AnonymousClass4OI r40, X.AnonymousClass4P4 r41, boolean r42) {
        /*
            r0 = r41
            monitor-enter(r0)
            r2 = 0
            X.4PE r6 = r0.A07     // Catch:{ all -> 0x0372 }
            X.1xV r5 = r0.A0W     // Catch:{ all -> 0x0372 }
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.A0b     // Catch:{ all -> 0x0372 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.A0Z     // Catch:{ all -> 0x0372 }
            r9 = r40
            boolean r1 = r9.A0T     // Catch:{ all -> 0x0372 }
            r11 = r4
            r12 = r3
            r13 = r1
            r8 = r6
            r10 = r5
            X.4QZ r3 = r8.BNX(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0372 }
            X.4Qa r1 = new X.4Qa     // Catch:{ all -> 0x0372 }
            r1.<init>(r3)     // Catch:{ all -> 0x0372 }
            r0.A09 = r1     // Catch:{ all -> 0x0372 }
            X.3w6 r6 = r0.A0D     // Catch:{ all -> 0x0372 }
            if (r6 == 0) goto L_0x0029
            boolean r1 = r6.A0T     // Catch:{ all -> 0x0372 }
            r15 = 1
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r15 = 0
        L_0x002a:
            X.4Qb r12 = X.C264484Qb.A0H     // Catch:{ all -> 0x0372 }
            X.4PG r14 = r0.A08     // Catch:{ all -> 0x0372 }
            r7 = 0
            X.4OS r8 = r14.A07     // Catch:{ all -> 0x0372 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r5 = r14.A0F     // Catch:{ all -> 0x0372 }
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r4 = r14.A0A     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r9.A07     // Catch:{ all -> 0x0372 }
            r18 = r4
            r19 = r5
            r20 = r1
            r21 = r2
            r16 = r9
            r17 = r8
            X.5fb r3 = X.C264524Qf.A00(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0372 }
            r11 = 1
            java.lang.String r1 = r9.A07     // Catch:{ all -> 0x0372 }
            r20 = r1
            r21 = r11
            X.5fb r5 = X.C264524Qf.A00(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0372 }
            X.4PE r4 = r14.A0C     // Catch:{ all -> 0x0372 }
            X.28w r13 = r4.CDw(r3, r9, r6)     // Catch:{ all -> 0x0372 }
            X.5fL r6 = r4.BOh(r9)     // Catch:{ all -> 0x0372 }
            X.28m r3 = r13.A01     // Catch:{ all -> 0x0372 }
            X.4Qh r1 = r4.BD1(r6, r9)     // Catch:{ all -> 0x0372 }
            X.4Qi r10 = new X.4Qi     // Catch:{ all -> 0x0372 }
            r10.<init>()     // Catch:{ all -> 0x0372 }
            r10.A02 = r3     // Catch:{ all -> 0x0372 }
            r10.A00 = r6     // Catch:{ all -> 0x0372 }
            r10.A01 = r1     // Catch:{ all -> 0x0372 }
            X.4Qk r8 = new X.4Qk     // Catch:{ all -> 0x0372 }
            r8.<init>()     // Catch:{ all -> 0x0372 }
            r8.A01 = r3     // Catch:{ all -> 0x0372 }
            r8.A00 = r6     // Catch:{ all -> 0x0372 }
            java.util.Map r6 = r14.A0G     // Catch:{ all -> 0x0372 }
            X.28w r5 = r4.AdZ(r5, r9)     // Catch:{ all -> 0x0372 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r4 = r14.A0F     // Catch:{ all -> 0x0372 }
            X.4Ox r1 = r14.A08     // Catch:{ all -> 0x0372 }
            X.4Ql r3 = new X.4Ql     // Catch:{ all -> 0x0372 }
            r3.<init>()     // Catch:{ all -> 0x0372 }
            r3.A06 = r6     // Catch:{ all -> 0x0372 }
            r3.A03 = r13     // Catch:{ all -> 0x0372 }
            r3.A02 = r5     // Catch:{ all -> 0x0372 }
            r3.A01 = r10     // Catch:{ all -> 0x0372 }
            r3.A00 = r8     // Catch:{ all -> 0x0372 }
            r3.A05 = r4     // Catch:{ all -> 0x0372 }
            r3.A04 = r1     // Catch:{ all -> 0x0372 }
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r1 = r0.A0Q     // Catch:{ all -> 0x0372 }
            boolean r5 = r1.A2Y     // Catch:{ all -> 0x0372 }
            X.4Qn r10 = new X.4Qn     // Catch:{ all -> 0x0372 }
            r10.<init>(r3, r12)     // Catch:{ all -> 0x0372 }
            X.4Qb r3 = r10.A04()     // Catch:{ all -> 0x0372 }
            X.4Qd r8 = new X.4Qd     // Catch:{ all -> 0x0372 }
            r8.<init>(r3)     // Catch:{ all -> 0x0372 }
            X.3uU r4 = r9.A0K     // Catch:{ all -> 0x0372 }
            boolean r17 = r4.A03()     // Catch:{ all -> 0x0372 }
            if (r17 != 0) goto L_0x00b8
            X.1xk r3 = r1.A0w     // Catch:{ all -> 0x0372 }
            boolean r3 = r3.A0z     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x00b8
            android.content.Context r3 = r0.A0L     // Catch:{ all -> 0x0372 }
            r8.A0A(r3)     // Catch:{ all -> 0x0372 }
        L_0x00b8:
            r8.A0A = r5     // Catch:{ all -> 0x0372 }
            X.1xk r5 = r1.A0w     // Catch:{ all -> 0x0372 }
            boolean r3 = r5.A0r     // Catch:{ all -> 0x0372 }
            if (r3 != 0) goto L_0x00c9
            boolean r3 = r5.A0t     // Catch:{ all -> 0x0372 }
            if (r3 != 0) goto L_0x00c9
            boolean r5 = r5.A0v     // Catch:{ all -> 0x0372 }
            r3 = 0
            if (r5 == 0) goto L_0x00ca
        L_0x00c9:
            r3 = 1
        L_0x00ca:
            r8.A04 = r3     // Catch:{ all -> 0x0372 }
            r8.A0P = r11     // Catch:{ all -> 0x0372 }
            if (r15 == 0) goto L_0x00e9
            r8.A02 = r11     // Catch:{ all -> 0x0372 }
            r8.A06 = r11     // Catch:{ all -> 0x0372 }
            X.1xH r3 = r1.A01     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x00dd
            boolean r6 = r3.A0V     // Catch:{ all -> 0x0372 }
            r5 = 1
            if (r6 != 0) goto L_0x00de
        L_0x00dd:
            r5 = 0
        L_0x00de:
            r8.A05 = r5     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x00e7
            boolean r6 = r3.A0G     // Catch:{ all -> 0x0372 }
            r5 = 1
            if (r6 != 0) goto L_0x00f3
        L_0x00e7:
            r5 = 0
            goto L_0x00f3
        L_0x00e9:
            X.1xH r3 = r1.A01     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x00f5
            boolean r5 = r3.A0U     // Catch:{ all -> 0x0372 }
            r8.A05 = r5     // Catch:{ all -> 0x0372 }
            boolean r5 = r3.A0F     // Catch:{ all -> 0x0372 }
        L_0x00f3:
            r8.A01 = r5     // Catch:{ all -> 0x0372 }
        L_0x00f5:
            boolean r5 = r1.A26     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x014d
            X.3w6 r5 = r0.A0D     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x014d
            java.util.List r6 = r5.A0Q     // Catch:{ all -> 0x0372 }
            int r5 = r6.size()     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x014d
            java.lang.Object r5 = r6.get(r2)     // Catch:{ all -> 0x0372 }
            X.3wM r5 = (X.C256793wM) r5     // Catch:{ all -> 0x0372 }
            java.util.List r5 = r5.A03     // Catch:{ all -> 0x0372 }
            java.util.Iterator r12 = r5.iterator()     // Catch:{ all -> 0x0372 }
            r6 = 0
        L_0x0112:
            boolean r5 = r12.hasNext()     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x0125
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x0372 }
            X.3wK r5 = (X.C256773wK) r5     // Catch:{ all -> 0x0372 }
            int r5 = r5.A01     // Catch:{ all -> 0x0372 }
            if (r5 != r11) goto L_0x0112
            int r6 = r6 + 1
            goto L_0x0112
        L_0x0125:
            if (r6 <= r11) goto L_0x014d
            X.2Bk r6 = X.C69822Bk.A02     // Catch:{ all -> 0x0372 }
            monitor-enter(r6)     // Catch:{ all -> 0x0372 }
            X.0sa r5 = X.C69822Bk.A00     // Catch:{ all -> 0x02a0 }
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x02a0 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x02a0 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x02a0 }
            monitor-exit(r6)     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x013a
            goto L_0x014b
        L_0x013a:
            monitor-enter(r6)     // Catch:{ all -> 0x0372 }
            X.0sa r5 = X.C69822Bk.A01     // Catch:{ all -> 0x02a0 }
            java.lang.Object r5 = r5.invoke()     // Catch:{ all -> 0x02a0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x02a0 }
            monitor-exit(r6)     // Catch:{ all -> 0x0372 }
            r8.A07(r5)     // Catch:{ all -> 0x0372 }
            r8.A08(r5)     // Catch:{ all -> 0x0372 }
            goto L_0x014d
        L_0x014b:
            r8.A0B = r2     // Catch:{ all -> 0x0372 }
        L_0x014d:
            int r6 = r9.A00     // Catch:{ all -> 0x0372 }
            r12 = 3
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r12)     // Catch:{ all -> 0x0372 }
            r16 = r5[r6]     // Catch:{ all -> 0x0372 }
            android.net.Uri r5 = r4.A04     // Catch:{ all -> 0x0372 }
            if (r5 != 0) goto L_0x0163
            X.3w6 r5 = r0.A0D     // Catch:{ all -> 0x0372 }
            boolean r5 = r0.A0C(r5)     // Catch:{ all -> 0x0372 }
            r15 = 0
            if (r5 == 0) goto L_0x0164
        L_0x0163:
            r15 = 1
        L_0x0164:
            boolean r5 = r1.A2S     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x019c
            java.util.List r13 = r4.A0H     // Catch:{ all -> 0x0372 }
            if (r13 == 0) goto L_0x019c
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x0372 }
        L_0x0170:
            boolean r5 = r14.hasNext()     // Catch:{ all -> 0x0372 }
            r15 = 1
            if (r5 == 0) goto L_0x0196
            java.lang.Object r6 = r14.next()     // Catch:{ all -> 0x0372 }
            com.facebook.video.heroplayer.ipc.SubtitleConfiguration r6 = (com.facebook.video.heroplayer.ipc.SubtitleConfiguration) r6     // Catch:{ all -> 0x0372 }
            boolean r5 = r6.A02     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x0170
            java.lang.String r6 = r6.A01     // Catch:{ all -> 0x0372 }
            r5 = 0
            if (r6 != 0) goto L_0x0187
            r5 = 1
        L_0x0187:
            r8.A0P = r5     // Catch:{ all -> 0x0372 }
            if (r6 != 0) goto L_0x018e
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0372 }
            goto L_0x0192
        L_0x018e:
            java.lang.String[] r5 = new java.lang.String[]{r6}     // Catch:{ all -> 0x0372 }
        L_0x0192:
            r8.A06(r5)     // Catch:{ all -> 0x0372 }
            goto L_0x019c
        L_0x0196:
            boolean r5 = r13.isEmpty()     // Catch:{ all -> 0x0372 }
            r15 = r5 ^ 1
        L_0x019c:
            r6 = 2
            if (r15 != 0) goto L_0x01a2
            r8.A09(r6, r11)     // Catch:{ all -> 0x0372 }
        L_0x01a2:
            r8.A09(r12, r11)     // Catch:{ all -> 0x0372 }
            int r5 = r16.intValue()     // Catch:{ all -> 0x0372 }
            if (r5 == r6) goto L_0x01ae
            if (r5 != r11) goto L_0x01b8
            goto L_0x01b2
        L_0x01ae:
            r8.A09(r11, r11)     // Catch:{ all -> 0x0372 }
            goto L_0x01b8
        L_0x01b2:
            r8.A09(r2, r11)     // Catch:{ all -> 0x0372 }
            r8.A09(r6, r11)     // Catch:{ all -> 0x0372 }
        L_0x01b8:
            r10.A05(r8)     // Catch:{ all -> 0x0372 }
            r0.A0E = r10     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x01cc
            boolean r5 = r3.A0M     // Catch:{ all -> 0x0372 }
            if (r5 != 0) goto L_0x01ca
            X.1yD r5 = r1.A10     // Catch:{ all -> 0x0372 }
            boolean r5 = r5.A0G     // Catch:{ all -> 0x0372 }
            r8 = 0
            if (r5 == 0) goto L_0x01d1
        L_0x01ca:
            r8 = 1
            goto L_0x01d1
        L_0x01cc:
            r8 = 0
            r16 = 1
            r5 = 0
            goto L_0x01db
        L_0x01d1:
            int r5 = r3.A01     // Catch:{ all -> 0x0372 }
            if (r5 != 0) goto L_0x01e6
            int r5 = r1.A0U     // Catch:{ all -> 0x0372 }
        L_0x01d7:
            boolean r6 = r3.A0h     // Catch:{ all -> 0x0372 }
            r16 = r6
        L_0x01db:
            boolean r6 = r1.A2d     // Catch:{ all -> 0x0372 }
            if (r6 == 0) goto L_0x01ea
            boolean r6 = r9.A0P     // Catch:{ all -> 0x0372 }
            r38 = 1
            if (r6 == 0) goto L_0x01ec
            goto L_0x01ea
        L_0x01e6:
            if (r5 > 0) goto L_0x01d7
            r5 = -1
            goto L_0x01d7
        L_0x01ea:
            r38 = 0
        L_0x01ec:
            if (r8 != 0) goto L_0x01f3
            boolean r8 = r9.A09     // Catch:{ all -> 0x0372 }
            r6 = 0
            if (r8 == 0) goto L_0x01f4
        L_0x01f3:
            r6 = 1
        L_0x01f4:
            r0.A0F = r6     // Catch:{ all -> 0x0372 }
            if (r17 == 0) goto L_0x01fd
            r14 = 0
        L_0x01fa:
            if (r6 == 0) goto L_0x02db
            goto L_0x0200
        L_0x01fd:
            long r14 = r1.A0j     // Catch:{ all -> 0x0372 }
            goto L_0x01fa
        L_0x0200:
            java.lang.String r8 = "Leveraging ExoPlayerImpl v2 (2.18.6)"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0372 }
            X.28J.A03(r8, r6)     // Catch:{ all -> 0x0372 }
            android.content.Context r6 = r0.A0L     // Catch:{ all -> 0x0372 }
            r41 = r6
            X.5Mk r12 = new X.5Mk     // Catch:{ all -> 0x0372 }
            r12.<init>(r0)     // Catch:{ all -> 0x0372 }
            X.4Sk r11 = X.C265064Sk.A00     // Catch:{ all -> 0x0372 }
            X.4Qo r10 = r0.A0E     // Catch:{ all -> 0x0372 }
            X.4Qa r9 = r0.A09     // Catch:{ all -> 0x0372 }
            X.4PE r6 = r0.A07     // Catch:{ all -> 0x0372 }
            X.28m r8 = r6.Af6()     // Catch:{ all -> 0x0372 }
            X.4RR r6 = X.AnonymousClass4RR.A00     // Catch:{ all -> 0x0372 }
            X.5Mm r13 = new X.5Mm     // Catch:{ all -> 0x0372 }
            r13.<init>(r12)     // Catch:{ all -> 0x0372 }
            X.5Mn r12 = new X.5Mn     // Catch:{ all -> 0x0372 }
            r12.<init>(r11)     // Catch:{ all -> 0x0372 }
            X.5Mo r11 = new X.5Mo     // Catch:{ all -> 0x0372 }
            r11.<init>(r10)     // Catch:{ all -> 0x0372 }
            X.5Mp r10 = new X.5Mp     // Catch:{ all -> 0x0372 }
            r10.<init>(r9)     // Catch:{ all -> 0x0372 }
            X.5Mq r9 = new X.5Mq     // Catch:{ all -> 0x0372 }
            r9.<init>(r8)     // Catch:{ all -> 0x0372 }
            X.5Mr r8 = new X.5Mr     // Catch:{ all -> 0x0372 }
            r8.<init>(r6)     // Catch:{ all -> 0x0372 }
            r41.getClass()     // Catch:{ all -> 0x0372 }
            android.os.Looper r17 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0372 }
            if (r17 != 0) goto L_0x0249
            android.os.Looper r17 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0372 }
        L_0x0249:
            X.4QB r21 = X.AnonymousClass4QB.A02     // Catch:{ all -> 0x0372 }
            r30 = 0
            X.4P6 r20 = X.AnonymousClass4P6.A03     // Catch:{ all -> 0x0372 }
            X.5Ms r19 = X.C284495Ms.A00     // Catch:{ all -> 0x0372 }
            X.27w r22 = X.C697227w.A00     // Catch:{ all -> 0x0372 }
            boolean r6 = r1.A3K     // Catch:{ all -> 0x0372 }
            r24 = r6
            X.3w6 r6 = r0.A0D     // Catch:{ all -> 0x0372 }
            if (r6 == 0) goto L_0x0261
            boolean r6 = r6.A0R     // Catch:{ all -> 0x0372 }
            r36 = 0
            if (r6 == 0) goto L_0x0263
        L_0x0261:
            r36 = 1
        L_0x0263:
            boolean r6 = r1.A1o     // Catch:{ all -> 0x0372 }
            r23 = r6
            boolean r6 = r1.A2w     // Catch:{ all -> 0x0372 }
            boolean r1 = r1.A2a     // Catch:{ all -> 0x0372 }
            r0.A01()     // Catch:{ all -> 0x0372 }
            X.4R1 r18 = new X.4R1     // Catch:{ all -> 0x0372 }
            r31 = r18
            r32 = r5
            r33 = r14
            r35 = r24
            r37 = r23
            r39 = r6
            r40 = r1
            r31.<init>(r32, r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0372 }
            boolean r1 = r3.A09     // Catch:{ all -> 0x0372 }
            if (r1 != 0) goto L_0x028a
            X.SwF r19 = new X.SwF     // Catch:{ all -> 0x0372 }
            r19.<init>()     // Catch:{ all -> 0x0372 }
        L_0x028a:
            boolean r1 = r3.A0g     // Catch:{ all -> 0x0372 }
            if (r1 == 0) goto L_0x0290
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0290:
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0372 }
            if (r1 != 0) goto L_0x02a3
            java.util.concurrent.atomic.AtomicReference r1 = X.2CY.A0G     // Catch:{ all -> 0x0372 }
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x0372 }
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            goto L_0x02a2
        L_0x02a0:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0372 }
        L_0x02a2:
            throw r1     // Catch:{ all -> 0x0372 }
        L_0x02a3:
            java.lang.String r1 = "playerId="
            X.4OS r5 = r0.A0O     // Catch:{ all -> 0x0372 }
            long r5 = r5.A0q     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = X.002.A0Q(r1, r5)     // Catch:{ all -> 0x0372 }
            java.lang.String r5 = r4.A0G     // Catch:{ all -> 0x0372 }
            if (r5 == 0) goto L_0x02b7
            java.lang.String r4 = "::videoId="
            java.lang.String r1 = X.002.A0g(r1, r4, r5)     // Catch:{ all -> 0x0372 }
        L_0x02b7:
            X.5Mu r15 = new X.5Mu     // Catch:{ all -> 0x0372 }
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r12
            r27 = r13
            r28 = r11
            r29 = r1
            r31 = r16
            r16 = r41
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0372 }
            r0.A0A = r15     // Catch:{ all -> 0x0372 }
            boolean r1 = r3.A0C     // Catch:{ all -> 0x0372 }
            if (r1 == 0) goto L_0x0349
            r15.A0H = r2     // Catch:{ all -> 0x0372 }
            X.5N4 r1 = r15.A0h     // Catch:{ all -> 0x0372 }
            r1.A02 = r2     // Catch:{ all -> 0x0372 }
            goto L_0x0349
        L_0x02db:
            java.lang.String r4 = "Leveraging ExoPlayerImpl v1"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0372 }
            X.28J.A03(r4, r3)     // Catch:{ all -> 0x0372 }
            android.content.Context r3 = r0.A0L     // Catch:{ all -> 0x0372 }
            X.4Qv r8 = new X.4Qv     // Catch:{ all -> 0x0372 }
            r8.<init>(r3)     // Catch:{ all -> 0x0372 }
            r3.getClass()     // Catch:{ all -> 0x0372 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0372 }
            if (r3 != 0) goto L_0x02f5
            android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0372 }
        L_0x02f5:
            X.27w r7 = X.C697227w.A00     // Catch:{ all -> 0x0372 }
            X.4Qw r3 = new X.4Qw     // Catch:{ all -> 0x0372 }
            r3.<init>(r0)     // Catch:{ all -> 0x0372 }
            X.4Qy r10 = new X.4Qy     // Catch:{ all -> 0x0372 }
            r10.<init>(r3)     // Catch:{ all -> 0x0372 }
            X.4Qo r3 = r0.A0E     // Catch:{ all -> 0x0372 }
            r3.getClass()     // Catch:{ all -> 0x0372 }
            X.4Qz r11 = new X.4Qz     // Catch:{ all -> 0x0372 }
            r11.<init>(r3)     // Catch:{ all -> 0x0372 }
            X.4Qa r3 = r0.A09     // Catch:{ all -> 0x0372 }
            r3.getClass()     // Catch:{ all -> 0x0372 }
            X.4R0 r9 = new X.4R0     // Catch:{ all -> 0x0372 }
            r9.<init>(r3)     // Catch:{ all -> 0x0372 }
            boolean r6 = r1.A3K     // Catch:{ all -> 0x0372 }
            X.3w6 r3 = r0.A0D     // Catch:{ all -> 0x0372 }
            if (r3 == 0) goto L_0x0321
            boolean r3 = r3.A0R     // Catch:{ all -> 0x0372 }
            r36 = 0
            if (r3 == 0) goto L_0x0323
        L_0x0321:
            r36 = 1
        L_0x0323:
            boolean r5 = r1.A1o     // Catch:{ all -> 0x0372 }
            int r4 = r1.A0U     // Catch:{ all -> 0x0372 }
            boolean r3 = r1.A2w     // Catch:{ all -> 0x0372 }
            boolean r1 = r1.A2a     // Catch:{ all -> 0x0372 }
            r0.A01()     // Catch:{ all -> 0x0372 }
            X.4R1 r31 = new X.4R1     // Catch:{ all -> 0x0372 }
            r32 = r4
            r33 = r14
            r35 = r6
            r37 = r5
            r39 = r3
            r40 = r1
            r31.<init>(r32, r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0372 }
            X.4R2 r15 = new X.4R2     // Catch:{ all -> 0x0372 }
            r6 = r31
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0372 }
            r0.A0A = r15     // Catch:{ all -> 0x0372 }
        L_0x0349:
            if (r42 == 0) goto L_0x0350
            X.4SF r1 = r0.A06     // Catch:{ all -> 0x0372 }
            r15.A8z(r1)     // Catch:{ all -> 0x0372 }
        L_0x0350:
            X.4S8 r1 = new X.4S8     // Catch:{ all -> 0x0372 }
            r1.<init>()     // Catch:{ all -> 0x0372 }
            r0.A05 = r1     // Catch:{ all -> 0x0372 }
            X.4R5 r3 = r0.A0A     // Catch:{ all -> 0x0372 }
            X.4PL[] r1 = r0.A0G     // Catch:{ all -> 0x0372 }
            r1 = r1[r2]     // Catch:{ all -> 0x0372 }
            X.4SA r2 = r3.AMN(r1)     // Catch:{ all -> 0x0372 }
            r1 = 7
            r2.A01(r1)     // Catch:{ all -> 0x0372 }
            X.4SB r1 = new X.4SB     // Catch:{ all -> 0x0372 }
            r1.<init>(r0)     // Catch:{ all -> 0x0372 }
            r2.A02(r1)     // Catch:{ all -> 0x0372 }
            r2.A00()     // Catch:{ all -> 0x0372 }
            monitor-exit(r0)
            return
        L_0x0372:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P4.A02(X.4OI, X.4P4, boolean):void");
    }

    public static void A03(AnonymousClass4P4 r6) {
        long AzG = r6.A0A.AzG() - 2000;
        if (AzG > r6.A0A.AzG()) {
            AzG = r6.A0A.AzG() / 2;
        }
        AnonymousClass4SA AMN = r6.A0A.AMN(new C265354Tn(r6));
        C256703wD.A04(!AMN.A07);
        AMN.A02 = AzG;
        AMN.A00();
    }

    public static boolean A04(AnonymousClass4P4 r2) {
        AnonymousClass4OI r22;
        if (!r2.A0Q.A39 || (r22 = r2.A02) == null) {
            return false;
        }
        if (r22.A0F == -1 && r22.A0E == -1) {
            return false;
        }
        return true;
    }

    public final int A05(int i) {
        if (this.A0E.A04().A01.get(i)) {
            return -1;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7.A0E != -1) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r12 = this;
            X.4Su r0 = r12.A0C
            if (r0 == 0) goto L_0x0045
            X.4OI r0 = r12.A02
            java.util.List r0 = r0.A0N
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x001c
            X.4R5 r2 = r12.A0A
            X.4OI r0 = r12.A02
            java.util.List r1 = r0.A0N
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.Eq9(r0)
        L_0x001c:
            X.4OI r7 = r12.A02
            int r6 = r7.A0F
            r5 = -1
            if (r6 != r5) goto L_0x0028
            int r1 = r7.A0E
            r0 = 0
            if (r1 == r5) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004f
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r6 == r5) goto L_0x004c
            long r8 = (long) r6
            long r8 = r8 * r1
        L_0x0033:
            int r0 = r7.A0E
            if (r0 == r5) goto L_0x0046
            long r10 = (long) r0
            long r10 = r10 * r1
        L_0x0039:
            X.4R5 r0 = r12.A0A
            X.4Su r7 = r12.A0C
            X.5EH r6 = new X.5EH
            r6.<init>(r7, r8, r10)
        L_0x0042:
            r0.E3q(r6, r3, r4)
        L_0x0045:
            return
        L_0x0046:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0039
        L_0x004c:
            r8 = 0
            goto L_0x0033
        L_0x004f:
            X.4R5 r0 = r12.A0A
            X.4Su r6 = r12.A0C
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P4.A06():void");
    }

    public final void A07(int i, int i2) {
        C264504Qd r2 = new C264504Qd(this.A0E.A04());
        boolean z = false;
        if (i2 == -1) {
            z = true;
        }
        r2.A09(i, z);
        this.A0E.A05(r2);
    }

    public final void A08(long j) {
        AnonymousClass4OI r0 = this.A02;
        if (r0 != null && r0.A0K.A02()) {
            this.A0A.EjX(AnonymousClass4P6.A06);
        }
        if (!this.A0Q.A2k || A04(this)) {
            this.A0A.ADy(j);
        } else {
            this.A0A.EL1(j);
        }
    }

    public final void A09(long j, boolean z) {
        AnonymousClass4R5 r1;
        AnonymousClass4P6 r0;
        AnonymousClass4OI r02 = this.A02;
        if (r02 == null || (!r02.A0K.A02() && (!this.A0Q.A2m || (!2Ob.A00(this.A02.A0K.A0A, "feed_timeline") && !2Ob.A00(this.A02.A0K.A0A, "feed_contextual_chain") && !2Ob.A00(this.A02.A0K.A0A, "feed_contextual_self_profile"))))) {
            r1 = this.A0A;
            if (z) {
                r0 = this.A0X;
            } else {
                r0 = AnonymousClass4P6.A03;
            }
        } else {
            r1 = this.A0A;
            r0 = AnonymousClass4P6.A06;
        }
        r1.EjX(r0);
        if (!this.A0Q.A2k || A04(this)) {
            AnonymousClass4R3 r12 = (AnonymousClass4R3) this.A0A;
            r12.A0J(r12.Auj(), j);
            return;
        }
        this.A0A.EL1(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(android.view.Surface r5, boolean r6) {
        /*
            r4 = this;
            X.4R5 r2 = r4.A0A
            X.4PL[] r1 = r4.A0G
            r0 = 0
            r0 = r1[r0]
            X.4SA r3 = r2.AMN(r0)
            r0 = 1
            r3.A01(r0)
            r3.A02(r5)
            r3.A00()
            if (r6 == 0) goto L_0x0042
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x003b }
            boolean r0 = r3.A07     // Catch:{ all -> 0x0038 }
            X.C256703wD.A04(r0)     // Catch:{ all -> 0x0038 }
            android.os.Looper r0 = r3.A03     // Catch:{ all -> 0x0038 }
            java.lang.Thread r2 = r0.getThread()     // Catch:{ all -> 0x0038 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0038 }
            r0 = 0
            if (r2 == r1) goto L_0x002b
            r0 = 1
        L_0x002b:
            X.C256703wD.A04(r0)     // Catch:{ all -> 0x0038 }
        L_0x002e:
            boolean r0 = r3.A06     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            r3.wait()     // Catch:{ all -> 0x0038 }
            goto L_0x002e
        L_0x0036:
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x003b }
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x003b }
            throw r0     // Catch:{ InterruptedException -> 0x003b }
        L_0x003b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P4.A0A(android.view.Surface, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: X.4PD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.4PD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.4PD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.4PD} */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.Xyj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass4OI r27) {
        /*
            r26 = this;
            r0 = r27
            X.3uU r2 = r0.A0K
            X.3uR r1 = r2.A07
            X.3uR r0 = X.C255623uR.HLS
            r5 = r26
            if (r1 != r0) goto L_0x0041
            android.content.Context r8 = r5.A0L
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r14 = r5.A03
            X.28T r13 = r5.A0T
            X.Xyi r7 = new X.Xyi
            r7.<init>()
        L_0x0017:
            r5.A07 = r7
            java.util.Map r6 = r5.A0Y
            android.os.Handler r4 = r5.A0M
            X.4OS r3 = r5.A0O
            X.5fK r2 = r5.A0V
            X.5fJ r1 = r5.A0U
            X.4Ox r0 = r5.A0J
            X.4PG r15 = new X.4PG
            r16 = r8
            r18 = r13
            r19 = r3
            r20 = r0
            r21 = r14
            r22 = r7
            r23 = r1
            r24 = r2
            r25 = r6
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.A08 = r15
            return
        L_0x0041:
            boolean r0 = r2.A03()
            android.content.Context r8 = r5.A0L
            if (r0 == 0) goto L_0x0070
            java.util.Map r3 = r5.A0Y
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r14 = r5.A03
            X.29t r10 = r5.A0H
            android.os.Handler r9 = r5.A0M
            X.Xyk r2 = new X.Xyk
            r2.<init>(r5)
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0b
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A0a
            X.5fK r15 = r5.A0V
            X.28T r13 = r5.A0T
            X.4Or r12 = r5.A0S
            X.3wx r11 = r5.A0I
            X.Xyj r7 = new X.Xyj
            r17 = r3
            r18 = r1
            r19 = r0
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0017
        L_0x0070:
            java.util.Map r4 = r5.A0Y
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r14 = r5.A03
            X.29t r3 = r5.A0H
            java.util.concurrent.atomic.AtomicBoolean r2 = r5.A0b
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0a
            X.28T r13 = r5.A0T
            X.3wx r0 = r5.A0I
            X.4PD r7 = new X.4PD
            r9 = r7
            r10 = r8
            r11 = r3
            r12 = r0
            r15 = r4
            r16 = r2
            r17 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P4.A0B(X.4OI):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004a, code lost:
        if (r7.A0K.A0L == false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4P4(android.content.Context r11, android.os.Handler r12, X.29t r13, X.C257163wx r14, X.C264124Or r15, X.C264114Oq r16, X.AnonymousClass4OI r17, X.28T r18, X.C264004Oe r19, X.AnonymousClass4OS r20, X.C264184Ox r21, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r22, X.1xV r23, java.util.Map r24, java.util.concurrent.atomic.AtomicBoolean r25, java.util.concurrent.atomic.AtomicBoolean r26, java.util.concurrent.atomic.AtomicBoolean r27, java.util.concurrent.atomic.AtomicReference r28) {
        /*
            r10 = this;
            r10.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r10.A0R = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.A00 = r0
            X.4P7 r0 = X.AnonymousClass4P7.A03
            r10.A0B = r0
            r4 = 0
            r10.A0F = r4
            r2 = r18
            r10.A0T = r2
            r5 = r20
            r10.A0O = r5
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r3 = r2.A06
            r10.A0Q = r3
            r10.A0L = r11
            r10.A0M = r12
            r0 = r28
            r10.A0K = r0
            r10.A0H = r13
            r0 = r24
            r10.A0Y = r0
            r0 = r22
            r10.A03 = r0
            r0 = r16
            r10.A01 = r0
            r10.A0S = r15
            r10.A0I = r14
            r0 = r21
            r10.A0J = r0
            boolean r0 = r3.A2o
            r7 = r17
            if (r0 == 0) goto L_0x004c
            X.3uU r0 = r7.A0K
            boolean r1 = r0.A0L
            r0 = 1
            if (r1 != 0) goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            r9 = 0
            if (r0 == 0) goto L_0x0082
            X.28W r0 = r2.A00
            if (r0 == 0) goto L_0x0082
            X.28X r0 = r0.A01
            X.28a r8 = new X.28a
            r8.<init>(r0)
            X.5fJ r6 = new X.5fJ
            r6.<init>()
            r10.A0U = r6
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r2 = r10.A03
            X.4Of r0 = r5.A0v
            X.5fK r1 = new X.5fK
            r1.<init>(r8, r2, r0, r6)
            r10.A0V = r1
        L_0x006d:
            X.4P8 r0 = new X.4P8
            r0.<init>(r5, r6, r1, r3)
            r10.A0P = r0
            r0 = r25
            r10.A0b = r0
            r0 = r27
            r10.A0a = r0
            r10.A0B(r7)
            r10.A0D = r9
            goto L_0x0089
        L_0x0082:
            r6 = r9
            r10.A0U = r9
            r10.A0V = r9
            r1 = r9
            goto L_0x006d
        L_0x0089:
            X.3uU r0 = r7.A0K     // Catch:{ 2A6 | IOException -> 0x0096 }
            java.lang.String r0 = r0.A09     // Catch:{ 2A6 | IOException -> 0x0096 }
            if (r0 == 0) goto L_0x00b3
            X.3w6 r0 = X.AnonymousClass4PG.A01(r11, r7, r3)     // Catch:{ 2A6 | IOException -> 0x0096 }
            r10.A0D = r0     // Catch:{ 2A6 | IOException -> 0x0096 }
            goto L_0x00b3
        L_0x0096:
            r9 = move-exception
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r8 = r10.A03
            X.3uU r0 = r7.A0K
            java.lang.String r6 = r0.A0G
            java.lang.String r3 = "MANIFEST"
            java.lang.String r2 = "MANIFEST_PARSE_ERROR"
            java.lang.String r1 = "Exception: "
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.4Yy r0 = new X.4Yy
            r0.<init>(r6, r3, r2, r1)
            r8.callback(r0)
        L_0x00b3:
            X.4PG r1 = r10.A08
            X.3w6 r0 = r10.A0D
            X.4PL[] r0 = r1.A05(r7, r5, r0)
            r10.A0G = r0
            r0 = r23
            r10.A0W = r0
            r0 = r26
            r10.A0Z = r0
            r0 = r19
            r10.A0N = r0
            A02(r7, r10, r4)
            r3 = 2000000(0x1e8480, double:9.881313E-318)
            r1 = 0
            X.4P6 r0 = new X.4P6
            r0.<init>(r3, r1)
            r10.A0X = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P4.<init>(android.content.Context, android.os.Handler, X.29t, X.3wx, X.4Or, X.4Oq, X.4OI, X.28T, X.4Oe, X.4OS, X.4Ox, com.facebook.video.heroplayer.service.ServiceEventCallbackImpl, X.1xV, java.util.Map, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicReference):void");
    }
}
