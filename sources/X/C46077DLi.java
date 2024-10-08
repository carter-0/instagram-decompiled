package X;

import com.instagram.reels.question.constants.QuestionStickerType;

/* renamed from: X.DLi  reason: case insensitive filesystem */
public final class C46077DLi extends 0Yg implements 0sP {
    public static final C46077DLi A00 = new C46077DLi();

    public C46077DLi() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = QuestionStickerType.A01.get(obj);
        if (obj2 == null) {
            return QuestionStickerType.UNRECOGNIZED;
        }
        return obj2;
    }
}
