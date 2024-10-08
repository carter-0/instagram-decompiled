package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: X.Jlv  reason: case insensitive filesystem */
public final class C60463Jlv extends AnonymousClass3B3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ K8M A03;

    public C60463Jlv(K8M k8m, int i, int i2, int i3) {
        this.A03 = k8m;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r8) {
        int bindingAdapterPosition;
        C62572Ki5 ki5;
        int i;
        AnonymousClass7TG.A1T(rect, view, recyclerView);
        C249703kE A0Z = recyclerView.A0Z(view);
        if (A0Z != null && (bindingAdapterPosition = A0Z.getBindingAdapterPosition()) != -1) {
            if (this.A03.isModelClass(bindingAdapterPosition, C64781Lhx.class)) {
                ki5 = C62572Ki5.THUMBNAIL;
            } else {
                ki5 = C62572Ki5.UNRECOGNIZED;
            }
            if (C62572Ki5.THUMBNAIL == ki5 || C62572Ki5.COLLECTION_TILE == ki5) {
                ViewGroup.LayoutParams layoutParams = A0Z.itemView.getLayoutParams();
                0qQ.A0C(layoutParams, AnonymousClass000.A00(3647));
                int i2 = ((C320856t4) layoutParams).A00;
                int i3 = this.A01;
                if (i2 % i3 == 0) {
                    i = this.A00;
                } else {
                    i = this.A02 / i3;
                }
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
                    rect.left = i;
                } else {
                    rect.right = i;
                }
            }
        }
    }
}
