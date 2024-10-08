package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.tagging.model.Tag;

/* renamed from: X.KaE  reason: case insensitive filesystem */
public final class C62107KaE extends C60046JeE {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public UserSession A04;
    public 1Xj A05;
    public C66471MSz A06;
    public boolean A07;
    public final Resources A08 = getResources();
    public final 1Ng A09;

    public 0rN getTextLayoutParams() {
        return null;
    }

    public CharSequence getText() {
        return this.A03.getText();
    }

    public int getTextLineHeight() {
        return this.A03.getLineHeight();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView, android.view.View] */
    public C62107KaE(Context context, PointF pointF, UserSession userSession, 1Xj r12, boolean z) {
        super(context);
        this.A09 = AnonymousClass1Nd.A00(userSession);
        this.A04 = userSession;
        this.A05 = r12;
        this.A07 = z;
        Context context2 = getContext();
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        C64178LSg.A00(frameLayout, this.A04, this.A05, Boolean.valueOf(this.A07));
        ? tightTextView = new TightTextView(context2);
        this.A03 = tightTextView;
        tightTextView.setMinimumWidth(this.A08.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
        C64178LSg.A02(this.A03);
        ImageView imageView = new ImageView(context2);
        this.A02 = imageView;
        C64178LSg.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A01 = imageView2;
        C64178LSg.A01(imageView2, false);
        this.A00.addView(this.A03, JTR.A0Y());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        addView(this.A00, layoutParams);
        addView(this.A02, layoutParams);
        addView(this.A01, layoutParams);
        ViewGroup viewGroup = this.A00;
        TextView textView = this.A03;
        PointF pointF2 = pointF;
        this.A02 = new LPG(pointF2, viewGroup, this.A02, this.A01, textView, this.A04, this.A05, this, 0, 0, false);
    }

    private String getTagName() {
        return ((Tag) DbT.A0o(this)).A04();
    }

    public String getTaggedId() {
        return ((Tag) DbT.A0o(this)).getId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if (((com.instagram.model.people.PeopleTag) getTag()).A02 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = -1049135035(0xffffffffc1777845, float:-15.466863)
            int r7 = X.AnonymousClass0fD.A05(r0)
            int r0 = r9.getAction()
            r6 = 1
            if (r0 != r6) goto L_0x004d
            X.3W1 r2 = r8.A01
            if (r2 == 0) goto L_0x001b
            int r1 = r8.A00
            r0 = -1
            X.47M r0 = r2.A07(r1, r0)
            r0.A04 = r6
        L_0x001b:
            X.1Xj r5 = r8.getMedia()
            if (r5 == 0) goto L_0x004d
            X.1Ng r4 = r8.A09
            java.lang.String r3 = r8.getTaggedId()
            r8.getTagName()
            java.lang.Object r0 = r8.getTag()
            boolean r0 = r0 instanceof com.instagram.model.people.PeopleTag
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r8.getTag()
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            boolean r0 = r0.A02
            r2 = 1
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            r0 = 38
            X.KAf r1 = new X.KAf
            r1.<init>(r8, r0)
            X.3Kb r0 = new X.3Kb
            r0.<init>(r1, r5, r3, r2)
            r4.A00(r0)
        L_0x004d:
            r0 = 1081925419(0x407cdf2b, float:3.951121)
            X.AnonymousClass0fD.A0C(r0, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62107KaE.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
        this.A03.setContentDescription(AnonymousClass7TF.A0e(getResources(), charSequence, 2131974973));
    }

    public void setListener(C66471MSz mSz) {
        this.A06 = mSz;
    }
}
