package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.WgR  reason: case insensitive filesystem */
public final class C19846WgR implements C20989X8f {
    public final Context A00;
    public final Fragment A01;
    public final FragmentActivity A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C15490Udf A05;
    public final C18756Vzr A06;
    public final WYK A07;

    public C19846WgR(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C15490Udf udf, C18756Vzr vzr, WYK wyk) {
        C51974G9v.A0d(1, userSession, udf, wyk, vzr);
        this.A04 = userSession;
        this.A00 = context;
        this.A01 = fragment;
        this.A05 = udf;
        this.A07 = wyk;
        this.A06 = vzr;
        this.A03 = r4;
        this.A02 = fragment.requireActivity();
    }

    public final void D4l(C247733gp r7) {
        if (this.A01.mView != null) {
            C15490Udf udf = this.A05;
            if (r7.A0k && !r7.A0P) {
                Wv0 wv0 = udf.A06.A00;
                if (!wv0.remove(r7)) {
                    int size = C13990Tnq.A0L(wv0).size();
                    if (size < 25) {
                        wv0.add(r7);
                    } else {
                        Context context = udf.A03;
                        C59689JTv.A03(context, DbY.A0d(context.getResources(), size, R.plurals.selection_max_reached), (String) null, 0);
                    }
                }
                udf.A00();
            }
        }
    }

    public final void Cvp(C247733gp r2) {
        this.A06.A01(r2);
    }

    public final void D8C(C247733gp r2) {
        this.A07.A00(r2);
    }

    public final void Dw7(User user, String str) {
        UserSession userSession = this.A04;
        Bundle A012 = C46447Df9.A02().A01(userSession, C46474Dfc.A01(userSession, user.getId(), "DefaultLimitedCommentRowDelegate", this.A03.getModuleName()));
        new AnonymousClass6W8(this.A02, A012, userSession, ModalActivity.class, "profile").A0C(this.A00);
    }
}
