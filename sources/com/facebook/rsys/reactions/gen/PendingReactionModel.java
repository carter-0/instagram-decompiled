package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;

public class PendingReactionModel {
    public static 2LV CONVERTER = C22181Xwr.A00(45);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final int source;

    public static native PendingReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingReactionModel)) {
            return false;
        }
        PendingReactionModel pendingReactionModel = (PendingReactionModel) obj;
        return this.emoji.equals(pendingReactionModel.emoji) && this.source == pendingReactionModel.source;
    }

    public int hashCode() {
        return C21056XCh.A01(this.emoji) + this.source;
    }

    public PendingReactionModel(EmojiModel emojiModel, int i) {
        emojiModel.getClass();
        this.emoji = emojiModel;
        this.source = i;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PendingReactionModel{emoji=");
        A1A.append(this.emoji);
        A1A.append(",source=");
        return C21056XCh.A0A(A1A, this.source);
    }
}
