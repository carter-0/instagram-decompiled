package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class AOZ implements View.OnFocusChangeListener, C252213ok, B21 {
    public ViewGroup A00;
    public EditText A01;
    public EditText A02;
    public EditText A03;
    public int A04;
    public final float A05;
    public final float A06;
    public final Context A07;
    public final View A08;
    public final ViewStub A09;
    public final AnonymousClass3E6 A0A;
    public final AnonymousClass8MF A0B;
    public final String A0C;
    public final String A0D;
    public final UserSession A0E;
    public final C354538Mk A0F;

    private void A00() {
        EditText editText;
        EditText editText2 = this.A02;
        editText2.getClass();
        if (editText2.hasFocus()) {
            editText = this.A02;
        } else {
            EditText editText3 = this.A01;
            editText3.getClass();
            if (editText3.hasFocus()) {
                editText = this.A01;
            } else {
                EditText editText4 = this.A03;
                editText4.getClass();
                if (editText4.hasFocus()) {
                    editText = this.A03;
                } else {
                    return;
                }
            }
        }
        editText.clearFocus();
    }

    public static void A01(EditText editText, CharSequence charSequence) {
        if (charSequence != null) {
            Editable text = editText.getText();
            text.replace(0, text.length(), charSequence);
        }
    }

    public final void DCS(Object obj) {
        String str;
        C389529pm r3 = ((AnonymousClass8T8) obj).A00;
        if (this.A00 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A09.inflate();
            this.A00 = viewGroup;
            this.A02 = (EditText) viewGroup.findViewById(R.id.polling_question_edit);
            this.A01 = (EditText) this.A00.requireViewById(R.id.polling_first_option_edit);
            this.A03 = (EditText) this.A00.requireViewById(R.id.polling_second_option_edit);
            EditText editText = this.A02;
            editText.getClass();
            editText.setOnFocusChangeListener(this);
            EditText editText2 = this.A01;
            editText2.getClass();
            editText2.setOnFocusChangeListener(this);
            EditText editText3 = this.A03;
            editText3.getClass();
            editText3.setOnFocusChangeListener(this);
            EditText editText4 = this.A02;
            editText4.addTextChangedListener(new C389999qZ(editText4));
            C306466Mg.A01(this.A02);
            EditText editText5 = this.A01;
            int i = 0;
            0qQ.A0B(editText5, 0);
            C306466Mg.A02(editText5);
            EditText editText6 = this.A03;
            0qQ.A0B(editText6, 0);
            C306466Mg.A02(editText6);
            InputFilter[] inputFilterArr = {new InputFilter.AllCaps()};
            this.A01.setFilters(inputFilterArr);
            this.A03.setFilters(inputFilterArr);
            EditText editText7 = this.A01;
            editText7.addTextChangedListener(new C390009qa(editText7, this));
            EditText editText8 = this.A03;
            editText8.addTextChangedListener(new C390009qa(editText8, this));
            Context context = this.A07;
            int[] A1b = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_blue);
            int[] A1b2 = AnonymousClass7TG.A1b(context, R.attr.igds_color_creation_tools_pink);
            EditText editText9 = this.A01;
            String str2 = this.A0C;
            int A052 = AnonymousClass7TE.A05(0.5f, 255.0f);
            int[] iArr = new int[5];
            do {
                int i2 = A1b[i];
                iArr[i] = Color.argb(A052, Color.red(i2), Color.green(i2), Color.blue(i2));
                i++;
            } while (i < 5);
            SpannableString spannableString = new SpannableString(str2);
            float[] fArr = AnonymousClass6LW.A00;
            spannableString.setSpan(new C380229Xd(spannableString, fArr, iArr), 0, spannableString.length(), 33);
            editText9.setHint(new SpannedString(spannableString));
            EditText editText10 = this.A03;
            String str3 = this.A0D;
            int[] iArr2 = new int[5];
            int i3 = 0;
            do {
                int i4 = A1b2[i3];
                iArr2[i3] = Color.argb(A052, Color.red(i4), Color.green(i4), Color.blue(i4));
                i3++;
            } while (i3 < 5);
            SpannableString spannableString2 = new SpannableString(str3);
            spannableString2.setSpan(new C380229Xd(spannableString2, fArr, iArr2), 0, spannableString2.length(), 33);
            editText10.setHint(new SpannedString(spannableString2));
            EditText editText11 = this.A01;
            C39965ALh aLh = new C39965ALh(fArr, A1b);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            spannableStringBuilder.setSpan(aLh, 0, spannableStringBuilder.length(), 18);
            editText11.setText(spannableStringBuilder);
            EditText editText12 = this.A03;
            C39965ALh aLh2 = new C39965ALh(fArr, A1b2);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
            spannableStringBuilder2.setSpan(aLh2, 0, spannableStringBuilder2.length(), 18);
            editText12.setText(spannableStringBuilder2);
            0nA.A0t(this.A08, new C41318Ary(this, 5));
        }
        View[] viewArr = {this.A08};
        C71392co r0 = C315596kB.A02;
        C294975nL.A04((C295005nO) null, viewArr, false);
        ViewGroup viewGroup2 = this.A00;
        viewGroup2.getClass();
        viewGroup2.setVisibility(0);
        EditText editText13 = this.A02;
        editText13.getClass();
        editText13.requestFocus();
        if (r3 != null) {
            EditText editText14 = this.A02;
            C39711A6c a6c = r3.A0j;
            if (a6c != null) {
                str = a6c.A03;
            } else {
                str = null;
            }
            A01(editText14, str);
            EditText editText15 = this.A01;
            if (editText15 != null) {
                A01(editText15, r3.A0k.A0F.toString());
            }
            EditText editText16 = this.A03;
            if (editText16 != null) {
                A01(editText16, r3.A0l.A0F.toString());
            }
        }
        C354538Mk r1 = this.A0F;
        C317876nz r02 = C317876nz.A0a;
        r1.DnE("poll_sticker_bundle_id");
    }

    public final void DMr(int i, boolean z) {
        if (this.A04 > i) {
            A00();
            this.A0B.DMp();
        }
        this.A04 = i;
        int height = this.A08.getHeight() - this.A04;
        ViewGroup viewGroup = this.A00;
        viewGroup.getClass();
        this.A00.setTranslationY((float) ((height - viewGroup.getHeight()) / 2));
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.A0A.A9Y(this);
            0nA.A0Q(view);
            return;
        }
        EditText editText = this.A02;
        editText.getClass();
        if (!editText.hasFocus()) {
            EditText editText2 = this.A01;
            editText2.getClass();
            if (!editText2.hasFocus()) {
                EditText editText3 = this.A03;
                editText3.getClass();
                if (!editText3.hasFocus()) {
                    this.A0A.EEH((C252213ok) null);
                    0nA.A0N(view);
                    EditText editText4 = this.A01;
                    editText4.getClass();
                    String trim = AnonymousClass7TF.A0f(editText4).trim();
                    if (TextUtils.isEmpty(trim)) {
                        trim = this.A0C;
                    }
                    EditText editText5 = this.A03;
                    editText5.getClass();
                    String trim2 = AnonymousClass7TF.A0f(editText5).trim();
                    if (TextUtils.isEmpty(trim2)) {
                        trim2 = this.A0D;
                    }
                    float textSize = this.A01.getTextSize();
                    float textSize2 = this.A03.getTextSize();
                    EditText editText6 = this.A02;
                    editText6.getClass();
                    String A0f = AnonymousClass7TF.A0f(editText6);
                    float textSize3 = this.A02.getTextSize();
                    int width = (this.A02.getWidth() - this.A02.getPaddingLeft()) - this.A02.getPaddingRight();
                    int paddingBottom = this.A02.getPaddingBottom();
                    AnonymousClass7TG.A1O(trim, trim2);
                    C40606Aeu aeu = new C40606Aeu();
                    aeu.A05 = trim;
                    aeu.A07 = trim2;
                    aeu.A00 = textSize;
                    aeu.A02 = textSize2;
                    aeu.A06 = A0f;
                    aeu.A01 = textSize3;
                    aeu.A03 = width;
                    aeu.A04 = paddingBottom;
                    C315596kB.A08(new View[]{this.A08}, false);
                    A01(this.A02, "");
                    A01(this.A01, "");
                    A01(this.A03, "");
                    ViewGroup viewGroup = this.A00;
                    viewGroup.getClass();
                    viewGroup.setVisibility(8);
                    this.A0B.Dn8(aeu, (String) null);
                }
            }
        }
    }

    public AOZ(Context context, View view, UserSession userSession, AnonymousClass3E6 r7, C354538Mk r8, AnonymousClass8MF r9) {
        this.A0E = userSession;
        this.A07 = context;
        this.A0A = r7;
        this.A0B = r9;
        this.A0F = r8;
        this.A08 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A09 = (ViewStub) view.requireViewById(R.id.polling_edit_stub);
        Resources resources = view.getResources();
        float A012 = AnonymousClass7TE.A01(resources, R.dimen.audition_flow_picker_subtitle_margin_bottom);
        this.A05 = A012;
        this.A06 = A012 * 0.5f;
        this.A0C = resources.getString(2131969562);
        this.A0D = resources.getString(2131969564);
    }

    public final void DDW() {
        A00();
        C354538Mk r1 = this.A0F;
        C317876nz r0 = C317876nz.A0a;
        r1.Dn9("poll_sticker_bundle_id");
    }
}
