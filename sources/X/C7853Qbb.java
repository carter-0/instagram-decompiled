package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: X.Qbb  reason: case insensitive filesystem */
public final class C7853Qbb extends 1Ut {
    public final Context A00;

    public final MappedByteBuffer A01() {
        FileInputStream createInputStream;
        try {
            AssetFileDescriptor openFd = this.A00.getAssets().openFd("strings/default.frsc");
            try {
                createInputStream = openFd.createInputStream();
                MappedByteBuffer map = createInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getLength());
                createInputStream.close();
                openFd.close();
                return map;
            } catch (Throwable th) {
                if (openFd != null) {
                    openFd.close();
                }
                throw th;
            }
            throw th;
        } catch (IOException e) {
            throw Pxe.A0u("Error loading default.frsc", e);
        } catch (Throwable th2) {
            C9153RRe.A00(th, th2);
        }
    }

    public C7853Qbb(Context context, 1Qo r2, Locale locale) {
        super(context, r2, locale);
        this.A00 = context;
    }
}
