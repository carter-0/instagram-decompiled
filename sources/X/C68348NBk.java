package X;

import java.util.Map;

/* renamed from: X.NBk  reason: case insensitive filesystem */
public final class C68348NBk extends AnonymousClass45Y {
    public final /* synthetic */ C72939PPx A00;
    public final /* synthetic */ Map A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68348NBk(C72939PPx pPx, Map map) {
        super("start");
        this.A00 = pPx;
        this.A01 = map;
    }

    public final void run() {
        Object obj;
        C72939PPx pPx = this.A00;
        Map map = this.A01;
        if (map != null) {
            obj = map.get("MEMContextConnectionStateChangeUserInfoKey");
        } else {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null && number.intValue() == 0) {
            boolean z = pPx.A0A;
            0Jv r0 = pPx.A05;
            if (z) {
                if (r0 != null) {
                    C72939PPx.A04(pPx, r0, "MEMConnectionStateDisconnected");
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (r0 != null) {
                C72939PPx.A03(pPx, r0, "MEMConnectionStateDisconnected");
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }
}
