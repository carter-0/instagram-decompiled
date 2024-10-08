package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.ProductDiscountInformationDict;

/* renamed from: X.UeD  reason: case insensitive filesystem */
public final class C15524UeD extends C231632rz {
    public final VP7 A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        AnonymousClass7TF.A1H(r3, obj);
        r3.A7V(0, obj, 0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C15524UeD(VP7 vp7, boolean z) {
        this.A01 = z;
        this.A00 = vp7;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(536248320);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.discounts.DiscountsViewBinder.Holder");
        VWQ vwq = (VWQ) tag;
        ProductDiscountInformationDict productDiscountInformationDict = (ProductDiscountInformationDict) obj;
        boolean z = this.A01;
        VP7 vp7 = this.A00;
        0qQ.A0B(vwq, 0);
        AnonymousClass7TG.A1P(productDiscountInformationDict, vp7);
        JTQ.A0A(vwq.A02).setText(productDiscountInformationDict.getName());
        AnonymousClass0eM r3 = vwq.A00;
        JTQ.A0A(r3).setText(productDiscountInformationDict.getDescription());
        if (z) {
            AnonymousClass0eM r32 = vwq.A01;
            JTQ.A0A(r32).setText(productDiscountInformationDict.getCtaText());
            WBD.A00(AnonymousClass7TH.A06(r32), 60, productDiscountInformationDict, vp7);
            JTS.A1W(r32, 0);
        } else {
            0nA.A0T(AnonymousClass7TH.A06(r3), AnonymousClass7TE.A0B(AnonymousClass7TH.A06(r3).getResources()));
            AnonymousClass7TH.A06(vwq.A01).setVisibility(8);
        }
        AnonymousClass0fD.A0A(626073807, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1608836953);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.discounts_details_layout, false);
        A0A.setTag(new VWQ(A0A));
        AnonymousClass0fD.A0A(1492457914, A04);
        return A0A;
    }
}
