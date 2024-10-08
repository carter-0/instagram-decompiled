package com.instagram.showreel.composition.ui.reels;

import X.002;
import X.00k;
import X.00p;
import X.0qQ;
import X.0tS;
import X.0wb;
import X.1P7;
import X.1Xj;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0iw;
import X.AnonymousClass3WT;
import X.AnonymousClass4EQ;
import X.AnonymousClass6K2;
import X.AnonymousClass6LO;
import X.AnonymousClass6LP;
import X.AnonymousClass6LR;
import X.AnonymousClass6MG;
import X.AnonymousClass6NL;
import X.AnonymousClass6NM;
import X.AnonymousClass6NO;
import X.AnonymousClass6Q8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20695WxR;
import X.C229392nJ;
import X.C255773uh;
import X.C255783ui;
import X.C281965Ag;
import X.C3028265o;
import X.C309696Zg;
import X.C51974G9v;
import X.C52367GPo;
import X.C56657I6m;
import X.C56987IKf;
import X.C59668JSn;
import X.DbT;
import X.DbX;
import X.GYD;
import X.W1z;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.rendercore.text.RCTextView;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class IgReelsShowreelCompositionView extends IgShowreelCompositionView {
    public View A00;
    public View A01;
    public AnonymousClass6NM A02;
    public UserSession A03;
    public boolean A04;
    public final Map A05 = AnonymousClass7TE.A1E();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C20695WxR(this, 3));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        C51974G9v.A1J(this);
    }

    public final void A02(View view, Integer num, String str, float f, float f2, int i, int i2) {
        C255783ui r4;
        AnonymousClass3WT r0;
        C255773uh r2;
        User A022;
        RectF rectF = new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        int intValue = num.intValue();
        if (intValue == 0) {
            if (00p.A0k(str, "#", false)) {
                str = str.substring(1);
                0qQ.A07(str);
            }
            r4 = A00(rectF, f, f2, i);
            Locale locale = Locale.US;
            0qQ.A08(locale);
            r4.A0k = C281965Ag.A00(DbT.A12(locale, str)).FEY();
            r0 = AnonymousClass3WT.HASHTAG;
            r4.A11 = r0;
            r4.A1f = "text";
        } else if (intValue == 1) {
            if (00p.A0k(str, "@", false)) {
                str = str.substring(1);
                0qQ.A07(str);
            }
            UserSession userSession = this.A03;
            if (userSession == null || (r2 = getController().A01) == null || r2.A0G() == null) {
                0wb.A03("IgReelsShowreelCompositionView#onInteractionInvoked", 002.A0g("The user ", str, " is not found"));
                return;
            }
            boolean A023 = 1P7.A02(userSession);
            AnonymousClass6LR A0G = r2.A0G();
            if (A023) {
                A022 = W1z.A02(A0G, str);
            } else {
                A022 = AnonymousClass6MG.A02(A0G, str);
            }
            r4 = A00(rectF, f, f2, i);
            r4.A1B = A022;
            r0 = AnonymousClass3WT.MENTION;
            r4.A11 = r0;
            r4.A1f = "text";
        } else if (intValue == 3) {
            AnonymousClass6NM r02 = this.A02;
            if (r02 != null) {
                AnonymousClass6NL r03 = (AnonymousClass6NL) r02;
                r03.A03.D0p(r03.A01, r03.A02, r03.A04);
                return;
            }
            return;
        } else if (intValue == 4) {
            r4 = A00(rectF, f, f2, i);
            r4.A06 = i2;
            r4.A11 = AnonymousClass3WT.DPA;
            r4.A1a = str;
            C255773uh r22 = getController().A01;
            if (r22 != null) {
                r4.A1R = AnonymousClass4EQ.A05(AnonymousClass7TE.A0S(view), this.A03, r22).toString();
            } else {
                return;
            }
        } else {
            return;
        }
        AnonymousClass6NM r3 = this.A02;
        if (r3 != null) {
            AnonymousClass6NL r32 = (AnonymousClass6NL) r3;
            int ordinal = r4.A11.ordinal();
            if (ordinal == 23 || ordinal == 15) {
                r32.A03.D3F(r4);
            } else if (ordinal == 10) {
                C309696Zg r23 = r32.A03;
                Context context = r32.A00;
                0qQ.A0A(context);
                r23.DZx(context, r4, AnonymousClass05K.A00);
            }
        }
    }

    public final void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r15, C229392nJ r16, Map map, C255773uh r18, View view, View view2, AnonymousClass0iw r21) {
        List list;
        AnonymousClass6LR A0G;
        Map map2;
        Set keySet;
        IgShowreelComposition igShowreelComposition2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        IgShowreelComposition igShowreelComposition3 = igShowreelComposition;
        C229392nJ r8 = r16;
        Map map3 = map;
        C51974G9v.A1P(igShowreelComposition, r15, r8, map3);
        C255773uh r1 = r18;
        0qQ.A0B(r1, 5);
        GYD controller = getController();
        C56987IKf iKf = new C56987IKf(this, 0);
        if (!controller.CWX() || (igShowreelComposition2 = controller.A04) == null || !igShowreelComposition2.equals(igShowreelComposition)) {
            ListenableFuture listenableFuture = controller.A07.A00;
            if (listenableFuture != null) {
                listenableFuture.cancel(false);
            }
            controller.A01 = r1;
            controller.A00 = 0.0f;
            1Xj r2 = r1.A0b;
            if (r2 != null && r2.A0y() > 0 && r2.A0x() > 0) {
                controller.A00 = ((float) r2.A0y()) / ((float) r2.A0x());
            }
            controller.A04 = igShowreelComposition;
            controller.A00 = r21;
            C3028265o r22 = controller.A08;
            r22.DOf(1);
            AnonymousClass6Q8 A002 = AnonymousClass6NO.A00(r15, igShowreelComposition);
            AnonymousClass6LP A003 = C52367GPo.A00(A002, userSession, controller);
            SparseArray sparseArray = new SparseArray();
            C255773uh r0 = controller.A01;
            if (r0 == null || (A0G = r0.A0G()) == null || (map2 = A0G.A08) == null || (keySet = map2.keySet()) == null) {
                list = null;
            } else {
                list = 00k.A0a(keySet);
            }
            sparseArray.put(R.id.showreel_mention_list, list);
            controller.A02(sparseArray, A003, iKf, r8, userSession2, igShowreelComposition3, map3);
            r22.CIc(A002);
            controller.A02 = A003;
            controller.A05 = A002.A02;
        }
        this.A03 = userSession;
        this.A00 = view;
        this.A01 = view2;
    }

    private final C255783ui A00(RectF rectF, float f, float f2, int i) {
        Map map = this.A05;
        C255783ui r1 = (C255783ui) map.get(rectF);
        if (r1 == null) {
            r1 = new C255783ui();
            map.put(rectF, r1);
        }
        r1.A03 = f;
        r1.A04 = f2;
        r1.A00 = (float) i;
        return r1;
    }

    public GYD getController() {
        return (GYD) this.A06.getValue();
    }

    public final void Dyz() {
        int i;
        ColorDrawable colorDrawable;
        int i2;
        AnonymousClass0eM r0;
        ColorDrawable colorDrawable2;
        int i3;
        ColorDrawable colorDrawable3;
        super.Dyz();
        0tS A0h = DbT.A0h();
        if (AnonymousClass7TG.A1a(A0h, A0h.A1n, 0tS.A4G, 38)) {
            View[] viewArr = {this.A00, this.A01};
            ArrayList A1C = AnonymousClass7TE.A1C();
            C56657I6m.A03(this, C56657I6m.A00, A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof ScalingTextureView) {
                    ViewParent parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                        WeakHashMap weakHashMap = C56657I6m.A01;
                        Drawable background = view.getBackground();
                        if (!(background instanceof ColorDrawable) || (colorDrawable3 = (ColorDrawable) background) == null) {
                            i3 = 0;
                        } else {
                            i3 = colorDrawable3.getColor();
                        }
                        weakHashMap.put(view, Integer.valueOf(i3));
                        r0 = C56657I6m.A03;
                    }
                } else if (view instanceof RCTextView) {
                    WeakHashMap weakHashMap2 = C56657I6m.A01;
                    Drawable background2 = view.getBackground();
                    if (!(background2 instanceof ColorDrawable) || (colorDrawable2 = (ColorDrawable) background2) == null) {
                        i2 = 0;
                    } else {
                        i2 = colorDrawable2.getColor();
                    }
                    weakHashMap2.put(view, Integer.valueOf(i2));
                    r0 = C56657I6m.A04;
                }
                view.setBackgroundColor(DbX.A07(r0));
            }
            int i4 = 0;
            do {
                View view2 = viewArr[i4];
                if (view2 != null) {
                    WeakHashMap weakHashMap3 = C56657I6m.A01;
                    Drawable background3 = view2.getBackground();
                    if (!(background3 instanceof ColorDrawable) || (colorDrawable = (ColorDrawable) background3) == null) {
                        i = 0;
                    } else {
                        i = colorDrawable.getColor();
                    }
                    weakHashMap3.put(view2, Integer.valueOf(i));
                    view2.setBackgroundColor(DbX.A07(C56657I6m.A02));
                }
                i4++;
            } while (i4 < 2);
        }
    }

    public final void Dz8() {
        super.Dz8();
        0tS A0h = DbT.A0h();
        if (AnonymousClass7TG.A1a(A0h, A0h.A1n, 0tS.A4G, 38)) {
            C56657I6m i6m = C56657I6m.A00;
            View[] viewArr = {this.A00, this.A01};
            ArrayList A1C = AnonymousClass7TE.A1C();
            C56657I6m.A03(this, i6m, A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof ScalingTextureView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        view = (View) parent;
                        if (view == null) {
                        }
                    }
                } else if (!(view instanceof RCTextView)) {
                }
                Object orDefault = C56657I6m.A01.getOrDefault(view, 0);
                0qQ.A07(orDefault);
                view.setBackgroundColor(((Number) orDefault).intValue());
            }
            int i = 0;
            do {
                View view2 = viewArr[i];
                if (view2 != null) {
                    Object orDefault2 = C56657I6m.A01.getOrDefault(view2, 0);
                    0qQ.A07(orDefault2);
                    view2.setBackgroundColor(((Number) orDefault2).intValue());
                }
                i++;
            } while (i < 2);
        }
    }

    public C59668JSn getCompositionController() {
        return getController();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IgProgressImageView igProgressImageView;
        String str;
        ImageUrl imageUrl;
        super.onLayout(z, i, i2, i3, i4);
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass6K2 videoView = getCompositionController().getVideoView();
            ImageUrl imageUrl2 = null;
            if (videoView != null) {
                igProgressImageView = videoView.A00;
            } else {
                igProgressImageView = null;
            }
            if (igProgressImageView == null || getController().A00 == null || getController().A01 == null) {
                str = "Could not locate view by tag";
            } else {
                C255773uh r1 = getController().A01;
                if (r1 != null) {
                    imageUrl = r1.A08(getContext());
                } else {
                    imageUrl = null;
                }
                C255773uh r0 = getController().A01;
                if (r0 != null) {
                    imageUrl2 = r0.A06();
                }
                if (imageUrl == null || imageUrl2 == null) {
                    str = "Thumbnail or sized image url is null";
                } else {
                    AnonymousClass0iw r12 = getController().A00;
                    if (r12 != null) {
                        videoView.A00.setUrlWithFallback(imageUrl, imageUrl2, r12);
                        return;
                    }
                    return;
                }
            }
            0wb.A03("IgReelsShowreelCompositionView", str);
        }
    }

    public final void reset() {
        super.reset();
        this.A04 = false;
        this.A05.clear();
    }

    public final void setInteractivityListener(AnonymousClass6NM r1) {
        this.A02 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C51974G9v.A1J(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgReelsShowreelCompositionView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        C51974G9v.A1J(this);
    }
}
