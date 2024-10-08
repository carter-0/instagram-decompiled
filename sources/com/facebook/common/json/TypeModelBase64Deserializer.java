package com.facebook.common.json;

import X.16F;
import X.17k;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C269674fV;
import X.Pxe;
import X.RV2;
import X.S8P;
import X.SN1;
import X.SS5;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TypeModelBase64Deserializer extends FbJsonDeserializer {
    public final Object A0D(16F r9, C269674fV r10) {
        RuntimeException runtimeException;
        int position;
        try {
            String A1Q = r9.A1Q();
            if (A1Q == null) {
                return null;
            }
            if (A1Q.startsWith("fltb:")) {
                String replaceFirst = A1Q.replaceFirst("fltb:", "");
                int A00 = RV2.A00(replaceFirst);
                if (replaceFirst != null && replaceFirst.startsWith("type_tag:")) {
                    replaceFirst = replaceFirst.substring(18);
                }
                try {
                    this.A00.getDeclaredConstructor(new Class[]{Integer.TYPE, int[].class}).newInstance(new Object[]{Integer.valueOf(A00), null});
                    ByteBuffer duplicate = ByteBuffer.wrap(Base64.decode(replaceFirst, 2)).duplicate();
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    duplicate.order(byteOrder);
                    try {
                        duplicate.order(byteOrder);
                        synchronized (duplicate) {
                            position = duplicate.position();
                        }
                        if (duplicate.getInt(position) + position <= 0) {
                            return null;
                        }
                        try {
                            throw AnonymousClass7TE.A11("initFromMutableFlatBuffer");
                        } catch (IndexOutOfBoundsException e) {
                            runtimeException = new RuntimeException("", e);
                            throw runtimeException;
                        }
                    } catch (Exception e2) {
                        runtimeException = new RuntimeException("", e2);
                    }
                } catch (Exception e3) {
                    runtimeException = Pxe.A0u("Can't create model object", e3);
                    throw runtimeException;
                }
            } else {
                17k.A0F(A1Q.startsWith("tree:"));
                String replaceFirst2 = A1Q.replaceFirst("tree:", "");
                int A002 = RV2.A00(replaceFirst2);
                if (replaceFirst2 != null && replaceFirst2.startsWith("type_tag:")) {
                    replaceFirst2 = replaceFirst2.substring(18);
                }
                return SN1.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(replaceFirst2, 2)), this.A00, A002);
            }
        } catch (Exception e4) {
            SS5.A03(e4);
            S8P.A00(r9, this.A00, e4);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
