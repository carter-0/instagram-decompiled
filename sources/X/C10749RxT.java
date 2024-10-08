package X;

import com.facebookpay.otc.models.OtcInput;
import com.google.gson.annotations.SerializedName;

/* renamed from: X.RxT  reason: case insensitive filesystem */
public final class C10749RxT {
    public final OtcInput A00;
    @SerializedName("orderId")
    public final String A01;
    @SerializedName("productId")
    public final String A02;
    @SerializedName("receiverId")
    public final String A03;
    @SerializedName("sessionId")
    public final String A04;

    public C10749RxT(OtcInput otcInput, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(str, str2);
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A00 = otcInput;
    }
}
