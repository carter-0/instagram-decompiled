package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.facebookpay.form.view.BaseAutoCompleteTextView;
import com.fbpay.theme.FBPayIcon;
import com.instagram.android.R;

/* renamed from: X.QgI  reason: case insensitive filesystem */
public class C8066QgI extends C8609Qxq implements C13601TdT {
    public int A00;
    public int A01;
    public int A02;
    public FrameLayout A03;
    public C8041Qfl A04;
    public final TextWatcher A05 = new C11462SaQ(this, 2);
    public final View.OnFocusChangeListener A06 = new LYN(this, 0);
    public final View.OnKeyListener A07 = new WBP(this, 2);
    public final AnonymousClass2gO A08 = C11649Sdr.A00(this, 61);
    public final AnonymousClass2gO A09 = C11649Sdr.A00(this, 62);
    public final AnonymousClass2gO A0A = new C11651Sdt(C11649Sdr.A00(this, 63), 20);
    public final AnonymousClass2gO A0B = C11649Sdr.A00(this, 64);
    public final AnonymousClass2gO A0C = C11649Sdr.A00(this, 65);
    public final AnonymousClass2gO A0D = C11649Sdr.A00(this, 66);
    public final AnonymousClass2gO A0E = C11649Sdr.A00(this, 67);
    public final AnonymousClass2gO A0F = C11649Sdr.A00(this, 68);
    public final AnonymousClass2gO A0G = C11649Sdr.A00(this, 69);

    public static final void A06(C8066QgI qgI, SE9 se9) {
        Boolean bool = true;
        C8041Qfl qfl = qgI.A04;
        if (qfl == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        } else if (bool.equals(qfl.A06.A02())) {
        } else {
            if (se9 == null) {
                qgI.getIcon().setVisibility(8);
                qgI.setShowLoadingSpinner(false);
                return;
            }
            FBPayIcon fBPayIcon = se9.A00;
            Integer num = se9.A01;
            if (fBPayIcon != null) {
                int i = fBPayIcon.A01;
                if (i == 41) {
                    qgI.setShowLoadingSpinner(true);
                    return;
                }
                qgI.A0V(AnonymousClass2E0.A0A().A05(AnonymousClass7TE.A0S(qgI), i, fBPayIcon.A00), C11496SbJ.A00(qgI, 6), (Integer) null);
            } else if (num != null) {
                Drawable drawable = qgI.getContext().getDrawable(num.intValue());
                if (drawable != null) {
                    qgI.A0V(drawable, (View.OnClickListener) null, Integer.valueOf(R.dimen.asset_search_icon_width));
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public void setViewModel(C8041Qfl qfl) {
        int i;
        0qQ.A0B(qfl, 0);
        this.A04 = qfl;
        this.A06 = qfl.A0R;
        setId(View.generateViewId());
        BaseAutoCompleteTextView inputText = getInputText();
        C8041Qfl qfl2 = this.A04;
        if (qfl2 != null) {
            inputText.setId(qfl2.A03);
            BaseAutoCompleteTextView inputText2 = getInputText();
            C8041Qfl qfl3 = this.A04;
            if (qfl3 != null) {
                inputText2.setText((String) SRc.A0A(qfl3));
                BaseAutoCompleteTextView inputText3 = getInputText();
                C8041Qfl qfl4 = this.A04;
                if (qfl4 != null) {
                    switch (qfl4.A0L.intValue()) {
                        case 1:
                            i = 4099;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            i = 4097;
                            break;
                        case 6:
                            i = 33;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                    inputText3.setInputType(i);
                    getInputText().setImeOptions(33554432);
                    C8041Qfl qfl5 = this.A04;
                    if (qfl5 != null) {
                        if (qfl5.A0M != null) {
                            BaseAutoCompleteTextView inputText4 = getInputText();
                            C8041Qfl qfl6 = this.A04;
                            if (qfl6 != null) {
                                inputText4.setAutofillHints(new String[]{qfl6.A0M});
                                getInputText().setImportantForAutofill(1);
                            }
                        }
                        getInputText().A02 = new C13351TVy(this, 8);
                        getInputText().A03 = new C13351TVy(this, 9);
                        C8041Qfl qfl7 = this.A04;
                        if (qfl7 != null) {
                            setEnabled(qfl7.A08);
                            A03(this);
                            C8041Qfl qfl8 = this.A04;
                            if (qfl8 != null) {
                                if (qfl8.A0Q) {
                                    A04(this);
                                }
                                C8041Qfl qfl9 = this.A04;
                                if (qfl9 != null) {
                                    if (qfl9.A0R) {
                                        A0U();
                                        Context A0S = AnonymousClass7TE.A0S(this);
                                        int A002 = (int) C9676Reu.A00(A0S, R.attr.fbpay_condensed_input_field_vertical_padding);
                                        int A003 = (int) C9676Reu.A00(A0S, R.attr.fbpay_condensed_input_field_horizontal_padding);
                                        setPadding(A003, A002, A003, A002);
                                    }
                                    ViewParent parent = getInputText().getParent();
                                    0qQ.A0C(parent, C273654mx.A00(2));
                                    this.A03 = (FrameLayout) parent;
                                    this.A01 = getPaddingTop();
                                    this.A00 = getPaddingBottom();
                                    if (this.A03 != null) {
                                        this.A02 = (int) C9676Reu.A00(AnonymousClass7TE.A0S(this), R.attr.fbpay_input_field_vertical_adjust_padding);
                                        A05(this);
                                    }
                                    setOnClickListener(C11496SbJ.A00(this, 5));
                                    getInputText().addTextChangedListener(this.A05);
                                    getInputText().setOnFocusChangeListener(this.A06);
                                    getInputText().setOnKeyListener(this.A07);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    private final String getAccessibilityHint() {
        C8041Qfl qfl = this.A04;
        if (qfl == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = qfl.A03;
        if (i == 0) {
            return "";
        }
        String string = getResources().getString(i);
        0qQ.A0A(string);
        return string;
    }

    private final String getAccessibilityLabel() {
        C8041Qfl qfl = this.A04;
        if (qfl == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = qfl.A04;
        if (i != 0) {
            return getResources().getString(i);
        }
        return getExistingHint();
    }

    /* access modifiers changed from: private */
    public final String getExistingHint() {
        C8041Qfl qfl = this.A04;
        if (qfl == null) {
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = qfl.A05;
        if (i != 0) {
            return getResources().getString(i);
        }
        String str = qfl.A0N;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getExistingError() {
        C8041Qfl qfl = this.A04;
        if (qfl != null) {
            if (qfl.A0M() != 0) {
                Resources resources = getResources();
                C8041Qfl qfl2 = this.A04;
                if (qfl2 != null) {
                    return AnonymousClass7TF.A0d(resources, qfl2.A0M());
                }
            } else {
                C8041Qfl qfl3 = this.A04;
                if (qfl3 != null) {
                    String A0N = qfl3.A0N();
                    if (A0N == null) {
                        return "";
                    }
                    return A0N;
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C8041Qfl getViewModel() {
        C8041Qfl qfl = this.A04;
        if (qfl != null) {
            return qfl;
        }
        C51965G9l.A15();
        throw AnonymousClass00P.createAndThrow();
    }

    public C8066QgI(Context context) {
        super(context);
    }

    public static final void A03(C8066QgI qgI) {
        String accessibilityLabel = qgI.getAccessibilityLabel();
        Editable text = qgI.getInputText().getText();
        if (!(text == null || text.length() == 0)) {
            accessibilityLabel = TextUtils.join(", ", new Object[]{accessibilityLabel, qgI.getInputText().getText()});
        }
        C18674VwX.A00(qgI.getInputText(), false, AnonymousClass05K.A0Y, qgI.getAccessibilityHint(), accessibilityLabel);
    }

    public static final void A04(C8066QgI qgI) {
        InputMethodManager inputMethodManager;
        qgI.getInputText().requestFocus();
        Object systemService = qgI.getContext().getSystemService("input_method");
        if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
            inputMethodManager.showSoftInput(qgI.getInputText(), 1);
        }
    }

    public static final void A05(C8066QgI qgI) {
        boolean hasFocus = qgI.getInputText().hasFocus();
        Integer A0k = C51967G9n.A0k();
        if (!hasFocus) {
            Editable text = qgI.getInputText().getText();
            0qQ.A07(text);
            if (text.length() <= 0) {
                qgI.setPadding(qgI.getPaddingLeft(), qgI.A01 - qgI.A02, qgI.getPaddingRight(), qgI.A00 + qgI.A02);
                SSH.A03(qgI.getIcon(), A0k, A0k, Integer.valueOf(qgI.A02), A0k);
                return;
            }
        }
        qgI.setPadding(qgI.getPaddingLeft(), qgI.A01, qgI.getPaddingRight(), qgI.A00);
        SSH.A03(qgI.getIcon(), A0k, A0k, A0k, A0k);
    }

    /* access modifiers changed from: private */
    public final String getAccessibilityHintWithError() {
        int A0L;
        Object[] objArr;
        String A0R;
        String accessibilityHint = getAccessibilityHint();
        C8041Qfl qfl = this.A04;
        if (qfl != null) {
            if (qfl.A0L() == 0) {
                return accessibilityHint;
            }
            int length = accessibilityHint.length();
            Resources resources = getResources();
            if (length == 0) {
                C8041Qfl qfl2 = this.A04;
                if (qfl2 != null) {
                    A0L = qfl2.A0L();
                    objArr = new Object[1];
                    A0R = "";
                }
            } else {
                C8041Qfl qfl3 = this.A04;
                if (qfl3 != null) {
                    A0L = qfl3.A0L();
                    objArr = new Object[1];
                    A0R = 002.A0R(", ", accessibilityHint);
                }
            }
            objArr[0] = A0R;
            String string = resources.getString(A0L, objArr);
            0qQ.A0A(string);
            return string;
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(265752293);
        super.onAttachedToWindow();
        C8041Qfl qfl = this.A04;
        if (qfl != null) {
            qfl.A06.A09(this.A0F);
            C8041Qfl qfl2 = this.A04;
            if (qfl2 != null) {
                qfl2.A0B.A09(this.A0B);
                C8041Qfl qfl3 = this.A04;
                if (qfl3 != null) {
                    qfl3.A09.A09(this.A0C);
                    C8041Qfl qfl4 = this.A04;
                    if (qfl4 != null) {
                        qfl4.A0F.A09(this.A0G);
                        C8041Qfl qfl5 = this.A04;
                        if (qfl5 != null) {
                            qfl5.A0C.A09(this.A08);
                            C8041Qfl qfl6 = this.A04;
                            if (qfl6 != null) {
                                qfl6.A08.A09(this.A09);
                                C8041Qfl qfl7 = this.A04;
                                if (qfl7 != null) {
                                    qfl7.A0A.A09(this.A0D);
                                    C8041Qfl qfl8 = this.A04;
                                    if (qfl8 != null) {
                                        qfl8.A07.A09(this.A0E);
                                        C8041Qfl qfl9 = this.A04;
                                        if (qfl9 != null) {
                                            qfl9.A0D.A09(this.A0A);
                                            AnonymousClass0fD.A0D(1964128704, A062);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1985265656);
        super.onDetachedFromWindow();
        C8041Qfl qfl = this.A04;
        if (qfl != null) {
            qfl.A06.A08(this.A0F);
            C8041Qfl qfl2 = this.A04;
            if (qfl2 != null) {
                qfl2.A0B.A08(this.A0B);
                C8041Qfl qfl3 = this.A04;
                if (qfl3 != null) {
                    qfl3.A09.A08(this.A0C);
                    C8041Qfl qfl4 = this.A04;
                    if (qfl4 != null) {
                        qfl4.A0F.A08(this.A0G);
                        C8041Qfl qfl5 = this.A04;
                        if (qfl5 != null) {
                            qfl5.A0C.A08(this.A08);
                            C8041Qfl qfl6 = this.A04;
                            if (qfl6 != null) {
                                qfl6.A08.A08(this.A09);
                                C8041Qfl qfl7 = this.A04;
                                if (qfl7 != null) {
                                    qfl7.A0A.A08(this.A0D);
                                    C8041Qfl qfl8 = this.A04;
                                    if (qfl8 != null) {
                                        qfl8.A07.A08(this.A0E);
                                        C8041Qfl qfl9 = this.A04;
                                        if (qfl9 != null) {
                                            qfl9.A0D.A08(this.A0A);
                                            AnonymousClass0fD.A0D(-491614000, A062);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }
}
