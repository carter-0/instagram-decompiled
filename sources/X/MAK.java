package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;

public final class MAK implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ IgImageView A04;
    public final /* synthetic */ C252063oV A05;
    public final /* synthetic */ Reel A06;
    public final /* synthetic */ LDH A07;
    public final /* synthetic */ AnonymousClass3N1 A08;
    public final /* synthetic */ C230242pG A09;
    public final /* synthetic */ boolean A0A;

    public MAK(View view, ImageView imageView, AnonymousClass0iw r3, UserSession userSession, IgImageView igImageView, C252063oV r6, Reel reel, LDH ldh, AnonymousClass3N1 r9, C230242pG r10, boolean z) {
        this.A08 = r9;
        this.A01 = imageView;
        this.A00 = view;
        this.A04 = igImageView;
        this.A06 = reel;
        this.A03 = userSession;
        this.A09 = r10;
        this.A02 = r3;
        this.A05 = r6;
        this.A07 = ldh;
        this.A0A = z;
    }

    public final void run() {
        TextView A042 = this.A08.A02.A05.A04();
        CharSequence text = A042.getText();
        View view = this.A00;
        Reel reel = this.A06;
        UserSession userSession = this.A03;
        C230242pG r1 = this.A09;
        AnonymousClass0iw r0 = this.A02;
        C252063oV r15 = this.A05;
        C65732Lym lym = new C65732Lym(view, r0, userSession, r15, reel, r1);
        ImageView imageView = this.A01;
        IgImageView igImageView = this.A04;
        imageView.postDelayed(new MAI(imageView, view, C65733Lyn.A00, lym, "show_memory_badge_animator_key", new MJ8(39, r15, igImageView), new MJ8(40, this.A07, A042), MLT.A00), 2000);
        igImageView.postDelayed(new M9A(igImageView, new C73901Plc(igImageView, 24), new C59733JVr(2, userSession, r15, imageView, A042, text, view, this.A0A)), 2400);
    }
}
