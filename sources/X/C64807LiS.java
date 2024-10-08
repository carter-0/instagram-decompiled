package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.LiS  reason: case insensitive filesystem */
public final class C64807LiS implements C232262tL {
    public final SpannableStringBuilder A00;
    public final ImageUrl A01;
    public final L8Z A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public C64807LiS(SpannableStringBuilder spannableStringBuilder, ImageUrl imageUrl, L8Z l8z, Integer num, String str, String str2, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A00 = spannableStringBuilder;
        this.A01 = imageUrl;
        this.A02 = l8z;
        this.A04 = str3;
        this.A03 = num;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
