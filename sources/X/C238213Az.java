package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* renamed from: X.3Az  reason: invalid class name and case insensitive filesystem */
public final class C238213Az extends C249383je implements View.OnClickListener {
    public long A00 = -1;
    public FrameLayout A01;
    public AnonymousClass3B0 A02 = AnonymousClass3B0.DEFAULT_BEHAVIOR;
    public boolean A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass356 A06;
    public final C249763kK A07;
    public final C228472lj A08;
    public final C228472lj A09;
    public final C228302lG A0A;
    public final C238203Ay A0B;

    public C238213Az(Context context, FrameLayout frameLayout, AnonymousClass0iw r5, UserSession userSession, C228302lG r7, C249763kK r8, C228472lj r9, C228472lj r10, C227892kG r11, C238203Ay r12) {
        0qQ.A0B(r11, 3);
        0qQ.A0B(r9, 4);
        0qQ.A0B(r10, 5);
        0qQ.A0B(userSession, 7);
        0qQ.A0B(r8, 10);
        this.A04 = r5;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = userSession;
        this.A0B = r12;
        this.A0A = r7;
        this.A07 = r8;
        this.A06 = new AnonymousClass356(context, this, r11, 2131968294);
        this.A01 = frameLayout;
    }

    public static final void A00(C238213Az r1, Integer num) {
        if (!r1.A04(r1.A02, num)) {
            r1.A02(num);
            r1.A08.A09(num);
        }
    }

    public static final void A01(C238213Az r3, Integer num) {
        if (!r3.A04(r3.A02, num)) {
            r3.A02(num);
            r3.A08();
            HashMap hashMap = new HashMap();
            hashMap.put("new_posts_reported", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            C238203Ay r1 = r3.A0B;
            r1.A00();
            r1.A02(1FI.A0H, hashMap);
        }
    }

    private final void A02(Integer num) {
        String str;
        C228302lG r2 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("NEW_POSTS_PILL_CLICKED_");
        sb.append(this.A02);
        sb.append('_');
        switch (num.intValue()) {
            case 0:
                str = "INDICATOR_TAPPED";
                break;
            case 1:
                str = "SCROLLED_TO_TOP";
                break;
            case 2:
                str = "FEED_DISAPPEARED";
                break;
            case 3:
                str = "FEED_REAPPEARED";
                break;
            case 4:
                str = "APP_BACKGROUNDED";
                break;
            case 5:
                str = "APP_FOREGROUNDED";
                break;
            default:
                str = "PULL_TO_REFRESH";
                break;
        }
        sb.append(str);
        r2.A00(sb.toString());
        C297545rv.A00(this.A05);
        this.A07.getSessionId();
        this.A04.getModuleName();
    }

    private final boolean A03() {
        CFN cfn;
        if ((!this.A08.A0i.A04.isEmpty()) || (cfn = this.A09.A0e.A02.A02.A01) == null || !cfn.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r10 == X.AnonymousClass05K.A0N) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A04(X.AnonymousClass3B0 r9, java.lang.Integer r10) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r4 = r8.A05
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            X.0Tu r2 = X.0Tu.A05
            r0 = 36594981083154422(0x8202f1000607f6, double:3.206151620923494E-306)
            long r0 = X.182.A01(r2, r4, r0)
            long r6 = r3.toMillis(r0)
            r0 = 2342156515320268834(0x208102f100080822, double:4.060079609474402E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            r5 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r10 == r0) goto L_0x0030
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r10 == r0) goto L_0x0030
        L_0x0027:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r10 == r0) goto L_0x0030
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4 = 0
            if (r10 != r0) goto L_0x0031
        L_0x0030:
            r4 = 1
        L_0x0031:
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
        L_0x0042:
            return r5
        L_0x0043:
            X.3B0 r0 = X.AnonymousClass3B0.LIGHT
            if (r9 != r0) goto L_0x0042
        L_0x0047:
            if (r4 == 0) goto L_0x0042
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238213Az.A04(X.3B0, java.lang.Integer):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A05() {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r3 = r9.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326086065403377(0x810e62000235f1, double:3.036101328944405E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r7 = 0
            if (r0 == 0) goto L_0x0047
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r3)
            X.1B2 r0 = X.1B2.A0U
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0047
            r0 = 36607561042171475(0x820e6200031653, double:3.2141072376613076E-306)
        L_0x0024:
            long r0 = X.182.A01(r2, r3, r0)
        L_0x0028:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.0qQ.A0A(r0)
            long r0 = r0.longValue()
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            if (r5 > 0) goto L_0x0042
            r0 = 36594981083416568(0x8202f1000a07f8, double:3.2061516210892764E-306)
            long r0 = X.182.A01(r2, r3, r0)
        L_0x0042:
            long r0 = r4.toMillis(r0)
            return r0
        L_0x0047:
            r0 = 36328701700488732(0x8110c300023e1c, double:3.0377554671047005E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x008c
            X.Hra r0 = X.C55041HbC.A00(r3)
            X.1FI r6 = X.1FI.A0M
            r5 = 0
            java.lang.Integer r0 = r0.A00(r6, r5)
            if (r0 == 0) goto L_0x008c
            X.Hra r4 = X.C55041HbC.A00(r3)
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r3)
            X.1B2 r0 = X.1B2.A0U
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x007d
            r0 = 36328701700554269(0x8110c300033e1d, double:3.0377554671461464E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x007d
            r5 = 1
        L_0x007d:
            java.lang.Integer r0 = r4.A00(r6, r5)
            if (r0 == 0) goto L_0x0089
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L_0x0028
        L_0x0089:
            r0 = 0
            goto L_0x0028
        L_0x008c:
            r0 = 36329487679439001(0x81117a00014099, double:3.038252523357734E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x009d
            r0 = 36610962656270518(0x82117a000318b6, double:3.216258432114743E-306)
            goto L_0x0024
        L_0x009d:
            r0 = 36599095661825436(0x8206af00060d9c, double:3.208753697043122E-306)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238213Az.A05():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r8 > 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (r7 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r7.longValue()) > A05()) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r10 > r8) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (X.182.A06(r4, r5, 36329380305649745L) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        return X.AnonymousClass3B0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (r7 != null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        if (r7 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        if (r7 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0101, code lost:
        return X.AnonymousClass3B0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0104, code lost:
        return X.AnonymousClass3B0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003e, code lost:
        if (X.AnonymousClass1B1.A00(r5).A00(X.1B2.A0U) == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3B0 A06() {
        /*
            r12 = this;
            X.2lj r0 = r12.A09
            X.2lr r0 = r0.A0f
            java.lang.Long r7 = r0.A05()
            com.instagram.common.session.UserSession r5 = r12.A05
            X.0Tu r4 = X.0Tu.A05
            r0 = 36328701700750880(0x8110c300063e20, double:3.037755467270484E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00ad
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r10 = r0.now()
            long r0 = X.14i.A00
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.Hra r3 = X.C55041HbC.A00(r5)
            r0 = 36328701700816417(0x8110c300073e21, double:3.03775546731193E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0040
            long r0 = X.AnonymousClass1B0.A02
            X.1B0 r1 = X.AnonymousClass1B1.A00(r5)
            X.1B2 r0 = X.1B2.A0U
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            java.lang.String r2 = "warm_start_bg_timer_in_s"
            java.util.concurrent.ConcurrentHashMap r1 = r3.A01
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "on_peak_"
        L_0x0049:
            java.lang.String r0 = X.002.A0R(r0, r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = 0
            if (r0 == 0) goto L_0x00a7
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x005c:
            long r8 = r6.toMillis(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
        L_0x0064:
            X.3Bd r0 = X.C238243Bc.A00(r5)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36880570639319373(0x8306af0012014d, double:3.386759606219048E-306)
            java.lang.String r1 = X.182.A04(r4, r2, r0)
            java.lang.String r0 = "warm_start"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a4
            if (r7 == 0) goto L_0x0092
        L_0x007d:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.longValue()
            long r2 = r2 - r0
            long r6 = java.lang.Math.abs(r2)
            long r1 = r12.A05()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0102
        L_0x0092:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0102
        L_0x0096:
            r0 = 36329380305649745(0x81116100074051, double:3.038184619741049E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00ff
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_FEED_AND_STORIES_REFRESH
            return r0
        L_0x00a4:
            if (r7 == 0) goto L_0x0102
            goto L_0x007d
        L_0x00a7:
            r0 = 0
            goto L_0x005c
        L_0x00aa:
            java.lang.String r0 = ""
            goto L_0x0049
        L_0x00ad:
            r0 = 36329487679373464(0x81117a00004098, double:3.038252523316288E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00d1
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r10 = r0.now()
            long r0 = X.14i.A00
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36610962656204981(0x82117a000218b5, double:3.216258432073297E-306)
            long r0 = X.182.A01(r4, r5, r0)
            long r8 = r2.toMillis(r0)
            goto L_0x0064
        L_0x00d1:
            X.3Bd r0 = X.C238243Bc.A00(r5)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36880570639319373(0x8306af0012014d, double:3.386759606219048E-306)
            java.lang.String r1 = X.182.A04(r4, r2, r0)
            java.lang.String r0 = "warm_start"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00fc
            if (r7 == 0) goto L_0x0096
        L_0x00ea:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.longValue()
            long r2 = r2 - r0
            long r10 = java.lang.Math.abs(r2)
            long r8 = r12.A05()
            goto L_0x0092
        L_0x00fc:
            if (r7 == 0) goto L_0x0102
            goto L_0x00ea
        L_0x00ff:
            X.3B0 r0 = X.AnonymousClass3B0.FORCE_FEED_REFRESH
            return r0
        L_0x0102:
            X.3B0 r0 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238213Az.A06():X.3B0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (A03() != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r8 = this;
            X.2lj r0 = r8.A08
            X.2lo r0 = r0.A0i
            java.util.List r2 = r0.A04
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r8.A03()
            r1 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            boolean r0 = r8.A0B()
            if (r1 == 0) goto L_0x0089
            if (r0 != 0) goto L_0x0089
            android.widget.FrameLayout r7 = r8.A01
            if (r7 == 0) goto L_0x0089
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r6 = X.0Tu.A05
            r4 = 2342156515320268834(0x208102f100080822, double:4.060079609474402E-152)
            boolean r0 = X.182.A06(r6, r3, r4)
            if (r0 != 0) goto L_0x0046
            X.356 r0 = r8.A06
            X.357 r1 = r0.A00
            android.view.View r0 = r1.A02
            if (r0 == 0) goto L_0x00a3
            android.view.ViewParent r0 = r0.getParent()
        L_0x003d:
            boolean r0 = X.2PP.A00(r0, r7)
            if (r0 != 0) goto L_0x0046
            r1.A06(r7)
        L_0x0046:
            r1 = 1
            boolean r0 = X.182.A06(r6, r3, r4)
            if (r0 == 0) goto L_0x009a
            r8.A03 = r1
        L_0x004f:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            X.3B0 r0 = X.AnonymousClass3B0.DEFERRED
        L_0x0059:
            r8.A02 = r0
            long r0 = java.lang.System.currentTimeMillis()
        L_0x005f:
            r8.A00 = r0
            r8.A09()
            X.2lG r2 = r8.A0A
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NEW_POSTS_PILL_DISPLAYED_"
            r1.append(r0)
            X.3B0 r0 = r8.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A00(r0)
            X.C297545rv.A00(r3)
            X.3kK r0 = r8.A07
            r0.getSessionId()
            X.0iw r0 = r8.A04
            r0.getModuleName()
        L_0x0089:
            return
        L_0x008a:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x0093
            X.3B0 r0 = X.AnonymousClass3B0.LIGHT
            goto L_0x0059
        L_0x0093:
            X.3B0 r0 = X.AnonymousClass3B0.DEFAULT_BEHAVIOR
            r8.A02 = r0
            r0 = -1
            goto L_0x005f
        L_0x009a:
            X.356 r0 = r8.A06
            r1 = 0
            X.357 r0 = r0.A00
            r0.A05(r1)
            goto L_0x004f
        L_0x00a3:
            r0 = 0
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238213Az.A07():void");
    }

    public final boolean A0A() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                return false;
            }
        } else if ((!this.A08.A0i.A04.isEmpty()) && A0B()) {
            A00(this, AnonymousClass05K.A0u);
            return true;
        }
        if (!A0B()) {
            return false;
        }
        A01(this, AnonymousClass05K.A0u);
        return true;
    }

    public final boolean A0B() {
        if (182.A06(0Tu.A05, this.A05, 2342156515320268834L)) {
            return this.A03;
        }
        View view = this.A06.A00.A02;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void A08() {
        if (A0B()) {
            this.A0A.A00("NEW_POSTS_PILL_HIDDEN");
            if (182.A06(0Tu.A05, this.A05, 2342156515320268834L)) {
                this.A03 = false;
            } else {
                this.A06.A00.A04((Animation) null);
            }
        }
    }

    public final void A09() {
        if (A0B()) {
            if (!182.A06(0Tu.A05, this.A05, 2342156515320268834L)) {
                this.A06.A00();
            }
        }
    }

    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        int A052 = AnonymousClass0fD.A05(1377451380);
        int ordinal = this.A02.ordinal();
        if (ordinal == 2) {
            A00(this, AnonymousClass05K.A00);
        } else if (ordinal != 1) {
            if (ordinal != 0) {
                i = -542874090;
            } else {
                illegalStateException = new IllegalStateException("FeedRefreshType should never be DEFAULT_BEHAVIOR in onClick");
                i = -587566934;
            }
            AnonymousClass0fD.A0C(i, A052);
            throw illegalStateException;
        } else {
            A01(this, AnonymousClass05K.A00);
        }
        AnonymousClass0fD.A0C(-1771938869, A052);
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int A032 = AnonymousClass0fD.A03(-1959336717);
        A09();
        AnonymousClass0fD.A0A(1737638122, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(348971737, AnonymousClass0fD.A03(-937571498));
    }
}
