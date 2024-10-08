package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class E4V extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ChannelConfigureFragment";
    public IgTextView A00;
    public IgdsListCell A01;
    public IgdsListCell A02;
    public IgdsListCell A03;
    public IgdsListCell A04;
    public IgdsListCell A05;
    public IgdsListCell A06;
    public User A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G = C227642jf.A02(this);
    public final AnonymousClass0eM A0H;
    public final View.OnClickListener A0I = FPI.A00(this, 40);
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;

    public final void configureActionBar(2da r6) {
        C266444Yx r0;
        int i;
        0qQ.A0B(r6, 0);
        r6.Eu4(true);
        r6.setTitle("");
        DbX.A1A(FPI.A00(this, 39), DbV.A0K(), r6);
        C46732DkL A002 = A00(this);
        if (A002 instanceof C47821EIt) {
            C47821EIt eIt = (C47821EIt) A002;
            if (C46732DkL.A00(eIt) != 2 || eIt.A08) {
                i = 2131959305;
            } else {
                C50338FYv fYv = eIt.A04;
                1Ln A003 = C50338FYv.A00(fYv);
                if (DbT.A1Y(A003)) {
                    C50338FYv.A04(A003, fYv);
                    A003.A0l("direct_invite_enter");
                    A003.A0k("impression");
                    A003.A0p("direct_invite_next_button");
                    C50338FYv.A05(A003, fYv, "chat_setup");
                    A003.Cgf();
                }
                i = 2131959310;
            }
            r0 = DbS.A0Q(new Object[0], i);
        } else {
            r0 = ((C47820EIs) A002).A02;
        }
        String A0Y = Dba.A0Y(this, r0);
        if (0qQ.A0K(A00(this).A0H.getValue(), C61889KQe.A00)) {
            r6.ART(true);
            r6.setIsLoading(true);
        } else if (this.A08) {
            r6.setIsLoading(false);
            r6.AA8(A0Y, this.A0I);
            return;
        } else {
            r6.setIsLoading(false);
        }
        r6.AA7(A0Y);
    }

    public final String getModuleName() {
        return "direct_interest_based_configure";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b0, code lost:
        if (r0.BcT().size() < 5) goto L_0x02b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x04cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r33, android.os.Bundle r34) {
        /*
            r32 = this;
            r12 = 0
            r9 = r33
            X.0qQ.A0B(r9, r12)
            r5 = r32
            r0 = r34
            super.onViewCreated(r9, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r0, r1)
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            X.2dZ r0 = r0.AYJ()
            r13 = 1
            if (r0 == 0) goto L_0x0022
            r0.Etr(r13)
        L_0x0022:
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.0qQ.A0C(r0, r1)
            com.instagram.base.activity.BaseFragmentActivity r0 = (com.instagram.base.activity.BaseFragmentActivity) r0
            r0.A0a()
            r0 = 2131440747(0x7f0b346b, float:1.8503486E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r9, r0)
            r0 = 2131429813(0x7f0b09b5, float:1.848131E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.common.ui.base.IgEditText r6 = (com.instagram.common.ui.base.IgEditText) r6
            r0 = 2131429792(0x7f0b09a0, float:1.8481267E38)
            android.view.View r30 = X.AnonymousClass7TF.A0G(r9, r0)
            r0 = 2131429791(0x7f0b099f, float:1.8481265E38)
            android.widget.TextView r29 = X.AnonymousClass7TG.A0R(r9, r0)
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 != 0) goto L_0x0063
            X.EIs r1 = (X.C47820EIs) r1
            int r1 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0063
            r0 = r29
            r0.setText(r1)
        L_0x0063:
            r0 = 2131440716(0x7f0b344c, float:1.8503423E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r5.A04 = r0
            r0 = 2131428052(0x7f0b02d4, float:1.8477738E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r5.A01 = r1
            java.lang.String r0 = "audienceAnyoneButton"
            if (r1 == 0) goto L_0x05ed
            X.Njo r2 = X.C69349Njo.TYPE_RADIO
            r1.setTextCellType(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A01
            if (r1 == 0) goto L_0x05ed
            r11 = 2
            X.FPz r0 = new X.FPz
            r0.<init>(r12, r11, r5)
            r1.A0D(r0)
            r0 = 2131433058(0x7f0b1662, float:1.848789E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r5.A03 = r0
            java.lang.String r3 = "followerRadioButton"
            if (r0 == 0) goto L_0x05e9
            r0.setTextCellType(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A03
            if (r1 == 0) goto L_0x05e9
            X.FPz r0 = new X.FPz
            r0.<init>(r13, r11, r5)
            r1.A0D(r0)
            r0 = 2131442039(0x7f0b3977, float:1.8506107E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r5.A05 = r0
            java.lang.String r3 = "subscriberRadioButton"
            if (r0 == 0) goto L_0x05e9
            r0.setTextCellType(r2)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A05
            if (r1 == 0) goto L_0x05e9
            X.FPz r0 = new X.FPz
            r0.<init>(r11, r11, r5)
            r1.A0D(r0)
            X.0eE r28 = X.AnonymousClass0t1.A01
            X.0eM r0 = r5.A0G
            r31 = r0
            r1 = r28
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            r5.A07 = r0
            r0 = 2131435445(0x7f0b1fb5, float:1.8492732E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r5.A00 = r0
            r0 = 2131430390(0x7f0b0bf6, float:1.848248E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            r5.A02 = r1
            java.lang.String r0 = "collectibleOwnersButton"
            if (r1 == 0) goto L_0x05ed
            r1.setTextCellType(r2)
            com.instagram.igds.components.textcell.IgdsListCell r2 = r5.A02
            if (r2 == 0) goto L_0x05ed
            r27 = 4
            X.FPz r1 = new X.FPz
            r0 = r27
            r1.<init>(r0, r11, r5)
            r2.A0D(r1)
            r0 = 2131442833(0x7f0b3c91, float:1.8507717E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r0 = (com.instagram.igds.components.textcell.IgdsListCell) r0
            r5.A06 = r0
            r0 = 2131437359(0x7f0b272f, float:1.8496614E38)
            android.view.View r26 = X.AnonymousClass7TF.A0F(r9, r0)
            r0 = 2131437685(0x7f0b2875, float:1.8497276E38)
            android.view.View r10 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.textcell.IgdsListCell r10 = (com.instagram.igds.components.textcell.IgdsListCell) r10
            r0 = 2131437686(0x7f0b2876, float:1.8497278E38)
            android.view.View r25 = X.AnonymousClass7TF.A0G(r9, r0)
            r0 = 2131437695(0x7f0b287f, float:1.8497296E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            r0 = 2131437696(0x7f0b2880, float:1.8497298E38)
            com.instagram.common.ui.base.IgTextView r24 = X.DbX.A0Z(r9, r0)
            r0 = 2131439914(0x7f0b312a, float:1.8501797E38)
            android.view.View r7 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.textcell.IgdsListCell r7 = (com.instagram.igds.components.textcell.IgdsListCell) r7
            r0 = 2131439915(0x7f0b312b, float:1.8501799E38)
            com.instagram.common.ui.base.IgTextView r23 = X.DbX.A0Z(r9, r0)
            r0 = 2131429531(0x7f0b089b, float:1.8480737E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.textcell.IgdsListCell r3 = (com.instagram.igds.components.textcell.IgdsListCell) r3
            r0 = 2131429532(0x7f0b089c, float:1.848074E38)
            android.widget.TextView r22 = X.AnonymousClass7TG.A0R(r9, r0)
            r0 = 2131429790(0x7f0b099e, float:1.8481263E38)
            android.view.ViewGroup r21 = X.DbX.A0I(r9, r0)
            r0 = 2131429846(0x7f0b09d6, float:1.8481376E38)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r1 = X.DbX.A0j(r9, r0)
            r0 = 2131430931(0x7f0b0e13, float:1.8483577E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r2 = (com.instagram.ui.widget.progressbutton.ProgressButton) r2
            r0 = 41
            X.FPI.A01(r2, r0, r5)
            r20 = 3
            X.LYj r14 = new X.LYj
            r0 = r20
            r14.<init>(r0, r6, r9, r5)
            r8.setOnTouchListener(r14)
            X.DkL r0 = A00(r5)
            boolean r0 = r0 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x05bb
            r0 = 2131959373(0x7f131e4d, float:1.9555385E38)
        L_0x0189:
            r2.setText((int) r0)
            r0 = -1
            r2.setTextColor(r0)
            X.EV0 r0 = A01(r5)
            X.EV0 r9 = X.EV0.Broadcast
            r8 = 8
            if (r0 != r9) goto L_0x019d
            r2.setVisibility(r8)
        L_0x019d:
            X.Fq6 r0 = new X.Fq6
            r0.<init>(r6)
            r6.post(r0)
            r0 = r20
            X.FKk.A00(r6, r5, r0)
            X.FPO r0 = new X.FPO
            r0.<init>(r12, r6, r5)
            r6.setOnKeyListener(r0)
            r19 = 6
            r0 = r19
            r6.setImeOptions(r0)
            X.DkL r0 = A00(r5)
            boolean r0 = r0 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x05b6
            r0 = 2131959372(0x7f131e4c, float:1.9555383E38)
        L_0x01c4:
            r6.setHint(r0)
            com.instagram.user.model.User r0 = r5.A07
            r18 = 0
            if (r0 == 0) goto L_0x05f1
            com.instagram.common.typedurl.ImageUrl r14 = r0.A0D()
            r0 = r18
            r1.A0F(r0, r5, r14)
            r1.setGradientSpinnerVisible(r12)
            X.EV0 r0 = A01(r5)
            if (r0 != r9) goto L_0x0220
            X.0lg r1 = X.DbT.A0X(r31)
            X.0Tu r0 = X.0Tu.A05
            r16 = 36315868341800578(0x81051700390e82, double:3.029639599394524E-306)
            r15 = r0
            r14 = r1
            r0 = r16
            boolean r0 = X.182.A06(r15, r14, r0)
            if (r0 == 0) goto L_0x0220
            android.content.Context r0 = r5.requireContext()
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r14 = new com.instagram.igds.components.peoplecell.IgdsPeopleCell
            r14.<init>((android.content.Context) r0, (boolean) r13)
            r14.setPadding(r12, r12, r12, r12)
            com.instagram.user.model.User r1 = r5.A07
            if (r1 == 0) goto L_0x05f1
            r31.getValue()
            r0 = r18
            r14.A02(r0, r1)
            r0 = r21
            r0.addView(r14)
            r0 = r30
            r0.setVisibility(r12)
            r0 = r21
            r0.setVisibility(r12)
            r0 = r29
            r0.setVisibility(r12)
        L_0x0220:
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x05b0
            X.EIt r1 = (X.C47821EIt) r1
            boolean r0 = r1.A09
        L_0x022c:
            int r1 = X.DbW.A01(r0)
            r0 = r26
            r0.setVisibility(r1)
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 != 0) goto L_0x0288
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0288
            X.Njo r14 = X.C69349Njo.TYPE_SWITCH
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x05aa
            r0 = 0
        L_0x024e:
            r10.A0G(r14, r0)
            r0 = 2131959317(0x7f131e15, float:1.9555271E38)
            X.Dba.A14(r5, r10, r0)
            r1 = 0
            r10.setVisibility(r12)
            X.FQ1 r14 = new X.FQ1
            r0 = r19
            r14.<init>(r0, r10, r5)
            r10.A0D(r14)
            X.DkL r14 = A00(r5)
            boolean r0 = r14 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x05a4
            r0 = 0
        L_0x026e:
            r10.setChecked(r0)
            X.DkL r10 = A00(r5)
            boolean r0 = r10 instanceof X.C47821EIt
            if (r0 != 0) goto L_0x0283
            X.EIs r10 = (X.C47820EIs) r10
            boolean r0 = r10.A06
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0283
            r1 = 8
        L_0x0283:
            r0 = r25
            r0.setVisibility(r1)
        L_0x0288:
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x059e
            X.EIt r1 = (X.C47821EIt) r1
            boolean r0 = r1.A0A
        L_0x0294:
            if (r0 == 0) goto L_0x02e2
            r1 = r28
            r0 = r31
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            X.4Cl r0 = r0.A03
            X.3Sk r0 = r0.BcS()
            if (r0 == 0) goto L_0x02b2
            java.util.List r0 = r0.BcT()
            int r1 = r0.size()
            r0 = 5
            r14 = 1
            if (r1 >= r0) goto L_0x02b3
        L_0x02b2:
            r14 = 0
        L_0x02b3:
            X.Njo r1 = X.C69349Njo.TYPE_SWITCH
            r0 = r14 ^ 1
            r4.A0G(r1, r0)
            r0 = 2131959319(0x7f131e17, float:1.9555275E38)
            X.Dba.A14(r5, r4, r0)
            r4.setVisibility(r12)
            X.FQP r10 = new X.FQP
            r1 = r24
            r0 = r27
            r10.<init>((com.instagram.common.ui.base.IgTextView) r1, (X.E4V) r5, (com.instagram.igds.components.textcell.IgdsListCell) r4, (int) r0)
            r4.A0D(r10)
            if (r14 == 0) goto L_0x0596
            r1 = 2131959375(0x7f131e4f, float:1.9555389E38)
            r0 = r24
            X.DbU.A1G(r0, r5, r1)
            r0.setVisibility(r12)
            r4.setChecked(r12)
            r4.setEnabled(r12)
        L_0x02e2:
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x058c
            X.EIt r1 = (X.C47821EIt) r1
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x058c
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r7.A0G(r0, r13)
            r0 = 2131958580(0x7f131b34, float:1.9553776E38)
            X.Dba.A14(r5, r7, r0)
            r7.setVisibility(r12)
            r10 = 5
            X.FQP r1 = new X.FQP
            r0 = r23
            r1.<init>((com.instagram.common.ui.base.IgTextView) r0, (X.E4V) r5, (com.instagram.igds.components.textcell.IgdsListCell) r7, (int) r10)
            r7.A0D(r1)
        L_0x0309:
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x0586
            r0 = 0
        L_0x0312:
            r7 = 8
            int r0 = X.DbW.A01(r0)
            r3.setVisibility(r0)
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 != 0) goto L_0x032a
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x032a
            r7 = 0
        L_0x032a:
            r0 = r22
            r0.setVisibility(r7)
            X.DkL r1 = A00(r5)
            boolean r0 = r1 instanceof X.C47821EIt
            if (r0 != 0) goto L_0x0363
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0363
            X.DkL r1 = A00(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1.A01 = r0
            X.Njo r0 = X.C69349Njo.TYPE_SWITCH
            r3.A0G(r0, r13)
            r3.setChecked(r12)
            r0 = 2131959335(0x7f131e27, float:1.9555308E38)
            X.Dba.A14(r5, r3, r0)
            r1 = 2131959329(0x7f131e21, float:1.9555295E38)
            r0 = r22
            r0.setText(r1)
            r3.setVisibility(r12)
            X.FdS.A00(r3, r5, r8)
        L_0x0363:
            X.Etj r7 = new X.Etj
            r7.<init>(r5)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A06
            java.lang.String r10 = "timeboundCell"
            if (r1 == 0) goto L_0x05f3
            r0 = 2131959353(0x7f131e39, float:1.9555344E38)
            X.Dba.A14(r5, r1, r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A06
            if (r1 == 0) goto L_0x05f3
            X.DkL r0 = A00(r5)
            X.0Ud r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            X.EWM r0 = (X.EWM) r0
            int r0 = r0.A01
            java.lang.String r0 = X.DbU.A0m(r5, r0)
            r1.A0K(r0, r12)
            com.instagram.igds.components.textcell.IgdsListCell r1 = r5.A06
            if (r1 == 0) goto L_0x05f3
            r0 = 47
            X.FPE.A01(r1, r0, r7, r5)
            X.DkL r0 = A00(r5)
            X.0Ud r0 = r0.A0G
            X.19B r7 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r14 = X.C226292g8.A00(r7, r0)
            X.07Z r10 = r5.getViewLifecycleOwner()
            r1 = 22
            X.PqQ r0 = new X.PqQ
            r0.<init>(r5, r1)
            r13 = 42
            X.Dba.A15(r10, r14, r0, r13)
            X.DkL r0 = A00(r5)
            X.05G r0 = r0.A0E
            androidx.lifecycle.CoroutineLiveData r10 = X.C226292g8.A00(r7, r0)
            X.07Z r1 = r5.getViewLifecycleOwner()
            X.PqX r0 = new X.PqX
            r0.<init>((int) r13, (java.lang.Object) r2, (java.lang.Object) r5)
            X.Dba.A15(r1, r10, r0, r13)
            X.EV0 r0 = A01(r5)
            java.lang.String r10 = "Required value was null."
            java.lang.String r1 = "interest_based_channel_entry_point"
            if (r0 != r9) goto L_0x04f8
            X.0eM r0 = r5.A0F
            X.6gx r9 = X.DbZ.A0R(r0)
            X.0eM r0 = r5.A0A
            java.lang.Object r8 = r0.getValue()
            com.instagram.direct.channels.analytics.ChannelCreationSource r8 = (com.instagram.direct.channels.analytics.ChannelCreationSource) r8
            X.0eM r0 = r5.A0B
            boolean r16 = X.AnonymousClass7TF.A1Z(r0)
            android.os.Bundle r0 = r5.mArguments
            if (r0 == 0) goto L_0x05df
            java.lang.String r13 = r0.getString(r1)
            if (r13 == 0) goto L_0x05df
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "interest_based_channel_implicit_audience_type"
            int r1 = r1.getInt(r0)
            X.0qQ.A0B(r8, r12)
            X.1Ln r10 = X.DbT.A0J(r9)
            java.lang.String r0 = "broadcast_chat_setup"
            boolean r15 = r0.equals(r13)
            int r12 = r8.ordinal()
            if (r12 == r11) goto L_0x04f4
            r0 = r20
            if (r12 == r0) goto L_0x04f0
            r12 = 0
        L_0x0412:
            boolean r0 = X.DbT.A1Y(r10)
            if (r0 == 0) goto L_0x0455
            X.DbW.A17(r10, r9)
            java.lang.String r0 = "chat_setup_sheet_rendered"
            X.DbV.A1M(r10, r0)
            com.instagram.direct.channels.analytics.ChannelCreationSource r11 = com.instagram.direct.channels.analytics.ChannelCreationSource.MIMICRY_UPSELL
            java.lang.String r13 = "create_channel_view"
            java.lang.String r14 = "get_started_button"
            if (r8 == r11) goto L_0x04ed
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.MIMICRY_UPSELL_COMPOSER
            if (r8 == r0) goto L_0x04ed
            if (r16 != 0) goto L_0x0434
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.PROFILE
            if (r8 != r0) goto L_0x04cf
            java.lang.String r13 = "profile_view"
        L_0x0434:
            r10.A0p(r13)
            if (r8 == r11) goto L_0x04cb
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.MIMICRY_UPSELL_COMPOSER
            if (r8 == r0) goto L_0x04cb
            if (r16 == 0) goto L_0x04a5
            java.lang.String r0 = "create_channel"
        L_0x0441:
            X.DbZ.A1L(r10, r0, r1)
            java.lang.String r0 = r9.A01
            r10.A0v(r0)
            java.lang.String r0 = "entrypoint"
            java.util.Map r11 = X.AnonymousClass7TF.A0w(r0, r12)
        L_0x044f:
            r10.A0w(r11)
            r10.Cgf()
        L_0x0455:
            X.07U r10 = X.07U.A05
            X.07Z r9 = r5.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r9)
            r13 = 44
            X.MGi r8 = new X.MGi
            r11 = r5
            r12 = r18
            r8.<init>(r9, r10, r11, r12, r13)
            X.1Eo.A05(r7, r8, r0)
            X.07Z r9 = r5.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r9)
            r13 = 43
            X.MGi r8 = new X.MGi
            r8.<init>(r9, r10, r11, r12, r13)
            X.1Eo.A05(r7, r8, r0)
            android.view.View[] r0 = new android.view.View[]{r6, r4, r3}
            java.util.Set r0 = X.0sc.A07(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x048e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05c0
            java.lang.Object r1 = r3.next()
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x048e
            r4.add(r1)
            goto L_0x048e
        L_0x04a5:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.PROFILE
            if (r8 != r0) goto L_0x04ac
            java.lang.String r0 = "profile"
            goto L_0x0441
        L_0x04ac:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.EDIT_PROFILE
            if (r8 != r0) goto L_0x04b3
            java.lang.String r0 = "edit_profile"
            goto L_0x0441
        L_0x04b3:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.PROFESSIONAL_DASHBOARD_NEXT_STEP
            if (r8 != r0) goto L_0x04ba
            java.lang.String r0 = "professional_dashboard"
            goto L_0x0441
        L_0x04ba:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.ACTIVITY_FEED
            if (r8 != r0) goto L_0x04c1
            java.lang.String r0 = "activity_feed"
            goto L_0x0441
        L_0x04c1:
            if (r15 == 0) goto L_0x04c7
            java.lang.String r0 = "dm_creation_omnipicker"
            goto L_0x0441
        L_0x04c7:
            java.lang.String r0 = "broadcast_chat_creator_nux"
            goto L_0x0441
        L_0x04cb:
            java.lang.String r0 = "mimicry_upsell_banner"
            goto L_0x0441
        L_0x04cf:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.EDIT_PROFILE
            if (r8 == r0) goto L_0x0434
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.PROFESSIONAL_DASHBOARD_NEXT_STEP
            if (r8 != r0) goto L_0x04df
            r0 = 3057(0xbf1, float:4.284E-42)
            java.lang.String r13 = X.C273654mx.A00(r0)
            goto L_0x0434
        L_0x04df:
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.ACTIVITY_FEED
            if (r8 != r0) goto L_0x04e7
            java.lang.String r13 = "create_button"
            goto L_0x0434
        L_0x04e7:
            if (r15 == 0) goto L_0x04ed
            java.lang.String r13 = "create_broadcast_chat_item"
            goto L_0x0434
        L_0x04ed:
            r13 = r14
            goto L_0x0434
        L_0x04f0:
            java.lang.String r12 = "mimicry_upsell_composer_banner"
            goto L_0x0412
        L_0x04f4:
            java.lang.String r12 = "mimicry_upsell_top_of_thread_banner"
            goto L_0x0412
        L_0x04f8:
            X.EV0 r9 = A01(r5)
            X.EV0 r0 = X.EV0.Social
            if (r9 != r0) goto L_0x0455
            r2.setVisibility(r8)
            X.0eM r0 = r5.A0E
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0455
            X.0eM r0 = r5.A0H
            java.lang.Object r9 = r0.getValue()
            X.FYv r9 = (X.C50338FYv) r9
            X.0eM r0 = r5.A0A
            java.lang.Object r8 = r0.getValue()
            com.instagram.direct.channels.analytics.ChannelCreationSource r8 = (com.instagram.direct.channels.analytics.ChannelCreationSource) r8
            X.0eM r0 = r5.A0B
            boolean r11 = X.AnonymousClass7TF.A1Z(r0)
            android.os.Bundle r0 = r5.mArguments
            if (r0 == 0) goto L_0x05e4
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L_0x05e4
            X.0qQ.A0B(r8, r12)
            X.1Ln r10 = X.C50338FYv.A00(r9)
            boolean r0 = X.DbT.A1Y(r10)
            if (r0 == 0) goto L_0x0455
            X.C50338FYv.A04(r10, r9)
            java.lang.String r0 = "chat_setup_sheet_rendered"
            X.DbV.A1M(r10, r0)
            java.lang.String r0 = "broadcast_chat_nux"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x057e
            java.lang.String r0 = "get_started_button"
        L_0x054a:
            r10.A0p(r0)
            if (r1 == 0) goto L_0x0576
            java.lang.String r0 = "public_chat_creator_nux"
        L_0x0551:
            X.C50338FYv.A05(r10, r9, r0)
            java.lang.String r8 = r8.A00
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "chat_type"
            java.lang.String r0 = "public"
            r11.put(r1, r0)
            if (r8 == 0) goto L_0x0568
            java.lang.String r0 = "chat_creation_source"
            r11.put(r0, r8)
        L_0x0568:
            com.instagram.common.session.UserSession r9 = r9.A03
            X.0Tu r8 = X.0Tu.A05
            r0 = 36327615073892919(0x810fc600043a37, double:3.037068280070014E-306)
            X.182.A06(r8, r9, r0)
            goto L_0x044f
        L_0x0576:
            if (r11 == 0) goto L_0x057b
            java.lang.String r0 = "create_channel"
            goto L_0x0551
        L_0x057b:
            java.lang.String r0 = "dm_creation_omnipicker"
            goto L_0x0551
        L_0x057e:
            if (r11 == 0) goto L_0x0583
            java.lang.String r0 = "create_channel_view"
            goto L_0x054a
        L_0x0583:
            java.lang.String r0 = "create_public_chat_item"
            goto L_0x054a
        L_0x0586:
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A08
            goto L_0x0312
        L_0x058c:
            r7.setVisibility(r8)
            r0 = r23
            r0.setVisibility(r8)
            goto L_0x0309
        L_0x0596:
            A00(r5)
            r4.setChecked(r13)
            goto L_0x02e2
        L_0x059e:
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A0B
            goto L_0x0294
        L_0x05a4:
            X.EIs r14 = (X.C47820EIs) r14
            boolean r0 = r14.A06
            goto L_0x026e
        L_0x05aa:
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A06
            goto L_0x024e
        L_0x05b0:
            X.EIs r1 = (X.C47820EIs) r1
            boolean r0 = r1.A09
            goto L_0x022c
        L_0x05b6:
            r0 = 2131959320(0x7f131e18, float:1.9555277E38)
            goto L_0x01c4
        L_0x05bb:
            r0 = 2131959322(0x7f131e1a, float:1.9555281E38)
            goto L_0x0189
        L_0x05c0:
            X.DkL r0 = A00(r5)
            X.0Ud r3 = r0.A0H
            r11 = 18
            X.MGj r0 = new X.MGj
            r6 = r0
            r7 = r4
            r8 = r2
            r9 = r5
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.0pz r1 = new X.0pz
            r1.<init>(r0, r3)
            X.0xx r0 = X.DbW.A0E(r5)
            X.AnonymousClass11O.A03(r0, r1)
            return
        L_0x05df:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x05e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r10)
            throw r0
        L_0x05e9:
            X.0qQ.A0F(r3)
            goto L_0x05f6
        L_0x05ed:
            X.0qQ.A0F(r0)
            goto L_0x05f6
        L_0x05f1:
            java.lang.String r10 = "currentUser"
        L_0x05f3:
            X.0qQ.A0F(r10)
        L_0x05f6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4V.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C46732DkL A00(E4V e4v) {
        return (C46732DkL) e4v.A0K.getValue();
    }

    public static final EV0 A01(E4V e4v) {
        return (EV0) e4v.A0J.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean onBackPressed() {
        C50338FYv fYv = (C50338FYv) this.A0H.getValue();
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) this.A0A.getValue();
        0qQ.A0B(channelCreationSource, 0);
        1Ln A002 = C50338FYv.A00(fYv);
        if (DbT.A1Y(A002)) {
            C50338FYv.A04(A002, fYv);
            A002.A0l("exit_chat_setup_sheet");
            A002.A0k("impression");
            A002.A0p("back_button");
            C50338FYv.A05(A002, fYv, "chat_setup");
            String str = channelCreationSource.A00;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("chat_type", "public");
            if (str != null) {
                A1E.put("chat_creation_source", str);
            }
            182.A06(0Tu.A05, fYv.A03, 36327615073892919L);
            A002.A0w(A1E);
            A002.Cgf();
        }
        return false;
    }

    public E4V() {
        0eO r2 = 0eO.A02;
        this.A0F = Dba.A0g(this, r2, 30);
        this.A0H = Dba.A0g(this, r2, 31);
        this.A0B = Dba.A0g(this, r2, 28);
        this.A0E = Dba.A0g(this, r2, 29);
        this.A0J = Dba.A0g(this, r2, 27);
        this.A0A = C51804G2n.A01(this, "social_channel_creation_source", r2, 15);
        this.A0C = C51804G2n.A01(this, "direct_channel_creation_flow_extra_args", r2, 16);
        this.A0D = C51804G2n.A01(this, "interest_based_channel_implicit_audience_type", r2, 17);
        C73656PhV phV = new C73656PhV(this, 35);
        AnonymousClass0eM A0g = Dba.A0g(new C73656PhV(this, 32), r2, 33);
        this.A0K = DbS.A0I(new C73656PhV(A0g, 34), phV, new C73915Plq(17, A0g, (Object) null), DbS.A0z(C46732DkL.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r6.A0J == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = 12523177(0xbf16a9, float:1.7548709E-38)
            int r3 = X.AnonymousClass0fD.A02(r0)
            X.E4V.super.onCreate(r9)
            r0 = 0
            r8.A09 = r0
            X.DkL r6 = A00(r8)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r7 = r6.A05
            X.4Cl r0 = X.DbS.A0h(r7, r0)
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x006d
            java.lang.Integer r0 = r0.C2R()
            if (r0 == 0) goto L_0x006d
            int r5 = r0.intValue()
        L_0x0029:
            r6.A00 = r5
            X.05G r4 = r6.A09
            X.EV0 r2 = r6.A07
            X.EV0 r0 = X.EV0.Social
            r1 = 5
            if (r2 != r0) goto L_0x0064
            java.lang.Integer r0 = r6.A08
            if (r0 == 0) goto L_0x004c
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x004c
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.Epw(r0)
            r0 = -39315272(0xfffffffffda818b8, float:-2.7929831E37)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x004c:
            boolean r0 = r6 instanceof X.C47821EIt
            if (r0 == 0) goto L_0x005e
            r0 = r6
            X.EIt r0 = (X.C47821EIt) r0
            boolean r0 = r0.A07
        L_0x0055:
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6.A0J
            r1 = 2
            if (r0 != 0) goto L_0x003e
        L_0x005c:
            r1 = 0
            goto L_0x003e
        L_0x005e:
            r0 = r6
            X.EIs r0 = (X.C47820EIs) r0
            boolean r0 = r0.A07
            goto L_0x0055
        L_0x0064:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            int r1 = X.C48809EkX.A00(r7, r0)
            goto L_0x003e
        L_0x006d:
            r5 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E4V.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1952507791);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_configure, false);
        AnonymousClass0fD.A09(414658317, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1275871771);
        super.onDestroy();
        if (!this.A09 && !AnonymousClass7TF.A1Z(this.A0E)) {
            C67089Mi7.A00(AnonymousClass7TE.A0l(this.A0G), false).A0C(false, false);
            this.A09 = true;
        }
        AnonymousClass0fD.A09(1880854685, A022);
    }
}
