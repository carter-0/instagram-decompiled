package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: X.P9y  reason: case insensitive filesystem */
public final class C72541P9y implements AnonymousClass7YM {
    public static boolean A04;
    public static final Set A05 = 0sc.A07(new String[]{"🕷️", "💀", "🦇", "👻", "🕸️", "☠️", "spooky szn", "spooky season", "boo!", "scary movies", "scary movie", "skeleton", "skeletons", "horror movies", "horror movie", "jump scare", "haunted house"});
    public AnimatorSet A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C73785Pjk.A00);
    public final AnonymousClass4DH A03;

    public final boolean Cnf(String str, String str2, String str3, String str4) {
        ViewGroup viewGroup;
        String str5 = str2;
        String str6 = str3;
        int A022 = DbW.A02(1, str5, str6);
        if (!(str == null || str.length() == 0)) {
            if (!A04) {
                UserSession userSession = this.A01;
                AnonymousClass3U9 A0b = C66582MXn.A0b(userSession, str5);
                if (A0b != null && !A0b.CXW() && !A0b.COb() && !A0b.CcG() && !A0b.isPending() && C70028Nw6.A00(str)) {
                    0Tu r20 = 0Tu.A05;
                    if (182.A06(r20, userSession, 36330350967865932L)) {
                        String str7 = str4;
                        if ("tap".equals(str7)) {
                            boolean equals = str6.equals(userSession.A06);
                            0Aj A0H = C66582MXn.A0H(((C71861Os2) userSession.A01(C71861Os2.class, new C73661Pha(userSession, 31))).A00, "direct_halloween_animation_activation_tap", str5);
                            A0H.A7p("is_sender", Boolean.valueOf(equals));
                            A0H.Cgf();
                        }
                        AnonymousClass4DH r1 = this.A03;
                        boolean equals2 = str6.equals(userSession.A06);
                        View view = r1.mView;
                        if (!(view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.animation_container)) == null)) {
                            viewGroup.setVisibility(0);
                            viewGroup.removeAllViews();
                            Context context = viewGroup.getContext();
                            0qQ.A0A(context);
                            int A09 = 0nA.A09(context);
                            int A08 = 0nA.A08(context);
                            List A0J = 03t.A0J(C69274Nia.values());
                            if (this.A00 == null) {
                                this.A00 = new AnimatorSet();
                            }
                            int i = 0;
                            do {
                                TextView textView = new TextView(context);
                                viewGroup.addView(textView);
                                C66581MXm.A1A(textView, -2);
                                textView.setText("🕷️");
                                textView.setTextSize(30.0f);
                                C69274Nia nia = (C69274Nia) 00k.A0I(0jo.A1G(A0J));
                                float f = A02(context, nia, A08, A09).A01;
                                float f2 = A01(context, nia, A08, A09).A01;
                                float f3 = A02(context, nia, A08, A09).A00;
                                float f4 = A01(context, nia, A08, A09).A00;
                                float f5 = f4;
                                textView.setRotation((float) (((Math.atan2((double) (f2 - f), (double) (f4 - f3)) * 180.0d) / 3.141592653589793d) - 90.0d));
                                textView.setX(f3);
                                textView.setY(f);
                                AnimatorSet animatorSet = new AnimatorSet();
                                float[] fArr = new float[A022];
                                fArr[0] = f3;
                                fArr[1] = f5;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationX", fArr);
                                float[] fArr2 = new float[A022];
                                fArr2[0] = f;
                                fArr2[1] = f2;
                                animatorSet.playTogether(new Animator[]{ofFloat, ObjectAnimator.ofFloat(textView, "translationY", fArr2)});
                                animatorSet.setDuration(((long) ((Random) this.A02.getValue()).nextInt(200)) + 4800);
                                animatorSet.setStartDelay(((long) i) * 200);
                                AnimatorSet animatorSet2 = this.A00;
                                if (animatorSet2 != null) {
                                    animatorSet2.playTogether(new Animator[]{animatorSet});
                                }
                                if (182.A06(r20, userSession, 36330350967931469L)) {
                                    AnonymousClass0fU.A00(new C71408Ok7(35, (Object) animatorSet, (Object) textView), textView);
                                }
                                i++;
                            } while (i < 12);
                            AnimatorSet animatorSet3 = this.A00;
                            if (animatorSet3 != null) {
                                C71161Oea.A00(animatorSet3, viewGroup, 4);
                            }
                            AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
                            AnimatorSet animatorSet4 = this.A00;
                            if (animatorSet4 != null) {
                                animatorSet4.setInterpolator(accelerateInterpolator);
                            }
                            AnimatorSet animatorSet5 = this.A00;
                            if (animatorSet5 != null) {
                                animatorSet5.start();
                            }
                            A04 = true;
                            0Aj A0e = AnonymousClass7TE.A0e(((C71861Os2) userSession.A01(C71861Os2.class, new C73661Pha(userSession, 31))).A00, "direct_halloween_animation");
                            DbS.A1N(A0e, str7);
                            A0e.A7p("is_sender", JTP.A0g(A0e, "open_thread_id", str5, equals2));
                            A0e.Cgf();
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static int A00(C72541P9y p9y, int i) {
        return ((Random) p9y.A02.getValue()).nextInt(i);
    }

    private final C70563OBl A01(Context context, C69274Nia nia, int i, int i2) {
        float f;
        float f2;
        float A002 = 0nA.A00(context, 40.0f);
        int ordinal = nia.ordinal();
        if (ordinal == 0) {
            f = (float) i2;
            i = A00(this, i);
            f2 = (float) i;
        } else if (ordinal == 1) {
            f = -A002;
            i = A00(this, i);
            f2 = (float) i;
        } else if (ordinal == 2) {
            f = (float) A00(this, i2);
            f2 = (float) i;
        } else if (ordinal == 3) {
            f = (float) A00(this, i2);
            f2 = -A002;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C70563OBl(f, f2);
    }

    private final C70563OBl A02(Context context, C69274Nia nia, int i, int i2) {
        float f;
        float A002;
        float A003 = 0nA.A00(context, 40.0f);
        int ordinal = nia.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f = (float) i2;
                i = A00(this, i);
            } else if (ordinal == 2) {
                f = (float) A00(this, i2);
                A002 = -A003;
            } else if (ordinal == 3) {
                f = (float) A00(this, i2);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            A002 = (float) i;
        } else {
            f = -A003;
            A002 = (float) A00(this, i);
        }
        return new C70563OBl(f, A002);
    }

    public C72541P9y(AnonymousClass4DH r3, UserSession userSession) {
        this.A01 = userSession;
        this.A03 = r3;
    }
}
