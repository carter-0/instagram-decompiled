package X;

import com.instagram.api.schemas.NoteActivationType;

/* renamed from: X.Wy4  reason: case insensitive filesystem */
public final class C20731Wy4 extends 0Yg implements 0sP {
    public static final C20731Wy4 A00 = new C20731Wy4();

    public C20731Wy4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = NoteActivationType.A01.get(obj);
        if (obj2 == null) {
            return NoteActivationType.UNRECOGNIZED;
        }
        return obj2;
    }
}
