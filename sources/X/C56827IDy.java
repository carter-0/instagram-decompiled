package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.common.callercontext.CallerContext;
import com.facebookpay.widget.listcell.ListCell;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.text.ExpandableTextView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.IDy  reason: case insensitive filesystem */
public final class C56827IDy implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C56827IDy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    public final void onGlobalLayout() {
        String str;
        int i;
        int i2;
        int i3;
        View A0X;
        int A0I;
        int i4;
        ConstraintLayout constraintLayout;
        switch (this.A00) {
            case 0:
                TextView textView = (TextView) this.A03;
                C51967G9n.A0y(textView, this);
                ListCell listCell = (ListCell) this.A01;
                int lineCount = textView.getLineCount();
                Number number = (Number) this.A02;
                if (number != null) {
                    i4 = number.intValue();
                } else {
                    i4 = R.id.image;
                }
                View view = listCell.A01;
                if (view == null) {
                    str = "containerView";
                    break;
                } else if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                    C270354gb r4 = new C270354gb();
                    r4.A0I(constraintLayout);
                    if (lineCount <= 1 && listCell.getSecondaryText() == null && listCell.getTertiaryText() == null && listCell.getQuaternaryText() == null && listCell.getTertiaryLinkableText() == null && listCell.getQuaternaryLinkableText() == null && listCell.getSecondarySpannableText() == null && listCell.getTertiarySpannableText() == null) {
                        r4.A0D(R.id.primary_text, 3, R.id.image, 4);
                        r4.A0D(R.id.primary_text, 4, R.id.image, 3);
                        C320056rh r0 = (C320056rh) C51968G9o.A0z(r4.A00, R.id.primary_text);
                        if (r0 != null) {
                            r0.A03.A05 = 0.5f;
                        }
                    } else {
                        r4.A0C(R.id.primary_text, 3, i4, 3);
                    }
                    r4.A0G(constraintLayout);
                    return;
                } else {
                    return;
                }
            case 1:
                View view2 = (View) this.A03;
                ((AtomicBoolean) this.A01).set(AnonymousClass7TF.A1R((((double) (view2.getRootView().getHeight() - view2.getHeight())) > (((double) view2.getRootView().getHeight()) * 0.15d) ? 1 : (((double) (view2.getRootView().getHeight() - view2.getHeight())) == (((double) view2.getRootView().getHeight()) * 0.15d) ? 0 : -1))));
                ((S27) this.A02).A00();
                return;
            case 2:
                C52758GcB gcB = (C52758GcB) this.A03;
                ViewTreeObserver viewTreeObserver = gcB.A03.getViewTreeObserver();
                0qQ.A07(viewTreeObserver);
                0nA.A0w(this, viewTreeObserver);
                C227762js r8 = (C227762js) this.A02;
                C59609JQd jQd = gcB.A04;
                List AZO = jQd.AZO();
                C252553pI r9 = gcB.A02;
                int A012 = C240113Jq.A01(r9);
                int A022 = C240113Jq.A02(r9);
                int size = AZO.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        int A0I2 = C51971G9r.A0I(AZO, i5);
                        if (A0I2 > A022) {
                            i2 = i5 - 1;
                        } else if (A012 > A0I2 || A0I2 > A022) {
                            i5++;
                        } else {
                            gcB.A00 = i5;
                            int A013 = C240113Jq.A01(r9);
                            if (A0I2 >= A013 && (i3 = A0I2 - A013) <= r9.A0T() && (A0X = r9.A0X(i3)) != null && ((float) C2808154f.A00(A0X, r9)) > r8.A00 - r8.A01) {
                                gcB.A00 = i5 - 1;
                            }
                            i2 = gcB.A00;
                        }
                    }
                }
                if (jQd.AZO().isEmpty()) {
                    A0I = 0;
                } else {
                    A0I = C51971G9r.A0I(jQd.AZO(), 0);
                }
                gcB.A00 = Math.max(i2, Math.max(0, A0I - 1));
                C52761GcE.A00((C52761GcE) this.A01);
                return;
            case 3:
                View view3 = ((C68048MzF) this.A02).A01;
                C51967G9n.A0y(view3, this);
                ? r5 = (ExpandableTextView) this.A01;
                int width = view3.getWidth();
                ViewGroup.LayoutParams layoutParams = r5.getLayoutParams();
                int i6 = 0;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = r5.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    i6 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                }
                r5.setText(r5.A00(((N3A) this.A03).A03, AnonymousClass7TF.A0d(DbU.A05(r5), 2131972827), width - (i + i6)));
                return;
            case 4:
                CallerContext callerContext = C59719JVd.A01;
                LEH leh = (LEH) this.A01;
                LinearLayout linearLayout = leh.A01;
                if (linearLayout != null) {
                    if (linearLayout.isShown()) {
                        Rect A0W = AnonymousClass7TE.A0W();
                        linearLayout.getGlobalVisibleRect(A0W);
                        if (A0W.intersect(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels))) {
                            C252063oV r02 = leh.A07;
                            if (r02 == null) {
                                str = "shareButtonGroup";
                                break;
                            } else {
                                if (r02.CFV() != 0 && leh.A00().getVisibility() != 0) {
                                    C252063oV r03 = leh.A05;
                                    if (r03 == null) {
                                        str = "autoShareButtons";
                                        break;
                                    } else if (r03.CFV() == 0) {
                                        AnonymousClass819 r2 = AnonymousClass819.ROWSHARE_AUTO_SETTING_STORY;
                                        LSZ.A02(C368278sM.VIEW, r2, (UserSession) this.A03, (C63768L6a) this.A02, (String) null);
                                    }
                                } else {
                                    C63768L6a l6a = (C63768L6a) this.A02;
                                    boolean A032 = LSZ.A03(l6a);
                                    UserSession userSession = (UserSession) this.A03;
                                    if (!A032) {
                                        LSZ.A02(C368278sM.VIEW, AnonymousClass819.ROWSHARE_SINGLE_STORY, userSession, l6a, (String) null);
                                    } else {
                                        AnonymousClass818 r6 = AnonymousClass818.IG_STORY_VIEWERS_DASHBOARD;
                                        JZY jzy = JZY.UNAVAILABLE;
                                        JZZ jzz = JZZ.STORY;
                                        0bb r22 = new 0bb();
                                        r22.A06("media_id", C51969G9p.A0u(l6a.A02.A0b));
                                        r22.A06("unavailable_reason", C273654mx.A00(58));
                                        JZX.A00(jzy, jzz, r6, r22, userSession);
                                    }
                                }
                                LinearLayout linearLayout2 = leh.A01;
                                if (linearLayout2 != null) {
                                    ViewTreeObserver viewTreeObserver2 = linearLayout2.getViewTreeObserver();
                                    if (viewTreeObserver2.isAlive()) {
                                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                str = "container";
                break;
            default:
                C53155GjR gjR = (C53155GjR) this.A01;
                RoundedCornerLinearLayout roundedCornerLinearLayout = gjR.A0I;
                C51967G9n.A0y(roundedCornerLinearLayout, this);
                I5V.A00 = roundedCornerLinearLayout.getWidth();
                IgFrameLayout igFrameLayout = gjR.A05;
                ViewGroup.LayoutParams layoutParams3 = igFrameLayout.getLayoutParams();
                int i7 = I5V.A00;
                layoutParams3.width = i7;
                layoutParams3.height = i7;
                igFrameLayout.setLayoutParams(layoutParams3);
                int i8 = I5V.A00;
                0eP A002 = I5V.A00((UserSession) this.A03, (1Xj) this.A02, gjR, i8, i8);
                int A0B = C51970G9q.A0B(A002);
                int A0A = C51969G9p.A0A(A002);
                C51972G9s.A0x(gjR.A0E, A0B, A0A);
                C51972G9s.A0x(gjR.A0H, A0B, A0A);
                return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
