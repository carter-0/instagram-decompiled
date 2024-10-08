package X;

import android.app.Application;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;

/* renamed from: X.7Zz  reason: invalid class name and case insensitive filesystem */
public final class C333707Zz extends 2Z7 {
    public final Application A00;
    public final C54039GyO A01;
    public final C53335GmL A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass1L1 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C333707Zz(Application application, C54039GyO gyO, C53335GmL gmL, UserSession userSession, AnonymousClass4DU r6, AnonymousClass1L1 r7) {
        super(application);
        0qQ.A0B(gmL, 1);
        0qQ.A0B(r7, 4);
        0qQ.A0B(userSession, 5);
        this.A02 = gmL;
        this.A00 = application;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = userSession;
        this.A01 = gyO;
    }

    public final 2YL create(Class cls) {
        C333937aO r15;
        0qQ.A0B(cls, 0);
        AnonymousClass4DU r0 = this.A04;
        C53335GmL gmL = this.A02;
        UserSession userSession = this.A03;
        C333717a0 r9 = new C333717a0(gmL, userSession, r0, this.A05);
        C333747a3 r6 = new C333747a3(C333727a1.A00(userSession), userSession);
        String str = gmL.A0E;
        C54039GyO gyO = this.A01;
        C333757a5 r8 = new C333757a5(gyO, gmL, userSession, str);
        C333787a8 r4 = new C333787a8(userSession);
        MediaCommentListRepository mediaCommentListRepository = new MediaCommentListRepository(r4, gyO, gmL, r8, (C333717a0) null, userSession, r0, r0.getModuleName());
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass2f1 A003 = AnonymousClass2f1.A00(userSession);
        1YZ r1 = 1YZ.A02;
        if (r1 != null) {
            r15 = r1.A01(userSession);
        } else {
            r15 = null;
        }
        Application application = this.A00;
        FollowUserDataSourceImpl followUserDataSourceImpl = new FollowUserDataSourceImpl(userSession, new C61960qR(application), C333947aP.A00(application, userSession, r0.getModuleName()));
        return new C52971GgO(application, r4, gmL, r6, mediaCommentListRepository, r8, r9, A002, userSession, A003, followUserDataSourceImpl, new C334007aW(userSession, followUserDataSourceImpl, new C333987aU()), r15, r0.getModuleName());
    }
}
