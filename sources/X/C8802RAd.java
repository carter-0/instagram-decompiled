package X;

import java.util.List;

/* renamed from: X.RAd  reason: case insensitive filesystem */
public final class C8802RAd extends 0vM {
    public final /* synthetic */ long A00;
    public final /* synthetic */ T84 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8802RAd(T84 t84, long j) {
        super("store_reels_swipe_signal", 691807841, 5, false, false);
        this.A01 = t84;
        this.A00 = j;
    }

    public final void loggedRun() {
        T84 t84 = this.A01;
        List list = t84.A03;
        if (list.size() == t84.A00) {
            list.remove(0);
        }
        long j = this.A00;
        Pxe.A1J(j, list);
        ((AnonymousClass40N) t84.A04.getValue()).FNg("reels_swipe_history", j, t84.A02 * 86400000);
    }
}
