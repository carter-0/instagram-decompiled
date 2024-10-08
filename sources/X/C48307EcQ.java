package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* renamed from: X.EcQ  reason: case insensitive filesystem */
public abstract class C48307EcQ {
    public static final Et8 A00(Context context, Intent intent) {
        0RJ A01 = C59950cE.A01(context, intent, (0bY) null, 86400000, 0);
        if (A01 == null) {
            EVT evt = EVT.PUBLIC;
            0sn r1 = 0sn.A00;
            return new C47280Du8(evt, r1, r1);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str = A01.A01;
        if (str != null) {
            A1C.add(str);
        }
        return new C47279Du7(intent, A1C);
    }
}
