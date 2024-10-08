package X;

import com.instagram.api.schemas.TextAppMentionType;

public final class G35 extends 0Yg implements 0sP {
    public static final G35 A00 = new G35();

    public G35() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = TextAppMentionType.A01.get(obj);
        if (obj2 == null) {
            return TextAppMentionType.UNRECOGNIZED;
        }
        return obj2;
    }
}
