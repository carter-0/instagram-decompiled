package org.webrtc;

import X.002;
import X.Pxe;

public class NativeLibrary {
    public static String TAG = "NativeLibrary";
    public static boolean libraryLoaded;
    public static Object lock = Pxe.A0p();

    public class DefaultLoader implements NativeLibraryLoader {
        public boolean load(String str) {
            boolean z = Logging.loggingEnabled;
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                Logging.e(NativeLibrary.TAG, 002.A0R("Failed to load native library: ", str), e);
                return false;
            }
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                boolean z = Logging.loggingEnabled;
            } else {
                boolean z2 = Logging.loggingEnabled;
                libraryLoaded = nativeLibraryLoader.load(str);
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
