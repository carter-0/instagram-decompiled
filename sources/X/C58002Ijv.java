package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.creator.achievements.modules.models.Badge;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.Comparator;

/* renamed from: X.Ijv  reason: case insensitive filesystem */
public final class C58002Ijv implements Comparator {
    public final int A00;

    public C58002Ijv(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable valueOf;
        Comparable valueOf2;
        switch (this.A00) {
            case 0:
                valueOf = Long.valueOf(((GP4) obj).A01);
                valueOf2 = Long.valueOf(((GP4) obj2).A01);
                break;
            case 1:
                valueOf = (String) obj;
                valueOf2 = (String) obj2;
                break;
            case 2:
                Object obj3 = obj;
                valueOf = ((Badge) obj2).A01();
                valueOf2 = ((Badge) obj3).A01();
                break;
            case 3:
                Object obj4 = obj;
                valueOf = ((Challenge) obj2).A07;
                valueOf2 = ((Challenge) obj4).A07;
                break;
            case 4:
                Object obj5 = obj;
                valueOf = ((Achievement) obj2).A05;
                valueOf2 = ((Achievement) obj5).A05;
                break;
            case 5:
                Object obj6 = obj;
                valueOf = Long.valueOf(((N4t) obj2).A02);
                valueOf2 = Long.valueOf(((N4t) obj6).A02);
                break;
            case 6:
                valueOf = Integer.valueOf(((C47156DrX) obj).A01);
                valueOf2 = Integer.valueOf(((C47156DrX) obj2).A01);
                break;
            case 7:
                valueOf = (Float) ((0eP) obj).A00;
                valueOf2 = (Float) ((0eP) obj2).A00;
                break;
            case 8:
                Object obj7 = obj;
                valueOf = Boolean.valueOf(((WallPostItem) obj2).BeB().A09);
                valueOf2 = Boolean.valueOf(((WallPostItem) obj7).BeB().A09);
                break;
            default:
                GJ2 gj2 = GJ2.STICKER_RESULT;
                int i = 0;
                int i2 = 1;
                if (obj == gj2) {
                    i2 = 0;
                }
                valueOf = Integer.valueOf(i2);
                if (obj2 != gj2) {
                    i = 1;
                }
                valueOf2 = Integer.valueOf(i);
                break;
        }
        return 29b.A00(valueOf, valueOf2);
    }
}
