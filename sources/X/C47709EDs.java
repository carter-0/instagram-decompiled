package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.EDs  reason: case insensitive filesystem */
public final class C47709EDs extends C14097Tpp {
    public final View A0J(Context context) {
        return DbT.A0D(DbT.A0B(context), (ViewGroup) null, R.layout.date_picker_spinner, false);
    }

    public final void A0M(View view, C307786Rm r4, C276544tV r5, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        DatePicker datePicker = (DatePicker) view;
        datePicker.init(0, 0, 0, (DatePicker.OnDateChangedListener) null);
        datePicker.setMinDate(0);
        datePicker.setMaxDate(Long.MAX_VALUE);
    }

    public final Object A0K(View view, C307786Rm r19, C276544tV r20, Object obj) {
        long j;
        View view2 = view;
        C307786Rm r11 = r19;
        boolean A1U = AnonymousClass7TF.A1U(0, view2, r11);
        C276544tV r10 = r20;
        0qQ.A0B(r10, 2);
        DatePicker datePicker = (DatePicker) view2;
        C277014uI A09 = r10.A09();
        C276544tV A07 = r10.A07(40);
        long j2 = 0;
        if (A07 != null) {
            j = A07.A04(44, 0);
            j2 = A07.A04(48, 0);
        } else {
            j = 0;
        }
        long j3 = 9223372036854775L;
        if (A07 != null) {
            j3 = A07.A04(49, 9223372036854775L);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j * 1000));
        datePicker.init(instance.get(A1U ? 1 : 0), instance.get(2), DbU.A03(instance), new FQR(r11, r10, A09, 0));
        datePicker.setMinDate(j2 * 1000);
        datePicker.setMaxDate(j3 * 1000);
        return null;
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }

    public C47709EDs(C307786Rm r1, C276544tV r2) {
        super(r1, r2);
    }
}
