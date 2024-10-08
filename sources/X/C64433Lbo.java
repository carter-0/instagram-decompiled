package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;

/* renamed from: X.Lbo  reason: case insensitive filesystem */
public final class C64433Lbo implements C252203oj {
    public final int A00;
    public final Object A01;

    public C64433Lbo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00(2cs r3) {
        View view = (View) this.A01;
        view.setAlpha(JTO.A03(r3));
        view.invalidate();
    }

    public final void DmB(2cs r2) {
        if (3 - this.A00 == 0) {
            0qQ.A0B(r2, 0);
            A00(r2);
        }
    }

    public final void DmC(2cs r2) {
        if (3 - this.A00 == 0) {
            0qQ.A0B(r2, 0);
            A00(r2);
        }
    }

    public final void DmD(2cs r2) {
        if (3 - this.A00 == 0) {
            0qQ.A0B(r2, 0);
            A00(r2);
        }
    }

    public final void DmE(2cs r15) {
        ViewGroup viewGroup;
        String str;
        int A03;
        float f;
        float f2;
        switch (this.A00) {
            case 0:
                BottomSheetViewController bottomSheetViewController = (BottomSheetViewController) this.A01;
                if (bottomSheetViewController.A04 && (viewGroup = bottomSheetViewController.bottomSheetLayout) != null) {
                    double d = bottomSheetViewController.A02.A09.A00;
                    int i = 0;
                    if (d == 0.0d) {
                        i = 4;
                    }
                    viewGroup.setVisibility(i);
                    ViewGroup viewGroup2 = bottomSheetViewController.A07;
                    float A02 = (float) AnonymousClass37Q.A02(d, (double) viewGroup2.getHeight());
                    C66506MUk mUk = bottomSheetViewController.A08;
                    int A05 = JTP.A05(bottomSheetViewController.A06.getResources());
                    int height = (int) ((((double) viewGroup2.getHeight()) * d) - ((double) A05));
                    if (AnonymousClass7TE.A1b(BottomSheetViewController.A01(bottomSheetViewController)) && height < (A03 = (int) ((AnonymousClass7TE.A03(viewGroup2) * ((C62562Khs) 00k.A0I(BottomSheetViewController.A01(bottomSheetViewController))).A00) - ((float) A05)))) {
                        height = A03;
                    }
                    ViewGroup viewGroup3 = bottomSheetViewController.bottomSheetContentView;
                    if (viewGroup3 != null) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(viewGroup3.getLayoutParams());
                        layoutParams.height = height;
                        viewGroup3.setLayoutParams(layoutParams);
                        ViewGroup viewGroup4 = bottomSheetViewController.bottomSheetLayout;
                        if (viewGroup4 != null) {
                            viewGroup4.setTranslationY(A02 + 1.0f);
                            if (d == 0.0d) {
                                mUk.Cyg();
                                return;
                            }
                            return;
                        }
                        str = "bottomSheetLayout";
                    } else {
                        str = "bottomSheetContentView";
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            case 1:
                0qQ.A0B(r15, 0);
                View view = (View) this.A01;
                0qQ.A0A(view);
                float A032 = JTO.A03(r15);
                view.setScaleX(A032);
                view.setScaleY(A032);
                return;
            case 2:
                if (r15 != null) {
                    f = JTO.A03(r15);
                } else {
                    f = 0.0f;
                }
                C64310LZk lZk = (C64310LZk) this.A01;
                View A002 = C64310LZk.A00(lZk);
                if (A002 != null) {
                    A002.setAlpha(1.25f * f);
                }
                View A003 = C64310LZk.A00(lZk);
                if (A003 != null) {
                    View A004 = C64310LZk.A00(lZk);
                    if (A004 != null) {
                        f2 = (1.0f - f) * ((float) (A004.getHeight() + (DbX.A07(lZk.A0A) * 2)));
                    } else {
                        f2 = 0.0f;
                    }
                    A003.setTranslationY(f2);
                }
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                View view2 = (View) lZk.A05.A03(lZk, C64310LZk.A0E[0]);
                if (i2 == 0) {
                    AnonymousClass7TH.A0R(view2);
                    return;
                } else if (view2 != null) {
                    view2.setVisibility(0);
                    return;
                } else {
                    return;
                }
            case 3:
                0qQ.A0B(r15, 0);
                A00(r15);
                return;
            default:
                return;
        }
    }
}
