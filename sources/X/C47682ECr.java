package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.ECr  reason: case insensitive filesystem */
public final class C47682ECr extends 1P0 {
    public final /* synthetic */ 1Cj A00;

    public C47682ECr(1Cj r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -1842830835);
        C47682ECr.super.onFail(r3);
        C638918c.A01(C61170le.A00).A0D();
        AnonymousClass0fD.A0A(944698855, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(981079222);
        C47682ECr.super.onFinish();
        AnonymousClass0fD.A0A(55169176, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1654414737);
        C47682ECr.super.onStart();
        1Cj r2 = this.A00;
        r2.A00 = System.currentTimeMillis();
        1Cj.A02(r2, false);
        AnonymousClass0fD.A0A(-134674502, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-82709473);
        1XM r8 = (1XM) obj;
        int A0D = AnonymousClass7TG.A0D(r8, -353525099);
        C47682ECr.super.onSuccessInBackground(r8);
        C62880wX r1 = C61170le.A00;
        18g A01 = C638918c.A01(r1);
        if (r8.mFromDiskCache) {
            C638918c.A01(r1).A0D();
            A01.A0P(A01.A02, "CACHED_FEED_START", AwakeTimeSinceBootClock.INSTANCE.now());
            18g.A0A(A01, new AnonymousClass9NK(A01.A0G.getValue(), 8), new C73654PhT(A01, 11));
        } else if (!r8.A0O) {
            A01.A0E();
            1Cj.A01();
        } else {
            A01.A0O(A01.A02, "SHELL_RESPONSE_PARSED");
            A01.A0O(A01.A02, "SHELL_RESPONSE_SUCCESS");
        }
        if (r8.A0J != null) {
            1Av A002 = 1Au.A00(this.A00.A06);
            0qQ.A0B(A002, 1);
            String A003 = C2612548w.A00(",", r8.A0J);
            0qQ.A07(A003);
            DbS.A1a(A002, A003, A002.A0Q, 1Av.A8a, 47);
        }
        this.A00.A05(r8);
        AnonymousClass0fD.A0A(-109248043, A0D);
        AnonymousClass0fD.A0A(164490470, A03);
    }
}
