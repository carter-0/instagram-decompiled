package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C21056XCh;
import X.C22181Xwr;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class EmojiReactionsModel {
    public static 2LV CONVERTER = C22181Xwr.A00(43);
    public static long sMcfTypeId;
    public final ArrayList allowedGifDomains;
    public final ArrayList emojiParticipants;
    public final boolean isEmojiReactionsFeatureEnabled;
    public final PendingReactionModel pendingReaction;

    public static native EmojiReactionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmojiReactionsModel)) {
                return false;
            }
            EmojiReactionsModel emojiReactionsModel = (EmojiReactionsModel) obj;
            if (!this.emojiParticipants.equals(emojiReactionsModel.emojiParticipants) || this.isEmojiReactionsFeatureEnabled != emojiReactionsModel.isEmojiReactionsFeatureEnabled) {
                return false;
            }
            PendingReactionModel pendingReactionModel = this.pendingReaction;
            PendingReactionModel pendingReactionModel2 = emojiReactionsModel.pendingReaction;
            if (pendingReactionModel == null) {
                if (pendingReactionModel2 != null) {
                    return false;
                }
            } else if (!pendingReactionModel.equals(pendingReactionModel2)) {
                return false;
            }
            ArrayList arrayList = this.allowedGifDomains;
            ArrayList arrayList2 = emojiReactionsModel.allowedGifDomains;
            if (arrayList != null) {
                return arrayList.equals(arrayList2);
            }
            if (arrayList2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((((C21056XCh.A01(this.emojiParticipants) + (this.isEmojiReactionsFeatureEnabled ? 1 : 0)) * 31) + AnonymousClass7TG.A0C(this.pendingReaction)) * 31) + AnonymousClass7TE.A0L(this.allowedGifDomains);
    }

    public EmojiReactionsModel(ArrayList arrayList, boolean z, PendingReactionModel pendingReactionModel, ArrayList arrayList2) {
        arrayList.getClass();
        this.emojiParticipants = arrayList;
        this.isEmojiReactionsFeatureEnabled = z;
        this.pendingReaction = pendingReactionModel;
        this.allowedGifDomains = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmojiReactionsModel{emojiParticipants=");
        A1A.append(this.emojiParticipants);
        A1A.append(",isEmojiReactionsFeatureEnabled=");
        A1A.append(this.isEmojiReactionsFeatureEnabled);
        A1A.append(",pendingReaction=");
        A1A.append(this.pendingReaction);
        A1A.append(",allowedGifDomains=");
        return C66582MXn.A0v(this.allowedGifDomains, A1A);
    }
}
