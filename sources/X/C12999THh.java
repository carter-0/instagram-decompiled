package X;

import com.facebook.quicklog.EventBuilder;

/* renamed from: X.THh  reason: case insensitive filesystem */
public final class C12999THh implements Runnable {
    public final /* synthetic */ AnonymousClass37Y A00;
    public final /* synthetic */ String A01;

    public C12999THh(AnonymousClass37Y r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        EventBuilder level;
        String str;
        AnonymousClass37Y r0 = this.A00;
        02m r5 = r0.A09;
        r5.markerStart(728433975);
        String str2 = C71342cb.A00(r0.A0A).A0D;
        if (str2 != null) {
            String str3 = this.A01;
            if (0qQ.A0K(str3, str2)) {
                level = r5.markEventBuilder(728433975, "AppEntryResetUserNavigationBehavior").setLevel(7);
                str = "AppEntryMovedBackToLastVisited";
            } else {
                boolean equals = str2.equals("feed_timeline");
                EventBuilder markEventBuilder = r5.markEventBuilder(728433975, "AppEntryResetUserNavigationBehavior");
                if (equals) {
                    level = markEventBuilder.setLevel(7);
                    str = "AppEntryHoldOnFeed";
                } else {
                    markEventBuilder.setLevel(7).annotate("AppEntrySwitchedToAnotherSurface", 002.A0g(str3, "->", str2)).report();
                    r5.markerAnnotate(728433975, "AppEntrySwitchedToAnotherSurface", 002.A0g(str3, "->", str2));
                }
            }
            level.annotate(str, str3).report();
            r5.markerAnnotate(728433975, str, str3);
        }
        r5.markerEnd(728433975, 2);
    }
}
