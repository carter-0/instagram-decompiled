package X;

import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

/* renamed from: X.Jgx  reason: case insensitive filesystem */
public final class C60178Jgx extends 2YL {
    public Bitmap A00;
    public AnonymousClass9P8 A01;
    public final AnonymousClass2Fj A02 = JTO.A0K();
    public final ClipsDraftRepository A03;
    public final 1Av A04;
    public final UserSession A05;

    public C60178Jgx(UserSession userSession, ClipsDraftRepository clipsDraftRepository) {
        0qQ.A0B(userSession, 2);
        this.A03 = clipsDraftRepository;
        this.A05 = userSession;
        this.A04 = 1Au.A00(userSession);
    }
}
