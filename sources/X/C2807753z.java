package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.53z  reason: invalid class name and case insensitive filesystem */
public final class C2807753z implements AnonymousClass540 {
    public Timer A00;
    public final C278704xO A01;
    public final Set A02 = Collections.synchronizedSet(new HashSet());
    public final TimerTask A03;
    public final /* synthetic */ C278724xQ A04;

    public C2807753z(C278704xO r5, C278724xQ r6) {
        this.A04 = r6;
        long millis = TimeUnit.MINUTES.toMillis(3);
        this.A01 = r5;
        AnonymousClass541 r3 = new AnonymousClass541(this, r6);
        this.A03 = r3;
        Timer timer = new Timer();
        this.A00 = timer;
        timer.schedule(r3, millis);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AVX(java.lang.String r6) {
        /*
            r5 = this;
            long r1 = android.os.SystemClock.uptimeMillis()
            X.5HO r0 = new X.5HO
            r0.<init>(r6, r1)
            X.11Z.A02(r0)
            java.util.Set r3 = r5.A02
            r3.add(r6)
            X.4xQ r2 = r5.A04
            X.4xP r1 = r2.A07
            int r0 = r6.hashCode()
            switch(r0) {
                case -1973589566: goto L_0x0026;
                case -1065690145: goto L_0x0031;
                case -124356989: goto L_0x003c;
                case -115550250: goto L_0x0047;
                case 1025047531: goto L_0x0052;
                case 1364928579: goto L_0x005d;
                default: goto L_0x001c;
            }
        L_0x001c:
            X.542 r4 = X.AnonymousClass542.UNKNOWN
        L_0x001e:
            boolean r0 = X.C278714xP.A01(r1)
            if (r0 == 0) goto L_0x0072
            monitor-enter(r1)
            goto L_0x0068
        L_0x0026:
            java.lang.String r0 = "feed_parsing_test"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.FEED_PARSING_TEST
            goto L_0x001e
        L_0x0031:
            java.lang.String r0 = "self_profile_background_prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.PROFILE
            goto L_0x001e
        L_0x003c:
            java.lang.String r0 = "direct_xma_clips_background_prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.DIRECT_XMA_CLIPS
            goto L_0x001e
        L_0x0047:
            java.lang.String r0 = "explore_popular_background_prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.EXPLORE
            goto L_0x001e
        L_0x0052:
            java.lang.String r0 = "feed_timeline_background_prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.MAIN_FEED
            goto L_0x001e
        L_0x005d:
            java.lang.String r0 = "reel_background_prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.542 r4 = X.AnonymousClass542.STORY
            goto L_0x001e
        L_0x0068:
            java.util.List r0 = r1.A03     // Catch:{ all -> 0x006e }
            r0.add(r4)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0071:
            monitor-exit(r1)
        L_0x0072:
            int r1 = r3.size()
            java.util.List r0 = r2.A08
            int r0 = r0.size()
            if (r1 != r0) goto L_0x009f
            java.util.Timer r0 = r5.A00
            if (r0 == 0) goto L_0x0085
            r0.cancel()
        L_0x0085:
            X.4xO r3 = r5.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 1
            r3.DFq(r1, r0)
            X.53x r1 = r2.A00
            if (r1 == 0) goto L_0x009f
            java.lang.ThreadLocal r0 = X.C2807553x.A01
            java.lang.Object r0 = r0.get()
            r0.getClass()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.remove(r1)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2807753z.AVX(java.lang.String):void");
    }
}
