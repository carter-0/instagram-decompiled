package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.ProfileMediaTabFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.71N  reason: invalid class name */
public final class AnonymousClass71N extends AnonymousClass71O implements C231292rN, AnonymousClass71P {
    public final Context A00;
    public final 2ZX A01;
    public final AnonymousClass2s2 A02;
    public final AnonymousClass2s2 A03;
    public final UserSession A04;
    public final AnonymousClass71R A05;
    public final AnonymousClass71V A06;
    public final C232542tt A07;
    public final AnonymousClass71Z A08;
    public final AnonymousClass71W A09;
    public final C48247EbS A0A;
    public final C294255m9 A0B;
    public final ProfileMediaTabFragment A0C;
    public final C322616w8 A0D;
    public final C322776wO A0E;
    public final AnonymousClass71T A0F;
    public final C229122ms A0G;
    public final C231762sK A0H;
    public final Map A0I;
    public final AnonymousClass71U A0J;
    public final C15234UWt A0K;
    public final Map A0L = new HashMap();
    public final Map A0M;
    public final AtomicBoolean A0N;

    /* JADX WARNING: type inference failed for: r13v1, types: [X.2s0, java.lang.Object, X.71V] */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.2s0, X.2s2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x009e, code lost:
        if (X.C321616uT.A00(r15) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass71N(android.content.Context r22, X.2ZX r23, X.AnonymousClass0iw r24, com.instagram.common.session.UserSession r25, X.C267644bx r26, X.AnonymousClass32J r27, X.AnonymousClass726 r28, X.AnonymousClass57M r29, X.C322706wH r30, X.C48247EbS r31, X.C294255m9 r32, com.instagram.profile.fragment.ProfileMediaTabFragment r33, X.C15234UWt r34, X.C322616w8 r35, X.C322776wO r36, X.AnonymousClass32Q r37, X.C229122ms r38, X.C267614bu r39, java.lang.Boolean r40, java.lang.String r41) {
        /*
            r21 = this;
            r5 = 1
            r0 = 4
            r15 = r25
            X.0qQ.A0B(r15, r0)
            r0 = 5
            r7 = r37
            X.0qQ.A0B(r7, r0)
            r0 = 7
            r1 = r38
            X.0qQ.A0B(r1, r0)
            r0 = 8
            r3 = r30
            X.0qQ.A0B(r3, r0)
            r0 = 9
            r6 = r32
            X.0qQ.A0B(r6, r0)
            r0 = 11
            r8 = r35
            X.0qQ.A0B(r8, r0)
            X.71Q r2 = new X.71Q
            r2.<init>(r6)
            X.2lZ r0 = new X.2lZ
            r14 = r24
            r4 = r22
            r0.<init>(r4, r14, r15, r2)
            r2 = r21
            r2.<init>(r0, r3)
            r2.A00 = r4
            r2.A04 = r15
            r2.A0G = r1
            r2.A0B = r6
            r2.A0D = r8
            r0 = r34
            r2.A0K = r0
            r0 = r33
            r2.A0C = r0
            r0 = r36
            r2.A0E = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.A0L = r0
            com.instagram.profile.fragment.UserDetailTabController r0 = r3.A02
            X.6vu r0 = r0.A0P
            com.instagram.user.model.User r0 = r0.A0J
            if (r0 == 0) goto L_0x012b
            java.lang.String r19 = r0.getId()
        L_0x0064:
            X.71R r9 = new X.71R
            r17 = r27
            r20 = r41
            r16 = r26
            r13 = r9
            r18 = r7
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r2.A05 = r9
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.A0M = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.A0I = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.A0N = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.A00 = r0
            if (r40 == 0) goto L_0x012f
            boolean r0 = r40.booleanValue()
            r9.A03 = r0
            X.5m9 r0 = X.C294255m9.A0C
            if (r6 != r0) goto L_0x00a0
            boolean r6 = X.C321616uT.A00(r15)
            r0 = 1
            if (r6 != 0) goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r9.A02 = r0
            r0 = r28
            r9.A01 = r0
            X.71T r10 = new X.71T
            r10.<init>(r4)
            r2.A0F = r10
            X.71U r12 = new X.71U
            r12.<init>(r4)
            r2.A0J = r12
            X.71V r13 = new X.71V
            r13.<init>()
            r2.A06 = r13
            X.2sK r11 = new X.2sK
            r0 = r29
            r11.<init>((android.content.Context) r4, (X.AnonymousClass57M) r0)
            r2.A0H = r11
            X.2s2 r7 = new X.2s2
            r7.<init>()
            r2.A03 = r7
            android.content.res.Resources r6 = r4.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r6.getDimensionPixelSize(r0)
            r7.A03 = r0
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r0 = X.2Yu.A0H(r4, r0)
            r7.A00 = r0
            X.2s2 r8 = new X.2s2
            r8.<init>()
            r2.A02 = r8
            X.2tt r0 = new X.2tt
            r0.<init>(r4, r15)
            r2.A07 = r0
            X.71W r4 = new X.71W
            r4.<init>(r15, r3, r1)
            r2.A09 = r4
            android.content.Context r6 = r2.A00
            com.instagram.common.session.UserSession r4 = r2.A04
            X.71X r3 = new X.71X
            r3.<init>(r2)
            X.71Z r1 = new X.71Z
            r20 = r39
            r15 = r1
            r16 = r6
            r17 = r14
            r18 = r4
            r19 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r2.A08 = r1
            r3 = r31
            r2.A0A = r3
            r3 = r23
            r2.A01 = r3
            r2.setHasStableIds(r5)
            X.71a r14 = r1.A03
            X.2s2 r15 = r1.A01
            r16 = r0
            X.2s0[] r0 = new X.C231642s0[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            r2.init(r0)
            return
        L_0x012b:
            r19 = 0
            goto L_0x0064
        L_0x012f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71N.<init>(android.content.Context, X.2ZX, X.0iw, com.instagram.common.session.UserSession, X.4bx, X.32J, X.726, X.57M, X.6wH, X.EbS, X.5m9, com.instagram.profile.fragment.ProfileMediaTabFragment, X.UWt, X.6w8, X.6wO, X.32Q, X.2ms, X.4bu, java.lang.Boolean, java.lang.String):void");
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        Map map = this.A0L;
        AnonymousClass6u8 r0 = (AnonymousClass6u8) map.get(str);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass6u8 r02 = new AnonymousClass6u8();
        map.put(str, r02);
        return r02;
    }

    public final AnonymousClass3W1 BQr(1Xj r5) {
        0qQ.A0B(r5, 0);
        Map map = this.A0M;
        AnonymousClass3W1 r2 = (AnonymousClass3W1) map.get(r5);
        if (r2 != null) {
            return r2;
        }
        AnonymousClass3W1 r22 = new AnonymousClass3W1(r5.A0o(), r5.A4o());
        map.put(r5, r22);
        return r22;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.length() == 0) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0.length() == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r12 = this;
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r10 = r12.A04
            com.instagram.user.model.User r1 = r0.A01(r10)
            java.lang.String r0 = r1.getFullName()
            r11 = 1
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r1.getFullName()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            r9 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            java.lang.String r0 = r1.A0O()
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r1.A0O()
            if (r0 == 0) goto L_0x0030
            int r0 = r0.length()
            r8 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r8 = 0
        L_0x0031:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36599611058490976(0x820727000f0e60, double:3.209079635969745E-306)
            long r5 = X.182.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1 = 2
            if (r0 == 0) goto L_0x0048
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
        L_0x0048:
            long r3 = X.182.A01(r7, r10, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L_0x005f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
        L_0x0058:
            if (r9 == 0) goto L_0x005c
            if (r8 != 0) goto L_0x0061
        L_0x005c:
            if (r11 == 0) goto L_0x0061
            return
        L_0x005f:
            r11 = 0
            goto L_0x0058
        L_0x0061:
            X.71Z r2 = r12.A08
            X.2ZX r0 = r12.A01
            X.Mfn r1 = r2.A00(r0)
            X.71a r0 = r2.A03
            r12.addModel(r1, r0)
            r1 = 0
            X.2s2 r0 = r2.A01
            r12.addModel(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71N.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x026e, code lost:
        if (r1.A02 == false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        X.1zE.A00(r20, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02aa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ee, code lost:
        X.1zE.A00(r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012f, code lost:
        if (r1.A02 == false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0192, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0290 A[Catch:{ all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x029c A[Catch:{ all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015c A[Catch:{ all -> 0x0192 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r22 = this;
            java.lang.String r0 = "ProfileMediaTabAdapter.updateItems"
            X.0lp r21 = X.0lq.A00(r0)
            r5 = r22
            X.UWt r0 = r5.A0K     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x000f
            r0.A0T()     // Catch:{ all -> 0x02eb }
        L_0x000f:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.A0N     // Catch:{ all -> 0x02eb }
            r12 = 1
            r4.set(r12)     // Catch:{ all -> 0x02eb }
            r5.clear()     // Catch:{ all -> 0x02eb }
            X.6wI r11 = r5.A00     // Catch:{ all -> 0x02eb }
            X.6wH r11 = (X.C322706wH) r11     // Catch:{ all -> 0x02eb }
            r6 = 0
            if (r11 == 0) goto L_0x0031
            X.5m9 r0 = r5.A0B     // Catch:{ all -> 0x02eb }
            X.5mA r1 = r0.A00     // Catch:{ all -> 0x02eb }
            java.util.HashMap r0 = r11.A03     // Catch:{ all -> 0x02eb }
            r0.get(r1)     // Catch:{ all -> 0x02eb }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x02eb }
            X.6wK r0 = (X.C322736wK) r0     // Catch:{ all -> 0x02eb }
            com.instagram.api.schemas.GraphGuardianContentImpl r0 = r0.A00     // Catch:{ all -> 0x02eb }
            goto L_0x0032
        L_0x0031:
            r0 = r6
        L_0x0032:
            r3 = 0
            if (r0 == 0) goto L_0x0083
            java.lang.String r6 = r0.A04     // Catch:{ all -> 0x02eb }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x02eb }
            java.lang.String r9 = r0.A02     // Catch:{ all -> 0x02eb }
            X.71W r1 = r5.A09     // Catch:{ all -> 0x02eb }
            X.5m9 r0 = r5.A0B     // Catch:{ all -> 0x02eb }
            X.5mA r0 = r0.A00     // Catch:{ all -> 0x02eb }
            X.6rr r8 = r1.A00(r0)     // Catch:{ all -> 0x02eb }
            X.0qQ.A07(r8)     // Catch:{ all -> 0x02eb }
            X.72b r7 = new X.72b     // Catch:{ all -> 0x02eb }
            r7.<init>()     // Catch:{ all -> 0x02eb }
            r7.A0D = r6     // Catch:{ all -> 0x02eb }
            r7.A07 = r2     // Catch:{ all -> 0x02eb }
            r7.A0L = r12     // Catch:{ all -> 0x02eb }
            r7.A0P = r3     // Catch:{ all -> 0x02eb }
            r7.A0G = r12     // Catch:{ all -> 0x02eb }
            r7.A0F = r12     // Catch:{ all -> 0x02eb }
            X.6w8 r0 = r5.A0D     // Catch:{ all -> 0x02eb }
            int r0 = r0.A01     // Catch:{ all -> 0x02eb }
            r7.A04 = r0     // Catch:{ all -> 0x02eb }
            if (r9 == 0) goto L_0x007c
            int r0 = r9.length()     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x007c
            com.instagram.common.session.UserSession r6 = r5.A04     // Catch:{ all -> 0x02eb }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x02eb }
            r0 = 36327718152845964(0x810fde00003a8c, double:3.0371334676149856E-306)
            boolean r0 = X.182.A06(r2, r6, r0)     // Catch:{ all -> 0x02eb }
            if (r0 == 0) goto L_0x007c
            r7.A0C = r9     // Catch:{ all -> 0x02eb }
            X.6wO r0 = r5.A0E     // Catch:{ all -> 0x02eb }
            r7.A06 = r0     // Catch:{ all -> 0x02eb }
        L_0x007c:
            X.71T r0 = r5.A0F     // Catch:{ all -> 0x02eb }
            r5.addModel(r7, r8, r0)     // Catch:{ all -> 0x02eb }
            goto L_0x02ab
        L_0x0083:
            if (r11 == 0) goto L_0x02ab
            X.5m9 r10 = r5.A0B     // Catch:{ all -> 0x02eb }
            X.5mA r8 = r10.A00     // Catch:{ all -> 0x02eb }
            java.util.HashMap r7 = r11.A03     // Catch:{ all -> 0x02eb }
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x02eb }
            X.6wK r0 = (X.C322736wK) r0     // Catch:{ all -> 0x02eb }
            X.4n0 r2 = r0.A02     // Catch:{ all -> 0x02eb }
            X.6vO r0 = r0.A03     // Catch:{ all -> 0x02eb }
            r2.A08(r0)     // Catch:{ all -> 0x02eb }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x02eb }
            r2.A00 = r0     // Catch:{ all -> 0x02eb }
            int r0 = r2.A02()     // Catch:{ all -> 0x02eb }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "ProfileMediaTabAdapter.updateItemsWithEmptyState"
            X.0lp r6 = X.0lq.A00(r0)     // Catch:{ all -> 0x02eb }
            X.71W r0 = r5.A09     // Catch:{ all -> 0x0190 }
            X.6rr r13 = r0.A00(r8)     // Catch:{ all -> 0x0190 }
            X.0qQ.A07(r13)     // Catch:{ all -> 0x0190 }
            X.72b r9 = new X.72b     // Catch:{ all -> 0x0190 }
            r9.<init>()     // Catch:{ all -> 0x0190 }
            int r1 = r13.ordinal()     // Catch:{ all -> 0x0190 }
            r0 = 3
            if (r1 == r0) goto L_0x00ff
            if (r1 == r3) goto L_0x00c4
            r0 = 2
            if (r1 == r0) goto L_0x010c
            r9 = 0
            goto L_0x010e
        L_0x00c4:
            com.instagram.profile.fragment.UserDetailTabController r0 = r11.A02     // Catch:{ all -> 0x0190 }
            X.6vu r0 = r0.A0P     // Catch:{ all -> 0x0190 }
            com.instagram.common.session.UserSession r1 = r0.A0c     // Catch:{ all -> 0x0190 }
            com.instagram.user.model.User r0 = r0.A0J     // Catch:{ all -> 0x0190 }
            boolean r0 = X.C324376zB.A01(r1, r0)     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x00f4
            android.content.res.Resources r1 = r11.A00     // Catch:{ all -> 0x0190 }
            X.0qQ.A0B(r1, r3)     // Catch:{ all -> 0x0190 }
            X.72b r9 = new X.72b     // Catch:{ all -> 0x0190 }
            r9.<init>()     // Catch:{ all -> 0x0190 }
            r0 = 2131231745(0x7f080401, float:1.807958E38)
            r9.A02 = r0     // Catch:{ all -> 0x0190 }
            r0 = 2131975275(0x7f135c6b, float:1.9587638E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0190 }
            r9.A0D = r0     // Catch:{ all -> 0x0190 }
            r0 = 2131962588(0x7f132adc, float:1.9561905E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0190 }
            r9.A07 = r0     // Catch:{ all -> 0x0190 }
            goto L_0x010e
        L_0x00f4:
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x0190 }
            X.6wK r0 = (X.C322736wK) r0     // Catch:{ all -> 0x0190 }
            X.72b r9 = r0.A03()     // Catch:{ all -> 0x0190 }
            goto L_0x010e
        L_0x00ff:
            r0 = 2131239153(0x7f0820f1, float:1.8094605E38)
            r9.A02 = r0     // Catch:{ all -> 0x0190 }
            X.FN4 r0 = new X.FN4     // Catch:{ all -> 0x0190 }
            r0.<init>(r11, r10)     // Catch:{ all -> 0x0190 }
            r9.A05 = r0     // Catch:{ all -> 0x0190 }
            goto L_0x010e
        L_0x010c:
            r9.A0M = r12     // Catch:{ all -> 0x0190 }
        L_0x010e:
            X.2ms r0 = r5.A0G     // Catch:{ all -> 0x0190 }
            r0.isLoading()     // Catch:{ all -> 0x0190 }
            if (r9 == 0) goto L_0x018b
            X.6rr r8 = X.C320156rr.EMPTY     // Catch:{ all -> 0x0190 }
            if (r13 != r8) goto L_0x0166
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x0190 }
            com.instagram.common.session.UserSession r0 = r5.A04     // Catch:{ all -> 0x0190 }
            com.instagram.user.model.User r0 = r1.A01(r0)     // Catch:{ all -> 0x0190 }
            boolean r0 = r0.A2L()     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0131
            X.EbS r1 = r5.A0A     // Catch:{ all -> 0x0190 }
            boolean r0 = r1.A03     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0166
            boolean r0 = r1.A02     // Catch:{ all -> 0x0190 }
            if (r0 != 0) goto L_0x0166
        L_0x0131:
            X.71Z r1 = r5.A08     // Catch:{ all -> 0x0190 }
            X.2ZX r0 = r5.A01     // Catch:{ all -> 0x0190 }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0166
            r1.A01(r9)     // Catch:{ all -> 0x0190 }
            X.71T r0 = r5.A0F     // Catch:{ all -> 0x0190 }
            r5.addModel(r9, r13, r0)     // Catch:{ all -> 0x0190 }
            r5.A00()     // Catch:{ all -> 0x0190 }
        L_0x0146:
            com.instagram.profile.fragment.ProfileMediaTabFragment r0 = r5.A0C     // Catch:{ all -> 0x0190 }
            r0.A01()     // Catch:{ all -> 0x0190 }
        L_0x014b:
            com.instagram.profile.fragment.ProfileMediaTabFragment r7 = r5.A0C     // Catch:{ all -> 0x0190 }
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0190 }
            r0 = 2130968707(0x7f040083, float:1.7546075E38)
            int r2 = X.2Yu.A0H(r1, r0)     // Catch:{ all -> 0x0190 }
            android.content.Context r0 = r7.getContext()     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x018b
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView     // Catch:{ all -> 0x0190 }
            int r0 = r0.getColor(r2)     // Catch:{ all -> 0x0190 }
            r1.setBackgroundColor(r0)     // Catch:{ all -> 0x0190 }
            goto L_0x018b
        L_0x0166:
            r9.A0L = r12     // Catch:{ all -> 0x0190 }
            r9.A0P = r3     // Catch:{ all -> 0x0190 }
            r9.A0G = r12     // Catch:{ all -> 0x0190 }
            r9.A0F = r12     // Catch:{ all -> 0x0190 }
            X.6w8 r0 = r5.A0D     // Catch:{ all -> 0x0190 }
            int r0 = r0.A01     // Catch:{ all -> 0x0190 }
            r9.A04 = r0     // Catch:{ all -> 0x0190 }
            com.instagram.common.session.UserSession r7 = r5.A04     // Catch:{ all -> 0x0190 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x0190 }
            r0 = 36324737447375164(0x810d28001c313c, double:3.035248457472914E-306)
            boolean r0 = X.182.A06(r2, r7, r0)     // Catch:{ all -> 0x0190 }
            if (r0 != 0) goto L_0x0188
            X.71T r0 = r5.A0F     // Catch:{ all -> 0x0190 }
            r5.addModel(r9, r13, r0)     // Catch:{ all -> 0x0190 }
        L_0x0188:
            if (r13 != r8) goto L_0x014b
            goto L_0x0146
        L_0x018b:
            r6.close()     // Catch:{ all -> 0x02eb }
            goto L_0x02ab
        L_0x0190:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ all -> 0x02eb }
            goto L_0x02ea
        L_0x0198:
            java.lang.String r0 = "ProfileMediaTabAdapter.updateItemsWithFeedObjects"
            X.0lp r20 = X.0lq.A00(r0)     // Catch:{ all -> 0x02eb }
            X.2s2 r0 = r5.A03     // Catch:{ all -> 0x02a2 }
            r5.addModel(r6, r6, r0)     // Catch:{ all -> 0x02a2 }
            int r19 = r2.A02()     // Catch:{ all -> 0x02a2 }
            r9 = 0
        L_0x01a8:
            r0 = r19
            if (r9 >= r0) goto L_0x0251
            X.71g r18 = r2.A0E(r9)     // Catch:{ all -> 0x02a2 }
            int r0 = r18.hashCode()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02a2 }
            X.6u8 r13 = r5.BQA(r0)     // Catch:{ all -> 0x02a2 }
            X.2ms r0 = r5.A0G     // Catch:{ all -> 0x02a2 }
            boolean r0 = r0.CKB()     // Catch:{ all -> 0x02a2 }
            r1 = 1
            if (r0 != 0) goto L_0x023c
            int r0 = r2.A02()     // Catch:{ all -> 0x02a2 }
            int r0 = r0 - r12
            if (r9 != r0) goto L_0x023c
        L_0x01cc:
            r13.A00(r9, r1)     // Catch:{ all -> 0x02a2 }
            X.5m9 r0 = X.C294255m9.A0B     // Catch:{ all -> 0x02a2 }
            if (r10 != r0) goto L_0x023e
            com.instagram.common.session.UserSession r15 = r5.A04     // Catch:{ all -> 0x02a2 }
            X.0Tu r14 = X.0Tu.A05     // Catch:{ all -> 0x02a2 }
            r0 = 36317272792372180(0x81065e000013d4, double:3.030527779591274E-306)
            boolean r0 = X.182.A06(r14, r15, r0)     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x023e
            java.util.Iterator r17 = r18.iterator()     // Catch:{ all -> 0x02a2 }
        L_0x01e6:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x023e
            java.lang.Object r1 = r17.next()     // Catch:{ all -> 0x02a2 }
            X.1Xj r1 = (X.1Xj) r1     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1.A5D()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x01e6
            r15 = 0
            com.instagram.profile.fragment.UserDetailTabController r0 = r11.A02     // Catch:{ all -> 0x02a2 }
            X.6vu r0 = r0.A0P     // Catch:{ all -> 0x02a2 }
            com.instagram.user.model.User r0 = r0.A0J     // Catch:{ all -> 0x02a2 }
            r16 = r0
            java.util.Map r14 = r5.A0I     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x02a2 }
            boolean r0 = r14.containsKey(r0)     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x0222
            if (r16 == 0) goto L_0x0213
            java.lang.String r15 = r16.getId()     // Catch:{ all -> 0x02a2 }
        L_0x0213:
            int r0 = X.C55090Hbz.A00(r1, r15)     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x02a2 }
            r14.put(r0, r15)     // Catch:{ all -> 0x02a2 }
        L_0x0222:
            java.lang.String r0 = r1.getId()     // Catch:{ all -> 0x02a2 }
            java.lang.Object r0 = r14.get(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = r1.getId()     // Catch:{ all -> 0x02a2 }
            if (r1 == 0) goto L_0x0249
            int r0 = r0.intValue()     // Catch:{ all -> 0x02a2 }
            r13.A01(r1, r0)     // Catch:{ all -> 0x02a2 }
            goto L_0x01e6
        L_0x023c:
            r1 = 0
            goto L_0x01cc
        L_0x023e:
            X.71R r1 = r5.A05     // Catch:{ all -> 0x02a2 }
            r0 = r18
            r5.addModel(r0, r13, r1)     // Catch:{ all -> 0x02a2 }
            int r9 = r9 + 1
            goto L_0x01a8
        L_0x0249:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a2 }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x0251:
            X.2ms r9 = r5.A0G     // Catch:{ all -> 0x02a2 }
            X.2sK r0 = r5.A0H     // Catch:{ all -> 0x02a2 }
            r5.addModel(r9, r6, r0)     // Catch:{ all -> 0x02a2 }
            X.0eE r1 = X.AnonymousClass0t1.A01     // Catch:{ all -> 0x02a2 }
            com.instagram.common.session.UserSession r0 = r5.A04     // Catch:{ all -> 0x02a2 }
            com.instagram.user.model.User r0 = r1.A01(r0)     // Catch:{ all -> 0x02a2 }
            boolean r0 = r0.A2L()     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0270
            X.EbS r1 = r5.A0A     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1.A03     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0296
            boolean r0 = r1.A02     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x0296
        L_0x0270:
            X.71Z r1 = r5.A08     // Catch:{ all -> 0x02a2 }
            X.2ZX r0 = r5.A01     // Catch:{ all -> 0x02a2 }
            boolean r0 = r1.A02(r0)     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x0296
            r5.A00()     // Catch:{ all -> 0x02a2 }
        L_0x027d:
            com.instagram.profile.fragment.ProfileMediaTabFragment r0 = r5.A0C     // Catch:{ all -> 0x02a2 }
            androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView     // Catch:{ all -> 0x02a2 }
            r0.setBackground(r6)     // Catch:{ all -> 0x02a2 }
            java.lang.Object r0 = r7.get(r8)     // Catch:{ all -> 0x02a2 }
            X.6wK r0 = (X.C322736wK) r0     // Catch:{ all -> 0x02a2 }
            X.Eyx r1 = r0.A02()     // Catch:{ all -> 0x02a2 }
            if (r1 == 0) goto L_0x02ad
            X.71V r0 = r5.A06     // Catch:{ all -> 0x02a2 }
            r5.addModel(r1, r6, r0)     // Catch:{ all -> 0x02a2 }
            goto L_0x02ad
        L_0x0296:
            boolean r0 = r9.CKB()     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x027d
            X.2s2 r0 = r5.A02     // Catch:{ all -> 0x02a2 }
            r5.addModel(r6, r6, r0)     // Catch:{ all -> 0x02a2 }
            goto L_0x027d
        L_0x02a2:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r1 = move-exception
            r0 = r20
            X.1zE.A00(r0, r2)     // Catch:{ all -> 0x02eb }
            throw r1     // Catch:{ all -> 0x02eb }
        L_0x02ab:
            r2 = 0
            goto L_0x02b6
        L_0x02ad:
            r20.close()     // Catch:{ all -> 0x02eb }
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x02eb }
            int r2 = r0.size()     // Catch:{ all -> 0x02eb }
        L_0x02b6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02eb }
            r1.<init>()     // Catch:{ all -> 0x02eb }
            X.5m9 r0 = r5.A0B     // Catch:{ all -> 0x02eb }
            X.5mA r0 = r0.A00     // Catch:{ all -> 0x02eb }
            r1.append(r0)     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "_notify_"
            r1.append(r0)     // Catch:{ all -> 0x02eb }
            r1.append(r2)     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = "_items"
            r1.append(r0)     // Catch:{ all -> 0x02eb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02eb }
            X.0lp r2 = X.0lq.A00(r0)     // Catch:{ all -> 0x02eb }
            r5.notifyDataSetChangedSmart()     // Catch:{ all -> 0x02e4 }
            r4.set(r3)     // Catch:{ all -> 0x02e4 }
            r2.close()     // Catch:{ all -> 0x02eb }
            r21.close()
            return
        L_0x02e4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02e6 }
        L_0x02e6:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x02eb }
        L_0x02ea:
            throw r0     // Catch:{ all -> 0x02eb }
        L_0x02eb:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02ed }
        L_0x02ed:
            r1 = move-exception
            r0 = r21
            X.1zE.A00(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass71N.A01():void");
    }

    public final long getItemId(int i) {
        int hashCode;
        int A032 = AnonymousClass0fD.A03(-705030999);
        Object item = getItem(i);
        C231642s0 binderGroup = getBinderGroup(i);
        if (binderGroup == this.A05) {
            0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.util.ListSlice<*>");
            hashCode = String.valueOf(item.hashCode()).hashCode();
        } else {
            hashCode = Arrays.hashCode(new Object[]{binderGroup, Integer.valueOf(getBinderGroupViewType(i))});
        }
        long j = (long) hashCode;
        AnonymousClass0fD.A0A(-1758365325, A032);
        return j;
    }

    public final void Cs9(1Xj r1) {
        A01();
    }
}
