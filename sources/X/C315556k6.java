package X;

import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Map;

/* renamed from: X.6k6  reason: invalid class name and case insensitive filesystem */
public final class C315556k6 extends C310436b3 {
    public final CreativeConfigIntf A00;
    public final PromptStickerModel A01;
    public final C310416b1 A02;
    public final Map A03;

    public C315556k6(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C310416b1 r4, Map map) {
        0qQ.A0B(promptStickerModel, 1);
        0qQ.A0B(r4, 2);
        this.A01 = promptStickerModel;
        this.A02 = r4;
        this.A00 = creativeConfigIntf;
        this.A03 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C315556k6) {
                C315556k6 r5 = (C315556k6) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        CreativeConfigIntf creativeConfigIntf = this.A00;
        int i = 0;
        int hashCode2 = (hashCode + (creativeConfigIntf == null ? 0 : creativeConfigIntf.hashCode())) * 31;
        Map map = this.A03;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }
}
