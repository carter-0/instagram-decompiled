package X;

import android.animation.Animator;
import android.os.VibrationEffect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;

/* renamed from: X.OeX  reason: case insensitive filesystem */
public final class C71158OeX implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C71158OeX(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            C71085Ob8 ob8 = (C71085Ob8) this.A02;
            if (ob8.A0C) {
                ob8.A0S.A00(this.A03, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "emoji_tray");
                View view = (View) this.A01;
                view.performHapticFeedback(0);
                if (ob8.A0b) {
                    UserSession userSession = ob8.A0Q;
                    int i = AnonymousClass7TE.A0q(userSession).getInt("direct_reactions_super_react_nux_count", 0);
                    if (i < 2) {
                        AnonymousClass7TG.A1M(1Au.A00(userSession).A01, "direct_reactions_super_react_nux_count", i + 1);
                    }
                }
                if (view.getParent() != null) {
                    ViewGroup A002 = C3019160o.A00(view);
                    while (A002 != null) {
                        int id = A002.getId();
                        A002.setClipChildren(true);
                        if (id != R.id.message_actions_container) {
                            A002.setClipToPadding(true);
                            ViewParent parent = A002.getParent();
                            if (parent instanceof ViewGroup) {
                                A002 = (ViewGroup) parent;
                            } else {
                                return;
                            }
                        } else {
                            A002.setClipToPadding(true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass61R r1 = (AnonymousClass61R) this.A02;
        C3503684j r3 = (C3503684j) this.A01;
        if (r3.A04 != null) {
            r1.pause();
            r3.A04.setVisibility(8);
            String str = this.A03;
            if (str != null) {
                r3.A04(str, 1000);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            C71085Ob8 ob8 = (C71085Ob8) this.A02;
            if (AnonymousClass7TF.A1Z(ob8.A0W)) {
                long[] jArr = new long[10];
                Arrays.fill(jArr, (long) (ob8.A0F / 10));
                ob8.A0K.vibrate(VibrationEffect.createWaveform(jArr, new int[]{5, 10, 15, 20, 25, 30, 35, 40, 45, 50}, -1));
                return;
            }
            ((View) this.A01).performHapticFeedback(0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
