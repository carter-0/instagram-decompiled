package X;

import java.util.List;

/* renamed from: X.8Eg  reason: invalid class name */
public enum AnonymousClass8Eg {
    RETINA_FACE_FACIAL_LANDMARKS("fan_e2e_fbnetv2_100", r4, 0, 2),
    RETINA_FACE("retinaface_e2e_face_detection", r4, 1, 1),
    SCENE_UNDERSTANDING("PYTORCH_MODEL", 0sr.A1P(new String[]{"xray_vocab.json", "concept_vocab.json"}), 2, 10020),
    SCENEX_EXECUTORCH("PYTORCH_MODEL", 0sr.A1P(new String[]{"xray_vocab.json", "concept_vocab.json"}), 3, 50060),
    BODY_KP_MODEL(r3, r4, 4, 1020),
    PERSON_SEGMENTATION(r3, r4, 5, 1),
    ET_SEGMENT_ANYTHING_MODEL(r3, r4, 6, 31040),
    PYTORCH_U_TWO_NET(r3, r4, 7, 1020),
    U_TWO_NET("ET_MODEL", r4, 8, 1),
    COLOR_LM("PYTORCH_MODEL", r13, 9, 1),
    COLOR_LM_ET("EXECUTORCH", r4, 10, 2);
    
    public final long A00;
    public final String A01;
    public final String A02;
    public final List A03;

    /* access modifiers changed from: public */
    static {
        AnonymousClass8Eg[] r0;
        A04 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass8Eg(String str, List list, int i, long j) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = str;
        this.A03 = list;
    }
}
