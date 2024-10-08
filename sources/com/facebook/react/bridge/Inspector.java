package com.facebook.react.bridge;

import X.AnonymousClass7TE;
import X.SBO;
import com.facebook.jni.HybridData;

public class Inspector {
    public final HybridData mHybridData;

    public interface RemoteConnection {
        void onDisconnect();

        void onMessage(String str);
    }

    private native LocalConnection connectNative(int i, RemoteConnection remoteConnection);

    private native Page[] getPagesNative();

    public static native Inspector instance();

    public class LocalConnection {
        public final HybridData mHybridData;

        public native void disconnect();

        public native void sendMessage(String str);

        public LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    public class Page {
        public final int mId;
        public final String mTitle;
        public final String mVM;

        public Page(int i, String str, String str2) {
            this.mId = i;
            this.mTitle = str;
            this.mVM = str2;
        }

        public String toString() {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Page{mId=");
            A1A.append(this.mId);
            A1A.append(", mTitle='");
            A1A.append(this.mTitle);
            A1A.append('\'');
            A1A.append('}');
            return A1A.toString();
        }
    }

    static {
        SBO.A00();
    }

    public Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
