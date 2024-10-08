package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class MetaAiState {
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public static native MetaAiState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiState)) {
                return false;
            }
            MetaAiState metaAiState = (MetaAiState) obj;
            if (this.state != metaAiState.state) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = this.botContent;
            MetaAiBotContent metaAiBotContent2 = metaAiState.botContent;
            if (metaAiBotContent == null) {
                if (metaAiBotContent2 != null) {
                    return false;
                }
            } else if (!metaAiBotContent.equals(metaAiBotContent2)) {
                return false;
            }
            MetaAiUserContent metaAiUserContent = this.userContent;
            MetaAiUserContent metaAiUserContent2 = metaAiState.userContent;
            if (metaAiUserContent != null) {
                return metaAiUserContent.equals(metaAiUserContent2);
            }
            if (metaAiUserContent2 != null) {
                return false;
            }
        }
    }

    public final int hashCode() {
        return ((C66583MXo.A01(this.state) + AnonymousClass7TG.A0C(this.botContent)) * 31) + AnonymousClass7TE.A0L(this.userContent);
    }

    public MetaAiState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiState{state=");
        A1A.append(this.state);
        A1A.append(",botContent=");
        A1A.append(this.botContent);
        A1A.append(",userContent=");
        return C66582MXn.A0v(this.userContent, A1A);
    }
}
