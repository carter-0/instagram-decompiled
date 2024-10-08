package X;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;

/* renamed from: X.Oq0  reason: case insensitive filesystem */
public final class C71740Oq0 implements AnonymousClass66d {
    public final /* synthetic */ AnonymousClass638 A00;
    public final /* synthetic */ SettableFuture A01;

    public C71740Oq0(AnonymousClass638 r1, SettableFuture settableFuture) {
        this.A00 = r1;
        this.A01 = settableFuture;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r5, Map map) {
        AnonymousClass638 r2;
        SettableFuture settableFuture;
        C301055yO r0;
        Boolean bool;
        if (map == null || (bool = (Boolean) map.get("ACTRegistrationResult")) == null) {
            r2 = this.A00;
            settableFuture = this.A01;
            r0 = C301055yO.A08;
        } else {
            boolean booleanValue = bool.booleanValue();
            r2 = this.A00;
            settableFuture = this.A01;
            if (booleanValue) {
                r0 = C301055yO.A09;
            } else {
                r0 = C301055yO.A07;
            }
        }
        AnonymousClass638.A01(r2, r0, settableFuture);
    }
}
