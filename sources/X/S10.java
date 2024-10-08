package X;

import java.io.File;

public final class S10 {
    public final C10171Rnm A00;
    public volatile C13696TfE A01;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.TfE, java.lang.Object] */
    public final C13696TfE A00() {
        File file;
        if (this.A01 == null) {
            synchronized (this) {
                if (this.A01 == null) {
                    File cacheDir = this.A00.A00.A00.getCacheDir();
                    if (cacheDir == null) {
                        file = null;
                    } else {
                        file = JTO.A0s(cacheDir, "image_manager_disk_cache");
                    }
                    WF7 wf7 = null;
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        wf7 = new WF7(file);
                    }
                    this.A01 = wf7;
                }
                if (this.A01 == null) {
                    this.A01 = new Object();
                }
            }
        }
        return this.A01;
    }

    public S10(C10171Rnm rnm) {
        this.A00 = rnm;
    }
}
