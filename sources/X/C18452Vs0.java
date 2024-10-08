package X;

import android.util.Base64;
import com.facebook.cryptopub.CryptoPubNative;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Vs0  reason: case insensitive filesystem */
public final class C18452Vs0 {
    public static int A02 = 2;
    public static final CryptoPubNative A03 = new Object();
    public static final C293385ke A04 = new C293385ke();
    public static final AtomicBoolean A05 = JTQ.A0k();
    public C292875jf A00;
    public Integer A01;

    public static C17520VYy A00(String str, String str2) {
        try {
            return new C17520VYy("", Base64.encodeToString(A03.encrypt(41, C273654mx.A00(457), str, str2), 2), new C16694V1x("Default key used.", AnonymousClass05K.A00), 0);
        } catch (Exception e) {
            return new C17520VYy("", str, new C16694V1x(e, AnonymousClass05K.A01), 0);
        }
    }
}
