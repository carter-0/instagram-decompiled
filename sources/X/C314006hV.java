package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.List;

/* renamed from: X.6hV  reason: invalid class name and case insensitive filesystem */
public final class C314006hV implements C314016hW {
    public final UserSession A00;
    public final AnonymousClass3BQ A01;
    public final C313056fm A02;
    public final AnonymousClass0iw A03;
    public final C311246cN A04;
    public final C309966aD A05;
    public final C313426gQ A06;

    public C314006hV(AnonymousClass0iw r2, UserSession userSession, AnonymousClass3BQ r4, C311246cN r5, C313056fm r6, C309966aD r7, C313426gQ r8) {
        0qQ.A0B(r8, 1);
        0qQ.A0B(r6, 3);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(r4, 5);
        this.A06 = r8;
        this.A05 = r7;
        this.A02 = r6;
        this.A00 = userSession;
        this.A01 = r4;
        this.A04 = r5;
        this.A03 = r2;
    }

    public final boolean Cn1(C255773uh r20, C250973mM r21, C309426Yf r22, float f) {
        int i;
        Number number;
        double doubleValue;
        double d;
        float A002;
        C250973mM r11 = r21;
        0qQ.A0B(r11, 0);
        C255773uh r12 = r20;
        0qQ.A0B(r12, 1);
        C309426Yf r10 = r22;
        0qQ.A0B(r10, 2);
        if (!C309456Yi.A02(r11)) {
            return false;
        }
        C313426gQ r9 = this.A06;
        int currentPositionMs = r9.getCurrentPositionMs();
        C313416gP r8 = (C313416gP) r9;
        int i2 = r8.A03;
        if (!C309456Yi.A02(r11)) {
            i = -1;
        } else {
            double d2 = ((double) currentPositionMs) / 1000.0d;
            List list = r11.A0H.A17;
            if (list != null) {
                i = 0;
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        i = list.size() - 1;
                        break;
                    }
                    Number number2 = (Number) list.get(i);
                    if (i == list.size() - 1) {
                        number = Double.valueOf(((double) i2) / 1000.0d);
                    } else {
                        number = (Number) list.get(i + 1);
                    }
                    if (d2 >= number2.doubleValue() && d2 < number.doubleValue()) {
                        break;
                    }
                    i++;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (r11.A01() < i) {
            r10.A0W = AnonymousClass05K.A0Y;
            r10.A0q = true;
            A00(r12, r11, r10, i);
        }
        int currentPositionMs2 = r9.getCurrentPositionMs();
        int i3 = r8.A03;
        if (!C309456Yi.A02(r11)) {
            A002 = -1.0f;
        } else {
            double d3 = ((double) currentPositionMs2) / 1000.0d;
            List list2 = r11.A0H.A17;
            if (list2 != null) {
                int A012 = r11.A01();
                if (A012 < list2.size()) {
                    Number number3 = (Number) list2.get(A012);
                    if (C309456Yi.A03(r11)) {
                        1Xj r4 = r12.A0b;
                        r4.getClass();
                        d = C297785sK.A00(r4);
                        0qQ.A0A(number3);
                        doubleValue = number3.doubleValue();
                        double d4 = (((double) i3) / 1000.0d) - doubleValue;
                        if (d4 < d || r10.A1A) {
                            d = d4;
                        }
                    } else {
                        double doubleValue2 = ((Number) list2.get(A012 + 1)).doubleValue();
                        0qQ.A0A(number3);
                        doubleValue = number3.doubleValue();
                        d = doubleValue2 - doubleValue;
                    }
                    A002 = 0mi.A00((float) ((d3 - doubleValue) / d), 0.0f, 1.0f);
                } else {
                    throw new IllegalStateException("Video to carousel index is invalid");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        r10.A02(A002);
        return !C297785sK.A0M(this.A00, r12, r11, this.A01, r10);
    }

    public final void DaV(C255773uh r1, C250973mM r2, C309426Yf r3, float f) {
    }

    private final void A00(C255773uh r7, C250973mM r8, C309426Yf r9, int i) {
        View view;
        C309476Yk r1;
        C316076l4 r12;
        C74500Pvu AjF;
        Integer num;
        List list = r8.A0H.A17;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException("This ReelViewModel does not represent a video to carousel story, so why are you calling this method?");
        } else if (i < 0 || i >= list.size()) {
            throw new IllegalArgumentException("Passed in videoToCarouselIndex is out of bounds");
        } else {
            r8.A02 = i;
            C311246cN r13 = this.A04;
            if (r13 != null) {
                View view2 = ((C313046fl) this.A02).A04.A0F;
                if (view2 != null) {
                    r13.A00(view2, r7, r8, r9);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            UserSession userSession = this.A00;
            AnonymousClass3BQ r5 = this.A01;
            if (AnonymousClass4EQ.A0D(userSession, r7, r5)) {
                ReboundViewPager reboundViewPager = ((C313046fl) this.A02).A04;
                View view3 = reboundViewPager.A0F;
                if (view3 != null) {
                    Context context = view3.getContext();
                    0qQ.A07(context);
                    View view4 = reboundViewPager.A0F;
                    if (view4 != null) {
                        Object tag = view4.getTag();
                        if ((tag instanceof C316076l4) && (r12 = (C316076l4) tag) != null && ((!AnonymousClass4EQ.A0D(userSession, r8.A08(userSession), r5) || !C309506Yn.A05(context, userSession, r7, r8) || C309506Yn.A09(userSession, r7, r8.A01)) && (AjF = r12.AjF()) != null)) {
                            C309426Yf Bkh = AjF.Bkh();
                            if (Bkh == null || !C309506Yn.A0C(userSession, Bkh)) {
                                C66951Mfk.A03(AjF, AnonymousClass05K.A01);
                                num = AnonymousClass05K.A00;
                            } else {
                                num = AnonymousClass05K.A0C;
                            }
                            C66951Mfk.A03(AjF, num);
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ReboundViewPager reboundViewPager2 = ((C313046fl) this.A02).A04;
            View view5 = reboundViewPager2.A0F;
            if (view5 != null) {
                Context context2 = view5.getContext();
                0qQ.A07(context2);
                if (C307096Ou.A01(context2, userSession, r7, r8) && (view = reboundViewPager2.A0F) != null) {
                    Object tag2 = view.getTag();
                    if ((tag2 instanceof C309476Yk) && (r1 = (C309476Yk) tag2) != null) {
                        C305946Ke C3Z = r1.C3Z();
                        C305956Kf.A03(C3Z);
                        C3Z.A01(AnonymousClass05K.A00);
                    }
                }
                ImageUrl A062 = r8.A06();
                if (!C253833rU.A02(A062)) {
                    View view6 = reboundViewPager2.A0F;
                    if (view6 != null) {
                        Object tag3 = view6.getTag();
                        0qQ.A0C(tag3, "null cannot be cast to non-null type com.instagram.reels.listener.ReelViewerItemBindable");
                        IgProgressImageView BGP = ((C316036l0) tag3).BGP();
                        if (BGP == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (A062 != null) {
                            BGP.setUrl(A062, this.A03);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public static final void A01(C255773uh r3, C250973mM r4, C309426Yf r5, C314006hV r6, int i) {
        C255773uh r1;
        r6.A00(r3, r4, r5, i);
        r5.A02(0.0f);
        List list = r4.A0H.A17;
        if (list != null) {
            int doubleValue = (int) (((Number) list.get(i)).doubleValue() * 1000.0d);
            C313416gP r2 = (C313416gP) r6.A06;
            if (!(r2.A03 <= 0 || (r1 = r2.A0L) == null || r2.A0M == null)) {
                17k.A0E(!r1.A17());
                C313416gP.A0B(r2, 0mi.A03(doubleValue, 0, r2.A03));
            }
            r6.A05.DiL(doubleValue);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
