package X;

import java.util.List;

/* renamed from: X.6Ft  reason: invalid class name and case insensitive filesystem */
public final class C304926Ft {
    public int A00;
    public final int A01;
    public final GPV A02;
    public final List A03;

    public C304926Ft(GPV gpv, List list) {
        int i;
        int i2;
        this.A03 = list;
        this.A02 = gpv;
        if (gpv != null) {
            i = gpv.A02.A00.getButtonState();
        } else {
            i = 0;
        }
        this.A01 = i;
        GPV gpv2 = this.A02;
        if (gpv2 != null) {
            gpv2.A02.A00.getMetaState();
        }
        GPV gpv3 = this.A02;
        if (gpv3 != null) {
            int actionMasked = gpv3.A02.A00.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                    }
                    i2 = 3;
                }
                i2 = 2;
            }
            i2 = 1;
        } else {
            List list2 = this.A03;
            int i3 = 0;
            int size = list2.size();
            while (true) {
                if (i3 >= size) {
                    break;
                }
                GPU gpu = (GPU) list2.get(i3);
                if (!GPS.A02(gpu)) {
                    if (!gpu.A0C && gpu.A0B) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            i2 = 1;
        }
        this.A00 = i2;
    }
}
