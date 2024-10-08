package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.H1p  reason: case insensitive filesystem */
public final class C54170H1p extends AnonymousClass4DH implements C273414mX {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageFilterFragment";
    public C55500Hii A00;
    public C54662HMt A01;
    public final C284945Oz A02 = C51970G9q.A0S(C54662HMt.ALL);
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final String A04 = "open_carousel_review_page_filter_fragment";

    public final /* synthetic */ void Cyc() {
    }

    public final void Cyf() {
        Object value;
        GMQ gmq;
        C55500Hii hii = this.A00;
        if (hii != null) {
            C284945Oz r0 = this.A02;
            C54662HMt hMt = (C54662HMt) r0.getValue();
            boolean A1a = C51969G9p.A1a(r0.getValue(), this.A01);
            0qQ.A0B(hMt, 0);
            if (A1a) {
                05G r3 = G9w.A0Z(hii.A00.A0D).A04;
                do {
                    value = r3.getValue();
                    gmq = (GMQ) value;
                } while (!r3.AIY(value, GMQ.A00(gmq, (1Xj) null, hMt, (Integer) null, 00k.A0T(ITJ.A00, (Collection) gmq.A02), (List) null, (List) null, (Map) null, 109)));
            }
        }
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2092723040);
        ComposeView A0H = DbV.A0H(this, JGK.A01(this, 48), -1618745220);
        AnonymousClass0fD.A09(-884182577, A022);
        return A0H;
    }
}
