package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;

/* renamed from: X.Wxi  reason: case insensitive filesystem */
public final class C20711Wxi extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20711Wxi(Object obj, Object obj2, Object obj3, String str, String str2, int i, boolean z, boolean z2) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = str;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            double A002 = JTO.A00(obj);
            UserSession userSession = (UserSession) this.A02;
            C270734hD.A02((Context) this.A01, userSession, (C270734hD) this.A03, this.A04, this.A05, A002, this.A07, this.A06);
            return C60340gF.A00;
        }
        Context context = (Context) obj;
        0qQ.A0B(context, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = this.A05;
        String str2 = this.A04;
        boolean z = this.A07;
        Integer valueOf = Integer.valueOf(C324476zN.A00(context));
        CharSequence charSequence = str;
        if (z) {
            charSequence = C324476zN.A03(context, valueOf, str, str2);
        }
        spannableStringBuilder.append(charSequence);
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = (ProductCheckoutPropertiesIntf) this.A01;
        boolean z2 = this.A06;
        ProductCardSubtitleType productCardSubtitleType = (ProductCardSubtitleType) this.A02;
        if (productCardSubtitleType == null) {
            return spannableStringBuilder;
        }
        int ordinal = productCardSubtitleType.ordinal();
        if ((ordinal != 10 && ordinal != 11) || !z2 || productCheckoutPropertiesIntf == null) {
            return spannableStringBuilder;
        }
        Boolean bool = false;
        if (!bool.equals(productCheckoutPropertiesIntf.BgA())) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(" · ");
        spannableStringBuilder.append(context.getString(2131969827));
        return spannableStringBuilder;
    }
}
