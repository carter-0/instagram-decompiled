package X;

import com.instagram.api.schemas.StoryJoinChatStatus;

/* renamed from: X.WyL  reason: case insensitive filesystem */
public final class C20748WyL extends 0Yg implements 0sP {
    public static final C20748WyL A00 = new C20748WyL();

    public C20748WyL() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryJoinChatStatus.A01.get(obj);
        if (obj2 == null) {
            return StoryJoinChatStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
