package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.ENo  reason: case insensitive filesystem */
public final class C47937ENo extends E0R implements AnonymousClass0iw, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AddBirthdayFragment";
    public int A00;
    public int A01;
    public int A02;
    public DatePicker A03;
    public TextView A04;
    public NotificationBar A05;
    public ProgressButton A06;
    public boolean A07 = false;
    public TextView A08;
    public TextView A09;
    public final DatePicker.OnDateChangedListener A0A = new FQQ(this, 0);
    public final 1P0 A0B = new C47691EDa(this, 3);

    public static void A00(C47937ENo eNo) {
        FGI.A02(1Q0.A07.A02(eNo.A00), eNo.A02, C46634DiE.A0e);
        C309516Yo A0J = DbY.A0J(eNo.requireActivity(), eNo.A00);
        RegFlowExtras regFlowExtras = eNo.A01;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        DbU.A1C(A0a);
        DbX.A18(A0a, new C47936ENn(), A0J);
    }

    public static void A01(C47937ENo eNo) {
        String A0z;
        int A002 = FFM.A00(eNo.A02, eNo.A01, eNo.A00);
        TextView textView = eNo.A09;
        if (textView != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(eNo.A02, eNo.A01, eNo.A00);
            textView.setText(DateFormat.getDateInstance(1, AnonymousClass1Q2.A02()).format(instance.getTime()));
            eNo.A09.setHint((CharSequence) null);
        }
        TextView textView2 = eNo.A08;
        if (textView2 != null) {
            textView2.setVisibility(0);
            TextView textView3 = eNo.A08;
            if (A002 == 1) {
                A0z = eNo.getString(2131952271);
            } else {
                A0z = DbV.A0z(eNo, Integer.valueOf(A002), 2131952268);
            }
            textView3.setText(A0z);
            Context requireContext = eNo.requireContext();
            int i = R.attr.igds_color_secondary_text;
            if (A002 <= 4) {
                i = R.attr.igds_color_error_or_destructive;
            }
            int A0H = 2Yu.A0H(requireContext, i);
            DbT.A17(eNo.getRootActivity(), eNo.A08, A0H);
        }
        0xI A003 = 0xI.A00(eNo, "dob_picker_scrolled");
        Calendar instance2 = Calendar.getInstance();
        instance2.set(eNo.A02, eNo.A01, eNo.A00);
        A003.A0C("to_date", new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(instance2.getTime()));
        DbU.A1R(A003, eNo.A00);
    }

    public final String getModuleName() {
        return "add_birthday";
    }

    public final boolean onBackPressed() {
        C49920FEv.A00.A01(this.A00, this.A02, "enter_birthday");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1274438222);
        super.onCreate(bundle);
        Calendar instance = Calendar.getInstance();
        this.A02 = instance.get(1) - 1;
        this.A01 = DbZ.A06(instance);
        this.A00 = DbU.A03(instance);
        AnonymousClass0fD.A09(-130713762, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(519179889);
        C49938FFr.A00.A02(this.A00, this.A02, "enter_birthday");
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A0C2 = DbU.A0C(A0C, R.id.content_container);
        this.A05 = (NotificationBar) A0C.requireViewById(R.id.notification_bar);
        layoutInflater.inflate(R.layout.nux_add_birthday_fragment, A0C2, true);
        this.A08 = DbU.A0G(A0C, R.id.calculated_age);
        TextView A0G = DbU.A0G(A0C, R.id.date_of_birth);
        this.A09 = A0G;
        if (A0G != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(this.A02, this.A01, this.A00);
            A0G.setHint(DateFormat.getDateInstance(1, AnonymousClass1Q2.A02()).format(instance.getTime()));
        }
        TextView A0G2 = DbU.A0G(A0C, R.id.add_age_link);
        this.A04 = A0G2;
        if (A0G2 != null) {
            FP0.A00(A0G2, 16, this);
        }
        ProgressButton A0O = Dba.A0O(A0C);
        this.A06 = A0O;
        FP0.A00(A0O, 17, this);
        DatePicker datePicker = (DatePicker) A0C.requireViewById(R.id.birthday_date_picker);
        this.A03 = datePicker;
        datePicker.init(this.A02, this.A01, this.A00, this.A0A);
        this.A03.setMaxDate(Calendar.getInstance().getTimeInMillis());
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, -150);
        this.A03.setMinDate(instance2.getTimeInMillis());
        if (Calendar.getInstance().get(1) - this.A02 != 1) {
            A01(this);
        }
        View requireViewById = A0C.requireViewById(R.id.field_detail_link);
        2eS.A01(requireViewById);
        FP0.A00(requireViewById, 18, this);
        AnonymousClass0fD.A09(-500045565, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-95512604);
        super.onDestroyView();
        this.A03 = null;
        this.A09 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-433202099, A022);
    }
}
