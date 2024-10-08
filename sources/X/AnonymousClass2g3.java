package X;

import com.instagram.android.R;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$displayStyle$3;
import com.instagram.notifications.badging.ui.viewmodel.BaseBadgeViewModel$shouldShowBadge$2;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2g3  reason: invalid class name */
public abstract class AnonymousClass2g3 {
    public AnonymousClass9IR A00;
    public 2aX A01;
    public C262204Co A02;
    public final int A03;
    public final int A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final 2Fk A07;
    public final 2Fk A08;
    public final C226252fx A09;
    public final C226252fx A0A;
    public final C226252fx A0B;
    public final C226252fx A0C;
    public final C71062aE A0D;
    public final C71112ao A0E;
    public final Map A0F;
    public final C62320sa A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final boolean A0K;
    public final AnonymousClass0r6 A0L;

    public final void A02(boolean z) {
        C226252fx r6;
        AnonymousClass2g2 r2 = (AnonymousClass2g2) this;
        if (!((Boolean) r2.A0I.getValue()).booleanValue() || r2.A03 || z) {
            if (((AnonymousClass2g6) r2.A0H.getValue()).ordinal() == 1) {
                r6 = C226252fx.TOAST;
            } else {
                r6 = C226252fx.DOT;
            }
            2aX r5 = r2.A01;
            if (r5 != null) {
                2aT r0 = r2.A00;
                AnonymousClass2g1 r4 = r2.A02;
                r0.A05(r6, r4, r5, (Map) null);
                2aV r22 = r2.A01;
                0qQ.A0B(r4, 0);
                r22.A03(new C239993Jd(r6, r4, (C71062aE) null, (Set) null), r5, false);
            }
        }
    }

    public abstract void A03();

    public final void A01(AnonymousClass2g6 r7) {
        C71062aE r1;
        this.A0H.Epw(r7);
        2aX r0 = this.A01;
        if (r0 != null && (r1 = r0.A03) != null) {
            C71112ao r5 = this.A0E;
            r5.A00.put(r1, r7);
            if (this.A0K && r7 == AnonymousClass2g6.VISIBLE) {
                AnonymousClass9IR r02 = this.A00;
                int i = r02.A01;
                List list = (List) r02.A02;
                boolean z = r02.A03;
                0qQ.A0B(list, 1);
                AnonymousClass9IR r2 = new AnonymousClass9IR(list, i, z, true);
                r5.A01.put(this.A0D, r2);
                this.A00 = r2;
            }
        }
    }

    public AnonymousClass2g3(C226252fx r30, C226252fx r31, C226252fx r32, C226252fx r33, C71062aE r34, C71112ao r35, C62320sa r36, C262224Cq r37, AnonymousClass0r6 r38, int i, int i2, boolean z, boolean z2, boolean z3) {
        AnonymousClass9IR r3;
        this.A09 = r30;
        this.A0A = r31;
        this.A0C = r32;
        this.A0B = r33;
        this.A03 = i;
        C71062aE r39 = r34;
        this.A0D = r39;
        C71112ao r9 = r35;
        this.A0E = r9;
        this.A04 = i2;
        this.A0G = r36;
        this.A0K = z3;
        0eP r0 = new 0eP(2aD.A0G, Integer.valueOf(R.drawable.notification_comment_icon));
        0eP r02 = new 0eP(2aD.A0T, Integer.valueOf(R.drawable.notification_like_icon));
        0eP r03 = new 0eP(2aD.A0f, Integer.valueOf(R.drawable.notification_people_icon));
        0eP r15 = new 0eP(2aD.A0i, Integer.valueOf(R.drawable.notification_story_mention_icon));
        2aD r4 = 2aD.A0o;
        Integer valueOf = Integer.valueOf(R.drawable.notification_tag_icon);
        0eP r14 = new 0eP(r4, valueOf);
        0eP r13 = new 0eP(2aD.A0D, valueOf);
        0eP r19 = r02;
        0eP r20 = r03;
        0eP r21 = r15;
        this.A0F = 0Yt.A06(new 0eP[]{r0, r19, r20, r21, r14, r13, new 0eP(2aD.A0A, Integer.valueOf(R.drawable.instagram_alert_filled_16)), new 0eP(2aD.A0h, Integer.valueOf(R.drawable.instagram_shopping_bag_filled_16)), new 0eP(2aD.A0O, Integer.valueOf(R.drawable.instagram_donations_filled_16)), new 0eP(2aD.A0d, Integer.valueOf(R.drawable.instagram_ads_pano_filled_16)), new 0eP(2aD.A0W, Integer.valueOf(R.drawable.instagram_carousel_pano_filled_16))});
        02z r7 = new 02z(false);
        this.A0J = r7;
        02z r5 = new 02z(false);
        this.A0I = r5;
        Object obj = r9.A00.get(r39);
        this.A0H = new 02z(obj == null ? AnonymousClass2g6.IDLE : obj);
        AnonymousClass9IR r04 = (AnonymousClass9IR) r9.A01.get(r39);
        if (r04 != null) {
            int i3 = r04.A01;
            List list = (List) r04.A02;
            boolean z4 = r04.A03;
            boolean z5 = r04.A04;
            0qQ.A0B(list, 1);
            r3 = new AnonymousClass9IR(list, i3, z4, z5);
        } else {
            r3 = new AnonymousClass9IR((List) 0sn.A00, 0, 12, false);
        }
        this.A00 = r3;
        C61860pz r92 = new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 48), r38);
        this.A0L = r92;
        C262224Cq r6 = r37;
        this.A05 = C226292g8.A00(r6.ArX(), new C226282g7(this, r92));
        this.A07 = C226292g8.A00(r6.ArX(), AnonymousClass10H.A03(new C376939Jx(1, (AnonymousClass4D7) null), AnonymousClass10H.A03(new BaseBadgeViewModel$shouldShowBadge$2((AnonymousClass4D7) null, z), new AnonymousClass2gD(r92), r5), this.A0H));
        this.A08 = C226292g8.A00(r6.ArX(), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 49), new AnonymousClass2gJ(this, new C61860pz(new AnonymousClass9K1((Object) r6, (Object) this, (AnonymousClass4D7) null, 18), 11M.A00(AnonymousClass05K.A00, new AnonymousClass2gH(new AnonymousClass2gI(AnonymousClass10H.A03(new C376949Jy(7, (AnonymousClass4D7) null), new AnonymousClass2gH(new AnonymousClass2gG(AnonymousClass10H.A03(new C376949Jy(7, (AnonymousClass4D7) null), new C61860pz(new C376879Jr(this, (AnonymousClass4D7) null, 29), new AnonymousClass2gF(this, r92)), r7))), r5), z2)), -1)))));
        this.A06 = C226292g8.A00(r6.ArX(), AnonymousClass10H.A03(new BaseBadgeViewModel$displayStyle$3(this, (AnonymousClass4D7) null), new AnonymousClass2gL(this, new AnonymousClass2gK(this.A0H)), r5));
    }
}
