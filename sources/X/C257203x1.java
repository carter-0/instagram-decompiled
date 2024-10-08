package X;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3x1  reason: invalid class name and case insensitive filesystem */
public final class C257203x1 extends C257213x2 {
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public C257203x1() {
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

    public final long open(C257263x7 r8) {
        27d.A01("fileSrcReadOpen");
        Uri uri = r8.A06;
        this.A01 = uri;
        A02();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.A02 = randomAccessFile;
            try {
                long j = r8.A04;
                randomAccessFile.seek(j);
                long j2 = r8.A03;
                if (j2 == -1) {
                    j2 = this.A02.length() - j;
                }
                this.A00 = j2;
                27d.A00();
                if (this.A00 >= 0) {
                    this.A03 = true;
                    A04(r8);
                    return this.A00;
                }
                throw new C2609647s((String) null, (Throwable) null, 2008);
            } catch (IOException e) {
                throw new C2609647s((int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (Throwable) e);
            } catch (Throwable th) {
                27d.A00();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new C2609647s(String.format(Pxd.A00(915), new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e2, 1004);
            }
            Throwable cause = e2.getCause();
            if (!(cause instanceof ErrnoException) || ((ErrnoException) cause).errno != OsConstants.EACCES) {
                i = 2005;
            }
            throw new C2609647s(i, (Throwable) e2);
        } catch (SecurityException e3) {
            throw new C2609647s(2006, (Throwable) e3);
        } catch (RuntimeException e4) {
            throw new C2609647s((int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (Throwable) e4);
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        try {
            27d.A01("fileSrcReadRAF");
            int read = this.A02.read(bArr, i, (int) Math.min(this.A00, (long) i2));
            27d.A00();
            if (read <= 0) {
                return read;
            }
            this.A00 -= (long) read;
            A03(read);
            return read;
        } catch (IOException e) {
            throw new C2609647s((int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, (Throwable) e);
        } catch (Throwable th) {
            27d.A00();
            throw th;
        }
    }
}
