package X;

import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.StoryPromptDisablementState;
import java.util.List;

/* renamed from: X.JuR  reason: case insensitive filesystem */
public final class C60969JuR extends AnonymousClass0T0 {
    public MediaPromptPrefType A00;
    public final MediaPromptPrefType A01;
    public final MWP A02;
    public final MWR A03;
    public final StoryPromptDisablementState A04;
    public final MWS A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public C60969JuR(MediaPromptPrefType mediaPromptPrefType, MediaPromptPrefType mediaPromptPrefType2, MWP mwp, MWR mwr, StoryPromptDisablementState storyPromptDisablementState, MWS mws, String str, List list, List list2, boolean z) {
        0qQ.A0B(mediaPromptPrefType, 4);
        C51974G9v.A1N(storyPromptDisablementState, str, mediaPromptPrefType2);
        AnonymousClass7TF.A1G(mws, 8, list);
        this.A02 = mwp;
        this.A09 = z;
        this.A03 = mwr;
        this.A01 = mediaPromptPrefType;
        this.A04 = storyPromptDisablementState;
        this.A06 = str;
        this.A00 = mediaPromptPrefType2;
        this.A05 = mws;
        this.A07 = list;
        this.A08 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60969JuR) {
                C60969JuR juR = (C60969JuR) obj;
                if (!0qQ.A0K(this.A02, juR.A02) || this.A09 != juR.A09 || !0qQ.A0K(this.A03, juR.A03) || this.A01 != juR.A01 || this.A04 != juR.A04 || !0qQ.A0K(this.A06, juR.A06) || this.A00 != juR.A00 || !0qQ.A0K(this.A05, juR.A05) || !0qQ.A0K(this.A07, juR.A07) || !0qQ.A0K(this.A08, juR.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A02) * 31;
        return AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(this.A09, A0C) + AnonymousClass7TG.A0C(this.A03)) * 31)))))) + AnonymousClass7TE.A0L(this.A08);
    }
}
