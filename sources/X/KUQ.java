package X;

import android.os.Parcelable;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.List;

public final class KUQ extends C64808LiT {
    public Parcelable A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public final void A00(boolean z) {
        C61219JzC jzC;
        C61220JzD jzD = this.A01;
        List list = jzD.A05;
        String str = jzD.A02;
        String str2 = jzD.A03;
        List list2 = jzD.A06;
        String str3 = jzD.A04;
        MediaKitSectionType mediaKitSectionType = jzD.A01;
        C61219JzC jzC2 = jzD.A00;
        if (jzC2 != null) {
            List list3 = jzC2.A00;
            AnonymousClass7TH.A0K();
            jzC = C63317Kv0.A00(list3, z);
        } else {
            jzC = null;
        }
        this.A01 = C63319Kv2.A00(jzC, mediaKitSectionType, str, str2, str3, list, list2);
        this.A03 = z;
    }
}
