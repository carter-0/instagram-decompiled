package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;

/* renamed from: X.KaB  reason: case insensitive filesystem */
public final class C62104KaB extends C60046JeE {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public final Context A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final boolean A07;
    public final 1Ng A08;

    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62104KaB(Context context, PointF pointF, UserSession userSession, 1Xj r14, boolean z) {
        super(context);
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        1Xj r9 = r14;
        this.A06 = r14;
        this.A07 = z;
        this.A08 = AnonymousClass1Nd.A00(userSession);
        Context context2 = this.A04;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        C64178LSg.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A07));
        this.A03 = new TightTextView(context2);
        ImageView imageView = new ImageView(context2);
        this.A02 = imageView;
        C64178LSg.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A01 = imageView2;
        C64178LSg.A01(imageView2, false);
        TextView textView = this.A03;
        String str = "bubbleText";
        if (textView != null) {
            C64178LSg.A02(textView);
            FrameLayout.LayoutParams A0Y = JTR.A0Y();
            ViewGroup viewGroup = this.A00;
            if (viewGroup == null) {
                str = "bubble";
            } else {
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    viewGroup.addView(textView2, A0Y);
                    ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        addView(viewGroup2, layoutParams);
                        ImageView imageView3 = this.A02;
                        if (imageView3 != null) {
                            addView(imageView3, layoutParams);
                            ImageView imageView4 = this.A01;
                            String str2 = "downArrow";
                            if (imageView4 != null) {
                                addView(imageView4, layoutParams);
                                ViewGroup viewGroup3 = this.A00;
                                if (viewGroup3 != null) {
                                    TextView textView3 = this.A03;
                                    if (textView3 == null) {
                                        str2 = str;
                                    } else {
                                        ImageView imageView5 = this.A02;
                                        if (imageView5 != null) {
                                            ImageView imageView6 = this.A01;
                                            if (imageView6 != null) {
                                                this.A02 = new LPG(pointF, viewGroup3, imageView5, imageView6, textView3, userSession2, r9, this, 0, 0, false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            0qQ.A0F(str2);
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("upArrow");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("bubble");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public String getTaggedId() {
        return "";
    }

    public 0rN getTextLayoutParams() {
        return null;
    }

    public int getTextLineHeight() {
        return 0;
    }

    public CharSequence getText() {
        return "";
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        1Xj media;
        int A052 = AnonymousClass0fD.A05(-23517504);
        if (!(motionEvent == null || motionEvent.getAction() != 1 || this.A01 == null || (media = getMedia()) == null)) {
            this.A08.A00(new C240353Ko(media.A1e(this.A05)));
        }
        AnonymousClass0fD.A0C(-378115834, A052);
        return true;
    }
}
