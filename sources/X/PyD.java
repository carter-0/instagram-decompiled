package X;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map;

public final class PyD implements Runnable {
    public final /* synthetic */ 2K1 A00;

    public PyD(2K1 r1) {
        this.A00 = r1;
    }

    public final void run() {
        OutputStreamWriter outputStreamWriter;
        2K1 r3 = this.A00;
        synchronized (r3) {
            2K1.A02(r3);
            2K1.A01(r3);
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(2K1.A00(r3), false));
                2K1.A00(r3).getPath();
                Iterator A0u = AnonymousClass7TF.A0u(r3.A02);
                while (A0u.hasNext()) {
                    Map.Entry entry = (Map.Entry) A0u.next();
                    entry.getKey();
                    outputStreamWriter.write((String) entry.getKey());
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        entry2.getKey();
                        entry2.getValue();
                        outputStreamWriter.write(",");
                        outputStreamWriter.write((String) entry2.getKey());
                        outputStreamWriter.write(":");
                        outputStreamWriter.write((String) entry2.getValue());
                    }
                    outputStreamWriter.write("\n");
                }
                outputStreamWriter.close();
            } catch (IOException e) {
                0KC.A0G("LoggingMetadataStore", "Unable to write usage log", e);
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
        }
        return;
        throw th;
    }
}
