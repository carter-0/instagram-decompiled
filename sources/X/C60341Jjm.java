package X;

import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Jjm  reason: case insensitive filesystem */
public final class C60341Jjm extends PagingDataAdapter implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "SGDirectImportHScrollPagingAdapter";
    public final List A00;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60541JnC(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.smartglasses_direct_import_item, false));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60341Jjm(java.util.List r3) {
        /*
            r2 = this;
            X.JkB r1 = X.C60363JkB.A00
            X.4CZ r0 = X.AnonymousClass12W.A00
            X.134 r0 = X.AnonymousClass12y.A00
            r2.<init>(r1, r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60341Jjm.<init>(java.util.List):void");
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C60541JnC jnC = (C60541JnC) r5;
        0qQ.A0B(jnC, 0);
        C61050Jvo jvo = (C61050Jvo) this.A00.get(i);
        ImageUrl imageUrl = (ImageUrl) jvo.A05;
        if (imageUrl != null) {
            IgImageView igImageView = jnC.A00;
            igImageView.setUrl(imageUrl, this);
            igImageView.setRotation(90.0f);
            LY0.A00(igImageView, 41, jvo);
            igImageView.setOnLongClickListener(new LYU(jvo, 3));
        }
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(508418827);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1319749651, A03);
        return size;
    }
}
