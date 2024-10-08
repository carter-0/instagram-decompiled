package X;

import android.content.Context;

public final class FVS implements C51897G6n {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FVS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                DbS.A1U(this.A01);
                return;
            case 1:
                DbS.A1V(this.A02);
                context = (Context) this.A01;
                str = "family_center_bloks_action_failed";
                break;
            default:
                DbS.A1V(this.A02);
                context = (Context) this.A01;
                str = "supervision_bloks_action_failed";
                break;
        }
        C59689JTv.A0F(context, str, 2131961756);
    }

    public final void onSuccess() {
        if (this.A00 != 0) {
            DbS.A1V(this.A02);
        } else {
            DbS.A1U(this.A02);
        }
    }
}
