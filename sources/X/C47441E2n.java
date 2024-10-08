package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: X.E2n  reason: case insensitive filesystem */
public final class C47441E2n extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ActivityCenterDatePickerFragment";
    public GregorianCalendar A00;
    public TextView A01;
    public UserSession A02;
    public String A03;
    public final AnonymousClass0wW A04 = this.A02;
    public final DateFormat A05 = DateFormat.getDateInstance(1, AnonymousClass1Q2.A02());
    public final Calendar A06 = Calendar.getInstance();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        DbX.A1A(FP4.A00(this, 57), DbX.A0M(), r3);
        ? obj = new Object();
        String str = this.A03;
        if (str == null) {
            0qQ.A0F(DialogModule.KEY_TITLE);
            throw AnonymousClass00P.createAndThrow();
        }
        obj.A02 = str;
        C59904JbT.A01(FP4.A00(this, 58), r3, obj);
    }

    public static final void A00(C47441E2n e2n) {
        TextView textView = e2n.A01;
        String str = "dateTextView";
        if (textView != null) {
            DateFormat dateFormat = e2n.A05;
            GregorianCalendar gregorianCalendar = e2n.A00;
            if (gregorianCalendar == null) {
                str = "selectedDate";
            } else {
                textView.setText(dateFormat.format(Long.valueOf(gregorianCalendar.getTimeInMillis())));
                Context requireContext = e2n.requireContext();
                TextView textView2 = e2n.A01;
                if (textView2 != null) {
                    DbY.A12(textView2, requireContext);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "select_date";
    }

    public final AnonymousClass0wW getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        Resources A052;
        int i;
        int A022 = AnonymousClass0fD.A02(1310106775);
        C47441E2n.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = DbX.A0U(this);
        String string = requireArguments.getString(AnonymousClass000.A00(555));
        if (string != null) {
            if (string.equals("start_title")) {
                A052 = DbV.A05(this);
                i = 2131974174;
            } else if (string.equals("end_title")) {
                A052 = DbV.A05(this);
                i = 2131961711;
            }
            this.A03 = A052.getString(i);
            int i2 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            this.A00 = gregorianCalendar;
            gregorianCalendar.setTimeInMillis(((long) i2) * 1000);
            AnonymousClass0fD.A09(-1290924667, A022);
        }
        A052 = DbV.A05(this);
        i = 2131973034;
        this.A03 = A052.getString(i);
        int i22 = requireArguments.getInt("com.instagram.android.fragment.ARGUMENTS_KEY_EXTRA_SECONDS");
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        this.A00 = gregorianCalendar2;
        gregorianCalendar2.setTimeInMillis(((long) i22) * 1000);
        AnonymousClass0fD.A09(-1290924667, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(722879113);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_select_date, viewGroup, false);
        this.A01 = DbU.A0G(inflate, R.id.select_date_text_view);
        A00(this);
        DatePicker datePicker = (DatePicker) AnonymousClass7TF.A0F(inflate, R.id.select_date_picker);
        datePicker.setMaxDate(this.A06.getTimeInMillis());
        GregorianCalendar gregorianCalendar = this.A00;
        if (gregorianCalendar != null) {
            int i = gregorianCalendar.get(1);
            GregorianCalendar gregorianCalendar2 = this.A00;
            if (gregorianCalendar2 != null) {
                int A062 = DbZ.A06(gregorianCalendar2);
                GregorianCalendar gregorianCalendar3 = this.A00;
                if (gregorianCalendar3 != null) {
                    datePicker.init(i, A062, DbU.A03(gregorianCalendar3), new FQQ(this, 2));
                    AnonymousClass0fD.A09(1864753333, A022);
                    return inflate;
                }
            }
        }
        0qQ.A0F("selectedDate");
        throw AnonymousClass00P.createAndThrow();
    }
}
