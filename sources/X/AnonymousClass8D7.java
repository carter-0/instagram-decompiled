package X;

import android.view.View;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import java.util.List;

/* renamed from: X.8D7  reason: invalid class name */
public final class AnonymousClass8D7 implements C2802350v {
    public View A00;
    public IGAIAgentType A01;
    public UNW A02;
    public ImageUrl A03;
    public 2FW A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final UOB A0E;

    public AnonymousClass8D7(View view, IGAIAgentType iGAIAgentType, UNW unw, ImageUrl imageUrl, 2FW r6, UOB uob, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        this.A0E = uob;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = imageUrl;
        this.A00 = view;
        this.A0B = z;
        this.A0D = z2;
        this.A0C = z3;
        this.A02 = unw;
        this.A01 = iGAIAgentType;
        this.A04 = r6;
        this.A05 = str3;
        this.A0A = z4;
        this.A08 = str4;
        this.A09 = str5;
    }

    public final int A00() {
        Integer num;
        UOB uob = this.A0E;
        if (uob == null || (num = uob.A09) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String A01() {
        String str;
        UOB uob = this.A0E;
        if (uob == null || (str = uob.A0M) == null) {
            return "";
        }
        return str;
    }

    public final boolean A02() {
        ChatStickerChannelType chatStickerChannelType;
        UOB uob = this.A0E;
        if (uob == null || (chatStickerChannelType = uob.A03) == null) {
            chatStickerChannelType = ChatStickerChannelType.BROADCAST;
        }
        if (chatStickerChannelType == ChatStickerChannelType.AI_AGENT) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ List B5h() {
        return 0sn.A00;
    }

    public final C273914nO BkW() {
        C273914nO r1 = new C273914nO();
        r1.A01 = C273924nP.STATIC_STICKERS;
        return r1;
    }

    public final Integer CAk() {
        return AnonymousClass05K.A0o;
    }

    public AnonymousClass8D7() {
        this((View) null, (IGAIAgentType) null, (UNW) null, (ImageUrl) null, (2FW) null, (UOB) null, "", "", (String) null, (String) null, (String) null, false, false, false, false);
    }
}
