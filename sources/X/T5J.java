package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class T5J implements C13662TeT {
    public int memoizedHashCode = 0;

    public final int A0E() {
        R5b r5b = (R5b) this;
        int i = r5b.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int Bsa = Pxg.A0U(r5b).Bsa(r5b);
        r5b.memoizedSerializedSize = Bsa;
        return Bsa;
    }

    public static int A0D(C13903TjQ tjQ, Object obj, Object obj2) {
        R5b r5b = (R5b) obj;
        int i = r5b.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int Bsa = tjQ.Bsa(obj2);
        r5b.memoizedSerializedSize = Bsa;
        return Bsa;
    }

    public final void A0F(CodedOutputStream codedOutputStream) {
        C13903TjQ A0U = Pxg.A0U(this);
        C10281Rpf rpf = codedOutputStream.A00;
        if (rpf == null) {
            rpf = new C10281Rpf(codedOutputStream);
        }
        A0U.FOC(rpf, this);
    }

    public final void A0G(OutputStream outputStream) {
        int A0E = A0E();
        if (A0E > 4096) {
            A0E = 4096;
        }
        R3C r3c = new R3C(outputStream, A0E);
        A0F(r3c);
        if (r3c.A00 > 0) {
            R3C.A03(r3c);
        }
    }

    public final byte[] A0H() {
        try {
            int A0E = A0E();
            byte[] bArr = new byte[A0E];
            R3B r3b = new R3B(bArr, A0E);
            A0F(r3b);
            if (r3b.A01 - r3b.A00 == 0) {
                return bArr;
            }
            throw AnonymousClass7TE.A0z("Did not write as much data as expected.");
        } catch (IOException e) {
            throw Pxe.A0u(002.A11("Serializing ", C66581MXm.A0y(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }
}
