package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6ky  reason: invalid class name and case insensitive filesystem */
public abstract class C316016ky extends C249703kE implements C316026kz {
    public final boolean AGL() {
        C14297TtX ttX;
        if (!(this instanceof C316006kx) || (ttX = ((C316006kx) this).A1Z.A02) == null) {
            return false;
        }
        View view = ttX.A02;
        boolean z = false;
        if (view.getVisibility() == 0) {
            z = true;
        }
        view.setVisibility(8);
        ttX.A01 = true;
        return z;
    }

    public final View AoN() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A01;
        }
        return null;
    }

    public final View As7() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A07;
        }
        return null;
    }

    public final View B2R() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A03;
        }
        return null;
    }

    public final View B3a() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A08;
        }
        return null;
    }

    public RoundedCornerFrameLayout BQU() {
        if (this instanceof C309406Yd) {
            return ((C309406Yd) this).A0p;
        }
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1q;
        }
        if (this instanceof C305836Jt) {
            return ((C305836Jt) this).A0i;
        }
        if (!(this instanceof C305736Ji)) {
            return null;
        }
        Object value = ((C305736Ji) this).A0B.getValue();
        0qQ.A07(value);
        return (RoundedCornerFrameLayout) value;
    }

    public final C256003v4 BQw() {
        if (this instanceof C309406Yd) {
            return ((C309406Yd) this).A0H;
        }
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A0f;
        }
        return null;
    }

    public final View BhB() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1V;
        }
        if (this instanceof C305836Jt) {
            return ((C305836Jt) this).A0S;
        }
        return null;
    }

    public ViewGroup Bki() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1k;
        }
        if (this instanceof C309406Yd) {
            return ((C309406Yd) this).A0R;
        }
        if (this instanceof C305836Jt) {
            return ((C305836Jt) this).A0U;
        }
        if (this instanceof C305736Ji) {
            return ((C305736Ji) this).A04;
        }
        return null;
    }

    public final View C00() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A09;
        }
        return null;
    }

    public final View C18() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A06;
        }
        return null;
    }

    public final View C1D() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A1e.getView();
        }
        return null;
    }

    public final C67337MmD C1Q() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A0l;
        }
        return null;
    }

    public C252063oV C46() {
        if (this instanceof C309406Yd) {
            return ((C309406Yd) this).A0I;
        }
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A10;
        }
        if (this instanceof C305736Ji) {
            return (C252063oV) ((C305736Ji) this).A0L.getValue();
        }
        return null;
    }

    public View C8B() {
        if (this instanceof C309406Yd) {
            return ((C309406Yd) this).A06.A01;
        }
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A1M;
        }
        return null;
    }

    public final View C8C() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A0F;
        }
        return null;
    }

    public final View C8D() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A0y;
        }
        return null;
    }

    public final View CFK() {
        if (this instanceof C316006kx) {
            return ((C316006kx) this).A1e.A0S;
        }
        return null;
    }

    public void Cyz(boolean z) {
        IgProgressImageView igProgressImageView;
        if (this instanceof C305836Jt) {
            ((C305836Jt) this).A0d.Dxe(z);
            return;
        }
        if (this instanceof C316006kx) {
            igProgressImageView = ((C316006kx) this).BGP();
        } else if (this instanceof C309406Yd) {
            igProgressImageView = ((C309406Yd) this).A0K;
        } else if (this instanceof C305736Ji) {
            C305736Ji r2 = (C305736Ji) this;
            r2.A00().setVisibility(0);
            Object value = r2.A06.getValue();
            0qQ.A07(value);
            ((View) value).setVisibility(0);
            return;
        } else {
            return;
        }
        igProgressImageView.setVisibility(0);
    }

    public final void EI3() {
        if (this instanceof C316006kx) {
            C317086mh r1 = ((C316006kx) this).A1Z;
            C14297TtX ttX = r1.A02;
            if (ttX == null) {
                View A01 = r1.A01.A01();
                0qQ.A07(A01);
                ttX = new C14297TtX(A01);
                r1.A02 = ttX;
            }
            View view = ttX.A02;
            view.setVisibility(0);
            view.setAlpha(1.0f);
            ttX.A01 = false;
        }
    }

    public final void EqF(int i) {
        View view;
        boolean z;
        if (this instanceof C305836Jt) {
            C305836Jt r1 = (C305836Jt) this;
            if (i == 0) {
                JZS jzs = r1.A0e;
                if (jzs != null) {
                    jzs.A00().A06();
                    jzs.A00().setVisibility(0);
                }
            } else if (i == 8) {
                r1.A00();
            }
        } else {
            if (this instanceof C316006kx) {
                C316006kx r3 = (C316006kx) this;
                if (i == 0) {
                    C252063oV r4 = r3.A11;
                    r4.getView().setContentDescription(r3.A0S.getContext().getString(2131971757));
                    if (!r3.A0K) {
                        2eQ.A06(r4.getView(), 500);
                        r3.A0K = true;
                    }
                } else {
                    r3.A0K = false;
                    if (i == 8) {
                        if (!1NM.A00(r3.A0e).A01() || r3.A11.CVM()) {
                            r3.A11.getView().setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                view = r3.A11.getView();
            } else if (this instanceof C309406Yd) {
                C309406Yd r32 = (C309406Yd) this;
                if (i == 0) {
                    if (!r32.A0C) {
                        2eQ.A06(r32.A0X.A08, 500);
                        z = true;
                    }
                    view = r32.A0X.A08;
                } else {
                    z = false;
                }
                r32.A0C = z;
                view = r32.A0X.A08;
            } else if (this instanceof C305736Ji) {
                Object value = ((C305736Ji) this).A0Q.getValue();
                0qQ.A07(value);
                view = (View) value;
            } else {
                return;
            }
            view.setVisibility(i);
        }
    }

    public final void Ex1() {
        if (this instanceof C316006kx) {
            C317086mh r1 = ((C316006kx) this).A1Z;
            C14297TtX ttX = r1.A02;
            if (ttX == null) {
                View A01 = r1.A01.A01();
                0qQ.A07(A01);
                ttX = new C14297TtX(A01);
                r1.A02 = ttX;
            }
            if (ttX.A00 == null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                ttX.A00 = alphaAnimation;
                alphaAnimation.setStartOffset(300);
                AlphaAnimation alphaAnimation2 = ttX.A00;
                0qQ.A0A(alphaAnimation2);
                alphaAnimation2.setDuration(400);
                AlphaAnimation alphaAnimation3 = ttX.A00;
                0qQ.A0A(alphaAnimation3);
                alphaAnimation3.setAnimationListener(new C14298TtY(ttX));
            }
            ttX.A02.startAnimation(ttX.A00);
        }
    }

    public void onSurfaceTextureDestroyed() {
        View view;
        if (this instanceof C316006kx) {
            view = ((C316006kx) this).BGP();
        } else if (this instanceof C309406Yd) {
            view = ((C309406Yd) this).A0K;
        } else if (this instanceof C305836Jt) {
            view = ((C305836Jt) this).A0X;
        } else if (this instanceof C305736Ji) {
            Object value = ((C305736Ji) this).A07.getValue();
            0qQ.A07(value);
            view = (View) value;
        } else {
            return;
        }
        view.setVisibility(0);
    }
}
