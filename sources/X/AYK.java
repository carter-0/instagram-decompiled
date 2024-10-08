package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

public final class AYK implements AnonymousClass4DR, TextWatcher, View.OnFocusChangeListener, AnonymousClass8LV, C252213ok, TextView.OnEditorActionListener, AnonymousClass89Y {
    public ConstrainedEditText A00;
    public int A01;
    public IgTextView A02;
    public final Context A03;
    public final View A04;
    public final AnonymousClass8BQ A05;
    public final AnonymousClass88K A06;
    public final C314446iH A07;
    public final AnonymousClass80W A08;
    public final EyedropperColorPickerTool A09;
    public final View A0A;
    public final UserSession A0B;
    public final AnonymousClass3E6 A0C;
    public final C39639A3d A0D;

    public AYK(View view, UserSession userSession, AnonymousClass3E6 r11, C39639A3d a3d, AnonymousClass8BQ r13, AnonymousClass88K r14, C314446iH r15, AnonymousClass80W r16) {
        0qQ.A0B(view, 1);
        AnonymousClass7TG.A0w(2, userSession, r13, r14);
        AnonymousClass80W r2 = r16;
        AnonymousClass7TF.A1F(r2, 6, r11);
        this.A0B = userSession;
        this.A05 = r13;
        this.A06 = r14;
        this.A0D = a3d;
        this.A08 = r2;
        this.A07 = r15;
        this.A0C = r11;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A03 = A0S;
        boolean A1Y = AnonymousClass7TF.A1Y(AnonymousClass7TF.A0Q(userSession).A0K(), true);
        View inflate = ((ViewStub) view.requireViewById(R.id.hall_pass_creation_stub)).inflate();
        0qQ.A07(inflate);
        this.A04 = inflate;
        this.A09 = (EyedropperColorPickerTool) AnonymousClass7TF.A0F(view, R.id.eyedropper_color_picker_tool);
        View requireViewById = inflate.requireViewById(R.id.hall_pass_next_button);
        0qQ.A0A(requireViewById);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(requireViewById);
        A0m.A06 = false;
        C386359kT.A01(A0m, this, 10);
        requireViewById.setEnabled(false);
        C18708VyZ.A01(requireViewById, false);
        this.A0A = requireViewById;
        View requireViewById2 = inflate.requireViewById(R.id.hall_pass_composer);
        ConstrainedEditText constrainedEditText = (ConstrainedEditText) requireViewById2;
        constrainedEditText.setHint(constrainedEditText.getContext().getString(2131963257));
        constrainedEditText.addTextChangedListener(this);
        constrainedEditText.addTextChangedListener(new C389999qZ(constrainedEditText));
        constrainedEditText.setOnFocusChangeListener(this);
        constrainedEditText.setOnEditorActionListener(this);
        0qQ.A07(requireViewById2);
        this.A00 = constrainedEditText;
        IgTextView requireViewById3 = inflate.requireViewById(R.id.hall_pass_subtitle);
        IgTextView igTextView = requireViewById3;
        igTextView.setText(A1Y ? 2131963275 : 2131963283);
        0qQ.A07(requireViewById3);
        this.A02 = igTextView;
        this.A01 = A0S.getColor(R.color.igds_gradient_lavender);
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(AnonymousClass7TF.A0G(inflate, R.id.hall_pass_cancel_button));
        A0m2.A06 = false;
        C386359kT.A01(A0m2, this, 11);
    }

    public final /* synthetic */ void DDu() {
    }

    public final /* synthetic */ void DDv(int i) {
    }

    public final void afterTextChanged(Editable editable) {
        0qQ.A0B(editable, 0);
        View view = this.A0A;
        boolean A1R = AnonymousClass7TF.A1R(editable.length());
        view.setEnabled(A1R);
        C18708VyZ.A01(view, A1R);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        A00(this);
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass3E6 r0 = this.A0C;
        if (z) {
            r0.A9Y(this);
            0nA.A0Q(view);
            return;
        }
        r0.EEH(this);
        0nA.A0N(view);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void A00(AYK ayk) {
        27p.A01(ayk.A0B).A1i((Long) null, "SHARED_LISTS_NEXT_BUTTON", (String) null);
        C39639A3d a3d = ayk.A0D;
        String obj = 00l.A0B(AnonymousClass7TF.A0f(ayk.A00)).toString();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(ayk.A01 & 16777215));
        0qQ.A07(formatStrLocaleSafe);
        C357088Wk r2 = (C357088Wk) a3d.A00.A1x.get();
        if (r2 != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString(C273654mx.A00(295), obj);
            A0a.putString(AnonymousClass000.A00(3206), formatStrLocaleSafe);
            A0a.putString(AnonymousClass000.A00(154), "CREATION");
            UserSession userSession = r2.A05;
            AnonymousClass4DH r22 = r2.A02;
            AnonymousClass7TG.A1N(userSession, r22);
            AnonymousClass6W8 r3 = new AnonymousClass6W8(r22.getRootActivity(), A0a, userSession, ModalActivity.class, C273654mx.A00(294));
            r3.A07();
            r3.A0D(r22, 9414);
        }
    }

    public static final void A01(AYK ayk) {
        C294975nL.A04((C295005nO) null, new View[]{ayk.A04, ayk.A09}, false);
        ayk.A05.A03(true, false);
        ayk.A00.requestFocus();
    }

    public final void A02(int i) {
        this.A01 = i;
        int A042 = 0nH.A04(i);
        ConstrainedEditText constrainedEditText = this.A00;
        constrainedEditText.setTextColor(A042);
        constrainedEditText.setHintTextColor(0nH.A07(A042, 0.7f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) AnonymousClass7TE.A0D(this.A03.getResources()));
        gradientDrawable.setColor(this.A01);
        constrainedEditText.setBackground(gradientDrawable);
    }

    public final void DDt() {
        C294975nL.A05(new View[]{this.A04, this.A09}, false);
        this.A05.A02(false);
        this.A00.clearFocus();
    }

    public final void DMr(int i, boolean z) {
        int i2;
        ConstrainedEditText constrainedEditText = this.A00;
        constrainedEditText.DMr(i, z);
        this.A02.setY(constrainedEditText.getY() + AnonymousClass7TE.A03(constrainedEditText) + this.A03.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        int i3 = 0;
        if (i > 0) {
            i2 = AnonymousClass81Y.A00;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = (-i) + i2;
        }
        AnonymousClass8BQ r2 = this.A05;
        float f = (float) i3;
        r2.A00.setTranslationY(f);
        r2.A02.setTranslationY(f);
        this.A09.setTranslationY(f);
    }

    public final boolean onBackPressed() {
        this.A08.A04(AnonymousClass8T3.A00);
        return true;
    }

    public final void DDq() {
        A01(this);
    }

    public final void DDs(int i) {
        A02(i);
        A01(this);
    }
}
