package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.common.collect.EvictingQueue;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public abstract class OLI {
    public EvictingQueue A00;
    public StringBuilder A01 = AnonymousClass7TE.A1A();
    public final Object A02 = new Object();
    public final SimpleDateFormat A03 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS", Locale.US);
    public final Set A04 = AnonymousClass7TE.A1F();

    public final void A00(String str, String str2, String str3, Throwable th, Date date) {
        String format;
        String str4;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Object obj = this.A02;
        synchronized (obj) {
            format = this.A03.format(date);
            0qQ.A07(format);
        }
        A1A.append(format);
        A1A.append("> ");
        if (str.length() != 0) {
            0JB r0 = 0JC.A00().A00;
            if (r0 == null || (str4 = r0.A00) == null || str4.length() == 0) {
                str4 = "main";
            }
            A1A.append(str);
            A1A.append(" [");
            A1A.append(str4);
            A1A.append("] ");
        }
        A1A.append(str2);
        A1A.append(": ");
        A1A.append(str3);
        if (th != null) {
            A1A.append(10);
            A1A.append(0Jc.A00(th));
        }
        String A10 = DbT.A10(A1A);
        synchronized (obj) {
            EvictingQueue evictingQueue = this.A00;
            if (evictingQueue == null) {
                evictingQueue = new EvictingQueue(IgNetworkConsentStorage.MAX_ENTRIES);
                this.A00 = evictingQueue;
            }
            evictingQueue.add(A10);
        }
    }
}
