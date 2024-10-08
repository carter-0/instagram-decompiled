package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GdT  reason: case insensitive filesystem */
public final class C52837GdT extends GestureDetector.SimpleOnGestureListener {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ C243673Zt A02;
    public final /* synthetic */ C243673Zt A03;
    public final /* synthetic */ C338047hK A04;
    public final /* synthetic */ C300835xz A05;
    public final /* synthetic */ boolean A06;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public C52837GdT(AnonymousClass3Y5 r2, C243673Zt r3, C243673Zt r4, C338047hK r5, C300835xz r6, boolean z) {
        this.A04 = r5;
        this.A06 = z;
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C333777a7 r0;
        boolean z;
        C338047hK r2 = this.A04;
        C335907dj r5 = r2.A00;
        if (!r5.A0S && (r0 = r2.A01) != null && ((!(z = r0.A0d) || (z && this.A06)) && r5.A0H == AnonymousClass05K.A00 && r5.A05 == C335857de.A04)) {
            AnonymousClass2S0.A01.A06();
            this.A05.A02(false, false, false);
            r2.A02.A0h(r5.A0K, r5.A0N, false);
            this.A00 = false;
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        C338047hK r5 = this.A04;
        if (!r5.A04) {
            if (r5.A05) {
                if (AnonymousClass7TF.A0R(0Tu.A05, r5.A03, 36323032344177408L).booleanValue()) {
                    return;
                }
            }
            if (this.A00) {
                if (AnonymousClass7TF.A0R(0Tu.A05, r5.A03, 36323032344177408L).booleanValue()) {
                    AnonymousClass2S0.A01.A06();
                    C52971GgO ggO = r5.A02;
                    C335907dj r0 = r5.A00;
                    String str = r0.A0K;
                    String str2 = r0.A0N;
                    float A032 = C51972G9s.A03(this.A03);
                    MediaCommentListRepository mediaCommentListRepository = ggO.A0A;
                    C335907dj A012 = C335067cK.A01(C51968G9o.A0g(mediaCommentListRepository), str, str2);
                    if (A012 != null) {
                        I21 i21 = I21.A00;
                        UserSession userSession = ggO.A0E;
                        boolean A07 = C52971GgO.A07(ggO);
                        Integer num = AnonymousClass05K.A01;
                        i21.A03(userSession, num, num, num, A07);
                        C51965G9l.A0l().markerPoint(309476254, 002.A0O("select_comment_screen_comment_select_tap_", 1));
                        List A002 = C52971GgO.A00((C333777a7) ggO.A0B.A03.getValue(), ggO, str, str2);
                        if (A002 != null && !A002.isEmpty()) {
                            1Av A003 = 1Au.A00(userSession);
                            AnonymousClass7TF.A1J(A003, A003.A1x, 1Av.A8a, 86, true);
                            AnonymousClass7TE.A1Z(new MFj(A002, mediaCommentListRepository, str, str2, (AnonymousClass4D7) null, 1, true), mediaCommentListRepository.A01);
                            ggO.A0O.Epw(new C334897c3(A012, A002, A032));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C52971GgO ggO2 = r5.A02;
                C335907dj r02 = r5.A00;
                ggO2.A0g(r02.A0K, r02.A0N, true);
                return;
            }
            this.A00 = true;
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C338047hK r8 = this.A04;
        if (!r8.A04) {
            if (!r8.A05) {
                UserSession userSession = r8.A03;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36323032343980798L)) {
                    C243673Zt r0 = this.A02;
                    AnonymousClass2VL.A00();
                    View view = (View) r0.A00;
                    if (view == null) {
                        return false;
                    }
                    Context A002 = C243803a8.A00(this.A01);
                    0qQ.A0B(userSession, 2);
                    1Av A003 = 1Au.A00(userSession);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    0xa r1 = A003.A01;
                    boolean A1R = AnonymousClass7TF.A1R(((seconds - DbW.A06(r1, "seen_longpress_comment_for_more_options_nux_time")) > SandboxRepository.CACHE_TTL ? 1 : ((seconds - DbW.A06(r1, "seen_longpress_comment_for_more_options_nux_time")) == SandboxRepository.CACHE_TTL ? 0 : -1)));
                    boolean A1T = AnonymousClass7TF.A1T(r1.getInt("seen_longpress_comment_for_more_options_nux_count", 0), 3);
                    boolean A1a = AnonymousClass7TG.A1a(A003, A003.A1x, 1Av.A8a, 86);
                    if (!182.A06(r2, userSession, 36323032344701702L) ? !(!A1R || !A1T) : !(!A1R || A1a)) {
                        0xa A0q = AnonymousClass7TE.A0q(userSession);
                        AnonymousClass7TG.A0g(A0q, "seen_longpress_comment_for_more_options_nux_count").apply();
                        0xY AR4 = A0q.AR4();
                        AR4.E5c("seen_longpress_comment_for_more_options_nux_time", timeUnit.toSeconds(System.currentTimeMillis()));
                        AR4.apply();
                        AnonymousClass5Gt r02 = new AnonymousClass5Gt(C61270mF.A00(A002), new C315476jx(2131965621));
                        r02.A03(view);
                        r02.A02();
                        r02.A0A = true;
                        DbU.A1T(r02);
                        return true;
                    }
                }
                if (182.A06(r2, userSession, 36323032343980798L)) {
                    return false;
                }
            }
            C52971GgO ggO = r8.A02;
            C335907dj r03 = r8.A00;
            ggO.A0g(r03.A0K, r03.A0N, false);
        }
        return true;
    }
}
