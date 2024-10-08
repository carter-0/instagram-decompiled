package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;

public final class IMN implements C270754hF {
    public final String A00;
    public final String A01;
    public final /* synthetic */ PromptPivotPageRepository A02;

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        String str = this.A00;
        String str2 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "clips/prompt_sticker_clips/", str);
        G9w.A1I(A0a, "prompt_sticker_id", str2, (String) null);
        return DbU.A0S(A0a, C54194H2o.class, C56320HwX.class);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        String str2 = this.A00;
        String str3 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "clips/prompt_sticker_clips/", str2);
        G9w.A1I(A0a, "prompt_sticker_id", str3, str);
        return DbU.A0S(A0a, C54194H2o.class, C56320HwX.class);
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    public IMN(PromptPivotPageRepository promptPivotPageRepository, String str, String str2) {
        this.A02 = promptPivotPageRepository;
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* synthetic */ boolean CTp(boolean z) {
        return false;
    }
}
