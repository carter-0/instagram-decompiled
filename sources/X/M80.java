package X;

import com.instagram.tagging.widget.TagsLayout;
import java.util.List;

public final class M80 implements Runnable {
    public final /* synthetic */ TagsLayout A00;
    public final /* synthetic */ List A01;

    public M80(TagsLayout tagsLayout, List list) {
        this.A00 = tagsLayout;
        this.A01 = list;
    }

    public final void run() {
        for (C60046JeE A05 : this.A01) {
            this.A00.A05(A05);
        }
        this.A00.requestLayout();
    }
}
