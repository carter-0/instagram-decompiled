package com.instagram.profile.edit.fragment;

import X.16V;
import X.1QE;
import X.1wn;
import X.2Cy;
import X.2Ek;
import X.2da;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass36O;
import X.AnonymousClass4DH;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.C22030Xtl;
import X.C50676Fgb;
import X.C59904JbT;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.Dbb;
import X.F1D;
import X.FG1;
import X.FPD;
import X.FX1;
import X.G8A;
import X.G8D;
import X.G98;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.profile.edit.controller.EditProfileFieldsController;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;
import com.instagram.user.model.User;
import java.util.Map;

public class CompleteYourProfileFragment extends AnonymousClass4DH implements AnonymousClass4DR, G8A, AnonymousClass4DS {
    public AnonymousClass36O A00;
    public BusinessFlowAnalyticsLogger A01;
    public UserSession A02;
    public F1D A03;
    public EditProfileFieldsController A04;
    public User A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public G8D A0A;
    public final 1wn A0B = FX1.A00(this, 13);
    public final C50676Fgb A0C = new C50676Fgb(this);
    public IgImageView mAvatarImageView;
    public TextView mChangeAvatarButton;
    public ActionButton mSaveButton;

    public final AiStudioProfileBannerModel Aaa() {
        return null;
    }

    public final View.OnClickListener B8P() {
        return null;
    }

    public final View.OnClickListener CD3() {
        return null;
    }

    public final boolean CRf() {
        return false;
    }

    public final boolean CRi() {
        return false;
    }

    public final String getModuleName() {
        return "complete_your_profile_fragment";
    }

    public static void A00(CompleteYourProfileFragment completeYourProfileFragment) {
        if (completeYourProfileFragment.mView != null && completeYourProfileFragment.A03 != null) {
            A02(completeYourProfileFragment);
            C50676Fgb fgb = completeYourProfileFragment.A0C;
            fgb.A00 = false;
            completeYourProfileFragment.A04.A0B((Bundle) null, completeYourProfileFragment.A03, completeYourProfileFragment.A05);
            fgb.A00 = true;
            A01(completeYourProfileFragment);
        }
    }

    public static void A01(CompleteYourProfileFragment completeYourProfileFragment) {
        ActionButton actionButton = completeYourProfileFragment.mSaveButton;
        if (actionButton != null && completeYourProfileFragment.mView != null) {
            actionButton.setEnabled(completeYourProfileFragment.A04.A0D());
        }
    }

    public static void A02(CompleteYourProfileFragment completeYourProfileFragment) {
        IgImageView igImageView = completeYourProfileFragment.mAvatarImageView;
        if (igImageView != null) {
            DbU.A1S(completeYourProfileFragment, igImageView, completeYourProfileFragment.A05);
        }
        if (completeYourProfileFragment.mChangeAvatarButton != null) {
            boolean A1n = completeYourProfileFragment.A05.A1n();
            TextView textView = completeYourProfileFragment.mChangeAvatarButton;
            int i = 2131954991;
            if (A1n) {
                i = 2131952341;
            }
            textView.setText(i);
        }
    }

    public static void A03(CompleteYourProfileFragment completeYourProfileFragment, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = completeYourProfileFragment.A01;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Ckh(new C22030Xtl("profile_completion", completeYourProfileFragment.A06, "continue", str, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final G98 Bgm() {
        return this.A0C;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r4) {
        ? obj = new Object();
        obj.A02 = "";
        this.mSaveButton = C59904JbT.A00(new FPD((Object) this, 65), r4, obj);
        A01(this);
        Dbb.A0s(new FPD((Object) this, 66), DbX.A0M(), r4);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!this.A09 || (businessFlowAnalyticsLogger = this.A01) == null) {
            return false;
        }
        businessFlowAnalyticsLogger.ChP(new C22030Xtl("profile_completion", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A08(intent, i, i2, false);
    }

    public final void onAttach(Context context) {
        CompleteYourProfileFragment.super.onAttach(context);
        this.A0A = FG1.A01(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r0 = 1466685548(0x576bd86c, float:2.59314757E14)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r12 = r19
            r0 = r20
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment.super.onCreate(r0)
            android.os.Bundle r5 = r12.requireArguments()
            com.instagram.common.session.UserSession r4 = X.DbX.A0U(r12)
            r12.A02 = r4
            X.0gy r3 = X.AnonymousClass07i.A00(r12)
            r1 = 0
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = new com.instagram.profile.edit.controller.EditProfileFieldsController
            r0.<init>(r3, r4, r1)
            r12.A04 = r0
            r12.registerLifecycleListener(r0)
            com.instagram.common.session.UserSession r0 = r12.A02
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            r12.A05 = r0
            java.lang.String r0 = X.DbS.A0l(r5)
            r12.A06 = r0
            java.lang.String r0 = "ARG_CHECKLIST_ITEM_COMPLETED"
            boolean r0 = r5.getBoolean(r0, r1)
            r12.A08 = r0
            com.instagram.common.session.UserSession r1 = r12.A02
            X.G8D r0 = r12.A0A
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.FG1.A00(r0, r12, r1)
            r12.A01 = r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r4 = "profile_completion"
            r6 = 0
            java.lang.String r5 = r12.A06
            X.Xtl r3 = new X.Xtl
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.Cka(r3)
        L_0x005b:
            boolean r0 = X.AnonymousClass36O.A0G
            com.instagram.common.session.UserSession r15 = r12.A02
            X.0hq r13 = X.DbV.A0I(r12)
            com.instagram.user.model.User r1 = r12.A05
            r0 = 1
            X.FTY r14 = new X.FTY
            r14.<init>(r12, r0)
            java.lang.Integer r17 = X.AnonymousClass05K.A0s
            X.AnonymousClass7TG.A0w(r0, r15, r13, r1)
            r18 = 0
            X.36O r11 = new X.36O
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r12.A00 = r11
            X.6ST r3 = X.DbW.A0Y(r12)
            r0 = 2131965491(0x7f133633, float:1.9567793E38)
            X.DbU.A1L(r12, r3, r0)
            com.instagram.common.session.UserSession r0 = r12.A02
            X.1OC r1 = X.C318486p2.A06(r0)
            r0 = 26
            X.EDV.A00(r1, r12, r3, r0)
            X.1ES.A03(r1)
            r0 = 1360781239(0x511bdfb7, float:4.1842078E10)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.fragment.CompleteYourProfileFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1359328329);
        View inflate = layoutInflater.inflate(R.layout.fragment_complete_your_profile, viewGroup, false);
        this.A04.A0C(inflate, requireActivity(), getViewLifecycleOwner(), this, this.A05, false, false);
        Dba.A06(inflate).setText(2131956476);
        TextView A052 = Dba.A05(inflate);
        int i = 2131956475;
        if (2Ek.A01(this.A05)) {
            i = 2131956474;
        }
        A052.setText(i);
        AnonymousClass0fD.A09(2016693768, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1774528546);
        super.onDestroyView();
        AnonymousClass1Nd.A00(this.A02).A02(this.A0B, 2Cy.class);
        this.mSaveButton = null;
        AnonymousClass0fD.A09(-2105393123, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2060869903);
        CompleteYourProfileFragment.super.onPause();
        FragmentActivity activity = getActivity();
        if (!(activity == null || activity.getWindow() == null)) {
            activity.getWindow().setSoftInputMode(48);
        }
        AnonymousClass0fD.A09(1939939026, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1557717387);
        super.onResume();
        A01(this);
        Window A0G = DbV.A0G(this);
        A0G.getClass();
        A0G.setSoftInputMode(32);
        AnonymousClass0fD.A09(254190277, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        EditProfileExpressionController editProfileExpressionController;
        IgFormField igFormField;
        super.onViewCreated(view, bundle);
        IgImageView A0b = DbT.A0b(view, R.id.profile_pic_imageview);
        this.mAvatarImageView = A0b;
        A0b.setVisibility(0);
        FPD.A00(this.mAvatarImageView, 63, this);
        TextView A0G = DbU.A0G(view, R.id.change_avatar_button);
        this.mChangeAvatarButton = A0G;
        A0G.setVisibility(0);
        TextView textView = this.mChangeAvatarButton;
        boolean z = 1QE.A0E().A00;
        Context requireContext = requireContext();
        DbT.A17(requireContext, textView, DbZ.A00(requireContext, this, z ? 1 : 0));
        FPD.A00(this.mChangeAvatarButton, 64, this);
        A00(this);
        16V A0J = this.A05.A0J();
        if (A0J != null) {
            EditProfileFieldsController editProfileFieldsController = this.A04;
            if (!(A0J != 16V.A05 || (editProfileExpressionController = editProfileFieldsController.A03) == null || (igFormField = editProfileExpressionController.nameField) == null)) {
                igFormField.setLabelText(editProfileFieldsController.A06().getString(2131954388));
            }
        }
        AnonymousClass1Nd.A00(this.A02).A01(this.A0B, 2Cy.class);
    }
}
