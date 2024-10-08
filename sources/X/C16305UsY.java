package X;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: X.UsY  reason: case insensitive filesystem */
public final class C16305UsY extends W7f {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C16305UsY(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void afterTextChanged(Editable editable) {
        Drawable drawable;
        switch (this.A00) {
            case 1:
                EditText editText = (EditText) this.A01;
                int length = DbV.A12(AnonymousClass7TF.A0f(editText)).length();
                C19318WUa wUa = (C19318WUa) this.A02;
                if (length > 0) {
                    drawable = wUa.A09;
                } else {
                    drawable = wUa.A0A;
                }
                editText.setBackground(drawable);
                ViewGroup viewGroup = wUa.A02;
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() >= 3) {
                        ViewGroup viewGroup2 = wUa.A02;
                        if (viewGroup2 != null) {
                            View childAt = viewGroup2.getChildAt(2);
                            String A002 = AnonymousClass000.A00(328);
                            0qQ.A0C(childAt, A002);
                            boolean A1Q = AnonymousClass7TF.A1Q(DbV.A12(AnonymousClass7TF.A0f((EditText) childAt)).length());
                            ViewGroup viewGroup3 = wUa.A02;
                            if (viewGroup3 != null) {
                                if (viewGroup3.getChildCount() < 4 && !A1Q) {
                                    ViewGroup viewGroup4 = wUa.A02;
                                    if (viewGroup4 != null) {
                                        viewGroup4.addView(C19318WUa.A00(wUa, false));
                                    }
                                }
                                ViewGroup viewGroup5 = wUa.A02;
                                if (viewGroup5 != null) {
                                    if (viewGroup5.getChildCount() == 4 && A1Q) {
                                        ViewGroup viewGroup6 = wUa.A02;
                                        if (viewGroup6 != null) {
                                            View childAt2 = viewGroup6.getChildAt(viewGroup6.getChildCount() - 1);
                                            0qQ.A0C(childAt2, A002);
                                            if (DbV.A12(AnonymousClass7TF.A0f((EditText) childAt2)).length() == 0) {
                                                ViewGroup viewGroup7 = wUa.A02;
                                                if (viewGroup7 != null) {
                                                    viewGroup7.removeViewAt(viewGroup7.getChildCount() - 1);
                                                    ViewGroup viewGroup8 = wUa.A02;
                                                    if (viewGroup8 != null) {
                                                        viewGroup8.getChildAt(viewGroup8.getChildCount() - 1).requestFocus();
                                                        return;
                                                    }
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
                0qQ.A0F("optionsContainer");
                throw AnonymousClass00P.createAndThrow();
            case 2:
                W0K w0k = (W0K) this.A01;
                View view = w0k.A03;
                view.post(new C20062WkM(this));
                if (!w0k.A04()) {
                    w0k.A01 = false;
                    w0k.A04.setHint(w0k.A00);
                    W0K.A00(w0k);
                    return;
                } else if (!w0k.A01) {
                    W0K.A01(w0k, view.isSelected());
                    return;
                } else {
                    return;
                }
            case 3:
                ((G86) this.A02).DvR();
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.A00 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        0qQ.A0B(charSequence, 0);
        View view = (View) this.A01;
        int i4 = 0;
        if (charSequence.length() != 0 || C61361K4d.A00((C61361K4d) this.A02).A03.A0F) {
            i4 = 8;
        }
        view.setVisibility(i4);
    }
}
