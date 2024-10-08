package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

public abstract class SQE {
    public static int A06(long j, int i) {
        return i + CodedOutputStream.A01((j >> 63) ^ (j << 1));
    }

    public static int A05(int i) {
        return CodedOutputStream.A00(i << 3);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.IOException, X.RCX] */
    public static RCX A07(String str, Throwable th) {
        return new IOException(002.A0R("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }

    public static void A08(CodedOutputStream codedOutputStream, int i) {
        codedOutputStream.A07((i << 3) | 2);
    }
}
