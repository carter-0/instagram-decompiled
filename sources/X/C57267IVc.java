package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IVc  reason: case insensitive filesystem */
public final class C57267IVc implements MVB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ G8M A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ 1ZT A04;
    public final /* synthetic */ 1Xj A05;

    public final void onButtonClick(View view) {
        ProductType A1v;
        String str;
        1ZT r8;
        0qQ.A0B(view, 0);
        IN9 in9 = IN9.A00;
        UserSession userSession = this.A03;
        in9.A01(userSession);
        I6J i6j = I6J.A00;
        1Xj r3 = this.A05;
        ProductType A1v2 = r3.A1v();
        String A2n = r3.A2n();
        if (A2n != null) {
            List list = ((C47185DsX) this.A02).A03;
            i6j.A05(userSession, A1v2, (String) null, "post_publish_toast", (String) null, A2n, list, (List) null, (List) null, (List) null, (List) null, (Map) null, AnonymousClass7TF.A0w(TraceFieldType.Duration, String.valueOf(this.A00)));
            FragmentActivity fragmentActivity = this.A01;
            if (!fragmentActivity.getSupportFragmentManager().A12() && (A1v = r3.A1v()) != null) {
                int ordinal = A1v.ordinal();
                if (ordinal == 13) {
                    if (!182.A06(0Tu.A05, userSession, 36323058114636598L)) {
                        FGD fgd = FGD.A00;
                        String A2n2 = r3.A2n();
                        if (A2n2 != null) {
                            fgd.A03(fragmentActivity, userSession, A2n2);
                            r8 = this.A04;
                            str = r3.A2n();
                            if (str == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    this.A04.A05(fragmentActivity, userSession, "achievement_earned_post_publish_toast", list);
                    return;
                } else if (ordinal == 1 || ordinal == 16) {
                    if (!182.A06(0Tu.A05, userSession, 36323058114636598L)) {
                        String A2n3 = r3.A2n();
                        if (A2n3 != null) {
                            FGD.A02(fragmentActivity, userSession, A2n3);
                            r8 = this.A04;
                            str = r3.A2n();
                            if (str == null) {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    this.A04.A05(fragmentActivity, userSession, "achievement_earned_post_publish_toast", list);
                    return;
                } else if (ordinal == 9) {
                    if (!182.A06(0Tu.A05, userSession, 36323058114636598L)) {
                        String str2 = userSession.A06;
                        String A2n4 = r3.A2n();
                        if (A2n4 != null) {
                            0qQ.A0B(list, 4);
                            C309416Ye A002 = FGD.A00(fragmentActivity, userSession, str2, A2n4);
                            A002.A0P = AnonymousClass7TE.A1D(list);
                            A002.A0A = "achievement_earned_post_publish_toast";
                            AnonymousClass6W8 A012 = AnonymousClass6W8.A01(fragmentActivity, A002.A00(), userSession);
                            A012.A07();
                            A012.A0C(fragmentActivity);
                            return;
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    this.A04.A05(fragmentActivity, userSession, "achievement_earned_post_publish_toast", list);
                    return;
                } else {
                    return;
                }
                r8.A04(fragmentActivity, userSession, str, "achievement_earned_post_publish_toast", list);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57267IVc(FragmentActivity fragmentActivity, G8M g8m, UserSession userSession, 1ZT r4, 1Xj r5, int i) {
        this.A03 = userSession;
        this.A05 = r5;
        this.A02 = g8m;
        this.A00 = i;
        this.A04 = r4;
        this.A01 = fragmentActivity;
    }

    public final void onShow() {
        IN9 in9 = IN9.A00;
        UserSession userSession = this.A03;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(in9, userSession), "instagram_clips_toast_impression");
        if (A0e.isSampled()) {
            C51965G9l.A19(C52236GKd.A0T, A0e);
            C51965G9l.A1C(AnonymousClass5OC.UNLOCKED_ACHIEVEMENTS, A0e);
            C51965G9l.A1M(A0e, "creator_logging_util");
            C51965G9l.A1P(A0e, "");
            C51970G9q.A19(A0e, 0);
            C51965G9l.A1O(A0e, "");
            A0e.Cgf();
        }
        I6J i6j = I6J.A00;
        1Xj r4 = this.A05;
        ProductType A1v = r4.A1v();
        String A2n = r4.A2n();
        if (A2n != null) {
            List list = ((C47185DsX) this.A02).A03;
            i6j.A04(userSession, A1v, (String) null, "post_publish_toast", (String) null, A2n, list, (List) null, (List) null, (List) null, (List) null, (List) null, AnonymousClass7TF.A0w(TraceFieldType.Duration, String.valueOf(this.A00)));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                String A2n2 = r4.A2n();
                if (A2n2 != null) {
                    0qQ.A0B(A18, 2);
                    AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
                    r1.A01 = "ig_achievements";
                    0Aj A0e2 = AnonymousClass7TE.A0e(r1.A00(), "ig_achievements_post_publish_toast_impression");
                    Long A0n = 00y.A0n(10, A2n2);
                    Long A0n2 = 00y.A0n(10, A18);
                    if (!(!A0e2.isSampled() || A0n == null || A0n2 == null)) {
                        A0e2.A9F("media_igid", A0n);
                        A0e2.A9F("achievement_id", A0n2);
                        A0e2.Cgf();
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            String A2n3 = r4.A2n();
            if (A2n3 != null) {
                1ES.A03(new C56022HrU(userSession).A01(A2n3, list, (List) null));
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
