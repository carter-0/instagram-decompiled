package X;

import android.view.View;
import com.instagram.android.R;
import java.util.LinkedList;

/* renamed from: X.DhK  reason: case insensitive filesystem */
public final class C46578DhK extends C54010Gxs {
    public final View A00;
    public final View A01;
    public final LinkedList A02;

    public C46578DhK(View view) {
        super(view);
        LinkedList linkedList = new LinkedList();
        this.A02 = linkedList;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.dismiss_button);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.shuffle_button);
        linkedList.add(new C46577DhJ(AnonymousClass7TE.A0b(view, R.id.top_start_card)));
        linkedList.add(new C46577DhJ(AnonymousClass7TE.A0b(view, R.id.top_end_card)));
        linkedList.add(new C46577DhJ(AnonymousClass7TE.A0b(view, R.id.bottom_start_card)));
        linkedList.add(new C46577DhJ(AnonymousClass7TE.A0b(view, R.id.bottom_end_card)));
    }
}
