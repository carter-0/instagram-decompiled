package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import java.util.Date;

/* renamed from: X.3hc  reason: invalid class name and case insensitive filesystem */
public final class C248223hc extends 0vM {
    public final /* synthetic */ Date A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248223hc(Date date) {
        super("uploadProductConnectFunnelLogJob", 2081040861, 5, false, false);
        this.A00 = date;
    }

    public final void loggedRun() {
        AnonymousClass95K.A00();
        ConnectFunnel.CProxy.uploadLogsAtColdStartIfNecessary(002.A0R("file://", AnonymousClass1F2.A00().AXT((1LJ) null, 2027409170).getPath()), this.A00, 0MH.A01(0Pd.A0A, (Long) null), (McfReference) null, (McfReference) null);
    }
}
