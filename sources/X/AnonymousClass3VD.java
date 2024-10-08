package X;

import android.os.Handler;
import android.os.Looper;
import android.view.TouchDelegate;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;
import java.util.List;

/* renamed from: X.3VD  reason: invalid class name */
public final class AnonymousClass3VD implements AnonymousClass2xU {
    public int A00 = -1;
    public AnonymousClass3W1 A01;
    public Runnable A02;
    public Runnable A03;
    public 0sP A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07 = new Handler(Looper.getMainLooper());
    public final TagsLayout A08;

    public AnonymousClass3VD(TagsLayout tagsLayout) {
        0qQ.A0B(tagsLayout, 1);
        this.A08 = tagsLayout;
    }

    public final void A01(UserSession userSession, AnonymousClass3W1 r11, AnonymousClass47O r12, C247083fk r13) {
        AnonymousClass3W1 r6 = r11;
        0qQ.A0B(r11, 1);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 2);
        AnonymousClass47O r7 = r12;
        0qQ.A0B(r12, 3);
        C247083fk r8 = r13;
        C376529Ii r3 = r13.A02;
        if (((Boolean) ((C62320sa) r3.A05).invoke()).booleanValue()) {
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A07.removeCallbacks(runnable);
                this.A03 = null;
            }
            C57971IjQ ijQ = new C57971IjQ(userSession2, r6, r7, r8, this);
            this.A07.postDelayed(ijQ, ((Number) ((C62320sa) r3.A02).invoke()).longValue());
            this.A03 = ijQ;
        }
    }

    public final void A02(UserSession userSession, C247083fk r11, boolean z) {
        AnonymousClass3W1 r4 = r11.A04;
        if (this.A05) {
            r4.A07(r4.A03, -1).A05 = true;
        }
        TagsLayout tagsLayout = this.A08;
        tagsLayout.removeAllViews();
        tagsLayout.setTags((List) ((0sP) r11.A02.A01).invoke(r4), r11.A05, r4, r4.A03, z, this.A05, userSession);
    }

    public final void DQp(AnonymousClass3W1 r4, int i) {
        0qQ.A0B(r4, 0);
        if (this.A06) {
            if (this.A05 && i == 18 && !r4.A1w && !r4.A07(this.A00, -1).A04 && !r4.A2y) {
                A00();
                r4.A0k(false);
                this.A00 = -1;
            }
            if (this.A05 && i == 16 && r4.A0i != AnonymousClass3TF.IDLE && !r4.A2y && this.A00 == r4.A03) {
                A00();
                r4.A0k(false);
            }
        }
        int i2 = this.A00;
        if (i2 != r4.A03 || !r4.A20 || r4 != this.A01) {
            return;
        }
        if ((this.A05 && (i != 16 ? !(i != 18 || r4.A1w || r4.A07(i2, -1).A04) : r4.A0i != AnonymousClass3TF.IDLE) && !r4.A2y) || (this.A05 && i == 10 && r4.A1z)) {
            A00();
            r4.A0k(false);
        }
    }

    public final void A00() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
            this.A03 = null;
        }
        Runnable runnable2 = this.A02;
        if (runnable2 != null) {
            this.A07.removeCallbacks(runnable2);
            this.A02 = null;
        }
        TagsLayout tagsLayout = this.A08;
        tagsLayout.setTouchDelegate((TouchDelegate) null);
        tagsLayout.A04(this.A05);
    }
}
