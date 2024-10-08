package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22181Xwr;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class SendEmojiInputModel {
    public static 2LV CONVERTER = C22181Xwr.A00(48);
    public static long sMcfTypeId;
    public final String emojiId;
    public final int source;
    public final int type;

    public static native SendEmojiInputModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmojiInputModel)) {
            return false;
        }
        SendEmojiInputModel sendEmojiInputModel = (SendEmojiInputModel) obj;
        return this.emojiId.equals(sendEmojiInputModel.emojiId) && this.type == sendEmojiInputModel.type && this.source == sendEmojiInputModel.source;
    }

    public int hashCode() {
        return ((C66583MXo.A06(this.emojiId) + this.type) * 31) + this.source;
    }

    public SendEmojiInputModel(String str, int i, int i2) {
        str.getClass();
        this.emojiId = str;
        this.type = i;
        this.source = i2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SendEmojiInputModel{emojiId=");
        A1A.append(this.emojiId);
        A1A.append(",type=");
        A1A.append(this.type);
        A1A.append(",source=");
        return C21056XCh.A0A(A1A, this.source);
    }
}
