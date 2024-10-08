package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3rr  reason: invalid class name and case insensitive filesystem */
public final class C254053rr extends C254063rs implements AnonymousClass3V3 {
    public final UserSession A00;
    public final AnonymousClass3TN A01 = new Object();

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final void EEI(int i) {
    }

    private C241103Nw A00() {
        int i;
        AnonymousClass5GJ r0 = this.A09;
        if (r0 == null || (i = r0.A02) < 0) {
            return null;
        }
        C249703kE A0W = this.A08.A0W(i);
        if (!182.A06(0Tu.A05, this.A00, 36325768237692109L) || (A0W instanceof C241103Nw)) {
            return (C241103Nw) A0W;
        }
        return null;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A01;
    }

    public final View BQB() {
        return this.A08;
    }

    public final AnonymousClass3W1 BQq() {
        AnonymousClass5GJ r0 = this.A09;
        if (r0 == null) {
            return null;
        }
        return r0.A09;
    }

    public final C242423Ua C5r() {
        View A1D;
        AnonymousClass5GJ r2 = this.A09;
        if (r2 == null) {
            return null;
        }
        C252553pI r1 = this.A08.A0D;
        int i = r2.A02;
        if (r1 == null || i < 0 || (A1D = r1.A1D(i)) == null) {
            return null;
        }
        return (C242423Ua) A1D;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3TN] */
    public C254053rr(View view, UserSession userSession) {
        super(view);
        this.A00 = userSession;
    }

    public final View BG1() {
        C241103Nw A002 = A00();
        if (A002 != null) {
            return A002.A0C;
        }
        return null;
    }

    public final int CEc() {
        View BG1 = BG1();
        if (BG1 != null) {
            return BG1.getWidth();
        }
        return 0;
    }

    public final void Epi(AnonymousClass0iw r3, ImageUrl imageUrl, boolean z) {
        IgImageView igImageView;
        C241103Nw A002 = A00();
        if (A002 != null && (igImageView = A002.A0C) != null) {
            igImageView.A0D(r3, (0lg) null, imageUrl, z);
        }
    }
}
