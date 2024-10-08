package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import java.util.Map;

/* renamed from: X.Wca  reason: case insensitive filesystem */
public final class C19611Wca implements C20988X8e {
    public C320156rr A00;
    public final Context A01;
    public final FeaturedProductMediaFeedGridConfiguration A02;
    public final C19742Wej A03;
    public final C20931X4w A04;
    public final Map A05;

    public final void Epa() {
    }

    public final C3253572b Afm() {
        return (C3253572b) this.A05.get(this.A00);
    }

    public final C320156rr B0w() {
        return this.A00;
    }

    public final void FKG() {
        C320156rr r0;
        C320156rr r2 = this.A00;
        C19742Wej wej = this.A03;
        if (wej.isLoading() && !(!wej.A02.isEmpty())) {
            r0 = C320156rr.LOADING;
        } else if (wej.CT5() || (!wej.A02.isEmpty())) {
            r0 = C320156rr.ERROR;
        } else {
            r0 = C320156rr.EMPTY;
        }
        this.A00 = r0;
        if (r0 != r2) {
            this.A04.FKH();
        }
    }

    public C19611Wca(Context context, C20931X4w x4w, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, C19742Wej wej) {
        AnonymousClass7TG.A1Q(featuredProductMediaFeedGridConfiguration, wej);
        this.A01 = context;
        this.A02 = featuredProductMediaFeedGridConfiguration;
        this.A03 = wej;
        this.A04 = x4w;
        C320156rr r6 = C320156rr.EMPTY;
        this.A00 = r6;
        C320156rr r1 = C320156rr.LOADING;
        C3253572b r0 = new C3253572b();
        C13991Tnr.A0s(context, r0);
        0eP r4 = new 0eP(r1, r0);
        C3253572b r5 = new C3253572b();
        C13991Tnr.A0s(context, r5);
        r5.A0D = featuredProductMediaFeedGridConfiguration.A03;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration2 = this.A02;
        String str = featuredProductMediaFeedGridConfiguration2.A02;
        if (str != null) {
            spannableStringBuilder.append(str);
        }
        String str2 = featuredProductMediaFeedGridConfiguration2.A01;
        if (str2 != null) {
            String A16 = AnonymousClass7TE.A16(this.A01, 2131964884);
            spannableStringBuilder.append(" ").append(AnonymousClass7AV.A00(DbT.A09(str2), A16, A16));
        }
        r5.A07 = spannableStringBuilder;
        0eP r3 = new 0eP(r6, r5);
        C320156rr r2 = C320156rr.ERROR;
        C3253572b r12 = new C3253572b();
        C13991Tnr.A0s(context, r12);
        r12.A02 = R.drawable.loadmore_icon_refresh_compound;
        WBC.A01(r12, this, 50);
        this.A05 = DbY.A0q(r2, r12, r4, r3);
    }

    public static void A00(AnonymousClass0eM r0) {
        ((C19611Wca) r0.getValue()).FKG();
    }
}
