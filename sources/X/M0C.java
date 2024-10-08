package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.Set;

public final class M0C implements MUR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ TargetViewSizeProvider A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;

    public final void DX1(Exception exc) {
    }

    public M0C(Activity activity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str, String str2, String str3, C62320sa r7, int i) {
        this.A02 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A01 = activity;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A07 = r7;
    }

    public final void DX2(C352218Cl r10) {
        UserSession userSession = this.A02;
        AnonymousClass3Q2 A022 = C59797JYq.A02((28D) null, userSession, this.A03, (B1O) null, (TransformMatrixConfig) null, r10, (String) null, (Set) null);
        0qQ.A07(A022);
        A022.A0V(1iA.A0Q);
        A022.A2t = r10.A06();
        A022.A33 = r10.A06();
        A022.A3L = r10.A07();
        int i = r10.A09;
        A022.A0H = i;
        int i2 = r10.A06;
        A022.A0G = i2;
        A022.A02 = ((float) i) / ((float) i2);
        A022.A0e(ShareType.EXPRESSIVE_QUESTION_STICKER);
        Activity activity = this.A01;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        int i3 = this.A00;
        C62320sa r7 = this.A07;
        C63387Kw8.A00(A022);
        1ua A0n = JTO.A0n(activity, userSession);
        JTQ.A1J(A022, A0n, A022.A12() ? 1 : 0);
        A0n.A0B(A022);
        A022.A0Y(new C65532Luv(userSession, A022, str, str2, str3, r7, i3));
    }
}
