package com.instagram.profile.edit.controller;

import X.00l;
import X.0Aj;
import X.0Tu;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.0xG;
import X.182;
import X.1Ln;
import X.1Ng;
import X.1wn;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass07Z;
import X.AnonymousClass07i;
import X.AnonymousClass0eM;
import X.AnonymousClass0fU;
import X.AnonymousClass0kN;
import X.AnonymousClass1Nd;
import X.AnonymousClass1YB;
import X.AnonymousClass30D;
import X.AnonymousClass3ZA;
import X.AnonymousClass4v0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9LD;
import X.C18810W3l;
import X.C19403WXw;
import X.C242043Sk;
import X.C252063oV;
import X.C252233om;
import X.C253353qe;
import X.C253493qs;
import X.C273654mx;
import X.C318716pP;
import X.C318726pQ;
import X.C319886rO;
import X.C324536zU;
import X.C3249970q;
import X.C3250170s;
import X.C46671Dj0;
import X.C49313Esw;
import X.C49910FEi;
import X.C50267FVy;
import X.C50268FVz;
import X.C50274FWf;
import X.C50278FWj;
import X.C50496Fci;
import X.C50678Fgd;
import X.C51249Fr4;
import X.C51763G0f;
import X.C69349Njo;
import X.C71662eb;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.F1D;
import X.FNH;
import X.FNP;
import X.FPD;
import X.FPH;
import X.FWU;
import X.FX1;
import X.FdL;
import X.FdX;
import X.G4S;
import X.G8A;
import X.X4E;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController;
import com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class EditProfileFieldsController extends C252233om {
    public AnonymousClass07Z A00;
    public F1D A01;
    public G8A A02;
    public EditProfileExpressionController A03;
    public User A04;
    public EditProfileBarcelonaController A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass07i A08;
    public final 0xG A09 = DbS.A0O("edit_profile_fields_controller");
    public final UserSession A0A;
    public final 1wn A0B;
    public final 1wn A0C;
    public final 1wn A0D;
    public final 1wn A0E;
    public final 1wn A0F;
    public final boolean A0G;
    public FragmentActivity activity;
    public IgdsListCell bannerTextCell;
    public IgFormField bioField;
    public IgdsListCell channelsTextCell;
    public IgdsListCell highlightsMigrationTextCell;
    public C252063oV interestRowViewStubHolder;
    public IgdsListCell linksTextCell;
    public C252063oV profileInterestRowStub;
    public IgFormField pronounsField;
    public C71662eb relatedAccountsStub;
    public View view;

    public EditProfileFieldsController(AnonymousClass07i r8, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        this.A0A = userSession;
        this.A08 = r8;
        this.A0G = z;
        FX1 A002 = FX1.A00(this, 12);
        this.A0F = A002;
        FX1 A003 = FX1.A00(this, 10);
        this.A0D = A003;
        FX1 A004 = FX1.A00(this, 9);
        this.A0C = A004;
        FX1 A005 = FX1.A00(this, 8);
        this.A0B = A005;
        FX1 A006 = FX1.A00(this, 11);
        this.A0E = A006;
        1Ng A007 = AnonymousClass1Nd.A00(userSession);
        A007.A01(A004, FWU.class);
        A007.A01(A002, C50268FVz.class);
        A007.A01(A005, C50278FWj.class);
        A007.A01(A003, C50267FVy.class);
        A007.A01(A006, C50274FWf.class);
    }

    public final void A0C(View view2, FragmentActivity fragmentActivity, AnonymousClass07Z r27, G8A g8a, User user, boolean z, boolean z2) {
        View view3 = view2;
        User user2 = user;
        DbW.A1O(view3, 1, user2);
        this.A00 = r27;
        this.A02 = g8a;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.activity = fragmentActivity2;
        this.view = view3;
        boolean z3 = z;
        this.A07 = z3;
        this.A06 = z2;
        UserSession userSession = this.A0A;
        0xG r10 = this.A09;
        C51763G0f g0f = new C51763G0f(this, 17);
        Context baseContext = fragmentActivity2.getBaseContext();
        0qQ.A07(baseContext);
        G4S g4s = new G4S(this, 16);
        boolean z4 = this.A0G;
        this.A05 = new EditProfileBarcelonaController(baseContext, r10, userSession, user2, g0f, g4s, z4);
        C51763G0f g0f2 = new C51763G0f(this, 18);
        Context baseContext2 = fragmentActivity2.getBaseContext();
        0qQ.A07(baseContext2);
        0sP g4s2 = new G4S(this, 17);
        EditProfileExpressionController editProfileExpressionController = new EditProfileExpressionController(baseContext2, userSession, new C19403WXw(4, fragmentActivity2, new C51763G0f(this, 19)), g0f2, g4s2, z3, z4);
        this.A03 = editProfileExpressionController;
        if (editProfileExpressionController.usernameField == null) {
            editProfileExpressionController.usernameField = DbT.A0d(view3, R.id.username);
            C49313Esw.A00 = new C46671Dj0(new C50678Fgd(editProfileExpressionController));
            IgFormField igFormField = editProfileExpressionController.usernameField;
            if (igFormField != null) {
                igFormField.setVisibility(DbW.A00(editProfileExpressionController.A04 ? 1 : 0));
            }
        }
        if (editProfileExpressionController.nameField == null) {
            IgFormField A0d = DbT.A0d(view3, R.id.full_name);
            editProfileExpressionController.nameField = A0d;
            if (!editProfileExpressionController.A03 && A0d != null) {
                A0d.setRuleChecker(new C50496Fci(AnonymousClass7TE.A16(editProfileExpressionController.A00, 2131972253)));
            }
        }
        IgFormField igFormField2 = (IgFormField) AnonymousClass7TF.A0F(view3, R.id.pronouns);
        0qQ.A0B(igFormField2, 0);
        this.pronounsField = igFormField2;
        igFormField2.setVisibility(DbW.A00(z4 ? 1 : 0));
        IgFormField igFormField3 = (IgFormField) AnonymousClass7TF.A0F(view3, R.id.bio);
        0qQ.A0B(igFormField3, 0);
        this.bioField = igFormField3;
        A07().setVisibility(0);
        if (!z2) {
            A07().setRuleChecker(new C50496Fci(AnonymousClass7TE.A16(A06(), 2131972253)));
        }
        A07().getMEditText().addTextChangedListener(AnonymousClass4v0.A00(userSession));
        IgdsListCell igdsListCell = (IgdsListCell) AnonymousClass7TF.A0F(view3, R.id.links_text_cell);
        0qQ.A0B(igdsListCell, 0);
        this.linksTextCell = igdsListCell;
        this.relatedAccountsStub = DbY.A0S(view3, R.id.related_accounts_stub);
        IgdsListCell igdsListCell2 = (IgdsListCell) AnonymousClass7TF.A0F(view3, R.id.channels_text_cell);
        0qQ.A0B(igdsListCell2, 0);
        this.channelsTextCell = igdsListCell2;
        IgdsListCell igdsListCell3 = (IgdsListCell) AnonymousClass7TF.A0F(view3, R.id.banner_text_cell);
        0qQ.A0B(igdsListCell3, 0);
        this.bannerTextCell = igdsListCell3;
        IgdsListCell igdsListCell4 = (IgdsListCell) AnonymousClass7TF.A0F(view3, R.id.highlight_management_row_stub);
        0qQ.A0B(igdsListCell4, 0);
        this.highlightsMigrationTextCell = igdsListCell4;
        this.interestRowViewStubHolder = DbV.A0T(view3, R.id.interest_row_stub, false);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36316345079435497L);
        C252063oV r0 = this.interestRowViewStubHolder;
        if (!A062) {
            if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
        } else if (r0 != null) {
            r0.setVisibility(0);
            C252063oV r02 = this.interestRowViewStubHolder;
            if (r02 != null) {
                this.profileInterestRowStub = DbV.A0T(r02.getView(), R.id.profile_interest_row_stub, false);
                return;
            }
        }
        0qQ.A0F("interestRowViewStubHolder");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        IgFormField igFormField;
        IgFormField igFormField2;
        0qQ.A0B(bundle, 0);
        EditProfileExpressionController editProfileExpressionController = this.A03;
        if (!(editProfileExpressionController == null || (igFormField2 = editProfileExpressionController.nameField) == null)) {
            bundle.putString("bundle_name_field", DbU.A0o(igFormField2));
        }
        EditProfileExpressionController editProfileExpressionController2 = this.A03;
        if (!(editProfileExpressionController2 == null || (igFormField = editProfileExpressionController2.usernameField) == null)) {
            bundle.putString("bundle_username_field", DbU.A0o(igFormField));
        }
        if (this.bioField != null) {
            bundle.putString("bundle_bio_field", DbU.A0o(A07()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r4.BcT().isEmpty() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r3 = r5.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316796051067529(0x8105ef00011289, double:3.0302262864705295E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0060
            X.4Cl r0 = X.DbV.A0k(r3)
            X.3Sk r4 = r0.BcS()
            r2 = 0
            if (r4 == 0) goto L_0x0025
            java.util.List r0 = r4.BcT()
            boolean r0 = r0.isEmpty()
            r3 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            com.instagram.igds.components.textcell.IgdsListCell r0 = r5.channelsTextCell
            if (r0 == 0) goto L_0x006d
            r0.setVisibility(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            r0 = 2131969918(0x7f13477e, float:1.9576772E38)
            if (r3 == 0) goto L_0x0039
            r0 = 2131969919(0x7f13477f, float:1.9576774E38)
        L_0x0039:
            r1.A06(r0)
            if (r3 == 0) goto L_0x0061
            if (r4 == 0) goto L_0x0068
            java.util.List r0 = r4.BcT()
            int r0 = r0.size()
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0050:
            r1.A0K(r0, r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r5.channelsTextCell
            if (r2 == 0) goto L_0x006d
            r1 = 5
            X.FOq r0 = new X.FOq
            r0.<init>((int) r1, (java.lang.Object) r5, (boolean) r3)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x0060:
            return
        L_0x0061:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.channelsTextCell
            if (r1 == 0) goto L_0x006d
            java.lang.String r0 = ""
            goto L_0x0050
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006d:
            java.lang.String r0 = "channelsTextCell"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A00():void");
    }

    private final void A01() {
        String str;
        int i;
        IgdsListCell igdsListCell;
        String str2;
        int i2;
        int i3;
        List list;
        List B8h;
        List BcT;
        IgdsListCell igdsListCell2 = this.bannerTextCell;
        if (igdsListCell2 != null) {
            igdsListCell2.setVisibility(0);
            User user = this.A04;
            if (user != null) {
                UserSession userSession = this.A0A;
                G8A g8a = this.A02;
                if (g8a == null) {
                    str = "dataProvider";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                AiStudioProfileBannerModel Aaa = g8a.Aaa();
                0qQ.A0B(userSession, 0);
                boolean A032 = C3249970q.A03(userSession, user);
                int i4 = 1;
                C242043Sk BcS = user.A03.BcS();
                if (BcS == null || (BcT = BcS.BcT()) == null) {
                    i2 = 0;
                } else {
                    i2 = BcT.size();
                }
                int i5 = (A032 ? 1 : 0) + i2;
                C253353qe AYk = user.A03.AYk();
                if (AYk == null || (B8h = AYk.B8h()) == null) {
                    i3 = 0;
                } else {
                    i3 = B8h.size();
                }
                int i6 = i5 + i3;
                AnonymousClass0eM A002 = AnonymousClass1YB.A00(new AnonymousClass9LD(userSession, 29));
                0sn CC1 = user.A03.CC1();
                if (CC1 == null) {
                    CC1 = 0sn.A00;
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (Object next : CC1) {
                    UpcomingEvent upcomingEvent = (UpcomingEvent) next;
                    0qQ.A0B(upcomingEvent, 0);
                    if (!(!C18810W3l.A0B(upcomingEvent)) || AnonymousClass7TF.A1Z(A002)) {
                        A1C.add(next);
                    }
                }
                int A012 = DbT.A01(A1C, i6) + (AnonymousClass7TF.A1V(user.A0F()) ? 1 : 0) + (C3250170s.A02(userSession, user) ? 1 : 0) + (C3250170s.A01(userSession, user) ? 1 : 0);
                if (!user.A1U() || 182.A06(0Tu.A05, userSession, 36317212663681896L) || (!AnonymousClass30D.A0A(userSession) && !AnonymousClass30D.A0H(userSession, user))) {
                    i4 = 0;
                }
                int i7 = A012 + i4 + (C3249970q.A02(userSession, user) ? 1 : 0);
                if (Aaa == null || (list = Aaa.A00) == null) {
                    list = 0sn.A00;
                }
                i = DbT.A01(list, i7) + (C3249970q.A04(userSession, user) ? 1 : 0);
            } else {
                i = 0;
            }
            IgdsListCell igdsListCell3 = this.bannerTextCell;
            if (igdsListCell3 != null) {
                AnonymousClass0fU.A00(new FNH(this, i, 3), igdsListCell3);
                IgdsListCell igdsListCell4 = this.bannerTextCell;
                if (i > 0) {
                    if (igdsListCell4 != null) {
                        igdsListCell4.A06(2131969971);
                        igdsListCell = this.bannerTextCell;
                        if (igdsListCell != null) {
                            str2 = String.valueOf(i);
                        }
                    }
                } else if (igdsListCell4 != null) {
                    igdsListCell4.A06(2131969967);
                    igdsListCell = this.bannerTextCell;
                    if (igdsListCell != null) {
                        str2 = "";
                    }
                }
                igdsListCell.A0K(str2, false);
                return;
            }
        }
        str = "bannerTextCell";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final void A02() {
        User user;
        UserSession userSession = this.A0A;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36329019528330982L) && (user = this.A04) != null && user.A1q()) {
            IgdsListCell igdsListCell = this.highlightsMigrationTextCell;
            if (igdsListCell != null) {
                igdsListCell.setVisibility(0);
                IgdsListCell igdsListCell2 = this.highlightsMigrationTextCell;
                if (igdsListCell2 != null) {
                    igdsListCell2.A06(2131969988);
                    IgdsListCell igdsListCell3 = this.highlightsMigrationTextCell;
                    if (igdsListCell3 != null) {
                        igdsListCell3.A0K("", false);
                        IgdsListCell igdsListCell4 = this.highlightsMigrationTextCell;
                        if (igdsListCell4 != null) {
                            FPD.A00(igdsListCell4, 60, this);
                            return;
                        }
                    }
                }
            }
            0qQ.A0F("highlightsMigrationTextCell");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r6 = this;
            X.F1D r3 = r6.A01
            android.view.View r2 = r6.view
            if (r2 == 0) goto L_0x00d9
            com.instagram.igds.components.textcell.IgdsListCell r1 = r6.A08()
            boolean r0 = r6.A0G
            r4 = 0
            int r0 = X.DbW.A00(r0)
            r1.setVisibility(r0)
            r0 = 2131432217(0x7f0b1319, float:1.8486185E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r2, r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.topMargin = r4
            if (r3 == 0) goto L_0x0115
            java.util.List r0 = r3.A0Q
            if (r0 == 0) goto L_0x0115
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            if (r1 == 0) goto L_0x0115
            com.instagram.common.session.UserSession r5 = r6.A0A
            X.0Tu r0 = X.0Tu.A05
            r2 = 36320120356937763(0x8108f500132023, double:3.032328590888771E-306)
            boolean r0 = X.182.A06(r0, r5, r2)
            if (r0 == 0) goto L_0x0045
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r1)
            X.G3o r0 = X.C51830G3o.A00
            X.018.A1A(r1, r0)
        L_0x0045:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0115
            com.instagram.igds.components.textcell.IgdsListCell r3 = r6.A08()
            androidx.fragment.app.FragmentActivity r2 = r6.A06()
            r0 = 2131965087(0x7f13349f, float:1.9566974E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            r3.A0I(r0)
            int r0 = r1.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r6.A08()
            r0.A0J(r1, r1, r4)
        L_0x006c:
            com.instagram.common.session.UserSession r3 = r6.A0A
            X.0xa r2 = X.AnonymousClass7TE.A0q(r3)
            java.lang.String r1 = "should_show_multiple_links_tooltip"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x00dd
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315078064475095(0x81045f00060bd7, double:3.0291398248316975E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00dd
            com.instagram.igds.components.textcell.IgdsListCell r3 = r6.A08()
            X.Fr5 r2 = new X.Fr5
            r2.<init>(r6)
            r0 = 100
            r3.postDelayed(r2, r0)
        L_0x0096:
            com.instagram.igds.components.textcell.IgdsListCell r1 = r6.A08()
            r0 = 61
            X.FPD.A00(r1, r0, r6)
            com.instagram.igds.components.form.IgFormField r0 = r6.A07()
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.bottomMargin = r4
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r6.A03
            if (r0 == 0) goto L_0x00b7
            com.instagram.igds.components.form.IgFormField r0 = r0.usernameField
            if (r0 == 0) goto L_0x00b7
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.bottomMargin = r4
        L_0x00b7:
            com.instagram.igds.components.form.IgFormField r0 = r6.pronounsField
            if (r0 == 0) goto L_0x00da
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.bottomMargin = r4
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r6.A03
            if (r0 == 0) goto L_0x00cf
            com.instagram.igds.components.form.IgFormField r0 = r0.nameField
            if (r0 == 0) goto L_0x00cf
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.bottomMargin = r4
        L_0x00cf:
            com.instagram.igds.components.form.IgFormField r0 = r6.A07()
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbX.A0G(r0)
            r0.bottomMargin = r4
        L_0x00d9:
            return
        L_0x00da:
            java.lang.String r0 = "pronounsField"
            goto L_0x00fe
        L_0x00dd:
            X.0qQ.A0B(r3, r4)
            java.lang.Boolean r0 = X.AnonymousClass35I.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0096
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342172144706797391(0x2081112800103f4f, double:4.073332003446965E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0096
            X.07Z r0 = r6.A00
            r3 = 0
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "hostViewLifecycleOwner"
        L_0x00fe:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0106:
            X.0xx r2 = X.DbW.A0E(r0)
            r1 = 10
            X.MGd r0 = new X.MGd
            r0.<init>((X.AnonymousClass4D7) r3, (java.lang.Object) r6, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            goto L_0x0096
        L_0x0115:
            com.instagram.igds.components.textcell.IgdsListCell r2 = r6.A08()
            androidx.fragment.app.FragmentActivity r1 = r6.A06()
            r0 = 2131970015(0x7f1347df, float:1.957697E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r2.A0I(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r6.A08()
            java.lang.String r0 = ""
            X.0qQ.A0B(r0, r4)
            r1.A0J(r0, r0, r4)
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A03():void");
    }

    public static final void A05(EditProfileFieldsController editProfileFieldsController) {
        User user;
        Boolean CSC;
        long j;
        TextView A0G2;
        String str;
        Long A10;
        View view2 = editProfileFieldsController.view;
        if (view2 != null && (user = editProfileFieldsController.A04) != null && (CSC = user.A03.CSC()) != null && CSC.booleanValue()) {
            UserSession userSession = editProfileFieldsController.A0A;
            0Tu A0J = DbS.A0J(userSession, 0);
            if (182.A06(A0J, userSession, 36322821891631577L)) {
                boolean z = editProfileFieldsController.A0G;
                C71662eb r0 = editProfileFieldsController.relatedAccountsStub;
                if (!z) {
                    if (r0 != null) {
                        r0.A03(0);
                        C71662eb r02 = editProfileFieldsController.relatedAccountsStub;
                        if (r02 != null) {
                            View A012 = r02.A01();
                            0qQ.A07(A012);
                            String A002 = AnonymousClass3ZA.A00(user);
                            0xG r6 = editProfileFieldsController.A09;
                            0qQ.A0B(r6, 2);
                            if (A002 == null || (A10 = AnonymousClass7TE.A10(A002)) == null) {
                                j = 0;
                            } else {
                                j = A10.longValue();
                            }
                            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_nme_benefits");
                            if (A0e.isSampled()) {
                                A0e.AAJ("event_type", "impression");
                                A0e.AAJ("benefit_type", "RELATED_ACCOUNTS");
                                A0e.AAJ("subject_type", "subscriber");
                                DbY.A1H(A0e, "button", j);
                                DbS.A1M(A0e, "ig_profile_edit_page");
                                A0e.Cgf();
                            }
                            String A042 = 182.A04(A0J, userSession, 36885771845370521L);
                            if (00l.A0W(A042) || A042.equals("None")) {
                                A042 = C273654mx.A00(1324);
                            }
                            DbX.A1E(A012, A042, R.id.contact_text);
                            int A043 = user.A04();
                            Boolean CXZ = user.A03.CXZ();
                            if (CXZ == null || !CXZ.booleanValue() || A043 <= 0) {
                                A0G2 = DbU.A0G(A012, R.id.contact_summary);
                                str = null;
                            } else {
                                A0G2 = DbU.A0G(A012, R.id.contact_summary);
                                str = String.valueOf(A043);
                            }
                            A0G2.setText(str);
                            DbT.A1F(view2, R.id.music_top_divider, 8);
                            FPH.A00(A012, user, editProfileFieldsController, view2, 41);
                            return;
                        }
                    }
                } else if (r0 != null) {
                    r0.A03(8);
                    return;
                }
                0qQ.A0F("relatedAccountsStub");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public final FragmentActivity A06() {
        FragmentActivity fragmentActivity = this.activity;
        if (fragmentActivity != null) {
            return fragmentActivity;
        }
        0qQ.A0F("activity");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgFormField A07() {
        IgFormField igFormField = this.bioField;
        if (igFormField != null) {
            return igFormField;
        }
        0qQ.A0F("bioField");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgdsListCell A08() {
        IgdsListCell igdsListCell = this.linksTextCell;
        if (igdsListCell != null) {
            return igdsListCell;
        }
        0qQ.A0F("linksTextCell");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09() {
        F1D f1d;
        String str;
        boolean z;
        View view2;
        if (this.view != null && (f1d = this.A01) != null) {
            C253493qs r7 = f1d.A04;
            if (r7 != null) {
                G8A g8a = this.A02;
                str = "dataProvider";
                if (g8a != null) {
                    g8a.Bgm().setEnabled(false);
                    SpannableStringBuilder A0C2 = DbS.A0C(r7.A00);
                    C318726pQ.A01(A06(), A0C2, this.A0A, (C318716pP) null, r7.A01);
                    A07().setText(A0C2);
                    G8A g8a2 = this.A02;
                    if (g8a2 != null) {
                        z = true;
                        g8a2.Bgm().setEnabled(true);
                        A07().getMEditText().setFocusableInTouchMode(false);
                        FPD.A00(A07().getMEditText(), 59, this);
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            G8A g8a3 = this.A02;
            str = "dataProvider";
            if (g8a3 != null) {
                g8a3.Bgm().setEnabled(false);
                IgFormField A072 = A07();
                String str2 = f1d.A0A;
                0qQ.A07(str2);
                A072.setText(str2);
                G8A g8a4 = this.A02;
                if (g8a4 != null) {
                    z = true;
                    g8a4.Bgm().setEnabled(true);
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
            if (AnonymousClass7TE.A0q(this.A0A).getBoolean("should_show_bio_linking_tooltip", z) && (view2 = this.view) != null) {
                view2.postDelayed(new C51249Fr4(this), 100);
            }
        }
    }

    public final void A0A() {
        CharSequence charSequence;
        IgFormField igFormField;
        IgFormField igFormField2;
        F1D f1d = this.A01;
        if (f1d != null) {
            EditProfileExpressionController editProfileExpressionController = this.A03;
            CharSequence charSequence2 = null;
            if (editProfileExpressionController == null || (igFormField2 = editProfileExpressionController.nameField) == null) {
                charSequence = null;
            } else {
                charSequence = igFormField2.getText();
            }
            f1d.A0F = String.valueOf(charSequence);
            EditProfileExpressionController editProfileExpressionController2 = this.A03;
            if (!(editProfileExpressionController2 == null || (igFormField = editProfileExpressionController2.usernameField) == null)) {
                charSequence2 = igFormField.getText();
            }
            f1d.A0O = String.valueOf(charSequence2);
            f1d.A0A = DbU.A0o(A07());
        }
    }

    public final void A0B(Bundle bundle, F1D f1d, User user) {
        IgFormField igFormField;
        String str;
        IgFormField igFormField2;
        String str2;
        IgFormField igFormField3;
        long j;
        C252063oV r5;
        List list;
        IgFormField igFormField4;
        IgFormField igFormField5;
        IgFormField igFormField6;
        IgFormField igFormField7;
        EditProfileExpressionController editProfileExpressionController;
        IgFormField igFormField8;
        EditProfileExpressionController editProfileExpressionController2;
        IgFormField igFormField9;
        F1D f1d2 = f1d;
        if (f1d != null) {
            this.A01 = f1d2;
            User user2 = user;
            if (user != null) {
                this.A04 = user2;
                Bundle bundle2 = bundle;
                if (bundle != null) {
                    String string = bundle2.getString("bundle_name_field");
                    if (!(string == null || (editProfileExpressionController2 = this.A03) == null || (igFormField9 = editProfileExpressionController2.nameField) == null)) {
                        igFormField9.setText(string);
                    }
                    String string2 = bundle2.getString("bundle_username_field");
                    if (!(string2 == null || (editProfileExpressionController = this.A03) == null || (igFormField8 = editProfileExpressionController.usernameField) == null)) {
                        igFormField8.setText(string2);
                    }
                    String string3 = bundle2.getString("bundle_bio_field");
                    if (string3 != null) {
                        A07().setText(string3);
                    }
                } else {
                    EditProfileExpressionController editProfileExpressionController3 = this.A03;
                    if (!(editProfileExpressionController3 == null || (igFormField2 = editProfileExpressionController3.nameField) == null)) {
                        String str3 = f1d2.A0F;
                        0qQ.A07(str3);
                        igFormField2.setText(str3);
                    }
                    EditProfileExpressionController editProfileExpressionController4 = this.A03;
                    if (!(editProfileExpressionController4 == null || (igFormField = editProfileExpressionController4.usernameField) == null)) {
                        F1D f1d3 = this.A01;
                        if (f1d3 == null || (str = f1d3.A0O) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        igFormField.setText(str);
                    }
                }
                G8A g8a = this.A02;
                String str4 = "dataProvider";
                if (g8a != null) {
                    if (g8a.CRf()) {
                        EditProfileExpressionController editProfileExpressionController5 = this.A03;
                        if (!(editProfileExpressionController5 == null || (igFormField7 = editProfileExpressionController5.nameField) == null)) {
                            igFormField7.getMEditText().setFocusableInTouchMode(false);
                        }
                        EditProfileExpressionController editProfileExpressionController6 = this.A03;
                        if (!(editProfileExpressionController6 == null || (igFormField6 = editProfileExpressionController6.nameField) == null)) {
                            EditText mEditText = igFormField6.getMEditText();
                            G8A g8a2 = this.A02;
                            if (g8a2 != null) {
                                AnonymousClass0fU.A00(g8a2.B8P(), mEditText);
                            }
                        }
                    }
                    G8A g8a3 = this.A02;
                    if (g8a3 != null) {
                        if (g8a3.CRi()) {
                            EditProfileExpressionController editProfileExpressionController7 = this.A03;
                            if (!(editProfileExpressionController7 == null || (igFormField5 = editProfileExpressionController7.usernameField) == null)) {
                                igFormField5.getMEditText().setFocusableInTouchMode(false);
                            }
                            EditProfileExpressionController editProfileExpressionController8 = this.A03;
                            if (!(editProfileExpressionController8 == null || (igFormField4 = editProfileExpressionController8.usernameField) == null)) {
                                EditText mEditText2 = igFormField4.getMEditText();
                                G8A g8a4 = this.A02;
                                if (g8a4 != null) {
                                    AnonymousClass0fU.A00(g8a4.CD3(), mEditText2);
                                }
                            }
                        }
                        A09();
                        F1D f1d4 = this.A01;
                        if (f1d4 == null || (list = f1d4.A0R) == null || (str2 = TextUtils.join("/", list)) == null) {
                            str2 = "";
                        }
                        IgFormField igFormField10 = this.pronounsField;
                        if (igFormField10 != null) {
                            igFormField10.setText(str2);
                            IgFormField igFormField11 = this.pronounsField;
                            if (igFormField11 != null) {
                                igFormField11.getMEditText().setFocusable(false);
                                IgFormField igFormField12 = this.pronounsField;
                                if (igFormField12 != null) {
                                    FPD.A00(igFormField12.getMEditText(), 62, this);
                                    A03();
                                    A05(this);
                                    A00();
                                    A01();
                                    A02();
                                    View view2 = this.view;
                                    if (view2 != null) {
                                        EditProfileBarcelonaController editProfileBarcelonaController = this.A05;
                                        if (editProfileBarcelonaController == null) {
                                            str4 = "editProfileBarcelonaController";
                                        } else if (editProfileBarcelonaController.toggleBarcelonaViewStubber == null) {
                                            editProfileBarcelonaController.toggleBarcelonaViewStubber = DbV.A0T(view2, R.id.toggle_barcelona_stub, false);
                                            if (!editProfileBarcelonaController.A07) {
                                                UserSession userSession = editProfileBarcelonaController.A03;
                                                if (C319886rO.A05(userSession)) {
                                                    boolean A002 = C324536zU.A00(userSession);
                                                    C252063oV r0 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                                    if (r0 != null) {
                                                        r0.setVisibility(0);
                                                        C252063oV r02 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                                        if (r02 != null) {
                                                            IgdsListCell igdsListCell = (IgdsListCell) r02.getView().requireViewById(R.id.toggle_barcelona_switch_cell);
                                                            igdsListCell.A0I(DbY.A0c(editProfileBarcelonaController.A01, C319886rO.A00(userSession), 2131975441));
                                                            igdsListCell.setTextCellType(C69349Njo.TYPE_SWITCH);
                                                            igdsListCell.setChecked(editProfileBarcelonaController.A04.A1i());
                                                            igdsListCell.setEnabled(true);
                                                            igdsListCell.setVisibility(0);
                                                            float f = 1.0f;
                                                            if (A002) {
                                                                f = 0.3f;
                                                            }
                                                            igdsListCell.setAlpha(f);
                                                            editProfileBarcelonaController.toggleBarcelonaSwitchCell = igdsListCell;
                                                            igdsListCell.A0E(new FdL(editProfileBarcelonaController, A002));
                                                        }
                                                    }
                                                    str4 = "toggleBarcelonaViewStubber";
                                                }
                                            }
                                            C252063oV r1 = editProfileBarcelonaController.toggleBarcelonaViewStubber;
                                            if (r1 != null) {
                                                r1.setVisibility(8);
                                            }
                                            str4 = "toggleBarcelonaViewStubber";
                                        }
                                    }
                                    UserSession userSession2 = this.A0A;
                                    if (182.A06(0Tu.A05, userSession2, 36316345079435497L)) {
                                        List A0S = user2.A0S();
                                        if (A0S != null) {
                                            j = (long) A0S.size();
                                        } else {
                                            j = 0;
                                        }
                                        1Ln r4 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A09, userSession2), "ig_bio_interests_profile_events"), 192);
                                        View view3 = this.view;
                                        if (!(view3 == null || view3.getContext() == null || (r5 = this.profileInterestRowStub) == null || r5.CVM())) {
                                            0qQ.A0A(r4);
                                            A04(r4, this, "unit_impression", j);
                                            r5.setVisibility(0);
                                            List A0S2 = user2.A0S();
                                            C49910FEi.A00.A01(A06(), (RecyclerView) r5.getView(), userSession2, new FdX(r4, this, j), AnonymousClass05K.A01, A0S2, true, false);
                                        }
                                        C252063oV r2 = this.interestRowViewStubHolder;
                                        if (r2 != null) {
                                            AnonymousClass0fU.A00(new FNP(r4, this, j), r2.getView());
                                        } else {
                                            str4 = "interestRowViewStubHolder";
                                        }
                                    }
                                    if (C324536zU.A00(userSession2)) {
                                        EditProfileExpressionController editProfileExpressionController9 = this.A03;
                                        IgFormField igFormField13 = null;
                                        if (editProfileExpressionController9 != null) {
                                            igFormField13 = editProfileExpressionController9.nameField;
                                        }
                                        if (igFormField13 != null) {
                                            igFormField13.setAlpha(0.3f);
                                        }
                                        EditProfileExpressionController editProfileExpressionController10 = this.A03;
                                        if (!(editProfileExpressionController10 == null || (igFormField3 = editProfileExpressionController10.usernameField) == null)) {
                                            igFormField3.setAlpha(0.3f);
                                        }
                                        IgFormField igFormField14 = this.pronounsField;
                                        if (igFormField14 != null) {
                                            igFormField14.setAlpha(0.3f);
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                        str4 = "pronounsField";
                    }
                }
                0qQ.A0F(str4);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r0.getText().length() <= 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.getText().length() <= 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D() {
        /*
            r3 = this;
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L_0x0014
            com.instagram.igds.components.form.IgFormField r0 = r0.usernameField
            if (r0 == 0) goto L_0x0014
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            r1 = 1
            if (r0 > 0) goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x002f
            if (r1 == 0) goto L_0x002e
            com.instagram.profile.edit.controller.editcontrollerexpression.EditProfileExpressionController r0 = r3.A03
            if (r0 == 0) goto L_0x002e
            com.instagram.igds.components.form.IgFormField r0 = r0.nameField
            if (r0 == 0) goto L_0x002e
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            r1 = 1
            if (r0 > 0) goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0046
            if (r1 == 0) goto L_0x0044
            com.instagram.igds.components.form.IgFormField r0 = r3.A07()
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0044
            return r2
        L_0x0044:
            r2 = 0
            return r2
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.profile.edit.controller.EditProfileFieldsController.A0D():boolean");
    }

    public final void onDestroy() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A0A);
        A002.A02(this.A0C, FWU.class);
        A002.A02(this.A0F, C50268FVz.class);
        A002.A02(this.A0B, C50278FWj.class);
        A002.A02(this.A0D, C50267FVy.class);
        A002.A02(this.A0E, C50274FWf.class);
    }

    public final void onPause() {
        IgFormField igFormField;
        IgFormField igFormField2;
        EditProfileExpressionController editProfileExpressionController = this.A03;
        if (!(editProfileExpressionController == null || (igFormField2 = editProfileExpressionController.nameField) == null)) {
            G8A g8a = this.A02;
            if (g8a != null) {
                DbU.A1E(g8a.Bgm(), igFormField2);
            }
            0qQ.A0F("dataProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        EditProfileExpressionController editProfileExpressionController2 = this.A03;
        if (!(editProfileExpressionController2 == null || (igFormField = editProfileExpressionController2.usernameField) == null)) {
            G8A g8a2 = this.A02;
            if (g8a2 != null) {
                DbU.A1E(g8a2.Bgm(), igFormField);
            }
            0qQ.A0F("dataProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        EditText mEditText = A07().getMEditText();
        G8A g8a3 = this.A02;
        if (g8a3 != null) {
            mEditText.removeTextChangedListener(g8a3.Bgm());
            return;
        }
        0qQ.A0F("dataProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onResume() {
        IgFormField igFormField;
        IgFormField igFormField2;
        IgFormField igFormField3;
        IgFormField igFormField4;
        User user = this.A04;
        if (user != null) {
            String username = user.getUsername();
            EditProfileExpressionController editProfileExpressionController = this.A03;
            if (!(editProfileExpressionController == null || (igFormField4 = editProfileExpressionController.usernameField) == null)) {
                igFormField4.setText(username);
            }
            String fullName = user.getFullName();
            if (fullName != null) {
                EditProfileExpressionController editProfileExpressionController2 = this.A03;
                if (!(editProfileExpressionController2 == null || (igFormField3 = editProfileExpressionController2.nameField) == null)) {
                    igFormField3.setText(fullName);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        A09();
        A03();
        A05(this);
        A00();
        A01();
        A02();
        EditProfileExpressionController editProfileExpressionController3 = this.A03;
        if (!(editProfileExpressionController3 == null || (igFormField2 = editProfileExpressionController3.nameField) == null)) {
            G8A g8a = this.A02;
            if (g8a != null) {
                igFormField2.A0G(g8a.Bgm());
            }
            0qQ.A0F("dataProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        EditProfileExpressionController editProfileExpressionController4 = this.A03;
        if (!(editProfileExpressionController4 == null || (igFormField = editProfileExpressionController4.usernameField) == null)) {
            G8A g8a2 = this.A02;
            if (g8a2 != null) {
                igFormField.A0G(g8a2.Bgm());
            }
            0qQ.A0F("dataProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        EditText mEditText = A07().getMEditText();
        G8A g8a3 = this.A02;
        if (g8a3 != null) {
            mEditText.addTextChangedListener(g8a3.Bgm());
            return;
        }
        0qQ.A0F("dataProvider");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(1Ln r3, EditProfileFieldsController editProfileFieldsController, String str, long j) {
        String A0k = DbS.A0k();
        if (A0k != null) {
            r3.A0Q("viewer_id", DbV.A0q(editProfileFieldsController.A0A.A06));
            r3.A0R("container_module", "edit_profile");
            r3.A0R("action_type", str);
            r3.A0R("nav_chain", A0k);
            r3.A0Q("num_selected_bio_interests", Long.valueOf(j));
            r3.Cgf();
        }
    }

    public final void onDestroyView() {
        IgFormField igFormField;
        A0A();
        EditProfileExpressionController editProfileExpressionController = this.A03;
        if (!(editProfileExpressionController == null || (igFormField = editProfileExpressionController.usernameField) == null)) {
            igFormField.setRuleChecker((X4E) null);
        }
        DbU.A1E(AnonymousClass4v0.A00(this.A0A), A07());
        EditProfileFieldsControllerLifecycleUtil.cleanupReferences(this);
    }
}
