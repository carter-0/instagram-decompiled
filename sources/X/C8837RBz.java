package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.RBz  reason: case insensitive filesystem */
public final class C8837RBz extends PathClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
