package X;

import java.util.ArrayList;
import java.util.List;

public final class WQW implements 1wn {
    public final List A00 = new ArrayList();

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(727464485);
        1xG r8 = (1xG) obj;
        int A032 = AnonymousClass0fD.A03(335632511);
        String str = r8.A02;
        String str2 = r8.A01;
        if (("feed_contextual_hashtag".equals(str) || "feed_hashtag".equals(str)) && !"feed_contextual_hashtag".equals(str2) && !"feed_hashtag".equals(str2) && !"peek_media_feed_hashtag".equals(str) && !"peek_media_feed_hashtag".equals(str2)) {
            List list = this.A00;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((X3B) list.get(size)).DDP(str2, false);
            }
            i = -1371741883;
        } else {
            i = 1206600867;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1663630449, A03);
    }
}
