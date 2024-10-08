package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Uo  reason: invalid class name and case insensitive filesystem */
public final class C308516Uo {
    public C17600Vas A00;
    public final DialogInterface.OnClickListener A01 = C308526Up.A00;
    public final DialogInterface.OnClickListener A02 = new C308536Uq(this);
    public final DialogInterface.OnClickListener A03 = new C308546Ur(this);
    public final DialogInterface.OnDismissListener A04;
    public final DialogInterface.OnShowListener A05;
    public final FragmentActivity A06;
    public final ProductReviewStatus A07;
    public final UserSession A08;
    public final 1Xj A09;
    public final AnonymousClass4DU A0A;
    public final C310206ab A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C308516Uo(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, 1Xj r7, AnonymousClass4DU r8, C310206ab r9, String str, String str2, boolean z) {
        this.A06 = fragmentActivity;
        this.A0A = r8;
        this.A08 = userSession;
        this.A0E = z;
        this.A09 = r7;
        this.A0D = str;
        this.A07 = productReviewStatus;
        this.A0C = str2;
        this.A05 = onShowListener;
        this.A04 = onDismissListener;
        this.A0B = r9;
    }
}
