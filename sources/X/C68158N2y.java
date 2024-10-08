package X;

import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import java.util.List;

/* renamed from: X.N2y  reason: case insensitive filesystem */
public final class C68158N2y extends AnonymousClass0T0 {
    public final C61080JwI A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final StoryTrendingTemplateSectionType A04;
    public final String A05;
    public final String A06;

    public C68158N2y(C61080JwI jwI, StoryTrendingTemplateSectionType storyTrendingTemplateSectionType, String str, String str2, String str3, List list, boolean z) {
        DbW.A1N(str, 1, list);
        this.A01 = str;
        this.A05 = str2;
        this.A00 = jwI;
        this.A03 = z;
        this.A02 = list;
        this.A06 = str3;
        this.A04 = storyTrendingTemplateSectionType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68158N2y) {
                C68158N2y n2y = (C68158N2y) obj;
                if (!0qQ.A0K(this.A01, n2y.A01) || !0qQ.A0K(this.A05, n2y.A05) || !0qQ.A0K(this.A00, n2y.A00) || this.A03 != n2y.A03 || !0qQ.A0K(this.A02, n2y.A02) || !0qQ.A0K(this.A06, n2y.A06) || this.A04 != n2y.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A09(this.A03, (((AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31)) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }
}
