package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6AI  reason: invalid class name */
public final class AnonymousClass6AI {
    public OTA A00;
    public Process A01;
    public final Thread A02;
    public final Runtime A03;
    public final Thread A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    public static final void A00(AnonymousClass6AI r8) {
        if (!r8.A05.getAndSet(true)) {
            Process process = r8.A01;
            process.destroy();
            process.waitFor();
            OTA ota = r8.A00;
            synchronized (ota) {
                if (!ota.A01.getAndSet(true)) {
                    File[] fileArr = (File[]) OTA.A00("list temp directory", new C73920Pm0(ota, 34));
                    if (fileArr != null) {
                        for (File file : fileArr) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("deleting ");
                            sb.append(file);
                            OTA.A00(sb.toString(), new C73920Pm0(file, 33));
                        }
                    }
                    File file2 = ota.A00;
                    if (file2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("deleting ");
                        sb2.append(file2);
                        OTA.A00(sb2.toString(), new C73920Pm0(file2, 33));
                    }
                    ota.A00 = null;
                }
            }
            try {
                r8.A03.removeShutdownHook(r8.A04);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public AnonymousClass6AI(File file, Runtime runtime) {
        this.A03 = runtime;
        Thread thread = new Thread(new PW6(this));
        this.A04 = thread;
        this.A00 = new OTA(file);
        runtime.addShutdownHook(thread);
        String A0R = 002.A0R(file.getPath(), "/msys_logcat_logs");
        String[] strArr = O5G.A02;
        0qQ.A0B(A0R, 0);
        this.A01 = runtime.exec((String[]) 0Yw.A0a(0Yw.A0a(0Yw.A0a(new String[]{"logcat"}, new String[]{"-f", A0R}), O5G.A00), O5G.A02));
        Thread thread2 = new Thread(new PW5(this));
        this.A02 = thread2;
        thread2.start();
    }
}
