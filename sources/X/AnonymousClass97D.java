package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: X.97D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass97D implements AnonymousClass97E {
    public final Object AJN(AnonymousClass97G r9) {
        byte[] bArr;
        ByteBuffer allocate;
        C375049Ca r0 = C375049Ca.A00;
        C3739997t r7 = ((AnonymousClass97F) r9).A00;
        AnonymousClass97F.A00(r0, r7);
        C384309h7 r1 = (C384309h7) C3741498i.DEFAULT_INSTANCE.A0C();
        r1.A06(r7.A05);
        r1.A05(r7.A02);
        r1.A04(r7.A00);
        AnonymousClass97H r6 = (AnonymousClass97H) AGk.A00((C3741498i) r1.A01(), AnonymousClass97H.class);
        AnonymousClass98D r5 = r7.A01;
        int ordinal = r5.ordinal();
        if (ordinal != 3) {
            if (ordinal == 2 || ordinal == 4) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 0);
            } else if (ordinal == 1) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 1);
            } else {
                throw new GeneralSecurityException(002.A0O("unknown output prefix type ", r5.A01()));
            }
            allocate.putInt(r7.A04.intValue());
            bArr = allocate.array();
        } else {
            bArr = new byte[0];
        }
        return new C40217AWh(r6, r5, bArr);
    }
}
