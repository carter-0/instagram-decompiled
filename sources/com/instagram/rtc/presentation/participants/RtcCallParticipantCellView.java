package com.instagram.rtc.presentation.participants;

import X.0qQ;
import X.0sL;
import X.0sP;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51968G9o;
import X.C62320sa;
import X.C67679MsF;
import X.C71396Ojv;
import X.C71413OkC;
import X.C71743Oq3;
import X.C73867Pl4;
import X.C73894PlV;
import X.C74180PqM;
import X.C74362Ptc;
import X.DbX;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RtcCallParticipantCellView extends ConstraintLayout {
    public TextView A00;
    public ImageUrl A01;
    public Integer A02;
    public C62320sa A03;
    public 0sL A04;
    public Drawable A05;
    public 0sP A06;
    public final View.OnLayoutChangeListener A07;
    public final View A08;
    public final View A09;
    public final FrameLayout A0A;
    public final IgTextView A0B;
    public final CircularImageView A0C;
    public final IgImageView A0D;
    public final IgdsMediaButton A0E;
    public final C71743Oq3 A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;
    public final AnonymousClass0eM A0M;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        0sP r1 = this.A06;
        if (r1 != null) {
            C51968G9o.A1O(r1, AnonymousClass7TF.A1Q(i));
        }
    }

    public final void setFrameRenderListener(C62320sa r2) {
        0qQ.A0B(r2, 0);
        C71743Oq3 oq3 = this.A0F;
        oq3.A03 = r2;
        C67679MsF msF = oq3.A01;
        if (msF != null) {
            msF.A03 = r2;
        }
    }

    public final void setOnVisibilityChangedListener(0sP r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
    }

    public final void setScreenShareStopClickListener$fbandroid_java_com_instagram_rtc_presentation_participants_participants(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void setVideoSizeChangeListener(C74362Ptc ptc) {
        0qQ.A0B(ptc, 0);
        C71743Oq3 oq3 = this.A0F;
        oq3.A02 = ptc;
        C67679MsF msF = oq3.A01;
        if (msF != null) {
            msF.setVideoSizeChangeListener(ptc);
        }
    }

    private final Drawable getGrayGradientDrawable() {
        return JTO.A0D(this.A0G);
    }

    private final Drawable getMuteIndicatorBadgeDrawable() {
        return JTO.A0D(this.A0H);
    }

    private final int getMuteIndicatorBadgeSize() {
        return DbX.A07(this.A0I);
    }

    private final int getMuteIndicatorCompactSize() {
        return DbX.A07(this.A0J);
    }

    private final Drawable getMuteIndicatorDrawable() {
        return JTO.A0D(this.A0K);
    }

    private final int getMuteIndicatorMargin() {
        return DbX.A07(this.A0L);
    }

    private final int getMuteIndicatorSize() {
        return DbX.A07(this.A0M);
    }

    /* access modifiers changed from: private */
    public final void setBackgroundBitmap(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(getResources(), BlurUtil.blur(bitmap, 0.1f, 3));
        } else {
            bitmapDrawable = null;
        }
        this.A05 = bitmapDrawable;
        Integer num = this.A02;
        if (num == AnonymousClass05K.A00) {
            A01(this, false, true);
        } else if (num == AnonymousClass05K.A01) {
            A01(this, true, true);
        }
    }

    public final C62320sa getScreenShareStopClickListener$fbandroid_java_com_instagram_rtc_presentation_participants_participants() {
        return this.A03;
    }

    public final void setAutoAdjustScalingType(boolean z) {
        C71743Oq3 oq3 = this.A0F;
        if (oq3.A06 != z) {
            oq3.A06 = z;
            C67679MsF msF = oq3.A01;
            if (msF != null) {
                msF.setAutoAdjustScalingType(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.rtc.presentation.participants.RtcCallParticipantCellView r4, boolean r5, boolean r6) {
        /*
            java.lang.Integer r2 = X.C51967G9n.A0l(r5)
            r3 = 0
            if (r6 != 0) goto L_0x001a
            java.lang.Integer r0 = r4.A02
            if (r2 != r0) goto L_0x001a
            android.graphics.drawable.Drawable r0 = r4.A05
            if (r0 == 0) goto L_0x0016
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            r0 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == r5) goto L_0x001a
        L_0x0019:
            return
        L_0x001a:
            r4.A02 = r2
            android.graphics.drawable.Drawable r0 = r4.A05
            r4.setBackground(r0)
            android.graphics.drawable.Drawable r2 = r4.getBackground()
            if (r2 == 0) goto L_0x0019
            if (r5 == 0) goto L_0x003a
            android.content.Context r1 = r4.getContext()
            r0 = 2130970245(0x7f040685, float:1.7549195E38)
            int r1 = X.AnonymousClass7TF.A03(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A08
            android.graphics.ColorFilter r3 = X.C9162RRn.A00(r0, r1)
        L_0x003a:
            r2.setColorFilter(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.rtc.presentation.participants.RtcCallParticipantCellView.A01(com.instagram.rtc.presentation.participants.RtcCallParticipantCellView, boolean, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = AnonymousClass05K.A0N;
        this.A03 = C73867Pl4.A00;
        this.A0M = C73894PlV.A00(context, 7);
        this.A0J = C73894PlV.A00(context, 4);
        this.A0I = C73894PlV.A00(context, 3);
        this.A0L = C73894PlV.A00(context, 6);
        this.A0K = C73894PlV.A00(context, 5);
        this.A0H = C73894PlV.A00(context, 2);
        this.A0G = C73894PlV.A00(context, 1);
        this.A07 = new C71413OkC(this, 3);
        View.inflate(context, R.layout.layout_call_participant_item, this);
        this.A0C = (CircularImageView) findViewById(R.id.call_participant_avatar);
        IgImageView A0Y = JTO.A0Y(this, R.id.call_participant_mute_indicator);
        this.A0D = A0Y;
        A0Y.setImageAlpha(80);
        this.A09 = findViewById(R.id.call_video_loading_spinner);
        this.A08 = findViewById(R.id.cell_outline_view);
        this.A0B = JTO.A0X(this, R.id.call_participant_text);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) findViewById(R.id.call_participant_screen_share_button);
        this.A0E = igdsMediaButton;
        igdsMediaButton.setOnClickListener(new C71396Ojv(this, 46));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.call_participant_renderer_container);
        this.A0A = frameLayout;
        C71743Oq3 oq3 = new C71743Oq3(context);
        this.A0F = oq3;
        View A0c = AnonymousClass7TE.A0c(oq3.A0A);
        frameLayout.addView(A0c, -1, -1);
        oq3.A04 = new C74180PqM(A0c, 24);
        C67679MsF msF = oq3.A01;
        if (msF != null) {
            msF.setMirror(false);
        }
    }

    public /* synthetic */ RtcCallParticipantCellView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantCellView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
