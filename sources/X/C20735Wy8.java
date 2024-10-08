package X;

import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;

/* renamed from: X.Wy8  reason: case insensitive filesystem */
public final class C20735Wy8 extends 0Yg implements 0sP {
    public static final C20735Wy8 A00 = new C20735Wy8();

    public C20735Wy8() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = INLINE_SURVEY_QUESTION_TYPES.A01.get(obj);
        if (obj2 == null) {
            return INLINE_SURVEY_QUESTION_TYPES.UNRECOGNIZED;
        }
        return obj2;
    }
}
