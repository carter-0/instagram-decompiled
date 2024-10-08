package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class T6W implements C13966TmT {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;
    public final String A04;

    public T6W(File file, String str, String str2, long j, long j2) {
        0qQ.A0B(str, 1);
        this.A04 = str;
        this.A02 = file;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    public final long Cfu() {
        return this.A00;
    }

    public final InputStream E15() {
        long j = this.A01;
        if (j == 0) {
            long j2 = this.A00;
            File file = this.A02;
            if (j2 == file.length()) {
                return new FileInputStream(file);
            }
        }
        FileInputStream fileInputStream = new FileInputStream(this.A02);
        fileInputStream.skip(j);
        return new RC5(fileInputStream, this.A00);
    }

    public final String getContentType() {
        return this.A03;
    }

    public final String getName() {
        return this.A04;
    }
}
