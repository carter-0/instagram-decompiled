package com.facebook.rsys.metaaivoicestate.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class MetaAiCaption {
    public static 2LV CONVERTER = C22181Xwr.A00(8);
    public static long sMcfTypeId;
    public final String language;
    public final String text;

    public static native MetaAiCaption createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaAiCaption)) {
            return false;
        }
        MetaAiCaption metaAiCaption = (MetaAiCaption) obj;
        return this.text.equals(metaAiCaption.text) && this.language.equals(metaAiCaption.language);
    }

    public int hashCode() {
        return C66583MXo.A06(this.text) + this.language.hashCode();
    }

    public String toString() {
        return 002.A11("MetaAiCaption{text=", this.text, ",language=", this.language, "}");
    }

    public MetaAiCaption(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.text = str;
        this.language = str2;
    }
}
