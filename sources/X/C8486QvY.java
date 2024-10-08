package X;

import android.content.SharedPreferences;

/* renamed from: X.QvY  reason: case insensitive filesystem */
public final class C8486QvY extends C8492Qve {
    public SharedPreferences A00;
    public long A01;
    public long A02 = -1;
    public final SEI A03 = new SEI(this, AnonymousClass7TE.A0R(SDN.A09.A00));

    public C8486QvY(C11381SQt sQt) {
        super(sQt);
    }

    public final long A0K() {
        C11200SFa.A00();
        A0J();
        long j = this.A01;
        if (j == 0) {
            j = this.A00.getLong("first_run", 0);
            if (j == 0) {
                j = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.A00.edit();
                edit.putLong("first_run", j);
                if (!edit.commit()) {
                    ST5.A0B(this, "Failed to commit first run time", 5);
                }
            }
            this.A01 = j;
        }
        return j;
    }

    public final long A0L() {
        C11200SFa.A00();
        A0J();
        long j = this.A02;
        if (j != -1) {
            return j;
        }
        long j2 = this.A00.getLong("last_dispatch", 0);
        this.A02 = j2;
        return j2;
    }

    public final void A0M() {
        C11200SFa.A00();
        A0J();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.A02 = currentTimeMillis;
    }
}
