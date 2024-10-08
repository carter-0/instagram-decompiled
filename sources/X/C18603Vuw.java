package X;

import android.os.Parcelable;
import com.instagram.api.schemas.BusinessProfileDict;
import com.instagram.api.schemas.BusinessProfileDictImpl;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.user.model.User;

/* renamed from: X.Vuw  reason: case insensitive filesystem */
public final class C18603Vuw {
    public static final C14272Tsv A02;
    public static final C14272Tsv A03;
    public static final int[] A04;
    public static final int[] A05;
    public SMBSupportStickerDict A00;
    public boolean A01;

    public C18603Vuw(User user, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        BusinessProfileDictImpl businessProfileDictImpl = new BusinessProfileDictImpl(user.Bh3(), user.getId(), user.getUsername());
        String A0F = 0nH.A0F(i);
        String A0F2 = 0nH.A0F(i2);
        this.A00 = new SMBSupportStickerDict(businessProfileDictImpl, C253543qx.A00(VG1.A00(num)), Float.valueOf((float) i3), str, A0F, (String) null, (String) null, (String) null, A0F2, str2, (String) null, 0nH.A0F(i4), 0nH.A0G(i5), str3, 0nH.A0F(i6));
        this.A01 = z;
    }

    static {
        C14272Tsv tsv = (C14272Tsv) DbZ.A0g(C17164VKt.A01, 0);
        A02 = tsv;
        A04 = C14276Tsz.A02(tsv);
        C14272Tsv tsv2 = C14272Tsv.SOLID_WHITE;
        A03 = tsv2;
        A05 = C14276Tsz.A02(tsv2);
    }

    public final User A00() {
        BusinessProfileDict businessProfileDict = this.A00.A00;
        if (businessProfileDict == null) {
            return null;
        }
        Parcelable.Creator creator = User.CREATOR;
        User user = new User(businessProfileDict.getId(), businessProfileDict.getUsername());
        user.A0l(businessProfileDict.Bh3());
        return user;
    }

    public final Integer A01() {
        SMBPartnerType sMBPartnerType = this.A00.A01;
        if (sMBPartnerType == null) {
            return null;
        }
        String str = sMBPartnerType.A00;
        0qQ.A0B(str, 0);
        Integer num = AnonymousClass05K.A00;
        if (!str.equals("gift_card")) {
            num = AnonymousClass05K.A01;
            if (!str.equals("food_delivery")) {
                num = AnonymousClass05K.A0C;
                if (str.equals("get_quote")) {
                    return num;
                }
                return null;
            }
        }
        return num;
    }
}
