package com.facebook.mobilenetwork;

import X.0dV;
import X.AnonymousClass00P;
import com.facebook.simplejni.NativeHolder;
import javax.net.ssl.SSLSocket;

public abstract class Tls13Socket extends SSLSocket {
    public static final byte[] ALPN_HTTP2_BYTES = {104, 50};
    public static final byte[] ALPN_HTTP_1_1_BYTES = {104, 116, 116, 112, 47, 49, 46, 49};
    public static final String[] CIPHER_SUITES = {"TLS_AES_128_GCM_SHA256", "use default"};
    public final NativeHolder mNativeHolder;

    private native void closeNative();

    private native NativeHolder initNative(int i);

    private native int readNative(byte[] bArr, int i, int i2, int i3);

    private native void setClosingNative();

    private native void startHandshakeNative(String str, byte[] bArr, boolean z);

    private void verifyCertificates(byte[][] bArr) {
        throw AnonymousClass00P.createAndThrow();
    }

    private native void writeNative(byte[] bArr, int i, int i2);

    public native byte[][] getPeerCertificatesNative();

    static {
        0dV.A0C("tls13_socket");
    }

    private void onNewSessionTicket(byte[] bArr) {
        throw AnonymousClass00P.createAndThrow();
    }
}
