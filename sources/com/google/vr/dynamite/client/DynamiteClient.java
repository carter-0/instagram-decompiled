package com.google.vr.dynamite.client;

import X.002;
import X.C11012S5j;
import X.RKX;
import X.S4d;
import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;

public final class DynamiteClient {
    public static final ArrayMap a = new ArrayMap();

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            C11012S5j s5j = new C11012S5j(str, str2);
            S4d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(s5j);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    Log.e("DynamiteClient", 002.A0g("Failed to load native library ", s5j.toString(), " from remote package: no loader available."));
                } else {
                    int checkVersion = newNativeLibraryLoader.checkVersion(str3);
                    return checkVersion;
                }
            } catch (RKX | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                Log.e("DynamiteClient", 002.A0g("Failed to load native library ", s5j.toString(), " from remote package:\n  "), e);
            }
        }
        return -1;
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        ClassLoader classLoader;
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                classLoader = null;
            } else {
                classLoader = remoteContext.getClassLoader();
            }
        }
        return classLoader;
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context context2;
        synchronized (DynamiteClient.class) {
            C11012S5j s5j = new C11012S5j(str, str2);
            try {
                context2 = getRemoteLibraryLoaderFromInfo(s5j).A00(context);
            } catch (RKX e) {
                Log.e("DynamiteClient", 002.A0g("Failed to get remote Context", s5j.toString(), " from remote package:\n  "), e);
                context2 = null;
            }
        }
        return context2;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext == null) {
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                return dexClassLoader;
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    public static synchronized S4d getRemoteLibraryLoaderFromInfo(C11012S5j s5j) {
        S4d s4d;
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = a;
            s4d = (S4d) arrayMap.get(s5j);
            if (s4d == null) {
                s4d = new S4d(s5j);
                arrayMap.put(s5j, s4d);
            }
        }
        return s4d;
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            C11012S5j s5j = new C11012S5j(str, str2);
            S4d remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(s5j);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.A01(context).newNativeLibraryLoader(new ObjectWrapper(remoteLibraryLoaderFromInfo.A00(context)), new ObjectWrapper(context));
                if (newNativeLibraryLoader == null) {
                    Log.e("DynamiteClient", 002.A0g("Failed to load native library ", s5j.toString(), " from remote package: no loader available."));
                } else {
                    long initializeAndLoadNativeLibrary = newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                    return initializeAndLoadNativeLibrary;
                }
            } catch (RKX | RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                Log.e("DynamiteClient", 002.A0g("Failed to load native library ", s5j.toString(), " from remote package:\n  "), e);
            }
        }
        return 0;
    }
}
