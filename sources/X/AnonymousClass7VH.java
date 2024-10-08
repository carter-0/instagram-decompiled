package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VH  reason: invalid class name */
public final class AnonymousClass7VH {
    public float A00;
    public View A01;
    public View A02;
    public C252063oV A03;
    public boolean A04;
    public final AnonymousClass4DH A05;
    public final AnonymousClass0iw A06;
    public final 1wn A07 = new AnonymousClass7VI(this);
    public final UserSession A08;
    public final C62320sa A09;
    public final C62320sa A0A;

    public AnonymousClass7VH(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, C62320sa r5, C62320sa r6) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r5, 4);
        this.A05 = r2;
        this.A08 = userSession;
        this.A06 = r3;
        this.A09 = r5;
        this.A0A = r6;
    }

    public static final ViewGroup A00(AnonymousClass7VH r1) {
        ViewGroup viewGroup;
        Window window = C61190ls.A00(r1.A05.requireActivity()).getWindow();
        View view = null;
        if (window != null) {
            view = window.getDecorView();
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            return viewGroup;
        }
        throw new IllegalStateException(C273654mx.A00(1226));
    }
}
