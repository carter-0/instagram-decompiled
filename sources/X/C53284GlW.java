package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.util.List;

/* renamed from: X.GlW  reason: case insensitive filesystem */
public final class C53284GlW extends AnonymousClass0T0 {
    public final ThreadContainerType A00;
    public final ThreadHeaderStyle A01;
    public final BBD A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C53284GlW(ThreadContainerType threadContainerType, ThreadHeaderStyle threadHeaderStyle, BBD bbd, String str, String str2, List list) {
        C51973G9u.A0r(1, str, list, threadContainerType);
        this.A04 = str;
        this.A03 = str2;
        this.A01 = threadHeaderStyle;
        this.A05 = list;
        this.A00 = threadContainerType;
        this.A02 = bbd;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53284GlW) {
                C53284GlW glW = (C53284GlW) obj;
                if (!0qQ.A0K(this.A04, glW.A04) || !0qQ.A0K(this.A03, glW.A03) || this.A01 != glW.A01 || !0qQ.A0K(this.A05, glW.A05) || this.A00 != glW.A00 || !0qQ.A0K(this.A02, glW.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A05, (((AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31)) + AnonymousClass7TE.A0L(this.A02);
    }
}
