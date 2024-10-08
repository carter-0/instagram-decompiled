package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.KXd  reason: case insensitive filesystem */
public final class C62041KXd extends K6S {
    public static final String __redex_internal_original_name = "QuickSnapAudiencePickerFragment";
    public ConstraintLayout A00;
    public AnonymousClass87I A01 = AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT;
    public IgEditText A02;
    public IgSimpleImageView A03;
    public IgdsButton A04;
    public AnonymousClass6ST A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final C252213ok A0A = new C64871LjX(this, 9);
    public final AnonymousClass3E6 A0B = AnonymousClass3E4.A01(this, false, true);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);

    public final void CtJ(C46448DfA dfA) {
    }

    public final void configureActionBar(2da r5) {
        String string;
        AnonymousClass87I r2;
        0qQ.A0B(r5, 0);
        String str = this.A08;
        if (str == null || (r2 = this.A01) == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT) {
            string = DbV.A05(this).getString(2131971112);
        } else {
            string = null;
            if (r2 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST) {
                string = str;
            }
        }
        DbX.A1A(new C64273LXz(this, 24), K6S.A01(r5, string), r5);
        if (this.A01 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A02(AnonymousClass05K.A00);
            DbX.A19(new C64273LXz(this, 25), A0K, r5);
        }
    }

    public final String getModuleName() {
        return "ig_quick_snap_audience_selector";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r3 = 0
            r2 = r19
            X.0qQ.A0B(r2, r3)
            r0 = r18
            r1 = r20
            super.onViewCreated(r2, r1)
            X.K9H r2 = r0.A09()
            android.content.Context r5 = r0.requireContext()
            r11 = 0
            r17 = 1
            X.L9z r1 = new X.L9z
            r4 = r1
            r6 = r11
            r7 = r11
            r8 = r3
            r9 = r17
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A00 = r1
            X.K6S.A02(r0)
            X.87I r2 = r0.A01
            X.87I r6 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST
            if (r2 != r6) goto L_0x0171
            java.lang.String r5 = r0.A07
            if (r5 == 0) goto L_0x0040
            X.0xx r4 = X.DbW.A0E(r0)
            r1 = 19
            X.MFV r2 = new X.MFV
            r2.<init>(r0, r5, r11, r1)
        L_0x003d:
            X.AnonymousClass7TE.A1Z(r2, r4)
        L_0x0040:
            android.view.View r2 = r0.requireView()
            r1 = 2131432000(0x7f0b1240, float:1.8485745E38)
            com.instagram.igds.components.button.IgdsButton r4 = X.DbU.A0b(r2, r1)
            r4.setEnabled(r3)
            r4.setVisibility(r3)
            X.87I r2 = r0.A01
            X.87I r1 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT
            if (r2 != r1) goto L_0x0160
            r1 = 2131956872(0x7f131488, float:1.9550312E38)
            r4.setText((int) r1)
            r2 = 33
            X.LY7 r1 = new X.LY7
            r1.<init>((com.instagram.igds.components.button.IgdsButton) r4, (X.C62041KXd) r0, (int) r2)
        L_0x0064:
            X.AnonymousClass0fU.A00(r1, r4)
        L_0x0067:
            r0.A04 = r4
            android.view.View r2 = r0.requireView()
            r1 = 2131428239(0x7f0b038f, float:1.8478117E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r2, r1)
            android.content.Context r2 = r0.requireContext()
            r1 = 2131971111(0x7f134c27, float:1.9579192E38)
            X.DbT.A18(r2, r4, r1)
            android.view.View r2 = r0.requireView()
            r1 = 2131439078(0x7f0b2de6, float:1.85001E38)
            android.view.View r1 = r2.requireViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.A00 = r1
            android.view.View r2 = r0.requireView()
            r1 = 2131439077(0x7f0b2de5, float:1.8500099E38)
            android.view.View r2 = r2.requireViewById(r1)
            com.instagram.common.ui.base.IgEditText r2 = (com.instagram.common.ui.base.IgEditText) r2
            r0.A02 = r2
            if (r2 == 0) goto L_0x00a3
            java.lang.String r1 = r0.A08
            r2.setText(r1)
        L_0x00a3:
            android.view.View r2 = r0.requireView()
            r1 = 2131439079(0x7f0b2de7, float:1.8500103E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r2, r1)
            android.view.View r2 = r0.requireView()
            r1 = 2131439101(0x7f0b2dfd, float:1.8500148E38)
            com.instagram.common.ui.base.IgSimpleImageView r1 = X.JTP.A0T(r2, r1)
            r0.A03 = r1
            android.content.Context r2 = r0.getContext()
            r1 = 2130970211(0x7f040663, float:1.7549126E38)
            int r1 = X.2Yu.A0F(r2, r1)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r0.A03
            if (r2 == 0) goto L_0x00d1
            android.graphics.drawable.ShapeDrawable r1 = X.I7E.A03(r1)
            r2.setBackground(r1)
        L_0x00d1:
            com.instagram.common.ui.base.IgSimpleImageView r2 = r0.A03
            if (r2 == 0) goto L_0x00da
            java.lang.String r1 = r0.A06
            X.I7E.A07(r2, r1)
        L_0x00da:
            com.instagram.common.ui.base.IgSimpleImageView r4 = r0.A03
            if (r4 == 0) goto L_0x00e8
            r2 = 64
            X.FPC r1 = new X.FPC
            r1.<init>((java.lang.Object) r0, (int) r2)
            X.AnonymousClass0fU.A00(r1, r4)
        L_0x00e8:
            X.3E6 r2 = r0.A0B
            X.3ok r1 = r0.A0A
            r2.A9Y(r1)
            com.instagram.common.ui.base.IgEditText r2 = r0.A02
            if (r2 == 0) goto L_0x00f8
            r1 = 9
            X.LYN.A00(r2, r1, r5)
        L_0x00f8:
            android.view.View r2 = r0.requireView()
            r1 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.JTR.A0c(r2, r1)
            X.3AS r2 = r1.A0C
            java.lang.String r1 = "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator"
            X.0qQ.A0C(r2, r1)
            X.3AR r2 = (X.AnonymousClass3AR) r2
            r2.A00 = r3
            android.view.View r2 = r0.requireView()
            r1 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r2, r1)
            com.instagram.igds.components.search.IgdsInlineSearchBox r8 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r8
            android.view.View r2 = r0.requireView()
            r1 = 2131440802(0x7f0b34a2, float:1.8503598E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r2, r1)
            android.content.Context r4 = r0.requireContext()
            X.0eM r1 = r0.A0C
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r1)
            X.0gy r6 = X.AnonymousClass07i.A00(r0)
            X.K9H r10 = r0.A09()
            r1 = 5
            X.Lwt r9 = new X.Lwt
            r9.<init>(r0, r1)
            X.KXk r3 = new X.KXk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r15 = "coefficient_besties_list_ranking"
            com.instagram.common.session.UserSession r12 = r3.A02
            android.content.Context r2 = r3.A00
            X.07i r1 = r3.A01
            X.2lw r13 = new X.2lw
            r13.<init>(r2, r1, r11)
            X.7eH r14 = r3.A03
            r16 = r11
            X.7eO r1 = X.C336237eI.A00(r11, r12, r13, r14, r15, r16, r17)
            r3.A00 = r1
            r1.EcJ(r3)
            r0.A01 = r3
            return
        L_0x0160:
            if (r2 != r6) goto L_0x0067
            r1 = 2131972502(0x7f135196, float:1.9582013E38)
            r4.setText((int) r1)
            r2 = 34
            X.LY7 r1 = new X.LY7
            r1.<init>((com.instagram.igds.components.button.IgdsButton) r4, (X.C62041KXd) r0, (int) r2)
            goto L_0x0064
        L_0x0171:
            X.87I r1 = X.AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT
            if (r2 != r1) goto L_0x0040
            X.0xx r4 = X.DbW.A0E(r0)
            r1 = 14
            X.MG3 r2 = new X.MG3
            r2.<init>((java.lang.Object) r0, (X.AnonymousClass4D7) r11, (int) r1)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62041KXd.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A05(C62041KXd kXd) {
        IgdsButton igdsButton;
        int size = kXd.A03.A03.size();
        AnonymousClass87I r1 = kXd.A01;
        if ((r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT || r1 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST) && (igdsButton = kXd.A04) != null) {
            boolean z = true;
            if (size <= 1) {
                z = false;
            }
            igdsButton.setEnabled(z);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        ConstraintLayout constraintLayout;
        int A1Z = AnonymousClass7TG.A1Z(jva, igdsCheckBox);
        super.A0C(igdsCheckBox, jva);
        A0A().A00();
        int size = this.A03.A03.size();
        if (this.A01 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT && (constraintLayout = this.A00) != null) {
            int i = 0;
            if (size <= A1Z) {
                i = 8;
            }
            constraintLayout.setVisibility(i);
        }
        A05(this);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1124225680);
        C62041KXd.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("dial_type");
        if (string != null) {
            this.A01 = AnonymousClass87I.valueOf(string);
        }
        String string2 = requireArguments.getString("list_id");
        if (string2 != null) {
            this.A07 = string2;
        }
        String string3 = requireArguments.getString("list_name");
        if (string3 != null) {
            this.A08 = string3;
        }
        String string4 = requireArguments.getString("emoji");
        if (string4 == null) {
            string4 = "⭐";
        }
        this.A06 = string4;
        this.A09 = string4;
        AnonymousClass0fD.A09(-1995531694, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1478929164);
        K6S.A03(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_quick_snap_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(2020003949, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1834741420);
        super.onDestroyView();
        this.A0B.EEH(this.A0A);
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-1075173984, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1152622851);
        C62041KXd.super.onStart();
        JTP.A17(this, this.A0B);
        AnonymousClass0fD.A09(-1932487676, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(2025570928);
        C62041KXd.super.onStop();
        this.A0B.onStop();
        AnonymousClass0fD.A09(959499556, A022);
    }
}
