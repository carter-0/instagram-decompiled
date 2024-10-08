package X;

import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vg7  reason: case insensitive filesystem */
public final class C17795Vg7 {
    public final View A00;
    public final List A01 = new ArrayList();

    public final MediaFrameLayout A00(int i) {
        List list = this.A01;
        if (i < list.size() && i >= 0) {
            return ((C19517Wb3) list.get(i)).A0E;
        }
        throw new IndexOutOfBoundsException(StringFormatUtil.formatStrLocaleSafe("Failed to get grid item view - position=%d itemHoldersSize=%d", Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public C17795Vg7(View view) {
        this.A00 = view;
    }
}
