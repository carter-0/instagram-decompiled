package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.4KO  reason: invalid class name */
public final class AnonymousClass4KO extends AnonymousClass0T0 {
    public final long A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass4KO(Integer num, String str, String str2, String str3, long j, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(num, 4);
        this.A07 = z;
        this.A05 = z2;
        this.A00 = j;
        this.A01 = num;
        this.A02 = str;
        this.A04 = str2;
        this.A06 = z3;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4KO) {
                AnonymousClass4KO r8 = (AnonymousClass4KO) obj;
                if (!(this.A07 == r8.A07 && this.A05 == r8.A05 && this.A00 == r8.A00 && this.A01 == r8.A01 && 0qQ.A0K(this.A02, r8.A02) && 0qQ.A0K(this.A04, r8.A04) && this.A06 == r8.A06 && 0qQ.A0K(this.A03, r8.A03))) {
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
        int hashCode2;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A00;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "PERMANENT_VIDEO_COVER";
                break;
            case 2:
                str = "EPHEMERAL_IMAGE";
                break;
            case 3:
                str = "EPHEMERAL_VIDEO_COVER";
                break;
            case 4:
                str = AnonymousClass000.A00(2417);
                break;
            case 5:
                str = "FEED_IMAGE_RESHARE";
                break;
            case 6:
                str = C273654mx.A00(503);
                break;
            case 7:
                str = "STORY_REPLY";
                break;
            case 8:
                str = "STORY_MENTION";
                break;
            case 9:
                str = "STORY_OTHER";
                break;
            case 10:
                str = "STACKS_IMAGE";
                break;
            case 11:
                str = "STACKS_VIDEO_COVER";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "LINK_PREVIEW";
                break;
            case 13:
                str = "XMA_OTHER";
                break;
            case 14:
                str = "OTHER";
                break;
            case 15:
                str = "AVATAR_STICKER";
                break;
            default:
                str = "PERMANENT_IMAGE";
                break;
        }
        int hashCode3 = (i5 + str.hashCode() + intValue) * 31;
        String str2 = this.A02;
        int i6 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i7 = (hashCode3 + hashCode) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str3.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        int i9 = 1237;
        if (this.A06) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        String str4 = this.A03;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i10 + i6;
    }
}
