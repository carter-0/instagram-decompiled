package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.comments.repository.StoryCommentsRepository;

/* renamed from: X.6kF  reason: invalid class name and case insensitive filesystem */
public final class C315636kF extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C317376nA A02;

    public C315636kF(AnonymousClass0iw r2, UserSession userSession, C317376nA r4) {
        0qQ.A0B(r4, 2);
        0qQ.A0B(r2, 3);
        this.A01 = userSession;
        this.A02 = r4;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        AnonymousClass0iw r1 = this.A00;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r1, 1);
        StoryCommentsRepository storyCommentsRepository = new StoryCommentsRepository(r1, new C315646kG(userSession));
        return new C314556iS(userSession, 1Au.A00(userSession), this.A02, new C317746nl(userSession), storyCommentsRepository, A002);
    }
}
