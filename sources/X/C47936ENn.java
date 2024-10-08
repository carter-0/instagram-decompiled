package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.Calendar;

/* renamed from: X.ENn  reason: case insensitive filesystem */
public final class C47936ENn extends E0R implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "EnterAgeFragment";
    public EditText A00;
    public TextView A01;
    public NotificationBar A02;
    public ProgressButton A03;
    public TextView A04;
    public TextView A05;
    public final TextWatcher A06 = new C48054ESy(this, 10);
    public final Runnable A07 = new C51235Fqq(this);

    public final String getModuleName() {
        return "enter_age";
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(367901935);
        C49938FFr.A00.A02(this.A00, this.A02, "add_age");
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.reg_container);
        ViewGroup A042 = Dba.A04(A0C);
        this.A02 = Dba.A0M(A0C);
        layoutInflater.inflate(R.layout.nux_enter_age_fragment, A042, true);
        TextView A0d = AnonymousClass7TE.A0d(A0C, R.id.field_detail);
        this.A05 = A0d;
        if (A0d != null) {
            DbX.A1F(A0d, this, DateUtils.formatDateTime(getRootActivity(), Calendar.getInstance().getTimeInMillis(), 24), 2131961722);
        }
        EditText editText = (EditText) A0C.findViewById(R.id.entered_age);
        this.A00 = editText;
        if (editText != null) {
            editText.addTextChangedListener(this.A06);
        }
        this.A01 = AnonymousClass7TE.A0d(A0C, R.id.error);
        TextView A0d2 = AnonymousClass7TE.A0d(A0C, R.id.add_birthday_link);
        this.A04 = A0d2;
        if (A0d2 != null) {
            FP0.A00(A0d2, 50, this);
        }
        ProgressButton progressButton = (ProgressButton) A0C.findViewById(R.id.next_button);
        this.A03 = progressButton;
        if (progressButton != null) {
            FP0.A00(progressButton, 51, this);
        }
        AnonymousClass0fD.A09(-523766988, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1374654636);
        super.onDestroyView();
        EditText editText = this.A00;
        if (editText != null) {
            editText.removeCallbacks(this.A07);
        }
        this.A03 = null;
        this.A05 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(1245554873, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1555630562);
        super.onResume();
        EditText editText = this.A00;
        if (editText != null) {
            editText.postDelayed(this.A07, 200);
        }
        AnonymousClass0fD.A09(-1359973329, A022);
    }
}
