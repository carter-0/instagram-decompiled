package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

public final class E51 extends AnonymousClass4DH implements AnonymousClass4DR, G7Z {
    public static final String __redex_internal_original_name = "DirectShareSheetSearchFragment";
    public E9C A00;
    public Fl1 A01;
    public String A02;
    public String A03;
    public ArrayList A04 = AnonymousClass7TE.A1C();
    public ArrayList A05 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void CwR(C47159Dra dra, IgdsCheckBox igdsCheckBox) {
        0qQ.A0B(igdsCheckBox, 1);
        igdsCheckBox.setChecked(!igdsCheckBox.isChecked());
        Intent putExtra = DbS.A09().putExtra("bundle_extra_share_target", dra.A07);
        0qQ.A07(putExtra);
        DbX.A17(putExtra, this);
        DbT.A1K(this);
    }

    public final boolean Es1(C47159Dra dra) {
        Integer A032;
        if (A00()) {
            return true;
        }
        UserSession A0l = AnonymousClass7TE.A0l(this.A06);
        DirectShareTarget directShareTarget = dra.A07;
        int i = requireArguments().getInt("DirectShareSheetConstants.message_request_limit");
        int i2 = requireArguments().getInt("DirectShareSheetConstants.message_request_count");
        if (directShareTarget.A0N()) {
            return true;
        }
        if (!directShareTarget.A0W() || directShareTarget.A0G()) {
            return false;
        }
        if (i2 >= i && 182.A06(DbS.A0J(A0l, 0), A0l, 36315662179765711L)) {
            return true;
        }
        boolean z = requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding_restricted_content_type");
        if (!directShareTarget.A0W() || directShareTarget.A0G()) {
            return false;
        }
        if ((z || (directShareTarget.A03() != null && (A032 = directShareTarget.A03()) != null && A032.intValue() == 5)) && C272094k5.A00(A0l)) {
            return true;
        }
        return false;
    }

    public final String getModuleName() {
        return "direct_sharesheet_search_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        AnonymousClass0eM r5 = this.A06;
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        ArrayList arrayList = this.A04;
        Integer num = AnonymousClass05K.A00;
        E9C e9c = new E9C(requireContext, this, A0l, this, (G6T) null, num, arrayList);
        this.A00 = e9c;
        ArrayList arrayList2 = this.A05;
        if (arrayList2 != null) {
            e9c.A00(arrayList2);
        }
        View A0G = AnonymousClass7TF.A0G(view2, R.id.search_exit_button);
        FP8.A01(A0G, 17, this);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TF.A0G(view2, R.id.search_box);
        igdsInlineSearchBox.setTextsize((float) DbV.A05(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        igdsInlineSearchBox.setSearchGlyphColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_secondary_text));
        igdsInlineSearchBox.setImeOptions(6);
        igdsInlineSearchBox.postDelayed(new C51195FqB(igdsInlineSearchBox), 150);
        Context requireContext2 = requireContext();
        UserSession A0l2 = AnonymousClass7TE.A0l(r5);
        0gy A002 = AnonymousClass07i.A00(this);
        E9C e9c2 = this.A00;
        if (e9c2 != null) {
            Fl1 fl1 = new Fl1(requireContext2, requireArguments(), A0G, A002, this, A0l2, e9c2, igdsInlineSearchBox, num);
            this.A01 = fl1;
            fl1.A01 = this.A02;
            fl1.A02 = this.A03;
            View A0F = AnonymousClass7TF.A0F(view2, R.id.search_box);
            RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view2, R.id.recycler_view);
            DbY.A16(this, recyclerView);
            E9C e9c3 = this.A00;
            if (e9c3 != null) {
                recyclerView.setAdapter(e9c3);
                C46864Dmg.A00(recyclerView, A0F, 5);
                return;
            }
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.text.Spanned] */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.text.Spanned] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D8x(X.C47159Dra r9) {
        /*
            r8 = this;
            com.instagram.model.direct.DirectShareTarget r5 = r9.A07
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectShareSheetConstants.message_request_limit"
            int r7 = r1.getInt(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectShareSheetConstants.message_request_count"
            int r6 = r1.getInt(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectShareSheetConstants.is_forwarding"
            boolean r4 = r1.getBoolean(r0)
            android.os.Bundle r1 = r8.requireArguments()
            java.lang.String r0 = "DirectShareSheetConstants.is_forwarding_restricted_content_type"
            boolean r2 = r1.getBoolean(r0)
            boolean r0 = r8.A00()
            if (r0 == 0) goto L_0x0046
            android.content.Context r2 = r8.requireContext()
            r0 = 2131962670(0x7f132b2e, float:1.9562072E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131962668(0x7f132b2c, float:1.9562068E38)
            java.lang.String r0 = r8.getString(r0)
            X.C49952FGh.A05(r2, r0, r1)
        L_0x0045:
            return
        L_0x0046:
            boolean r0 = r5.A0N()
            if (r0 == 0) goto L_0x0068
            android.content.res.Resources r2 = X.DbV.A05(r8)
            r1 = 2131964497(0x7f133251, float:1.9565777E38)
            java.lang.String r0 = r5.A0A()
            android.text.Spanned r1 = X.DbU.A07(r2, r0, r1)
            X.0qQ.A07(r1)
            X.6ap r0 = X.DbS.A0a()
            r0.A0D = r1
            X.DbY.A1N(r0)
            return
        L_0x0068:
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x0045
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x0045
            java.lang.String r3 = ""
            if (r6 < r7) goto L_0x00a0
            r0 = 2131966204(0x7f1338fc, float:1.956924E38)
            java.lang.String r3 = r8.getString(r0)
            X.0eM r0 = r8.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r5.A06()
            X.AIh.A04(r8, r1, r0, r4)
        L_0x008c:
            android.content.Context r1 = r8.requireContext()
            r0 = 2131973526(0x7f135596, float:1.958409E38)
            if (r4 == 0) goto L_0x0098
            r0 = 2131962669(0x7f132b2d, float:1.956207E38)
        L_0x0098:
            java.lang.String r0 = r8.getString(r0)
            X.C49952FGh.A05(r1, r3, r0)
            return
        L_0x00a0:
            java.lang.Integer r0 = r5.A03()
            if (r0 == 0) goto L_0x00d6
            java.lang.Integer r0 = r5.A03()
            r1 = 5
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x00d6
            android.content.res.Resources r2 = X.DbV.A05(r8)
            r1 = 2131964496(0x7f133250, float:1.9565775E38)
            if (r4 == 0) goto L_0x00bf
            r1 = 2131964494(0x7f13324e, float:1.9565771E38)
        L_0x00bf:
            java.lang.String r0 = r5.A0I
            if (r0 != 0) goto L_0x00c4
            r0 = r3
        L_0x00c4:
            android.text.Spanned r3 = X.DbU.A07(r2, r0, r1)
            X.0eM r0 = r8.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r5.A06()
            X.AIh.A03(r8, r1, r0, r4)
            goto L_0x008c
        L_0x00d6:
            if (r2 == 0) goto L_0x008c
            android.content.res.Resources r2 = X.DbV.A05(r8)
            r1 = 2131965917(0x7f1337dd, float:1.9568657E38)
            java.lang.String r0 = r5.A0I
            if (r0 != 0) goto L_0x00e4
            r0 = r3
        L_0x00e4:
            android.text.Spanned r3 = X.DbU.A07(r2, r0, r1)
            X.0eM r0 = r8.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r5.A06()
            X.AIh.A02(r8, r1, r0)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E51.D8x(X.Dra):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    private final boolean A00() {
        int i = requireArguments().getInt("DirectShareSheetConstants.forwarding_messages_limit");
        int i2 = requireArguments().getInt("DirectShareSheetConstants.forwarding_messages_count");
        if (!requireArguments().getBoolean("DirectShareSheetConstants.is_forwarding") || i2 < i) {
            return false;
        }
        return true;
    }

    public final boolean onBackPressed() {
        requireActivity().setResult(0, (Intent) null);
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1287770203);
        E51.super.onCreate(bundle);
        this.A04 = requireArguments().getParcelableArrayList("DirectShareSheetConstants.initial_share_targets");
        this.A05 = requireArguments().getParcelableArrayList("DirectShareSheetConstants.selected_share_targets");
        this.A02 = requireArguments().getString("DirectShareSheetConstants.session_id");
        this.A03 = requireArguments().getString("DirectShareSheetConstants.sub_session_id");
        AnonymousClass0fD.A09(-1365556932, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-282438333);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_sharesheet_search, viewGroup, false);
        AnonymousClass0fD.A09(-1165390879, A022);
        return inflate;
    }
}
