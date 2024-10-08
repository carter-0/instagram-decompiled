package X;

import com.instagram.api.schemas.StoryPromptTappableData;
import java.util.List;

/* renamed from: X.N5v  reason: case insensitive filesystem */
public final class C68206N5v extends AnonymousClass0T0 implements C232262tL {
    public final int A00;
    public final StoryPromptTappableData A01;
    public final BHW A02;
    public final List A03;
    public final List A04;

    public C68206N5v(StoryPromptTappableData storyPromptTappableData, BHW bhw, List list, List list2, int i) {
        0qQ.A0B(storyPromptTappableData, 1);
        this.A01 = storyPromptTappableData;
        this.A02 = bhw;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68206N5v) {
                C68206N5v n5v = (C68206N5v) obj;
                if (!0qQ.A0K(this.A01, n5v.A01) || !0qQ.A0K(this.A02, n5v.A02) || this.A00 != n5v.A00 || !0qQ.A0K(this.A03, n5v.A03) || !0qQ.A0K(this.A04, n5v.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.A0M;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        StoryPromptTappableData storyPromptTappableData;
        C68206N5v n5v = (C68206N5v) obj;
        String str2 = this.A01.A0M;
        if (n5v == null || (storyPromptTappableData = n5v.A01) == null) {
            str = null;
        } else {
            str = storyPromptTappableData.A0M;
        }
        return 0qQ.A0K(str2, str);
    }
}
