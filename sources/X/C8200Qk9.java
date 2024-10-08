package X;

import java.util.Set;

/* renamed from: X.Qk9  reason: case insensitive filesystem */
public final class C8200Qk9 extends C8201QkA {
    public final Set A00 = AnonymousClass7TE.A1F();

    public C8200Qk9(C269144ee r11, C269054eV r12) {
        super(r11, r12, (String) null);
        Class cls = r12.A05;
        RuntimeException runtimeException = SHH.A04;
        if (runtimeException == null) {
            SHH shh = SHH.A03;
            Object[] A002 = shh.A00(cls);
            int length = A002.length;
            String[] strArr = new String[length];
            int i = 0;
            while (i < length) {
                try {
                    strArr[i] = (String) shh.A00.invoke(A002[i], new Object[0]);
                    i++;
                } catch (Exception e) {
                    throw Pxe.A0h(String.format("Failed to access name of field #%d (of %d) of Record type %s", new Object[]{Integer.valueOf(i), Integer.valueOf(length), C269574fL.A06(cls)}), e);
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                this.A00.add(strArr[i2]);
            }
            return;
        }
        throw runtimeException;
    }

    public final String A03(C8206QkF qkF, String str) {
        if (this.A00.contains(str)) {
            return str;
        }
        return super.A03(qkF, str);
    }
}
