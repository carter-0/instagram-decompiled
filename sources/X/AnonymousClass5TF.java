package X;

import java.util.HashMap;

/* renamed from: X.5TF  reason: invalid class name */
public final class AnonymousClass5TF {
    public int A00 = -1;
    public int A01;
    public 0vu A02;
    public Object A03;
    public final 0vr A04 = new 0vr(6);
    public final 0vq A05 = new 0vq(6);
    public final AnonymousClass5X2 A06 = new C289015cs(this);
    public final C285045Pl A07 = new C285045Pl(new AnonymousClass5TY[16]);
    public final C286515Wr A08 = new C286515Wr();
    public final C286515Wr A09 = new C286515Wr();
    public final HashMap A0A = new HashMap();
    public final 0sP A0B;

    public static final void A00(0vu r16, AnonymousClass5TF r17, Object obj, Object obj2, int i) {
        AnonymousClass5TF r7 = r17;
        if (r7.A01 <= 0) {
            int i2 = -1;
            0vu r2 = r16;
            Object obj3 = obj;
            int A012 = 0vu.A01(r2, obj3);
            if (A012 < 0) {
                A012 ^= -1;
            } else {
                i2 = r2.A02[A012];
            }
            r2.A04[A012] = obj;
            int[] iArr = r2.A02;
            int i3 = i;
            iArr[A012] = i;
            if ((obj3 instanceof AnonymousClass5TY) && i2 != i3) {
                AnonymousClass5TZ AuM = ((AnonymousClass5TY) obj3).AuM();
                r7.A0A.put(obj3, AuM.A04);
                01h r0 = AuM.A03;
                C286515Wr r11 = r7.A08;
                r11.A00(obj3);
                Object[] objArr = r0.A04;
                long[] jArr = r0.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - (((i4 - length) ^ -1) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    C284925Ox r1 = (C284925Ox) objArr[(i4 << 3) + i6];
                                    if (r1 instanceof AnonymousClass5Ow) {
                                        ((AnonymousClass5Ow) r1).A01(2);
                                    }
                                    r11.A01(r1, obj3);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i2 == -1) {
                if (obj3 instanceof AnonymousClass5Ow) {
                    ((AnonymousClass5Ow) obj3).A01(2);
                }
                r7.A09.A01(obj3, obj2);
            }
        }
    }

    public static final void A01(AnonymousClass5TF r2, Object obj, Object obj2) {
        C286515Wr r1 = r2.A09;
        r1.A02(obj2, obj);
        if ((obj2 instanceof AnonymousClass5TY) && !r1.A00.A04(obj2)) {
            r2.A08.A00(obj2);
            r2.A0A.remove(obj2);
        }
    }

    public AnonymousClass5TF(0sP r3) {
        this.A0B = r3;
    }
}
