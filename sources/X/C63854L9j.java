package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.L9j  reason: case insensitive filesystem */
public final class C63854L9j {
    public AnonymousClass7L2 A00;
    public final Context A01;
    public final View A02;
    public final FragmentActivity A03;
    public final AnonymousClass9HC A04;
    public final DirectThreadThemeInfo A05;

    public C63854L9j(Context context, View view, FragmentActivity fragmentActivity, UserSession userSession, DirectThreadThemeInfo directThreadThemeInfo) {
        0qQ.A0B(userSession, 1);
        this.A03 = fragmentActivity;
        this.A01 = context;
        this.A05 = directThreadThemeInfo;
        this.A02 = view;
        AnonymousClass9HD r1 = AnonymousClass9HC.A1b;
        Parcelable.Creator creator = Capabilities.CREATOR;
        AnonymousClass9HC A002 = r1.A00(userSession, C376189Gz.A00(0sn.A00));
        this.A04 = A002;
        AnonymousClass7L2 A06 = C250563lf.A06(context, A002);
        if (directThreadThemeInfo != null && 182.A06(0Tu.A05, userSession, 36319407394135361L)) {
            A06 = C329927Kt.A00.A01(context, A002, directThreadThemeInfo, AnonymousClass05K.A00);
            0qQ.A0A(A06);
        }
        this.A00 = A06;
    }
}
