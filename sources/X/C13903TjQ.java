package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.TjQ  reason: case insensitive filesystem */
public interface C13903TjQ {
    boolean ASr(Object obj, Object obj2);

    int Bsa(Object obj);

    int CL6(Object obj);

    boolean CVR(Object obj);

    void ClW(Object obj);

    void Co5(Object obj, Object obj2);

    void Co9(SUM sum, SQg sQg, Object obj);

    void CoA(SFF sff, Object obj, byte[] bArr, int i, int i2);

    Object Cr9();

    void FOC(C10281Rpf rpf, Object obj);

    static void A00(C10281Rpf rpf, C13903TjQ tjQ, Object obj, int i) {
        CodedOutputStream codedOutputStream = rpf.A00;
        int i2 = i << 3;
        codedOutputStream.A07(i2 | 3);
        tjQ.FOC(codedOutputStream.A00, obj);
        codedOutputStream.A07(i2 | 4);
    }
}
