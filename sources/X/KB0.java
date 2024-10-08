package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class KB0 extends C252233om {
    public InputMethodManager A00;
    public EditText A01;
    public C60076JfA A02;
    public boolean A03 = false;
    public TextWatcher A04;
    public View A05;
    public IgLinearLayout A06;
    public final FragmentActivity A07;
    public final 0hq A08;
    public final AnonymousClass07i A09;
    public final C64184LSr A0A;
    public final C63590Kzd A0B;
    public final Ki3 A0C;
    public final UserSession A0D;

    public final void onDestroyView() {
        this.A05 = null;
        this.A01 = null;
    }

    public final void onPause() {
        this.A01.getClass();
        InputMethodManager inputMethodManager = this.A00;
        inputMethodManager.getClass();
        inputMethodManager.hideSoftInputFromWindow(this.A01.getWindowToken(), 0);
        this.A01.getClass();
        EditText editText = this.A01;
        TextWatcher textWatcher = this.A04;
        textWatcher.getClass();
        editText.removeTextChangedListener(textWatcher);
    }

    public final void onResume() {
        FragmentActivity fragmentActivity = this.A07;
        if (fragmentActivity.getWindow() == null || AnonymousClass7TE.A1D(this.A0A.A07.values()).isEmpty()) {
            C59689JTv.A0F(fragmentActivity, "highlight_create_selected_item_failure", 2131963413);
            View view = this.A05;
            view.getClass();
            view.post(new C65844M1k(this));
            return;
        }
        UserSession userSession = this.A0D;
        if (!182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36330999507862383L)) {
            fragmentActivity.getWindow().setSoftInputMode(16);
        }
        this.A01.getClass();
        InputMethodManager inputMethodManager = this.A00;
        inputMethodManager.getClass();
        inputMethodManager.showSoftInput(this.A01, 1);
        EditText editText = this.A01;
        TextWatcher textWatcher = this.A04;
        textWatcher.getClass();
        editText.addTextChangedListener(textWatcher);
    }

    public KB0(FragmentActivity fragmentActivity, 0hq r3, AnonymousClass07i r4, C64184LSr lSr, C63590Kzd kzd, Ki3 ki3, UserSession userSession) {
        this.A0D = userSession;
        this.A07 = fragmentActivity;
        this.A08 = r3;
        this.A09 = r4;
        this.A0C = ki3;
        this.A0A = lSr;
        this.A0B = kzd;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        EditText editText = (EditText) view.requireViewById(R.id.highlight_title);
        this.A01 = editText;
        UserSession userSession = this.A0D;
        editText.setText(C64184LSr.A00(userSession).A01);
        JTR.A1F(this.A01);
        EditText editText2 = this.A01;
        C64503Ld4 ld4 = new C64503Ld4(this);
        0qQ.A0B(editText2, 0);
        this.A04 = new LWR(editText2, ld4);
        FragmentActivity fragmentActivity = this.A07;
        this.A00 = (InputMethodManager) fragmentActivity.getSystemService("input_method");
        boolean A012 = C278764xU.A01(userSession);
        IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.toggle_highlights_to_main_grid);
        this.A06 = igLinearLayout;
        if (A012) {
            Context context = view.getContext();
            LWj lWj = new LWj(0);
            Integer valueOf = Integer.valueOf(R.drawable.instagram_photo_grid_pano_outline_24);
            0qQ.A0B(context, 0);
            C60076JfA jfA = new C60076JfA(context);
            jfA.setTitle(context.getResources().getString(2131956866));
            AnonymousClass0fU.A00(lWj, jfA);
            jfA.setIcon(JTP.A0E(context, valueOf));
            JTS.A0x(jfA);
            if (igLinearLayout != null) {
                igLinearLayout.addView(jfA);
            }
            this.A02 = jfA;
            LYC.A00(jfA, 22, this);
            this.A03 = true;
            String string = fragmentActivity.getResources().getString(2131956868);
            C60076JfA jfA2 = this.A02;
            if (jfA2 != null) {
                jfA2.setInlineSubtitle(string);
            }
            this.A06.setVisibility(0);
            return;
        }
        igLinearLayout.setVisibility(8);
    }

    public final void D6z(View view) {
        this.A05 = view;
    }
}
