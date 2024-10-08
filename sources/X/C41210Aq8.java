package X;

import android.os.MemoryFile;

/* renamed from: X.Aq8  reason: case insensitive filesystem */
public final /* synthetic */ class C41210Aq8 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MemoryFile A01;
    public final /* synthetic */ XPT A02;
    public final /* synthetic */ C21451Xb3 A03;

    public /* synthetic */ C41210Aq8(MemoryFile memoryFile, XPT xpt, C21451Xb3 xb3, int i) {
        this.A02 = xpt;
        this.A03 = xb3;
        this.A01 = memoryFile;
        this.A00 = i;
    }

    public final void run() {
        XPT xpt = this.A02;
        C21451Xb3 xb3 = this.A03;
        MemoryFile memoryFile = this.A01;
        int i = this.A00;
        C387389m8 r4 = xpt.A02;
        String str = xb3.A05;
        str.getClass();
        if (C387389m8.A02(r4, str)) {
            if (memoryFile != null) {
                if (r4.A0I == null) {
                    r4.A0I = new MemoryFile[40];
                }
                if (i >= r4.A0I.length) {
                    MemoryFile[] memoryFileArr = r4.A0I;
                    int length = memoryFileArr.length;
                    r4.A0I = new MemoryFile[((int) (((float) length) * 1.5f))];
                    System.arraycopy(memoryFileArr, 0, r4.A0I, 0, length);
                }
                r4.A0I[i] = memoryFile;
                r4.A0A.add(Integer.valueOf(i));
                C387389m8.A00(r4);
                return;
            }
            0kD.A03("BoomerangCaptureController", "file is null in handlePreparedFile()");
            r4.A08(false);
        } else if (memoryFile != null) {
            memoryFile.close();
        }
    }
}
