package com.facebook.rsys.metaaivoicestate.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C41845B3m;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class MetaAiBotContent {
    public static 2LV CONVERTER = C22181Xwr.A00(7);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;
    public final String llmResponseContents;

    public static native MetaAiBotContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiBotContent)) {
                return false;
            }
            MetaAiBotContent metaAiBotContent = (MetaAiBotContent) obj;
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = metaAiBotContent.caption;
            if (metaAiCaption == null) {
                if (metaAiCaption2 != null) {
                    return false;
                }
            } else if (!metaAiCaption.equals(metaAiCaption2)) {
                return false;
            }
            String str = this.llmResponseContents;
            String str2 = metaAiBotContent.llmResponseContents;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return C66583MXo.A01(AnonymousClass7TG.A0C(this.caption)) + C41845B3m.A00(this.llmResponseContents);
    }

    public MetaAiBotContent(MetaAiCaption metaAiCaption, String str) {
        this.caption = metaAiCaption;
        this.llmResponseContents = str;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiBotContent{caption=");
        A1A.append(this.caption);
        A1A.append(",llmResponseContents=");
        return C66584MXp.A0a(this.llmResponseContents, A1A);
    }
}
