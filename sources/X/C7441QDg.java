package X;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QDg  reason: case insensitive filesystem */
public final class C7441QDg extends C22071Xux {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C7441QDg() {
        super(false);
    }

    public final void close() {
        this.A01 = null;
        try {
            RandomAccessFile randomAccessFile = this.A02;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A02();
            }
        } catch (IOException e) {
            throw new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                A02();
            }
            throw th;
        }
    }

    public final long E0f(SH8 sh8) {
        Uri uri = sh8.A01;
        this.A01 = uri;
        A03();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.A02 = randomAccessFile;
            try {
                long j = sh8.A00;
                randomAccessFile.seek(j);
                long length = this.A02.length() - j;
                this.A00 = length;
                if (length >= 0) {
                    this.A03 = true;
                    A05(sh8);
                    return this.A00;
                }
                throw new C8841RCg((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C8841RCg(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            Throwable cause = e2.getCause();
            if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EACCES) {
                i = 2005;
            }
            throw new C8841RCg(i, e2);
        } catch (SecurityException e3) {
            throw new C8841RCg(2006, e3);
        } catch (RuntimeException e4) {
            throw new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e4);
        }
    }

    public final Uri getUri() {
        return this.A01;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A04(read);
            return read;
        } catch (IOException e) {
            throw new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
        }
    }
}
