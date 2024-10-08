package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.7jo  reason: invalid class name and case insensitive filesystem */
public final class C339567jo extends AnonymousClass4DH implements C252213ok {
    public static final String __redex_internal_original_name = "UserPayBroadcasterBottomSheetFragment";
    public EditText A00;
    public TextView A01;
    public C339577jp A02;
    public IgdsButton A03;
    public AnonymousClass3E6 A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, false);
        this.A04 = A012;
        A012.A9Y(this);
        A012.DmJ(getActivity());
    }

    public final void DMr(int i, boolean z) {
        String str;
        int i2;
        IgdsButton igdsButton = this.A03;
        if (i > 0) {
            if (igdsButton != null) {
                i2 = 8;
            }
            str = "actionButton";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (igdsButton != null) {
            i2 = 0;
        }
        str = "actionButton";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        igdsButton.setVisibility(i2);
        TextView textView = this.A01;
        if (textView == null) {
            str = "helperText";
        } else {
            textView.setVisibility(i2);
            str = "suggestionText";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return (AnonymousClass0wW) this.A05.getValue();
    }

    public C339567jo() {
        new 0xG(__redex_internal_original_name);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass0fD.A02(-733052583);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_user_pay_broadcaster_bottom_sheet, viewGroup, false);
        this.A03 = (IgdsButton) inflate.requireViewById(R.id.action_button);
        this.A01 = (TextView) inflate.requireViewById(R.id.helper_text);
        this.A00 = (EditText) inflate.requireViewById(R.id.goal_setting_input_text);
        inflate.findViewById(R.id.title);
        0qQ.A0F("sheetConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-226893459);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A04;
        if (r0 != null) {
            r0.onStop();
        }
        AnonymousClass0fD.A09(1891558704, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(1442589773);
        super.onResume();
        EditText editText = this.A00;
        if (editText != null) {
            if (!00l.A0W(String.valueOf(editText.getText()))) {
                EditText editText2 = this.A00;
                if (editText2 != null) {
                    if (!00l.A0W(editText2.getText().toString())) {
                        str = "userName";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            AnonymousClass0fD.A09(1699403426, A022);
            return;
        }
        str = "editText";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
