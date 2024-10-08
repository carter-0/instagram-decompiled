package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.WQf  reason: case insensitive filesystem */
public final class C19225WQf implements 1wn {
    public final /* synthetic */ C15664UgU A00;
    public final /* synthetic */ C19641Wd4 A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ ProductFeedItem A06;
    public final /* synthetic */ UEM A07;

    public C19225WQf(C15664UgU ugU, C19641Wd4 wd4, C307786Rm r3, C276544tV r4, UserSession userSession, ImageUrl imageUrl, ProductFeedItem productFeedItem, UEM uem) {
        this.A00 = ugU;
        this.A06 = productFeedItem;
        this.A02 = r3;
        this.A04 = userSession;
        this.A07 = uem;
        this.A01 = wd4;
        this.A03 = r4;
        this.A05 = imageUrl;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = AnonymousClass0fD.A03(-761799352);
        AnonymousClass3DT r12 = (AnonymousClass3DT) obj;
        int A033 = AnonymousClass0fD.A03(499150276);
        ProductFeedItem productFeedItem = this.A06;
        if (productFeedItem.A02() != null && r12.A00.BpP().equals(productFeedItem.A02().A0H)) {
            C18706VyX.A01(this.A01, this.A03, this.A04, this.A05, this.A00.A03, productFeedItem, this.A07, AnonymousClass7TE.A0u());
        }
        AnonymousClass0fD.A0A(-1581698848, A033);
        AnonymousClass0fD.A0A(-461567621, A032);
    }
}
