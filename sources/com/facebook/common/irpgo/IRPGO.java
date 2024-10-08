package com.facebook.common.irpgo;

import X.0Yw;
import X.0dV;
import X.0qQ;
import X.AnonymousClass15Q;
import X.AnonymousClass5Kg;
import X.AnonymousClass7TE;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class IRPGO {
    public static final IRPGO INSTANCE = new Object();

    public static final int computeModuleId(String str) {
        0qQ.A0B(str, 0);
        String A06 = AnonymousClass5Kg.A06(AnonymousClass7TE.A0t(str));
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            0qQ.A07(instance);
            byte[] bytes = A06.getBytes(AnonymousClass15Q.A05);
            0qQ.A07(bytes);
            instance.update(bytes);
            byte[] digest = instance.digest();
            0qQ.A07(digest);
            byte[] A0W = 0Yw.A0W(digest, 0, 4);
            int length = A0W.length;
            int i = (length / 2) - 1;
            if (i >= 0) {
                int i2 = length - 1;
                int i3 = 0;
                while (true) {
                    byte b = A0W[i3];
                    A0W[i3] = A0W[i2];
                    A0W[i2] = b;
                    i2--;
                    if (i3 == i) {
                        break;
                    }
                    i3++;
                }
            }
            return ByteBuffer.wrap(A0W).getInt();
        } catch (NoSuchAlgorithmException unused) {
            return 0;
        }
    }

    private final native int[] dumpIRPGOProfiles(String str);

    public final native byte[] dumpProfileRawDataToFiles(String str, boolean z);

    public final native long[] getExecutedFunctionIds();

    public final native byte[] getProfileRawData(boolean z);

    public final native void resetIRPGOProfileCounters();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.common.irpgo.IRPGO, java.lang.Object] */
    static {
        0dV.A0C("irpgoclient");
    }
}
