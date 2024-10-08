package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.6Aq  reason: invalid class name and case insensitive filesystem */
public abstract class C303756Aq {
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.6Ar] */
    public static AnonymousClass61R A00(Context context, int i) {
        InputStream openRawResource;
        C71532dv r4 = null;
        try {
            openRawResource = context.getResources().openRawResource(i);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
            while (true) {
                int read = openRawResource.read(bArr, 0, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            r4 = new Object().A00(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            openRawResource.close();
        } catch (Exception e) {
            0wb.A06("KeyFramesUtil", "Error when reading key frame UI", e);
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        if (r4 != null) {
            try {
                return new AnonymousClass61R(r4);
            } catch (AnonymousClass2dj e2) {
                0wb.A06("KeyFramesUtil", "Error when reading key frame UI", e2);
            }
        }
        return null;
        throw th;
    }
}
