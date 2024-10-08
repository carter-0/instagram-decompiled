package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.LMq  reason: case insensitive filesystem */
public final class C64096LMq {
    public CharSequence[] A00;
    public final C65533Luw A01;
    public final C358248ab A02;
    public final Fragment A03;
    public final UserSession A04;

    public static final CharSequence[] A00(C64096LMq lMq) {
        if (lMq.A00 == null) {
            C65533Luw luw = lMq.A01;
            Resources resources = AnonymousClass7TE.A0S(luw.A0C).getResources();
            ArrayList A1C = AnonymousClass7TE.A1C();
            AnonymousClass3Q2 r0 = luw.A02;
            if (r0 != null) {
                boolean A13 = r0.A13();
                int i = 2131969287;
                if (A13) {
                    A1C.add(resources.getString(2131969303));
                    i = 2131969299;
                }
                A1C.add(resources.getString(i));
                A1C.add(resources.getString(2131969291));
                CharSequence[] charSequenceArr = new CharSequence[A1C.size()];
                lMq.A00 = charSequenceArr;
                A1C.toArray(charSequenceArr);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        CharSequence[] charSequenceArr2 = lMq.A00;
        if (charSequenceArr2 != null) {
            return charSequenceArr2;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public C64096LMq(Fragment fragment, UserSession userSession, C65533Luw luw) {
        AnonymousClass7TG.A1O(userSession, fragment);
        this.A04 = userSession;
        this.A03 = fragment;
        this.A01 = luw;
        C358248ab A0U = DbW.A0U(fragment);
        A0U.A0l(fragment, userSession);
        this.A02 = A0U;
    }
}
