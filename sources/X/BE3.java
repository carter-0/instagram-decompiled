package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.util.List;

public final class BE3 extends AnonymousClass0T0 implements C66563MWr {
    public final AudioBrowserCategoryType A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BE3) {
                BE3 be3 = (BE3) obj;
                if (this.A00 != be3.A00 || !0qQ.A0K(this.A01, be3.A01) || !0qQ.A0K(this.A03, be3.A03) || !0qQ.A0K(this.A02, be3.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final AudioBrowserCategoryType AmL() {
        return this.A00;
    }

    public final List Bf2() {
        return this.A03;
    }

    public final String getId() {
        return this.A01;
    }

    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0C(this.A00) * 31)));
    }

    public BE3(AudioBrowserCategoryType audioBrowserCategoryType, String str, String str2, List list) {
        AnonymousClass7TG.A1Q(str, list);
        0qQ.A0B(str2, 4);
        this.A00 = audioBrowserCategoryType;
        this.A01 = str;
        this.A03 = list;
        this.A02 = str2;
    }

    public final C66563MWr E79(1E9 r1) {
        return this;
    }
}
