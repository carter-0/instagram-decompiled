package X;

import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.igds.components.form.IgFormField;

public final class K4Z extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClipsDraftRenameFragment";
    public C66428MRi A00;
    public IgFormField A01;
    public TextWatcher A02;
    public IgButton A03;
    public IgButton A04;
    public String A05 = "";
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new MMH(this, 17));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgButton igButton = (IgButton) view.findViewById(R.id.draft_rename_save_button);
        this.A04 = igButton;
        if (igButton == null) {
            str = "saveButton";
        } else {
            LY3.A00(igButton, 25, this);
            IgButton igButton2 = (IgButton) view.findViewById(R.id.draft_rename_cancel_button);
            this.A03 = igButton2;
            if (igButton2 == null) {
                str = "cancelButton";
            } else {
                LY3.A00(igButton2, 26, this);
                IgFormField igFormField = (IgFormField) view.findViewById(R.id.rename_edit_text);
                this.A01 = igFormField;
                str = "nameFormField";
                if (igFormField != null) {
                    igFormField.setMaxLength(28);
                    IgFormField igFormField2 = this.A01;
                    if (igFormField2 != null) {
                        igFormField2.A0D();
                        IgFormField igFormField3 = this.A01;
                        if (igFormField3 != null) {
                            igFormField3.setTextProperty(this.A05);
                            if (AnonymousClass7TF.A1Z(this.A06)) {
                                IgFormField igFormField4 = this.A01;
                                if (igFormField4 != null) {
                                    DbU.A1G(igFormField4.getBottomSubtitleErrorView(), this, 2131961047);
                                    LWP lwp = new LWP((Object) this, 23);
                                    IgFormField igFormField5 = this.A01;
                                    if (igFormField5 != null) {
                                        igFormField5.getMEditText().addTextChangedListener(lwp);
                                        this.A02 = lwp;
                                    }
                                }
                            }
                            IgFormField igFormField6 = this.A01;
                            if (igFormField6 != null) {
                                igFormField6.getMEditText().setOnEditorActionListener(new LZR(this, 3));
                                IgFormField igFormField7 = this.A01;
                                if (igFormField7 != null) {
                                    0nA.A0S(igFormField7.getMEditText());
                                    return;
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

    public static final void A00(K4Z k4z) {
        IgFormField igFormField = k4z.A01;
        String str = "nameFormField";
        if (igFormField != null) {
            String obj = igFormField.getText().toString();
            if (obj.length() != 0 || !AnonymousClass7TF.A1Z(k4z.A06)) {
                if (!obj.equals(k4z.A05)) {
                    C66428MRi mRi = k4z.A00;
                    if (mRi != null) {
                        mRi.DAQ(obj);
                    } else {
                        str = "delegate";
                    }
                }
                DbX.A1J(k4z);
                return;
            }
            IgFormField igFormField2 = k4z.A01;
            if (igFormField2 != null) {
                igFormField2.getBottomSubtitleErrorView().setVisibility(0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final void onCreate(Bundle bundle) {
        Boolean bool;
        String string;
        int A022 = AnonymousClass0fD.A02(-1888649603);
        K4Z.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bool = Boolean.valueOf(bundle2.getBoolean(C273654mx.A00(40), false));
        } else {
            bool = null;
        }
        if (DbX.A1a(bool)) {
            setDayNightMode(AnonymousClass2k4.NIGHT);
        }
        Bundle bundle3 = this.mArguments;
        if (!(bundle3 == null || (string = bundle3.getString(AnonymousClass000.A00(1105), (String) null)) == null || string.length() <= 0)) {
            this.A05 = string;
        }
        AnonymousClass0fD.A09(-1161024901, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-116522725);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_draft_rename_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1980280946, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1736566660);
        TextWatcher textWatcher = this.A02;
        if (textWatcher != null) {
            IgFormField igFormField = this.A01;
            if (igFormField == null) {
                0qQ.A0F("nameFormField");
                throw AnonymousClass00P.createAndThrow();
            }
            igFormField.getMEditText().removeTextChangedListener(textWatcher);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-1395444049, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1035749729);
        super.onResume();
        IgFormField igFormField = this.A01;
        if (igFormField == null) {
            0qQ.A0F("nameFormField");
            throw AnonymousClass00P.createAndThrow();
        }
        igFormField.getMEditText().requestFocus();
        AnonymousClass0fD.A09(-711391108, A022);
    }
}
