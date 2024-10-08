package com.instagram.business.ui;

import X.002;
import X.0hq;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9F0;
import X.C3270479e;
import X.C375999Gd;
import X.C376009Ge;
import X.C48749EjY;
import X.C51958G9e;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbW;
import X.Dba;
import X.Dbb;
import X.Dbc;
import X.EVZ;
import X.FKj;
import X.FP5;
import X.FPM;
import X.FdS;
import X.G6B;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.List;

public final class BusinessInfoSectionView extends LinearLayout implements CallerContextable {
    public EditText A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public IgdsSwitch A06;
    public boolean A07;
    public TextWatcher A08;
    public View A09;
    public View A0A;
    public View A0B;
    public TextView A0C;
    public TextView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public EditPhoneNumberView A0I;
    public boolean A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessInfoSectionView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }

    public final void A03(Context context, PublicPhoneContact publicPhoneContact) {
        String str;
        TextView textView;
        String str2;
        0qQ.A0B(context, 1);
        CountryCodeData A002 = C3270479e.A00(context);
        String str3 = A002.A01;
        boolean z = false;
        String str4 = null;
        if (publicPhoneContact != null) {
            str3 = publicPhoneContact.A01;
            if (!(str3 == null || str3.length() == 0)) {
                A002 = C3270479e.A01(context, str3);
                str3 = 002.A0D(str3, '+');
            }
            str4 = publicPhoneContact.A02;
        }
        if (this.A0J) {
            EditPhoneNumberView editPhoneNumberView = this.A0I;
            if (editPhoneNumberView == null) {
                str = "editPhoneNumberView";
            } else {
                editPhoneNumberView.setupEditPhoneNumberView(A002, str4);
                return;
            }
        } else {
            if (str4 == null || str4.length() == 0) {
                z = true;
            }
            str = "phoneNumberTextView";
            if (!z) {
                String A0E2 = Dbc.A0E(str4);
                textView = this.A0H;
                if (textView != null) {
                    str2 = 002.A0g(str3, " ", A0E2);
                }
            } else {
                textView = this.A0H;
                if (textView != null) {
                    str2 = "";
                }
            }
            textView.setText(str2);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setBusinessInfo(UserSession userSession, BusinessInfo businessInfo, Fragment fragment, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, C51958G9e g9e) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        Fragment fragment2 = fragment;
        AnonymousClass7TG.A1O(businessInfo, fragment);
        C51958G9e g9e2 = g9e;
        0qQ.A0B(g9e2, 11);
        EditText editText = this.A00;
        String str = "emailEditView";
        if (editText != null) {
            editText.setText(businessInfo.A0B);
            this.A0J = z;
            A03(fragment.requireContext(), businessInfo.A01);
            if (this.A0J) {
                EditPhoneNumberView editPhoneNumberView = this.A0I;
                if (editPhoneNumberView != null) {
                    EditPhoneNumberView.A01(fragment2, (0hq) null, userSession2, (EVZ) null, (G6B) null, g9e2, editPhoneNumberView);
                    EditText editText2 = this.A00;
                    if (editText2 != null) {
                        DbU.A11(fragment.requireContext(), editText2, R.drawable.input);
                    }
                }
                0qQ.A0F("editPhoneNumberView");
                throw AnonymousClass00P.createAndThrow();
            }
            EditPhoneNumberView editPhoneNumberView2 = this.A0I;
            if (editPhoneNumberView2 != null) {
                editPhoneNumberView2.setVisibility(8);
                TextView textView = this.A0H;
                if (textView == null) {
                    str = "phoneNumberTextView";
                } else {
                    textView.setVisibility(0);
                }
            }
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
            if (z2) {
                A05(businessInfo.A00);
                A06(businessInfo.A0M, z3);
            } else {
                View view = this.A09;
                if (view == null) {
                    str = "addressRowView";
                } else {
                    view.setVisibility(8);
                }
            }
            if (z5) {
                A07(businessInfo.A0P);
            } else {
                TextView textView2 = this.A0G;
                if (textView2 == null) {
                    str = "nativeCallingTextView";
                } else {
                    textView2.setVisibility(8);
                }
            }
            if (z4) {
                A04(userSession);
            } else {
                TextView textView3 = this.A05;
                if (textView3 == null) {
                    str = "whatsAppTextView";
                } else {
                    textView3.setVisibility(8);
                }
            }
            if (z8) {
                A01();
            }
            A08(z6, businessInfo.A0S, z7);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setBusinessInfoListeners(C51958G9e g9e) {
        0qQ.A0B(g9e, 0);
        FKj fKj = new FKj(0, this, g9e);
        this.A08 = fKj;
        EditText editText = this.A00;
        String str = "emailEditView";
        if (editText != null) {
            editText.addTextChangedListener(fKj);
            EditText editText2 = this.A00;
            if (editText2 != null) {
                FPM.A00(editText2, 1, g9e);
                EditPhoneNumberView editPhoneNumberView = this.A0I;
                if (editPhoneNumberView == null) {
                    str = "editPhoneNumberView";
                } else {
                    editPhoneNumberView.A01.addTextChangedListener(new FKj(1, this, g9e));
                    if (!this.A0J) {
                        TextView textView = this.A0H;
                        if (textView == null) {
                            str = "phoneNumberTextView";
                        } else {
                            textView.setOnClickListener(FP5.A00(g9e, 16));
                        }
                    }
                    View view = this.A09;
                    if (view == null) {
                        str = "addressRowView";
                    } else {
                        view.setOnClickListener(FP5.A00(g9e, 17));
                        TextView textView2 = this.A0G;
                        if (textView2 == null) {
                            str = "nativeCallingTextView";
                        } else {
                            textView2.setOnClickListener(FP5.A00(g9e, 18));
                            TextView textView3 = this.A05;
                            if (textView3 == null) {
                                str = "whatsAppTextView";
                            } else {
                                textView3.setOnClickListener(FP5.A00(g9e, 19));
                                IgdsSwitch igdsSwitch = this.A06;
                                if (igdsSwitch == null) {
                                    str = "profileDisplayToggle";
                                } else {
                                    igdsSwitch.A07 = new FdS(g9e, 7);
                                    View view2 = this.A0A;
                                    if (view2 == null) {
                                        str = "profileDisplayRow";
                                    } else {
                                        view2.setOnClickListener(FP5.A00(this, 20));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setCountryCode(CountryCodeData countryCodeData) {
        0qQ.A0B(countryCodeData, 0);
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            editPhoneNumberView.setCountryCodeWithCountryPrefix(countryCodeData);
        }
    }

    private final void setDarkModeTint(TextView textView) {
        if (textView != null) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    AnonymousClass7TE.A1R(drawable.mutate(), 2Yu.A01(getContext()));
                }
            }
        }
    }

    public final void A01() {
        String str;
        TextView textView = this.A0E;
        if (textView == null) {
            str = "bottomText";
        } else {
            textView.setText(2131961506);
            TextView textView2 = this.A0F;
            str = "bottomText2";
            if (textView2 != null) {
                Dbb.A0l(getResources(), textView2, 2131961507);
                TextView textView3 = this.A0F;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        String str;
        TextView textView = this.A0H;
        if (textView == null) {
            str = "phoneNumberTextView";
        } else {
            textView.setOnClickListener((View.OnClickListener) null);
            View view = this.A09;
            if (view == null) {
                str = "addressRowView";
            } else {
                view.setOnClickListener((View.OnClickListener) null);
                TextWatcher textWatcher = this.A08;
                if (textWatcher != null) {
                    EditText editText = this.A00;
                    if (editText == null) {
                        str = "emailEditView";
                    } else {
                        editText.removeTextChangedListener(textWatcher);
                    }
                }
                this.A08 = null;
                IgdsSwitch igdsSwitch = this.A06;
                if (igdsSwitch == null) {
                    str = "profileDisplayToggle";
                } else {
                    igdsSwitch.A07 = null;
                    View view2 = this.A0A;
                    if (view2 == null) {
                        str = "profileDisplayRow";
                    } else {
                        view2.setOnClickListener((View.OnClickListener) null);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(UserSession userSession) {
        C375999Gd r1;
        TextView textView;
        String A002;
        Class<BusinessInfoSectionView> cls = BusinessInfoSectionView.class;
        0qQ.A0B(userSession, 0);
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setVisibility(DbW.A01(C48749EjY.A00(userSession) ? 1 : 0));
            if (!AnonymousClass7TF.A0Q(userSession).A1d()) {
                textView = this.A05;
                if (textView != null) {
                    A002 = "";
                }
            } else {
                C376009Ge A012 = AnonymousClass9F0.A01(AnonymousClass9F0.A00(cls), userSession);
                if (A012 != null && (r1 = A012.A00) != null) {
                    textView = this.A05;
                    if (textView != null) {
                        A002 = r1.A00(AnonymousClass9F0.A00(cls), userSession);
                    }
                } else {
                    return;
                }
            }
            textView.setText(A002);
            return;
        }
        0qQ.A0F("whatsAppTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(Address address) {
        String str;
        if (address == null || (str = address.A03) == null || str.length() == 0) {
            TextView textView = this.A01;
            if (textView != null) {
                DbS.A1C(textView);
                return;
            }
        } else {
            TextView textView2 = this.A01;
            if (textView2 != null) {
                textView2.setText(str);
                return;
            }
        }
        0qQ.A0F("addressTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06(List list, boolean z) {
        TextView textView = this.A01;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.A0D;
            if (textView2 != null) {
                textView2.setVisibility(8);
                TextView textView3 = this.A0C;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    TextView textView4 = this.A0C;
                    if (textView4 != null) {
                        DbS.A1C(textView4);
                        if (z && list != null && AnonymousClass7TE.A1b(list)) {
                            TextView textView5 = this.A01;
                            if (textView5 != null) {
                                textView5.setVisibility(8);
                                TextView textView6 = this.A0D;
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                    TextView textView7 = this.A0C;
                                    if (textView7 != null) {
                                        textView7.setVisibility(0);
                                        int size = list.size() + 1;
                                        TextView textView8 = this.A0C;
                                        if (textView8 != null) {
                                            textView8.setText(String.valueOf(size));
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
                0qQ.A0F("addressCountTextView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("addressTitleTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("addressTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A07(boolean z) {
        TextView textView = this.A0G;
        if (z) {
            if (textView != null) {
                textView.setText(2131954389);
            }
            0qQ.A0F("nativeCallingTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        0qQ.A0F("nativeCallingTextView");
        throw AnonymousClass00P.createAndThrow();
        this.A07 = z;
        TextView textView2 = this.A0G;
        if (textView2 != null) {
            textView2.setVisibility(0);
            return;
        }
        0qQ.A0F("nativeCallingTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A08(boolean z, boolean z2, boolean z3) {
        String str = "profileDisplayRow";
        View view = this.A0A;
        if (z) {
            if (view != null) {
                view.setVisibility(0);
                str = "profileDisplayToggle";
                IgdsSwitch igdsSwitch = this.A06;
                if (z3) {
                    if (igdsSwitch != null) {
                        igdsSwitch.setCheckedAnimated(z2);
                        return;
                    }
                } else if (igdsSwitch != null) {
                    igdsSwitch.setChecked(z2);
                    return;
                }
            }
        } else if (view != null) {
            view.setVisibility(8);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A09() {
        String str;
        EditText editText = this.A00;
        if (editText == null) {
            str = "emailEditView";
        } else {
            Editable text = editText.getText();
            if ((text != null && text.length() != 0) || !A0A()) {
                return false;
            }
            TextView textView = this.A01;
            if (textView == null) {
                str = "addressTextView";
            } else {
                CharSequence text2 = textView.getText();
                if (text2 != null && text2.length() != 0) {
                    return false;
                }
                TextView textView2 = this.A05;
                if (textView2 == null) {
                    str = "whatsAppTextView";
                } else {
                    CharSequence text3 = textView2.getText();
                    if (text3 == null || text3.length() == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0A() {
        CharSequence text;
        if (this.A0J) {
            text = getNationalNumber();
        } else {
            TextView textView = this.A0H;
            if (textView == null) {
                0qQ.A0F("phoneNumberTextView");
                throw AnonymousClass00P.createAndThrow();
            }
            text = textView.getText();
        }
        if (text == null || text.length() == 0) {
            return true;
        }
        return false;
    }

    public final String getAddress() {
        TextView textView = this.A01;
        if (textView != null) {
            return DbV.A0y(textView);
        }
        0qQ.A0F("addressTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getCountryCode() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        }
        String countryCodeWithoutPlus = editPhoneNumberView.A04.getCountryCodeWithoutPlus();
        0qQ.A07(countryCodeWithoutPlus);
        return countryCodeWithoutPlus;
    }

    public final String getEmail() {
        EditText editText = this.A00;
        if (editText != null) {
            return AnonymousClass7TF.A0f(editText);
        }
        0qQ.A0F("emailEditView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getNationalNumber() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView == null) {
            0qQ.A0F("editPhoneNumberView");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(editPhoneNumberView.A01);
        0qQ.A07(A0f);
        return A0f;
    }

    public final String getPhoneNumber() {
        EditPhoneNumberView editPhoneNumberView = this.A0I;
        if (editPhoneNumberView != null) {
            return editPhoneNumberView.getPhoneNumber();
        }
        0qQ.A0F("editPhoneNumberView");
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_business_info_section, this);
        this.A0B = inflate;
        if (inflate != null) {
            this.A00 = DbU.A0E(inflate, R.id.email);
            View view = this.A0B;
            if (view != null) {
                this.A09 = view.requireViewById(R.id.address_row);
                View view2 = this.A0B;
                if (view2 != null) {
                    this.A01 = DbU.A0G(view2, R.id.address);
                    View view3 = this.A0B;
                    if (view3 != null) {
                        this.A0D = DbU.A0G(view3, R.id.address_title);
                        View view4 = this.A0B;
                        if (view4 != null) {
                            this.A0C = DbU.A0G(view4, R.id.address_count);
                            View view5 = this.A0B;
                            if (view5 != null) {
                                this.A05 = DbU.A0G(view5, R.id.whatsapp);
                                View view6 = this.A0B;
                                if (view6 != null) {
                                    this.A0G = DbU.A0G(view6, R.id.native_calling);
                                    View view7 = this.A0B;
                                    if (view7 != null) {
                                        this.A0I = (EditPhoneNumberView) view7.requireViewById(R.id.phone_number_edit_view);
                                        View view8 = this.A0B;
                                        if (view8 != null) {
                                            this.A0H = DbU.A0G(view8, R.id.phone_number_text_view);
                                            View view9 = this.A0B;
                                            if (view9 != null) {
                                                View requireViewById = view9.requireViewById(R.id.profile_display_toggle);
                                                this.A0A = requireViewById;
                                                String str = "profileDisplayRow";
                                                if (requireViewById != null) {
                                                    Dba.A06(requireViewById).setText(2131969949);
                                                    View view10 = this.A0A;
                                                    if (view10 != null) {
                                                        this.A06 = (IgdsSwitch) view10.requireViewById(R.id.toggle);
                                                        View view11 = this.A0B;
                                                        if (view11 != null) {
                                                            this.A0E = DbU.A0G(view11, R.id.bottom_text);
                                                            View view12 = this.A0B;
                                                            if (view12 != null) {
                                                                this.A0F = DbU.A0G(view12, R.id.bottom_text_2);
                                                                View view13 = this.A0B;
                                                                if (view13 != null) {
                                                                    TextView A0G2 = DbU.A0G(view13, R.id.email_inline_error_message);
                                                                    this.A03 = A0G2;
                                                                    if (A0G2 == null) {
                                                                        str = "emailInlineErrorMessage";
                                                                    } else {
                                                                        A0G2.setText(2131969518);
                                                                        View view14 = this.A0B;
                                                                        if (view14 != null) {
                                                                            TextView A0G3 = DbU.A0G(view14, R.id.phone_inline_error_message);
                                                                            this.A04 = A0G3;
                                                                            if (A0G3 == null) {
                                                                                str = "phoneInlineErrorMessage";
                                                                            } else {
                                                                                A0G3.setText(2131969388);
                                                                                View view15 = this.A0B;
                                                                                if (view15 != null) {
                                                                                    TextView A0G4 = DbU.A0G(view15, R.id.bottom_inline_error_message);
                                                                                    this.A02 = A0G4;
                                                                                    if (A0G4 == null) {
                                                                                        str = "bottomInlineErrorMessage";
                                                                                    } else {
                                                                                        A0G4.setText(2131969520);
                                                                                        EditText editText = this.A00;
                                                                                        if (editText == null) {
                                                                                            str = "emailEditView";
                                                                                        } else {
                                                                                            Drawable drawable = editText.getCompoundDrawables()[0];
                                                                                            if (drawable != null) {
                                                                                                AnonymousClass7TE.A1R(drawable.mutate(), 2Yu.A01(getContext()));
                                                                                            }
                                                                                            TextView textView = this.A0H;
                                                                                            if (textView == null) {
                                                                                                str = "phoneNumberTextView";
                                                                                            } else {
                                                                                                setDarkModeTint(textView);
                                                                                                TextView textView2 = this.A05;
                                                                                                if (textView2 == null) {
                                                                                                    str = "whatsAppTextView";
                                                                                                } else {
                                                                                                    setDarkModeTint(textView2);
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
                                                            }
                                                        }
                                                    }
                                                }
                                                0qQ.A0F(str);
                                                throw AnonymousClass00P.createAndThrow();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.model.business.PublicPhoneContact, java.lang.Object] */
    public final PublicPhoneContact getSubmitPublicPhoneContact() {
        if (getNationalNumber().length() == 0) {
            return null;
        }
        String countryCode = getCountryCode();
        String nationalNumber = getNationalNumber();
        String phoneNumber = getPhoneNumber();
        ? obj = new Object();
        obj.A01 = countryCode;
        obj.A02 = nationalNumber;
        obj.A03 = phoneNumber;
        obj.A00 = "CALL";
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
