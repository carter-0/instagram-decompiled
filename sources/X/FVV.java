package X;

import android.content.Context;

public final class FVV implements C360008dq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C229382nI A01;

    public FVV(Context context, C229382nI r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void DfA(C360018dr r5) {
        0qQ.A0B(r5, 0);
        if (r5 instanceof C385519j4) {
            Context context = this.A00;
            C59689JTv.A03(context, context.getString(2131968258), "network_error", 0);
            Throwable cause = ((C385519j4) r5).A00.getCause();
            if (cause != null) {
                0wb.A07(this.A01.A04.getModuleName(), cause);
            }
        } else if (r5 instanceof C361128fi) {
            11Z.A02(new C51413Ftj(this.A01, C46620Di0.A00(((C361128fi) r5).A00)));
        }
    }
}
