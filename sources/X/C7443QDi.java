package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QDi  reason: case insensitive filesystem */
public final class C7443QDi extends C22071Xux {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    public C7443QDi(Context context) {
        super(false);
        this.A05 = context.getContentResolver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0040, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        if (r5.A04 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005b, code lost:
        r5.A04 = false;
        A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0060, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            r4 = 0
            r5.A02 = r4
            r3 = 0
            java.io.FileInputStream r0 = r5.A03     // Catch:{ IOException -> 0x0029 }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x000b:
            r5.A03 = r4
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x001f
            r5.A04 = r3
            r5.A02()
        L_0x001f:
            return
        L_0x0020:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDn r0 = new X.QDn     // Catch:{ all -> 0x0054 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0029:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDn r0 = new X.QDn     // Catch:{ all -> 0x0032 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            r5.A03 = r4
            android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch:{ IOException -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x0043 }
        L_0x003c:
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
            goto L_0x005b
        L_0x0043:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            X.QDn r0 = new X.QDn     // Catch:{ all -> 0x004c }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
            goto L_0x005b
        L_0x0054:
            r1 = move-exception
            r5.A01 = r4
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0060
        L_0x005b:
            r5.A04 = r3
            r5.A02()
        L_0x0060:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7443QDi.close():void");
    }

    public final long E0f(SH8 sh8) {
        AssetFileDescriptor openAssetFileDescriptor;
        C8841RCg rCg;
        int i = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        SH8 sh82 = sh8;
        try {
            Uri normalizeScheme = sh82.A01.normalizeScheme();
            this.A02 = normalizeScheme;
            A03();
            if ("content".equals(normalizeScheme.getScheme())) {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(normalizeScheme, "*/*", A0a);
            } else {
                openAssetFileDescriptor = this.A05.openAssetFileDescriptor(normalizeScheme, "r");
            }
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.A03 = fileInputStream;
                if (length == -1 || sh82.A00 <= length) {
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long j = sh82.A00;
                    long skip = fileInputStream.skip(j + startOffset) - startOffset;
                    if (skip == j) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.A00 = -1;
                            } else {
                                long position = size - channel.position();
                                this.A00 = position;
                                if (position < 0) {
                                    rCg = new C8841RCg(2008, (Throwable) null);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.A00 = j2;
                            if (j2 < 0) {
                                rCg = new C8841RCg(2008, (Throwable) null);
                            }
                        }
                        this.A04 = true;
                        A05(sh82);
                        return this.A00;
                    }
                    rCg = new C8841RCg(2008, (Throwable) null);
                } else {
                    rCg = new C8841RCg(2008, (Throwable) null);
                }
            } else {
                rCg = new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, JTO.A0u(AnonymousClass7TG.A0m(normalizeScheme, "Could not open file descriptor for: ", AnonymousClass7TE.A1A())));
            }
            throw rCg;
        } catch (C7448QDn e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C8841RCg(i, e2);
        }
    }

    public final Uri getUri() {
        return this.A02;
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
                    throw new C8841RCg(CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, e);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A04(read);
                return read;
            }
        }
        return -1;
    }
}
