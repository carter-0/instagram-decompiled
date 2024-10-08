package X;

import android.content.Context;
import android.graphics.PointF;
import android.text.Layout;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.tagging.model.Tag;

/* renamed from: X.KaC  reason: case insensitive filesystem */
public final class C62105KaC extends C60046JeE {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public final Context A04;
    public final UserSession A05;
    public final 1Xj A06;
    public final boolean A07;
    public final boolean A08;
    public final 1Ng A09;
    public final Integer A0A;

    public void setText(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        super.setText(charSequence);
        TextView textView = this.A03;
        if (textView == null) {
            0qQ.A0F("bubbleText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setContentDescription(AnonymousClass7TF.A0e(getResources(), charSequence, 2131954409));
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62105KaC(Context context, PointF pointF, UserSession userSession, 1Xj r18, Integer num, boolean z, boolean z2) {
        super(context);
        String str;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(context, userSession2);
        this.A04 = context;
        this.A05 = userSession2;
        1Xj r9 = r18;
        this.A06 = r9;
        this.A07 = z;
        this.A0A = num;
        this.A08 = z2;
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36318642887137627L);
        Context context2 = this.A04;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        C64178LSg.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A08));
        ? tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        if (this.A07) {
            tightTextView.setTextAppearance(R.style.igds_emphasized_body_2);
        }
        C64178LSg.A02(tightTextView);
        Context context3 = tightTextView.getContext();
        tightTextView.setMinimumWidth(AnonymousClass7TG.A06(context3));
        tightTextView.setMaxWidth(context3.getResources().getDimensionPixelSize(R.dimen.ad_tag_max_width));
        ImageView imageView = new ImageView(context2);
        this.A02 = imageView;
        C64178LSg.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A01 = imageView2;
        C64178LSg.A01(imageView2, false);
        FrameLayout.LayoutParams A0Y = JTR.A0Y();
        ViewGroup viewGroup = this.A00;
        if (viewGroup == null) {
            str = "bubble";
        } else {
            TextView textView = this.A03;
            if (textView != null) {
                viewGroup.addView(textView, A0Y);
                this.A09 = AnonymousClass1Nd.A00(userSession2);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    addView(viewGroup2, layoutParams);
                    ImageView imageView3 = this.A02;
                    if (imageView3 != null) {
                        addView(imageView3, layoutParams);
                        ImageView imageView4 = this.A01;
                        str = "downArrow";
                        if (imageView4 != null) {
                            addView(imageView4, layoutParams);
                            ViewGroup viewGroup3 = this.A00;
                            if (viewGroup3 != null) {
                                TextView textView2 = this.A03;
                                if (textView2 != null) {
                                    ImageView imageView5 = this.A02;
                                    if (imageView5 != null) {
                                        ImageView imageView6 = this.A01;
                                        if (imageView6 != null) {
                                            this.A02 = new LPG(pointF, viewGroup3, imageView5, imageView6, textView2, userSession2, r9, this, 0, 0, A062);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("upArrow");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("bubble");
                throw AnonymousClass00P.createAndThrow();
            }
            str = "bubbleText";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public CharSequence getText() {
        TextView textView = this.A03;
        if (textView == null) {
            0qQ.A0F("bubbleText");
            throw AnonymousClass00P.createAndThrow();
        }
        CharSequence text = textView.getText();
        0qQ.A07(text);
        return text;
    }

    public 0rN getTextLayoutParams() {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextView textView = this.A03;
        if (textView != null) {
            return C60046JeE.A00(alignment, textView);
        }
        0qQ.A0F("bubbleText");
        throw AnonymousClass00P.createAndThrow();
    }

    public int getTextLineHeight() {
        TextView textView = this.A03;
        if (textView != null) {
            return textView.getLineHeight();
        }
        0qQ.A0F("bubbleText");
        throw AnonymousClass00P.createAndThrow();
    }

    public String getTaggedId() {
        Object tag = getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.tagging.model.Tag<*>");
        String id = ((Tag) tag).getId();
        0qQ.A07(id);
        return id;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        if (r9.getY() > X.AnonymousClass7TE.A03(r8)) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1023533095(0x3d01e027, float:0.03170791)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r4 = 1
            if (r9 == 0) goto L_0x00a0
            int r0 = r9.getAction()
            if (r0 != r4) goto L_0x00a0
            X.3W1 r6 = r8.A01
            if (r6 == 0) goto L_0x00a0
            int r1 = r8.A00
            r0 = -1
            X.47M r0 = r6.A07(r1, r0)
            r0.A04 = r4
            java.lang.Integer r0 = r8.A0A
            r6.A1A = r0
            X.GQ0 r3 = r6.A0k
            if (r3 == 0) goto L_0x005f
            android.content.Context r7 = r8.A04
            float r0 = r9.getX()
            float r2 = X.0nA.A01(r7, r0)
            float r0 = r9.getY()
            float r1 = X.0nA.A01(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.A01 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A02 = r0
            float r0 = X.AnonymousClass7TE.A02(r8)
            float r2 = X.0nA.A01(r7, r0)
            float r0 = X.AnonymousClass7TE.A03(r8)
            float r1 = X.0nA.A01(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            r3.A03 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r3.A00 = r0
        L_0x005f:
            X.1Xj r1 = r8.getMedia()
            if (r1 == 0) goto L_0x00a0
            com.instagram.common.session.UserSession r0 = r8.A05
            X.1Xj r3 = r1.A1e(r0)
            X.1Ng r2 = r8.A09
            float r0 = r9.getX()
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            float r1 = r9.getX()
            float r0 = X.AnonymousClass7TE.A02(r8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0097
            float r0 = r9.getY()
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            float r1 = r9.getY()
            float r0 = X.AnonymousClass7TE.A03(r8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            X.3Km r0 = new X.3Km
            r0.<init>(r8, r3, r6, r1)
            r2.A00(r0)
        L_0x00a0:
            r0 = -377434389(0xffffffffe980ceeb, float:-1.9464956E25)
            X.AnonymousClass0fD.A0C(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62105KaC.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
