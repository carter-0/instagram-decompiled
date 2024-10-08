package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.AOa  reason: case insensitive filesystem */
public final class C40018AOa implements View.OnFocusChangeListener, B21, AnonymousClass8Z3 {
    public View A00;
    public ViewGroup A01;
    public EditText A02;
    public TextView A03;
    public TextView A04;
    public CircularImageView A05;
    public final Context A06;
    public final View A07;
    public final ViewStub A08;
    public final AnonymousClass87F A09;
    public final AnonymousClass80U A0A;
    public final AnonymousClass8MF A0B;

    /* JADX WARNING: type inference failed for: r0v23, types: [X.9jo, java.util.concurrent.Callable] */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void DCS(Object obj) {
        0qQ.A0B(obj, 0);
        if (this.A01 == null) {
            ViewStub viewStub = this.A08;
            0nA.A0g(viewStub, -1, -1);
            viewStub.setLayoutResource(R.layout.i_take_care_full_screen_editor);
            View inflate = viewStub.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A01 = viewGroup;
            if (viewGroup != null) {
                View requireViewById = viewGroup.requireViewById(R.id.i_take_care_sticker);
                this.A00 = requireViewById;
                0qQ.A07(requireViewById);
                this.A09.A03(requireViewById);
                0nA.A0t(requireViewById, new C385959jo(this, 1));
                View view = this.A00;
                if (view != null) {
                    ? r4 = (CircularImageView) view.requireViewById(R.id.i_take_care_sticker_icon);
                    this.A05 = r4;
                    if (r4 != 0) {
                        Context context = this.A06;
                        r4.A0H(AnonymousClass7TE.A0H(context.getResources()), AnonymousClass7TE.A09(context));
                        r4.setImageDrawable(context.getDrawable(R.drawable.instagram_icons_exceptions_circle_heart_purple_filled_88));
                    }
                    View view2 = this.A00;
                    if (view2 != null) {
                        TextView textView = (TextView) view2.requireViewById(R.id.i_take_care_sticker_prompt);
                        this.A04 = textView;
                        if (textView != null) {
                            C306466Mg.A00(textView);
                        }
                        View view3 = this.A00;
                        if (view3 != null) {
                            EditText editText = (EditText) view3.requireViewById(R.id.i_take_care_sticker_response);
                            this.A02 = editText;
                            if (editText != null) {
                                editText.setOnFocusChangeListener(this);
                                editText.addTextChangedListener(new C16306UsZ(editText));
                            }
                            View view4 = this.A00;
                            if (view4 != null) {
                                TextView textView2 = (TextView) view4.requireViewById(R.id.i_take_care_sticker_help_text);
                                this.A03 = textView2;
                                if (textView2 != null) {
                                    ABM.A01(textView2);
                                }
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        View view5 = this.A07;
        ViewGroup viewGroup2 = this.A01;
        if (viewGroup2 != null) {
            C294975nL.A04((C295005nO) null, new View[]{view5, viewGroup2, this.A00}, false);
            AnonymousClass87F r1 = this.A09;
            r1.A02(r1.A01);
            C40609Aex aex = ((AnonymousClass8TV) obj).A00;
            if (aex != null) {
                Context context2 = this.A06;
                int color = context2.getColor(R.color.i_take_care_sticker_gradient_start);
                int color2 = context2.getColor(R.color.i_take_care_sticker_gradient_end);
                TextView textView3 = this.A04;
                if (textView3 != null) {
                    textView3.setText(aex.A02);
                    textView3.setTextColor(color);
                    textView3.getViewTreeObserver().addOnGlobalLayoutListener(new APF(textView3, color, color2));
                    EditText editText2 = this.A02;
                    if (editText2 != null) {
                        editText2.setText(aex.A03);
                        editText2.setHint(aex.A01);
                        TextView textView4 = this.A03;
                        if (textView4 != null) {
                            textView4.setText(aex.A00);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    throw AnonymousClass7TE.A11("responseView is null");
                }
                throw AnonymousClass7TE.A11("promptView is null");
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DzC(int i, int i2) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass87F r0 = this.A09;
        if (z) {
            r0.A00();
            0nA.A0R(view);
            return;
        }
        r0.A01();
        0nA.A0N(view);
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            C294975nL.A05(new View[]{this.A07, viewGroup, this.A00}, false);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Aex, X.50v, java.lang.Object] */
    public final void DDW() {
        AnonymousClass8MF r5 = this.A0B;
        String str = "";
        TextView textView = this.A04;
        if (textView != null) {
            String obj = textView.getText().toString();
            EditText editText = this.A02;
            if (editText != null) {
                String A0f = AnonymousClass7TF.A0f(editText);
                EditText editText2 = this.A02;
                if (editText2 != null) {
                    CharSequence hint = editText2.getHint();
                    if (hint != null) {
                        String obj2 = hint.toString();
                        TextView textView2 = this.A03;
                        if (textView2 != null) {
                            String obj3 = textView2.getText().toString();
                            if (obj3 != null) {
                                str = obj3;
                            }
                            ? obj4 = new Object();
                            obj4.A02 = obj;
                            obj4.A01 = obj2;
                            obj4.A00 = str;
                            obj4.A03 = A0f;
                            r5.Dn8(obj4, (String) null);
                            ViewGroup viewGroup = this.A01;
                            if (viewGroup != null) {
                                C294975nL.A05(new View[]{this.A07, viewGroup, this.A00}, false);
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DMp() {
        EditText editText = this.A02;
        if (editText != null) {
            editText.clearFocus();
            this.A0A.E3H(new Object());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C40018AOa(View view, AnonymousClass3E6 r4, AnonymousClass80U r5, AnonymousClass8MF r6) {
        this.A0A = r5;
        this.A0B = r6;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A06 = A0S;
        this.A09 = new AnonymousClass87F(A0S, r4, this);
        this.A07 = AnonymousClass7TF.A0G(view, R.id.text_overlay_edit_text_container);
        this.A08 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.i_take_care_sticker_editor_stub);
    }
}
