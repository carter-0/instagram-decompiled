package X;

public enum RFO {
    FACE_NOT_VISIBLE("face_not_visible"),
    FACE_NOT_CENTERED("face_not_centered"),
    EYES_CLOSED("eyes_closed"),
    FACE_UP("face_up"),
    HOLD_STILL("hold_still"),
    AUTOGEN_READY("autogen_ready"),
    AUTOGEN_FINISHED("autogen_finished"),
    AUTOGEN_ALIGNED("autogen_aligned");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        RFO[] rfoArr;
        A01 = 0oU.A00(rfoArr);
    }

    /* access modifiers changed from: public */
    RFO(String str) {
        this.A00 = str;
    }
}
