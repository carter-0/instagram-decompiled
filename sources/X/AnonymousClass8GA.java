package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8GA  reason: invalid class name */
public final class AnonymousClass8GA {
    public int A00;
    public int A01;
    public C343367q6 A02;
    public C340297l2 A03;
    public C3498081w A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final View A0A;
    public final AnonymousClass07Z A0B;
    public final AnonymousClass8GD A0C;
    public final AnonymousClass82X A0D;
    public final UserSession A0E;
    public final C357638Yz A0F;
    public final AnonymousClass8GB A0G = new Object();
    public final C3495780x A0H;
    public final ArrayList A0I = new ArrayList();
    public final Resources A0J;
    public final AnonymousClass4CZ A0K = AnonymousClass12T.A00.A04;
    public final C262224Cq A0L;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.8GB, java.lang.Object] */
    public AnonymousClass8GA(Context context, View view, AnonymousClass07Z r5, AnonymousClass82X r6, UserSession userSession, C357638Yz r8, C3498081w r9, C3495780x r10) {
        0qQ.A0B(view, 2);
        0qQ.A0B(r6, 3);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(context, 5);
        0qQ.A0B(r10, 7);
        0qQ.A0B(r5, 8);
        this.A04 = r9;
        this.A0A = view;
        this.A0D = r6;
        this.A0E = userSession;
        this.A09 = context;
        this.A0F = r8;
        this.A0H = r10;
        this.A0B = r5;
        this.A0J = context.getResources();
        this.A0C = new AnonymousClass8GC(this);
        C3498081w r0 = this.A04;
        this.A04 = r0;
        AnonymousClass8GF CrP = r0.CrP();
        CrP.A00 = new AnonymousClass8GG(this);
        CrP.A00();
        this.A0L = C71772f0.A00(r5.getLifecycle());
    }

    public static final boolean A03(AnonymousClass8GA r3) {
        int i;
        List A1P = 0sr.A1P(new Integer[]{0, -1});
        View view = ((C3497981v) r3.A04).getView();
        if (view instanceof ImageView) {
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                i = drawable.getLevel();
                return !A1P.contains(Integer.valueOf(i));
            }
        }
        i = 0;
        return !A1P.contains(Integer.valueOf(i));
    }

    public final boolean A0B(Runnable runnable) {
        int i;
        if (!A03(this) || !A02(this) || !this.A06) {
            runnable.run();
            return false;
        }
        this.A05 = true;
        AnonymousClass8GB r6 = this.A0G;
        View view = this.A0A;
        C41018An2 an2 = new C41018An2(this, runnable);
        if (this.A0F.A0R()) {
            i = Color.parseColor("#FBE9D2");
        } else {
            i = -1;
        }
        view.setBackgroundColor(i);
        r6.A01(view);
        Window A002 = AnonymousClass8GB.A00(view);
        if (A002 != null) {
            WindowManager.LayoutParams attributes = A002.getAttributes();
            attributes.screenBrightness = 1.0f;
            A002.setAttributes(attributes);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 0.95f});
        r6.A00 = ofFloat;
        ofFloat.setDuration(1000);
        r6.A00.setRepeatCount(0);
        r6.A00.addListener(new AJM(view, r6, an2, -1.0f));
        r6.A00.start();
        return true;
    }

    public static final boolean A01(AnonymousClass8GA r1) {
        if (!r1.A08) {
            return false;
        }
        C340297l2 r0 = r1.A03;
        if (r0 == null) {
            0qQ.A0F("cameraController");
            throw AnonymousClass00P.createAndThrow();
        } else if (!r0.CVP()) {
            return false;
        } else {
            C343367q6 r02 = r1.A02;
            if (r02 == null || r02.A00 == null) {
                return true;
            }
            return false;
        }
    }

    public static final boolean A02(AnonymousClass8GA r3) {
        C343367q6 r1 = r3.A02;
        if (r1 == null || r1.A00 != null || r1.A01 != 1 || r3.A0I.contains(1)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(AnonymousClass8GA r7) {
        C343367q6 r0 = r7.A02;
        boolean z = true;
        if (r0 == null || r0.A01 != 1) {
            z = false;
        }
        if (!z) {
            C357638Yz r5 = r7.A0F;
            if (r5.A0V(C358088aL.A0B, C358088aL.A0M, C358088aL.A0T, C358088aL.A0z) || (0qQ.A0K(r5.A08.A00, AnonymousClass9QA.A00) && r5.A03)) {
                return true;
            }
        }
        return false;
    }

    public final Integer A05() {
        C343367q6 r1;
        C342717p3 r12;
        if (!this.A08 || (r1 = this.A02) == null || (r12 = r1.A03) == null) {
            return null;
        }
        return (Integer) r12.A02(C342717p3.A0B);
    }

    public static final void A00(AnonymousClass8GA r7) {
        int A082;
        Resources resources;
        int i;
        if (A01(r7)) {
            if (A02(r7)) {
                A082 = 0;
                if (r7.A06) {
                    A082 = 1;
                }
            } else {
                C340297l2 r0 = r7.A03;
                if (r0 == null) {
                    0qQ.A0F("cameraController");
                    throw AnonymousClass00P.createAndThrow();
                }
                A082 = r0.A08();
            }
            boolean A0A2 = r7.A0A();
            r7.A04.setEnabled(A0A2);
            View view = ((C3497981v) r7.A04).getView();
            if (view instanceof ImageView) {
                0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) view).setImageLevel(A082);
            } else {
                String A0R = 002.A0R(AnonymousClass000.A00(3963), view.getClass().getSimpleName());
                0qQ.A0B(A0R, 1);
                0kD.A04("CameraButtonImpl", A0R, 817903175, (Throwable) null);
            }
            r7.A01 = r7.A00;
            r7.A00 = A082;
            boolean z = r7.A07;
            C3498081w r1 = r7.A04;
            float f = 1.0f;
            if (z) {
                f = 0.5f;
            }
            r1.EOX(f);
            if (!A0A2) {
                resources = r7.A0J;
                i = 2131962515;
            } else if (A082 == -1 || A082 == 0) {
                resources = r7.A0J;
                i = 2131962517;
            } else {
                if (A082 != 1) {
                    if (A082 == 2) {
                        resources = r7.A0J;
                        i = 2131962514;
                    } else if (A082 != 3) {
                        return;
                    }
                }
                resources = r7.A0J;
                i = 2131962518;
            }
            String string = resources.getString(i);
            if (string != null) {
                ((C3497981v) r7.A04).getView().setContentDescription(string);
            }
        }
    }

    public final void A06() {
        if (A02(this) && this.A06) {
            1Eo.A05(this.A0K, new MG0(this, (AnonymousClass4D7) null, 8), this.A0L);
        }
    }

    public final void A07() {
        if (A02(this) && this.A06) {
            1Eo.A05(this.A0K, new MG0(this, (AnonymousClass4D7) null, 9), this.A0L);
        }
    }

    public final void A08(int i) {
        if (A01(this)) {
            C340297l2 r2 = this.A03;
            if (r2 == null) {
                0qQ.A0F("cameraController");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r2.A0K(new C346537vL(this, i), 0);
            }
        }
    }

    public final void A09(int i) {
        if (A01(this)) {
            C340297l2 r0 = this.A03;
            if (r0 != null) {
                if (i != r0.A08()) {
                    C340297l2 r1 = this.A03;
                    if (r1 != null) {
                        r1.A0K(this.A0C, i);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("cameraController");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A0A() {
        if (A04(this)) {
            return this.A0I.contains(3);
        }
        C357638Yz r4 = this.A0F;
        C3494680m r3 = r4.A08;
        if (0qQ.A0K(r3.A00, AnonymousClass80L.A00) || r4.A0V(C358088aL.A0C) || r4.A0V(C358088aL.A0D) || 0qQ.A0K(r3.A00, AnonymousClass80K.A00)) {
            return false;
        }
        if (this.A0I.contains(1) || A02(this)) {
            return true;
        }
        return false;
    }
}
