package X;

import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.79B  reason: invalid class name */
public abstract class AnonymousClass79B {
    public static final DirectPromptTypes A01(String str) {
        if (!(str == null || str.length() == 0)) {
            for (DirectPromptTypes directPromptTypes : DirectPromptTypes.values()) {
                if (str.equals(directPromptTypes.A01)) {
                    return directPromptTypes;
                }
            }
            if (str.equals("challenge_winner")) {
                return DirectPromptTypes.CHALLENGES;
            }
        }
        return DirectPromptTypes.UNKNOWN;
    }

    public static final DirectPromptTypes A00(int i) {
        for (DirectPromptTypes directPromptTypes : DirectPromptTypes.values()) {
            if (i == directPromptTypes.A00) {
                return directPromptTypes;
            }
        }
        return DirectPromptTypes.UNKNOWN;
    }
}
