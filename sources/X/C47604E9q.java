package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.E9q  reason: case insensitive filesystem */
public final class C47604E9q extends C231632rz {
    public final FragmentActivity A00;
    public final E4j A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47604E9q(FragmentActivity fragmentActivity, E4j e4j) {
        this.A00 = fragmentActivity;
        this.A01 = e4j;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1563886060);
        FragmentActivity fragmentActivity = this.A00;
        if (!(view == null || fragmentActivity == null || fragmentActivity.isFinishing())) {
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.account_missing_prompt_textview);
            A0R.setVisibility(0);
            DbT.A18(fragmentActivity, A0R, 2131952078);
            A0R.setTypeface(A0R.getTypeface(), 1);
            FP6.A00(A0R, 1, this);
        }
        AnonymousClass0fD.A0A(1623177106, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 672236167);
        View A09 = DbW.A09(DbV.A0D(viewGroup), viewGroup, R.layout.row_login_more_account, false);
        AnonymousClass0fD.A0A(1677857068, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
