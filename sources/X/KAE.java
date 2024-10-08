package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$LIVE;

public final class KAE extends 1P0 {
    public final /* synthetic */ C45458Cwp A00;

    public KAE(C45458Cwp cwp) {
        this.A00 = cwp;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1709562657);
        DLog.e(DLogTag$LIVE.INSTANCE, 0mp.A06("confirm failed: %s", new Object[]{this.A00}), new Object[0]);
        AnonymousClass0fD.A0A(-1753660413, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(786796272);
        int A032 = AnonymousClass0fD.A03(-979636725);
        DLog.d(DLogTag$LIVE.INSTANCE, 0mp.A06("confirmed: %s", new Object[]{this.A00}), new Object[0]);
        AnonymousClass0fD.A0A(-448654687, A032);
        AnonymousClass0fD.A0A(1165020277, A03);
    }
}
