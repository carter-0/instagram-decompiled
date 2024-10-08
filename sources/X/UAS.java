package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Map;

public final class UAS extends 2Rw implements Adapter {
    public C19191WOx A00;
    public C15692Ugx A01;
    public final C17332VRl A02;
    public final Context A03;
    public final C15697Uh3 A04;
    public final AnonymousClass0iw A05;
    public final Map A06 = new HashMap();

    public final VXp A00(C21051XBs xBs) {
        0qQ.A0B(xBs, 0);
        Map map = this.A06;
        String id = xBs.getId();
        Object obj = map.get(id);
        if (obj == null) {
            obj = new VXp();
            map.put(id, obj);
        }
        return (VXp) obj;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(view, 1);
        return view;
    }

    public final int getViewTypeCount() {
        return 0;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        C16606Uy2 uy2 = (C16606Uy2) C51968G9o.A10(C16606Uy2.A02, i);
        if (uy2 == null) {
            uy2 = C16606Uy2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        switch (uy2.ordinal()) {
            case 1:
                return new C14849UCd(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_text_block, false));
            case 2:
                return new UD5(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_media_block, false));
            case 3:
                return new UD6(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_media_block, false));
            case 6:
                return new UD4(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_button_block, false));
            case 7:
                return new C14877UDf(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_slideshow_block, false));
            case 8:
                return new C14834UBn(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_swipe_to_open_block, false));
            case 9:
                return new C14848UCc(DbT.A0D(JTP.A0G(viewGroup), viewGroup, R.layout.canvas_composite_block, false));
            default:
                throw new UnsupportedOperationException("Unsupported Canvas view type");
        }
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public final int getCount() {
        return this.A02.A00.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.A00.get(i);
    }

    public final boolean isEmpty() {
        return AnonymousClass7TF.A1Q(this.A02.A00.size());
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0236  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r22, int r23) {
        /*
            r21 = this;
            r4 = r22
            r5 = 0
            X.0qQ.A0B(r4, r5)
            r1 = r21
            X.VRl r0 = r1.A02
            java.util.List r0 = r0.A00
            r2 = r23
            java.lang.Object r3 = r0.get(r2)
            X.XBs r3 = (X.C21051XBs) r3
            X.Uy2 r2 = r3.CAU()
            X.Uy2 r0 = X.C16606Uy2.PHOTO
            if (r2 != r0) goto L_0x0034
            android.content.Context r5 = r1.A03
            X.UD5 r4 = (X.UD5) r4
            r7 = r3
            X.Ucj r7 = (X.C15433Ucj) r7
            r10 = 0
            X.Uh3 r6 = r1.A04
            X.0iw r0 = r1.A05
            java.lang.String r11 = r3.getId()
            if (r11 == 0) goto L_0x03b4
            r9 = r0
            r8 = r4
            X.C16913VAq.A00(r5, r6, r7, r8, r9, r10, r11)
        L_0x0033:
            return
        L_0x0034:
            X.Uy2 r0 = X.C16606Uy2.SLIDESHOW
            if (r2 != r0) goto L_0x0124
            X.UDf r4 = (X.C14877UDf) r4
            r6 = r3
            X.Ucl r6 = (X.C15435Ucl) r6
            X.VXp r7 = r1.A00(r3)
            X.Uh3 r8 = r1.A04
            X.0iw r9 = r1.A05
            X.AnonymousClass7TF.A1H(r4, r6)
            r3 = 2
            X.0qQ.A0B(r7, r3)
            X.VXp r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x007b
            X.VXp r10 = r4.A00
            if (r10 == 0) goto L_0x007b
            java.lang.ref.WeakReference r0 = r10.A02
            r1 = 0
            if (r0 == 0) goto L_0x007b
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L_0x007b
            r10.A02 = r1
            X.0eM r0 = r10.A03
            java.lang.Object r2 = r0.getValue()
            X.W4L r2 = (X.W4L) r2
            java.lang.ref.WeakReference r0 = r10.A02
            r2.A00 = r0
            android.animation.ValueAnimator r1 = r2.A03
            android.animation.Animator$AnimatorListener r0 = r2.A02
            r1.addListener(r0)
            r2.onAnimationUpdate(r1)
        L_0x007b:
            r4.A00 = r7
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r4.A03
            r1.A0F()
            int r0 = r7.A00
            r1.A0K(r0)
            X.U4A r0 = new X.U4A
            r0.<init>(r8, r6, r9)
            r1.setAdapter((android.widget.Adapter) r0)
            r1.A0M(r3, r5)
            r3 = 0
            r1.setPageSpacing(r3)
            r1.setOverScrollOnEdgeItems(r5)
            X.Uje r0 = new X.Uje
            r0.<init>(r5, r7, r4)
            r1.A0P(r0)
            com.instagram.ui.widget.pageindicator.CirclePageIndicator r2 = r4.A04
            int r1 = r7.A00
            X.VRl r0 = r6.A00
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            r2.A01(r1, r0)
            int r0 = r7.A00
            r2.setCurrentPage(r0)
            int r0 = r2.A06
            int r1 = r0 + 1
            int r0 = r2.A05
            if (r1 == r0) goto L_0x010e
            android.widget.ImageView r1 = r4.A02
            r1.setVisibility(r5)
            r1.setTranslationX(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r7.A02 = r0
            X.0eM r3 = r7.A03
            java.lang.Object r2 = r3.getValue()
            X.W4L r2 = (X.W4L) r2
            java.lang.ref.WeakReference r0 = r7.A02
            r2.A00 = r0
            android.animation.ValueAnimator r1 = r2.A03
            android.animation.Animator$AnimatorListener r0 = r2.A02
            r1.addListener(r0)
            r2.onAnimationUpdate(r1)
            java.lang.ref.WeakReference r0 = r7.A02
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r2 = r3.getValue()
            X.W4L r2 = (X.W4L) r2
            r2.A00 = r0
            android.animation.ValueAnimator r1 = r2.A03
            android.animation.Animator$AnimatorListener r0 = r2.A02
            r1.addListener(r0)
            r2.onAnimationUpdate(r1)
        L_0x00fd:
            java.lang.Object r0 = r3.getValue()
            X.W4L r0 = (X.W4L) r0
            android.animation.ValueAnimator r1 = r0.A03
            boolean r0 = r1.isRunning()
            if (r0 != 0) goto L_0x010e
            r1.start()
        L_0x010e:
            X.VXq r2 = r6.C25()
            if (r2 == 0) goto L_0x03b9
            android.view.View r1 = r4.A01
        L_0x0116:
            X.VuF r0 = r2.A01
            X.C18179Vmt.A01(r1, r0)
            int r0 = r2.A00
            X.0qQ.A0B(r1, r5)
            r1.setBackgroundColor(r0)
            return
        L_0x0124:
            X.Uy2 r0 = X.C16606Uy2.BUTTON
            if (r2 != r0) goto L_0x01a9
            android.content.Context r7 = r1.A03
            X.UD4 r4 = (X.UD4) r4
            X.XBr r3 = (X.C21050XBr) r3
            X.Uh3 r2 = r1.A04
            X.AnonymousClass7TG.A1O(r4, r3)
            com.instagram.canvas.view.widget.RichTextView r1 = r4.A02
            X.X1F r0 = r3.BoP()
            r1.setText(r0)
            X.X1G r0 = r3.C55()
            java.lang.String r8 = "Required value was null."
            if (r0 == 0) goto L_0x03c4
            r1.setTextDescriptor(r0)
            java.util.List r1 = r3.AYc()
            if (r1 == 0) goto L_0x01a2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a2
            android.widget.FrameLayout r6 = r4.A01
            r0 = 13
            X.WB4.A00(r6, r3, r1, r2, r0)
        L_0x015a:
            X.VXq r2 = r3.C25()
            if (r2 == 0) goto L_0x03be
            X.Uca r2 = (X.C15424Uca) r2
            android.view.View r1 = r4.A00
            X.VuF r0 = r2.A01
            X.C18179Vmt.A01(r1, r0)
            int r0 = r2.A00
            X.0qQ.A0B(r1, r5)
            r1.setBackgroundColor(r0)
            java.util.List r4 = r2.A03
            int r3 = r2.A00
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            int r0 = X.AnonymousClass7TG.A04(r7)
            float r0 = (float) r0
            r2.setCornerRadius(r0)
            r1 = 1
            X.XR5 r0 = X.XR5.BUTTON_OUTLINE
            boolean r0 = r4.contains(r0)
            if (r0 != r1) goto L_0x019e
            int r0 = X.JTR.A08(r7)
            r2.setStroke(r0, r3)
            r2.setColor(r5)
        L_0x0195:
            android.graphics.RectF r0 = X.0nA.A01
            X.0qQ.A0B(r6, r5)
            r6.setBackground(r2)
            return
        L_0x019e:
            r2.setColor(r3)
            goto L_0x0195
        L_0x01a2:
            android.widget.FrameLayout r6 = r4.A01
            r0 = 0
            r6.setOnClickListener(r0)
            goto L_0x015a
        L_0x01a9:
            X.Uy2 r0 = X.C16606Uy2.RICH_TEXT
            if (r2 != r0) goto L_0x01b5
            X.UCd r4 = (X.C14849UCd) r4
            X.Ucn r3 = (X.C15437Ucn) r3
            X.C16915VAs.A00(r3, r4, r5)
            return
        L_0x01b5:
            X.Uy2 r0 = X.C16606Uy2.VIDEO
            if (r2 != r0) goto L_0x0291
            X.UD6 r4 = (X.UD6) r4
            r7 = r3
            X.Ucm r7 = (X.C15436Ucm) r7
            X.VXp r14 = r1.A00(r3)
            X.Ugx r11 = r1.A01
            if (r11 == 0) goto L_0x03d4
            X.Uh3 r3 = r1.A04
            boolean r12 = X.C51973G9u.A1b(r4, r7, r14)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r6 = r4.A02
            com.instagram.model.mediasize.ImageInfo r13 = r7.A00
            float r0 = X.1iI.A00(r13)
            r6.A00 = r0
            com.instagram.feed.widget.IgProgressImageView r10 = r4.A01
            X.2s5 r0 = X.C17139VJo.A00
            r10.setPostProcessor(r0)
            X.3gz r0 = new X.3gz
            r0.<init>()
            r10.setProgressiveImageConfig(r0)
            r10.setEnableProgressBar(r12)
            r2 = 2131435564(0x7f0b202c, float:1.8492974E38)
            X.WXH r0 = new X.WXH
            r0.<init>(r3, r12)
            r10.A0A(r0, r2)
            java.lang.String r2 = r7.getId()
            android.view.View r8 = r4.A00
            android.content.Context r9 = r8.getContext()
            if (r2 == 0) goto L_0x0284
            boolean r0 = X.AnonymousClass4WY.A04(r2)
            if (r0 == 0) goto L_0x0284
            X.0qQ.A0A(r9)
            X.0qQ.A0B(r9, r5)
            java.io.File r0 = X.AnonymousClass4WY.A00(r9)
            if (r0 == 0) goto L_0x0284
            java.lang.String r3 = r0.getCanonicalPath()
            int r0 = r2.hashCode()
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            X.0qQ.A07(r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r3, r0)
            int r0 = r14.A01
            if (r0 == 0) goto L_0x0284
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A01(r2)
            r10.A09(r11, r0, r12)
        L_0x0230:
            X.VXq r2 = r7.C25()
            if (r2 == 0) goto L_0x03cf
            X.VuF r0 = r2.A01
            X.C18179Vmt.A01(r8, r0)
            int r0 = r2.A00
            r8.setBackgroundColor(r0)
            X.Ugx r0 = r1.A01
            if (r0 == 0) goto L_0x03d4
            X.Uu4 r2 = r0.A06
            X.4M3 r0 = r2.A02
            if (r0 == 0) goto L_0x0250
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
            if (r1 != 0) goto L_0x0252
        L_0x0250:
            X.3OB r1 = X.AnonymousClass3OB.IDLE
        L_0x0252:
            X.3OB r0 = X.AnonymousClass3OB.PLAYING
            if (r1 == r0) goto L_0x025e
            X.3OB r0 = X.AnonymousClass3OB.PREPARING
            if (r1 == r0) goto L_0x025e
            X.3OB r0 = X.AnonymousClass3OB.PREPARED
            if (r1 != r0) goto L_0x0033
        L_0x025e:
            X.Utz r0 = r2.A01
            if (r0 == 0) goto L_0x0282
            X.UD6 r0 = r0.A01
        L_0x0264:
            boolean r1 = r4.equals(r0)
            X.Utz r0 = r2.A01
            if (r0 == 0) goto L_0x0280
            X.Ucm r0 = r0.A00
        L_0x026e:
            boolean r0 = r7.equals(r0)
            if (r1 == 0) goto L_0x039a
            if (r0 != 0) goto L_0x0033
            java.lang.String r1 = "media_mismatch"
            X.4M3 r0 = r2.A02
            if (r0 == 0) goto L_0x0033
            r0.EyP(r1, r5)
            return
        L_0x0280:
            r0 = 0
            goto L_0x026e
        L_0x0282:
            r0 = 0
            goto L_0x0264
        L_0x0284:
            X.0qQ.A0A(r9)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A01(r9, r13)
            if (r0 == 0) goto L_0x0230
            r10.setUrl(r0, r11)
            goto L_0x0230
        L_0x0291:
            X.Uy2 r0 = X.C16606Uy2.SWIPE_TO_OPEN
            if (r2 != r0) goto L_0x02b4
            X.UBn r4 = (X.C14834UBn) r4
            r5 = r3
            X.WOx r5 = (X.C19191WOx) r5
            X.VXp r3 = r1.A00(r3)
            X.Uh3 r2 = r1.A04
            X.AnonymousClass7TF.A1H(r4, r5)
            android.view.View r1 = r4.A00
            r0 = 14
            X.WB4.A00(r1, r5, r2, r3, r0)
            X.VXq r0 = r5.A01
            if (r0 == 0) goto L_0x0033
            int r0 = r0.A00
            r1.setBackgroundColor(r0)
            return
        L_0x02b4:
            X.Uy2 r0 = X.C16606Uy2.INSTAGRAM_PRODUCT
            if (r2 != r0) goto L_0x03de
            android.content.Context r14 = r1.A03
            X.UCc r4 = (X.C14848UCc) r4
            X.Uck r3 = (X.C15434Uck) r3
            X.Uh3 r10 = r1.A04
            X.0iw r13 = r1.A05
            r12 = 1
            r11 = 2
            X.0qQ.A0B(r4, r12)
            X.0qQ.A0B(r3, r11)
            java.util.List r9 = r4.A00
            if (r9 != 0) goto L_0x02f0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r4.A00 = r9
            X.VRl r0 = r3.A00
            java.util.List r6 = r0.A00
            int r2 = r6.size()
            r1 = 0
        L_0x02de:
            if (r1 >= r2) goto L_0x02f0
            java.lang.Object r0 = r6.get(r1)
            X.XBs r0 = (X.C21051XBs) r0
            X.Uy2 r0 = r0.CAU()
            X.C16914VAr.A00(r0, r4, r1)
            int r1 = r1 + 1
            goto L_0x02de
        L_0x02f0:
            X.VRl r0 = r3.A00
            java.util.List r8 = r0.A00
            int r7 = r8.size()
            r6 = 0
        L_0x02f9:
            r2 = 1
            if (r6 >= r7) goto L_0x0377
            java.lang.Object r15 = r8.get(r6)
            X.XBs r15 = (X.C21051XBs) r15
            X.Uy2 r0 = r15.CAU()
            int r0 = r0.ordinal()
            if (r0 == r11) goto L_0x0339
            if (r0 != r12) goto L_0x0336
            int r0 = r9.size()
            if (r6 >= r0) goto L_0x031c
            java.lang.Object r0 = r9.get(r6)
            boolean r0 = r0 instanceof X.C14849UCd
            if (r0 != 0) goto L_0x0323
        L_0x031c:
            X.Uy2 r0 = r15.CAU()
            X.C16914VAr.A00(r0, r4, r6)
        L_0x0323:
            java.lang.Object r1 = r9.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.canvas.viewbinder.CanvasTextViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.UCd r1 = (X.C14849UCd) r1
            X.Ucn r15 = (X.C15437Ucn) r15
            if (r6 == r12) goto L_0x0333
            r2 = 0
        L_0x0333:
            X.C16915VAs.A00(r15, r1, r2)
        L_0x0336:
            int r6 = r6 + 1
            goto L_0x02f9
        L_0x0339:
            int r0 = r9.size()
            if (r6 >= r0) goto L_0x0347
            java.lang.Object r0 = r9.get(r6)
            boolean r0 = r0 instanceof X.UD5
            if (r0 != 0) goto L_0x034e
        L_0x0347:
            X.Uy2 r0 = r15.CAU()
            X.C16914VAr.A00(r0, r4, r6)
        L_0x034e:
            java.lang.Object r2 = r9.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.canvas.viewbinder.CanvasImageViewBinder.Holder"
            X.0qQ.A0C(r2, r0)
            X.UD5 r2 = (X.UD5) r2
            r1 = r15
            X.Ucj r1 = (X.C15433Ucj) r1
            com.instagram.user.model.Product r0 = r3.A01
            java.lang.String r20 = r15.getId()
            java.lang.String r16 = ""
            X.0eM r15 = X.0mp.A09
            if (r20 != 0) goto L_0x036a
            r20 = r16
        L_0x036a:
            r16 = r1
            r17 = r2
            r18 = r13
            r19 = r0
            r15 = r10
            X.C16913VAq.A00(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0336
        L_0x0377:
            java.util.List r0 = r3.A02
            if (r0 == 0) goto L_0x0393
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0393
            android.view.ViewGroup r1 = r4.A01
            r0 = 69
            X.WBH.A01(r1, r0, r3, r10)
        L_0x0388:
            X.VXq r2 = r3.C25()
            if (r2 != 0) goto L_0x0116
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0393:
            android.view.ViewGroup r1 = r4.A01
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x0388
        L_0x039a:
            if (r0 == 0) goto L_0x0033
            X.Utz r1 = r2.A01
            if (r1 == 0) goto L_0x0033
            X.UD6 r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 != 0) goto L_0x0033
            r1.A01 = r4
            X.4M3 r0 = r2.A02
            if (r0 == 0) goto L_0x03ca
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.AnonymousClass4M1.A09(r6, r0, r5, r5)
            return
        L_0x03b4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x03b9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x03c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x03ca:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03d4:
            java.lang.String r0 = "canvasVideoModule"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03de:
            java.lang.String r0 = "Unsupported Canvas view type"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAS.onBindViewHolder(X.3kE, int):void");
    }

    public UAS(Context context, C15697Uh3 uh3, C17332VRl vRl, AnonymousClass0iw r5) {
        this.A02 = vRl;
        this.A04 = uh3;
        this.A03 = context;
        this.A05 = r5;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(192008025);
        int size = this.A02.A00.size();
        AnonymousClass0fD.A0A(-449786682, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1748680069);
        int i2 = ((C21051XBs) this.A02.A00.get(i)).CAU().A00;
        AnonymousClass0fD.A0A(1169158449, A032);
        return i2;
    }
}
