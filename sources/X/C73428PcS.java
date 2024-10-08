package X;

import android.location.Location;
import android.view.View;
import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.PcS  reason: case insensitive filesystem */
public final class C73428PcS implements Comparator {
    public final int A00;
    public final Object A01;

    public C73428PcS(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable;
        Comparable comparable2;
        int i;
        switch (this.A00) {
            case 0:
                return (AnonymousClass7TE.A0R(((Map.Entry) obj).getValue()) > AnonymousClass7TE.A0R(((Map.Entry) obj2).getValue()) ? 1 : (AnonymousClass7TE.A0R(((Map.Entry) obj).getValue()) == AnonymousClass7TE.A0R(((Map.Entry) obj2).getValue()) ? 0 : -1));
            case 1:
                OmniGridLayoutManager omniGridLayoutManager = (OmniGridLayoutManager) this.A01;
                comparable = Integer.valueOf(((C68152N2s) omniGridLayoutManager.A07.A09.get(C252553pI.A06((View) obj))).A00);
                i = ((C68152N2s) omniGridLayoutManager.A07.A09.get(C252553pI.A06((View) obj2))).A00;
                break;
            case 2:
                Map map = (Map) this.A01;
                comparable = (Integer) map.get(((CameraAREffect) obj).A0K);
                comparable2 = (Integer) map.get(((CameraAREffect) obj2).A0K);
                break;
            case 5:
                List list = (List) this.A01;
                int indexOf = list.indexOf(((StickerPackResponseItem) ((Map.Entry) obj).getKey()).A02);
                if (indexOf == -1) {
                    indexOf = list.size();
                }
                comparable = Integer.valueOf(indexOf);
                i = list.indexOf(((StickerPackResponseItem) ((Map.Entry) obj2).getKey()).A02);
                if (i == -1) {
                    i = list.size();
                    break;
                }
                break;
            case 8:
                PHD phd = (PHD) obj;
                PHD phd2 = (PHD) obj2;
                int compare = new C73428PcS((Object) ((NdC) this.A01).A01, 10).compare(phd.A01, phd2.A01);
                Integer valueOf = Integer.valueOf(compare);
                if (compare == 0 || valueOf == null) {
                    return 29b.A00(phd.A02, phd2.A02);
                }
                return compare;
            case 9:
                Location location = (Location) this.A01;
                comparable = Float.valueOf(location.distanceTo(((N4t) obj).A03));
                comparable2 = Float.valueOf(location.distanceTo(((N4t) obj2).A03));
                break;
            case 10:
                N4t n4t = (N4t) obj;
                N4t n4t2 = (N4t) obj2;
                if (182.A06(0Tu.A05, (0lg) this.A01, 36321769626216181L)) {
                    return 0qQ.A00(n4t.A01, n4t2.A01);
                }
                return 0qQ.A01(n4t2.A02, n4t.A02);
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
        comparable2 = Integer.valueOf(i);
        return 29b.A00(comparable, comparable2);
    }

    public C73428PcS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
