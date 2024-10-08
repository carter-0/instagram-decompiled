package X;

import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import java.util.Comparator;

/* renamed from: X.Fw8  reason: case insensitive filesystem */
public final class C51562Fw8 implements Comparator {
    public final int A00;

    public C51562Fw8(int i) {
        this.A00 = i;
    }

    public final int compare(Object obj, Object obj2) {
        Comparable valueOf;
        Comparable valueOf2;
        switch (this.A00) {
            case 0:
                valueOf = Integer.valueOf(((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) obj).A00);
                valueOf2 = Integer.valueOf(((UpdateProfilePicturePagerAdapter$UpdateProfileTabType) obj2).A00);
                break;
            case 1:
                valueOf = ((C276544tV) obj).A0H();
                valueOf2 = ((C276544tV) obj2).A0H();
                break;
            case 2:
                valueOf = ((C53374Gn4) obj).A03;
                valueOf2 = ((C53374Gn4) obj2).A03;
                break;
            case 5:
                valueOf = (String) obj;
                valueOf2 = (String) obj2;
                break;
            case 6:
                Object obj3 = obj;
                valueOf = Long.valueOf(((C283155Gi) obj2).A00());
                valueOf2 = Long.valueOf(((C283155Gi) obj3).A00());
                break;
            case 7:
                valueOf = DbT.A0l(((C61082JwK) obj).A01);
                valueOf2 = DbT.A0l(((C61082JwK) obj2).A01);
                break;
            case 8:
                valueOf = Integer.valueOf(((DcU) obj).A01);
                valueOf2 = Integer.valueOf(((DcU) obj2).A01);
                break;
            default:
                valueOf = Long.valueOf(-((C255773uh) obj).A03());
                valueOf2 = Long.valueOf(-((C255773uh) obj2).A03());
                break;
        }
        return 29b.A00(valueOf, valueOf2);
    }
}
