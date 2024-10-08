package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.Jxa  reason: case insensitive filesystem */
public final class C61124Jxa extends AnonymousClass0T0 implements MWU {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C61120JxW A03;
    public final StoryPromptDisablementState A04;
    public final C61121JxX A05;
    public final String A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61124Jxa) {
                C61124Jxa jxa = (C61124Jxa) obj;
                if (!0qQ.A0K(this.A03, jxa.A03) || this.A01 != jxa.A01 || this.A04 != jxa.A04 || !0qQ.A0K(this.A06, jxa.A06) || this.A02 != jxa.A02 || !0qQ.A0K(this.A05, jxa.A05) || !0qQ.A0K(this.A07, jxa.A07) || !0qQ.A0K(this.A08, jxa.A08) || this.A00 != jxa.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A01, AnonymousClass7TG.A0C(this.A03) * 31)))))) + AnonymousClass7TE.A0L(this.A08)) * 31) + this.A00;
    }

    public C61124Jxa(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C61120JxW jxW, StoryPromptDisablementState storyPromptDisablementState, C61121JxX jxX, String str, List list, List list2, int i) {
        C51974G9v.A1S(mediaPromptPrefType, storyPromptDisablementState, str, mediaPromptPrefType2, jxX);
        0qQ.A0B(list, 7);
        this.A03 = jxW;
        this.A01 = mediaPromptPrefType;
        this.A04 = storyPromptDisablementState;
        this.A06 = str;
        this.A02 = mediaPromptPrefType2;
        this.A05 = jxX;
        this.A07 = list;
        this.A08 = list2;
        this.A00 = i;
    }
}
