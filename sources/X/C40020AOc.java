package X;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.AOc  reason: case insensitive filesystem */
public final class C40020AOc implements View.OnFocusChangeListener, B21, AnonymousClass8Z3 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public EditText A04;
    public C40593Aeh A05;
    public final View A06;
    public final ViewStub A07;
    public final AnonymousClass87F A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final Context A0B;
    public final AnonymousClass8MF A0C;
    public final AnonymousClass80W A0D;

    public C40020AOc(View view, AnonymousClass3E6 r11, AnonymousClass8MF r12, AnonymousClass80W r13) {
        0qQ.A0B(r13, 3);
        this.A0C = r12;
        this.A0D = r13;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A0B = A0S;
        this.A06 = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A07 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.pics_please_sticker_editor_stub);
        this.A08 = new AnonymousClass87F(A0S, r11, this);
        this.A0A = 0sr.A1L(new Integer[]{Integer.valueOf(A0S.getColor(R.color.black)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_purple)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AnonymousClass7TF.A03(A0S, R.attr.igds_color_creation_tools_blue))});
        this.A09 = 0sr.A1L(new String[]{02K.A01(A0S).getString(2131953830), 02K.A01(A0S).getString(2131969486), 02K.A01(A0S).getString(2131970978), 02K.A01(A0S).getString(2131969058), 02K.A01(A0S).getString(2131963128), 02K.A01(A0S).getString(2131953930)});
    }

    public final void DCS(Object obj) {
        C40593Aeh aeh;
        C356598Um r10;
        0qQ.A0B(obj, 0);
        if (!(obj instanceof C356598Um) || (r10 = (C356598Um) obj) == null || (aeh = r10.A00) == null) {
            QuestionStickerType questionStickerType = QuestionStickerType.PICS_PLEASE;
            Context context = this.A0B;
            C19477WaP.A00(context);
            int A012 = C19477WaP.A01(context);
            Object obj2 = this.A0A.get(this.A00);
            0qQ.A07(obj2);
            aeh = new C40593Aeh(new C19477WaP((ImageUrl) null, questionStickerType, (String) null, AnonymousClass7TE.A0M(obj2), A012, false, true));
        }
        this.A05 = aeh;
        if (this.A01 == null) {
            View inflate = this.A07.inflate();
            this.A01 = inflate;
            0qQ.A0A(inflate);
            EditText editText = (EditText) inflate.requireViewById(R.id.pics_please_sticker_edit_text);
            0qQ.A0A(editText);
            editText.addTextChangedListener(new C389999qZ(editText));
            editText.addTextChangedListener(new C16302UsV(editText, 3));
            editText.setOnFocusChangeListener(this);
            InputFilter[] filters = editText.getFilters();
            0qQ.A07(filters);
            InputFilter.AllCaps allCaps = new InputFilter.AllCaps();
            int length = filters.length;
            Object[] copyOf = Arrays.copyOf(filters, length + 1);
            copyOf[length] = allCaps;
            editText.setFilters((InputFilter[]) copyOf);
            this.A04 = editText;
            this.A02 = inflate.requireViewById(R.id.pics_please_sticker_editor_container);
            this.A03 = inflate.requireViewById(R.id.pics_please_sticker_container);
            ImageView imageView = (ImageView) inflate.requireViewById(R.id.pics_please_sticker_color_button);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
                AnonymousClass3NG A0m = AnonymousClass7TE.A0m(imageView);
                A0m.A02(imageView, this.A03);
                C386359kT.A01(A0m, this, 16);
            }
            View view = this.A02;
            if (view != null) {
                this.A08.A03(view);
            }
        }
        View view2 = this.A01;
        if (view2 != null) {
            C294975nL.A04((C295005nO) null, new View[]{this.A06, view2}, false);
        }
        EditText editText2 = this.A04;
        if (editText2 != null) {
            C40593Aeh aeh2 = this.A05;
            if (aeh2 == null) {
                0qQ.A0F("model");
                throw AnonymousClass00P.createAndThrow();
            }
            editText2.setText(aeh2.A00.A05());
        }
        this.A08.A02(this.A04);
    }

    public final void DzC(int i, int i2) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass87F r0 = this.A08;
        if (z) {
            r0.A00();
            0nA.A0R(view);
            return;
        }
        r0.A01();
        0nA.A0N(view);
        View view2 = this.A01;
        if (view2 != null) {
            C294975nL.A05(new View[]{this.A06, view2}, false);
        }
    }

    public final void DDW() {
        Editable text;
        View view = this.A01;
        if (view != null) {
            C294975nL.A05(new View[]{this.A06, view}, false);
        }
        C40593Aeh aeh = this.A05;
        String str = null;
        if (aeh != null) {
            EditText editText = this.A04;
            if (!(editText == null || (text = editText.getText()) == null)) {
                str = text.toString();
            }
            aeh.A00.A07(str);
            AnonymousClass8MF r2 = this.A0C;
            C40593Aeh aeh2 = this.A05;
            if (aeh2 != null) {
                r2.Dn8(aeh2, C273654mx.A00(3124));
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DMp() {
        EditText editText = this.A04;
        if (editText != null) {
            editText.clearFocus();
        }
        this.A0D.A04(new Object());
    }
}
