package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.K5o  reason: case insensitive filesystem */
public final class C61394K5o extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FundedContentSelectorFragment";
    public TextView A00;
    public TextView A01;
    public C60276JiX A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A01 = AnonymousClass7TE.A0d(view2, R.id.title);
        this.A00 = AnonymousClass7TE.A0d(view2, R.id.subtitle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.list);
        FragmentActivity requireActivity = requireActivity();
        C60276JiX jiX = this.A02;
        if (jiX != null) {
            C60420JlD jlD = new C60420JlD(requireActivity, AnonymousClass7TE.A0l(this.A03), JTO.A1C(jiX, 54), JTO.A1C(jiX, 55));
            recyclerView.setAdapter(jlD);
            C60276JiX jiX2 = this.A02;
            if (jiX2 != null) {
                if (jiX2 instanceof C61821KNk) {
                    C61821KNk kNk = (C61821KNk) jiX2;
                    C50327FYh fYh = kNk.A02;
                    Integer num = AnonymousClass05K.A01;
                    String str2 = kNk.A06;
                    AnonymousClass0Ud r1 = kNk.A07;
                    Object value = r1.getValue();
                    ((Number) value).longValue();
                    if (AnonymousClass7TF.A1Q((JTT.A0A(r1) > 0 ? 1 : (JTT.A0A(r1) == 0 ? 0 : -1))) || value == null) {
                        str = null;
                    } else {
                        str = value.toString();
                    }
                    fYh.A00(num, (String) null, str2, str);
                }
                View findViewById = view2.findViewById(R.id.loading_indicator);
                View findViewById2 = view2.findViewById(R.id.loading_shimmer);
                07U r13 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new C59700JUh(viewLifecycleOwner, recyclerView, this, jlD, view2, r13, findViewById2, findViewById, (AnonymousClass4D7) null, 7), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            }
        }
        0qQ.A0F("viewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        long j;
        String str;
        C60276JiX jiX = this.A02;
        boolean A1V = AnonymousClass7TF.A1V(jiX);
        String str2 = null;
        if (A1V) {
            if (jiX != null) {
                j = JTT.A0A(jiX.A07);
                C60276JiX jiX2 = this.A02;
                if (jiX2 != null) {
                    C266444Yx r1 = (C266444Yx) jiX2.A08.getValue();
                    if (!(j == 0 || r1 == null)) {
                        str2 = Dba.A0Y(this, r1);
                    }
                }
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        j = 0;
        if (j != 0) {
            str = String.valueOf(j);
        } else {
            str = "not_funded";
        }
        Intent putExtra = DbS.A09().putExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID", str).putExtra("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_NAME", str2);
        0qQ.A07(putExtra);
        DbX.A17(putExtra, this);
        if (A1V) {
            C60276JiX jiX3 = this.A02;
            if (jiX3 != null) {
                if (jiX3 instanceof C61821KNk) {
                    C61821KNk kNk = (C61821KNk) jiX3;
                    kNk.A02.A00(AnonymousClass05K.A0C, str2, kNk.A06, str);
                }
            }
            0qQ.A0F("viewModel");
            throw AnonymousClass00P.createAndThrow();
        }
        return false;
    }

    public final void configureActionBar(2da r3) {
        int i;
        Context A0B = JTT.A0B(this, r3);
        C60276JiX jiX = this.A02;
        if (jiX == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        if (jiX instanceof C61820KNj) {
            i = 2131955324;
        } else {
            i = 2131953933;
        }
        DbW.A1C(r3, A0B.getString(i));
    }

    public final void onCreate(Bundle bundle) {
        long j;
        C61266K0b k0b;
        int A022 = AnonymousClass0fD.A02(2108953798);
        C61394K5o.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_FUNDED_CONTENT_DEAL_ID");
        if (string == null || string.length() == 0 || "not_funded".equals(string)) {
            j = 0;
        } else {
            j = Long.parseLong(string);
        }
        boolean z = requireArguments.getBoolean("ClipsConstants.ARG_CLIPS_SHOULD_SHOW_BONUSES_DEAL");
        int i = requireArguments.getInt("ClipsConstants.ARG_CLIPS_CONTENT_SCHEDULED_PUBLISH_TIME");
        if (z) {
            AnonymousClass0eM r2 = this.A03;
            k0b = new C61266K0b(AnonymousClass7TE.A0l(r2));
            DbY.A0v(requireContext(), k0b, this, r2);
        } else {
            k0b = null;
        }
        this.A02 = JTO.A0L(new KEQ(AnonymousClass7TE.A0l(this.A03), k0b, Integer.valueOf(i), requireArguments.getString(AnonymousClass000.A00(99)), j, z), requireActivity()).A00(C60276JiX.class);
        AnonymousClass0fD.A09(-830217133, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1514488048);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_share_content_funding, false);
        AnonymousClass0fD.A09(-988307083, A022);
        return A0D;
    }
}
