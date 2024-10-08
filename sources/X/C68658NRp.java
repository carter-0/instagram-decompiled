package X;

import com.instagram.android.R;

/* renamed from: X.NRp  reason: case insensitive filesystem */
public final class C68658NRp extends 0ng {
    public final /* synthetic */ C67010Mgi A00;
    public final /* synthetic */ Integer A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68658NRp(C67010Mgi mgi, Integer num) {
        super(592);
        this.A00 = mgi;
        this.A01 = num;
    }

    public final void run() {
        int i;
        C67010Mgi mgi = this.A00;
        if (this.A01.intValue() != 0) {
            i = R.raw.poses_shutter;
        } else {
            i = R.raw.poses_shutter_final_interval;
        }
        C67010Mgi.A02(mgi, i);
    }
}
