package X;

/* renamed from: X.7sZ  reason: invalid class name and case insensitive filesystem */
public enum C344877sZ {
    UNDEFINED(true),
    COLOR_FILTER_CHANGE(false),
    DOODLE_DATA(false),
    INPUT_PREVIEW(true, false, true),
    INPUT_PREVIEW_METADATA(true),
    INPUT_PREVIEW_SIZE(true, true, false),
    INPUT_FACING(true, true, false),
    INPUT_ROTATION(true, true, false),
    INPUT_START_RECORDING(true),
    INPUT_STOP_RECORDING(true),
    INPUT_CAPTURE_PHOTO(true),
    INPUT_STOP_CAPTURE_PHOTO(true),
    INPUT_RESET(true),
    INPUT_CAPTURE_CONTEXT(true, true, false),
    PREVIEW_VIEW_SIZE(true, true, false),
    RESET(true),
    PARTICLES_CONFIG(false),
    MSQRD_EFFECT(false),
    MSQRD_RESET_EFFECT(false),
    FPS_TOGGLE_EVENT(false),
    FRAME_EFFECT(false),
    OVERLAY_CONFIG(false),
    TOUCH_INPUT_CONFIG(false, true, false),
    IMMERSIVE_EVENT(false),
    STOP_RECORDING_EVENT(false),
    MARS_SYNCHRONIZATION(false),
    WARM_UP_EFFECT(false),
    FRAME_RENDERED(true),
    SWIPE_EVENT(true),
    MOTION_EFFECT_EVENT(false),
    EXTERNAL_WORLD_TRACKING_EVENT(true, false, true),
    PLATFORM_ALGORITHM_DATA_EVENT(true, false, true),
    FRAME_RENDER_START(true),
    GL_RENDERER(true),
    ANIMATION_RESET(false),
    ANIMATION_PAUSE(false),
    CONFIGURATION(false),
    IGLU_FILTER_UPDATER(false),
    UPDATE_PREVIEW_FRAME(false),
    ENABLE_SINGLE_FRAME_SOURCE(false),
    BACKGROUND_GRADIENT(false),
    ZOOM_CROP(false),
    MEDIA_ENHANCE(false),
    WARM_UP_RENDER_SESSION(false);
    
    public static final C344877sZ[] A03 = null;
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    /* access modifiers changed from: public */
    static {
        A03 = values();
    }

    /* access modifiers changed from: public */
    C344877sZ(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }

    /* access modifiers changed from: public */
    C344877sZ(boolean z) {
        this(r7, r8, z, false, false);
    }
}
