package X;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.6QH  reason: invalid class name */
public final class AnonymousClass6QH {
    public final SecretKey A00;

    public AnonymousClass6QH() {
        SecretKey generateKey = KeyGenerator.getInstance("AES").generateKey();
        0qQ.A07(generateKey);
        this.A00 = generateKey;
    }
}
