package com.facebook.mobileconfig;

import X.0KC;
import X.1AX;
import X.AnonymousClass7TE;
import X.C9153RRe;
import X.Pxe;
import X.RQY;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MobileConfigFileRepository {
    public static final String TAG = "MobileConfigFileRepository";
    public static final Map mFileCache = AnonymousClass7TE.A1E();
    public final Object mFileCacheLock = Pxe.A0p();

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.RQY] */
    public static ByteBuffer getJavaByteBuffer(String str) {
        if (str == null || str.isEmpty()) {
            0KC.A0D(TAG, "Filename should not be null or empty.");
        }
        Map map = mFileCache;
        RQY rqy = (RQY) map.get(str);
        if (rqy == null) {
            ByteBuffer readBuffer = readBuffer(str);
            if (readBuffer == null) {
                return null;
            }
            ? obj = new Object();
            obj.A00 = readBuffer;
            obj.A01 = new AtomicInteger(0);
            obj.A02 = false;
            map.put(str, obj);
            if (obj.A00 != null) {
                obj.A01.incrementAndGet();
                return obj.A00;
            }
            0KC.A0C(TAG, "Cannot create new reference for null buffer.");
            throw AnonymousClass7TE.A0z("ByteBuffer has already been released.");
        } else if (rqy.A00 != null) {
            rqy.A01.incrementAndGet();
            return rqy.A00;
        } else {
            0KC.A0C(TAG, "Cannot create new reference for null buffer.");
            throw AnonymousClass7TE.A0z("ByteBuffer has already been released.");
        }
    }

    public static ByteBuffer readBuffer(String str) {
        FileChannel channel;
        File A0t = AnonymousClass7TE.A0t(str);
        try {
            FileInputStream fileInputStream = new FileInputStream(A0t);
            try {
                channel = fileInputStream.getChannel();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) channel.size());
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                channel.read(allocateDirect);
                allocateDirect.flip();
                String A00 = 1AX.A00(allocateDirect, (int) A0t.length());
                if (!A00.isEmpty()) {
                    0KC.A0P(TAG, "Cannot validate (from direct read) \"%s\", err:%s", new Object[]{str, A00});
                    channel.close();
                    fileInputStream.close();
                    return null;
                }
                channel.close();
                fileInputStream.close();
                return allocateDirect;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            0KC.A0M(TAG, "Cannot open \"%s\"", e, new Object[]{str});
            return null;
        } catch (Throwable th2) {
            C9153RRe.A00(th, th2);
        }
    }

    public static void releaseBuffer(String str) {
        if (str == null || str.isEmpty()) {
            0KC.A0D(TAG, "Filename should not be null or empty.");
        }
        Map map = mFileCache;
        RQY rqy = (RQY) map.get(str);
        if (rqy != null) {
            if (rqy.A01.decrementAndGet() <= 0) {
                rqy.A00 = null;
                rqy.A02 = true;
            }
            if (rqy.A02) {
                map.remove(str);
            }
        }
    }

    public MobileConfigFileRepository() {
        throw Pxe.A0e("Cannot instantiate MobileConfigFileRepository.");
    }
}
