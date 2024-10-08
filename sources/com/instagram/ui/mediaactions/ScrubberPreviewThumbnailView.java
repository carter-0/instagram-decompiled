package com.instagram.ui.mediaactions;

import X.02m;
import X.0qQ;
import X.1G0;
import X.2Bq;
import X.2Bs;
import X.AnonymousClass000;
import X.AnonymousClass3WR;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51965G9l;
import X.C56520Hzr;
import X.C57406IaC;
import X.C59580JPa;
import X.C71382cm;
import X.DTV;
import X.DbU;
import X.DbV;
import X.GCC;
import X.JMG;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.videothumbnail.ThumbView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ScrubberPreviewThumbnailView extends FrameLayout implements C59580JPa {
    public View A00;
    public ViewGroup A01;
    public TextView A02;
    public JMG A03;
    public ThumbView A04;

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r4 >= 0) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            com.instagram.ui.videothumbnail.ThumbView r0 = r0.A04
            if (r0 == 0) goto L_0x00d3
            X.Hzr r10 = r0.A04
            if (r10 == 0) goto L_0x00d3
            X.3WR r2 = r10.A01
            X.3uM r11 = r2.A0A
            r13 = r19
            r14 = r20
            if (r11 == 0) goto L_0x00b9
            java.util.List r9 = r11.A05
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00b9
            long r16 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x003a
            X.02m r3 = X.C51965G9l.A0l()
            java.lang.String r1 = r2.A0G
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = r1.hashCode()
            r1 = 1900591(0x1d002f, float:2.663295E-39)
            java.lang.String r0 = "thumbnail_requested"
            r3.markerPoint(r1, r2, r0)
        L_0x003a:
            float r2 = (float) r13
            float r1 = r11.A00
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            float r2 = r2 / r1
            int r15 = (int) r2
            int r0 = r11.A01
            int r7 = r15 / r0
            if (r7 < 0) goto L_0x00b5
            java.util.List r8 = r11.A05
            int r0 = X.C51966G9m.A06(r8)
            if (r7 > r0) goto L_0x00b5
            r6 = 2
            int r5 = r7 + 1
            r4 = r7
        L_0x0054:
            int r0 = r7 - r4
            if (r0 < r6) goto L_0x0064
        L_0x0058:
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x0091
            int r0 = r5 - r7
            if (r0 >= r6) goto L_0x0091
            if (r4 < 0) goto L_0x0076
        L_0x0064:
            java.lang.Object r3 = r8.get(r4)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.1NK r2 = X.1NK.A00()
            java.lang.String r1 = "VideoThumbnailController"
            r0 = 0
            r2.A0O(r0, r3, r1)
            int r4 = r4 + -1
        L_0x0076:
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x008e
            java.lang.Object r3 = r8.get(r5)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.1NK r2 = X.1NK.A00()
            java.lang.String r1 = "VideoThumbnailController"
            r0 = 0
            r2.A0O(r0, r3, r1)
            int r5 = r5 + 1
        L_0x008e:
            if (r4 < 0) goto L_0x0058
            goto L_0x0054
        L_0x0091:
            r0 = -1
            if (r15 == r0) goto L_0x00b5
            r1 = 1
            boolean[] r12 = new boolean[r1]
            r0 = 0
            r12[r0] = r1
            X.1NK r2 = X.1NK.A00()
            java.lang.Object r1 = r9.get(r7)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r0 = 0
            X.1OO r0 = r2.A0J(r1, r0)
            X.INO r9 = new X.INO
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.A02(r9)
            r0.A01()
            return
        L_0x00b5:
            X.C56520Hzr.A00(r10, r13, r14)
            return
        L_0x00b9:
            X.C56520Hzr.A00(r10, r13, r14)
            if (r11 == 0) goto L_0x00d3
            java.util.List r0 = r11.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r1 = "Thumbnail info missing sprite URL. videoId: "
            java.lang.String r0 = r2.A0G
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "VideoThumbnailController"
            X.0wb.A03(r0, r1)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView.A00(int, int):void");
    }

    public final void A01(AnonymousClass3WR r8) {
        ThumbView thumbView = this.A04;
        if (thumbView != null) {
            C56520Hzr hzr = thumbView.A04;
            if (hzr != null) {
                if (!hzr.A01.A0G.equals(r8.A0G)) {
                    ThumbView.A00(thumbView);
                    thumbView.A04 = null;
                    thumbView.A02 = null;
                    thumbView.A03 = null;
                    thumbView.A05 = false;
                    thumbView.invalidate();
                }
                hzr.A03.add(thumbView);
                02m A0l = C51965G9l.A0l();
                String str = r8.A0G;
                0qQ.A0B(str, 0);
                2Bs r4 = 2Bq.A0D;
                int hashCode = str.hashCode();
                A0l.markerStart(1900591, hashCode);
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put(AnonymousClass000.A00(4194), str);
                r4.A03(1900591, hashCode, A1E);
                thumbView.setScrubberThumbnailCallback(this);
            }
            hzr = new C56520Hzr(r8);
            thumbView.A04 = hzr;
            hzr.A03.add(thumbView);
            02m A0l2 = C51965G9l.A0l();
            String str2 = r8.A0G;
            0qQ.A0B(str2, 0);
            2Bs r42 = 2Bq.A0D;
            int hashCode2 = str2.hashCode();
            A0l2.markerStart(1900591, hashCode2);
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.put(AnonymousClass000.A00(4194), str2);
            r42.A03(1900591, hashCode2, A1E2);
            thumbView.setScrubberThumbnailCallback(this);
        }
    }

    public final void DrO(int i, int i2) {
        this.A01.setVisibility(8);
    }

    public final void EvP(Bitmap bitmap, Rect rect, double d, int i, int i2) {
        int i3;
        ThumbView thumbView = this.A04;
        ViewGroup.LayoutParams layoutParams = thumbView.getLayoutParams();
        layoutParams.height = (int) Math.round(((double) layoutParams.width) / d);
        int measuredWidth = getMeasuredWidth();
        int i4 = layoutParams.width / 2;
        int i5 = i;
        int i6 = (int) (((double) measuredWidth) * ((((double) i5) * 1.0d) / ((double) i2)));
        if (i6 < i4) {
            i3 = 0;
        } else {
            i3 = i6 - i4;
            if (i6 >= measuredWidth - i4) {
                i3 = measuredWidth - (i4 * 2);
            }
        }
        this.A00.setLayoutParams(layoutParams);
        ViewGroup viewGroup = this.A01;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getLayoutParams());
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = i3;
        viewGroup.setLayoutParams(layoutParams2);
        this.A02.setText(1G0.A02((long) i5));
        viewGroup.setVisibility(0);
        C56520Hzr hzr = thumbView.A04;
        if (hzr != null && !thumbView.A05) {
            02m A0l = C51965G9l.A0l();
            String str = hzr.A01.A0G;
            if (str != null) {
                A0l.markerPoint(1900591, str.hashCode(), "thumbnail_drawn");
                thumbView.A05 = true;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        JMG jmg = this.A03;
        if (jmg != null) {
            int measuredHeight = viewGroup.getMeasuredHeight();
            GCC gcc = ((C57406IaC) jmg).A00;
            IgTextView igTextView = gcc.A04;
            if (igTextView != null) {
                List list = gcc.A07;
                String str2 = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        DTV dtv = (DTV) it.next();
                        Integer Byu = dtv.Byu();
                        if (Byu != null) {
                            int intValue = Byu.intValue();
                            Integer B1k = dtv.B1k();
                            if (B1k != null) {
                                int intValue2 = B1k.intValue();
                                String BDY = dtv.BDY();
                                if (BDY != null && intValue <= i5 && i5 <= intValue2) {
                                    str2 = BDY;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                igTextView.setText(str2);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388691;
                layoutParams3.leftMargin = i3;
                layoutParams3.bottomMargin = measuredHeight + AnonymousClass7TG.A02(igTextView.getContext());
                igTextView.setLayoutParams(layoutParams3);
            }
        }
    }

    public void setScrubberThumbnailPositionListener(JMG jmg) {
        this.A03 = jmg;
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = null;
        int i2 = R.layout.scrubber_preview_thumbnail_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A25, 0, 0);
            try {
                i2 = obtainStyledAttributes.getBoolean(0, false) ? R.layout.scrubber_preview_timestamp_within_thumbnail_view : i2;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View inflate = DbV.A0D(this).inflate(i2, this);
        this.A01 = DbU.A0C(inflate, R.id.preview_container);
        this.A04 = (ThumbView) inflate.requireViewById(R.id.preview_thumbnail);
        this.A00 = inflate.requireViewById(R.id.preview_thumbnail_border);
        this.A02 = DbU.A0G(inflate, R.id.scrubber_timer_text);
        this.A04.A00 = 30;
    }

    public ScrubberPreviewThumbnailView(Context context) {
        this(context, (AttributeSet) null);
    }
}
