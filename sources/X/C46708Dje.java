package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.login.api.AssistAccountRecoveryResponse$UhlAccount;
import java.util.List;

/* renamed from: X.Dje  reason: case insensitive filesystem */
public final class C46708Dje extends BaseAdapter {
    public Context A00;
    public E2J A01;
    public List A02;
    public final AnonymousClass0iw A03;

    public final int getCount() {
        return this.A02.size();
    }

    public final Object getItem(int i) {
        return this.A02.get(i);
    }

    public final long getItemId(int i) {
        return (long) this.A02.get(i).hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.uhl_multiple_account_row_item);
            view.setTag(new Ez1(view));
        }
        Ez1 ez1 = (Ez1) DbT.A0o(view);
        AssistAccountRecoveryResponse$UhlAccount assistAccountRecoveryResponse$UhlAccount = (AssistAccountRecoveryResponse$UhlAccount) this.A02.get(i);
        E2J e2j = this.A01;
        AnonymousClass0iw r2 = this.A03;
        FPF.A00(ez1.A00, 57, e2j, assistAccountRecoveryResponse$UhlAccount);
        ez1.A03.setUrl(assistAccountRecoveryResponse$UhlAccount.A00, r2);
        boolean isEmpty = TextUtils.isEmpty(assistAccountRecoveryResponse$UhlAccount.A01);
        TextView textView = ez1.A01;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(assistAccountRecoveryResponse$UhlAccount.A01);
        } else {
            textView.setVisibility(8);
        }
        ez1.A02.setText(assistAccountRecoveryResponse$UhlAccount.A03);
        return view;
    }

    public C46708Dje(Context context, AnonymousClass0iw r2, E2J e2j, List list) {
        this.A02 = list;
        this.A00 = context;
        this.A01 = e2j;
        this.A03 = r2;
    }
}
