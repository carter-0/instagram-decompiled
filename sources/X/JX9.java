package X;

import com.instagram.creation.base.CreationSession;
import java.util.List;
import java.util.Map;

public final class JX9 {
    public float A00 = 1.0f;
    public Integer A01;
    public boolean A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Map A04 = AnonymousClass7TE.A1H();

    public static void A00(KB5 kb5, int i, int i2) {
        CreationSession creationSession = kb5.A0S;
        List list = creationSession.A0E;
        list.add(i2, list.remove(i));
        creationSession.A0H = true;
        List list2 = JWX.A00(kb5.A0P).A03;
        if (i >= list2.size()) {
            0kD.A07("GalleryPreviewInfoCache", 002.A02(i, list2.size(), "Tried to update selected Index with oldIndex:", ", but selectedItemIds.size() is "), (Throwable) null);
        } else {
            list2.add(i2, list2.remove(i));
        }
    }
}
