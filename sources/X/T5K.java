package X;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class T5K implements C13662TeT, Cloneable {
    public final void A01(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr.length;
        R4O r4o = (R4O) this;
        SQg A00 = SQg.A00();
        r4o.A04();
        try {
            SH5.A02.A00(r4o.A00.getClass()).CoA(new SFF(A00), r4o.A00, bArr2, 0, length);
        } catch (AnonymousClass5I7 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw AnonymousClass5I7.A02();
        } catch (IOException e2) {
            throw Pxe.A0u("Reading from byte array should not throw IOException.", e2);
        }
    }

    public static void A00(Iterable iterable, List list) {
        Charset charset = SD9.A04;
        iterable.getClass();
        if (iterable instanceof C13979TnV) {
            List CBK = ((C13979TnV) iterable).CBK();
            C13979TnV tnV = (C13979TnV) list;
            int size = list.size();
            for (Object next : CBK) {
                if (next == null) {
                    String A0c = 002.A0c("Element at index ", " is null.", DbT.A02(tnV, size));
                    int size2 = tnV.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            tnV.remove(size2);
                        } else {
                            throw AnonymousClass7TE.A11(A0c);
                        }
                    }
                } else if (next instanceof TAP) {
                    tnV.A7a((TAP) next);
                } else {
                    tnV.add(next);
                }
            }
        } else if (iterable instanceof C13493TbK) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String A0c2 = 002.A0c("Element at index ", " is null.", DbT.A02(list, size3));
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw AnonymousClass7TE.A11(A0c2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        throw AnonymousClass00P.createAndThrow();
    }
}
