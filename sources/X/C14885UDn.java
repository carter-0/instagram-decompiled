package X;

import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UDn  reason: case insensitive filesystem */
public final class C14885UDn extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final List A03;
    public final List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14885UDn(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
        View A0G = AnonymousClass7TF.A0G(view, R.id.left_product);
        this.A00 = A0G;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.A04 = arrayList2;
        arrayList.add(AnonymousClass7TF.A0G(A0G, R.id.product_name_placeholder));
        arrayList.add(AnonymousClass7TF.A0G(A0G, R.id.product_subtitle_placeholder));
        arrayList.add(AnonymousClass7TF.A0G(A0G, R.id.product_price_placeholder));
        View requireViewById = view.requireViewById(R.id.right_product);
        this.A01 = requireViewById;
        arrayList2.add(AnonymousClass7TF.A0G(requireViewById, R.id.product_name_placeholder));
        arrayList2.add(AnonymousClass7TF.A0G(requireViewById, R.id.product_subtitle_placeholder));
        arrayList2.add(AnonymousClass7TF.A0G(requireViewById, R.id.product_price_placeholder));
    }
}
