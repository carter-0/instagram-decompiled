package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.instagram.android.R;
import java.util.Calendar;

/* renamed from: X.EDt  reason: case insensitive filesystem */
public final class C47710EDt extends C14097Tpp {
    public final View A0J(Context context) {
        return DbT.A0D(DbT.A0B(context), (ViewGroup) null, R.layout.date_picker_spinner, false);
    }

    public final /* bridge */ /* synthetic */ void A0M(View view, C307786Rm r7, C276544tV r8, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        Calendar instance = Calendar.getInstance();
        ((DatePicker) view).init(instance.get(1), DbZ.A06(instance), DbU.A03(instance), (DatePicker.OnDateChangedListener) null);
    }

    public final /* bridge */ /* synthetic */ Object A0K(View view, C307786Rm r8, C276544tV r9, Object obj) {
        boolean A1Z = AnonymousClass7TG.A1Z(view, r8);
        0qQ.A0B(r9, 2);
        DatePicker datePicker = (DatePicker) view;
        C277014uI A09 = r9.A09();
        Calendar instance = Calendar.getInstance();
        datePicker.init(instance.get(A1Z ? 1 : 0), instance.get(2), DbU.A03(instance), new FQR(r8, r9, A09, A1Z));
        datePicker.setMaxDate(Calendar.getInstance().getTimeInMillis());
        return null;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }

    public C47710EDt(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
