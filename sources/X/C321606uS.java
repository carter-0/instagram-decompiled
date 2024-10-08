package X;

/* renamed from: X.6uS  reason: invalid class name and case insensitive filesystem */
public final class C321606uS {
    public int A00;
    public final 02m A01;

    public C321606uS(02m r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void A01(String str, boolean z) {
        02m r2;
        String str2;
        int i = this.A00;
        if (i != 0) {
            if (i == 224331890) {
                str2 = "Previous tail load did not end";
            } else if (i == 224338334) {
                str2 = "Previous head load did not end";
            } else if (i != 224340202) {
                str2 = "";
            } else {
                str2 = "Previous reload did not end";
            }
            02m r22 = this.A01;
            r22.markerAnnotate(i, "cancel_reason", str2);
            r22.markerEnd(this.A00, 4);
            this.A00 = 0;
        }
        if (str.equals("head_load")) {
            this.A00 = 224338334;
            r2 = this.A01;
            r2.markerStart(224338334);
        } else if (str.equals("reload")) {
            this.A00 = 224340202;
            02m r23 = this.A01;
            r23.markerStart(224340202);
            r23.markerAnnotate(this.A00, "is_user_initiated", z);
            r23.markerAnnotate(this.A00, "is_blocked_by_rate_limiter", false);
            return;
        } else if (str.equals("tail_load")) {
            this.A00 = 224331890;
            r2 = this.A01;
            r2.markerStart(224331890);
            r2.markerPoint(this.A00, "tail_load_indicator_start");
        } else {
            return;
        }
        r2.markerAnnotate(this.A00, "is_user_initiated", z);
    }

    public final void A00() {
        int i = this.A00;
        if (i != 0) {
            02m r2 = this.A01;
            r2.markerAnnotate(i, "is_private_profile", true);
            r2.markerPoint(this.A00, "no_grid_rendered");
            int i2 = this.A00;
            if (i2 != 0) {
                r2.markerEnd(i2, 2);
                this.A00 = 0;
            }
        }
    }
}
