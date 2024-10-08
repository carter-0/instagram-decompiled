package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: X.98T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass98T implements AnonymousClass97E {
    public final Object AJN(AnonymousClass97G r8) {
        byte[] bArr;
        ByteBuffer allocate;
        C375049Ca r0 = C375049Ca.A00;
        C3739997t r6 = ((AnonymousClass97F) r8).A00;
        AnonymousClass97F.A00(r0, r6);
        C384309h7 r1 = (C384309h7) C3741498i.DEFAULT_INSTANCE.A0C();
        r1.A06(r6.A05);
        r1.A05(r6.A02);
        r1.A04(r6.A00);
        AnonymousClass98U r5 = (AnonymousClass98U) AGk.A00((C3741498i) r1.A01(), AnonymousClass98U.class);
        int ordinal = r6.A01.ordinal();
        if (ordinal != 3) {
            if (ordinal == 2 || ordinal == 4) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 0);
            } else if (ordinal == 1) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 1);
            } else {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            allocate.putInt(r6.A04.intValue());
            bArr = allocate.array();
        } else {
            bArr = new byte[0];
        }
        return new C40222AWm(r5, bArr);
    }
}
