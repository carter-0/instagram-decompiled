package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.model.BoostGuidanceItemResponse;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.Dm9  reason: case insensitive filesystem */
public final class C46833Dm9 extends 2Rw {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C46833Dm9(Context context, FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, AnonymousClass0iw r5, UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 7);
        this.A08 = z;
        this.A03 = businessFlowAnalyticsLogger;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A05 = userSession;
        this.A04 = r5;
    }

    public final void onBindViewHolder(C249703kE r10, int i) {
        0qQ.A0B(r10, 0);
        C46952Do6 do6 = (C46952Do6) r10;
        if (i < this.A00.size()) {
            BoostGuidanceItemResponse boostGuidanceItemResponse = (BoostGuidanceItemResponse) this.A00.get(i);
            String str = boostGuidanceItemResponse.A01;
            View view = do6.A00;
            Context context = view.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_height);
            do6.A02.setUrl(this.A05, new SimpleImageUrl(str, context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_width), dimensionPixelSize), this.A04);
            FPE.A01(view, 18, boostGuidanceItemResponse, this);
            view.setVisibility(0);
            do6.A01.setText(boostGuidanceItemResponse.A02);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        boolean z = this.A08;
        int i2 = R.layout.boost_guidance_preview_item;
        if (z) {
            i2 = R.layout.boost_guidance_list_preview_item;
        }
        int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46952Do6(DbT.A0D(DbV.A0D(viewGroup), viewGroup, i2, false));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-333334979);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-620012711, A032);
        return size;
    }
}
