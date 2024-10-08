package X;

import android.media.UnsupportedSchemeException;
import java.util.UUID;

public final /* synthetic */ class WME implements X30 {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.X9c, java.lang.Object] */
    public final C21005X9c A7F(UUID uuid) {
        Exception exc;
        try {
            return new WMG(uuid);
        } catch (UnsupportedSchemeException e) {
            try {
                exc = new Exception(e);
                throw exc;
            } catch (AnonymousClass2A7 unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
                sb.append(uuid);
                2AG.A03("FrameworkMediaDrm", AnonymousClass7TF.A0l(".", sb));
                return new Object();
            }
        } catch (Exception e2) {
            exc = new Exception(e2);
            throw exc;
        }
    }
}
