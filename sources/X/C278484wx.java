package X;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES10;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: X.4wx  reason: invalid class name and case insensitive filesystem */
public abstract class C278484wx {
    public static C257443xP A00 = C2612848z.A00;
    public static Map A01;
    public static final List A02 = Arrays.asList(new String[]{"SM-N770F", "SM-A515F"});

    public static Map A00() {
        RuntimeException runtimeException;
        boolean z;
        boolean z2;
        int i = 0;
        EGLSurface eGLSurface = null;
        C278494wy r4 = null;
        if (A02.contains(Build.MODEL)) {
            return new HashMap();
        }
        if (A01 == null) {
            A01 = new HashMap();
            try {
                if (((EGL10) EGLContext.getEGL()).eglGetCurrentContext().equals(EGL10.EGL_NO_CONTEXT)) {
                    r4 = new C278494wy();
                    eGLSurface = r4.A00();
                    if (EGL14.eglMakeCurrent(r4.A02, eGLSurface, eGLSurface, r4.A01)) {
                        z = true;
                    } else {
                        runtimeException = new RuntimeException("eglMakeCurrent failed");
                        throw runtimeException;
                    }
                } else {
                    z = false;
                }
                int[] iArr = new int[1];
                GLES20.glGetIntegerv(34466, iArr, 0);
                int i2 = iArr[0];
                int[] iArr2 = new int[i2];
                GLES20.glGetIntegerv(34467, iArr2, 0);
                while (true) {
                    if (i >= i2) {
                        z2 = false;
                        break;
                    } else if (iArr2[i] == 37496) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z2) {
                    A01.put("etc2_compression", true);
                }
                if (GLES10.glGetString(7939).contains("GL_IMG_texture_compression_pvrtc")) {
                    A01.put("pvr_compression", true);
                }
                if (z) {
                    EGLDisplay eGLDisplay = r4.A02;
                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT)) {
                        EGL14.eglDestroySurface(r4.A02, eGLSurface);
                        r4.A01();
                    } else {
                        runtimeException = new RuntimeException("eglMakeCurrent failed");
                        throw runtimeException;
                    }
                }
            } catch (Throwable th) {
                Log.e("SDKInfo", "Error while checking for capabilities", th);
            }
        }
        return A01;
    }
}
