package X;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: X.9Db  reason: invalid class name and case insensitive filesystem */
public final class C375309Db implements AnonymousClass9DW {
    public final /* bridge */ /* synthetic */ Object BHx(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
