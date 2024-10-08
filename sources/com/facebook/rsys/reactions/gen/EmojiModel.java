package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22181Xwr;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class EmojiModel {
    public static 2LV CONVERTER = C22181Xwr.A00(42);
    public static long sMcfTypeId;
    public final String emojiClickId;
    public final String emojiId;
    public final int type;

    public static native EmojiModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiModel)) {
            return false;
        }
        EmojiModel emojiModel = (EmojiModel) obj;
        return this.emojiId.equals(emojiModel.emojiId) && this.emojiClickId.equals(emojiModel.emojiClickId) && this.type == emojiModel.type;
    }

    public int hashCode() {
        return AnonymousClass7TF.A08(this.emojiClickId, C66583MXo.A06(this.emojiId)) + this.type;
    }

    public EmojiModel(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.emojiId = str;
        this.emojiClickId = str2;
        this.type = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmojiModel{emojiId=");
        A1A.append(this.emojiId);
        A1A.append(",emojiClickId=");
        A1A.append(this.emojiClickId);
        A1A.append(",type=");
        return C21056XCh.A0A(A1A, this.type);
    }
}
