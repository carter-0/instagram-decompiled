package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.AsW  reason: case insensitive filesystem */
public final /* synthetic */ class C41349AsW implements Callable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ File A02;

    public /* synthetic */ C41349AsW(Bitmap bitmap, UserSession userSession, File file) {
        this.A01 = userSession;
        this.A02 = file;
        this.A00 = bitmap;
    }

    public final Object call() {
        File file = this.A02;
        AEI.A02(this.A00, file, false);
        return file;
    }
}
