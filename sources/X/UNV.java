package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import com.instagram.reels.chat.model.ChatStickerStickerType;

public final class UNV extends AnonymousClass0T0 implements C21039XAs {
    public final ChatStickerChannelType A00;
    public final ChatStickerStickerType A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final UNV F9e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UNV) {
                UNV unv = (UNV) obj;
                if (!0qQ.A0K(this.A02, unv.A02) || !0qQ.A0K(this.A03, unv.A03) || this.A00 != unv.A00 || this.A01 != unv.A01 || !0qQ.A0K(this.A04, unv.A04) || !0qQ.A0K(this.A05, unv.A05) || !0qQ.A0K(this.A06, unv.A06) || !0qQ.A0K(this.A07, unv.A07) || !0qQ.A0K(this.A08, unv.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Integer AdO() {
        return this.A02;
    }

    public final String Amd() {
        return this.A03;
    }

    public final ChatStickerChannelType An3() {
        return this.A00;
    }

    public final ChatStickerStickerType Bzn() {
        return this.A01;
    }

    public final String C0I() {
        return this.A04;
    }

    public final String C6D() {
        return this.A06;
    }

    public final String C6E() {
        return this.A07;
    }

    public final String C6f() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryChallengeChatDict", V8A.A00(this));
    }

    public final String getText() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + C41845B3m.A00(this.A08);
    }

    public UNV(ChatStickerChannelType chatStickerChannelType, ChatStickerStickerType chatStickerStickerType, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A02 = num;
        this.A03 = str;
        this.A00 = chatStickerChannelType;
        this.A01 = chatStickerStickerType;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
    }
}
