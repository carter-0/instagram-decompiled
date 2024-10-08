package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C22181Xwr;
import X.C51972G9s;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class EmojiReactionsParticipantModel {
    public static 2LV CONVERTER = C22181Xwr.A00(44);
    public static long sMcfTypeId;
    public final EmojiModel emoji;
    public final long emojiExpiryTime;
    public final String participantId;
    public final ArrayList reactions;

    public static native EmojiReactionsParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiReactionsParticipantModel)) {
            return false;
        }
        EmojiReactionsParticipantModel emojiReactionsParticipantModel = (EmojiReactionsParticipantModel) obj;
        return this.participantId.equals(emojiReactionsParticipantModel.participantId) && this.emoji.equals(emojiReactionsParticipantModel.emoji) && this.emojiExpiryTime == emojiReactionsParticipantModel.emojiExpiryTime && this.reactions.equals(emojiReactionsParticipantModel.reactions);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.reactions, C51972G9s.A07(this.emojiExpiryTime, AnonymousClass7TF.A07(this.emoji, C66583MXo.A06(this.participantId))));
    }

    public EmojiReactionsParticipantModel(String str, EmojiModel emojiModel, long j, ArrayList arrayList) {
        C66581MXm.A1R(str, emojiModel, arrayList);
        this.participantId = str;
        this.emoji = emojiModel;
        this.emojiExpiryTime = j;
        this.reactions = arrayList;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EmojiReactionsParticipantModel{participantId=");
        A1A.append(this.participantId);
        A1A.append(",emoji=");
        A1A.append(this.emoji);
        A1A.append(",emojiExpiryTime=");
        A1A.append(this.emojiExpiryTime);
        A1A.append(",reactions=");
        return C66582MXn.A0v(this.reactions, A1A);
    }
}
