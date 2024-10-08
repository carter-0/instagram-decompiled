package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;

/* renamed from: X.Jpr  reason: case insensitive filesystem */
public final class C60706Jpr extends C249703kE implements AnonymousClass3V3 {
    public AnonymousClass3W1 A00;
    public final View A01;
    public final AnonymousClass3TS A02;
    public final IgProgressImageView A03;
    public final MediaActionsView A04;
    public final C256003v4 A05;
    public final C256063vA A06;
    public final C242423Ua A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60706Jpr(View view, View view2, AnonymousClass3TS r4, C256003v4 r5, IgProgressImageView igProgressImageView, MediaActionsView mediaActionsView, C242423Ua r8) {
        super(view);
        DbW.A1N(igProgressImageView, 3, mediaActionsView);
        this.A01 = view2;
        this.A03 = igProgressImageView;
        this.A07 = r8;
        this.A04 = mediaActionsView;
        this.A02 = r4;
        this.A05 = r5;
        this.A06 = new C256063vA(r5);
        view.setTag(this);
    }

    public final C256043v8 B5X() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final AnonymousClass3TS Adf() {
        return this.A02;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A04;
    }

    public final View BG1() {
        return this.A03;
    }

    public final View BQB() {
        return this.A01;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A00;
    }

    public final C247233fz BQv() {
        return this.A06;
    }

    public final C242423Ua C5r() {
        return this.A07;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        return this.A04.getWidth();
    }

    public final void EEI(int i) {
        this.A03.A06(i);
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r2);
        this.A03.A09(r2, imageUrl, z);
    }
}
