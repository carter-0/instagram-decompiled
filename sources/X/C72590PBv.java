package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;

/* renamed from: X.PBv  reason: case insensitive filesystem */
public final class C72590PBv implements C74334PtA {
    public final /* bridge */ /* synthetic */ AnonymousClass7FW ALM(Context context, C74541Pwa pwa, UserSession userSession, AnonymousClass7FE r89, AnonymousClass9HC r90, AnonymousClass7L2 r91, MessagingUser messagingUser, C74552Pwl pwl, MsysThreadSubtype msysThreadSubtype, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        String string;
        int i2;
        SpannableString spannableString;
        String str2;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        C51974G9v.A1P(userSession, r90, messagingUser2, pwl2);
        AnonymousClass7FE r2 = r89;
        C51972G9s.A1E(r2, r91);
        0qQ.A0B(msysThreadSubtype, 12);
        int i3 = i;
        int BS3 = pwl2.BS3(i3);
        boolean z5 = false;
        if (BS3 != -2) {
            if (BS3 != -1) {
                if (BS3 == 5) {
                    string = null;
                    str2 = C74552Pwl.A01(pwa, pwl2, i3);
                    spannableString = C66580MXl.A0D(str2);
                    Boolean valueOf = Boolean.valueOf(z5);
                    MessageIdentifier A0i = C66580MXl.A0i(pwl2.BSF(i3), String.valueOf(pwl2.BNc(i3)));
                    long C7b = pwl2.C7b(i3);
                    AnonymousClass7FR r7 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    return new NYY(new AnonymousClass7FT((C61063Jw1) null, r7, C327627Bo.NUX_TYPE_NONE, 2FW.A1M, A0i, (MessageIdentifier) null, (List) null, C7b, false, false, false, C74552Pwl.A02(messagingUser2, pwl2, i3), false), r2, valueOf, spannableString, string, (String) null, false);
                } else if (!C71134OdX.A00.A06(pwl2, i3)) {
                    string = context2.getString(2131976001);
                    i2 = 2131976000;
                }
            }
            string = context2.getString(2131968249);
            String A16 = AnonymousClass7TE.A16(context2, 2131968247);
            String A0g = 002.A0g(A16, System.lineSeparator(), AnonymousClass7TE.A16(context2, 2131968248));
            0qQ.A07(A0g);
            spannableString = C66580MXl.A0D(A0g);
            spannableString.setSpan(C66580MXl.A0E(2Yu.A0F(context2, R.attr.igds_color_link)), A16.length(), A0g.length(), 33);
            z5 = true;
            Boolean valueOf2 = Boolean.valueOf(z5);
            MessageIdentifier A0i2 = C66580MXl.A0i(pwl2.BSF(i3), String.valueOf(pwl2.BNc(i3)));
            long C7b2 = pwl2.C7b(i3);
            AnonymousClass7FR r72 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            return new NYY(new AnonymousClass7FT((C61063Jw1) null, r72, C327627Bo.NUX_TYPE_NONE, 2FW.A1M, A0i2, (MessageIdentifier) null, (List) null, C7b2, false, false, false, C74552Pwl.A02(messagingUser2, pwl2, i3), false), r2, valueOf2, spannableString, string, (String) null, false);
        }
        string = context2.getString(2131957495);
        i2 = 2131957494;
        str2 = context2.getString(i2);
        spannableString = C66580MXl.A0D(str2);
        Boolean valueOf22 = Boolean.valueOf(z5);
        MessageIdentifier A0i22 = C66580MXl.A0i(pwl2.BSF(i3), String.valueOf(pwl2.BNc(i3)));
        long C7b22 = pwl2.C7b(i3);
        AnonymousClass7FR r722 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        return new NYY(new AnonymousClass7FT((C61063Jw1) null, r722, C327627Bo.NUX_TYPE_NONE, 2FW.A1M, A0i22, (MessageIdentifier) null, (List) null, C7b22, false, false, false, C74552Pwl.A02(messagingUser2, pwl2, i3), false), r2, valueOf22, spannableString, string, (String) null, false);
    }
}
