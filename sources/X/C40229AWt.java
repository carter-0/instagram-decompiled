package X;

import java.nio.ByteBuffer;

/* renamed from: X.AWt  reason: case insensitive filesystem */
public final class C40229AWt implements AnonymousClass97E {
    public final int A00;

    public C40229AWt(int i) {
        this.A00 = i;
    }

    public final Object AJN(AnonymousClass97G r9) {
        byte[] bArr;
        ByteBuffer allocate;
        byte[] bArr2;
        ByteBuffer allocate2;
        int i = this.A00;
        AnonymousClass97F r92 = (AnonymousClass97F) r9;
        C375049Ca r0 = C375049Ca.A00;
        if (i != 0) {
            C3739997t r7 = r92.A00;
            AnonymousClass97F.A00(r0, r7);
            B1C b1c = (B1C) AGk.A00((C3741498i) AnonymousClass973.A08(r7).A01(), B1C.class);
            AnonymousClass98D r5 = r7.A01;
            int ordinal = r5.ordinal();
            if (ordinal != 3) {
                if (ordinal == 2 || ordinal == 4) {
                    allocate2 = ByteBuffer.allocate(5);
                    allocate2.put((byte) 0);
                } else if (ordinal == 1) {
                    allocate2 = ByteBuffer.allocate(5);
                    allocate2.put((byte) 1);
                } else {
                    throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(r5, "unknown output prefix type ", AnonymousClass7TE.A1A()));
                }
                allocate2.putInt(r7.A04.intValue());
                bArr2 = allocate2.array();
            } else {
                bArr2 = new byte[0];
            }
            return new C40221AWl(b1c, bArr2);
        }
        C3739997t r72 = r92.A00;
        AnonymousClass97F.A00(r0, r72);
        C41772B0b b0b = (C41772B0b) AGk.A00((C3741498i) AnonymousClass973.A08(r72).A01(), C41772B0b.class);
        AnonymousClass98D r52 = r72.A01;
        int ordinal2 = r52.ordinal();
        if (ordinal2 != 3) {
            if (ordinal2 == 2 || ordinal2 == 4) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 0);
            } else if (ordinal2 == 1) {
                allocate = ByteBuffer.allocate(5);
                allocate.put((byte) 1);
            } else {
                throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(r52, "unknown output prefix type ", AnonymousClass7TE.A1A()));
            }
            allocate.putInt(r72.A04.intValue());
            bArr = allocate.array();
        } else {
            bArr = new byte[0];
        }
        return new C40219AWj(b0b, bArr);
    }
}
