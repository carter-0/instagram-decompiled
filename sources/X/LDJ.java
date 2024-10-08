package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class LDJ {
    public View A00;
    public C331157Pu A01;
    public final UserSession A02;

    public LDJ(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    public final void A00(Context context, View view, Fragment fragment) {
        C62260Kcu kcu;
        boolean A1b = C51973G9u.A1b(context, fragment, view);
        UserSession userSession = this.A02;
        boolean z = !C278264wZ.A03(userSession);
        this.A00 = view;
        int A09 = JTR.A09(context);
        View view2 = this.A00;
        if (view2 != null) {
            view2.setPivotX(((float) 0nA.A09(context)) / 2.0f);
            view2.setPivotY((float) A09);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        C331127Pr A0W = DbS.A0W(userSession);
        DbZ.A0z(context, A0W, 2131965182);
        A0W.A0k = A1b;
        A0W.A03 = 0.6f;
        A0W.A0q = A1b;
        A0W.A0k = false;
        A0W.A1O = A1b;
        A0W.A04 = 1.0f;
        DbS.A1S(A0W, A1b);
        A0W.A0x = A1b;
        A0W.A0T = new C65736Lyq(this, dimensionPixelSize, z);
        C331157Pu A002 = A0W.A00();
        this.A01 = A002;
        if ((fragment instanceof C62260Kcu) && (kcu = (C62260Kcu) fragment) != null) {
            kcu.A01 = A002;
        }
        AnonymousClass37D A022 = AnonymousClass37D.A00.A02(context);
        if (A022 != null) {
            AnonymousClass37F r2 = (AnonymousClass37F) A022;
            if (r2.A0g) {
                r2.A0H = new C65751Lz5(6, context, fragment, this);
                A022.A0B();
                return;
            }
        }
        C331157Pu r0 = this.A01;
        if (r0 != null) {
            r0.A03(context, fragment);
        }
    }
}
