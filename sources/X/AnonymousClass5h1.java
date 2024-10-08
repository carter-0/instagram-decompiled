package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5h1  reason: invalid class name */
public final class AnonymousClass5h1 {
    public final float A00;
    public final int A01;
    public final String A02;
    public final List A03;

    /* JADX WARNING: type inference failed for: r9v1, types: [X.5h3, java.lang.Object] */
    public static AnonymousClass5h1 A00(AnonymousClass4XV r15) {
        float f;
        try {
            r15.A0H(4);
            int A022 = (r15.A02() & 3) + 1;
            if (A022 != 3) {
                ArrayList arrayList = new ArrayList();
                int A023 = r15.A02() & 31;
                for (int i = 0; i < A023; i++) {
                    int A05 = r15.A05();
                    int i2 = r15.A01;
                    r15.A0H(A05);
                    byte[] bArr = r15.A02;
                    byte[] bArr2 = new byte[(A05 + 4)];
                    System.arraycopy(C291355h2.A00, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i2, bArr2, 4, A05);
                    arrayList.add(bArr2);
                }
                int A024 = r15.A02();
                for (int i3 = 0; i3 < A024; i3++) {
                    int A052 = r15.A05();
                    int i4 = r15.A01;
                    r15.A0H(A052);
                    byte[] bArr3 = r15.A02;
                    byte[] bArr4 = new byte[(A052 + 4)];
                    System.arraycopy(C291355h2.A00, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i4, bArr4, 4, A052);
                    arrayList.add(bArr4);
                }
                String str = null;
                if (A023 > 0) {
                    int length = ((byte[]) arrayList.get(0)).length;
                    ? obj = new Object();
                    obj.A03 = (byte[]) arrayList.get(0);
                    obj.A02 = A022 + 1;
                    obj.A01 = length;
                    obj.A00 = 0;
                    C291365h3.A01(obj);
                    int A032 = obj.A03(8);
                    int A033 = obj.A03(8);
                    int A034 = obj.A03(8);
                    C291365h3.A00(obj);
                    if (A032 == 100 || A032 == 110 || A032 == 122 || A032 == 244 || A032 == 44 || A032 == 83 || A032 == 86 || A032 == 118 || A032 == 128 || A032 == 138) {
                        int A002 = C291365h3.A00(obj);
                        if (A002 == 3) {
                            obj.A04();
                        }
                        C291365h3.A00(obj);
                        C291365h3.A00(obj);
                        obj.A04();
                        if (obj.A06()) {
                            int i5 = 12;
                            if (A002 != 3) {
                                i5 = 8;
                            }
                            int i6 = 0;
                            while (true) {
                                if (obj.A06()) {
                                    int i7 = 64;
                                    if (i6 < 6) {
                                        i7 = 16;
                                    }
                                    int i8 = 8;
                                    int i9 = 0;
                                    while (true) {
                                        int A003 = C291365h3.A00(obj);
                                        int i10 = 1;
                                        if (A003 % 2 == 0) {
                                            i10 = -1;
                                        }
                                        int i11 = (((i10 * ((A003 + 1) / 2)) + i8) + 256) % 256;
                                        if (i11 != 0) {
                                            i8 = i11;
                                        }
                                        do {
                                            i9++;
                                            if (i9 >= i7) {
                                                break;
                                            }
                                        } while (i11 == 0);
                                    }
                                }
                                i6++;
                                if (i6 >= i5) {
                                    break;
                                }
                            }
                        }
                    }
                    C291365h3.A00(obj);
                    int A004 = C291365h3.A00(obj);
                    if (A004 == 0) {
                        C291365h3.A00(obj);
                    } else if (A004 == 1) {
                        obj.A04();
                        C291365h3.A00(obj);
                        C291365h3.A00(obj);
                        long A005 = (long) C291365h3.A00(obj);
                        for (int i12 = 0; ((long) i12) < A005; i12++) {
                            C291365h3.A00(obj);
                        }
                    }
                    C291365h3.A00(obj);
                    obj.A04();
                    C291365h3.A00(obj);
                    C291365h3.A00(obj);
                    if (!obj.A06()) {
                        obj.A04();
                    }
                    obj.A04();
                    if (obj.A06()) {
                        C291365h3.A00(obj);
                        C291365h3.A00(obj);
                        C291365h3.A00(obj);
                        C291365h3.A00(obj);
                    }
                    f = 1.0f;
                    if (obj.A06() && obj.A06()) {
                        int A035 = obj.A03(8);
                        if (A035 == 255) {
                            int A036 = obj.A03(16);
                            int A037 = obj.A03(16);
                            if (!(A036 == 0 || A037 == 0)) {
                                f = ((float) A036) / ((float) A037);
                            }
                        } else {
                            float[] fArr = AnonymousClass4XW.A02;
                            if (A035 < 17) {
                                f = fArr[A035];
                            } else {
                                2AG.A04("NalUnitUtil", 002.A0O(Pxd.A00(595), A035));
                            }
                        }
                    }
                    str = String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(A032), Integer.valueOf(A033), Integer.valueOf(A034)});
                } else {
                    f = 1.0f;
                }
                return new AnonymousClass5h1(str, arrayList, f, A022);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C2609347p.A00("Error parsing AVC config", e);
        }
    }

    public AnonymousClass5h1(String str, List list, float f, int i) {
        this.A03 = list;
        this.A01 = i;
        this.A00 = f;
        this.A02 = str;
    }
}
