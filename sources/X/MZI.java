package X;

import android.content.Context;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class MZI implements MailboxCallback {
    public final /* synthetic */ AnonymousClass68H A00;

    public MZI(AnonymousClass68H r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AnonymousClass68P A002;
        int i;
        MailboxCallback[] mailboxCallbackArr;
        AtomicInteger atomicInteger;
        Mailbox mailbox = (Mailbox) obj;
        AnonymousClass68H r3 = this.A00;
        synchronized (r3) {
            0Sd.A00(mailbox);
            r3.A02 = mailbox;
            A002 = r3.A04.A00(AnonymousClass05K.A01);
            ConcurrentLinkedQueue concurrentLinkedQueue = r3.A07;
            mailboxCallbackArr = (MailboxCallback[]) concurrentLinkedQueue.toArray(new MailboxCallback[0]);
            concurrentLinkedQueue.clear();
        }
        AnonymousClass68F r7 = r3.A05;
        r7.A0R.getClass();
        synchronized (r3) {
            if (r3.A00 == null) {
                r3.A00 = new AnonymousClass67H(new AnonymousClass67D((Context) new Object[]{r7.A00.A01.A01}[0]));
            }
            atomicInteger = AnonymousClass67I.A00;
            atomicInteger.getAndIncrement();
        }
        r7.A0W.getClass();
        r7.A0X.getClass();
        synchronized (r3) {
            if (r3.A01 == null) {
                r3.A01 = new AnonymousClass67L(new AnonymousClass67J());
            }
            atomicInteger.getAndIncrement();
        }
        for (MailboxCallback onCompletion : mailboxCallbackArr) {
            onCompletion.onCompletion(mailbox);
        }
        if (A002 == AnonymousClass68P.A08) {
            AnonymousClass68H.A02(r3);
        }
    }
}
