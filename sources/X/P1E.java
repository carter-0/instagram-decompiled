package X;

import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.model.direct.DirectThreadKey;

public final class P1E implements AnonymousClass7HL {
    public final /* synthetic */ C68444NIh A00;

    public final void D00() {
    }

    public final void DMs(int i) {
    }

    public final boolean Dj1(String str) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 0);
        C68444NIh nIh = this.A00;
        String str4 = nIh.A0E;
        if (str4 == null) {
            return false;
        }
        C333537Zi r2 = nIh.A0B;
        if (r2 == null) {
            str2 = "sendMessageManager";
        } else {
            DirectThreadKey directThreadKey = nIh.A0C;
            if (directThreadKey == null) {
                str2 = "threadKey";
            } else {
                r2.EMO((C254933tI) null, directThreadKey, "questions", (String) null, str4, str3, (String) null);
                AnonymousClass7IQ r3 = (AnonymousClass7IQ) nIh.A0H.getValue();
                AnonymousClass2Ep r0 = nIh.A0A;
                str2 = "thread";
                if (r0 != null) {
                    String C6C = r0.C6C();
                    AnonymousClass2Ep r02 = nIh.A0A;
                    if (r02 != null) {
                        String C6k = r02.C6k();
                        AnonymousClass2Ep r03 = nIh.A0A;
                        if (r03 != null) {
                            int C6a = r03.C6a();
                            AnonymousClass2Ep r04 = nIh.A0A;
                            if (r04 != null) {
                                r3.A00(DirectPromptTypes.QUESTIONS, C6C, C6k, C6a, r04.AdN());
                                return true;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public P1E(C68444NIh nIh) {
        this.A00 = nIh;
    }
}
