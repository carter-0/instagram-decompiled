package X;

public enum RH1 {
    APP_STARTUP_START(true),
    APP_STARTUP_END(true),
    CREATE_REACT_CONTEXT_END(true),
    INIT_REACT_RUNTIME_START(true),
    INIT_REACT_RUNTIME_END(true),
    RUN_JS_BUNDLE_START(true),
    RUN_JS_BUNDLE_END(true),
    NATIVE_MODULE_SETUP_START(true),
    NATIVE_MODULE_SETUP_END(true),
    loadApplicationScript_startStringConvert(true),
    loadApplicationScript_endStringConvert(true),
    REGISTER_JS_SEGMENT_START(true),
    REGISTER_JS_SEGMENT_STOP(true);
    
    public boolean A00;

    public static RH1 A00(String str, int i) {
        return new RH1(str, i, false);
    }

    /* access modifiers changed from: public */
    RH1(boolean z) {
        this.A00 = z;
    }
}
