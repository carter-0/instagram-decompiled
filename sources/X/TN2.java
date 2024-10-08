package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.concurrent.Callable;

public final class TN2 implements Callable {
    public final /* synthetic */ AnonymousClass6R2 A00;

    public TN2(AnonymousClass6R2 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object call() {
        AnonymousClass6R2 r1 = this.A00;
        try {
            1KZ.A01(002.A0T("BloksComponentQueryDiskCache", QuickExperimentDumperPlugin.CLEAR_CMD, ':'));
            r1.A01.A00.removeAll();
            AnonymousClass6R2.A00(r1, 0Yt.A0E());
            1KZ.A00();
            return C60340gF.A00;
        } catch (Throwable th) {
            1KZ.A00();
            throw th;
        }
    }
}
