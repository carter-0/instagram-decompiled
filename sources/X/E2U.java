package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.IGRevShareProductType;

public final class E2U extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PublisherControlBlockedCategoriesFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131963677);
        r3.Eu5(new FPD((Object) this, 46), true);
    }

    public final String getModuleName() {
        return "publisher_control_blocked_categories";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C51654FyG fyG;
        String string;
        SpannableStringBuilder A0C;
        int A06;
        int i;
        String quantityString;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.blocked_category_disclaimer_text);
        AnonymousClass0eM r5 = this.A03;
        IGRevShareProductType iGRevShareProductType = ((C46773Dl0) r5.getValue()).A02;
        IGRevShareProductType iGRevShareProductType2 = IGRevShareProductType.PROFILE_ADS;
        Object value = r5.getValue();
        if (iGRevShareProductType == iGRevShareProductType2) {
            fyG = new C51654FyG(value, 9);
            string = AnonymousClass7TE.A16(requireContext(), 2131963681);
            int i2 = ((C46773Dl0) r5.getValue()).A01;
            if (i2 == -1) {
                Context requireContext = requireContext();
                int i3 = 2131963686;
                if (AnonymousClass7TF.A1Z(this.A00)) {
                    i3 = 2131963668;
                }
                quantityString = DbW.A0h(requireContext, string, i3);
            } else {
                Resources A05 = DbV.A05(this);
                boolean A1Z = AnonymousClass7TF.A1Z(this.A00);
                int i4 = R.plurals.ig_profile_publisher_control_non_revshare_blocked_categories_screen_description_text;
                if (A1Z) {
                    i4 = R.plurals.ig_profile_feed_reels_publisher_control_non_revshare_blocked_categories_screen_description_text;
                }
                quantityString = A05.getQuantityString(i4, i2, new Object[]{string, Integer.valueOf(i2)});
            }
            A0C = DbS.A0C(quantityString);
            A06 = Dbb.A06(this);
            i = 42;
        } else {
            fyG = new C51654FyG(value, 10);
            int i5 = ((C46773Dl0) r5.getValue()).A01;
            string = requireContext().getString(2131963681);
            A0C = DbS.A0C(Dbb.A09(this, string).getQuantityString(R.plurals.ig_overlay_ads_publisher_control_revshare_blocked_categories_screen_description_text, i5, new Object[]{string, Integer.valueOf(i5)}));
            A06 = Dbb.A06(this);
            i = 41;
        }
        AnonymousClass7AV.A05(A0C, new ESx((0sP) fyG, A06, i), string);
        DbX.A1G(A0R, A0C);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view2, R.id.recycler_view);
        DbY.A16(this, recyclerView);
        C46817Dlt dlt = new C46817Dlt(new C51654FyG(r5.getValue(), 11));
        recyclerView.setAdapter(dlt);
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new JTw((Object) view2, (Object) r9, (Object) dlt, (Object) recyclerView, (Object) this, (Object) viewLifecycleOwner, (AnonymousClass4D7) null, 21), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public E2U() {
        C51791G2a g2a = new C51791G2a(this, 46);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 43), 44));
        this.A03 = DbS.A0I(new C51791G2a(A002, 45), g2a, new MJ4(4, (Object) null, A002), DbS.A0z(C46773Dl0.class));
        this.A00 = C51791G2a.A00(this, 41);
        this.A01 = C51791G2a.A00(this, 42);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(60368995);
        E2U.super.onCreate(bundle);
        ((C46329Dbx) this.A01.getValue()).A00.A04();
        AnonymousClass0fD.A09(1412940939, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1927008881);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_blocked_category, false);
        AnonymousClass0fD.A09(1061087750, A022);
        return A0D;
    }
}
