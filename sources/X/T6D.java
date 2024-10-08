package X;

import java.io.File;

public final class T6D implements 1Fq {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;
    public final String A04;

    public final boolean isStreaming() {
        return true;
    }

    public T6D(File file, long j, long j2) {
        String name = file.getName();
        this.A02 = file;
        this.A04 = name;
        this.A03 = "application/octet-stream";
        this.A01 = j;
        this.A00 = j2;
    }

    public final void AAW(C7250Q0x q0x, String str) {
        q0x.A00(new T6W(this.A02, this.A04, this.A03, this.A01, this.A00), str);
    }

    public T6D(File file, String str) {
        String name = file.getName();
        long length = file.length();
        this.A02 = file;
        this.A04 = name;
        this.A03 = str;
        this.A01 = 0;
        this.A00 = length;
    }
}
