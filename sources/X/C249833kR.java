package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3kR  reason: invalid class name and case insensitive filesystem */
public abstract class C249833kR implements AnonymousClass155 {
    public static final int[] A01 = new int[0];
    public final 15B A00;

    public void A00(int i, List list) {
        Integer valueOf;
        int max;
        int i2;
        int i3;
        List list2 = list;
        int i4 = i;
        if (this instanceof C267394bU) {
            C267394bU r6 = (C267394bU) this;
            if (i >= 0 && i4 <= 100) {
                double d = ((double) i4) / 100.0d;
                int i5 = 800;
                boolean z = false;
                if (i4 >= 50) {
                    i5 = IgNetworkConsentStorage.MAX_ENTRIES;
                    z = true;
                }
                boolean z2 = AnonymousClass159.A00().A05;
                15B r1 = r6.A00;
                int[] iArr = r1.A0A;
                int i6 = iArr[1];
                int i7 = iArr[0];
                int max2 = Math.max((i7 + ((int) (((double) (i6 - i7)) * d))) / IgNetworkConsentStorage.MAX_ENTRIES, i5);
                int[] iArr2 = r1.A0C;
                int i8 = iArr2[1];
                int i9 = iArr2[0];
                int max3 = Math.max((i9 + ((int) (((double) (i8 - i9)) * d))) / IgNetworkConsentStorage.MAX_ENTRIES, i5);
                boolean z3 = r6.A00;
                int i10 = 1100;
                if (z3 && max2 > 1100) {
                    max2 = 1100;
                }
                list2.add(1086324736);
                list2.add(1);
                if (z) {
                    list2.add(1090519040);
                    list2.add(Integer.valueOf(r1.A00));
                    list2.add(1077936128);
                    list2.add(1);
                }
                list2.add(1082130432);
                list2.add(Integer.valueOf(max2));
                list2.add(1082130688);
                list2.add(Integer.valueOf(max3));
                if (z2) {
                    list2.add(1082146816);
                    int i11 = 1700;
                    int i12 = 2016;
                    if (d < 1.0d) {
                        i12 = 1700;
                    }
                    list2.add(Integer.valueOf(i12));
                    list2.add(1082130432);
                    if (d >= 1.0d) {
                        i11 = 2016;
                    }
                    list2.add(Integer.valueOf(i11));
                }
                if (AnonymousClass159.A00().A05) {
                    list2.add(1120043008);
                    list2.add(1);
                }
                if (r1.A08) {
                    int[] iArr3 = r1.A0D;
                    int i13 = iArr3[1];
                    int i14 = iArr3[0];
                    i3 = Math.max((i14 + ((int) (((double) (i13 - i14)) * d))) / IgNetworkConsentStorage.MAX_ENTRIES, i5);
                    if (z3) {
                        if (i3 <= 1100) {
                            i10 = i3;
                        }
                        i3 = i10;
                    }
                    list2.add(1082130944);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!(this instanceof C267414bW)) {
            valueOf = Integer.valueOf(i4);
            list2.add(valueOf);
        } else if (i >= 0 && i4 <= 100) {
            double d2 = ((double) i4) / 100.0d;
            int i15 = 800;
            if (i4 >= 50) {
                i15 = IgNetworkConsentStorage.MAX_ENTRIES;
            }
            15B r62 = this.A00;
            if (r62.A07) {
                int[] iArr4 = r62.A0A;
                int i16 = iArr4[1];
                int i17 = iArr4[0];
                int max4 = Math.max((i17 + ((int) (((double) (i16 - i17)) * d2))) / IgNetworkConsentStorage.MAX_ENTRIES, i15);
                int[] iArr5 = r62.A0C;
                int i18 = iArr5[1];
                int i19 = iArr5[0];
                max = Math.max((i19 + ((int) (((double) (i18 - i19)) * d2))) / IgNetworkConsentStorage.MAX_ENTRIES, i15);
                list2.add(Integer.valueOf(r62.A00));
                list2.add(Integer.valueOf(max4 * IgNetworkConsentStorage.MAX_ENTRIES));
                i2 = r62.A03;
            } else {
                int[] iArr6 = r62.A0B;
                int i20 = iArr6[1];
                int i21 = iArr6[0];
                max = Math.max((i21 + ((int) (((double) (i20 - i21)) * d2))) / IgNetworkConsentStorage.MAX_ENTRIES, i15);
                i2 = r62.A02;
            }
            list2.add(Integer.valueOf(i2));
            i3 = max * IgNetworkConsentStorage.MAX_ENTRIES;
        } else {
            return;
        }
        valueOf = Integer.valueOf(i3);
        list2.add(valueOf);
    }

    public final int[] Ah3(AnonymousClass15J r7) {
        if (r7 != null) {
            ArrayList arrayList = new ArrayList();
            int i = r7.A01;
            int i2 = r7.A02;
            if (i != 2) {
                A00(i2, arrayList);
            } else if (this instanceof C267394bU) {
                arrayList.add(1115701248);
                arrayList.add(1);
            }
            if (!arrayList.isEmpty()) {
                int[] iArr = new int[arrayList.size()];
                int i3 = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iArr[i3] = ((Number) it.next()).intValue();
                    i3++;
                }
                return iArr;
            }
        }
        return A01;
    }

    public C249833kR(15B r1) {
        this.A00 = r1;
    }
}
