package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.KXe  reason: case insensitive filesystem */
public final class C62042KXe extends K6S {
    public static final String __redex_internal_original_name = "HallPassAudiencePickerFragment";
    public IgdsBottomButtonLayout A00;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02;
    public String A03;
    public String A04;
    public 2dZ A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void CtJ(C46448DfA dfA) {
    }

    public final String getModuleName() {
        return C273654mx.A00(294);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.KXe, X.K6S] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r11 = 0
            X.0qQ.A0B(r14, r11)
            super.onViewCreated(r14, r15)
            android.view.View r1 = r13.requireView()
            r0 = 2131431900(0x7f0b11dc, float:1.8485542E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r1, r0)
            X.0eM r3 = r13.A06
            X.1Av r0 = X.DbX.A0h(r3)
            X.0xa r0 = r0.A01
            java.lang.String r2 = "has_seen_hall_pass_one_time_add_people_disclosure"
            boolean r0 = r0.getBoolean(r2, r11)
            if (r0 != 0) goto L_0x00fa
            r1.setVisibility(r11)
            X.1Av r0 = X.DbX.A0h(r3)
            r1 = 1
            X.0xa r0 = r0.A01
            X.DbX.A1V(r0, r2, r1)
        L_0x002f:
            android.view.View r1 = r13.requireView()
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = X.DbT.A0c(r1, r0)
            r13.A00 = r2
            java.lang.String r4 = "doneButton"
            r9 = 0
            if (r2 == 0) goto L_0x0106
            java.lang.Integer r0 = r13.A01
            int r1 = r0.intValue()
            if (r1 == r11) goto L_0x00ec
            r0 = 1
            if (r1 != r0) goto L_0x0101
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto L_0x00f7
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
        L_0x0055:
            java.lang.String r0 = r1.getString(r0)
        L_0x0059:
            r2.setPrimaryActionText(r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r13.A00
            if (r0 == 0) goto L_0x0106
            r0.setPrimaryButtonEnabled(r11)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r13.A00
            if (r2 == 0) goto L_0x0106
            r1 = 65
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.setPrimaryActionOnClickListener(r0)
            X.K9H r0 = r13.A09()
            android.content.Context r8 = r13.requireContext()
            r12 = 1
            X.L9z r7 = new X.L9z
            r10 = r9
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00 = r7
            android.view.View r1 = r13.requireView()
            r0 = 2131435793(0x7f0b2111, float:1.8493438E38)
            android.view.ViewGroup r2 = X.DbX.A0I(r1, r0)
            android.view.View r1 = r13.requireView()
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r8 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r8
            android.view.View r1 = r13.requireView()
            r0 = 2131440802(0x7f0b34a2, float:1.8503598E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r1, r0)
            android.content.Context r4 = r13.requireContext()
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r3)
            X.0gy r6 = X.AnonymousClass07i.A00(r13)
            X.K9H r10 = r13.A09()
            r0 = 3
            X.Lwt r9 = new X.Lwt
            r9.<init>(r13, r0)
            X.KXl r3 = new X.KXl
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3.A02()
            r13.A01 = r3
            android.animation.LayoutTransition r1 = r2.getLayoutTransition()
            X.LTg r0 = new X.LTg
            r0.<init>(r8)
            r1.addTransitionListener(r0)
            android.view.View r1 = r13.requireView()
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.JTR.A0c(r1, r0)
            X.3AS r1 = r0.A0C
            boolean r0 = r1 instanceof X.AnonymousClass3AR
            if (r0 == 0) goto L_0x00e8
            X.3AR r1 = (X.AnonymousClass3AR) r1
            if (r1 == 0) goto L_0x00e8
            r1.A00 = r11
        L_0x00e8:
            A05(r13)
            return
        L_0x00ec:
            android.content.Context r1 = r13.getContext()
            if (r1 == 0) goto L_0x00f7
            r0 = 2131956863(0x7f13147f, float:1.9550294E38)
            goto L_0x0055
        L_0x00f7:
            r0 = r9
            goto L_0x0059
        L_0x00fa:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x002f
        L_0x0101:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0106:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62042KXe.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.KXe, X.K6S] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C62042KXe r4) {
        /*
            X.K9H r3 = r4.A09()
            android.content.Context r2 = r4.requireContext()
            X.6rr r1 = X.C320156rr.LOADING
            r0 = 0
            r3.A04(r2, r0, r1)
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0029
            r0 = 1
            if (r1 != r0) goto L_0x0024
            X.0xx r1 = X.DbW.A0E(r4)
            r0 = 40
            X.MG8.A01(r4, r1, r0)
            return
        L_0x0024:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0029:
            X.0xx r1 = X.DbW.A0E(r4)
            r0 = 39
            X.MG8.A01(r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62042KXe.A05(X.KXe):void");
    }

    public static final void A06(C62042KXe kXe, int i, boolean z) {
        C59689JTv.A0F(kXe.requireContext(), "hall_pass_audience_picker_fetch_error", i);
        if (z) {
            kXe.A09().A04(kXe.requireContext(), new LYE((Object) kXe, 66), C320156rr.ERROR);
        }
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        super.A0C(igdsCheckBox, jva);
        A0A().A00();
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
        if (igdsBottomButtonLayout == null) {
            0qQ.A0F("doneButton");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(AnonymousClass7TE.A1b(DbU.A0K(this.A03.A03)));
        }
    }

    public final void configureActionBar(2da r4) {
        DbX.A1A(new LYE((Object) this, 64), K6S.A01(r4, AnonymousClass7TE.A16(JTT.A0B(this, r4), 2131963252)), r4);
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0fD.A02(-1814431600);
        C62042KXe.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString("hall_pass_name");
        this.A02 = requireArguments.getString(AnonymousClass000.A00(3206));
        this.A03 = requireArguments.getString("hall_pass_id");
        String string = requireArguments.getString(AnonymousClass000.A00(154));
        if (string == null || string.equals("CREATION")) {
            num = AnonymousClass05K.A00;
        } else if (string.equals("ADD_PEOPLE")) {
            num = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A0w(string);
        }
        this.A01 = num;
        this.A05 = 2dZ.A0t.A04(this);
        AnonymousClass0fD.A09(513913433, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1887588597);
        K6S.A03(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_hall_pass_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1071548368, A022);
        return inflate;
    }
}
