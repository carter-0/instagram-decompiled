package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.SiH  reason: case insensitive filesystem */
public abstract class C11884SiH implements C13812Thf {
    public Object A00;
    public final AssetManager A01;
    public final String A02;

    public final void cancel() {
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        Object openFd;
        try {
            AssetManager assetManager = this.A01;
            String str = this.A02;
            if (this instanceof C7506QGx) {
                openFd = assetManager.open(str);
            } else {
                openFd = assetManager.openFd(str);
            }
            this.A00 = openFd;
            tfA.D7o(openFd);
        } catch (IOException e) {
            Log.isLoggable("AssetPathFetcher", 3);
            tfA.DOG(e);
        }
    }

    public final void cleanup() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                if (this instanceof C7506QGx) {
                    ((InputStream) obj).close();
                } else {
                    ((AssetFileDescriptor) obj).close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public C11884SiH(AssetManager assetManager, String str) {
        this.A01 = assetManager;
        this.A02 = str;
    }
}
