package X;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* renamed from: X.5N5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5N5 implements Handler.Callback {
    public final /* synthetic */ AnonymousClass5N4 A00;

    public /* synthetic */ AnonymousClass5N5(AnonymousClass5N4 r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        AnonymousClass5N4 r3 = this.A00;
        Iterator it = r3.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass5NG r1 = (AnonymousClass5NG) it.next();
            if (!r1.A02 && r1.A01) {
                r1.A00.A00();
                r1.A00 = new C264774Rf();
                r1.A01 = false;
            }
            if (((AnonymousClass4S5) r3.A04).A00.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }
}
