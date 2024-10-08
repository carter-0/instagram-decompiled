package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.user.model.FollowStatus;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.NRl  reason: case insensitive filesystem */
public final class C68654NRl extends 0ng {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ AnonymousClass3KA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68654NRl(BanyanCoordinator banyanCoordinator, AnonymousClass3KA r5) {
        super(19, 3, true, true);
        this.A01 = r5;
        this.A00 = banyanCoordinator;
    }

    public final void run() {
        InterruptedException th;
        AnonymousClass3KA r2 = this.A01;
        if (r2.A00 == FollowStatus.A06) {
            BanyanCoordinator banyanCoordinator = this.A00;
            String str = r2.A01;
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = banyanCoordinator.A09.A00;
                if (C66582MXn.A1V(reentrantReadWriteLock)) {
                    try {
                        C290675fi r5 = banyanCoordinator.A07;
                        C290655fg r3 = r5.A02;
                        r3.A00();
                        Map map = r5.A07;
                        C290935gF r0 = (C290935gF) map.get("direct_inbox_active_now");
                        if (r0 != null) {
                            C66580MXl.A1S(r0.A04, str);
                        }
                        r3.A00();
                        C290935gF r02 = (C290935gF) map.get("direct_inbox_active_now");
                        if (r02 != null) {
                            Iterator A0s = AnonymousClass7TF.A0s(r02.A04);
                            while (A0s.hasNext()) {
                                Object key = AnonymousClass7TE.A1J(A0s).getKey();
                                Map map2 = r5.A08;
                                if (map2.get(key) != null) {
                                    Object obj = map2.get(key);
                                    0qQ.A0A(obj);
                                    Iterator A0o = DbY.A0o(((C290915gD) obj).A0B);
                                    while (true) {
                                        if (A0o.hasNext()) {
                                            if (0qQ.A0K(DbT.A0k(A0o).getId(), str)) {
                                                A0s.remove();
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        r3.A00();
                        C290675fi.A00(r5, (C293635l6) null);
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
                0KC.A0F("BanyanCoordinator", C273654mx.A00(12), e);
            }
        }
    }
}
