package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22181Xwr;
import X.C51968G9o;
import com.facebook.djinni.msys.infra.McfReference;

public class ReactionModel {
    public static 2LV CONVERTER = C22181Xwr.A00(46);
    public static long sMcfTypeId;
    public final long reactionExpiryTime;
    public final EmojiModel selectedReaction;

    public static native ReactionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionModel)) {
            return false;
        }
        ReactionModel reactionModel = (ReactionModel) obj;
        return this.selectedReaction.equals(reactionModel.selectedReaction) && this.reactionExpiryTime == reactionModel.reactionExpiryTime;
    }

    public int hashCode() {
        return C21056XCh.A01(this.selectedReaction) + C51968G9o.A03(this.reactionExpiryTime);
    }

    public ReactionModel(EmojiModel emojiModel, long j) {
        emojiModel.getClass();
        this.selectedReaction = emojiModel;
        this.reactionExpiryTime = j;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ReactionModel{selectedReaction=");
        A1A.append(this.selectedReaction);
        A1A.append(",reactionExpiryTime=");
        A1A.append(this.reactionExpiryTime);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
