package X;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Qeq  reason: case insensitive filesystem */
public final class C8003Qeq extends QEW {
    public final ContextThemeWrapper A00;
    public final boolean A01;

    public final void A0B(QFE qfe, SUj sUj) {
        C7X c7x;
        ImmutableList A0E;
        0sn A02;
        List list;
        FrameLayout.LayoutParams layoutParams;
        ImmutableList A0E2;
        boolean A1U = AnonymousClass7TF.A1U(0, sUj, qfe);
        AnonCheckoutPuxLink anonCheckoutPuxLink = (AnonCheckoutPuxLink) sUj.A01;
        if (SUj.A0V(sUj) && anonCheckoutPuxLink != null) {
            ShimmerFrameLayout shimmerFrameLayout = qfe.A01;
            shimmerFrameLayout.A05();
            String str = null;
            shimmerFrameLayout.setBackground((Drawable) null);
            if (this.A01) {
                if (anonCheckoutPuxLink.A02) {
                    A02 = 0sn.A00;
                    c7x = anonCheckoutPuxLink.A00;
                    if (c7x == null || (A0E2 = c7x.A0E()) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    list = C11295SKd.A01(A0E2, AnonymousClass2E0.A0A().A03(this.A00, 17), 0);
                } else {
                    c7x = anonCheckoutPuxLink.A00;
                    if (c7x == null || (A0E = c7x.A0E()) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    A02 = C11295SKd.A02(A0E, 0, false);
                    list = 0sn.A00;
                }
                TextView textView = qfe.A00;
                String A0l = C41845B3m.A0l(c7x, 0);
                if (A0l != null) {
                    AnonymousClass7TF.A1B(A02, A1U ? 1 : 0, list);
                    C11232SGr.A00(textView, new C12469Sv1(0, this, qfe), new QmZ(A0l, A02, list));
                    textView.setMovementMethod(new LinkMovementMethod());
                    SPB A0A = AnonymousClass2E0.A0A();
                    ContextThemeWrapper contextThemeWrapper = this.A00;
                    textView.setLinkTextColor(A0A.A03(contextThemeWrapper, 5));
                    Integer valueOf = Integer.valueOf(contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                    SSH.A03(textView, (Integer) null, (Integer) null, valueOf, valueOf);
                    SSH.A03(shimmerFrameLayout, 0, 0, 0, 0);
                    SRn.A02(textView, RH2.A14);
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                        layoutParams.gravity = 8388611;
                        textView.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            SSH.A03(shimmerFrameLayout, (Integer) null, (Integer) null, 0, (Integer) null);
            TextView textView2 = qfe.A00;
            SRn.A02(textView2, RH2.A1G);
            AnonymousClass0fU.A00(this.A00, textView2);
            C7X c7x2 = anonCheckoutPuxLink.A00;
            if (c7x2 != null) {
                str = C41845B3m.A0l(c7x2, 0);
            }
            textView2.setText(str);
        } else if (SUj.A0T(sUj)) {
            qfe.A01.A06(A1U);
        }
    }

    public C8003Qeq(ContextThemeWrapper contextThemeWrapper, LoggingContext loggingContext, boolean z) {
        super(RH6.A09, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = z;
    }
}
