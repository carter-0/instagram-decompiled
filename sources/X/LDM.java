package X;

import android.content.Context;
import java.io.PrintWriter;

public final class LDM {
    public static LDM A03;
    public final PrintWriter A00;
    public final C249513ju A01 = G9w.A0w();
    public final C262224Cq A02;

    public final void finalize() {
        this.A00.close();
        this.A01.AI3((Throwable) null);
    }

    public LDM(Context context) {
        AnonymousClass19S A012 = AnonymousClass1HX.A01(1893943706, 3);
        this.A02 = A012;
        this.A00 = new PrintWriter(context.getApplicationContext().openFileOutput("mobile_config_usage.csv", 0), true);
        AnonymousClass7TE.A1Z(new MH3(this, (AnonymousClass4D7) null, 21), A012);
    }
}
