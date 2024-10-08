package X;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: X.5rj  reason: invalid class name and case insensitive filesystem */
public abstract class C297425rj extends 2RM {
    public static Mac A00(String str, Key key) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(key);
            return instance;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
