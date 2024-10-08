package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.Fsk  reason: case insensitive filesystem */
public final class C51352Fsk implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C51352Fsk(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    public final void run() {
        1xC r3 = 1xC.A01;
        Context context = this.A00;
        String str = this.A01;
        C310336ap A0a = DbS.A0a();
        if (str == null) {
            Resources resources = context.getResources();
            AnonymousClass9B9.A00();
            str = AnonymousClass7TF.A0d(resources, 2131952583);
        }
        A0a.A0D = str;
        A0a.A05();
        A0a.A0H = "ai_agent_picker_not_eligible_failure";
        DbY.A1K(r3, A0a);
    }
}
