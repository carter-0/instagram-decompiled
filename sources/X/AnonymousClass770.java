package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.770  reason: invalid class name */
public final class AnonymousClass770 implements C3264476u {
    public static final AnonymousClass770 A00 = new Object();

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r72, AnonymousClass9HC r73, AnonymousClass7LQ r74) {
        float f;
        float f2;
        AnonymousClass74T r27;
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        float f3;
        ExtendedImageUrl extendedImageUrl;
        ExtendedImageUrl extendedImageUrl2;
        String username;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass7FE r15 = r72;
        0qQ.A0B(r15, 2);
        AnonymousClass9HC r14 = r73;
        0qQ.A0B(r14, 3);
        AnonymousClass7LQ r5 = r74;
        0qQ.A0B(r5, 4);
        C254703su r4 = r5.A0e;
        0qQ.A07(r4);
        Object obj = r4.A1T;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectProductShare");
        Product A002 = C14502TxO.A00((ProductDetailsProductItemDict) ((C61078JwG) obj).A00);
        User user = r5.A0K;
        DirectMessageIdentifier A0V = r4.A0V();
        User user2 = A002.A0B;
        AnonymousClass774 r28 = null;
        if (!(user2 == null || (username = user2.A03.getUsername()) == null || username.length() == 0)) {
            r28 = new AnonymousClass774((Drawable) null, (Drawable) null, username, (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 0sr.A1N(user2.A03.Bh3()));
        }
        ImageInfo imageInfo = A002.A08;
        if (imageInfo != null) {
            ExtendedImageUrl A01 = 1iI.A01(context2, imageInfo);
            if (A01 != null) {
                List Al9 = imageInfo.Al9();
                if (Al9 == null || (extendedImageUrl2 = (ExtendedImageUrl) 00k.A0O(Al9, 0)) == null) {
                    f = 1.0f;
                } else {
                    f = (float) extendedImageUrl2.getWidth();
                }
                int i = (int) f;
                Integer valueOf = Integer.valueOf(i);
                List Al92 = imageInfo.Al9();
                if (Al92 == null || (extendedImageUrl = (ExtendedImageUrl) 00k.A0O(Al92, 0)) == null) {
                    f2 = 1.0f;
                } else {
                    f2 = (float) extendedImageUrl.getHeight();
                }
                int i2 = (int) f2;
                Integer valueOf2 = Integer.valueOf(i2);
                float f4 = 1.0f;
                if (!(valueOf == null || valueOf2 == null)) {
                    if (i2 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = ((float) i) / ((float) i2);
                    }
                    Float valueOf3 = Float.valueOf(f3);
                    if (valueOf3 != null) {
                        f4 = valueOf3.floatValue();
                    }
                }
                AnonymousClass776 r18 = new AnonymousClass776(A01, false, Float.valueOf(f4), valueOf, valueOf2, (Integer) null, (String) null);
                String str5 = A002.A0J;
                if (str5 == null || (length = str5.length()) == 0) {
                    r27 = null;
                } else {
                    SpannableString spannableString = new SpannableString(str5);
                    StyleSpan styleSpan = new StyleSpan(1);
                    Pattern pattern = 0mp.A00;
                    spannableString.setSpan(styleSpan, 0, length, 17);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C324476zN.A08(context2, A002, Integer.valueOf(R.style.FullPriceSubtitleStyle), Integer.valueOf(R.style.ProductPriceColor)));
                    String str6 = A002.A0K;
                    if (str6 != null) {
                        spannableStringBuilder.append(" ");
                        spannableStringBuilder.append(C324476zN.A02(context2, userSession2, str6, A002.A05()));
                    }
                    r27 = new AnonymousClass74T((ImageUrl) null, (ImageUrl) null, (C254893tE) null, spannableString, (CharSequence) null, (CharSequence) null, spannableStringBuilder, (CharSequence) null, (CharSequence) null, 1, 1, (Integer) null, (Integer) null, (String) null, 1);
                }
                if (user2 != null) {
                    str = AnonymousClass3ZA.A00(user2);
                } else {
                    str = null;
                }
                if (user2 != null) {
                    str2 = user2.A03.getUsername();
                } else {
                    str2 = null;
                }
                String A06 = 0mp.A06("http://www.instagram.com/_n/product_display_page?business_user_id=%s&merchant_name=%s&product_id=%s&prior_module=direct_thread&entry_point=direct", new Object[]{str, str2, A002.A0H});
                String str7 = r4.A1u;
                0qQ.A07(str7);
                AnonymousClass9J6 r1 = new AnonymousClass9J6(A06, str7, 5);
                if (user != null) {
                    str3 = user.getUsername();
                } else {
                    str3 = null;
                }
                AnonymousClass9J6 r0 = new AnonymousClass9J6(context2.getString(2131959132, new Object[]{str3}), context2.getString(2131959107), 3);
                C254883tD r33 = C254883tD.SINGLE;
                if (user != null) {
                    str4 = user.getUsername();
                } else {
                    str4 = null;
                }
                return new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, r1, r0, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, AnonymousClass7FG.A00(context2, userSession2, r14, r5, r4.A10), r15, r27, r28, r18, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r33, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
