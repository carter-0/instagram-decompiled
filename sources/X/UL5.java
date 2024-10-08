package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

public final class UL5 extends AnonymousClass0T0 {
    public final C56078HsR A00;
    public final C266444Yx A01;
    public final ImageInfo A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06 = true;

    public UL5(C56078HsR hsR, C266444Yx r3, ImageInfo imageInfo, List list, boolean z, boolean z2) {
        this.A01 = r3;
        this.A00 = hsR;
        this.A02 = imageInfo;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UL5) {
                UL5 ul5 = (UL5) obj;
                if (!0qQ.A0K(this.A01, ul5.A01) || !0qQ.A0K(this.A00, ul5.A00) || !0qQ.A0K(this.A02, ul5.A02) || this.A05 != ul5.A05 || this.A04 != ul5.A04 || !0qQ.A0K(this.A03, ul5.A03) || this.A06 != ul5.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A01);
        return DbS.A06(this.A06, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, (AnonymousClass7TF.A07(this.A00, A0K) + AnonymousClass7TG.A0C(this.A02)) * 31))) * 31 * 31 * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data(contentDescription=");
        sb.append(this.A01);
        sb.append(", imageContentDescription=");
        sb.append(this.A00);
        sb.append(", imageInfo=");
        sb.append(this.A02);
        sb.append(", isSaveButtonVisible=");
        sb.append(this.A05);
        sb.append(", isSaveButtonSelected=");
        sb.append(this.A04);
        sb.append(", labels=");
        sb.append(this.A03);
        sb.append(", labelsLineCount=");
        sb.append((Object) null);
        sb.append(", merchantTextSubtitle=");
        sb.append((String) null);
        sb.append(", roundedCornerRadius=");
        sb.append((Object) null);
        sb.append(", shouldHaveBorder=");
        return G9t.A1C(sb, this.A06);
    }
}
