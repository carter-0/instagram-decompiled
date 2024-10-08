package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;

public abstract class EC6 extends 1P0 {
    public final Context A00;
    public final View A01;
    public final 0hq A02;
    public final boolean A03;
    public final Handler A04 = new Handler();

    public EC6(Context context, View view, 0hq r4, boolean z) {
        this.A00 = context;
        this.A02 = r4;
        this.A03 = z;
        this.A01 = view;
    }

    public void onFail(C268654dm r4) {
        int A032 = AnonymousClass0fD.A03(1638653293);
        C59689JTv.A07(this.A00, 2131972232);
        AnonymousClass0fD.A0A(-796472901, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-2132906898);
        this.A04.post(new C51283Frc(this));
        AnonymousClass0fD.A0A(1051232325, A032);
    }
}
