package X;

import com.google.common.io.Closeables;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/* renamed from: X.Q0x  reason: case insensitive filesystem */
public final class C7250Q0x implements AnonymousClass1Px {
    public static final char[] A05;
    public C13885Tj8 A00;
    public final C13749TgL A01;
    public final List A02 = Pxe.A1A();
    public final 1Fn A03;
    public final C13749TgL A04;

    public final 1Fn Aqb() {
        return null;
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        0qQ.A07(charArray);
        A05 = charArray;
    }

    public final void A00(C13966TmT tmT, String str) {
        List list = this.A02;
        list.add(this.A01);
        C13966TmT tmT2 = tmT;
        list.add(new C7251Q0y("Content-Disposition: form-data; name=\"", str, "\"; filename=\"", tmT2.getName(), "\"", "\r\n", "Content-Type: ", tmT2.getContentType(), "\r\n", "Content-Transfer-Encoding: binary", "\r\n", "\r\n"));
        list.add(tmT2);
        list.add(new C7251Q0y("\r\n"));
    }

    public final 1Fn Aql() {
        return this.A03;
    }

    public final long getContentLength() {
        long j = 0;
        for (C13749TgL Cfu : this.A02) {
            j += Cfu.Cfu();
        }
        return j + this.A04.Cfu();
    }

    public C7250Q0x() {
        C13885Tj8 tj8 = C13885Tj8.A00;
        this.A00 = tj8;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Random random = new Random();
        int i = 0;
        do {
            char[] cArr = A05;
            A1A.append(cArr[random.nextInt(cArr.length)]);
            i++;
        } while (i < 30);
        String A10 = DbT.A10(A1A);
        this.A03 = new 1Fn("Content-Type", 002.A0R("multipart/form-data; boundary=", A10));
        this.A01 = new C7251Q0y("--", A10, "\r\n");
        this.A04 = new C7251Q0y("--", A10, "--", "\r\n");
        this.A00 = tj8;
    }

    public final InputStream E15() {
        long contentLength = getContentLength();
        C13885Tj8 tj8 = this.A00;
        long j = 0;
        tj8.onBytesTransferred(0, contentLength);
        Vector vector = new Vector();
        try {
            for (C13749TgL tgL : this.A02) {
                vector.add(tgL.E15());
                j += tgL.Cfu();
            }
            C13749TgL tgL2 = this.A04;
            vector.add(tgL2.E15());
            return new C7238Q0k(tj8, new SequenceInputStream(vector.elements()), j + tgL2.Cfu());
        } catch (IOException e) {
            Iterator A1G = AnonymousClass7TE.A1G(vector);
            while (A1G.hasNext()) {
                Closeables.A01((InputStream) A1G.next());
            }
            throw e;
        }
    }
}
