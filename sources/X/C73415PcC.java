package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.PcC  reason: case insensitive filesystem */
public final class C73415PcC implements Runnable {
    public final /* synthetic */ C249703kE A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C330537Nf A03;
    public final /* synthetic */ AnonymousClass7S7 A04;
    public final /* synthetic */ C254763t0 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ 0eP A08;

    public C73415PcC(C249703kE r1, RecyclerView recyclerView, UserSession userSession, C330537Nf r4, AnonymousClass7S7 r5, C254763t0 r6, Integer num, List list, 0eP r9) {
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = userSession;
        this.A05 = r6;
        this.A04 = r5;
        this.A08 = r9;
        this.A01 = recyclerView;
        this.A07 = list;
        this.A06 = num;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.0r1, java.lang.Object] */
    public final void run() {
        String str;
        ? obj = new Object();
        C330537Nf r7 = this.A03;
        AnonymousClass7PM r1 = (AnonymousClass7PM) this.A00;
        0qQ.A0B(r1, 0);
        if (r1.AFz()) {
            r7.A05 = r1;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, r1.C3X() - 1.0f});
        RecyclerView recyclerView = this.A01;
        UserSession userSession = this.A02;
        C254763t0 r8 = this.A05;
        List list = this.A07;
        Integer num = this.A06;
        ofFloat.setDuration(750);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addListener(new C71160OeZ(ofFloat, recyclerView, userSession, r7, r8, obj));
        ofFloat.addUpdateListener(new C71167Oeg(0, r7, num, list, recyclerView));
        ofFloat.start();
        if (r8 != null) {
            str = r8.A00;
        } else {
            str = null;
        }
        AnonymousClass7S7 r0 = this.A04;
        C313746gw.A00(userSession).A0W("comments_swipe_nudge_rendered", "impression", "comments_swipe_nudge", "thread_view", str, r0.C6k(), AnonymousClass7TF.A0w("message_id", ((C254703su) this.A08.A01).A0h()), r0.AdN());
    }
}
