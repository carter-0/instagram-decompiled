package X;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LnK  reason: case insensitive filesystem */
public final class C65097LnK implements C66544MVy {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ KMT A01;

    public final void DP9(Integer num, int i, int i2) {
        0qQ.A0B(num, 2);
        KMT kmt = this.A01;
        C60434JlR jlR = kmt.A0C;
        jlR.A07 = false;
        jlR.A09 = false;
        C61806KMu kMu = kmt.A0J;
        kMu.A0F();
        AnonymousClass8RH A0E = kmt.A0H.A0E();
        if (A0E instanceof AnonymousClass8Rc) {
            int A002 = (((AnonymousClass8Rc) A0E).A00() - 2) / 2;
            int intValue = num.intValue();
            if (intValue == 1) {
                int i3 = kmt.A01;
                LTY lty = kMu.A01;
                lty.A0Q(i3, A002, false);
                kMu.A0I(i3);
                int i4 = kmt.A01;
                Integer[] numArr = kmt.A0B.A02;
                kMu.A0Y(i4, JTO.A0A(numArr, 0), JTO.A0A(numArr, 1), false, true);
                lty.A0F();
                27r A012 = 27p.A01(kmt.A0A);
                if (A012.A0J() != null) {
                    27r.A0C(A012, "TIMELINE_TIMED_ELEMENT_HORIZONTAL_DRAG");
                }
            } else if (intValue != 2) {
                if (kmt.A03) {
                    jlR.A07 = true;
                    jlR.A09 = true;
                    kmt.A03 = false;
                } else if (kmt.A0K) {
                    int i5 = kmt.A01;
                    kMu.A01.A0S(i5, false);
                    kMu.A0T(i5);
                    kMu.A0P();
                } else {
                    int i6 = kmt.A01;
                    kMu.A01.A0Q(i6, A002, false);
                    kMu.A0I(i6);
                    kMu.A0Q();
                }
            }
        }
        kmt.A0I.A0W(0sn.A00);
    }

    public final void DPB(MotionEvent motionEvent) {
        LBF lbf;
        View A1D;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams2;
        KMT kmt = this.A01;
        kmt.A0C.A07 = false;
        AnonymousClass8RH A0E = kmt.A0H.A0E();
        if (A0E instanceof AnonymousClass8Rc) {
            lbf = kmt.A0F;
            A00(kmt, lbf);
            A1D = kmt.A0D.A1D(((AnonymousClass8Rc) A0E).A00());
        } else if (kmt.A0K && (A0E instanceof C355728Rd)) {
            lbf = kmt.A0F;
            A00(kmt, lbf);
            A1D = kmt.A0D.A1D(1);
        } else {
            return;
        }
        if (A1D != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            ClipData newPlainText = ClipData.newPlainText("original_row", String.valueOf(kmt.A01));
            0qQ.A0A(newPlainText);
            0qQ.A0B(newPlainText, 3);
            lbf.A01 = A1D;
            int[] iArr = new int[2];
            A1D.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            lbf.A04.getLocationInWindow(iArr2);
            View view = lbf.A06;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = A1D.getWidth();
                    marginLayoutParams.height = A1D.getHeight();
                }
            } else {
                marginLayoutParams = null;
            }
            if (view != null) {
                view.setLayoutParams(marginLayoutParams);
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(iArr[0] - iArr2[0]);
                marginLayoutParams.topMargin = iArr[1] - iArr2[1];
            }
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = lbf.A03;
            if (view2 != null) {
                layoutParams2 = view2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams2.width = A1D.getWidth();
                marginLayoutParams2.height = A1D.getHeight();
                marginLayoutParams2.setMarginStart(iArr[0] - iArr2[0]);
                marginLayoutParams2.topMargin = iArr[1] - iArr2[1];
            }
            if (view2 != null) {
                view2.setLayoutParams(marginLayoutParams2);
            }
            C60039Jds jds = new C60039Jds(A1D, view, lbf, x, y);
            if (view != null) {
                view.startDragAndDrop(newPlainText, jds, A1D, 512);
            }
        }
    }

    public final /* synthetic */ void DlW(int i, int i2) {
    }

    public final /* synthetic */ void DlX() {
    }

    public final /* synthetic */ void DlY(int i, int i2, float f) {
    }

    public final void DuC(Integer num, int i, int i2) {
        0qQ.A0B(num, 2);
        KMT kmt = this.A01;
        kmt.A0C.A0A = false;
        kmt.A00 = -1;
        C61806KMu kMu = kmt.A0J;
        kMu.A0F();
        int i3 = kmt.A01;
        Integer[] numArr = kmt.A0B.A02;
        kMu.A0Y(i3, JTO.A0A(numArr, 0), JTO.A0A(numArr, 1), false, AnonymousClass7TF.A1W(num, AnonymousClass05K.A00));
        C62529KhL khL = C62529KhL.TEXT;
        C62529KhL khL2 = khL;
        C61194Jyn A0F = kMu.A01.A0F();
        String str = "TEXT";
        if (A0F != null) {
            27r A012 = 27p.A01(kmt.A0A);
            C62529KhL khL3 = A0F.A09;
            String str2 = "STICKER";
            if (khL3 == khL) {
                str2 = str;
            }
            A012.A1m(str2);
            khL = khL3;
        }
        kmt.A0I.A0W(0sn.A00);
        C379469Ua A002 = AnonymousClass9T6.A00(kmt.A0A);
        if (khL != khL2) {
            str = "STICKER";
        }
        C61015JvF.A00(A002, str, "TRIM");
    }

    public final void DuE(Integer num, float f, int i, int i2) {
        Integer num2 = num;
        0qQ.A0B(num, 2);
        KMT kmt = this.A01;
        LTY lty = kmt.A0J.A01;
        if (JTR.A0E(lty) == kmt.A01) {
            kmt.A00 = (JTS.A03(lty) * 2) + 2;
        }
        kmt.A0B.A03(num2, MMB.A00(kmt, 38), C66291MMa.A00(num, kmt, 11), f, i, i2, true);
    }

    public C65097LnK(RecyclerView recyclerView, KMT kmt) {
        this.A00 = recyclerView;
        this.A01 = kmt;
    }

    public static void A00(KMT kmt, LBF lbf) {
        LinearLayout linearLayout = kmt.A08;
        ArrayList A1M = 0sr.A1M(new LinearLayout[]{linearLayout});
        List list = lbf.A0B;
        list.clear();
        list.addAll(A1M);
        ArrayList A1M2 = 0sr.A1M(new LinearLayout[]{linearLayout});
        List list2 = lbf.A0A;
        list2.clear();
        list2.addAll(A1M2);
    }

    public final void DP3(int i) {
        KMT.A02(this.A01, i);
    }

    public final void DP4(MotionEvent motionEvent, int i) {
        KMT.A02(this.A01, i);
    }

    public final void DPA(int i, int i2, float f) {
        KMT kmt = this.A01;
        if (kmt.A0H.A0E() instanceof AnonymousClass8Rc) {
            kmt.A0B.A05(MKK.A00, MMB.A00(kmt, 37), f, i, i2);
        }
    }

    public final void Dqh(MotionEvent motionEvent) {
        KMT kmt = this.A01;
        if (!(kmt.A0H.A0E() instanceof AnonymousClass8RY) && !kmt.A0C.A09) {
            kmt.A0J.A0R();
        }
    }

    public final void DsS(MotionEvent motionEvent, boolean z, boolean z2) {
        KMT kmt = this.A01;
        if (!(kmt.A0H.A0E() instanceof AnonymousClass8RY) && kmt.A0J.A0L()) {
            kmt.A03 = true;
        }
    }

    public final void DuG(Integer num) {
        C359548d5 r0;
        KMT kmt = this.A01;
        C61806KMu kMu = kmt.A0J;
        LTY lty = kMu.A01;
        C61194Jyn A0F = lty.A0F();
        if (A0F != null) {
            C62529KhL khL = A0F.A09;
            C62529KhL khL2 = C62529KhL.TEXT;
            C3501583m r1 = kMu.A07;
            if (khL == khL2) {
                r0 = C359548d5.STICKER_TEXT_TRIM;
            } else {
                r0 = C359548d5.STICKER_TRIM;
            }
            r1.A01(r0);
        }
        kMu.A0E.Epw(C62478KgT.Trimming);
        kmt.A0C.A0A = true;
        if (JTR.A0E(lty) == kmt.A01) {
            kmt.A00 = (JTS.A03(lty) * 2) + 2;
        }
        KMT.A01(kmt);
    }

    public final void EKX(int i) {
        int i2 = -i;
        this.A00.scrollBy(i2, 0);
        KMT kmt = this.A01;
        kmt.A0I.A0S(kmt.A0E, i2, kmt.A08());
    }

    public final void Cx4(int i) {
        EKX(i);
    }
}
