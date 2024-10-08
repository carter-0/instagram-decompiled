package X;

import com.instagram.api.schemas.CreatorViewerSignalType;

/* renamed from: X.DKb  reason: case insensitive filesystem */
public final class C46044DKb extends 0Yg implements 0sP {
    public static final C46044DKb A00 = new C46044DKb();

    public C46044DKb() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerSignalType.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerSignalType.UNRECOGNIZED;
        }
        return obj2;
    }
}
