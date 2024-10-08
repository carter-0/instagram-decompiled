package X;

/* renamed from: X.9cH  reason: invalid class name and case insensitive filesystem */
public final class C381759cH extends AnonymousClass0T0 {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381759cH) {
                C381759cH r5 = (C381759cH) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A06 == r5.A06 && this.A03 == r5.A03 && this.A07 == r5.A07 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A08 == r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Integer num = this.A00;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "CONFIG_V2";
                    break;
                case 2:
                    str = "OTHER";
                    break;
                default:
                    str = "DEFAULT";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int A09 = AnonymousClass7TF.A09(this.A02, hashCode * 31);
        int A002 = C54732HQn.A00();
        return ((((((((((((AnonymousClass7TF.A09(this.A08, (((((((((AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, (((((AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A01, (((A09 + A002) * 31) + A002) * 31)))) + A002) * 31) + A002) * 31) + A002) * 31)) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002) * 31) + A002;
    }

    public C381759cH(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
        this.A06 = z3;
        this.A03 = z4;
        this.A07 = z5;
        this.A04 = z6;
        this.A05 = z7;
        this.A08 = z8;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StoryXpostContentConfig(configSource=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "CONFIG_V2";
                    break;
                case 2:
                    str = "OTHER";
                    break;
                default:
                    str = "DEFAULT";
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", supportFeedSticker=");
        A1A.append(this.A02);
        A1A.append(", supportClipsStory=");
        A1A.append(false);
        A1A.append(", supportClipsReshareOfXpostIneligibleMedia=");
        A1A.append(false);
        A1A.append(", supportClipsReshareStory=");
        A1A.append(this.A01);
        A1A.append(", supportProductShareSticker=");
        A1A.append(this.A06);
        A1A.append(", supportLinkSticker=");
        A1A.append(this.A03);
        A1A.append(", supportQuestionSticker=");
        A1A.append(this.A07);
        A1A.append(", supportShoppingSticker=");
        A1A.append(false);
        A1A.append(", supportFbEntitySticker=");
        A1A.append(false);
        A1A.append(", supportMentionReshareOfXpostIneligibleMedia=");
        A1A.append(false);
        A1A.append(", supportMentionReshare=");
        A1A.append(this.A04);
        A1A.append(", supportMusicSticker=");
        A1A.append(this.A05);
        A1A.append(", supportImmersiveMentionReshare=");
        A1A.append(false);
        A1A.append(", supportPhotoCredSticker=");
        A1A.append(false);
        A1A.append(", supportIgtvSticker=");
        A1A.append(false);
        A1A.append(", supportArchiveFeedSticker=");
        A1A.append(false);
        A1A.append(", supportStoryTemplateReshareXpostIneligibleItems=");
        A1A.append(false);
        A1A.append(", supportStoryTemplate=");
        A1A.append(this.A08);
        A1A.append(", supportSecretSticker=");
        A1A.append(false);
        A1A.append(", supportThreadsReshare=");
        A1A.append(false);
        A1A.append(", supportReelMemoryShare=");
        A1A.append(false);
        A1A.append(", supportImagineStories=");
        A1A.append(false);
        A1A.append(", supportMagicMod=");
        A1A.append(false);
        A1A.append(", supportBrandedContent=");
        A1A.append(false);
        A1A.append(", supportCommentShareSticker=");
        A1A.append(false);
        return AnonymousClass7TG.A0p(A1A);
    }
}
