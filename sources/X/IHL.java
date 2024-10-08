package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel;

public final class IHL implements 2YM {
    public final Application A00;
    public final FoaUserSession A01;
    public final C56568I1x A02;

    public IHL(Application application, FoaUserSession foaUserSession, C56568I1x i1x) {
        0qQ.A0B(i1x, 3);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = i1x;
    }

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        return new WriteWithAICreationViewModel(this.A00, this.A01, this.A02);
    }
}
