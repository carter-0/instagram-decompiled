package X;

import com.instagram.android.R;

public final class NSO extends 0ng {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C67010Mgi A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSO(C67010Mgi mgi, Integer num, long j, boolean z) {
        super(591);
        this.A01 = mgi;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }

    public final void run() {
        long j;
        C67010Mgi mgi;
        int i;
        long j2 = this.A00;
        Integer num = this.A02;
        int intValue = num.intValue();
        if (intValue != 0) {
            j = Long.MAX_VALUE;
        } else {
            j = 1000;
        }
        boolean A1U = Dba.A1U((j2 > j ? 1 : (j2 == j ? 0 : -1)));
        if (this.A03 || !A1U) {
            mgi = this.A01;
            if (intValue != 0) {
                i = -1;
            } else {
                i = R.raw.poses_countdown;
            }
        } else {
            mgi = this.A01;
            if (num.intValue() != 0) {
                i = R.raw.poses_shutter;
            } else {
                i = R.raw.poses_shutter_final_interval;
            }
        }
        C67010Mgi.A02(mgi, i);
    }
}
