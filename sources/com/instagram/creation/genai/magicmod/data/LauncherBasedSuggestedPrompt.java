package com.instagram.creation.genai.magicmod.data;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C255463uA;
import X.C73533PeP;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class LauncherBasedSuggestedPrompt extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C73533PeP.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LauncherBasedSuggestedPrompt) {
                LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt = (LauncherBasedSuggestedPrompt) obj;
                if (!0qQ.A0K(this.A01, launcherBasedSuggestedPrompt.A01) || !0qQ.A0K(this.A00, launcherBasedSuggestedPrompt.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ LauncherBasedSuggestedPrompt(String str, String str2, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C73533PeP.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        if ((i & 2) != 0) {
            this.A00 = str2;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0E(this.A00);
    }
}
