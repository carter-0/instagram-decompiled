package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel;

public final class IHM implements 2YM {
    public final Application A00;
    public final FoaUserSession A01;
    public final C56506Hzc A02;
    public final C56088Hsb A03;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public final 2YL create(Class cls) {
        return new PromptSheetAIViewModel(this.A00, this.A01, this.A02, this.A03);
    }

    public IHM(Application application, FoaUserSession foaUserSession, C56506Hzc hzc, C56088Hsb hsb) {
        C51972G9s.A1D(hsb, hzc);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = hsb;
        this.A02 = hzc;
    }
}
