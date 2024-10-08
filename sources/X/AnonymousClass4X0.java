package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4X0  reason: invalid class name */
public final class AnonymousClass4X0 {
    public View A00;
    public View A01;
    public C52798Gcp A02;
    public IgSimpleImageView A03;
    public C252063oV A04;
    public C252063oV A05;
    public C252063oV A06;
    public C252063oV A07;
    public AnonymousClass5Gv A08;
    public AnonymousClass3BQ A09;
    public C354808Nl A0A;
    public PromptStickerModel A0B;
    public boolean A0C;
    public final ValueAnimator A0D;
    public final ValueAnimator A0E;
    public final Context A0F;
    public final C252063oV A0G;
    public final Map A0H = new LinkedHashMap();
    public final Set A0I = new LinkedHashSet();

    public AnonymousClass4X0(Context context, C252063oV r9) {
        this.A0F = context;
        this.A0G = r9;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(300);
        duration.setInterpolator(new OvershootInterpolator(2.5f));
        duration.setStartDelay(250);
        this.A0D = duration;
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(500);
        duration2.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f));
        duration2.setStartDelay(500);
        this.A0E = duration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36324316538941417L) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36324316538875880L) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (X.182.A06(X.0Tu.A05, r11, 36324316538810343L) == false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.session.UserSession r11, X.AnonymousClass4X0 r12, X.C354808Nl r13, com.instagram.reels.prompt.model.PromptStickerModel r14) {
        /*
            r7 = r14
            boolean r0 = r14.A0M()
            r3 = 0
            if (r0 == 0) goto L_0x0016
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324316538875880(0x810cc600022fe8, double:3.0349822732431044E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            r9 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r9 = 0
        L_0x0017:
            boolean r0 = r14.A0M()
            if (r0 == 0) goto L_0x002b
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324316538810343(0x810cc600012fe7, double:3.0349822732016585E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            r10 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r10 = 0
        L_0x002c:
            boolean r0 = r14.A0M()
            if (r0 == 0) goto L_0x0040
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324316538941417(0x810cc600032fe9, double:3.03498227328455E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            r8 = 1
            if (r0 == 0) goto L_0x0041
        L_0x0040:
            r8 = 0
        L_0x0041:
            r5 = r12
            r6 = r13
            if (r9 != 0) goto L_0x0057
            if (r10 != 0) goto L_0x0057
            android.animation.ValueAnimator r0 = r12.A0D
            X.I7v r4 = new X.I7v
            r4.<init>(r12, r13, r14)
        L_0x004e:
            r0.addUpdateListener(r4)
            r0.start()
            r12.A0C = r3
            return
        L_0x0057:
            android.animation.ValueAnimator r0 = r12.A0E
            X.I80 r4 = new X.I80
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X0.A01(com.instagram.common.session.UserSession, X.4X0, X.8Nl, com.instagram.reels.prompt.model.PromptStickerModel):void");
    }

    public static final void A00(UserSession userSession, C255783ui r17, C249693kD r18, AnonymousClass4X0 r19, C354808Nl r20, PromptStickerModel promptStickerModel, boolean z) {
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        UserSession userSession2 = userSession;
        C255783ui r14 = r17;
        AnonymousClass4X0 r1 = r19;
        if (A02(userSession2, promptStickerModel2)) {
            ViewGroup A012 = C3019160o.A01(r1.A0G.getView());
            double dimensionPixelSize = 2.0d * ((double) r1.A0F.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material));
            double height = dimensionPixelSize / ((double) A012.getHeight());
            double width = dimensionPixelSize / ((double) A012.getWidth());
            r14.A00 = (float) (((double) r14.A00) + height);
            r14.A02 = (float) (((double) r14.A02) + width);
        }
        View A052 = r1.A05();
        ViewGroup A013 = C3019160o.A01(r1.A0G.getView());
        C306406Ma.A04(A052, r14, r18.AcY(userSession2), A013.getWidth(), A013.getHeight(), true);
        String str = "primaryCardView";
        if (A03(promptStickerModel2)) {
            C252063oV r2 = r1.A06;
            if (r2 != null) {
                View view = r2.getView();
                View view2 = r1.A00;
                if (view2 != null) {
                    view.setRotation(view2.getRotation() - 0.875f);
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "secondaryCardViewStubber";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (A04(promptStickerModel2)) {
            C252063oV r22 = r1.A07;
            if (r22 != null) {
                View view3 = r22.getView();
                View view4 = r1.A00;
                if (view4 != null) {
                    view3.setRotation(view4.getRotation() + 7.0f);
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            str = "tertiaryCardViewStubber";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        if (r1.A09 != AnonymousClass3BQ.CONTEXT_SHEET_PROMPT && promptStickerModel2.A00.B3f().size() > 1 && !r1.A0I.contains(promptStickerModel2)) {
            C354808Nl r5 = r20;
            if (!promptStickerModel2.A0M() || !182.A06(0Tu.A05, userSession2, 36324316538941417L)) {
                r5.EVv(1.0f);
            }
            if (A03(promptStickerModel2)) {
                C252063oV r23 = r1.A06;
                if (r23 != null) {
                    View view5 = r23.getView();
                    View view6 = r1.A00;
                    if (view6 != null) {
                        view5.setRotation(view6.getRotation());
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "secondaryCardViewStubber";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            if (A04(promptStickerModel2)) {
                C252063oV r24 = r1.A07;
                if (r24 != null) {
                    View view7 = r24.getView();
                    View view8 = r1.A00;
                    if (view8 != null) {
                        view7.setRotation(view8.getRotation());
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                str = "tertiaryCardViewStubber";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            if (A02(userSession2, promptStickerModel2)) {
                Context context = r1.A0F;
                C354808Nl r25 = r1.A0A;
                if (r25 == null) {
                    str = "sticker";
                } else {
                    r1.A02 = new C52798Gcp(context, AnonymousClass05K.A01, AnonymousClass05K.A00, (((float) ((Drawable) r25).getIntrinsicHeight()) + (((float) context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right)) * 2.0f)) / 2.0f, (float) context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), true, false, true);
                    C252063oV r26 = r1.A05;
                    if (r26 == null) {
                        str = "progressViewStubber";
                    } else {
                        ((ImageView) r26.getView()).setImageDrawable(r1.A02);
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            if (z) {
                A01(userSession2, r1, r5, promptStickerModel2);
            } else {
                r1.A0C = true;
            }
        }
    }

    public final View A05() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        0qQ.A0F("stickerContainerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06() {
        C252063oV r2 = this.A0G;
        if (r2 != null) {
            ValueAnimator valueAnimator = this.A0D;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            ValueAnimator valueAnimator2 = this.A0E;
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
            C52798Gcp gcp = this.A02;
            if (gcp != null) {
                gcp.A01();
            }
            C252063oV r0 = this.A05;
            if (r0 != null) {
                ((ImageView) r0.getView()).setImageDrawable((Drawable) null);
                this.A02 = null;
            }
            r2.setVisibility(8);
        }
    }

    public static final boolean A02(UserSession userSession, PromptStickerModel promptStickerModel) {
        if (!promptStickerModel.A0M() || !182.A06(0Tu.A05, userSession, 36324316538810343L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(PromptStickerModel promptStickerModel) {
        if (promptStickerModel.A0M() || promptStickerModel.A0D || promptStickerModel.A0B || promptStickerModel.A00.B3f().size() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean A04(PromptStickerModel promptStickerModel) {
        if (promptStickerModel.A0M() || promptStickerModel.A0D || promptStickerModel.A0B || promptStickerModel.A00.B3f().size() <= 2) {
            return false;
        }
        return true;
    }
}
