package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.E2x  reason: case insensitive filesystem */
public final class C47451E2x extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "EditBirthdayFragment";
    public UserSession A00;
    public String A01;
    public GregorianCalendar A02;
    public boolean A03;
    public TextView A04;
    public ActionButton A05;
    public final DateFormat A06 = DateFormat.getDateInstance(1, AnonymousClass1Q2.A02());
    public final SimpleDateFormat A07 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final Calendar A08 = Calendar.getInstance();

    public final String getModuleName() {
        return "edit_birthday";
    }

    public static void A00(2da r5, C47451E2x e2x) {
        UserSession userSession = e2x.A00;
        int i = e2x.A02.get(1);
        int A062 = DbZ.A06(e2x.A02) + 1;
        int A032 = DbU.A03(e2x.A02);
        1NY A0L = DbZ.A0L(userSession);
        DbX.A1M(A0L, "day", Dbc.A0D(A0L, "accounts/set_birthday/", i, A062, A032));
        1OC A0M = A0L.A0M();
        EDV.A00(A0M, e2x, r5, 27);
        e2x.schedule(A0M);
    }

    public static void A01(C47451E2x e2x) {
        TextView textView = e2x.A04;
        textView.getClass();
        textView.setText(e2x.A06.format(Long.valueOf(e2x.A02.getTimeInMillis())));
        Context requireContext = e2x.requireContext();
        boolean A1U = Dba.A1U((e2x.A02.getTimeInMillis() > F78.A00(5) ? 1 : (e2x.A02.getTimeInMillis() == F78.A00(5) ? 0 : -1)));
        TextView textView2 = e2x.A04;
        int i = R.attr.igds_color_secondary_text;
        if (A1U) {
            i = R.attr.igds_color_primary_text;
        }
        DbT.A17(requireContext, textView2, 2Yu.A0H(requireContext, i));
        ActionButton actionButton = e2x.A05;
        if (actionButton != null) {
            actionButton.setEnabled(A1U);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r7) {
        C229382nI A0M = DbT.A0M(this, this.A00);
        DbX.A1A(FPC.A00(this, 24), DbX.A0M(), r7);
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131953791);
        ActionButton A002 = C59904JbT.A00(new FPH(46, (Object) this, (Object) A0M, (Object) r7), r7, obj);
        this.A05 = A002;
        A002.setEnabled(Dba.A1U((this.A02.getTimeInMillis() > F78.A00(5) ? 1 : (this.A02.getTimeInMillis() == F78.A00(5) ? 0 : -1))));
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1487368457);
        C47451E2x.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        this.A03 = requireArguments.containsKey("EditBirthdayFragment.ARG_BIRTHDAY_YEAR");
        Calendar calendar = this.A08;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_YEAR", calendar.get(1) - 1), requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_MONTH", DbZ.A06(calendar)), requireArguments.getInt("EditBirthdayFragment.ARG_BIRTHDAY_DAY", DbU.A03(calendar)));
        this.A02 = gregorianCalendar;
        this.A01 = this.A07.format(gregorianCalendar.getTime());
        AnonymousClass0fD.A09(314973781, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-854757902);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_birthday, viewGroup, false);
        this.A04 = DbU.A0G(inflate, R.id.birthday_text_view);
        A01(this);
        DatePicker datePicker = (DatePicker) inflate.requireViewById(R.id.birthday_date_picker);
        datePicker.setMaxDate(this.A08.getTimeInMillis());
        datePicker.init(this.A02.get(1), DbZ.A06(this.A02), DbU.A03(this.A02), new FQQ(this, 1));
        UserSession userSession = this.A00;
        String str = this.A01;
        0Aj A0E = Dbb.A0E(userSession);
        if (A0E.isSampled()) {
            Dbb.A1E(A0E, "date_picker_impression", str);
        }
        AnonymousClass0fD.A09(76186420, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1914590707);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-955745319, A022);
    }
}
