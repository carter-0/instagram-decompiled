package X;

import android.view.View;
import instagram.features.clips.audio.ui.SegmentsMusicPlayerView;
import java.util.List;

public final class MAN implements Runnable {
    public final /* synthetic */ SegmentsMusicPlayerView A00;
    public final /* synthetic */ List A01;

    public MAN(SegmentsMusicPlayerView segmentsMusicPlayerView, List list) {
        this.A00 = segmentsMusicPlayerView;
        this.A01 = list;
    }

    public static float A00(List list, int i) {
        int i2 = i - 1;
        return (((View) list.get(i2)).getX() + ((float) ((View) list.get(i2)).getWidth())) - ((View) list.get(i)).getX();
    }

    public final void run() {
        SegmentsMusicPlayerView segmentsMusicPlayerView = this.A00;
        List list = segmentsMusicPlayerView.A04;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                List list2 = this.A01;
                float A002 = A00(list2, i);
                if (A002 > 0.0f) {
                    ((View) list2.get(i)).setTranslationX(A002);
                }
            }
        }
        List list3 = this.A01;
        float x = (((View) list3.get(C51966G9m.A06(list))).getX() + AnonymousClass7TE.A02((View) list3.get(C51966G9m.A06(list)))) - ((float) segmentsMusicPlayerView.A09.getRight());
        int A06 = C51966G9m.A06(list);
        if (A06 >= 0) {
            while (true) {
                int i2 = A06 - 1;
                if (x > 0.0f) {
                    ((View) list3.get(A06)).setTranslationX(((View) list3.get(A06)).getTranslationX() - x);
                    if (A06 != 0) {
                        x = A00(list3, A06);
                    }
                }
                if (i2 >= 0) {
                    A06 = i2;
                } else {
                    return;
                }
            }
        }
    }
}
