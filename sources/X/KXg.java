package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

public final class KXg extends K6S {
    public static final /* synthetic */ AnonymousClass0YZ[] A0D;
    public static final String __redex_internal_original_name = "AudienceListsAudiencePickerFragment";
    public 2dZ A00;
    public C46434Dew A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C63766L5y A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final 0s0 A0B = new Pr3(this, 0);
    public final 0s0 A0C = new Pr3(1, this, false);

    public final void CtJ(C46448DfA dfA) {
    }

    public final void configureActionBar(2da r4) {
        String A052;
        0qQ.A0B(r4, 0);
        if (this.A02 == null) {
            A052 = requireContext().getString(2131956872);
        } else {
            A052 = A05(this);
            if (A052 == null) {
                A052 = AnonymousClass7TE.A16(requireContext(), 2131969340);
            }
        }
        0qQ.A0A(A052);
        DbX.A1A(new LY1(this, 41), K6S.A01(r4, A052), r4);
        if (this.A02 != null) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A02(AnonymousClass05K.A00);
            DbX.A19(new LY1(this, 42), A0K, r4);
        }
    }

    public final String getModuleName() {
        return "audience_lists_audience_picker";
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r9 = 0
            X.0qQ.A0B(r12, r9)
            super.onViewCreated(r12, r13)
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x005a
            android.content.Context r1 = r11.requireContext()
            android.content.Context r0 = r11.getContext()
            int r0 = X.2Yu.A02(r0)
            int r2 = r1.getColor(r0)
            android.view.View r1 = r11.requireView()
            r0 = 2131435793(0x7f0b2111, float:1.8493438E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r1, r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.setTint(r2)
            android.view.View r1 = r11.requireView()
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r1, r0)
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r0.setTint(r2)
            android.view.View r1 = r11.requireView()
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r1, r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r1
            r0 = 2131231726(0x7f0803ee, float:1.8079541E38)
            r1.setSearchRowBackgroundColor(r0)
        L_0x005a:
            android.view.View r1 = r11.requireView()
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            com.instagram.igds.components.button.IgdsButton r1 = X.JTR.A0n(r1, r0)
            java.lang.String r0 = r11.A02
            if (r0 == 0) goto L_0x0144
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            r1.setText((int) r0)
        L_0x006f:
            r0 = 43
            X.LY1.A00(r1, r0, r11)
            r1.setVisibility(r9)
            X.K9H r0 = r11.A09()
            android.content.Context r6 = r11.requireContext()
            r7 = 0
            r10 = 1
            X.L9z r5 = new X.L9z
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A00 = r5
            android.view.View r1 = r11.requireView()
            r0 = 2131435793(0x7f0b2111, float:1.8493438E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.View r0 = r11.requireView()
            r2 = 2131432227(0x7f0b1323, float:1.8486205E38)
            android.view.View r8 = X.AnonymousClass7TF.A0F(r0, r2)
            android.view.View r1 = r11.requireView()
            r0 = 2131440786(0x7f0b3492, float:1.8503565E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            X.Lwp r1 = r11.A0A()
            X.0eE r6 = X.AnonymousClass0t1.A01
            X.0eM r5 = r11.A0A
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r5)
            X.K6S.A04(r1, r0)
            X.Lwp r7 = r11.A0A()
            r0 = 14
            X.J6O r4 = new X.J6O
            r4.<init>(r8, r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r3 = r7.A04
            r1 = 3
            X.LYL r0 = new X.LYL
            r0.<init>(r1, r4, r7)
            r3.A00 = r0
            X.Lwp r4 = r11.A0A()
            r0 = 9
            X.Ins r1 = new X.Ins
            r1.<init>(r0, r8, r11)
            android.view.View r0 = r4.A02
            r3 = 44
            X.LY7.A00(r0, r3, r1, r4)
            android.view.View r1 = r11.requireView()
            r0 = 2131435553(0x7f0b2021, float:1.8492951E38)
            android.widget.TextView r4 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r11.requireView()
            r0 = 2131432228(0x7f0b1324, float:1.8486208E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r0 = r11.requireView()
            android.view.View r2 = X.AnonymousClass7TF.A0F(r0, r2)
            android.view.View r1 = r11.requireView()
            r0 = 2131435552(0x7f0b2020, float:1.849295E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r0)
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x0171
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x0165
            r0 = 2131968282(0x7f13411a, float:1.9573454E38)
            X.DbU.A1G(r7, r11, r0)
            r0 = 2131965099(0x7f1334ab, float:1.9566998E38)
            X.DbU.A1G(r1, r11, r0)
            android.text.InputFilter[] r0 = r4.getFilters()
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.0sC r7 = X.0pe.A00(r0)
        L_0x012f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r1 = r7.next()
            boolean r0 = r1 instanceof android.text.InputFilter.LengthFilter
            if (r0 != 0) goto L_0x012f
            X.0qQ.A0A(r1)
            r8.add(r1)
            goto L_0x012f
        L_0x0144:
            r0 = 2131956834(0x7f131462, float:1.9550235E38)
            r1.setText((int) r0)
            r1.setEnabled(r9)
            goto L_0x006f
        L_0x014f:
            r1 = 50
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r8.add(r0)
            android.text.InputFilter[] r0 = new android.text.InputFilter[r9]
            java.lang.Object[] r0 = r8.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r4.setFilters(r0)
            goto L_0x0171
        L_0x0165:
            r0 = 2131968284(0x7f13411c, float:1.9573458E38)
            X.DbU.A1G(r7, r11, r0)
            r0 = 2131965099(0x7f1334ab, float:1.9566998E38)
            X.DbU.A1G(r1, r11, r0)
        L_0x0171:
            X.LZR r0 = new X.LZR
            r0.<init>(r4, r9)
            r4.setOnEditorActionListener(r0)
            X.LWO r0 = new X.LWO
            r0.<init>(r9, r4, r11)
            r4.addTextChangedListener(r0)
            X.LYN.A00(r4, r10, r11)
            java.lang.String r1 = r11.A03
            if (r1 != 0) goto L_0x019b
            boolean r0 = r11.A06
            if (r0 == 0) goto L_0x01a0
            r1 = 2131957520(0x7f131710, float:1.9551626E38)
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r5)
            java.lang.String r0 = r0.getUsername()
            java.lang.String r1 = X.DbV.A0z(r11, r0, r1)
        L_0x019b:
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.EDITABLE
            r4.setText(r1, r0)
        L_0x01a0:
            java.lang.String r0 = r11.A02
            if (r0 != 0) goto L_0x020c
            r4.requestFocus()
            X.0nA.A0Q(r4)
        L_0x01aa:
            android.view.View r1 = r11.requireView()
            r0 = 2131434013(0x7f0b1a1d, float:1.8489828E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            android.text.SpannableStringBuilder r4 = X.C51965G9l.A0E()
            r0 = 2131963501(0x7f132e6d, float:1.9563757E38)
            java.lang.String r2 = X.DbU.A0m(r11, r0)
            r0 = 2131953252(0x7f130664, float:1.954297E38)
            android.content.Context r1 = X.K6S.A00(r4, r11, r2, r0)
            int r0 = X.2Yu.A0D(r1)
            java.lang.Integer r1 = X.DbV.A0n(r1, r0)
            X.52w r0 = new X.52w
            r0.<init>(r1)
            X.AnonymousClass7AV.A05(r4, r0, r2)
            r5.setText(r4)
            X.LY1.A00(r5, r3, r11)
            r5.setVisibility(r9)
            android.view.View r1 = r11.requireView()
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r3 = X.JTR.A0c(r1, r0)
            X.3AS r1 = r3.A0C
            boolean r0 = r1 instanceof X.AnonymousClass3AR
            if (r0 == 0) goto L_0x01f5
            X.3AR r1 = (X.AnonymousClass3AR) r1
            r1.A00 = r9
        L_0x01f5:
            X.Dew r0 = r11.A01
            java.lang.String r2 = "suggestedUsersPaginationHelper"
            if (r0 == 0) goto L_0x0212
            r3.A15(r0)
            X.K9H r1 = r11.A09()
            X.Dew r0 = r11.A01
            if (r0 == 0) goto L_0x0212
            r1.A02 = r0
            A06(r11)
            return
        L_0x020c:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x01aa
        L_0x0212:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KXg.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    static {
        Class<KXg> cls = KXg.class;
        A0D = new AnonymousClass0YZ[]{new 015(cls, "currAudienceListName", "getCurrAudienceListName()Ljava/lang/String;", 0), new 015(cls, "isNetworkRequestInFlight", "isNetworkRequestInFlight()Z", 0)};
    }

    public static final String A05(KXg kXg) {
        return DbV.A13(kXg, kXg.A0B, A0D, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r4 > 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.KXg r5) {
        /*
            X.LRl r0 = r5.A03
            java.util.Set r0 = r0.A03
            int r4 = r0.size()
            android.view.View r1 = r5.requireView()
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            java.lang.String r0 = r5.A02
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r1 = 0
            if (r4 <= 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = A05(r5)
            if (r0 == 0) goto L_0x0029
            r2 = 1
        L_0x0029:
            r1 = r2
        L_0x002a:
            r3.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KXg.A07(X.KXg):void");
    }

    public static final void A08(KXg kXg, boolean z) {
        AnonymousClass7TF.A1J(kXg, kXg.A0C, A0D, 1, z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final boolean onBackPressed() {
        if ((this.A02 != null && 0qQ.A0K(this.A03, A05(this))) || (this.A02 == null && A05(this) == null)) {
            L55 l55 = this.A03.A02;
            if (l55.A00.isEmpty() && l55.A01.isEmpty()) {
                DbT.A1K(this);
            }
        }
        C358248ab A0H = Dba.A0H(this);
        int i = 2131960806;
        if (this.A02 == null) {
            i = 2131960810;
        }
        A0H.A05 = getString(i);
        int i2 = 2131960805;
        if (this.A02 == null) {
            i2 = 2131960809;
        }
        A0H.A0q(getString(i2));
        A0H.A0K(LV3.A00(this, 22), 2131960790);
        A0H.A0C(C64214LUe.A00);
        AnonymousClass7TH.A0a(A0H, true);
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, androidx.fragment.app.Fragment, X.KXg, java.lang.Object, X.K6S] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.KXg r10) {
        /*
            X.K9H r2 = r10.A09()
            android.content.Context r1 = r10.requireContext()
            X.6rr r0 = X.C320156rr.LOADING
            r9 = 0
            r2.A04(r1, r9, r0)
            X.Dew r0 = r10.A01
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "suggestedUsersPaginationHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            r8 = 1
            r0.A02 = r8
            java.lang.String r2 = r10.A02
            if (r2 == 0) goto L_0x002d
            X.0xx r1 = X.DbW.A0E(r10)
            r0 = 31
            X.MGE.A01(r10, r2, r1, r0)
            return
        L_0x002d:
            android.content.Context r7 = r10.requireContext()
            X.0gy r6 = X.AnonymousClass07i.A00(r10)
            X.0eM r1 = r10.A0A
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            r0 = 40
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.0lg r3 = X.DbT.A0X(r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319901312949971(0x8108c200091ed3, double:3.032190066588872E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.1OC r1 = X.LHo.A00(r5, r4, r9, r8, r0)
            r0 = 5
            X.C61500KAf.A00(r1, r10, r0)
            X.1ES.A00(r7, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KXg.A06(X.KXg):void");
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        super.A0C(igdsCheckBox, jva);
        LRl.A01(this, this.A03);
        A07(this);
        requireView().findViewById(R.id.list_name_edit_text).clearFocus();
        JTT.A16(this);
        View A0G = AnonymousClass7TF.A0G(requireView(), R.id.edit_text_container);
        A0A().A00();
        if (this.A02 == null || this.A04) {
            A0G.setVisibility(0);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, X.KXg, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        Window A0G;
        int A022 = AnonymousClass0fD.A02(-1737008546);
        KXg.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r5 = this.A0A;
        this.A09 = new C63766L5y(this, AnonymousClass7TE.A0l(r5));
        this.A00 = 2dZ.A0t.A04(this);
        this.A02 = requireArguments.getString("audience_list_id");
        this.A05 = requireArguments.getBoolean("is_bottomsheet");
        this.A03 = requireArguments.getString("audience_list_name");
        this.A07 = requireArguments.getBoolean("delete_enabled");
        DbS.A1a(this, this.A03, this.A0B, A0D, 0);
        0lg A0X = DbT.A0X(r5);
        0Tu r6 = 0Tu.A05;
        this.A08 = 182.A06(r6, A0X, 36319901312622288L);
        this.A06 = 182.A06(r6, DbT.A0X(r5), 36319901313408728L);
        if (this.A02 == null && (A0G = DbV.A0G(this)) != null) {
            A0G.setSoftInputMode(53);
        }
        06F.A00(this, "request_key_audience_lists_settings_session_finished", MPD.A00);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A01 = new C46434Dew(this, AnonymousClass7TE.A0l(r5), new M0A(this, 0));
        AnonymousClass0fD.A09(286089314, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2098357761);
        K6S.A03(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_lists_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(-1882709762, A022);
        return inflate;
    }
}
