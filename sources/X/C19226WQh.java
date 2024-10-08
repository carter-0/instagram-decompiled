package X;

import android.util.LruCache;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WQh  reason: case insensitive filesystem */
public final class C19226WQh implements 1wn, AnonymousClass0lh {
    public static final long A04 = TimeUnit.MILLISECONDS.convert(15, TimeUnit.MINUTES);
    public final long A00;
    public final LruCache A01 = new LruCache(30);
    public final C61410nE A02;
    public final HashMap A03 = new HashMap(30);

    public /* synthetic */ C19226WQh(C61410nE r5) {
        long j = A04;
        0qQ.A0B(r5, 1);
        this.A02 = r5;
        this.A00 = j;
    }

    public final void A00() {
        this.A01.evictAll();
        this.A03.clear();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(1128884658);
        int A033 = AnonymousClass0fD.A03(-1604188603);
        A00();
        AnonymousClass0fD.A0A(-258755183, A033);
        AnonymousClass0fD.A0A(205573268, A032);
    }

    public final void onSessionWillEnd() {
        A00();
    }
}
