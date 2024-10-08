package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.GiE  reason: case insensitive filesystem */
public final class C53080GiE extends 2Rw {
    public static final List A01 = 0sr.A1P(new Float[]{Float.valueOf(48.0f), Float.valueOf(36.0f), Float.valueOf(24.0f), Float.valueOf(12.0f)});
    public final List A00 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53116Gio(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.clips_template_browser_thumbnail, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        C53116Gio gio = (C53116Gio) r4;
        0qQ.A0B(gio, 0);
        Bitmap bitmap = (Bitmap) 00k.A0d(this.A00, 3).get(i);
        if (bitmap != null) {
            ImageView imageView = gio.A00;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
    }

    public /* synthetic */ C53080GiE(List list, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1838774094);
        int size = 00k.A0d(this.A00, 3).size();
        Integer valueOf = Integer.valueOf(size);
        int i = 3;
        if (size < 3 && valueOf != null) {
            i = size;
        }
        AnonymousClass0fD.A0A(-726805471, A03);
        return i;
    }

    public C53080GiE() {
    }
}
