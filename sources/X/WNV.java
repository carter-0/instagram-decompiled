package X;

import java.util.List;

public final class WNV implements X3G {
    public int A00 = -1;
    public int A01 = -1;
    public final Runnable A02;

    public WNV(Runnable runnable) {
        this.A02 = runnable;
    }

    public final void DvO(List list) {
        if (!list.isEmpty()) {
            int i = 0;
            int i2 = ((VRK) list.get(0)).A00;
            int i3 = ((VRK) C66582MXn.A0r(list)).A00;
            while (i < list.size()) {
                if (((VRK) list.get(i)).A01 < 300 || (i2 == this.A00 && i3 == this.A01)) {
                    i++;
                } else {
                    this.A02.run();
                    this.A00 = i2;
                    this.A01 = i3;
                    return;
                }
            }
        }
    }
}
