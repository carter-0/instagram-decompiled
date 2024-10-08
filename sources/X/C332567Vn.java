package X;

import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Vn  reason: invalid class name and case insensitive filesystem */
public final class C332567Vn {
    public KQg A00;
    public boolean A01;
    public final AnonymousClass4DH A02;
    public final 1wn A03 = new C332577Vo(this);
    public final 1wn A04 = new C332597Vq(this);
    public final UserSession A05;
    public final AnonymousClass7SM A06;
    public final C332587Vp A07 = new C332587Vp(this);
    public final String A08;
    public final AnonymousClass0eK A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;
    public final C62320sa A0F;
    public final C62320sa A0G;

    public C332567Vn(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7SM r4, String str, AnonymousClass0eK r6, AnonymousClass0eK r7, AnonymousClass0eK r8, C62320sa r9, C62320sa r10, C62320sa r11, C62320sa r12, C62320sa r13) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r9, 3);
        0qQ.A0B(r10, 5);
        0qQ.A0B(r11, 6);
        0qQ.A0B(r12, 7);
        0qQ.A0B(r13, 8);
        this.A02 = r2;
        this.A05 = userSession;
        this.A0G = r9;
        this.A06 = r4;
        this.A0F = r10;
        this.A0C = r11;
        this.A0D = r12;
        this.A0E = r13;
        this.A08 = str;
        this.A0A = r6;
        this.A09 = r7;
        this.A0B = r8;
    }

    public static final void A00(C332567Vn r3, String str) {
        C249703kE A0W = ((RecyclerView) r3.A0B.get()).A0W(((C333517Zg) r3.A0A.get()).BSN().CMC(str));
        if (A0W != null) {
            A0W.itemView.startAnimation(AnimationUtils.loadAnimation(r3.A02.requireContext(), R.anim.bounce));
        }
    }
}
