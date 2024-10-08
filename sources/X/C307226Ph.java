package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6Ph  reason: invalid class name and case insensitive filesystem */
public final class C307226Ph implements C2365734g {
    public final /* synthetic */ C307216Pg A00;

    public C307226Ph(C307216Pg r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307216Pg r1 = this.A00;
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.thumbnail_container);
        0qQ.A0B(viewGroup, 0);
        r1.A06 = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) view.requireViewById(R.id.rounded_thumbnail_container);
        0qQ.A0B(viewGroup2, 0);
        r1.A01 = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) view.requireViewById(R.id.rounded_thumbnail_with_title_container);
        0qQ.A0B(viewGroup3, 0);
        r1.A02 = viewGroup3;
        ViewGroup viewGroup4 = (ViewGroup) view.requireViewById(R.id.rounded_three_thumbnail_container);
        0qQ.A0B(viewGroup4, 0);
        r1.A00 = viewGroup4;
        IgTextView requireViewById = view.requireViewById(R.id.collection_ad_headline_text);
        0qQ.A0B(requireViewById, 0);
        r1.A07 = requireViewById;
        ViewGroup viewGroup5 = (ViewGroup) view.requireViewById(R.id.collection_ad_six_thumbnail_second_card);
        0qQ.A0B(viewGroup5, 0);
        r1.A05 = viewGroup5;
        ViewGroup viewGroup6 = (ViewGroup) view.requireViewById(R.id.collection_ad_four_thumbnail_second_card_with_title);
        0qQ.A0B(viewGroup6, 0);
        r1.A04 = viewGroup6;
        ViewGroup viewGroup7 = (ViewGroup) view.requireViewById(R.id.collection_ad_four_thumbnail_second_card);
        0qQ.A0B(viewGroup7, 0);
        r1.A03 = viewGroup7;
    }
}
