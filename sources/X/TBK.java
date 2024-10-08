package X;

import android.content.Context;
import com.instagram.android.R;

public final class TBK implements Runnable {
    public final /* synthetic */ C7580QKv A00;

    public TBK(C7580QKv qKv) {
        this.A00 = qKv;
    }

    public final void run() {
        Context context;
        C7580QKv qKv = this.A00;
        AnonymousClass3M8 A002 = C7580QKv.A00(qKv);
        if (A002 != null && (context = qKv.A00) != null) {
            if (qKv.A0G == null) {
                C310336ap r2 = new C310336ap();
                r2.A04();
                r2.A0D = context.getString(2131953413);
                r2.A06();
                r2.A02();
                r2.A0D(context.getString(2131953402));
                r2.A0A(new C57276IVl(qKv, 0));
                r2.A01();
                r2.A04 = context.getDrawable(R.drawable.ig_logo);
                qKv.A0G = r2.A00();
            }
            A002.A06(80);
            A002.A0A(qKv.A0G);
        }
    }
}
