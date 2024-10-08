package X;

import java.io.Reader;
import java.nio.CharBuffer;

/* renamed from: X.3JA  reason: invalid class name */
public abstract class AnonymousClass3JA {
    public static String A00(Readable readable) {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            Reader reader = (Reader) readable;
            char[] cArr = new char[C249703kE.FLAG_MOVED];
            while (true) {
                int read = reader.read(cArr);
                if (read == -1) {
                    break;
                }
                sb.append(cArr, 0, read);
            }
        } else {
            CharBuffer allocate = CharBuffer.allocate(C249703kE.FLAG_MOVED);
            while (readable.read(allocate) != -1) {
                allocate.flip();
                sb.append(allocate);
                allocate.clear();
            }
        }
        return sb.toString();
    }
}
