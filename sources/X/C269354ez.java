package X;

/* renamed from: X.4ez  reason: invalid class name and case insensitive filesystem */
public enum C269354ez implements C269364f0 {
    USE_ANNOTATIONS(true),
    USE_GETTERS_AS_SETTERS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    INFER_PROPERTY_MUTATORS(true),
    ALLOW_VOID_VALUED_PROPERTIES(false),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    USE_STATIC_TYPING(false),
    USE_BASE_TYPE_AS_DEFAULT_IMPL(false),
    INFER_BUILDER_TYPE_BINDINGS(true),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    SORT_CREATOR_PROPERTIES_FIRST(true),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    ACCEPT_CASE_INSENSITIVE_ENUMS(false),
    ACCEPT_CASE_INSENSITIVE_VALUES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    ALLOW_COERCION_OF_SCALARS(true),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true),
    IGNORE_MERGE_FOR_UNMERGEABLE(true),
    BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES(false);
    
    public final long A00;
    public final boolean A01;

    public final boolean ARn() {
        return this.A01;
    }

    @Deprecated
    public final int BP4() {
        return (int) this.A00;
    }

    /* access modifiers changed from: public */
    C269354ez(boolean z) {
        this.A01 = z;
        this.A00 = 1 << ordinal();
    }
}
