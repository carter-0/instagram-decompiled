package X;

import android.content.Context;
import android.os.PowerManager;

public final class QAJ extends S5N {
    public final PowerManager A00;
    public final /* synthetic */ 2X4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QAJ(Context context, 2X4 r4) {
        super(r4);
        this.A01 = r4;
        this.A00 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
