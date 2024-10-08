package X;

import android.os.Build;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class TZ0 extends SPU {
    public final Class A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final C10644Rvd A05;

    public static int A01() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    public static TZ0 A02() {
        if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
            return null;
        }
        try {
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new TZ0(cls, cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE}), cls.getMethod("setHostname", new Class[]{String.class}), cls.getMethod("getAlpnSelectedProtocol", new Class[0]), cls.getMethod("setAlpnProtocols", new Class[]{byte[].class}));
            } catch (NoSuchMethodException unused) {
                throw DbW.A0b("Expected Android API level 21+ but was ", Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public final C9113RPk A0D(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            Class<String> cls2 = String.class;
            return new TZ2(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls2, cls2}));
        } catch (Exception unused) {
            return super.A0D(x509TrustManager);
        }
    }

    public TZ0(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", new Class[0]);
            method5 = cls2.getMethod("open", new Class[]{String.class});
            method6 = cls2.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = method7;
            method5 = method7;
        }
        this.A05 = new C10644Rvd(method7, method5, method6);
        this.A00 = cls;
        this.A04 = method;
        this.A03 = method2;
        this.A01 = method3;
        this.A02 = method4;
    }
}
