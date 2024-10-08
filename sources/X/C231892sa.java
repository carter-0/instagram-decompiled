package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sa  reason: invalid class name and case insensitive filesystem */
public final class C231892sa extends C231632rz {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;

    public C231892sa(Context context, Fragment fragment, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(fragment, 2);
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "TraySwitchIndicator";
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Context context;
        int i2;
        int A03 = AnonymousClass0fD.A03(-1933994987);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        View requireViewById = view.requireViewById(R.id.row_tray_switch_indicator);
        0qQ.A07(requireViewById);
        TextView textView = (TextView) requireViewById;
        int ordinal = ((AnonymousClass2uD) obj).ordinal();
        if (ordinal == 1) {
            context = this.A00;
            i2 = 2131971661;
        } else if (ordinal == 2) {
            context = this.A00;
            i2 = 2131971662;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
            AnonymousClass0fD.A0A(1004303321, A03);
            throw unsupportedOperationException;
        }
        textView.setText(context.getString(i2));
        AnonymousClass0fD.A0A(674051110, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1395169098);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.row_tray_switch_indicator, (ViewGroup) null);
        0qQ.A07(inflate);
        AnonymousClass0fD.A0A(-1200889578, A03);
        return inflate;
    }
}
