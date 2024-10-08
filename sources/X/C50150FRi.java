package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

/* renamed from: X.FRi  reason: case insensitive filesystem */
public final class C50150FRi implements 2Kw {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50150FRi(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void invoke(Throwable th) {
        switch (this.A00) {
            case 0:
                ((Dialog) this.A02).dismiss();
                C59689JTv.A0C((Context) this.A01, "unknown_error_occured");
                return;
            case 1:
                ((F3H) this.A02).A00();
                C59689JTv.A07((Context) this.A01, 2131969788);
                return;
            default:
                1xC r4 = 1xC.A01;
                C310336ap A0X = DbV.A0X();
                A0X.A0H = "batch_unfollow_many_following_accounts_failed";
                A0X.A0D = DbV.A05((Fragment) this.A02).getQuantityString(R.plurals.unfollow_x_following_failed, DbS.A05(this.A01));
                A0X.A06();
                DbY.A1K(r4, A0X);
                return;
        }
    }
}
