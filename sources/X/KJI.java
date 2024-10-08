package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class KJI extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C66478MTg A02;
    public final /* synthetic */ AnonymousClass2Np A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ File A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ ExecutorService A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJI(Context context, UserSession userSession, C66478MTg mTg, AnonymousClass2Np r7, File file, File file2, File file3, ExecutorService executorService) {
        super(626, 3, false, false);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r7;
        this.A07 = executorService;
        this.A05 = file;
        this.A04 = file2;
        this.A06 = file3;
        this.A02 = mTg;
    }

    public final void run() {
        try {
            AnonymousClass2Np r4 = this.A03;
            File file = this.A05;
            File file2 = this.A04;
            File file3 = this.A06;
            C9824Rhm.A00(r4, file, file2, file3, 0);
            this.A02.Dob(file3);
        } catch (IOException e) {
            this.A02.DEa(e);
        }
    }
}
