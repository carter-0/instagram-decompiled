package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Jnp  reason: case insensitive filesystem */
public final class C60580Jnp extends C249703kE {
    public final AnonymousClass2t9 A00;
    public final Context A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2tE, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60580Jnp(View view, K89 k89, AnonymousClass0iw r7) {
        super(view);
        AnonymousClass7TG.A1Q(k89, r7);
        Context context = view.getContext();
        this.A01 = context;
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A0C.addAll(JTT.A0s(new KFR(k89, r7), new Object()));
        AnonymousClass2t9 A003 = A002.A00();
        this.A00 = A003;
        RecyclerView A0I = DbT.A0I(view, R.id.horizontal_scroll_recycler_view);
        A0I.setAdapter(A003);
        DbV.A1A(context, A0I);
    }
}
