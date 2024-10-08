package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.lang.ref.WeakReference;

/* renamed from: X.FPj  reason: case insensitive filesystem */
public final class C50119FPj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgTextView A04;
    public final /* synthetic */ IgTextView A05;
    public final /* synthetic */ C55726HmN A06;
    public final /* synthetic */ String A07;

    public C50119FPj(View view, View view2, AnonymousClass0iw r3, UserSession userSession, IgTextView igTextView, IgTextView igTextView2, C55726HmN hmN, String str) {
        this.A00 = view;
        this.A05 = igTextView;
        this.A04 = igTextView2;
        this.A01 = view2;
        this.A03 = userSession;
        this.A02 = r3;
        this.A07 = str;
        this.A06 = hmN;
    }

    public final void onGlobalLayout() {
        WeakReference weakReference;
        View view = this.A00;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Handler A0D = AnonymousClass7TF.A0D();
            WeakReference weakReference2 = new WeakReference(view);
            IgTextView igTextView = this.A05;
            WeakReference weakReference3 = null;
            if (igTextView != null) {
                weakReference = new WeakReference(igTextView);
            } else {
                weakReference = null;
            }
            IgTextView igTextView2 = this.A04;
            if (igTextView2 != null) {
                weakReference3 = new WeakReference(igTextView2);
            }
            WeakReference weakReference4 = new WeakReference(this.A01);
            UserSession userSession = this.A03;
            A0D.postDelayed(new C51551Fvx(A0D, this.A02, userSession, this.A06, this.A07, weakReference2, weakReference4, weakReference, weakReference3), 182.A01(0Tu.A05, userSession, 36602127910310461L));
        }
    }
}
