package X;

import com.instagram.api.schemas.ReelsMediaInteractivityType;

/* renamed from: X.DLn  reason: case insensitive filesystem */
public final class C46082DLn extends 0Yg implements 0sP {
    public static final C46082DLn A00 = new C46082DLn();

    public C46082DLn() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0qQ.A0B(obj, 0);
        Object obj2 = ReelsMediaInteractivityType.A01.get(obj);
        if (obj2 == null) {
            return ReelsMediaInteractivityType.UNRECOGNIZED;
        }
        return obj2;
    }
}
