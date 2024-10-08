package X;

import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.NRg  reason: case insensitive filesystem */
public final class C68649NRg extends 0ng {
    public final /* synthetic */ C290675fi A00;
    public final /* synthetic */ String A01;

    public final void run() {
        InterruptedException th;
        try {
            C290675fi r6 = this.A00;
            C290655fg r1 = r6.A02;
            ReentrantReadWriteLock reentrantReadWriteLock = r1.A00;
            if (C66582MXn.A1V(reentrantReadWriteLock)) {
                try {
                    r1.A00();
                    Map map = r6.A08;
                    String str = this.A01;
                    C290915gD r2 = (C290915gD) map.get(str);
                    if (r2 != null) {
                        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = r2.A03;
                        if (creatorBroadcastThreadInfo != null) {
                            creatorBroadcastThreadInfo.A07 = true;
                        } else {
                            DiscoverableThreadInfo discoverableThreadInfo = r2.A05;
                            if (discoverableThreadInfo != null) {
                                discoverableThreadInfo.A03 = true;
                            }
                        }
                        map.put(str, r2);
                        C290675fi.A01(r6, r2);
                        C290675fi.A00(r6, (C293635l6) null);
                    }
                    C66580MXl.A1W(reentrantReadWriteLock);
                } catch (Throwable th2) {
                    th = th2;
                    C66580MXl.A1W(reentrantReadWriteLock);
                }
            } else {
                th = new InterruptedException("Failed to claim lock after 1 seconds");
                throw th;
            }
        } catch (InterruptedException e) {
            0KC.A0F("BanyanCache", C273654mx.A00(12), e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68649NRg(C290675fi r4, String str) {
        super(1929549509, 3, false, false);
        this.A00 = r4;
        this.A01 = str;
    }
}
