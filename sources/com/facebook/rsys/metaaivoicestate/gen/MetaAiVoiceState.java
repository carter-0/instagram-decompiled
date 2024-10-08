package com.facebook.rsys.metaaivoicestate.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class MetaAiVoiceState {
    public static 2LV CONVERTER = C22181Xwr.A00(11);
    public static long sMcfTypeId;
    public final MetaAiBotContent botContent;
    public final int state;
    public final MetaAiUserContent userContent;

    public static native MetaAiVoiceState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiVoiceState)) {
                return false;
            }
            MetaAiVoiceState metaAiVoiceState = (MetaAiVoiceState) obj;
            if (this.state != metaAiVoiceState.state) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = this.botContent;
            MetaAiBotContent metaAiBotContent2 = metaAiVoiceState.botContent;
            if (metaAiBotContent == null) {
                if (metaAiBotContent2 != null) {
                    return false;
                }
            } else if (!metaAiBotContent.equals(metaAiBotContent2)) {
                return false;
            }
            MetaAiUserContent metaAiUserContent = this.userContent;
            MetaAiUserContent metaAiUserContent2 = metaAiVoiceState.userContent;
            if (metaAiUserContent != null) {
                return metaAiUserContent.equals(metaAiUserContent2);
            }
            if (metaAiUserContent2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return ((C66583MXo.A01(this.state) + AnonymousClass7TG.A0C(this.botContent)) * 31) + AnonymousClass7TE.A0L(this.userContent);
    }

    public MetaAiVoiceState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent) {
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiVoiceState{state=");
        A1A.append(this.state);
        A1A.append(",botContent=");
        A1A.append(this.botContent);
        A1A.append(",userContent=");
        return C66582MXn.A0v(this.userContent, A1A);
    }
}
