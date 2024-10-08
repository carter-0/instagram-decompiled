package X;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.Comparator;

/* renamed from: X.2xZ  reason: invalid class name */
public final class AnonymousClass2xZ extends Handler {
    public final /* synthetic */ AnonymousClass2xX A00;

    public final void handleMessage(Message message) {
        int B6L;
        int BLQ;
        View BQB;
        1Xj A002;
        Comparator comparator;
        boolean z;
        1Xj r3;
        AnonymousClass3V3 r0;
        AnonymousClass3W1 BQq;
        FragmentActivity activity;
        AnonymousClass37D A01;
        0qQ.A0B(message, 0);
        if (message.what == 0) {
            AnonymousClass2xX r6 = this.A00;
            if (r6.A04 != null && r6.A0A) {
                C232722uK r9 = r6.A0M;
                AnonymousClass3OB A0J = r9.A0J();
                0qQ.A0B(A0J, 0);
                if ((A0J == AnonymousClass3OB.IDLE || A0J == AnonymousClass3OB.PAUSED) && !r9.A0Y()) {
                    Fragment fragment = r6.A0E;
                    if (!(fragment == null || (activity = fragment.getActivity()) == null || (A01 = AnonymousClass37D.A00.A01(activity)) == null)) {
                        AnonymousClass37F r2 = (AnonymousClass37F) A01;
                        if (r2.A0g && r2.A0c) {
                            return;
                        }
                    }
                    C263744Ne r02 = r9.A02;
                    if (r02 != null && (r0 = r02.A08) != null && (BQq = r0.BQq()) != null && BQq.A26) {
                        return;
                    }
                    if (r6.A02 != null) {
                        C263394Lv A02 = AnonymousClass2xX.A02(r6);
                        if (A02 != null) {
                            C231332rR r1 = r6.A0H;
                            1Xj r32 = A02.A00;
                            if (!AnonymousClass3OG.A04(r6.A0F, r1, r32)) {
                                C234272xa r22 = r6.A0J;
                                if (r22 != null && r22.A01 != r32) {
                                    CountDownTimer countDownTimer = r22.A00;
                                    if (countDownTimer != null) {
                                        countDownTimer.cancel();
                                    }
                                    r22.A01 = r32;
                                    AnonymousClass3V3 r12 = A02.A01;
                                    r22.A02 = r12.BQq();
                                    AnonymousClass3TN B5Y = r12.B5Y();
                                    if (B5Y != null) {
                                        B5Y.setVisibility(0);
                                        B5Y.setVideoIconState(AnonymousClass3TO.TIMER);
                                        B5Y.EiM(5000, false);
                                    } else {
                                        B5Y = null;
                                    }
                                    r22.A03 = B5Y;
                                    C52803Gcv gcv = new C52803Gcv(r32, r22);
                                    gcv.start();
                                    r22.A00 = gcv;
                                    return;
                                }
                                return;
                            }
                        }
                        C234272xa r23 = r6.A0J;
                        if (r23 != null) {
                            CountDownTimer countDownTimer2 = r23.A00;
                            if (countDownTimer2 != null) {
                                countDownTimer2.cancel();
                            }
                            AnonymousClass3TN r13 = r23.A03;
                            if (r13 != null) {
                                r13.setVideoIconState(AnonymousClass3TO.HIDDEN);
                            }
                            AnonymousClass3W1 r03 = r23.A02;
                            if (r03 != null) {
                                r03.A0m(false, false);
                            }
                            r23.A00 = null;
                            r23.A01 = null;
                            r23.A02 = null;
                            r23.A03 = null;
                        }
                        if (A02 != null && (r3 = A02.A00) != null) {
                            r6.A0A(r3, A02.A01, r6.A0H.BQr(r3), AnonymousClass2xX.A04(r6, false, false));
                        }
                    } else if (r6.A0L.A04) {
                        C238133Ar r10 = r6.A04;
                        if (r10 != null) {
                            UserSession userSession = r6.A0F;
                            0Tu r33 = 0Tu.A05;
                            if (182.A06(r33, userSession, 36325330151158649L)) {
                                comparator = C241423Pd.A02;
                            } else {
                                comparator = C241423Pd.A00;
                            }
                            C263394Lv A03 = AnonymousClass2xX.A03(r6, comparator, r10.B6L(), r10.BLQ());
                            boolean z2 = false;
                            if (A03 == null || A03.A03 != AnonymousClass2xX.A00(r6, r10)) {
                                r9.A0U("scroll", true, false);
                                if (A03 == null) {
                                    return;
                                }
                            }
                            1Xj r5 = A03.A00;
                            if (r5 != null) {
                                C234282xb r7 = r6.A0K;
                                AnonymousClass4HX r14 = (AnonymousClass4HX) r7.A07.get(r5);
                                if (r14 != null) {
                                    Object obj = r14.A03;
                                    if (obj instanceof AnonymousClass3Y6) {
                                        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                                        if (!((AnonymousClass3Y6) obj).A0O && 182.A06(r33, userSession, 36318196210931695L) && r7.A02.A00()) {
                                            r7.A01();
                                            return;
                                        }
                                    }
                                }
                                AnonymousClass4HX r4 = (AnonymousClass4HX) r6.A0O.get(r5);
                                AnonymousClass3W1 BQr = r6.A0H.BQr(r5);
                                AnonymousClass3V3 r24 = A03.A01;
                                if (r4 != null) {
                                    z = r4.A05;
                                    z2 = r4.A06;
                                } else {
                                    z = false;
                                }
                                r6.A0A(r5, r24, BQr, AnonymousClass2xX.A04(r6, z, z2));
                            }
                        }
                    } else {
                        C238133Ar r92 = r6.A04;
                        if (r92 != null && (B6L = r92.B6L()) <= (BLQ = r92.BLQ())) {
                            while (true) {
                                C231332rR r42 = r6.A0H;
                                AnonymousClass3V3 A012 = AnonymousClass3OG.A01(r6.A0F, r42, r92, B6L);
                                if (!(A012 == null || (BQB = A012.BQB()) == null)) {
                                    int height = (int) (((float) BQB.getHeight()) * r6.A0B);
                                    StickyHeaderListView stickyHeaderListView = r6.A05;
                                    ViewGroup CEd = r92.CEd();
                                    0qQ.A07(CEd);
                                    if (C253923rd.A01(CEd, BQB, stickyHeaderListView) >= height && (A002 = AnonymousClass3OG.A00(r42, r92, B6L)) != null) {
                                        r6.A0A(A002, A012, r42.BQr(A002), AnonymousClass2xX.A04(r6, false, false));
                                        return;
                                    }
                                }
                                if (B6L != BLQ) {
                                    B6L++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2xZ(Looper looper, AnonymousClass2xX r2) {
        super(looper);
        this.A00 = r2;
    }
}
