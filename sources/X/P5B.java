package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreStickerResponseItem;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class P5B implements AnonymousClass7B5 {
    public final /* synthetic */ C327367Am A00;

    public /* synthetic */ P5B(C327367Am r1) {
        this.A00 = r1;
    }

    public final AnonymousClass7FW AXV(Context context, UserSession userSession, AnonymousClass9HC r39, AnonymousClass7LQ r40, AnonymousClass7L2 r41, 17i r42) {
        SpannableStringBuilder append;
        String string;
        AnonymousClass7LQ r0 = r40;
        C254703su r1 = r0.A0e;
        C254933tI A0P = r1.A0P();
        A0P.getClass();
        String str = A0P.A0T;
        str.getClass();
        String str2 = A0P.A0R;
        str2.getClass();
        2FW r21 = 2FW.A1g;
        String str3 = A0P.A0U;
        String str4 = A0P.A0Q;
        Boolean valueOf = Boolean.valueOf(A0P.A05());
        Context context2 = context;
        boolean A02 = 0mk.A02(context2);
        SpannableStringBuilder A0E = C51965G9l.A0E();
        if (A02) {
            append = A0E.append(context2.getString(2131959257));
            string = " 📎";
        } else {
            append = A0E.append("📎 ");
            string = context2.getString(2131959257);
        }
        C254933tI r8 = new C254933tI((C376649Iu) null, (AnonymousClass9JI) null, (AnonymousClass77X) null, (AnonymousClass7FN) null, (AnonymousClass7FJ) null, (AnonymousClass55L) null, (C271374ik) null, (C2609947v) null, (C254873tC) null, (UVA) null, (1Xj) null, (2FW) null, r21, (AnonymousClass53G) null, (DirectStoreStickerResponseItem) null, (ExtendedImageUrl) null, valueOf, str2, (String) null, str, str4, str3, append.append(string).toString(), (List) null, (Map) null, 0);
        User user = r0.A0K;
        String A03 = r8.A03();
        A03.getClass();
        boolean A01 = AnonymousClass48R.A01(r1.A1F);
        boolean A0E2 = 0mp.A0E(r8.A03());
        UserSession userSession2 = userSession;
        AnonymousClass7FE A012 = AnonymousClass7FD.A01(userSession2, r39, r0, r41, r8, r21);
        return new AnonymousClass79c(AnonymousClass5FV.None, AnonymousClass7FG.A02(userSession2, r0, r8), A012, A03, DbX.A0r(user), A01, A0E2, r1.A2O, C327367Am.A0H(userSession2, user, AnonymousClass7TF.A1Q(r0.A00)));
    }
}
