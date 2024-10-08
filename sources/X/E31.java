package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.intf.MultipleLinksEditModel;

public final class E31 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MultipleLinksEditFragment";
    public ActionButton A00;
    public IgFormField A01;
    public IgFormField A02;
    public Integer A03;
    public 0eP A04;
    public boolean A05;
    public IgTextView A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C51800G2j.A00(this, 39));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(C51800G2j.A00(this, 40));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(C51800G2j.A00(this, 41));
    public final FKk A0B = new FKk(this, 19);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r6) {
        Context requireContext;
        int i;
        0qQ.A0B(r6, 0);
        ? obj = new Object();
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                requireContext = requireContext();
                i = 2131970008;
            } else if (intValue == 1) {
                requireContext = requireContext();
                i = 2131970017;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            obj.A02 = requireContext.getString(i);
            ActionButton A002 = C59904JbT.A00(FPC.A00(this, 42), r6, obj);
            Integer num2 = this.A03;
            if (num2 != null) {
                if (num2 == AnonymousClass05K.A01) {
                    A002.setEnabled(false);
                }
                this.A00 = A002;
                DbX.A1A(FPC.A00(this, 43), DbX.A0M(), r6);
                return;
            }
        }
        0qQ.A0F(DatePickerDialogModule.ARG_MODE);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "multiple_links_edit";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.3qn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3qn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            super.onViewCreated(r8, r9)
            r0 = 2131432234(0x7f0b132a, float:1.848622E38)
            com.instagram.igds.components.form.IgFormField r0 = X.DbT.A0d(r8, r0)
            r7.A02 = r0
            r0 = 2131432231(0x7f0b1327, float:1.8486214E38)
            com.instagram.igds.components.form.IgFormField r0 = X.DbT.A0d(r8, r0)
            r7.A01 = r0
            r0 = 2131439814(0x7f0b30c6, float:1.8501594E38)
            com.instagram.common.ui.base.IgTextView r2 = X.DbT.A0a(r8, r0)
            r7.A06 = r2
            java.lang.Integer r0 = r7.A03
            java.lang.String r3 = "mode"
            if (r0 == 0) goto L_0x010c
            int r1 = r0.intValue()
            java.lang.String r6 = "removeLinkButton"
            if (r1 == r4) goto L_0x00fa
            r0 = 1
            if (r1 != r0) goto L_0x0103
            if (r2 == 0) goto L_0x0108
            r2.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r1 = r7.A06
            if (r1 == 0) goto L_0x0108
            r0 = 44
            X.FPC.A01(r1, r0, r7)
        L_0x0041:
            com.instagram.igds.components.form.IgFormField r1 = r7.A02
            java.lang.String r5 = "urlFormField"
            if (r1 == 0) goto L_0x0110
            r0 = 17
            r1.setInputType(r0)
            com.instagram.igds.components.form.IgFormField r2 = r7.A02
            if (r2 == 0) goto L_0x0110
            r1 = 5
            X.Fcj r0 = new X.Fcj
            r0.<init>(r7, r1)
            r2.setRuleChecker(r0)
            java.lang.Integer r0 = r7.A03
            if (r0 == 0) goto L_0x010c
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r6 = "titleFormField"
            if (r0 != r2) goto L_0x0073
            com.instagram.igds.components.form.IgFormField r0 = r7.A02
            if (r0 == 0) goto L_0x0110
            X.FKk r1 = r7.A0B
            r0.A0G(r1)
            com.instagram.igds.components.form.IgFormField r0 = r7.A01
            if (r0 == 0) goto L_0x0108
            r0.A0G(r1)
        L_0x0073:
            com.instagram.igds.components.form.IgFormField r1 = r7.A01
            if (r1 == 0) goto L_0x0108
            r0 = 250(0xfa, float:3.5E-43)
            r1.setMaxLength(r0)
            java.lang.Integer r0 = r7.A03
            if (r0 == 0) goto L_0x010c
            if (r0 != r2) goto L_0x00f9
            X.0eM r0 = r7.A0A
            java.lang.Object r0 = r0.getValue()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            java.util.List r2 = r0.Afp()
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.String r0 = "edit_model"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.profile.intf.MultipleLinksEditModel r0 = (com.instagram.profile.intf.MultipleLinksEditModel) r0
            r4 = 0
            if (r0 == 0) goto L_0x00f9
            java.lang.String r3 = r0.A01
            if (r3 == 0) goto L_0x00f9
            if (r2 == 0) goto L_0x00f9
            java.util.Iterator r2 = r2.iterator()
        L_0x00a9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3qn r0 = (X.C253443qn) r0
            java.lang.String r0 = r0.BMn()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x00a9
            r4 = r1
        L_0x00c1:
            X.3qn r4 = (X.C253443qn) r4
            if (r4 == 0) goto L_0x00f9
            com.instagram.igds.components.form.IgFormField r1 = r7.A02
            if (r1 == 0) goto L_0x0110
            java.lang.String r0 = r4.getUrl()
            r1.setText(r0)
            com.instagram.igds.components.form.IgFormField r1 = r7.A01
            r3 = r6
            if (r1 == 0) goto L_0x010c
            java.lang.String r0 = r4.getTitle()
            r1.setText(r0)
            java.lang.String r1 = r4.getUrl()
            java.lang.String r0 = r4.getTitle()
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            r7.A04 = r0
            com.instagram.igds.components.form.IgFormField r0 = r7.A02
            if (r0 == 0) goto L_0x0110
            r1 = 0
            r0.setSelection(r1)
            com.instagram.igds.components.form.IgFormField r0 = r7.A01
            if (r0 == 0) goto L_0x010c
            r0.setSelection(r1)
        L_0x00f9:
            return
        L_0x00fa:
            if (r2 == 0) goto L_0x0108
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x0041
        L_0x0103:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0108:
            X.0qQ.A0F(r6)
            goto L_0x0113
        L_0x010c:
            X.0qQ.A0F(r3)
            goto L_0x0113
        L_0x0110:
            X.0qQ.A0F(r5)
        L_0x0113:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E31.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(C310346aq r2, String str, String str2) {
        1xC r1 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A0C = r2;
        A0a.A0H = str2;
        A0a.A0D = str;
        DbY.A1K(r1, A0a);
    }

    public static final boolean A01(E31 e31) {
        String str;
        IgFormField igFormField = e31.A02;
        if (igFormField == null) {
            str = "urlFormField";
        } else {
            String A0o = DbU.A0o(igFormField);
            IgFormField igFormField2 = e31.A01;
            if (igFormField2 != null) {
                return !AnonymousClass7TE.A1L(A0o, DbU.A0o(igFormField2)).equals(e31.A04);
            }
            str = "titleFormField";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-946297108);
        E31.super.onCreate(bundle);
        MultipleLinksEditModel multipleLinksEditModel = (MultipleLinksEditModel) requireArguments().getParcelable("edit_model");
        if (multipleLinksEditModel != null) {
            this.A03 = multipleLinksEditModel.A00;
            AnonymousClass0fD.A09(-1563035911, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1570699514, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1473169392);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_edit_link, viewGroup, false);
        AnonymousClass0fD.A09(-937054250, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(438311439);
        E31.super.onPause();
        View view = this.mView;
        if (view != null) {
            0nA.A0N(view);
        }
        AnonymousClass0fD.A09(1912246350, A022);
    }
}
