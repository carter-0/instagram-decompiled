package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;

/* renamed from: X.Uu2  reason: case insensitive filesystem */
public final class C16385Uu2 extends AnonymousClass2uL {
    public final Context A00;
    public final QuestionMediaResponseModel A01;
    public final AnonymousClass4M3 A02;
    public final String A03;
    public final UserSession A04;

    public C16385Uu2(Context context, UserSession userSession, QuestionMediaResponseModel questionMediaResponseModel, String str) {
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = str;
        this.A01 = questionMediaResponseModel;
        this.A02 = AnonymousClass4M0.A00(context, userSession, (C252323ov) null, this, str);
    }
}
