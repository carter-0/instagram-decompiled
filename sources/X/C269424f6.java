package X;

/* renamed from: X.4f6  reason: invalid class name and case insensitive filesystem */
public enum C269424f6 implements C269364f0 {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    WRITE_SELF_REFERENCES_AS_NULL(false),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_ENUM_KEYS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    USE_EQUALITY_FOR_OBJECT_ID(false);
    
    public final int A00;
    public final boolean A01;

    public final boolean ARn() {
        return this.A01;
    }

    public final int BP4() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C269424f6(boolean z) {
        this.A01 = z;
        this.A00 = 1 << ordinal();
    }
}
