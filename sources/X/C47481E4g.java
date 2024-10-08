package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.E4g  reason: case insensitive filesystem */
public final class C47481E4g extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubPromoAndWelcomeVideoFragment";
    public C273004lm A00;
    public AnonymousClass7N7 A01;
    public C49877FBb A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C58176Ing(this, 18));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass0eM A05;

    public final void configureActionBar(2da r4) {
        String str;
        Context context;
        int i;
        0qQ.A0B(r4, 0);
        AnonymousClass0eM r1 = this.A05;
        r4.Eu4(!((C46790DlK) r1.getValue()).A0D);
        int ordinal = C46790DlK.A00(r1).ordinal();
        if (ordinal == 0) {
            context = requireContext();
            i = 2131976294;
        } else if (ordinal == 1) {
            context = requireContext();
            i = 2131976326;
        } else if (ordinal == 2 || ordinal == 3) {
            str = null;
            r4.setTitle(str);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        str = context.getString(i);
        r4.setTitle(str);
    }

    public final String getModuleName() {
        return "FanClubPromoVideosFragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r4 = 0
            X.0qQ.A0B(r14, r4)
            r5 = r13
            super.onViewCreated(r14, r15)
            r0 = 2131438637(0x7f0b2c2d, float:1.8499207E38)
            android.widget.TextView r1 = X.DbU.A0G(r14, r0)
            X.0eM r2 = r13.A05
            X.DeO r0 = X.C46790DlK.A00(r2)
            java.lang.String r0 = A02(r0, r13)
            r1.setText(r0)
            r0 = 2131438633(0x7f0b2c29, float:1.8499198E38)
            android.widget.TextView r3 = X.DbU.A0G(r14, r0)
            X.DeO r0 = X.C46790DlK.A00(r2)
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x003d
            r0 = 1
            if (r1 == r0) goto L_0x0045
            r0 = 2
            if (r1 == r0) goto L_0x003b
            r0 = 3
            if (r1 == r0) goto L_0x003b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003b:
            r0 = 0
            goto L_0x0050
        L_0x003d:
            android.content.Context r1 = r13.requireContext()
            r0 = 2131976301(0x7f13606d, float:1.9589719E38)
            goto L_0x004c
        L_0x0045:
            android.content.Context r1 = r13.requireContext()
            r0 = 2131976331(0x7f13608b, float:1.958978E38)
        L_0x004c:
            java.lang.String r0 = r1.getString(r0)
        L_0x0050:
            r3.setText(r0)
            r0 = 2131438635(0x7f0b2c2b, float:1.8499202E38)
            android.view.View r7 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131438636(0x7f0b2c2c, float:1.8499204E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131438632(0x7f0b2c28, float:1.8499196E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131443470(0x7f0b3f0e, float:1.850901E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 2131430785(0x7f0b0d81, float:1.848328E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 9
            X.FP1.A01(r6, r0, r13)
            r0 = 2131441427(0x7f0b3713, float:1.8504865E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r14, r0)
            r0 = 10
            X.FP1.A01(r8, r0, r13)
            r0 = 2131443701(0x7f0b3ff5, float:1.8509478E38)
            android.view.View r1 = r14.requireViewById(r0)
            com.instagram.igds.components.textcell.IgdsListCell r1 = (com.instagram.igds.components.textcell.IgdsListCell) r1
            X.DeO r0 = X.C46790DlK.A00(r2)
            java.lang.String r0 = r13.A00(r0)
            if (r0 == 0) goto L_0x009d
            r1.A0I(r0)
        L_0x009d:
            X.DeO r0 = X.C46790DlK.A00(r2)
            java.lang.String r0 = r13.A00(r0)
            r1.setContentDescription(r0)
            X.2eS.A01(r1)
            r0 = 11
            X.FP1 r0 = X.FP1.A00(r13, r0)
            r1.A0C(r0)
            r0 = 2131443746(0x7f0b4022, float:1.8509569E38)
            android.view.View r9 = X.AnonymousClass7TF.A0G(r14, r0)
            com.instagram.igds.components.textcell.IgdsListCell r9 = (com.instagram.igds.components.textcell.IgdsListCell) r9
            X.DeO r0 = X.C46790DlK.A00(r2)
            java.lang.String r0 = A01(r0, r13)
            if (r0 == 0) goto L_0x00ca
            r9.A0I(r0)
        L_0x00ca:
            X.DeO r0 = X.C46790DlK.A00(r2)
            java.lang.String r0 = A01(r0, r13)
            r9.setContentDescription(r0)
            X.2eS.A01(r9)
            X.0xx r0 = X.DbV.A0J(r13)
            r11 = 0
            r12 = 12
            X.JUh r2 = new X.JUh
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r2, r0)
            X.0xx r2 = X.DbV.A0J(r13)
            r1 = 2
            X.MG8 r0 = new X.MG8
            r0.<init>(r13, r11, r1)
            X.1Eo.A05(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47481E4g.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A03(C47481E4g e4g) {
        AnonymousClass0eM r7 = e4g.A04;
        r7.getValue();
        C56044Hrt A0C = C250563lf.A0C(28D.A5J);
        AnonymousClass0eM r5 = e4g.A05;
        C46401DeO A002 = C46790DlK.A00(r5);
        C46401DeO deO = C46401DeO.WELCOME;
        boolean z = true;
        boolean A1W = AnonymousClass7TF.A1W(A002, deO);
        boolean A1W2 = AnonymousClass7TF.A1W(C46790DlK.A00(r5), C46401DeO.PROMOTIONAL);
        if (C46790DlK.A00(r5) != deO) {
            z = false;
        }
        A0C.A0r = A1W;
        A0C.A0t = A1W2;
        A0C.A0u = z;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(e4g.getActivity(), A0C.A00(), DbT.A0X(r7), TransparentModalActivity.class, "clips_camera");
        A022.A07();
        A022.A0D(e4g, 9587);
    }

    public static final void A04(C47481E4g e4g) {
        Fragment fragment;
        C46790DlK dlK = (C46790DlK) e4g.A05.getValue();
        if (dlK.A0D) {
            int ordinal = dlK.A00.ordinal();
            if (ordinal == 0) {
                fragment = dlK.A04.A01(false, true, true, false, false);
            } else if (ordinal != 1) {
                if (!(ordinal == 2 || ordinal == 3)) {
                    throw AnonymousClass7TE.A1K();
                }
                2ZS A002 = C71172bH.A00();
                0qQ.A0C(A002, C273654mx.A00(49));
                C240073Jm.A00 = true;
                A002.Enh(1QK.A0E);
                return;
            } else {
                UserSession userSession = dlK.A03;
                fragment = C49891FBs.A02(DbS.A0N(userSession), C46649DiU.A04("com.instagram.user_pay.fan_club.screens.create_exclusive_story", AnonymousClass7TE.A1E()));
            }
        } else {
            if (dlK.A0E && dlK.A00 == C46401DeO.PROMOTIONAL) {
                fragment = dlK.A04.A01(false, true, false, false, true);
            }
            2ZS A0022 = C71172bH.A00();
            0qQ.A0C(A0022, C273654mx.A00(49));
            C240073Jm.A00 = true;
            A0022.Enh(1QK.A0E);
            return;
        }
        Dbc.A0S(fragment, e4g.requireActivity(), e4g.A04);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        return ((C46790DlK) this.A05.getValue()).A0D;
    }

    public C47481E4g() {
        C58176Ing ing = new C58176Ing(this, 22);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58176Ing(new C58176Ing(this, 19), 20));
        this.A05 = DbS.A0I(new C58176Ing(A002, 21), ing, new C58187Inr(18, A002, (Object) null), DbS.A0z(C46790DlK.class));
    }

    private final String A00(C46401DeO deO) {
        Context context;
        int i;
        int ordinal = deO.ordinal();
        if (ordinal == 0) {
            context = requireContext();
            i = 2131976302;
        } else if (ordinal == 1) {
            context = requireContext();
            i = 2131976332;
        } else if (ordinal == 2 || ordinal == 3) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return context.getString(i);
    }

    public static final String A01(C46401DeO deO, C47481E4g e4g) {
        Context context;
        int i;
        int ordinal = deO.ordinal();
        if (ordinal == 0) {
            context = e4g.requireContext();
            i = 2131976304;
        } else if (ordinal == 1) {
            context = e4g.requireContext();
            i = 2131976333;
        } else if (ordinal == 2 || ordinal == 3) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return context.getString(i);
    }

    public static final String A02(C46401DeO deO, C47481E4g e4g) {
        Context context;
        int i;
        int ordinal = deO.ordinal();
        if (ordinal == 0) {
            context = e4g.requireContext();
            i = 2131976305;
        } else if (ordinal == 1) {
            context = e4g.requireContext();
            i = 2131976334;
        } else if (ordinal == 2 || ordinal == 3) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return context.getString(i);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (DbT.A1X(requireArguments(), "is_from_recommendations")) {
            C49877FBb fBb = this.A02;
            if (fBb == null) {
                0qQ.A0F("fanClubSettingsRecommendationsNavigator");
                throw AnonymousClass00P.createAndThrow();
            } else {
                fBb.A01(requireContext(), C46790DlK.A00(this.A05), i, i2);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(941651382);
        C47481E4g.super.onCreate(bundle);
        AnonymousClass0eM r2 = this.A04;
        this.A00 = C272994ll.A00(AnonymousClass7TE.A0l(r2));
        AnonymousClass7N7 r3 = new AnonymousClass7N7(requireContext(), this, requireActivity(), this, AnonymousClass7TE.A0l(r2), C50433Fbg.A00, (AnonymousClass4DU) null, (C231002qi) null, AnonymousClass05K.A0C);
        this.A01 = r3;
        registerLifecycleListener(r3);
        this.A02 = new C49877FBb(this, requireActivity(), AnonymousClass7TE.A0l(r2), (F3F) null, 28D.A5O.toString(), 48);
        C46790DlK dlK = (C46790DlK) this.A05.getValue();
        05G r22 = dlK.A0A;
        r22.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r22.getValue()) + 1));
        1Eo.A05(((AnonymousClass12U) dlK.A01).A04, new MG8(dlK, (AnonymousClass4D7) null, 3), C318116oQ.A00(dlK));
        AnonymousClass0fD.A09(1358165906, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1346507775);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fan_club_promo_videos, viewGroup, false);
        AnonymousClass0fD.A09(-1758863710, A022);
        return inflate;
    }
}
