package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Vr  reason: invalid class name and case insensitive filesystem */
public final class C332607Vr {
    public int A00;
    public final Fragment A01;
    public final 1wn A02 = new C332617Vs(this);
    public final UserSession A03;
    public final AnonymousClass7V0 A04;
    public final C62320sa A05;
    public final AnonymousClass7UW A06;

    public C332607Vr(Fragment fragment, UserSession userSession, AnonymousClass7UW r4, AnonymousClass7V0 r5, C62320sa r6) {
        0qQ.A0B(fragment, 1);
        0qQ.A0B(r5, 3);
        0qQ.A0B(r4, 4);
        0qQ.A0B(r6, 5);
        this.A01 = fragment;
        this.A03 = userSession;
        this.A04 = r5;
        this.A06 = r4;
        this.A05 = r6;
    }

    public static final void A00(C332607Vr r76, int i) {
        C332607Vr r1 = r76;
        int i2 = i;
        if (r1.A00 != i2) {
            r1.A00 = i2;
            ((C333517Zg) r1.A05.invoke()).BCh().DMf(i2);
            AnonymousClass7UW r3 = r1.A06;
            AnonymousClass7LZ r2 = r3.A01;
            if (r2 != null) {
                String str = r2.A0J;
                CharSequence charSequence = r2.A0G;
                C254793t3 r762 = r2.A0C;
                boolean z = r2.A0m;
                boolean z2 = r2.A0s;
                boolean z3 = r2.A0N;
                boolean z4 = r2.A0h;
                boolean z5 = r2.A0M;
                boolean z6 = r2.A0U;
                boolean z7 = r2.A0X;
                Reel reel = r2.A0D;
                boolean z8 = r2.A0Y;
                AnonymousClass34S r6 = r2.A09;
                List list = r2.A0K;
                boolean z9 = r2.A0c;
                boolean z10 = r2.A0o;
                boolean z11 = r2.A0i;
                boolean z12 = r2.A0e;
                boolean z13 = r2.A0g;
                boolean z14 = r2.A0f;
                boolean z15 = r2.A0p;
                boolean z16 = r2.A0k;
                boolean z17 = r2.A0r;
                User user = r2.A0E;
                MessagingUser messagingUser = r2.A0B;
                boolean z18 = r2.A0j;
                int i3 = r2.A07;
                int i4 = r2.A00;
                int i5 = r2.A03;
                int i6 = r2.A01;
                int i7 = r2.A02;
                boolean z19 = r2.A0x;
                boolean z20 = r2.A0l;
                int i8 = r2.A04;
                boolean z21 = r2.A0S;
                int i9 = r2.A08;
                boolean z22 = r2.A0a;
                boolean z23 = r2.A0Z;
                boolean z24 = r2.A0n;
                C376659Iv r71 = r2.A0A;
                boolean z25 = r2.A0V;
                boolean z26 = r2.A0T;
                boolean z27 = r2.A0O;
                boolean z28 = r2.A0L;
                boolean z29 = r2.A0d;
                boolean z30 = r2.A0b;
                boolean z31 = r2.A0Q;
                boolean z32 = r2.A0W;
                boolean z33 = r2.A0R;
                boolean z34 = r2.A0u;
                boolean z35 = r2.A0v;
                boolean z36 = r2.A0t;
                int i10 = r2.A06;
                boolean z37 = r2.A0q;
                Integer num = r2.A0I;
                Integer num2 = r2.A0H;
                boolean z38 = r2.A0P;
                CharSequence charSequence2 = r2.A0F;
                0qQ.A0B(str, 0);
                0qQ.A0B(r6, 12);
                0qQ.A0B(list, 13);
                r3.A02(new AnonymousClass7LZ(r6, r71, messagingUser, r762, reel, user, charSequence, charSequence2, num, num2, str, list, i3, i4, i5, i6, i7, i2, i8, i9, i10, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, r2.A0w, z33, z34, z35, z36, z37, z38));
            }
        }
    }
}
