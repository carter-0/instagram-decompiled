package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;

public final class LD7 {
    public final Context A00;
    public final UserSession A01;
    public final C66485MTo A02;

    public LD7(Context context, UserSession userSession, C66485MTo mTo) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = mTo;
    }

    public final LAQ A00() {
        Context context = this.A00;
        String A16 = AnonymousClass7TE.A16(context, 2131959549);
        String A162 = AnonymousClass7TE.A16(context, 2131959550);
        SpannableStringBuilder A0C = DbS.A0C(A16);
        AnonymousClass7AV.A05(A0C, new C61920KRp(this, context.getColor(2Yu.A0D(context))), A162);
        return new LAQ(new C63772L6e(LV2.A00(this, 10), (C358278ae) null, 2131959551), new C63772L6e(LV2.A00(this, 11), (C358278ae) null, 2131959548), (C63772L6e) null, (Boolean) null, SpannableString.valueOf(A0C), 2131959552, 2131959552);
    }
}
