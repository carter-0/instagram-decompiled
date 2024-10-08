package X;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.6Qx  reason: invalid class name and case insensitive filesystem */
public final class C307646Qx implements C307636Qw {
    public final AssetManager A00;
    public final C307576Qq A01;

    public final void AUw(Q3K q3k, Q3F q3f, String str, Map map, Executor executor) {
        C307606Qt r0 = (C307606Qt) this.A01.A00.get(str);
        if (r0 == null) {
            q3f.A01(new C7313Q3p(), new Exception(002.A0g("Attempting to fetch a bundle for appId: ", str, " but found no prebundled config")));
            return;
        }
        try {
            InputStream open = this.A00.open(r0.A00);
            0qQ.A07(open);
            executor.execute(new TFD(q3f, open));
        } catch (FileNotFoundException unused) {
            q3f.A01(new C7313Q3p(), new Exception(002.A0R("Could not read prebundled json file associated with appId: ", str)));
        }
    }

    public C307646Qx(AssetManager assetManager, C307576Qq r2) {
        this.A01 = r2;
        this.A00 = assetManager;
    }
}
