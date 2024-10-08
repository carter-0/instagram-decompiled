package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.Shb  reason: case insensitive filesystem */
public final class C11849Shb implements C13529Tc1 {
    public final /* bridge */ /* synthetic */ boolean ARr(C11856Shi shi, File file, Object obj) {
        try {
            SL7.A01(file, (ByteBuffer) obj);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
