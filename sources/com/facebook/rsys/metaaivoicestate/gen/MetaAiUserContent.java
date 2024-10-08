package com.facebook.rsys.metaaivoicestate.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;

public class MetaAiUserContent {
    public static 2LV CONVERTER = C22181Xwr.A00(10);
    public static long sMcfTypeId;
    public final MetaAiCaption caption;

    public static native MetaAiUserContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaAiUserContent)) {
                return false;
            }
            MetaAiCaption metaAiCaption = this.caption;
            MetaAiCaption metaAiCaption2 = ((MetaAiUserContent) obj).caption;
            if (metaAiCaption != null) {
                return metaAiCaption.equals(metaAiCaption2);
            }
            if (metaAiCaption2 != null) {
                return false;
            }
        }
    }

    public int hashCode() {
        return 527 + AnonymousClass7TG.A0C(this.caption);
    }

    public MetaAiUserContent(MetaAiCaption metaAiCaption) {
        this.caption = metaAiCaption;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MetaAiUserContent{caption=");
        return C66582MXn.A0v(this.caption, A1A);
    }
}
