package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;

/* renamed from: X.OkJ  reason: case insensitive filesystem */
public final class C71418OkJ implements View.OnLongClickListener {
    public final /* synthetic */ C3256673q A00;
    public final /* synthetic */ C3256873s A01;
    public final /* synthetic */ C3259674w A02;

    public C71418OkJ(C3256673q r1, C3256873s r2, C3259674w r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final boolean onLongClick(View view) {
        C3256673q r4 = this.A00;
        C3259674w r2 = this.A02;
        C3256873s r1 = this.A01;
        MessageIdentifier A0i = C66580MXl.A0i(r2.A04(), (String) null);
        AnonymousClass7FR r5 = new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        AnonymousClass7FR r65 = r5;
        AnonymousClass7FT r63 = new AnonymousClass7FT((C61063Jw1) null, r65, C327627Bo.NUX_TYPE_NONE, 2FW.A0G, A0i, (MessageIdentifier) null, (List) null, 0, false, false, false, r2.A08(), false);
        RectF A0F = 0nA.A0F(r1.A00);
        AnonymousClass7FR r52 = r63.A02;
        ((AnonymousClass7XX) r4.A01).Eum(new PointF(A0F.centerX(), A0F.centerY()), r63, r52, 0, false, r4.A02.A1X);
        return true;
    }
}
