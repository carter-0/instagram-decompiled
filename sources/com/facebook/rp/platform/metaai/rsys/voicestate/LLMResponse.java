package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.HSY;
import com.google.gson.annotations.SerializedName;

public final class LLMResponse extends AnonymousClass0T0 {
    public static final HSY Companion = new Object();
    @SerializedName("genaiViewModels")
    public final GenAIViewModels genAIViewModels;

    public final GenAIViewModels component1() {
        return this.genAIViewModels;
    }

    public final LLMResponse copy(GenAIViewModels genAIViewModels2) {
        return new LLMResponse(genAIViewModels2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LLMResponse) && 0qQ.A0K(this.genAIViewModels, ((LLMResponse) obj).genAIViewModels));
    }

    public static /* synthetic */ LLMResponse copy$default(LLMResponse lLMResponse, GenAIViewModels genAIViewModels2, int i, Object obj) {
        if ((i & 1) != 0) {
            genAIViewModels2 = lLMResponse.genAIViewModels;
        }
        return new LLMResponse(genAIViewModels2);
    }

    public final GenAIViewModels getGenAIViewModels() {
        return this.genAIViewModels;
    }

    public int hashCode() {
        return AnonymousClass7TG.A0C(this.genAIViewModels);
    }

    public LLMResponse(GenAIViewModels genAIViewModels2) {
        this.genAIViewModels = genAIViewModels2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LLMResponse(genAIViewModels=");
        return AnonymousClass7TG.A0n(this.genAIViewModels, A1A);
    }
}
