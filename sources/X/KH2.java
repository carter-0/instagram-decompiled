package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.TimeUnit;

public final class KH2 extends 2Cl {
    public final 1GK A00;
    public final MTZ A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ Object call() {
        String canonicalPath;
        try {
            1GK r4 = this.A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            0qQ.A0B(r4, 0);
            if (OX4.A02(r4, new OTS(5, timeUnit))) {
                File file = (File) r4.A07();
                if (!(file == null || (canonicalPath = file.getCanonicalPath()) == null)) {
                    this.A01.DVu(canonicalPath);
                    return null;
                }
            } else {
                0wj.A01.AEf("Failed to save Template Overlay", 18956031);
                this.A01.DVt();
            }
            return null;
        } catch (InterruptedException unused) {
            0wj.A01.AEf("Failed to save Template Overlay", 18956031);
            this.A01.DVt();
            return null;
        }
    }

    public final int getRunnableId() {
        return 1626698477;
    }

    public KH2(UserSession userSession, 1GK r2, MTZ mtz) {
        this.A00 = r2;
        this.A01 = mtz;
        this.A02 = userSession;
    }
}
