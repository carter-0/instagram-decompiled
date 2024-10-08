package X;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.msys.mci.AuthDataStorage;
import com.facebook.msys.mci.Connectivity;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.Localization;
import com.facebook.msys.mci.Log;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.5x9  reason: invalid class name and case insensitive filesystem */
public final class C300415x9 {
    public static synchronized void A00(Context context, C300235wm r7, ProxyProvider proxyProvider, C300275wq r9, C300215wk r10, Integer num, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (C300415x9.class) {
            try {
                Proxies.configure(proxyProvider);
            } catch (IllegalStateException e) {
                Log.log(5, 002.A0R("Proxies already configured: ", e.getMessage()));
            }
            AuthDataStorage.initialize(context);
            Execution.initialize(num, (Executor) null);
            if (z && num != null) {
                Execution.setThreadPriorities(num);
            }
            JsonSerialization.initialize();
            File cacheDir = context.getCacheDir();
            ContentResolver contentResolver = context.getContentResolver();
            boolean z2 = FileManager.sInitialized;
            synchronized (FileManager.class) {
                0ff.A01("FileManager.initialize", -1610663637);
                try {
                    if (FileManager.sInitialized) {
                        i2 = 2034290770;
                    } else {
                        FileManager.mCacheDir = cacheDir;
                        FileManager.mContentResolver = contentResolver;
                        FileManager.nativeInitialize();
                        FileManager.sInitialized = true;
                        i2 = -423764293;
                    }
                } catch (Throwable th) {
                    th = th;
                    i = -198587051;
                    0ff.A00(i);
                    throw th;
                }
                try {
                    0ff.A00(i2);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            boolean z3 = Log.sRegistered;
            synchronized (Log.class) {
                try {
                    0ff.A01("registerLogger", -1350856990);
                    try {
                        if (Log.sRegistered) {
                            i3 = 1776903346;
                        } else {
                            Log.registerLoggerNative(823, 5, false, 5);
                            Log.setLogLevel(0KC.A01.getMinimumLoggingLevel());
                            C300425xA r2 = new C300425xA();
                            synchronized (0KC.class) {
                                0KC.A00.add(r2);
                            }
                            Log.sRegistered = true;
                            i3 = -338705183;
                        }
                        0ff.A00(i3);
                    } catch (Throwable th3) {
                        0ff.A00(985533260);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
            if (r10 != null) {
                boolean z4 = Connectivity.sInitialized;
                synchronized (Connectivity.class) {
                    0ff.A01("Connectivity.initialize", -1613548771);
                    try {
                        if (Connectivity.sInitialized) {
                            i5 = -329550800;
                        } else {
                            Connectivity.sConnectivityHandler = r10;
                            Connectivity.nativeInitialize();
                            Connectivity.sInitialized = true;
                            i5 = -1803039536;
                        }
                        0ff.A00(i5);
                    } catch (Throwable th5) {
                        th = th5;
                        i = 702405992;
                        0ff.A00(i);
                        throw th;
                    }
                }
            }
            if (r7 != null) {
                C300235wm r0 = Localization.sLocalizedStringProvider;
                synchronized (Localization.class) {
                    0ff.A01("Localization.initialize", -1483488643);
                    try {
                        if (Localization.sLocalizedStringProvider == null && Localization.sLocalizedStringResolver == null) {
                            Localization.nativeInitialize();
                            Localization.sLocalizedStringProvider = r7;
                            Localization.sLocalizedStringResolver = r9;
                            i4 = -604778595;
                        } else {
                            i4 = 1520686648;
                        }
                        0ff.A00(i4);
                    } catch (Throwable th6) {
                        th = th6;
                        i = -326436352;
                        0ff.A00(i);
                        throw th;
                    }
                }
            }
        }
    }
}
