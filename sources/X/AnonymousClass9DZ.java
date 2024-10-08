package X;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: X.9DZ  reason: invalid class name */
public final class AnonymousClass9DZ implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
