package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

public final class LFB {
    public final Context A00;
    public final UserSession A01;
    public final MonetizationRepository A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(MMS.A00(this, 0));

    public final SpannableStringBuilder A00(C51884G5w g5w) {
        String A16;
        int i;
        boolean A06 = 182.A06(0Tu.A06, this.A01, 36319106743540638L);
        Context context = this.A00;
        if (A06) {
            A16 = AnonymousClass7TE.A16(context, 2131971808);
            i = 2131971811;
        } else {
            A16 = AnonymousClass7TE.A16(context, 2131964041);
            i = 2131966705;
        }
        String A162 = AnonymousClass7TE.A16(context, i);
        SpannableStringBuilder A0C = DbS.A0C(A16);
        AnonymousClass7AV.A05(A0C, new C48052ESv(g5w, "https://help.instagram.com/2635536099905516", DbV.A02(context)), A162);
        return A0C;
    }

    public final SpannableStringBuilder A01(C51884G5w g5w, String str, boolean z) {
        String A16;
        int i;
        boolean A06 = 182.A06(0Tu.A06, this.A01, 36319106743540638L);
        Context context = this.A00;
        if (A06) {
            int i2 = 2131971810;
            if (z) {
                i2 = 2131971809;
            }
            A16 = AnonymousClass7TE.A16(context, i2);
            i = 2131971812;
        } else {
            int i3 = 2131964044;
            if (z) {
                i3 = 2131964042;
            }
            A16 = AnonymousClass7TE.A16(context, i3);
            i = 2131964884;
        }
        String A162 = AnonymousClass7TE.A16(context, i);
        SpannableStringBuilder A0C = DbS.A0C(A16);
        AnonymousClass7AV.A05(A0C, new C48052ESv(g5w, str, DbV.A02(context)), A162);
        return A0C;
    }

    public LFB(Context context, UserSession userSession, MonetizationRepository monetizationRepository) {
        AnonymousClass7TG.A1P(userSession, monetizationRepository);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = monetizationRepository;
    }
}
