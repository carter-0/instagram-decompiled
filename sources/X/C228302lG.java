package X;

import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2lG  reason: invalid class name and case insensitive filesystem */
public final class C228302lG extends AnonymousClass1GX {
    public static final long A0B;
    public static final long A0C;
    public int A00 = 0;
    public int A01 = 0;
    public String A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final EvictingQueue A06 = new EvictingQueue(200);
    public final 02m A07 = 02m.A0p;
    public final AnonymousClass57F A08;
    public final UserSession A09;
    public final AnonymousClass2l3 A0A;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A0C = timeUnit.toMillis(10);
        A0B = timeUnit.toMillis(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        switch(r9) {
            case -1623297157: goto L_0x004c;
            case -754039584: goto L_0x004f;
            case -47418416: goto L_0x0052;
            case 2336663: goto L_0x0055;
            case 2537853: goto L_0x0064;
            case 80841545: goto L_0x0058;
            case 1291560753: goto L_0x005b;
            default: goto L_0x003f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r10.A07.markerPoint(974460948, r10.A00, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r10.A02 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r0 = "CAROUSEL_SWIPE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r0 = "REEL_ITEM_CLICKED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r0 = "SCROLL_FEED";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r0 = "LIKE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        r0 = "SCROLL_REEL_TRAY";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r0 = "PULL_TO_REFRESH";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r4.equals(r0) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = "SAVE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r4.equals(r0) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1 = "FEED_INTERACTION";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r3 = r10.A07;
        r3.markerPoint(974460948, r10.A00, r1);
        r3.markerEnd(974460948, r10.A00, 2);
        r10.A03 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r10.A05 != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r8 = r10.A07;
        r5 = r10.A01 + 1;
        r10.A01 = r5;
        r8.A0S(974475790, r5, A0C);
        r10.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        r1 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r1.equals("BACK_BUTTON_PRESS") == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r2 = r10.A07;
        r1 = r10.A01;
        r0 = "SCROLL_TO_TOP_BACK_BUTTON_PRESS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        r0 = r1.equals("LOGO_PRESS");
        r2 = r10.A07;
        r1 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        if (r0 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        r0 = "SCROLL_TO_TOP_LOGO_PRESS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        r0 = "SCROLL_TO_TOP_HOME_PRESS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r10.A05 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        r5 = r10.A07;
        r2 = r10.A01 + 1;
        r10.A01 = r2;
        r5.A0S(974475790, r2, A0C);
        r10.A05 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        r2 = r10.A07;
        r1 = r10.A01;
        r0 = "SCROLL_TO_TOP_MANUAL";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r2.markerPoint(974475790, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        if (r4.equals(r0) != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        if (r4.equals(r0) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0110, code lost:
        r5 = "FEED_INTERACTION";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0112, code lost:
        r3 = r10.A07;
        r3.markerPoint(974475790, r10.A01, r5);
        r3.markerEnd(974475790, r10.A01, 2);
        r10.A05 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012b, code lost:
        if (r0 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        switch(r1) {
            case 1: goto L_0x0082;
            case 2: goto L_0x00b5;
            default: goto L_0x0034;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        r10.A07.markerPoint(974475790, r10.A01, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r11) {
        /*
            r10 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r11.toUpperCase(r0)
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x004b
            com.google.common.collect.EvictingQueue r0 = r10.A06
            r0.add(r4)
            X.57F r0 = r10.A08
            if (r0 == 0) goto L_0x0021
            com.google.common.collect.EvictingQueue r3 = r0.A00
            long r1 = java.lang.System.currentTimeMillis()
            X.Xa6 r0 = new X.Xa6
            r0.<init>(r1, r4)
            r3.add(r0)
        L_0x0021:
            r5 = r4
            int r9 = r4.hashCode()
            java.lang.String r3 = "BACK_BUTTON_PRESS"
            java.lang.String r2 = "LOGO_PRESS"
            r1 = -1
            switch(r9) {
                case -1623297157: goto L_0x00d4;
                case -1112726381: goto L_0x00d7;
                case -778029462: goto L_0x00e2;
                case -754039584: goto L_0x00ed;
                case -47418416: goto L_0x00f0;
                case 2336663: goto L_0x00f3;
                case 2537853: goto L_0x0108;
                case 80841545: goto L_0x00f6;
                case 269852815: goto L_0x00f9;
                case 1291560753: goto L_0x00fe;
                case 1383160110: goto L_0x0127;
                default: goto L_0x002e;
            }
        L_0x002e:
            r6 = 974475790(0x3a15520e, float:5.696126E-4)
            switch(r1) {
                case 1: goto L_0x0082;
                case 2: goto L_0x00b5;
                default: goto L_0x0034;
            }
        L_0x0034:
            X.02m r1 = r10.A07
            int r0 = r10.A01
            r1.markerPoint(r6, r0, r4)
        L_0x003b:
            r1 = r4
            switch(r9) {
                case -1623297157: goto L_0x004c;
                case -754039584: goto L_0x004f;
                case -47418416: goto L_0x0052;
                case 2336663: goto L_0x0055;
                case 2537853: goto L_0x0064;
                case 80841545: goto L_0x0058;
                case 1291560753: goto L_0x005b;
                default: goto L_0x003f;
            }
        L_0x003f:
            X.02m r2 = r10.A07
            r1 = 974460948(0x3a151814, float:5.687487E-4)
            int r0 = r10.A00
            r2.markerPoint(r1, r0, r4)
        L_0x0049:
            r10.A02 = r4
        L_0x004b:
            return
        L_0x004c:
            java.lang.String r0 = "CAROUSEL_SWIPE"
            goto L_0x0066
        L_0x004f:
            java.lang.String r0 = "REEL_ITEM_CLICKED"
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "SCROLL_FEED"
            goto L_0x005d
        L_0x0055:
            java.lang.String r0 = "LIKE"
            goto L_0x0066
        L_0x0058:
            java.lang.String r0 = "SCROLL_REEL_TRAY"
            goto L_0x005d
        L_0x005b:
            java.lang.String r0 = "PULL_TO_REFRESH"
        L_0x005d:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x006e
            goto L_0x003f
        L_0x0064:
            java.lang.String r0 = "SAVE"
        L_0x0066:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = "FEED_INTERACTION"
        L_0x006e:
            X.02m r3 = r10.A07
            int r0 = r10.A00
            r2 = 974460948(0x3a151814, float:5.687487E-4)
            r3.markerPoint(r2, r0, r1)
            int r1 = r10.A00
            r0 = 2
            r3.markerEnd(r2, r1, r0)
            r0 = 0
            r10.A03 = r0
            goto L_0x0049
        L_0x0082:
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x0096
            X.02m r8 = r10.A07
            int r0 = r10.A01
            r7 = 1
            int r5 = r0 + 1
            r10.A01 = r5
            long r0 = A0C
            r8.A0S(r6, r5, r0)
            r10.A05 = r7
        L_0x0096:
            java.lang.String r1 = r10.A02
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x00a5
            X.02m r2 = r10.A07
            int r1 = r10.A01
            java.lang.String r0 = "SCROLL_TO_TOP_BACK_BUTTON_PRESS"
            goto L_0x00cf
        L_0x00a5:
            boolean r0 = r1.equals(r2)
            X.02m r2 = r10.A07
            int r1 = r10.A01
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "SCROLL_TO_TOP_LOGO_PRESS"
            goto L_0x00cf
        L_0x00b2:
            java.lang.String r0 = "SCROLL_TO_TOP_HOME_PRESS"
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r10.A05
            if (r0 != 0) goto L_0x00c9
            X.02m r5 = r10.A07
            int r0 = r10.A01
            r3 = 1
            int r2 = r0 + 1
            r10.A01 = r2
            long r0 = A0C
            r5.A0S(r6, r2, r0)
            r10.A05 = r3
        L_0x00c9:
            X.02m r2 = r10.A07
            int r1 = r10.A01
            java.lang.String r0 = "SCROLL_TO_TOP_MANUAL"
        L_0x00cf:
            r2.markerPoint(r6, r1, r0)
            goto L_0x003b
        L_0x00d4:
            java.lang.String r0 = "CAROUSEL_SWIPE"
            goto L_0x010a
        L_0x00d7:
            java.lang.String r0 = "AUTO_SCROLL_TO_TOP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002e
            r1 = 1
            goto L_0x002e
        L_0x00e2:
            java.lang.String r0 = "MANUAL_SCROLL_TO_TOP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002e
            r1 = 2
            goto L_0x002e
        L_0x00ed:
            java.lang.String r0 = "REEL_ITEM_CLICKED"
            goto L_0x0100
        L_0x00f0:
            java.lang.String r0 = "SCROLL_FEED"
            goto L_0x0100
        L_0x00f3:
            java.lang.String r0 = "LIKE"
            goto L_0x010a
        L_0x00f6:
            java.lang.String r0 = "SCROLL_REEL_TRAY"
            goto L_0x0100
        L_0x00f9:
            boolean r0 = r4.equals(r2)
            goto L_0x012b
        L_0x00fe:
            java.lang.String r0 = "PULL_TO_REFRESH"
        L_0x0100:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0112
            goto L_0x002e
        L_0x0108:
            java.lang.String r0 = "SAVE"
        L_0x010a:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r5 = "FEED_INTERACTION"
        L_0x0112:
            X.02m r3 = r10.A07
            int r0 = r10.A01
            r2 = 974475790(0x3a15520e, float:5.696126E-4)
            r3.markerPoint(r2, r0, r5)
            int r1 = r10.A01
            r0 = 2
            r3.markerEnd(r2, r1, r0)
            r0 = 0
            r10.A05 = r0
            goto L_0x003b
        L_0x0127:
            boolean r0 = r4.equals(r3)
        L_0x012b:
            if (r0 != 0) goto L_0x003b
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228302lG.A00(java.lang.String):void");
    }

    public final void A01(String str) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!this.A02.equals(upperCase)) {
            A00(upperCase);
        }
    }

    public C228302lG(UserSession userSession, AnonymousClass2l3 r4) {
        this.A08 = 28o.A00(userSession);
        this.A0A = r4;
        this.A09 = userSession;
    }

    public final void A02(String str) {
        A00(str);
        02m r2 = this.A07;
        if (r2.isMarkerOn(974462634, 0)) {
            r2.markerPoint(974462634, str);
            r2.markerEnd(974462634, 2);
        }
        AnonymousClass2l3 r3 = this.A0A;
        r3.A0I.A0N(r3.A00, r3, "SHIMMER_END", str);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        String str;
        int A032 = AnonymousClass0fD.A03(-1067362993);
        if (i == 0) {
            if (r3.COw()) {
                str = "MANUAL_SCROLL_TO_TOP";
            }
            AnonymousClass0fD.A0A(1722668555, A032);
        }
        if (i == 1) {
            A01("MANUAL_SCROLL_FEED");
            str = "SCROLL_FEED";
        }
        AnonymousClass0fD.A0A(1722668555, A032);
        A01(str);
        AnonymousClass0fD.A0A(1722668555, A032);
    }
}
