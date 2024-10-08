package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.Set;

/* renamed from: X.8Fg  reason: invalid class name and case insensitive filesystem */
public final class C352848Fg {
    public Drawable A00;
    public C356778Ve A01;
    public File A02;
    public final float A03;
    public final Activity A04;
    public final UserSession A05;
    public final C357638Yz A06;
    public final AnonymousClass8BA A07;
    public final C352858Fh A08 = new C352858Fh(this);
    public final InteractiveDrawableContainer A09;
    public final ViewGroup A0A;
    public final AnonymousClass4DH A0B;
    public final TargetViewSizeProvider A0C;
    public final C3496881i A0D;
    public final C3497281m A0E;

    public C352848Fg(ViewGroup viewGroup, C357638Yz r6, AnonymousClass8BA r7, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80D r9, C3496881i r10, C3497281m r11, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(interactiveDrawableContainer, 4);
        0qQ.A0B(r6, 5);
        0qQ.A0B(targetViewSizeProvider, 6);
        this.A0A = viewGroup;
        this.A07 = r7;
        this.A09 = interactiveDrawableContainer;
        this.A06 = r6;
        this.A0C = targetViewSizeProvider;
        this.A0E = r11;
        this.A0D = r10;
        r9.A0M.getClass();
        AnonymousClass4DH r0 = r9.A0M;
        0qQ.A07(r0);
        this.A0B = r0;
        UserSession userSession = r9.A0S;
        this.A05 = userSession;
        Activity activity = r9.A05;
        this.A04 = activity;
        0qQ.A07(activity);
        this.A03 = 0nA.A00(activity, 260.0f);
        Object obj = r6.A08.A00;
        AnonymousClass80J r1 = AnonymousClass80J.A00;
        0qQ.A0K(obj, r1);
        if (((Set) r6.A07.A00).contains(r1)) {
            0qQ.A07(userSession);
            if (182.A06(0Tu.A05, userSession, 36324230639398802L)) {
                r6.A0E(new C41489Aun(this));
            }
        }
    }
}
