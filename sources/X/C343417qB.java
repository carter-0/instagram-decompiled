package X;

import android.graphics.SurfaceTexture;
import java.util.List;

/* renamed from: X.7qB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C343417qB implements C340947m5 {
    public final /* synthetic */ C340547lR A00;

    public /* synthetic */ C343417qB(C340547lR r1) {
        this.A00 = r1;
    }

    public final void DOg(String str, String str2) {
        C340547lR r4 = this.A00;
        r4.A0G = true;
        r4.A0R.A00(r4.A0S).ECm((SurfaceTexture) null);
        List list = r4.A0M.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C340507lN) list.get(i)).D5n(r4, str, str2);
        }
    }
}
