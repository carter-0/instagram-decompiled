package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.OsI  reason: case insensitive filesystem */
public final class C71875OsI implements AnonymousClass1GR {
    public boolean A00 = true;
    public final UserSession A01;
    public final C68438NHy A02;
    public final String A03;
    public final Map A04 = AnonymousClass7TE.A1E();
    public final /* synthetic */ AnonymousClass43G A05;

    private final B72 A00(NGr nGr) {
        B72 b72;
        synchronized (nGr) {
            Map map = this.A04;
            b72 = (B72) map.get(nGr);
            if (b72 == null) {
                0c5 r2 = 0c9.A04;
                UserSession userSession = this.A01;
                C70413O5q o5q = nGr.A00;
                if (o5q == null) {
                    C41845B3m.A0v();
                    throw AnonymousClass00P.createAndThrow();
                }
                b72 = B73.parseFromJson(r2.A01(userSession, o5q.A00));
                map.put(nGr, b72);
                0qQ.A0A(b72);
            } else {
                map.remove(nGr);
            }
        }
        return b72;
    }

    public final /* synthetic */ void DTx() {
    }

    public C71875OsI(UserSession userSession, C68438NHy nHy, AnonymousClass43G r4, String str) {
        this.A05 = r4;
        this.A01 = userSession;
        this.A02 = nHy;
        this.A03 = str;
    }

    public final void DEO(C268654dm r4, AnonymousClass1QW r5) {
        this.A02.A05(AnonymousClass7BQ.A00(), this.A01);
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r4, AnonymousClass1QW r5, AnonymousClass2ZK r6) {
        NGr nGr = (NGr) r4;
        0qQ.A0B(nGr, 2);
        try {
            this.A02.A07(this.A01, A00(nGr));
        } catch (IOException e) {
            0KC.A0F("PendingInboxStreamingApiCallback", "onNewData", e);
            this.A02.A05(AnonymousClass7BQ.A00(), this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ void DTy(1XR r10, AnonymousClass1QW r11, AnonymousClass2ZK r12) {
        NGr nGr = (NGr) r10;
        0qQ.A0B(nGr, 2);
        try {
            B72 A002 = A00(nGr);
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36323466135350439L)) {
                C370748x0.A00().A00(userSession).A02(userSession, (AnonymousClass7BV) null, A002, this.A03);
            }
            AnonymousClass43G r2 = this.A05;
            for (1P0 onSuccessInBackground : r2.A0C) {
                onSuccessInBackground.onSuccessInBackground(A002);
            }
            r2.A09.A0O(r2.A08, A002, r2.A0A, C2611948q.ALL, this.A00);
            this.A00 = false;
        } catch (IOException e) {
            0KC.A0F("PendingInboxStreamingApiCallback", "onNewDataInBackground", e);
        }
    }

    public final void DeX() {
        this.A02.A01(this.A01);
    }

    public final void Den() {
        this.A02.A02(this.A01);
    }

    public final void D58(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public final void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }
}
