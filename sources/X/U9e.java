package X;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class U9e extends AnonymousClass52S {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U9e(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public final PointF A00(int i) {
        if (this.A00 != 0) {
            return super.A00(i);
        }
        return ((LinearLayoutManager) this.A01).AIp(i);
    }

    public final int A08() {
        if (1 - this.A00 != 0) {
            return super.A08();
        }
        return -1;
    }

    public final int A09() {
        return -1;
    }
}
