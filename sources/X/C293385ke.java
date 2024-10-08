package X;

import java.util.Calendar;

/* renamed from: X.5ke  reason: invalid class name and case insensitive filesystem */
public final class C293385ke {
    public final int A00;
    public final Integer A01;
    public final String A02;

    public C293385ke(int i, String str, String str2) {
        Integer num;
        this.A00 = i;
        this.A02 = str;
        if (str2.equals("ENCRYPTION_WITH_TAGGING")) {
            num = AnonymousClass05K.A00;
        } else if (str2.equals("PLAINTEXT_WITH_TAGGING")) {
            num = AnonymousClass05K.A01;
        } else {
            throw new IllegalArgumentException(str2);
        }
        this.A01 = num;
    }

    public C293385ke() {
        this.A00 = 41;
        this.A02 = "-----BEGIN PUBLIC KEY-----\nMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvcu1KMDR1vzuBr9iYKW8\nKWmhT8CVUBRkchiO8861H7zIOYRwkQrkeHA+0mkBo3Ly1PiLXDkbKQZyeqZbspke\n4e7WgFNwT23jHfRMV/cNPxjPEy4kxNEbzLET6GlWepGdXFhzHfnS1PinGQzj0ZOU\nZM3pQjgGRL9fAf8brt1ewhQ5XtpvKFdPyQq5BkeFEDKoInDsC/yKDWRAx2twgPFr\nCYUzAB8/yXuL30ErTHT79bt3yTnv1fRtE19tROIlBuqruwSBk9gGq/LuvSECgsl5\nz4VcpHXhgZt6MhrAj6y9vAAxO2RVrt0Mq4OY4HgyYz9Wlr1vAxXXGAAYIvrhAYLP\n7QIDAQAB\n-----END PUBLIC KEY-----\n";
        Calendar.getInstance().getTimeInMillis();
        this.A01 = AnonymousClass05K.A00;
    }
}
