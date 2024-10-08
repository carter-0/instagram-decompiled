package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class M9Y implements Runnable {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass7IG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ ConcurrentLinkedQueue A03;

    public M9Y(C53401GnY gnY, AnonymousClass7IG r2, Long l, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A03 = concurrentLinkedQueue;
        this.A01 = r2;
        this.A00 = gnY;
        this.A02 = l;
    }

    public final void run() {
        List A002 = MAY.A00(this.A03, 16);
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            A0r.add(JTO.A1A(it).A01);
        }
        AnonymousClass7IG r1 = this.A01;
        MessageIdentifier messageIdentifier = r1.A00;
        AnonymousClass7IA r2 = r1.A03;
        if (messageIdentifier != null) {
            r2.Dj8(messageIdentifier, A0r);
            r1.A00 = null;
            return;
        }
        r2.DjA(this.A00, this.A02, A0r);
    }
}
