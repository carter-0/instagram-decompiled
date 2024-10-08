package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vzt  reason: case insensitive filesystem */
public final class C18758Vzt {
    public int A00;
    public Map A01;
    public Set A02;
    public final int A03;
    public final X8G A04;
    public final VLT A05;
    public final C17876VhT A06;
    public final AnonymousClass1TV A07;
    public final ConcurrentHashMap A08;
    public final VLS A09;
    public volatile int A0A;
    public volatile boolean A0B;

    public C18758Vzt(X8G x8g, VLS vls, C17876VhT vhT, AnonymousClass1TV r7, int i) {
        this.A07 = r7;
        this.A06 = vhT;
        this.A09 = vls;
        this.A04 = x8g;
        int A002 = (A00(x8g) * i) / IgNetworkConsentStorage.MAX_ENTRIES;
        A002 = A002 < 1 ? 1 : A002;
        this.A03 = A002;
        this.A08 = new ConcurrentHashMap();
        this.A05 = new VLT(this.A04.getFrameCount());
        this.A00 = -1;
        this.A01 = 0Yt.A0E();
        this.A02 = 0sl.A00;
        A02(A00(this.A04));
        this.A0A = (int) (((float) A002) * 0.5f);
    }

    public static final int A00(X8G x8g) {
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (x8g.BOg() / x8g.getFrameCount()));
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public static final void A01(C18758Vzt vzt, int i, int i2) {
        if (!vzt.A0B) {
            vzt.A0B = true;
            C10069Rm6.A00.execute(new C20270WoL(vzt, i, i2));
        }
    }

    public final void A02(int i) {
        X8G x8g = this.A04;
        int BOg = x8g.BOg();
        int loopCount = x8g.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = BOg * loopCount;
        VLS vls = this.A09;
        int frameCount = x8g.getFrameCount();
        int A002 = A00(x8g);
        if (i > A002) {
            i = A002;
        }
        if (i < 1) {
            i = 1;
        }
        int i3 = vls.A00;
        if (i > i3) {
            i = i3;
        }
        float f = ((float) i) * (((float) i2) / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = (float) frameCount;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i4 = 0;
        2HY A0C = C229632nm.A0C(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(JTT.A08(A0C));
        for (Object next : A0C) {
            int A0M = AnonymousClass7TE.A0M(next);
            if (((int) (((float) A0M) % f3)) == 0) {
                i4 = A0M;
            }
            C66580MXl.A1T(next, linkedHashMap, i4);
        }
        this.A01 = linkedHashMap;
        this.A02 = 00k.A0k(linkedHashMap.values());
    }
}
