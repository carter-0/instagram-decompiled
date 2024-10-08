package X;

import android.content.SharedPreferences;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import java.util.Arrays;
import org.webrtc.EglBase10Impl;

/* renamed from: X.W1p  reason: case insensitive filesystem */
public abstract class C18787W1p {
    public static void A04(SharedPreferences sharedPreferences) {
        String str;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{EglBase10Impl.EGL_CONTEXT_CLIENT_VERSION, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("opengles_renderer", GLES20.glGetString(7937));
        edit.putString("opengles_vendor", GLES20.glGetString(7936));
        String glGetString = GLES20.glGetString(7938);
        edit.putString("opengles_version", glGetString);
        int[] iArr2 = new int[2];
        GLES20.glGetIntegerv(3379, iArr2, 0);
        edit.putInt("opengles_max_texture_size_pixels", iArr2[0]);
        GLES20.glGetIntegerv(34930, iArr2, 0);
        edit.putInt("opengles_max_image_texture_units", iArr2[0]);
        GLES20.glGetIntegerv(35660, iArr2, 0);
        edit.putInt("opengles_max_vertex_texture_image_units", iArr2[0]);
        GLES20.glGetIntegerv(35661, iArr2, 0);
        edit.putInt("opengles_max_combined_texture_image_units", iArr2[0]);
        if (glGetString != null) {
            String[] split = glGetString.split(" ");
            if (split.length > 2 && ((double) Float.parseFloat(split[2])) >= 3.2d) {
                GLES20.glGetIntegerv(35881, iArr2, 0);
                edit.putInt("opengles_max_geometry_texture_image_units", iArr2[0]);
            }
        }
        GLES20.glGetIntegerv(34076, iArr2, 0);
        edit.putInt("opengles_max_cube_map_texture_size", iArr2[0]);
        GLES20.glGetIntegerv(34024, iArr2, 0);
        edit.putInt("opengles_max_renderbuffer_size", iArr2[0]);
        GLES20.glGetIntegerv(3386, iArr2, 0);
        edit.putInt("opengles_max_viewport_width", iArr2[0]);
        edit.putInt("opengles_max_viewport_height", iArr2[1]);
        String glGetString2 = GLES20.glGetString(7939);
        if (glGetString2 == null || glGetString2.isEmpty()) {
            str = "";
        } else {
            String[] split2 = glGetString2.split("\\s+");
            Arrays.sort(split2);
            str = C69696NqI.A00(",", split2);
        }
        edit.putString("opengles_extensions", str);
        edit.commit();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
    }

    public static String A01(SharedPreferences sharedPreferences, C17304VQf vQf) {
        String str = vQf.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.GET_FAILED");
        if (string != null && !string.equals("com.facebook.devicesegmentation.GET_FAILED")) {
            return string;
        }
        A04(sharedPreferences);
        String string2 = sharedPreferences.getString(str, "com.facebook.devicesegmentation.GET_FAILED");
        if (string2 != null) {
            return string2;
        }
        return "com.facebook.devicesegmentation.GET_FAILED";
    }

    public static String A02(PackageManager packageManager) {
        int intValue;
        if (Build.VERSION.SDK_INT < 31 || (intValue = A00(packageManager, "android.software.opengles.deqp.level").intValue()) == -1) {
            return "";
        }
        int i = intValue & 255;
        StringBuilder sb = new StringBuilder();
        sb.append((intValue >> 16) & 65535);
        sb.append('-');
        sb.append((intValue >> 8) & 255);
        sb.append('-');
        return Pxe.A0z(sb, i);
    }

    public static String A03(PackageManager packageManager) {
        int intValue;
        if (Build.VERSION.SDK_INT < 30 || (intValue = A00(packageManager, "android.software.vulkan.deqp.level").intValue()) == -1) {
            return "";
        }
        int i = intValue & 255;
        StringBuilder sb = new StringBuilder();
        sb.append((intValue >> 16) & 65535);
        sb.append('-');
        sb.append((intValue >> 8) & 255);
        sb.append('-');
        return Pxe.A0z(sb, i);
    }

    public static Integer A00(PackageManager packageManager, String str) {
        Integer A0j = C51967G9n.A0j();
        if (packageManager == null) {
            return A0j;
        }
        for (FeatureInfo featureInfo : packageManager.getSystemAvailableFeatures()) {
            if (str.equals(featureInfo.name)) {
                return Integer.valueOf(featureInfo.version);
            }
        }
        return A0j;
    }
}
