package X;

import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JzD  reason: case insensitive filesystem */
public final class C61220JzD extends AnonymousClass0T0 implements C66554MWi {
    public final C61219JzC A00;
    public final MediaKitSectionType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;

    public C61220JzD(C61219JzC jzC, MediaKitSectionType mediaKitSectionType, String str, String str2, String str3, List list, List list2) {
        0qQ.A0B(str2, 3);
        C51972G9s.A1E(str3, mediaKitSectionType);
        this.A05 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = list2;
        this.A00 = jzC;
        this.A04 = str3;
        this.A01 = mediaKitSectionType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61220JzD) {
                C61220JzD jzD = (C61220JzD) obj;
                if (!0qQ.A0K(this.A05, jzD.A05) || !0qQ.A0K(this.A02, jzD.A02) || !0qQ.A0K(this.A03, jzD.A03) || !0qQ.A0K(this.A06, jzD.A06) || !0qQ.A0K(this.A00, jzD.A00) || !0qQ.A0K(this.A04, jzD.A04) || this.A01 != jzD.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static C62661KkN A00(C61220JzD jzD, AbstractMap abstractMap, int i) {
        abstractMap.put("section_id", jzD.A03);
        abstractMap.put("section_position", String.valueOf(i));
        return C63312Kuv.A00(jzD.A01);
    }

    public final int hashCode() {
        String str = this.A03;
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A08(this.A04, (((AnonymousClass7TF.A08(str, ((AnonymousClass7TG.A0C(this.A05) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31));
    }

    public static boolean A01(Object obj, Iterator it) {
        return 0qQ.A0K(((C61220JzD) it.next()).A03, obj);
    }
}
