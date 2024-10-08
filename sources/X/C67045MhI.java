package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.MhI  reason: case insensitive filesystem */
public final class C67045MhI extends 1KD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3BD A01;
    public final /* synthetic */ RecyclerView A02;
    public final /* synthetic */ AnonymousClass2t9 A03;
    public final /* synthetic */ C66633Ma2 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67045MhI(AnonymousClass3BD r2, RecyclerView recyclerView, AnonymousClass2t9 r4, C66633Ma2 ma2, int i) {
        super("prepopulateRecycledViewPoolForDirectInbox");
        this.A04 = ma2;
        this.A01 = r2;
        this.A00 = i;
        this.A03 = r4;
        this.A02 = recyclerView;
    }

    public final boolean onQueueIdle() {
        AnonymousClass3BD r9;
        int i;
        C66633Ma2 ma2 = this.A04;
        if (ma2.A1A || !ma2.A1B) {
            return false;
        }
        UserSession A0p = ma2.A0p();
        0Tu r7 = 0Tu.A05;
        if (!182.A06(r7, A0p, 36322572783790351L) || (!C66633Ma2.A04(ma2).A01 && !ma2.A0u().A01)) {
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                r9 = this.A01;
                i = this.A00;
                if (AnonymousClass3BD.A00(r9, i).A03.size() < ((int) 182.A01(r7, ma2.A0p(), 36604047760561149L)) && System.currentTimeMillis() - currentTimeMillis < 8) {
                    r9.A03(this.A03.createViewHolder(this.A02, i));
                }
            }
            return !JTQ.A1P(AnonymousClass3BD.A00(r9, i).A03.size(), DbS.A04(r7, ma2.A0p(), 36604047760561149L));
        }
        ma2.A0u().A0E("skip_preload_views_during_ttrc");
        C66633Ma2.A04(ma2).A0E("skip_preload_views_during_ttrc");
        return 182.A06(r7, ma2.A0p(), 36322572783921424L);
    }
}
