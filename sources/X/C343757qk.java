package X;

import android.opengl.EGL14;
import com.facebook.react.views.textinput.ReactTextInputManager;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.7qk  reason: invalid class name and case insensitive filesystem */
public final class C343757qk {
    public static final String A00(String str, String str2, int i) {
        String format = String.format((Locale) null, "%s: GL error 0x%04x %s occurred, see logcat output", Arrays.copyOf(new Object[]{str, Integer.valueOf(i), str2}, 3));
        0qQ.A07(format);
        return format;
    }

    public final void A01(String str) {
        boolean z = false;
        int i = 12288;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            z = true;
            i = eglGetError;
        }
        if (z) {
            switch (i) {
                case 12289:
                    throw new C345117sx(12289, A00(str, "EGL_NOT_INITIALIZED", i));
                case ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED:
                    throw new C345117sx(ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED, A00(str, "EGL_BAD_ACCESS", i));
                case 12291:
                    throw new C345117sx(12291, A00(str, "EGL_BAD_ALLOC", i));
                case 12292:
                    throw new C345117sx(12292, A00(str, "EGL_BAD_ATTRIBUTE", i));
                case 12293:
                    throw new C345117sx(12293, A00(str, "EGL_BAD_CONFIG", i));
                case 12294:
                    throw new C345117sx(12294, A00(str, "EGL_BAD_CONTEXT", i));
                case 12295:
                    throw new C345117sx(12295, A00(str, "EGL_BAD_CURRENT_SURFACE", i));
                case 12296:
                    throw new C345117sx(12296, A00(str, "EGL_BAD_DISPLAY", i));
                case 12297:
                    throw new C345117sx(12297, A00(str, "EGL_BAD_MATCH", i));
                case 12298:
                    throw new C345117sx(12298, A00(str, "EGL_BAD_NATIVE_PIXMAP", i));
                case 12299:
                    throw new C345117sx(12299, A00(str, "EGL_BAD_NATIVE_WINDOW", i));
                case 12300:
                    throw new C345117sx(12300, A00(str, "EGL_BAD_PARAMETER", i));
                case 12301:
                    throw new C345117sx(12301, A00(str, "EGL_BAD_SURFACE", i));
                case 12302:
                    throw new C345117sx(12302, A00(str, "EGL_CONTEXT_LOST", i));
                default:
                    throw new C345117sx(i, A00(str, "UNKNOWN", i));
            }
        }
    }
}
