package X;

import com.instagram.mediakit.model.MediaKitInsightType;
import java.util.ArrayList;
import java.util.List;

public final class KUS extends C64808LiT {
    public static final List A03 = 0sr.A1P(new MediaKitInsightType[]{MediaKitInsightType.TOTAL_FOLLOWERS, MediaKitInsightType.POSTS_CREATED, MediaKitInsightType.DATE_JOINED});
    public final int A00;
    public final int A01;
    public final List A02;

    public KUS(C61220JzD jzD, C65329LrS lrS) {
        super(jzD, lrS);
        ArrayList arrayList;
        List list = jzD.A06;
        if (list != null) {
            arrayList = AnonymousClass7TE.A1C();
            for (Object next : list) {
                JTR.A1R(((C61217JzA) next).A00, next, arrayList, A03);
            }
        } else {
            arrayList = 0sn.A00;
        }
        this.A02 = arrayList;
        this.A01 = arrayList.size();
        this.A00 = C51966G9m.A06(arrayList);
    }
}
