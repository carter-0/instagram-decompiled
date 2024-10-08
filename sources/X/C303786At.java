package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6At  reason: invalid class name and case insensitive filesystem */
public final class C303786At extends AnonymousClass2e2 implements C303796Au {
    public AnonymousClass6BC[] A00;
    public AnonymousClass2e2[] A01;
    public byte[] A02;
    public String[] A03;

    public final void A00(C303776As r9) {
        byte b;
        byte b2;
        List list = r9.A01;
        if (list == null) {
            list = new ArrayList();
            r9.A01 = list;
        }
        list.add(this);
        AnonymousClass6BC[] r4 = this.A00;
        if (r4 != null) {
            for (AnonymousClass6BC r1 : r4) {
                List list2 = r9.A00;
                if (list2 == null) {
                    list2 = new ArrayList();
                    r9.A00 = list2;
                }
                list2.add(r1);
            }
        }
        byte[] bArr = this.A02;
        if (bArr != null) {
            byte[] bArr2 = r9.A03;
            if (bArr2 != null) {
                int length = bArr.length;
                int length2 = bArr2.length;
                int i = 0;
                if (length > length2) {
                    while (i < length2) {
                        if (bArr[i] > bArr2[i]) {
                            b = bArr[i];
                        } else {
                            b = bArr2[i];
                        }
                        bArr[i] = b;
                        i++;
                    }
                } else if (length < length2) {
                    while (i < length) {
                        if (bArr[i] > bArr2[i]) {
                            b2 = bArr[i];
                        } else {
                            b2 = bArr2[i];
                        }
                        bArr2[i] = b2;
                        i++;
                    }
                }
            }
            r9.A03 = bArr;
        }
        AnonymousClass2e2[] r2 = this.A01;
        if (r2 != null) {
            for (AnonymousClass2e2 r0 : r2) {
                ((C303786At) r0).A00(r9);
            }
        }
        this.A02.A02(r9, this, this.A03);
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public final void ANd(ByteBuffer byteBuffer, int i) {
        C303796Au r0;
        Class<C303806Av> cls = C303806Av.class;
        int A002 = C303816Aw.A00(byteBuffer, i, 0);
        if (A002 != 0) {
            r0 = cls.newInstance();
            r0.ANd(byteBuffer, A002);
        } else {
            r0 = null;
        }
        C71542dx r02 = (C71542dx) r0;
        if (r02 != null) {
            this.A03 = r02;
            float f = 0.0f;
            int A003 = C303816Aw.A00(byteBuffer, i, 1);
            if (A003 != 0) {
                f = byteBuffer.getFloat(A003);
            }
            this.A01 = f;
            float f2 = 0.0f;
            int A004 = C303816Aw.A00(byteBuffer, i, 2);
            if (A004 != 0) {
                f2 = byteBuffer.getFloat(A004);
            }
            this.A00 = f2;
            2dy A012 = C303816Aw.A01(C303826Ax.class, byteBuffer, i, 4);
            if (A012 != null) {
                this.A02 = A012;
                this.A00 = (AnonymousClass6BC[]) C303816Aw.A06(AnonymousClass6BB.class, byteBuffer, i, 5);
                this.A01 = (AnonymousClass2e2[]) C303816Aw.A06(C303786At.class, byteBuffer, i, 6);
                this.A03 = C303816Aw.A07(byteBuffer, i, 7);
                this.A02 = C303816Aw.A04(byteBuffer, i, 9);
                this.A04 = (AnonymousClass61Q[]) C303816Aw.A06(AnonymousClass61P.class, byteBuffer, i, 10);
                return;
            }
            throw new IllegalArgumentException("root layer cannot be null");
        }
        throw new IllegalArgumentException("size cannot be null");
    }
}
