package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: X.Asf  reason: case insensitive filesystem */
public final class C41358Asf implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ boolean A03;

    public C41358Asf(Context context, Bitmap bitmap, UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = bitmap;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap bitmap = this.A01;
        boolean z = this.A03;
        File A002 = AnonymousClass45F.A00();
        AEI.A02(bitmap, A002, z);
        return A002;
    }
}
