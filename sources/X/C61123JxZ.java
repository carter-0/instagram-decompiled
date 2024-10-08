package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.JxZ  reason: case insensitive filesystem */
public final class C61123JxZ extends AnonymousClass0T0 implements YBL {
    public final int A00;
    public final MediaPromptPrefType A01;
    public final MediaPromptPrefType A02;
    public final C61118JxU A03;
    public final C61120JxW A04;
    public final StoryPromptDisablementState A05;
    public final C61121JxX A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;

    public C61123JxZ(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, C61118JxU jxU, C61120JxW jxW, StoryPromptDisablementState storyPromptDisablementState, C61121JxX jxX, String str, List list, List list2, int i, boolean z) {
        0qQ.A0B(mediaPromptPrefType, 4);
        C51974G9v.A1N(storyPromptDisablementState, str, mediaPromptPrefType2);
        AnonymousClass7TF.A1G(jxX, 8, list);
        this.A03 = jxU;
        this.A0A = z;
        this.A04 = jxW;
        this.A01 = mediaPromptPrefType;
        this.A05 = storyPromptDisablementState;
        this.A07 = str;
        this.A02 = mediaPromptPrefType2;
        this.A06 = jxX;
        this.A08 = list;
        this.A09 = list2;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61123JxZ) {
                C61123JxZ jxZ = (C61123JxZ) obj;
                if (!0qQ.A0K(this.A03, jxZ.A03) || this.A0A != jxZ.A0A || !0qQ.A0K(this.A04, jxZ.A04) || this.A01 != jxZ.A01 || this.A05 != jxZ.A05 || !0qQ.A0K(this.A07, jxZ.A07) || this.A02 != jxZ.A02 || !0qQ.A0K(this.A06, jxZ.A06) || !0qQ.A0K(this.A08, jxZ.A08) || !0qQ.A0K(this.A09, jxZ.A09) || this.A00 != jxZ.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A03) * 31;
        return ((AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A06, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(this.A0A, A0C) + AnonymousClass7TG.A0C(this.A04)) * 31)))))) + AnonymousClass7TE.A0L(this.A09)) * 31) + this.A00;
    }
}
