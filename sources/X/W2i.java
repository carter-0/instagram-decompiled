package X;

import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.List;

public final class W2i {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public IgFrameLayout A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final ViewStub A08;
    public final CameraAREffect A09;
    public final 1Ng A0A;
    public final 1wn A0B = new C19221WQb(this, 5);
    public final Runnable A0C = new C19980Wir(this);
    public final Runnable A0D = new C19981Wis(this);
    public final List A0E = new ArrayList();
    public final ViewStub A0F;

    public W2i(View view, CameraAREffect cameraAREffect, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A07 = view;
        this.A09 = cameraAREffect;
        this.A0A = AnonymousClass1Nd.A00(userSession);
        this.A0F = JTR.A0X(view, R.id.ar_effect_instruction_text_stub);
        this.A08 = JTR.A0X(view, R.id.ar_effect_instruction_image_stub);
        this.A06 = (int) view.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public static final void A04(W2i w2i, boolean z) {
        w2i.A05 = true;
        w2i.A07.removeCallbacks(w2i.A0C);
        if (z) {
            ImageView imageView = w2i.A02;
            if (imageView != null) {
                C294975nL A002 = C294975nL.A00(imageView);
                0qQ.A07(A002);
                A002.A0I(0.0f);
                A002.A05 = new C19671WdZ(w2i, 2);
                A002.A0H();
                return;
            }
        } else {
            ImageView imageView2 = w2i.A02;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                return;
            }
        }
        0qQ.A0F("instructionImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        X.C294975nL.A01(r0, 0).A0G();
        r4.A08.setVisibility(0);
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0.setVisibility(0);
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r0.setBackgroundColor(0);
        r0 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r2 = X.C294975nL.A00(r0);
        X.0qQ.A07(r2);
        r2.A0M(0.0f, 0.5f);
        r2.A05 = new X.C19671WdZ(r4, 1);
        r2.A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        X.0qQ.A0F("instructionImageView");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.W2i r4) {
        /*
            java.util.List r3 = r4.A0E
            monitor-enter(r3)
            boolean r0 = r4.A05     // Catch:{ all -> 0x006b }
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r4.A01 = r2     // Catch:{ all -> 0x006b }
            monitor-exit(r3)
            return
        L_0x000c:
            android.widget.ImageView r1 = r4.A02     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "instructionImageView"
            X.0qQ.A0F(r0)     // Catch:{ all -> 0x006b }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x001a:
            int r0 = r4.A01     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x006b }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x006b }
            r1.setImageBitmap(r0)     // Catch:{ all -> 0x006b }
            monitor-exit(r3)
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L_0x0061
            X.5nL r0 = X.C294975nL.A01(r0, r2)
            r0.A0G()
            android.view.ViewStub r0 = r4.A08
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L_0x0061
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L_0x0061
            r0.setBackgroundColor(r2)
            android.widget.ImageView r0 = r4.A02
            if (r0 == 0) goto L_0x0061
            X.5nL r2 = X.C294975nL.A00(r0)
            X.0qQ.A07(r2)
            r1 = 0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A0M(r1, r0)
            r1 = 1
            X.WdZ r0 = new X.WdZ
            r0.<init>(r4, r1)
            r2.A05 = r0
            r2.A0H()
            return
        L_0x0061:
            java.lang.String r0 = "instructionImageView"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2i.A00(X.W2i):void");
    }

    public static final void A01(W2i w2i) {
        w2i.A07.removeCallbacks(w2i.A0D);
        TextView textView = w2i.A03;
        if (textView == null) {
            0qQ.A0F("instructionTextView");
            throw AnonymousClass00P.createAndThrow();
        }
        C294975nL A002 = C294975nL.A00(textView);
        A002.A06 = new C19673Wdb(w2i, 0);
        A002.A0I(0.0f);
        A002.A05 = new C19671WdZ(w2i, 3);
        A002.A0H();
    }

    public static final void A02(W2i w2i) {
        if (w2i.A03 == null) {
            View inflate = w2i.A0F.inflate();
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            w2i.A03 = textView;
            if (textView == null) {
                0qQ.A0F("instructionTextView");
                throw AnonymousClass00P.createAndThrow();
            }
            w2i.A00 = Color.alpha(textView.getShadowColor());
            int paddingLeft = textView.getPaddingLeft();
            int i = w2i.A06;
            textView.setPadding(paddingLeft + i, textView.getPaddingTop(), textView.getPaddingRight() + i, textView.getPaddingBottom());
        }
    }

    public static final void A03(W2i w2i, String str) {
        A02(w2i);
        TextView textView = w2i.A03;
        if (textView != null) {
            textView.setText(str);
            TextView textView2 = w2i.A03;
            if (textView2 != null) {
                textView2.setVisibility(0);
                TextView textView3 = w2i.A03;
                if (textView3 != null) {
                    C294975nL.A01(textView3, 0).A0G();
                    TextView textView4 = w2i.A03;
                    if (textView4 != null) {
                        C294975nL A012 = C294975nL.A01(textView4, 0);
                        A012.A06 = new C19673Wdb(w2i, 0);
                        A012.A0M(0.0f, 1.0f);
                        A012.A0H();
                        return;
                    }
                }
            }
        }
        0qQ.A0F("instructionTextView");
        throw AnonymousClass00P.createAndThrow();
    }
}
