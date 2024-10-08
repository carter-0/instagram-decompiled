package X;

import java.util.List;

/* renamed from: X.RAe  reason: case insensitive filesystem */
public final class C8803RAe extends 0vM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ T85 A01;
    public final /* synthetic */ Integer A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8803RAe(T85 t85, Integer num, long j) {
        super("store_reels_swipe_signal", 691807841, 5, false, false);
        this.A02 = num;
        this.A01 = t85;
        this.A00 = j;
    }

    public final void loggedRun() {
        List list;
        String str;
        Integer num = this.A02;
        Integer num2 = AnonymousClass05K.A00;
        T85 t85 = this.A01;
        if (num == num2) {
            list = t85.A02;
        } else {
            list = t85.A03;
        }
        if (list.size() == t85.A00) {
            list.remove(0);
        }
        long j = this.A00;
        Pxe.A1J(j, list);
        AnonymousClass40N r5 = (AnonymousClass40N) t85.A04.getValue();
        if (num.intValue() != 0) {
            str = "profile_reel_swipes";
        } else {
            str = "iab_reel_swipes";
        }
        r5.FNg(str, j, t85.A01 * 86400000);
    }
}
