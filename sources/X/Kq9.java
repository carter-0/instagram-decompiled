package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class Kq9 {
    public static Map A00(C2816558w r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, r3.getDescription());
        }
        if (r3.Bfj() != null) {
            A1H.put(C273654mx.A00(3148), r3.Bfj());
        }
        if (r3.Bfk() != null) {
            A1H.put(C273654mx.A00(3149), r3.Bfk());
        }
        if (r3.Bfl() != null) {
            A1H.put(C273654mx.A00(3150), r3.Bfl());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        return 0Yt.A0B(A1H);
    }
}
