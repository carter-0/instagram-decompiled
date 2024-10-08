package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gu0  reason: case insensitive filesystem */
public final class C53771Gu0 extends C251343mx {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C62320sa A02;
    public final 2WX A03;
    public final C245853da A04;

    public final C251263mp A0X(AnonymousClass3Y5 r10) {
        0qQ.A0B(r10, 0);
        UserSession userSession = this.A01;
        C58179Inj inj = new C58179Inj(this, 15);
        Object A002 = AnonymousClass3Zw.A00(r10, new C58179Inj(this, 14), new Object[]{userSession, this.A00});
        if (((C263224Jr) AnonymousClass3Zw.A00(r10, inj, new Object[]{userSession})).A00(C243803a8.A00(r10), this.A04, false).A01 == null) {
            return null;
        }
        Drawable A0D = C244013aV.A0D(r10, R.drawable.play_button);
        2WX r5 = this.A03;
        2Wb A0Q = C51972G9s.A0Q(r10);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        AnonymousClass3XV r1 = 2WX.A02;
        return C51967G9n.A0Q(new GH5(A0D, scaleType, C51973G9u.A0Z((2WX) null, new C74188PqU(41, A002, (Object) A0Q, (Object) this)), false), A0Q, r10, r5);
    }

    public C53771Gu0(2WX r1, AnonymousClass0iw r2, UserSession userSession, C245853da r4, C62320sa r5) {
        AnonymousClass7TG.A1U(userSession, r2, r4);
        this.A01 = userSession;
        this.A00 = r2;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r1;
    }
}
