package X;

import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

public final class AVT implements X9O {
    public int A00 = 1;
    public int A01 = 1;
    public final AA3 A02 = new AA3(new C40085AQq(this), 1);

    public final C368888tU B7P() {
        return C368888tU.RGBA;
    }

    public final boolean CKW() {
        return this.A02.A05(C368888tU.RGBA);
    }

    public final boolean E4b(C368538so r3, boolean z) {
        AA3 aa3 = this.A02;
        if (aa3.A04(r3, z)) {
            return true;
        }
        Iterator it = aa3.A06.A00.iterator();
        while (it.hasNext()) {
            if (((C368858tR) it.next()).A02) {
                return true;
            }
        }
        return false;
    }

    public final void ELj() {
        this.A02.A01();
    }

    public final void EZY(boolean z) {
        this.A02.A04 = z;
    }

    public final void Eho(List list) {
        this.A02.A03(this, list);
    }

    public final void release() {
        this.A02.A00();
    }

    public final void setSize(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02.A02(i, i2);
    }

    public final void CMh(C344557s3 r6, C345557ti r7) {
        release();
        AA3 aa3 = this.A02;
        A81 a81 = new A81(r7, R.raw.rgba_vs, R.raw.rgba_fs, false);
        if (aa3.A0B != null) {
            A81 a812 = aa3.A0B;
            C369008tg r0 = a812.A02;
            if (r0 != null) {
                r0.A01();
                a812.A02 = null;
            }
            a812.A03.A02();
        }
        aa3.A0B = a81;
        aa3.A02(this.A01, this.A00);
    }
}
