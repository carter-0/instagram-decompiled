package X;

import com.facebook.papaya.log.LogSink;
import java.util.Iterator;
import java.util.Map;

public final class QY4 extends LogSink {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final synchronized void event(long j, long j2, long j3, int i, Map map, String str) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00);
        while (A0v.hasNext()) {
            ((LogSink) A0v.next()).event(j, j2, j3, i, map, str);
        }
    }

    public final synchronized void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00);
        while (A0v.hasNext()) {
            ((LogSink) A0v.next()).log(j, j2, j3, i, str, i2, str2);
        }
    }
}
