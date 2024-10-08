package X;

import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

/* renamed from: X.7ti  reason: invalid class name and case insensitive filesystem */
public final class C345557ti {
    public final Resources A00;

    public static String A00(C345557ti r3, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(r3.A00.openRawResource(i));
        try {
            StringBuilder sb = new StringBuilder();
            CharBuffer allocate = CharBuffer.allocate(C249703kE.FLAG_MOVED);
            while (inputStreamReader.read(allocate) != -1) {
                allocate.flip();
                sb.append(allocate);
                allocate.clear();
            }
            String obj = sb.toString();
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
            return obj;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            try {
                inputStreamReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public final C361248fu A03(String str, String str2, boolean z) {
        String obj;
        if (!z) {
            String[] split = str2.split("\n");
            String str3 = split[0];
            if (str3.equals("#extension GL_OES_EGL_image_external : require")) {
                obj = str2.substring(str3.length() + 1);
            } else if (!str3.equals("#version 300 es")) {
                throw new IllegalStateException("Fragment shader's first line must be:\n#extension GL_OES_EGL_image_external : require");
            } else if (split[2].equals("#extension GL_OES_EGL_image_external : require")) {
                StringBuilder sb = new StringBuilder("");
                for (int i = 0; i < split.length; i++) {
                    if (i != 2) {
                        sb.append(split[i]);
                        sb.append(10);
                    }
                }
                obj = sb.toString();
            } else {
                throw new IllegalStateException("Fragment shader's fourth line must be:\n#extension GL_OES_EGL_image_external : require");
            }
            str2 = obj.replaceFirst("samplerExternalOES", "sampler2D").replaceFirst("__samplerExternal2DY2YEXT", "sampler2D");
        }
        return new C361248fu(str, str2);
    }

    public C345557ti(Resources resources) {
        this.A00 = resources;
    }

    public final C361248fu A01(int i, int i2) {
        return new C361248fu(A00(this, i), A00(this, i2));
    }

    public final C361248fu A02(int i, int i2, boolean z) {
        return A03(A00(this, i), A00(this, i2), z);
    }
}
