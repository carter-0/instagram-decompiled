package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

public final class KI7 extends C310586bI {
    public final List A00 = AnonymousClass7TE.A1C();
    public final AnonymousClass0iw A01;

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0D(LayoutInflater.from(C60960kU.A00), viewGroup, R.layout.layout_product_image, false);
        }
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        JTR.A0i(view, R.id.image).setUrl((ImageUrl) this.A00.get(i), this.A01);
        return view;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((ExtendedImageUrl) this.A00.get(i)).A0A.hashCode();
    }

    public KI7(AnonymousClass0iw r2) {
        this.A01 = r2;
    }
}
