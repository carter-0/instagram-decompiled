package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5fv  reason: invalid class name and case insensitive filesystem */
public final class C290765fv implements 1wn {
    public final /* synthetic */ BanyanCoordinator A00;
    public final /* synthetic */ UserSession A01;

    public C290765fv(BanyanCoordinator banyanCoordinator, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = banyanCoordinator;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(1684122280);
        int A032 = AnonymousClass0fD.A03(648962707);
        if (!182.A06(0Tu.A05, this.A01, 36324355193581598L) || System.currentTimeMillis() - this.A00.A01 > TimeUnit.SECONDS.toMillis(30)) {
            this.A00.A0G((ArrayList) null);
        }
        AnonymousClass0fD.A0A(510372786, A032);
        AnonymousClass0fD.A0A(-1849468874, A03);
    }
}
