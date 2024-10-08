package X;

import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.HJp  reason: case insensitive filesystem */
public final class C54580HJp extends C52078GDy implements AnonymousClass3V3 {
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

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3TN] */
    public final AnonymousClass3TN B5Y() {
        return new Object();
    }

    public final View BG1() {
        return this.A01;
    }

    public final View BQB() {
        return this.A05;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A03;
    }

    public final C242423Ua C5r() {
        SimpleVideoLayout simpleVideoLayout = this.A05;
        if (simpleVideoLayout == null) {
            return new SimpleVideoLayout(AnonymousClass7TE.A0S(this.A09), (AttributeSet) null, 0);
        }
        return simpleVideoLayout;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A08.getWidth();
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r2);
        IgImageView igImageView = this.A01;
        if (igImageView != null) {
            igImageView.setUrl(imageUrl, r2);
        }
    }
}
