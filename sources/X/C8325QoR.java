package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QoR  reason: case insensitive filesystem */
public final class C8325QoR extends C257213x2 {
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    public C8325QoR(Context context) {
        super(false);
        this.A04 = context.getAssets();
    }

    public final void close() {
        this.A01 = null;
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
        } catch (IOException e) {
            throw new C2609647s((int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (Throwable) e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A01();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.A01;
    }

    public final long open(C257263x7 r9) {
        try {
            Uri uri = r9.A06;
            this.A01 = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            A02();
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            long j = r9.A04;
            if (open.skip(j) >= j) {
                long j2 = r9.A03;
                if (j2 != -1) {
                    this.A00 = j2;
                } else {
                    long available = (long) this.A02.available();
                    this.A00 = available;
                    if (available == 2147483647L) {
                        this.A00 = -1;
                    }
                }
                this.A03 = true;
                A04(r9);
                return this.A00;
            }
            throw new C2609647s(2008, (Throwable) null);
        } catch (C8329QoV e) {
            throw e;
        } catch (IOException e2) {
            boolean z = e2 instanceof FileNotFoundException;
            int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            if (z) {
                i = 2005;
            }
            throw new C2609647s(i, (Throwable) e2);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, (long) i2);
                } catch (IOException e) {
                    throw new C2609647s((int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (Throwable) e);
                }
            }
            int read = this.A02.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A03(read);
                return read;
            }
        }
        return -1;
    }
}
