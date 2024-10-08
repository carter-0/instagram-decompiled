package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LuH  reason: case insensitive filesystem */
public final class C65493LuH implements MVC {
    public C66563MWr A00;

    public final AudioBrowserCategoryType AmL() {
        return this.A00.AmL();
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.JZC, java.lang.Object] */
    public final List Bf2() {
        List<DS0> Bf2 = this.A00.Bf2();
        0qQ.A0B(Bf2, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(Bf2);
        for (DS0 ds0 : Bf2) {
            0qQ.A0B(ds0, 1);
            C66566MWu BdJ = ds0.BdJ();
            0qQ.A0B(BdJ, 1);
            ? obj = new Object();
            obj.A0E = new MusicSearchPlaylist(BdJ);
            obj.A02();
            A0r.add(obj);
        }
        return A0r;
    }

    public final String getId() {
        return this.A00.getId();
    }

    public final String getTitle() {
        return this.A00.getTitle();
    }
}
