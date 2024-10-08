package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ks2  reason: case insensitive filesystem */
public abstract class C63134Ks2 {
    public static final void A00(Context context, UserSession userSession, KHN khn, boolean z, boolean z2) {
        int A0C;
        AnonymousClass7TG.A1T(khn, context, userSession);
        if (C51967G9n.A0l(z2 ? 1 : 0).intValue() != 0) {
            khn.setCtaButtonColor(R.color.grey_0);
            khn.setDescriptionTextColor(R.color.grey_4);
            A0C = R.color.black;
        } else {
            khn.setCtaButtonColor(2Yu.A07(context));
            khn.setDescriptionTextColor(2Yu.A08(context));
            A0C = 2Yu.A0C(context);
        }
        DbT.A16(khn.getContext(), khn.A01, A0C);
        khn.A02.setVisibility(DbW.A01(z ? 1 : 0));
        khn.setOnManagePermissionsClickedListener(new MJ9(10, context, userSession));
    }
}
