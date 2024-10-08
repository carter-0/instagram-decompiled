package X;

public enum EX3 {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    PREFILL_COMPOSER_WITH_META_AI("PREFILL_COMPOSER_WITH_META_AI"),
    PREFILL_COMPOSER_WITH_PROMPT("PREFILL_COMPOSER_WITH_PROMPT");
    
    public final String A00;

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    EX3(String str) {
        this.A00 = str;
    }
}
