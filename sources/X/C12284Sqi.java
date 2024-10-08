package X;

import com.facebook.smartcapture.logging.SmartCaptureLogger;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Sqi  reason: case insensitive filesystem */
public final class C12284Sqi implements C13584TdA {
    public final SmartCaptureLogger A00;
    public final Collection A01;

    public C12284Sqi(SmartCaptureLogger smartCaptureLogger, Collection collection) {
        0qQ.A0B(collection, 1);
        this.A01 = collection;
        this.A00 = smartCaptureLogger;
    }

    public final void D1q() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            try {
                AnonymousClass7TE.A0t(AnonymousClass7TE.A18(it)).delete();
            } catch (Exception e) {
                this.A00.logError("Unable to delete temp file", e);
            }
        }
    }
}
