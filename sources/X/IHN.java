package X;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.feedback.data.FeedbackRepository;

public final class IHN implements 2YM {
    public final Application A00;
    public final FoaUserSession A01;
    public final HQ8 A02;
    public final C56092Hsf A03;
    public final Integer A04;
    public final boolean A05;

    public final /* synthetic */ 2YL create(C62230ry r2, AnonymousClass2YQ r3) {
        return 2YT.A00(this, r3, r2);
    }

    public final 2YL create(Class cls) {
        0qQ.A0B(cls, 0);
        boolean z = this.A05;
        Application application = this.A00;
        FoaUserSession foaUserSession = this.A01;
        return new C53017Gh8(application, new C55750Hml(foaUserSession, this.A02, this.A03, this.A04), new FeedbackRepository(application, foaUserSession), z);
    }

    public final /* synthetic */ 2YL create(Class cls, AnonymousClass2YQ r3) {
        return 2YT.A01(this, cls);
    }

    public IHN(Application application, FoaUserSession foaUserSession, HQ8 hq8, C56092Hsf hsf, Integer num, boolean z) {
        this.A05 = z;
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A03 = hsf;
        this.A02 = hq8;
        this.A04 = num;
    }
}
