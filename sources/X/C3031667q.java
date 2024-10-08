package X;

import com.facebook.msys.mcs.SyncHandler;

/* renamed from: X.67q  reason: invalid class name and case insensitive filesystem */
public final class C3031667q implements C3031367n {
    public final /* synthetic */ void Ezd() {
    }

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r3 = (C3031167l) obj;
        0qQ.A0B(r3, 0);
        SyncHandler syncHandler = r3.A01.getSyncHandler();
        AnonymousClass1aS r0 = 1aD.A06;
        if (syncHandler != null) {
            syncHandler.enableTraceType(2);
            syncHandler.enableTraceType(1);
            syncHandler.enableTraceType(10);
            syncHandler.enableTraceType(13);
            syncHandler.enableTraceType(14);
            syncHandler.enableTraceType(15);
            syncHandler.enableTraceType(16);
            syncHandler.enableTraceType(17);
            return;
        }
        0KC.A0E("IgMsysMailboxProvider", "SyncHandler was null");
    }
}
