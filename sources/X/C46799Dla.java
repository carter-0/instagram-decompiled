package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.user.userlist.data.LikesListRepository;

/* renamed from: X.Dla  reason: case insensitive filesystem */
public final class C46799Dla extends 2Z7 {
    public final Application A00;
    public final C61079JwH A01;
    public final UserSession A02;
    public final LikesListRepository A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46799Dla(Application application, C61079JwH jwH, UserSession userSession, LikesListRepository likesListRepository) {
        super(application);
        AnonymousClass7TF.A1D(userSession, 2, jwH);
        this.A00 = application;
        this.A02 = userSession;
        this.A03 = likesListRepository;
        this.A01 = jwH;
    }

    public final 2YL create(Class cls) {
        LikesListRepository likesListRepository = this.A03;
        if (likesListRepository == null) {
            likesListRepository = new LikesListRepository(this.A02);
        }
        return new C46729DkI(this.A00, this.A01, this.A02, likesListRepository);
    }
}
