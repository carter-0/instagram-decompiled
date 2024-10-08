package com.fbpay.ptt.impl.javacpp;

import X.0dV;
import X.AnonymousClass7TE;
import com.facebook.jni.HybridData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PttImpl {
    public Set mAtFingerprints;
    public HybridData mHybridData;

    private native String decodeResponsePtt(String str);

    private native String generatePtt(String str);

    private native String getE2eeError();

    private native byte[] getSigningPayload(String str);

    public static native HybridData initHybrid(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr, String str);

    static {
        0dV.A0C("fbpayptt-android");
    }

    public String createPtt(String str) {
        return generatePtt(str);
    }

    public String decodeResponse(String str) {
        return decodeResponsePtt(str);
    }

    public String getEncryptionError() {
        return getE2eeError();
    }

    public Map getSigningPayloads() {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = this.mAtFingerprints.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            A1E.put(A18, getSigningPayload(A18));
        }
        return Collections.unmodifiableMap(A1E);
    }
}
