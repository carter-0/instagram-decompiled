package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lex  reason: case insensitive filesystem */
public final class C64613Lex implements C51897G6n {
    public final /* synthetic */ AnonymousClass9OT A00;
    public final /* synthetic */ MediaGenAIDetectionMethod A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void onFailure(Throwable th) {
    }

    public C64613Lex(AnonymousClass9OT r1, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A01 = mediaGenAIDetectionMethod;
    }

    public final void onSuccess() {
        JUL.A00.A03(this.A00, this.A01, this.A02, (Boolean) null, this.A03, "genai_transparency_learn_more_impression", this.A04);
    }
}
