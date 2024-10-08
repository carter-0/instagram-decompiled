package com.instagram.realtimeclient.requeststream;

import X.02V;
import X.16F;
import X.AnonymousClass7TE;
import X.C9153RRe;
import java.io.Reader;

public final class String__JsonHelper {
    public static int sBufferLength = 1000;

    public static String parseFromJson(String str) {
        return str;
    }

    public static String parseFromJson(16F r7) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int i = sBufferLength;
        char[] cArr = new char[i];
        Object A1M = r7.A1M();
        02V.A03(A1M, "Created by SessionAwareJsonFactory.createParser, cannot be null");
        Reader reader = (Reader) A1M;
        try {
            reader.reset();
            for (int i2 = 0; i2 != -1; i2 = reader.read(cArr, 0, i)) {
                A1A.append(cArr, 0, i2);
            }
            reader.close();
            return A1A.toString();
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
