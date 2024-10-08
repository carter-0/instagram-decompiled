package X;

import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.instagram.common.session.UserSession;

/* renamed from: X.QKq  reason: case insensitive filesystem */
public final class C7575QKq extends C11364SPc implements B3J, C13923TlR, C13922TlQ {
    public final IgPromoAdsExtension A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;
    public final 11S A04 = new 11S("^(?=.*\\/checkout(?:s)?\\/(?!$)(?=.*\\/thank_you)|.*\\/post_purchase|.*\\/purchase\\/thanks)(?!.*\\/checkout(?:s)?\\/$).*");
    public final 11S A05 = new 11S("^(?!.*\\/checkout(?:s)?\\/$)(?=.*\\/checkout(?:s)?\\/(?!$)(?!.*\\/thank(?:s)?))(?!.*\\/thank(?:_you)?|.*\\/post_purchase|.*\\/purchase\\/thanks).*");

    public C7575QKq(IgPromoAdsExtension igPromoAdsExtension, UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = igPromoAdsExtension;
        this.A03 = str2;
    }
}
