package X;

import android.content.Context;
import com.instagram.model.reels.Reel;

public final class KAT extends 1P0 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ AnonymousClass6ST A02;
    public final /* synthetic */ C314696ih A03;

    public KAT(Context context, Reel reel, AnonymousClass6ST r3, C314696ih r4) {
        this.A03 = r4;
        this.A01 = reel;
        this.A00 = context;
        this.A02 = r3;
    }

    public final void onFail(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(291856648);
        11Z.A03(new C65943M5g(this));
        AnonymousClass0fD.A0A(1511759213, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-932955222);
        11Z.A03(new C65944M5h(this));
        AnonymousClass0fD.A0A(-1594366195, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-1994936828);
        int A033 = AnonymousClass0fD.A03(-589447580);
        11Z.A03(new M8J((K14) obj, this));
        AnonymousClass0fD.A0A(-1671796133, A033);
        AnonymousClass0fD.A0A(-548267019, A032);
    }
}
