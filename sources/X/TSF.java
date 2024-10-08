package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class TSF extends AbstractSet {
    public final /* synthetic */ TS6 A00;

    public TSF(TS6 ts6) {
        this.A00 = ts6;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return A02.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int A002 = TS6.A00(ts6, entry.getKey());
            if (A002 != -1) {
                Object[] objArr = ts6.A05;
                objArr.getClass();
                if (C9718Rfb.A00(objArr[A002], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator iterator() {
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return AnonymousClass7TF.A0u(A02);
        }
        return new C8530QwU(ts6);
    }

    public final boolean remove(Object obj) {
        Object obj2 = obj;
        TS6 ts6 = this.A00;
        Map A02 = ts6.A02();
        if (A02 != null) {
            return A02.entrySet().remove(obj2);
        }
        if (obj2 instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj2;
            if (ts6.A02 != null) {
                int i = (1 << (ts6.A00 & 31)) - 1;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj3 = ts6.A02;
                obj3.getClass();
                int[] iArr = ts6.A03;
                iArr.getClass();
                Object[] objArr = ts6.A04;
                objArr.getClass();
                Object[] objArr2 = ts6.A05;
                objArr2.getClass();
                int A03 = Pxh.A03(AnonymousClass7TG.A0C(key));
                int i2 = A03 & i;
                int A002 = SKt.A00(obj3, i2);
                if (A002 != 0) {
                    int i3 = i ^ -1;
                    int i4 = A03 & i3;
                    int i5 = -1;
                    while (true) {
                        int i6 = A002 - 1;
                        int i7 = iArr[i6];
                        if ((i7 & i3) != i4 || !C9718Rfb.A00(key, objArr[i6]) || !C9718Rfb.A00(value, objArr2[i6])) {
                            A002 = i7 & i;
                            if (A002 == 0) {
                                break;
                            }
                            i5 = i6;
                        } else {
                            int i8 = i7 & i;
                            if (i5 == -1) {
                                SKt.A02(obj3, i2, i8);
                            } else {
                                iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                            }
                            if (i6 != -1) {
                                ts6.A03(i6, i);
                                ts6.A01--;
                                ts6.A00 += 32;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.A00.size();
    }
}
