package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7vS  reason: invalid class name and case insensitive filesystem */
public final class C346607vS implements C355038Oi {
    public Drawable A00;
    public C366798ph A01;
    public Integer A02;
    public boolean A03;
    public C346747vg A04;
    public Boolean A05;
    public String A06;
    public List A07;
    public final Activity A08;
    public final Context A09;
    public final AnonymousClass9IV A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final C252063oV A0D;
    public final C355028Oh A0E;
    public final C351978Be A0F;
    public final CreationActionBar A0G;
    public final C3499482o A0H;
    public final AnonymousClass80E A0I;
    public final C346717vd A0J;
    public final C346717vd A0K;
    public final C346647vW A0L;
    public final C346647vW A0M;
    public final AnonymousClass846 A0N;
    public final AnonymousClass8B2 A0O;
    public final IgdsMediaButton A0P;
    public final User A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public final AnonymousClass0eM A0T;
    public final AnonymousClass0eM A0U;
    public final AnonymousClass0eM A0V;
    public final AnonymousClass0eM A0W;
    public final AnonymousClass0eM A0X;
    public final AnonymousClass0eM A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final CallerContext A0b = CallerContext.A01("DefaultPostCaptureButtonController");
    public final C346647vW A0c;
    public final C346647vW A0d;
    public final C346647vW A0e;
    public final C346647vW A0f;
    public final C346647vW A0g;
    public final C346647vW A0h;
    public final C346647vW A0i;
    public final C346647vW A0j;
    public final boolean A0k;

    private final C346647vW A01(C296265pm r4) {
        C346647vW r2;
        boolean A0E2 = A0E(false);
        if ((A0A() || A0D(false) || A09()) && !A0E2) {
            r2 = new C40353Aam(this.A09, (ViewGroup) this.A0D.getView());
        } else {
            r2 = new C346637vV(this.A09, this.A0C, r4);
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r1 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0E(boolean r6) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r5.A0D(r4)
            if (r0 == 0) goto L_0x001f
            com.instagram.common.session.UserSession r3 = r5.A0C
            if (r6 == 0) goto L_0x002d
            X.0Tu r2 = X.0Tu.A05
        L_0x000d:
            r0 = 36314893382781823(0x81043400230b7f, double:3.029023031385219E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 != 0) goto L_0x002b
        L_0x001f:
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L_0x002b
            boolean r0 = r5.A09()
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r4 = 1
        L_0x002c:
            return r4
        L_0x002d:
            X.0Tu r2 = X.0Tu.A06
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346607vS.A0E(boolean):boolean");
    }

    public final boolean D79(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        RecyclerView recyclerView = ((C355048Oj) this.A0V.getValue()).A00;
        if (recyclerView != null) {
            return recyclerView.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void ESI(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        0qQ.A0B(orientation, 0);
        0qQ.A0B(iArr, 1);
        ((C355048Oj) this.A0V.getValue()).A0r.A02(orientation, iArr, i);
    }

    public final /* synthetic */ void Eck(boolean z) {
    }

    private final C346647vW A00() {
        UserSession userSession = this.A0C;
        if (182.A06(0Tu.A05, userSession, 36318243454982171L)) {
            return this.A0d;
        }
        if (this.A0I == AnonymousClass80E.GROUP_PROFILE && this.A0Q != null) {
            return this.A0i;
        }
        if (AnonymousClass2o2.A00(userSession)) {
            return this.A0e;
        }
        return this.A0L;
    }

    private final void A02() {
        C346647vW r0 = this.A0h;
        if (r0 != null) {
            r0.setVisibility(8);
        }
        C346647vW r02 = this.A0M;
        if (r02 != null) {
            r02.setVisibility(8);
        }
        C346647vW r03 = this.A0L;
        if (r03 != null) {
            r03.setVisibility(8);
        }
        C346647vW r04 = this.A0j;
        if (r04 != null) {
            r04.setVisibility(8);
        }
        C346647vW r05 = this.A0g;
        if (r05 != null) {
            r05.setVisibility(8);
        }
        C346647vW r06 = this.A0f;
        if (r06 != null) {
            r06.setVisibility(8);
        }
        C346647vW r07 = this.A0e;
        if (r07 != null) {
            r07.setVisibility(8);
        }
        C346647vW r08 = this.A0i;
        if (r08 != null) {
            r08.setVisibility(8);
        }
        C346647vW r09 = this.A0d;
        if (r09 != null) {
            r09.setVisibility(8);
        }
        Object value = this.A0R.getValue();
        0qQ.A07(value);
        ((View) value).setVisibility(8);
        ((View) this.A0T.getValue()).setVisibility(8);
        C346647vW r010 = this.A0c;
        if (r010 != null) {
            r010.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.graphics.drawable.LayerDrawable} */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.graphics.drawable.Drawable r16, X.C346607vS r17) {
        /*
            r5 = r17
            r7 = r16
            com.instagram.common.session.UserSession r3 = r5.A0C
            java.lang.Boolean r0 = X.C346627vU.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ba
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319901313277654(0x8108c2000e1ed6, double:3.0321900667961E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00ba
            X.5pk r0 = X.C296245pk.MEDIUM
        L_0x001f:
            X.7vW r6 = r5.A0h
            if (r6 == 0) goto L_0x00b0
            r6.Ecw(r0)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00b3
            android.content.Context r1 = r5.A09
            r11 = 0
            r8 = 1
            X.0qQ.A0B(r7, r8)
            r0 = 2131238290(0x7f081d92, float:1.8092855E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            if (r3 == 0) goto L_0x0044
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
            int r0 = r1.getColor(r0)
            r3.setTint(r0)
        L_0x0044:
            r0 = -1
            android.graphics.drawable.ShapeDrawable r2 = X.C346697vb.A05(r0)
            r0 = 84
            r7.setBounds(r11, r11, r0, r0)
            android.graphics.Rect r0 = r7.getBounds()
            int r9 = r0.width()
            if (r9 != 0) goto L_0x005c
            int r9 = r7.getIntrinsicWidth()
        L_0x005c:
            if (r3 == 0) goto L_0x00b1
            int r0 = r3.getIntrinsicWidth()
        L_0x0062:
            int r9 = r9 - r0
            float r0 = X.0nA.A04(r1, r8)
            int r1 = (int) r0
            r13 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r7, r2, r3}
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r0)
            r10 = r9
            r12 = r11
            r7.setLayerInset(r8, r9, r10, r11, r12)
            int r9 = r9 + r1
            r12 = r7
            r14 = r9
            r15 = r9
            r17 = r1
            r16 = r1
            r12.setLayerInset(r13, r14, r15, r16, r17)
            r4 = 2131976972(0x7f13630c, float:1.959108E38)
            r3 = 2131976973(0x7f13630d, float:1.9591082E38)
        L_0x0088:
            android.content.Context r2 = r5.A09
            int r1 = r6.BER()
            int r0 = r6.BEE()
            android.graphics.drawable.BitmapDrawable r1 = X.C346727ve.A00(r2, r7, r1, r0)
            java.lang.String r0 = r2.getString(r4)
            r6.EZN(r1, r0)
            java.lang.String r0 = r2.getString(r3)
            r6.setLabel(r0)
            android.view.View r1 = r6.ACh()
            X.7vf r0 = new X.7vf
            r0.<init>(r5, r4)
            X.03v.A0B(r1, r0)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = 0
            goto L_0x0062
        L_0x00b3:
            r4 = 2131976974(0x7f13630e, float:1.9591084E38)
            r3 = 2131976975(0x7f13630f, float:1.9591086E38)
            goto L_0x0088
        L_0x00ba:
            X.5pk r0 = X.C296245pk.LARGE
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346607vS.A03(android.graphics.drawable.Drawable, X.7vS):void");
    }

    public static final void A04(Drawable drawable, C346607vS r6) {
        C346647vW r4 = r6.A0i;
        if (r4 != null) {
            Context context = r6.A09;
            BitmapDrawable A002 = C346727ve.A00(context, drawable, r4.BER(), r4.BEE());
            User user = r6.A0Q;
            if (user != null) {
                String string = context.getString(2131963223, new Object[]{user.getUsername()});
                0qQ.A07(string);
                r4.EZN(A002, string);
                r4.setLabel(string);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A05(C346687va r3, C346607vS r4, C346647vW r5) {
        String string;
        if (r3.A05) {
            string = r3.A02;
        } else {
            string = r4.A09.getString(2131953263, new Object[]{Integer.valueOf(r3.A00)});
            0qQ.A07(string);
        }
        r5.EZN(r4.A00, string);
        r5.setLabel(string);
        r5.ERY(new C66312MMv(33, r3, r4), new C66312MMv(34, r3, r4));
    }

    private final void A06(C346647vW r7) {
        UserSession userSession = this.A0C;
        C346687va r4 = C346667vY.A00(userSession).A02;
        if (r4 == null || r4.A04 || !C346627vU.A00(userSession).booleanValue() || 182.A06(0Tu.A05, userSession, 36319901312818898L)) {
            Context context = this.A09;
            LayerDrawable A032 = C346697vb.A03(context, R.drawable.instagram_circle_star_pano_filled_24, 1);
            C346647vW r2 = this.A0L;
            if (r2 != null) {
                r2.EZN(C346727ve.A00(context, A032, r2.BER(), r2.BEE()), context.getString(2131976976));
            }
            String string = context.getString(2131976976);
            0qQ.A07(string);
            r7.setLabel(string);
            r7.ERY(new C377149Ks(this, 14), new AnonymousClass9M5(3, this, r4));
            03v.A0B(r7.ACh(), new C346707vc(this));
            return;
        }
        List<String> list = r4.A03;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (String simpleImageUrl : list) {
            arrayList.add(new SimpleImageUrl(simpleImageUrl));
        }
        if (!0qQ.A0K(this.A07, arrayList) || !0qQ.A0K(this.A05, Boolean.valueOf(r4.A05)) || !0qQ.A0K(this.A06, r4.A02)) {
            boolean z = !0qQ.A0K(this.A07, arrayList);
            this.A07 = arrayList;
            this.A05 = Boolean.valueOf(r4.A05);
            this.A06 = r4.A02;
            if (z) {
                new C40251AXp(this.A0B.getModuleName(), arrayList, new J6W(20, r7, r4, this));
            }
            A05(r4, this, r7);
        }
    }

    private final void A07(IgdsMediaButton igdsMediaButton) {
        AnonymousClass80E r1 = this.A0I;
        if (r1 == AnonymousClass80E.CLOSE_FRIENDS_ENABLED_ONLY || r1 == AnonymousClass80E.HALL_PASS_ONLY) {
            igdsMediaButton.setAlpha(0.5f);
        } else {
            C355098Oo.A02(igdsMediaButton, new C377149Ks(this, 15), C346877vu.A00);
        }
    }

    private final void A08(String str) {
        IgdsMediaButton igdsMediaButton = this.A0P;
        igdsMediaButton.setLabel(str);
        igdsMediaButton.A05();
        TextView textView = igdsMediaButton.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        IgdsMediaButton.A01(igdsMediaButton);
    }

    private final boolean A0A() {
        UserSession userSession = this.A0C;
        if (C346627vU.A00(userSession).booleanValue() || AnonymousClass2o2.A00(userSession) || this.A0E.A02() || (A09() && this.A0I != AnonymousClass80E.HALL_PASS_ONLY)) {
            return false;
        }
        return A0C(this);
    }

    public static final boolean A0C(C346607vS r4) {
        UserSession userSession = r4.A0C;
        if (!AnonymousClass37B.A01(userSession, true) || !182.A06(0Tu.A05, userSession, 36320313629745383L)) {
            return false;
        }
        return true;
    }

    private final boolean A0D(boolean z) {
        0Tu r2;
        0Tu r22;
        UserSession userSession = this.A0C;
        if (!C346627vU.A00(userSession).booleanValue() && !A0C(this) && ((this.A0I != AnonymousClass80E.GROUP_PROFILE || this.A0Q == null) && !AnonymousClass2o2.A00(userSession) && !this.A0E.A02() && !A0A() && !A09())) {
            Boolean BBG = AnonymousClass0t1.A01.A01(userSession).A03.BBG();
            if (BBG != null && BBG.booleanValue()) {
                if (z) {
                    r22 = 0Tu.A05;
                } else {
                    r22 = 0Tu.A06;
                }
                boolean A062 = 182.A06(r22, userSession, 36314893382191995L);
                0qQ.A0A(Boolean.valueOf(A062));
                if (A062) {
                    return true;
                }
            }
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            boolean A063 = 182.A06(r2, userSession, 36314893382323068L);
            0qQ.A0A(Boolean.valueOf(A063));
            if (A063) {
                return true;
            }
        }
        return false;
    }

    public final C351988Bf AuL() {
        C366798ph r0 = this.A01;
        if (r0 != null) {
            return r0.A00;
        }
        return (C351988Bf) this.A0A.A01;
    }

    public final int Bt9() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = ((C355048Oj) this.A0V.getValue()).A0P;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i = 0;
        } else {
            i = marginLayoutParams.bottomMargin;
        }
        return i + viewGroup.getHeight();
    }

    public final ArrayList CFd() {
        C355048Oj r2 = (C355048Oj) this.A0V.getValue();
        ArrayList arrayList = new ArrayList();
        if (r2.A0T.getVisibility() == 0) {
            arrayList.add(C347027w9.MUSIC_SELECTOR);
        }
        if (r2.A0M.getVisibility() == 0) {
            arrayList.add(C347027w9.SAVE_TO_CAMERA_ROLL);
        }
        if (r2.A0i.CFV() == 0) {
            arrayList.add(C347027w9.EFFECT_SELECTOR);
        }
        if (r2.A0I.getVisibility() == 0) {
            arrayList.add(C347027w9.DOODLE);
        }
        if (r2.A0G.getVisibility() == 0) {
            arrayList.add(C347027w9.STICKER);
        }
        ImageView imageView = r2.A0a;
        if (imageView != null && imageView.getVisibility() == 0) {
            arrayList.add(C347027w9.TEXT);
        }
        if (((View) r2.A10.getValue()).getVisibility() == 0) {
            arrayList.add(C347027w9.AI_MAGICMOD);
        }
        if (((View) r2.A12.getValue()).getVisibility() == 0) {
            arrayList.add(C347027w9.AI_MAGICMOD_RESTYLE);
        }
        if (((View) r2.A0z.getValue()).getVisibility() == 0) {
            arrayList.add(C347027w9.AI_MAGICMOD_BACKDROP);
        }
        return arrayList;
    }

    public final void D19(boolean z) {
        C363008it r2;
        C349317zw A002;
        ViewGroup viewGroup;
        C366978pz r1;
        C366978pz r0;
        ((C355048Oj) this.A0V.getValue()).A0P(z);
        if (this.A0E.A01() && this.A0k && z) {
            C346647vW r12 = this.A0L;
            if (r12 != null) {
                C351978Be r02 = this.A0F;
                View ACh = r12.ACh();
                C357088Wk r5 = (C357088Wk) r02.A00.A1x.get();
                if (r5 != null && r5.A0I.CZU()) {
                    AnonymousClass846 r22 = r5.A0J;
                    if (!r22.A00().A01) {
                        Object obj = r5.A0K.get();
                        28D r03 = 28D.A2f;
                        C349317zw A003 = r22.A00();
                        ViewGroup viewGroup2 = r5.A01;
                        if (obj == r03) {
                            r0 = C366978pz.A0M;
                        } else if (r5.A0E.A02.A01() == C365758nd.A04) {
                            r0 = C366978pz.A0N;
                        } else {
                            r0 = C366978pz.A0O;
                        }
                        A003.A01(viewGroup2, ACh, r0);
                    }
                }
            }
            C346647vW r13 = this.A0h;
            if (r13 != null) {
                C351978Be r04 = this.A0F;
                View ACh2 = r13.ACh();
                boolean z2 = this.A03;
                C357088Wk r52 = (C357088Wk) r04.A00.A1x.get();
                if (r52 != null) {
                    C363528js r05 = ((C347147wL) r52.A0L.getValue()).A01;
                    if (r05 != null) {
                        r2 = r05.A03;
                    } else {
                        r2 = null;
                    }
                    if (r52.A0I.CZU()) {
                        AnonymousClass846 r14 = r52.A0J;
                        if (!r14.A00().A01 && r2 != null) {
                            if (z2) {
                                A002 = r14.A00();
                                viewGroup = r52.A01;
                                r1 = C366978pz.A0R;
                            } else if (!AnonymousClass8BA.A0L(r52.A0A)) {
                                A002 = r14.A00();
                                viewGroup = r52.A01;
                                r1 = C366978pz.A17;
                            }
                            A002.A03(viewGroup, ACh2, r1, false);
                        }
                    }
                }
            }
            CallerContext callerContext = this.A0b;
            UserSession userSession = this.A0C;
            if (!C367158qH.A01(this.A09, callerContext, userSession) || !182.A06(0Tu.A05, userSession, 36329723902771492L)) {
                C299955wH.A00(userSession).A01((C295035nS) null);
            } else {
                C363388je.A00(userSession).A01(callerContext, new C368488sh(this), "story_composer");
            }
        }
    }

    public final void DKK(boolean z) {
        ((C355048Oj) this.A0V.getValue()).A0Q(z);
    }

    public final void EI2() {
        ((C355048Oj) this.A0V.getValue()).A06 = false;
    }

    public final void EIG() {
        ((C355048Oj) this.A0V.getValue()).A0A = true;
    }

    public final void EPT(boolean z) {
        C355048Oj r1 = (C355048Oj) this.A0V.getValue();
        if (z || r1.A0e.CVM()) {
            C355098Oo.A05(new View[]{r1.A0e.getView()}, z);
        }
    }

    public final void ESJ(String str) {
        AnonymousClass8GE r4 = ((C355048Oj) this.A0V.getValue()).A0r;
        if (str != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            int i = (int) r4.A01;
            Bitmap A092 = 1MF.A09(decodeFile, i, i, 0, false);
            0qQ.A07(A092);
            View view = r4.A02;
            AnonymousClass8DV r2 = new AnonymousClass8DV(view.getContext().getResources(), A092);
            r2.A00();
            Drawable background = view.getBackground();
            if (background != null) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                layerDrawable.setDrawableByLayerId(R.id.fill, r2);
                layerDrawable.invalidateSelf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void Ef3(String str, Integer num) {
        C346647vW r0 = this.A0d;
        if (r0 != null) {
            r0.setLabel(str);
        }
    }

    public final void En3(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A03(this.A0J.A00, this);
        }
        C346647vW r0 = this.A0L;
        if (r0 != null) {
            A06(r0);
        }
    }

    public final boolean Esi(float f, float f2) {
        Rect rect = new Rect();
        RecyclerView recyclerView = ((C355048Oj) this.A0V.getValue()).A00;
        if (recyclerView != null) {
            RectF rectF = 0nA.A01;
            0nA.A0L(rectF, recyclerView);
            rectF.round(rect);
        }
        rect.top -= 50;
        rect.bottom += 50;
        if (recyclerView == null || recyclerView.getVisibility() != 0 || !rect.contains((int) f, (int) f2)) {
            return false;
        }
        return true;
    }

    private final boolean A09() {
        if (C318996ps.A01()) {
            1q7 A002 = C318996ps.A00();
            UserSession userSession = this.A0C;
            if (A002.A05(userSession) && C318996ps.A01()) {
                C318996ps.A00();
                if (!182.A06(0Tu.A05, userSession, 36321082430006361L) || !1q7.A00(userSession)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final boolean A0B() {
        if (C318996ps.A01()) {
            C318996ps.A00();
            UserSession userSession = this.A0C;
            if (!182.A06(0Tu.A05, userSession, 36321082430071898L) || !1q7.A00(userSession)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05cf, code lost:
        if (A09() == false) goto L_0x05d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0627  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0632  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C346607vS(android.app.Activity r50, android.content.Context r51, android.view.View r52, android.view.ViewStub r53, X.AnonymousClass9IV r54, X.AnonymousClass4DH r55, X.C3503284f r56, X.AnonymousClass0iw r57, com.instagram.common.session.UserSession r58, X.C357638Yz r59, X.C355028Oh r60, X.C351978Be r61, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r62, X.C3499582p r63, X.AnonymousClass80E r64, X.C346597vR r65, X.AnonymousClass846 r66, X.AnonymousClass8B2 r67, X.AnonymousClass88B r68, boolean r69, boolean r70, boolean r71) {
        /*
            r49 = this;
            r18 = 1
            r16 = 2
            r19 = 3
            r17 = 4
            r9 = 5
            r29 = 7
            r25 = 10
            r24 = 11
            r28 = 12
            r22 = 17
            r0 = r49
            r0.<init>()
            r2 = r51
            r0.A09 = r2
            r1 = r50
            r0.A08 = r1
            r47 = r58
            r1 = r47
            r0.A0C = r1
            r1 = r60
            r0.A0E = r1
            r1 = r61
            r0.A0F = r1
            r1 = r64
            r0.A0I = r1
            r48 = r57
            r3 = r48
            r0.A0B = r3
            r3 = r66
            r0.A0N = r3
            r3 = r70
            r0.A0a = r3
            r3 = r71
            r0.A0Z = r3
            r3 = r54
            r0.A0A = r3
            r3 = r67
            r0.A0O = r3
            java.lang.String r3 = "DefaultPostCaptureButtonController"
            com.facebook.common.callercontext.CallerContext r3 = com.facebook.common.callercontext.CallerContext.A01(r3)
            r0.A0b = r3
            r4 = r63
            X.82o r3 = r4.A02
            r46 = r3
            r0.A0H = r3
            X.7vT r30 = new X.7vT
            r35 = r59
            r34 = r56
            r33 = r55
            r32 = r53
            r31 = r52
            r40 = r69
            r39 = r68
            r36 = r62
            r37 = r4
            r38 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            X.0eM r3 = X.AnonymousClass1YB.A00(r30)
            r0.A0V = r3
            r7 = 35
            X.9Le r3 = new X.9Le
            r3.<init>(r0, r7)
            X.0eM r3 = X.AnonymousClass1YB.A00(r3)
            r0.A0W = r3
            r8 = 37
            X.9Le r3 = new X.9Le
            r3.<init>(r0, r8)
            X.0eM r3 = X.AnonymousClass1YB.A00(r3)
            r0.A0Y = r3
            r5 = 34
            X.9Le r3 = new X.9Le
            r3.<init>(r0, r5)
            X.0eM r3 = X.AnonymousClass1YB.A00(r3)
            r0.A0U = r3
            X.0eM r3 = r0.A0Y
            java.lang.Object r4 = r3.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 2131441960(0x7f0b3928, float:1.8505946E38)
            android.view.View r10 = r4.requireViewById(r3)
            X.0qQ.A07(r10)
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r10 = (com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar) r10
            r0.A0G = r10
            r26 = 33
            X.9Le r4 = new X.9Le
            r3 = r26
            r4.<init>(r0, r3)
            X.0eM r3 = X.AnonymousClass1YB.A00(r4)
            r0.A0T = r3
            X.0eM r3 = r0.A0Y
            java.lang.Object r4 = r3.getValue()
            android.view.View r4 = (android.view.View) r4
            r3 = 2131435410(0x7f0b1f92, float:1.8492661E38)
            android.view.View r4 = r4.requireViewById(r3)
            r15 = 0
            r3 = 0
            X.3oV r4 = X.2b1.A01(r4, r15, r15)
            r0.A0D = r4
            X.80E r4 = X.AnonymousClass80E.NONE
            r6 = 0
            if (r1 == r4) goto L_0x00e4
            r6 = 1
        L_0x00e4:
            r0.A0k = r6
            if (r6 == 0) goto L_0x0682
            X.80E r4 = X.AnonymousClass80E.CLOSE_FRIENDS_ENABLED_ONLY
            if (r1 == r4) goto L_0x0682
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x0682
            X.80E r4 = X.AnonymousClass80E.GROUP_PROFILE
            if (r1 == r4) goto L_0x0682
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x0682
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x0682
            java.util.UUID r4 = X.AnonymousClass0HM.A00()
            java.lang.String r13 = r4.toString()
            X.0qQ.A07(r13)
            X.7vW r20 = r0.A01(r3)
            X.9Mn r12 = new X.9Mn
            r4 = r18
            r12.<init>(r13, r0, r4)
            X.9Mn r11 = new X.9Mn
            r4 = r16
            r11.<init>(r13, r0, r4)
            r4 = r20
            r4.ERY(r12, r11)
        L_0x011e:
            r4 = r20
            r0.A0h = r4
            boolean r4 = X.C318996ps.A01()
            if (r4 == 0) goto L_0x067e
            X.1q7 r11 = X.C318996ps.A00()
            com.instagram.common.session.UserSession r4 = r0.A0C
            boolean r4 = r11.A05(r4)
            if (r4 == 0) goto L_0x067e
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x067e
            X.7vW r21 = r0.A01(r3)
            X.MMs r11 = new X.MMs
            r11.<init>(r0, r5)
            X.MMs r5 = new X.MMs
            r5.<init>(r0, r7)
            r4 = r21
            r4.ERY(r11, r5)
        L_0x014b:
            r4 = r21
            r0.A0M = r4
            X.0sn r4 = X.0sn.A00
            r0.A07 = r4
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r4.<init>(r15)
            r0.A00 = r4
            if (r6 == 0) goto L_0x067a
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x067a
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x067a
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x067a
            java.lang.Boolean r4 = X.C346627vU.A00(r47)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0677
            X.0Tu r11 = X.0Tu.A05
            r4 = 36319901313146580(0x8108c2000c1ed4, double:3.032190066713208E-306)
            r7 = r47
            boolean r4 = X.182.A06(r11, r7, r4)
            if (r4 != 0) goto L_0x0677
            X.5pm r4 = X.C296265pm.START_SEGMENT
        L_0x0183:
            X.7vW r23 = r0.A01(r4)
            r4 = r23
            r0.A06(r4)
            java.lang.Boolean r4 = X.C346627vU.A00(r47)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01ac
            X.0Tu r11 = X.0Tu.A05
            r4 = 36319901313212117(0x8108c2000d1ed5, double:3.032190066754654E-306)
            r7 = r47
            boolean r4 = X.182.A06(r11, r7, r4)
            if (r4 == 0) goto L_0x066e
            X.5pl r5 = X.C296255pl.FLEXIBLE
            r4 = r23
            r4.Er0(r5)
        L_0x01ac:
            r4 = r23
            r0.A0L = r4
            if (r6 == 0) goto L_0x066a
            java.lang.Boolean r4 = X.C346627vU.A00(r47)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x066a
            X.0Tu r11 = X.0Tu.A05
            r4 = 36319901313146580(0x8108c2000c1ed4, double:3.032190066713208E-306)
            r7 = r47
            boolean r4 = X.182.A06(r11, r7, r4)
            if (r4 != 0) goto L_0x066a
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x066a
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x066a
            X.5pm r4 = X.C296265pm.END_SEGMENT
            X.7vW r27 = r0.A01(r4)
            X.Khx r5 = X.C62567Khx.DOWN_CHEVRON
            r4 = r27
            r4.A8L(r5)
            X.5pl r5 = X.C296255pl.CONSTRAINED
            r4.Er0(r5)
            r4 = 40
            X.MMs r7 = new X.MMs
            r7.<init>(r0, r4)
            r4 = 41
            X.MMs r5 = new X.MMs
            r5.<init>(r0, r4)
            r4 = r27
            r4.ERY(r7, r5)
        L_0x01f8:
            r4 = r27
            r0.A0j = r4
            if (r6 == 0) goto L_0x0667
            boolean r4 = A0C(r0)
            if (r4 == 0) goto L_0x0667
            X.80E r4 = X.AnonymousClass80E.CLOSE_FRIENDS_ENABLED_ONLY
            if (r1 == r4) goto L_0x0667
            X.80E r4 = X.AnonymousClass80E.GROUP_PROFILE
            if (r1 == r4) goto L_0x0667
            X.7vW r7 = r0.A01(r3)
            X.82o r4 = r0.A0H
            X.82Y r4 = r4.A01
            X.82k r11 = r4.A0W
            android.content.Context r5 = r0.A09
            r13 = 2131238336(0x7f081dc0, float:1.8092948E38)
            r4 = -1
            android.graphics.drawable.shapes.OvalShape r14 = new android.graphics.drawable.shapes.OvalShape
            r14.<init>()
            android.graphics.drawable.ShapeDrawable r12 = new android.graphics.drawable.ShapeDrawable
            r12.<init>(r14)
            android.graphics.Paint r14 = r12.getPaint()
            r14.setColor(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r14.setStyle(r4)
            r4 = r18
            r14.setAntiAlias(r4)
            int[] r14 = new int[r9]
            r4 = 2132017754(0x7f14025a, float:1.9673795E38)
            X.C267014am.A03(r5, r3, r14, r4)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            r4 = r18
            r9.setShape(r4)
            r9.setColors(r14)
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR
            r9.setOrientation(r4)
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            android.graphics.drawable.Drawable r4 = X.AnonymousClass3JT.A06(r5, r13, r4)
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[]{r9, r4}
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r9.<init>(r4)
            r4 = r17
            float r4 = X.0nA.A04(r5, r4)
            int r42 = X.AnonymousClass1GB.A01(r4)
            r36 = r9
            r37 = r15
            r38 = r15
            r39 = r15
            r40 = r15
            r41 = r15
            r36.setLayerInset(r37, r38, r39, r40, r41)
            r40 = r9
            r41 = r18
            r43 = r42
            r44 = r42
            r45 = r42
            r40.setLayerInset(r41, r42, r43, r44, r45)
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[]{r12, r9}
            android.graphics.drawable.LayerDrawable r12 = new android.graphics.drawable.LayerDrawable
            r12.<init>(r4)
            r4 = r18
            float r4 = X.0nA.A04(r5, r4)
            int r42 = X.AnonymousClass1GB.A01(r4)
            r36 = r12
            r40 = r15
            r41 = r15
            r36.setLayerInset(r37, r38, r39, r40, r41)
            r40 = r12
            r41 = r18
            r43 = r42
            r44 = r42
            r45 = r42
            r40.setLayerInset(r41, r42, r43, r44, r45)
            int r9 = r7.BER()
            int r4 = r7.BEE()
            android.graphics.drawable.BitmapDrawable r9 = X.C346727ve.A00(r5, r12, r9, r4)
            if (r11 == 0) goto L_0x0649
            java.lang.String r4 = r11.getName()
            r7.setLabel(r4)
            r4 = 36
            X.MMv r5 = new X.MMv
            r5.<init>(r4, r11, r0)
            X.MMv r4 = new X.MMv
            r4.<init>(r8, r11, r0)
            r7.ERY(r5, r4)
            java.lang.String r11 = r11.getName()
        L_0x02d8:
            r7.EZN(r9, r11)
        L_0x02db:
            r0.A0g = r7
            X.80E r5 = r0.A0I
            X.80E r4 = X.AnonymousClass80E.CAMPFIRE_ONLY
            if (r5 != r4) goto L_0x0646
            X.7vW r12 = r0.A01(r3)
            X.82o r4 = r0.A0H
            X.82Y r4 = r4.A01
            X.82k r8 = r4.A0W
            if (r8 == 0) goto L_0x0307
            java.lang.String r4 = r8.getName()
            r12.setLabel(r4)
            X.Khx r4 = X.C62567Khx.DOWN_CHEVRON
            r12.A8L(r4)
            r4 = 35
            X.MMv r5 = new X.MMv
            r5.<init>(r4, r8, r0)
            X.Az7 r4 = X.C41716Az7.A00
            r12.ERY(r5, r4)
        L_0x0307:
            r0.A0c = r12
            if (r6 == 0) goto L_0x0643
            boolean r4 = r0.A0D(r15)
            if (r4 == 0) goto L_0x0643
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x0643
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x0643
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x0643
            r4 = 2131100692(0x7f060414, float:1.7813773E38)
            int r14 = r2.getColor(r4)
            r4 = 2131099808(0x7f0600a0, float:1.781198E38)
            int r13 = r2.getColor(r4)
            r5 = 2131238336(0x7f081dc0, float:1.8092948E38)
            r4 = 2131099843(0x7f0600c3, float:1.781205E38)
            android.graphics.Paint r8 = X.AnonymousClass3JT.A00
            int r4 = r2.getColor(r4)
            android.graphics.drawable.Drawable r9 = X.AnonymousClass3JT.A05(r2, r5, r4)
            int r4 = r9.getIntrinsicWidth()
            int r11 = r9.getIntrinsicHeight()
            android.graphics.drawable.shapes.OvalShape r5 = new android.graphics.drawable.shapes.OvalShape
            r5.<init>()
            android.graphics.drawable.ShapeDrawable r8 = new android.graphics.drawable.ShapeDrawable
            r8.<init>(r5)
            r8.setIntrinsicWidth(r4)
            r8.setIntrinsicHeight(r11)
            android.graphics.Paint r5 = r8.getPaint()
            float r4 = (float) r4
            r30 = r4
            float r11 = (float) r11
            int[] r41 = new int[]{r14, r13}
            android.graphics.Shader$TileMode r43 = android.graphics.Shader.TileMode.REPEAT
            r37 = 0
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r36 = r4
            r38 = r37
            r39 = r30
            r40 = r11
            r42 = r3
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)
            r5.setShader(r4)
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r5.setStyle(r4)
            r4 = r18
            r5.setAntiAlias(r4)
            r4 = 2131240025(0x7f082459, float:1.8096374E38)
            android.graphics.drawable.Drawable r4 = r2.getDrawable(r4)
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[]{r8, r9, r4}
            r4 = r19
            float r4 = X.0nA.A04(r2, r4)
            int r38 = X.AnonymousClass1GB.A01(r4)
            r4 = r29
            float r4 = X.0nA.A04(r2, r4)
            int r42 = X.AnonymousClass1GB.A01(r4)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r9.<init>(r5)
            r36 = r9
            r37 = r15
            r39 = r38
            r40 = r38
            r41 = r38
            r36.setLayerInset(r37, r38, r39, r40, r41)
            r40 = r9
            r41 = r18
            r43 = r42
            r44 = r42
            r45 = r42
            r40.setLayerInset(r41, r42, r43, r44, r45)
            X.7vW r8 = r0.A01(r3)
            int r5 = r8.BER()
            int r4 = r8.BEE()
            android.graphics.drawable.BitmapDrawable r5 = X.C346727ve.A00(r2, r9, r5, r4)
            r4 = 2131963225(0x7f132d59, float:1.9563197E38)
            java.lang.String r4 = r2.getString(r4)
            X.0qQ.A07(r4)
            r8.EZN(r5, r4)
            r8.setLabel(r4)
            r4 = 32
            X.MMs r9 = new X.MMs
            r9.<init>(r0, r4)
            X.MMs r5 = new X.MMs
            r4 = r26
            r5.<init>(r0, r4)
            r8.ERY(r9, r5)
        L_0x03ee:
            r0.A0f = r8
            java.lang.String r13 = "Required value was null."
            if (r6 == 0) goto L_0x0640
            com.instagram.common.session.UserSession r4 = r0.A0C
            boolean r4 = X.AnonymousClass2o2.A00(r4)
            if (r4 == 0) goto L_0x0640
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x0640
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x0640
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x0640
            X.7vW r9 = r0.A01(r3)
            r4 = 2131231769(0x7f080419, float:1.8079628E38)
            android.graphics.drawable.Drawable r11 = r2.getDrawable(r4)
            if (r11 == 0) goto L_0x07ec
            int r5 = r9.BER()
            int r4 = r9.BEE()
            android.graphics.drawable.BitmapDrawable r4 = X.C346727ve.A00(r2, r11, r5, r4)
            r9.EZN(r4, r3)
            r4 = 2131973104(0x7f1353f0, float:1.9583234E38)
            java.lang.String r4 = r2.getString(r4)
            r9.setLabel(r4)
            X.9Ks r11 = new X.9Ks
            r4 = r28
            r11.<init>(r0, r4)
            r5 = 13
            X.9Ks r4 = new X.9Ks
            r4.<init>(r0, r5)
            r9.ERY(r11, r4)
        L_0x043f:
            r0.A0e = r9
            r4 = r46
            X.82Y r4 = r4.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r4 = r4.A0i
            if (r4 == 0) goto L_0x063d
            X.17i r5 = X.17h.A00(r47)
            java.lang.String r4 = r4.getId()
            com.instagram.user.model.User r11 = r5.A02(r4)
            if (r11 == 0) goto L_0x063d
            java.lang.String r4 = r11.getUsername()
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x063d
        L_0x0461:
            r0.A0Q = r11
            if (r6 == 0) goto L_0x0639
            X.80E r5 = r0.A0I
            X.80E r4 = X.AnonymousClass80E.GROUP_PROFILE
            if (r5 != r4) goto L_0x0639
            if (r11 == 0) goto L_0x0639
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x0639
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x0639
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x0639
            X.7vW r26 = r0.A01(r3)
            r4 = 38
            X.MMs r14 = new X.MMs
            r14.<init>(r0, r4)
            r4 = 39
            X.MMs r5 = new X.MMs
            r5.<init>(r0, r4)
            r4 = r26
            r4.ERY(r14, r5)
        L_0x0490:
            r4 = r26
            r0.A0i = r4
            if (r6 == 0) goto L_0x0636
            com.instagram.common.session.UserSession r14 = r0.A0C
            X.0Tu r6 = X.0Tu.A05
            r4 = 36318243454982171(0x8107400000181b, double:3.031141630534377E-306)
            boolean r4 = X.182.A06(r6, r14, r4)
            if (r4 == 0) goto L_0x0636
            X.80E r4 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r1 == r4) goto L_0x0636
            X.80E r4 = X.AnonymousClass80E.OPAL
            if (r1 == r4) goto L_0x0636
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 == r4) goto L_0x0636
            X.7vW r6 = r0.A01(r3)
            r4 = 2131231429(0x7f0802c5, float:1.8078939E38)
            android.graphics.drawable.Drawable r14 = r2.getDrawable(r4)
            if (r14 == 0) goto L_0x07e6
            int r5 = r6.BER()
            int r4 = r6.BEE()
            android.graphics.drawable.BitmapDrawable r5 = X.C346727ve.A00(r2, r14, r5, r4)
            java.lang.String r4 = "collabStoryShareButton"
            r6.EZN(r5, r4)
            java.lang.String r4 = "Shared story"
            r6.setLabel(r4)
            r4 = 31
            X.MMs r5 = new X.MMs
            r5.<init>(r0, r4)
            X.Az7 r4 = X.C41716Az7.A00
            r6.ERY(r5, r4)
        L_0x04e0:
            r0.A0d = r6
            r5 = 36
            X.9Le r4 = new X.9Le
            r4.<init>(r0, r5)
            X.0eM r4 = X.AnonymousClass1YB.A00(r4)
            r0.A0X = r4
            r5 = 31
            X.9Le r4 = new X.9Le
            r4.<init>(r0, r5)
            X.0eM r4 = X.AnonymousClass1YB.A00(r4)
            r0.A0R = r4
            r5 = 32
            X.9Le r4 = new X.9Le
            r4.<init>(r0, r5)
            X.0eM r4 = X.AnonymousClass1YB.A00(r4)
            r0.A0S = r4
            X.0eE r5 = X.AnonymousClass0t1.A01
            r4 = r47
            com.instagram.user.model.User r4 = r5.A01(r4)
            com.instagram.common.typedurl.ImageUrl r38 = r4.Bh3()
            java.lang.String r39 = r48.getModuleName()
            r4 = 2130970328(0x7f0406d8, float:1.7549363E38)
            int r5 = X.2Yu.A0H(r2, r4)
            int r5 = r2.getColor(r5)
            android.graphics.drawable.ShapeDrawable r5 = X.C346697vb.A05(r5)
            android.graphics.drawable.LayerDrawable r37 = X.C346697vb.A04(r2, r5)
            X.9Ks r14 = new X.9Ks
            r5 = r25
            r14.<init>(r0, r5)
            X.9Ks r13 = new X.9Ks
            r5 = r24
            r13.<init>(r0, r5)
            X.7vd r5 = new X.7vd
            r40 = r14
            r41 = r13
            r36 = r5
            r36.<init>(r37, r38, r39, r40, r41)
            r0.A0J = r5
            if (r11 == 0) goto L_0x0632
            com.instagram.common.typedurl.ImageUrl r38 = r11.Bh3()
        L_0x054d:
            java.lang.String r39 = r48.getModuleName()
            int r4 = X.2Yu.A0H(r2, r4)
            int r4 = r2.getColor(r4)
            android.graphics.drawable.ShapeDrawable r4 = X.C346697vb.A05(r4)
            android.graphics.drawable.LayerDrawable r37 = X.C346697vb.A04(r2, r4)
            r4 = 16
            X.9Ks r11 = new X.9Ks
            r11.<init>(r0, r4)
            X.9Ks r5 = new X.9Ks
            r4 = r22
            r5.<init>(r0, r4)
            X.7vd r4 = new X.7vd
            r40 = r11
            r41 = r5
            r36 = r4
            r36.<init>(r37, r38, r39, r40, r41)
            r0.A0K = r4
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            r0.A02 = r4
            r34 = r65
            if (r65 == 0) goto L_0x05a2
            X.0eM r4 = r0.A0U
            java.lang.Object r5 = r4.getValue()
            X.0qQ.A07(r5)
            android.view.View r5 = (android.view.View) r5
            X.7vg r4 = new X.7vg
            r28 = r4
            r29 = r2
            r30 = r5
            r31 = r33
            r32 = r47
            r33 = r35
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r0.A04 = r4
        L_0x05a2:
            com.instagram.common.session.UserSession r13 = r0.A0C
            java.lang.Boolean r4 = X.C346627vU.A00(r13)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0627
            X.0Tu r11 = X.0Tu.A05
            r4 = 36319901313343191(0x8108c2000f1ed7, double:3.0321900668375457E-306)
            boolean r4 = X.182.A06(r11, r13, r4)
            if (r4 == 0) goto L_0x0627
            r30 = 100
        L_0x05bd:
            boolean r4 = r0.A0D(r15)
            if (r4 != 0) goto L_0x05d1
            boolean r4 = r0.A0A()
            if (r4 != 0) goto L_0x05d1
            boolean r4 = r0.A09()
            r33 = 0
            if (r4 == 0) goto L_0x05d3
        L_0x05d1:
            r33 = 1
        L_0x05d3:
            X.9I9 r11 = new X.9I9
            r28 = r11
            r29 = r19
            r31 = r15
            r32 = r18
            r28.<init>(r29, r30, r31, r32, r33)
            X.80E r4 = X.AnonymousClass80E.MY_WEEK
            if (r1 != r4) goto L_0x0686
            X.0Tu r13 = X.0Tu.A05
            r4 = 36322289314637869(0x810aee0007282d, double:3.0337002484720094E-306)
            r1 = r47
            boolean r1 = X.182.A06(r13, r1, r4)
            if (r1 == 0) goto L_0x0686
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = X.AnonymousClass8PT.A00(r2, r3)
            r0.A07(r4)
            r0.A0P = r4
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = r10.A0D(r3)
            android.content.Context r2 = r3.getContext()
            r1 = 2131976088(0x7f135f98, float:1.9589287E38)
            java.lang.String r1 = r2.getString(r1)
            r3.setLabel(r1)
            r2 = 30
            X.MMs r1 = new X.MMs
            r1.<init>(r0, r2)
            X.7vu r0 = X.C346877vu.A00
            X.C355098Oo.A02(r3, r1, r0)
            X.5pj r0 = X.C296235pj.PRIMARY
            r3.setButtonStyle(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r4}
            r10.A0E(r11, r0)
            return
        L_0x0627:
            boolean r4 = r0.A0E(r15)
            r30 = 2
            if (r4 == 0) goto L_0x05bd
            r30 = 4
            goto L_0x05bd
        L_0x0632:
            r38 = 0
            goto L_0x054d
        L_0x0636:
            r6 = 0
            goto L_0x04e0
        L_0x0639:
            r26 = 0
            goto L_0x0490
        L_0x063d:
            r11 = 0
            goto L_0x0461
        L_0x0640:
            r9 = 0
            goto L_0x043f
        L_0x0643:
            r8 = 0
            goto L_0x03ee
        L_0x0646:
            r12 = r3
            goto L_0x0307
        L_0x0649:
            r4 = 2131963282(0x7f132d92, float:1.9563313E38)
            java.lang.String r11 = r5.getString(r4)
            X.0qQ.A07(r11)
            r7.setLabel(r11)
            r4 = 36
            X.MMs r5 = new X.MMs
            r5.<init>(r0, r4)
            X.MMs r4 = new X.MMs
            r4.<init>(r0, r8)
            r7.ERY(r5, r4)
            goto L_0x02d8
        L_0x0667:
            r7 = r3
            goto L_0x02db
        L_0x066a:
            r27 = r3
            goto L_0x01f8
        L_0x066e:
            X.5pl r5 = X.C296255pl.CONSTRAINED
            r4 = r23
            r4.Er0(r5)
            goto L_0x01ac
        L_0x0677:
            r4 = r3
            goto L_0x0183
        L_0x067a:
            r23 = r3
            goto L_0x01ac
        L_0x067e:
            r21 = r3
            goto L_0x014b
        L_0x0682:
            r20 = r3
            goto L_0x011e
        L_0x0686:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r10.A0D(r3)
            r0.A07(r2)
            X.5pj r1 = X.C296235pj.PRIMARY
            r2.setButtonStyle(r1)
            r0.A0P = r2
            if (r20 == 0) goto L_0x07e2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r28 = r20.ACY()
        L_0x069a:
            if (r21 == 0) goto L_0x07de
            com.instagram.igds.components.mediabutton.IgdsMediaButton r29 = r21.ACY()
        L_0x06a0:
            boolean r1 = r0.A0B()
            if (r1 != 0) goto L_0x06a8
            r29 = 0
        L_0x06a8:
            if (r7 == 0) goto L_0x07da
            com.instagram.igds.components.mediabutton.IgdsMediaButton r30 = r7.ACY()
        L_0x06ae:
            com.instagram.common.session.UserSession r4 = r0.A0C
            X.0Tu r3 = X.0Tu.A06
            r1 = 36320313629286624(0x810922000120e0, double:3.032450817100436E-306)
            boolean r4 = X.182.A06(r3, r4, r1)
            if (r4 != 0) goto L_0x06bf
            r30 = 0
        L_0x06bf:
            if (r23 == 0) goto L_0x07d6
            com.instagram.igds.components.mediabutton.IgdsMediaButton r31 = r23.ACY()
        L_0x06c5:
            if (r21 == 0) goto L_0x07d2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r32 = r21.ACY()
        L_0x06cb:
            boolean r4 = r0.A0B()
            r4 = r4 ^ 1
            if (r4 != 0) goto L_0x06d5
            r32 = 0
        L_0x06d5:
            if (r27 == 0) goto L_0x07ce
            com.instagram.igds.components.mediabutton.IgdsMediaButton r33 = r27.ACY()
        L_0x06db:
            if (r7 == 0) goto L_0x07ca
            com.instagram.igds.components.mediabutton.IgdsMediaButton r34 = r7.ACY()
        L_0x06e1:
            com.instagram.common.session.UserSession r4 = r0.A0C
            boolean r1 = X.182.A06(r3, r4, r1)
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x06ed
            r34 = 0
        L_0x06ed:
            if (r6 == 0) goto L_0x07c6
            com.instagram.igds.components.mediabutton.IgdsMediaButton r35 = r6.ACY()
        L_0x06f3:
            if (r8 == 0) goto L_0x07c2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r36 = r8.ACY()
        L_0x06f9:
            if (r9 == 0) goto L_0x07be
            com.instagram.igds.components.mediabutton.IgdsMediaButton r37 = r9.ACY()
        L_0x06ff:
            if (r26 == 0) goto L_0x07ba
            com.instagram.igds.components.mediabutton.IgdsMediaButton r38 = r26.ACY()
        L_0x0705:
            if (r12 == 0) goto L_0x07b6
            com.instagram.igds.components.mediabutton.IgdsMediaButton r39 = r12.ACY()
        L_0x070b:
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r1 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39}
            r10.A0E(r11, r1)
            X.7vd r1 = r0.A0J
            android.graphics.drawable.Drawable r1 = r1.A00
            A03(r1, r0)
            X.7vW r4 = r0.A0M
            if (r4 == 0) goto L_0x07ae
            X.5pk r1 = X.C296245pk.MEDIUM
            r4.Ecw(r1)
            android.content.Context r5 = r0.A09
            r1 = -1
            android.graphics.drawable.ShapeDrawable r7 = X.C346697vb.A05(r1)
            r1 = 2130970209(0x7f040661, float:1.7549122E38)
            int r1 = X.2Yu.A0H(r5, r1)
            int r1 = r5.getColor(r1)
            android.graphics.drawable.ShapeDrawable r6 = X.C346697vb.A05(r1)
            r3 = 2131238472(0x7f081e48, float:1.8093224E38)
            r2 = 2131100348(0x7f0602bc, float:1.7813075E38)
            android.graphics.Paint r1 = X.AnonymousClass3JT.A00
            int r1 = r5.getColor(r2)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3JT.A05(r5, r3, r1)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[]{r7, r6, r1}
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r6.<init>(r1)
            r1 = r18
            float r1 = X.0nA.A04(r5, r1)
            int r12 = X.AnonymousClass1GB.A01(r1)
            r1 = r17
            float r1 = X.0nA.A04(r5, r1)
            int r17 = X.AnonymousClass1GB.A01(r1)
            r7 = r15
            r8 = r15
            r9 = r15
            r10 = r15
            r11 = r15
            r6.setLayerInset(r7, r8, r9, r10, r11)
            r10 = r6
            r11 = r18
            r13 = r12
            r14 = r12
            r15 = r12
            r10.setLayerInset(r11, r12, r13, r14, r15)
            r15 = r6
            r18 = r17
            r19 = r17
            r20 = r17
            r15.setLayerInset(r16, r17, r18, r19, r20)
            X.1q7 r1 = X.C318996ps.A00()
            r1.A03()
            r7 = 2131968908(0x7f13438c, float:1.9574724E38)
            X.1q7 r1 = X.C318996ps.A00()
            r1.A03()
            r3 = 2131968909(0x7f13438d, float:1.9574726E38)
            int r2 = r4.BER()
            int r1 = r4.BEE()
            android.graphics.drawable.BitmapDrawable r2 = X.C346727ve.A00(r5, r6, r2, r1)
            java.lang.String r1 = r5.getString(r7)
            r4.EZN(r2, r1)
            java.lang.String r1 = r5.getString(r3)
            r4.setLabel(r1)
        L_0x07ae:
            X.7vd r1 = r0.A0K
            android.graphics.drawable.Drawable r1 = r1.A00
            A04(r1, r0)
            return
        L_0x07b6:
            r39 = 0
            goto L_0x070b
        L_0x07ba:
            r38 = 0
            goto L_0x0705
        L_0x07be:
            r37 = 0
            goto L_0x06ff
        L_0x07c2:
            r36 = 0
            goto L_0x06f9
        L_0x07c6:
            r35 = 0
            goto L_0x06f3
        L_0x07ca:
            r34 = 0
            goto L_0x06e1
        L_0x07ce:
            r33 = 0
            goto L_0x06db
        L_0x07d2:
            r32 = 0
            goto L_0x06cb
        L_0x07d6:
            r31 = 0
            goto L_0x06c5
        L_0x07da:
            r30 = 0
            goto L_0x06ae
        L_0x07de:
            r29 = 0
            goto L_0x06a0
        L_0x07e2:
            r28 = 0
            goto L_0x069a
        L_0x07e6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        L_0x07ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346607vS.<init>(android.app.Activity, android.content.Context, android.view.View, android.view.ViewStub, X.9IV, X.4DH, X.84f, X.0iw, com.instagram.common.session.UserSession, X.8Yz, X.8Oh, X.8Be, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, X.80E, X.7vR, X.846, X.8B2, X.88B, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: type inference failed for: r1v41, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: type inference failed for: r1v47, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: type inference failed for: r2v19, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0412, code lost:
        if (r9 == X.AnonymousClass80E.A09) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04e0, code lost:
        if (r13 != false) goto L_0x0435;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0507, code lost:
        if (r12 != null) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0570, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A0C, 36320214845038702L) == false) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0585, code lost:
        if (((android.view.View) r8).getVisibility() == 0) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0587, code lost:
        r8 = r12.A04.getValue();
        X.0qQ.A07(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0596, code lost:
        if (((android.view.View) r8).getVisibility() != 0) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0598, code lost:
        r9 = r6.A0R.getValue();
        X.0qQ.A07(r9);
        r8 = r6.A0S.getValue();
        X.0qQ.A07(r8);
        r8 = new android.view.View[]{(android.view.View) r9, (android.view.View) r8};
        X.0qQ.A0B(r8, 3);
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05b6, code lost:
        r1 = r8[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05b8, code lost:
        if (r1 == null) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05ba, code lost:
        X.C294975nL.A06(new android.view.View[]{r1}, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05c1, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x05c3, code lost:
        if (r9 >= 2) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0177, code lost:
        if (r43 != false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02ff, code lost:
        if (r1 != false) goto L_0x0301;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void FJo(android.text.Spannable r33, X.C3499582p r34, X.AnonymousClass80V r35, X.AnonymousClass80X r36, java.lang.Integer r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            r32 = this;
            r4 = 0
            r5 = r35
            X.0qQ.A0B(r5, r4)
            r3 = 1
            r8 = r36
            X.0qQ.A0B(r8, r3)
            r7 = 2
            r9 = r37
            X.0qQ.A0B(r9, r7)
            r1 = 3
            r13 = r34
            X.0qQ.A0B(r13, r1)
            boolean r0 = X.C355098Oo.A08(r5, r8)
            r2 = 8
            r6 = r32
            if (r0 == 0) goto L_0x0043
            X.0eM r0 = r6.A0Y
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0eM r0 = r6.A0U
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.7vg r0 = r6.A04
            if (r0 == 0) goto L_0x0042
            r0.A00()
        L_0x0042:
            return
        L_0x0043:
            X.0eM r0 = r6.A0T
            r31 = r0
            java.lang.Object r0 = r31.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.7vW r0 = r6.A0c
            if (r0 == 0) goto L_0x0057
            r0.setVisibility(r2)
        L_0x0057:
            X.0eM r10 = r6.A0V
            java.lang.Object r12 = r10.getValue()
            X.8Oj r12 = (X.C355048Oj) r12
            r22 = r43
            r21 = r42
            r20 = r41
            r19 = r40
            r18 = r39
            r17 = r38
            r30 = r52
            r29 = r51
            r28 = r50
            r27 = r49
            r26 = r48
            r25 = r47
            r24 = r45
            r14 = r5
            r15 = r8
            r16 = r9
            r23 = r4
            r12.A0O(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r42 != 0) goto L_0x00fa
            if (r39 != 0) goto L_0x00fa
            X.80V r8 = X.AnonymousClass80V.SECRET_STICKER_PREVIEW
            if (r5 != r8) goto L_0x050a
            X.0eM r5 = r6.A0X
            java.lang.Object r3 = r5.getValue()
            X.0qQ.A07(r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r3
            android.content.Context r2 = r6.A09
            r0 = 2131972894(0x7f13531e, float:1.9582808E38)
            java.lang.String r0 = r2.getString(r0)
            r3.setLabel(r0)
            java.lang.Object r3 = r5.getValue()
            X.0qQ.A07(r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r3 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r3
            r0 = 2131238265(0x7f081d79, float:1.8092804E38)
            X.5n1 r2 = new X.5n1
            r2.<init>()
            r2.A00 = r0
            java.lang.Object r0 = r5.getValue()
            X.0qQ.A07(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            java.lang.String r0 = r0.getLabel()
            r3.setStartAddOn(r2, r0)
            X.0eM r0 = r6.A0Y
            java.lang.Object r3 = r0.getValue()
            android.view.View r3 = (android.view.View) r3
            X.0eM r0 = r6.A0R
            java.lang.Object r2 = r0.getValue()
            X.0qQ.A07(r2)
            android.view.View r2 = (android.view.View) r2
            X.0eM r0 = r6.A0S
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.View[] r3 = new android.view.View[]{r3, r2, r0}
            X.0qQ.A0B(r3, r1)
            r2 = 0
        L_0x00ea:
            r0 = r3[r2]
            if (r0 == 0) goto L_0x00f5
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A06(r0, r4)
        L_0x00f5:
            int r2 = r2 + 1
            if (r2 >= r1) goto L_0x024f
            goto L_0x00ea
        L_0x00fa:
            X.0eM r0 = r6.A0Y
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            X.0eM r0 = r6.A0U
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.View[] r0 = new android.view.View[]{r1, r0}
            X.C355098Oo.A06(r0, r4, r3)
            X.7vg r0 = r6.A04
            if (r0 == 0) goto L_0x024f
            r0.A00()
            goto L_0x024f
        L_0x011d:
            if (r16 == 0) goto L_0x0507
            X.0eM r1 = r6.A0R
            java.lang.Object r1 = r1.getValue()
            X.0qQ.A07(r1)
            r11.add(r1)
            X.0eM r7 = r6.A0S
            java.lang.Object r1 = r7.getValue()
            X.0qQ.A07(r1)
            r11.add(r1)
            java.lang.Object r7 = r7.getValue()
            X.0qQ.A07(r7)
            android.view.View r7 = (android.view.View) r7
            X.AMD r1 = new X.AMD
            r1.<init>(r6)
            X.AnonymousClass0fU.A00(r1, r7)
            java.lang.Object r8 = r14.getValue()
            android.view.View r8 = (android.view.View) r8
            android.content.Context r7 = r6.A09
            r1 = 2130970245(0x7f040685, float:1.7549195E38)
            int r1 = X.2Yu.A0H(r7, r1)
            int r1 = r7.getColor(r1)
            r8.setBackgroundColor(r1)
        L_0x015e:
            android.view.View[] r1 = new android.view.View[r4]
            java.lang.Object[] r7 = r11.toArray(r1)
            android.view.View[] r7 = (android.view.View[]) r7
            int r1 = r7.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r7, r1)
            android.view.View[] r1 = (android.view.View[]) r1
            X.C355098Oo.A06(r1, r3, r3)
            X.80V r7 = X.AnonymousClass80V.MEDIA_EDIT
            if (r5 != r7) goto L_0x0179
            if (r38 != 0) goto L_0x0179
            r13 = 1
            if (r43 == 0) goto L_0x017a
        L_0x0179:
            r13 = 0
        L_0x017a:
            X.82o r1 = r6.A0H
            X.82Y r1 = r1.A01
            X.8Yz r8 = r1.A0X
            if (r8 == 0) goto L_0x0614
            X.8aL r1 = X.C358088aL.A0p
            X.8aL[] r1 = new X.C358088aL[]{r1}
            boolean r1 = r8.A0V(r1)
            r10 = 0
            if (r1 == 0) goto L_0x026b
            android.content.Context r1 = r6.A09
            r0 = 2131973595(0x7f1355db, float:1.958423E38)
        L_0x0194:
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            r6.A08(r0)
            r6.A02()
        L_0x01a1:
            r8 = 8
        L_0x01a3:
            java.lang.Object r2 = r18.getValue()
            X.0qQ.A07(r2)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r2
            android.content.Context r1 = r6.A09
            r0 = 2131972894(0x7f13531e, float:1.9582808E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setLabel(r0)
            java.lang.Object r2 = r18.getValue()
            X.0qQ.A07(r2)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r2
            r0 = 2131238270(0x7f081d7e, float:1.8092814E38)
            X.5n1 r1 = new X.5n1
            r1.<init>()
            r1.A00 = r0
            java.lang.Object r0 = r18.getValue()
            X.0qQ.A07(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            java.lang.String r0 = r0.getLabel()
            r2.setStartAddOn(r1, r0)
            java.lang.Object r0 = r18.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            if (r44 == 0) goto L_0x01e9
            if (r5 != r7) goto L_0x01e9
            r8 = 0
        L_0x01e9:
            r0.setVisibility(r8)
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r4 = r6.A0G
            r1 = 38
            X.9Le r0 = new X.9Le
            r0.<init>(r6, r1)
            r4.A0F(r0)
            X.80E r1 = r6.A0I
            X.80E r0 = X.AnonymousClass80E.CAMPFIRE_ONLY
            if (r1 == r0) goto L_0x0221
            com.instagram.common.session.UserSession r1 = r6.A0C
            boolean r0 = X.AnonymousClass37B.A01(r1, r3)
            if (r0 == 0) goto L_0x0221
            boolean r0 = X.AnonymousClass37B.A00(r1)
            if (r0 == 0) goto L_0x0221
            X.846 r1 = r6.A0N
            X.7zw r0 = r1.A00()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0221
            X.7zw r2 = r1.A00()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r6.A0P
            X.8pz r0 = X.C366978pz.A0Q
            r2.A01(r4, r1, r0)
        L_0x0221:
            com.instagram.common.session.UserSession r3 = r6.A0C
            java.lang.Boolean r0 = X.C346627vU.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x024f
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319901313146580(0x8108c2000c1ed4, double:3.032190066713208E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x024f
            X.846 r1 = r6.A0N
            X.7zw r0 = r1.A00()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x024f
            X.7zw r2 = r1.A00()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r6.A0P
            X.8pz r0 = X.C366978pz.A0L
            r2.A01(r4, r1, r0)
        L_0x024f:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r6.A0G
            r5 = r46
            r7 = r46 ^ 1
            java.util.List r0 = r2.A09
            java.util.Iterator r1 = r0.iterator()
        L_0x025b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05c6
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.setEnabled(r7)
            goto L_0x025b
        L_0x026b:
            X.80E r9 = r6.A0I
            X.80E r1 = X.AnonymousClass80E.MY_WEEK
            if (r9 != r1) goto L_0x027e
            boolean r1 = r15.A01()
            if (r1 == 0) goto L_0x027e
            android.content.Context r1 = r6.A09
            r0 = 2131973592(0x7f1355d8, float:1.9584224E38)
            goto L_0x0194
        L_0x027e:
            X.80E r1 = X.AnonymousClass80E.CAMPFIRE_ONLY
            if (r9 != r1) goto L_0x029b
            android.content.Context r2 = r6.A09
            r1 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r1 = r2.getString(r1)
            X.0qQ.A07(r1)
            r6.A08(r1)
            r6.A02()
            if (r0 == 0) goto L_0x01a1
            r0.setVisibility(r4)
            goto L_0x01a1
        L_0x029b:
            X.4yO r1 = r15.A00()
            X.80M r0 = X.AnonymousClass80M.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02e2
            if (r13 == 0) goto L_0x04fe
            r6.A02()
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = r6.A0G
            r0.setVisibility(r4)
            java.lang.Object r0 = r31.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r4)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = r6.A0P
            android.content.Context r1 = r2.getContext()
            r0 = 2131959809(0x7f132001, float:1.9556269E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setLabel(r0)
            X.5pj r0 = X.C296235pj.PRIMARY
            r2.setButtonStyle(r0)
            r0 = 2131238208(0x7f081d40, float:1.8092688E38)
            X.5n1 r1 = new X.5n1
            r1.<init>()
            r1.A00 = r0
            java.lang.String r0 = r2.getLabel()
            r2.setStartAddOn(r1, r0)
            goto L_0x01a1
        L_0x02e2:
            r8 = 8
            com.instagram.igds.components.mediabutton.IgdsMediaButton r11 = r6.A0P
            r11.setLabel(r10)
            com.instagram.common.session.UserSession r10 = r6.A0C
            X.0Tu r12 = X.0Tu.A05
            r0 = 36329041002970882(0x81111200033f02, double:3.0379700433606736E-306)
            boolean r0 = X.182.A06(r12, r10, r0)
            if (r0 != 0) goto L_0x0301
            boolean r1 = X.C355698Qz.A00(r10)
            r0 = 2131231325(0x7f08025d, float:1.8078728E38)
            if (r1 == 0) goto L_0x0304
        L_0x0301:
            r0 = 2131237920(0x7f081c20, float:1.8092104E38)
        L_0x0304:
            X.5n1 r12 = new X.5n1
            r12.<init>()
            r12.A00 = r0
            android.content.Context r1 = r11.getContext()
            r0 = 2131956201(0x7f1311e9, float:1.9548951E38)
            java.lang.String r0 = r1.getString(r0)
            r11.setStartAddOn(r12, r0)
            X.8q3 r0 = new X.8q3
            r0.<init>(r6)
            X.03v.A0B(r11, r0)
            if (r13 == 0) goto L_0x04d6
            boolean r0 = r15.A01()
            if (r0 == 0) goto L_0x04d6
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = r6.A0G
            r0.setVisibility(r4)
            X.3oV r0 = r6.A0D
            r0.setVisibility(r4)
            X.7vW r11 = r6.A0h
            if (r11 == 0) goto L_0x0349
            X.7vW r1 = r6.A00()
            X.7vW r0 = r6.A0i
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 8
            if (r1 != 0) goto L_0x0346
            r0 = 0
        L_0x0346:
            r11.setVisibility(r0)
        L_0x0349:
            boolean r0 = r6.A09()
            java.lang.String r11 = ""
            if (r0 != 0) goto L_0x0355
            X.80E r0 = X.AnonymousClass80E.OPAL
            if (r9 != r0) goto L_0x04cd
        L_0x0355:
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x04cd
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A05(r10)
            if (r0 == 0) goto L_0x04cd
            X.7vW r1 = r6.A0M
            if (r1 == 0) goto L_0x036c
            r1.setVisibility(r4)
        L_0x036c:
            boolean r0 = r6.A0B()
            if (r0 == 0) goto L_0x04c6
            X.7vW r0 = r6.A0L
            if (r0 == 0) goto L_0x0379
            r0.setLabel(r11)
        L_0x0379:
            X.7vW r12 = r6.A0d
            if (r12 == 0) goto L_0x038d
            X.7vW r0 = r6.A00()
            boolean r1 = X.0qQ.A0K(r0, r12)
            r0 = 8
            if (r1 == 0) goto L_0x038a
            r0 = 0
        L_0x038a:
            r12.setVisibility(r0)
        L_0x038d:
            X.7vW r0 = r6.A00()
            X.7vW r12 = r6.A0L
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x04b8
            if (r12 == 0) goto L_0x039e
            r12.setVisibility(r4)
        L_0x039e:
            X.7vW r0 = r6.A0j
            if (r0 == 0) goto L_0x03a5
            r0.setVisibility(r4)
        L_0x03a5:
            X.7vW r13 = r6.A0e
            if (r13 == 0) goto L_0x03b9
            X.7vW r0 = r6.A00()
            boolean r1 = X.0qQ.A0K(r0, r13)
            r0 = 8
            if (r1 == 0) goto L_0x03b6
            r0 = 0
        L_0x03b6:
            r13.setVisibility(r0)
        L_0x03b9:
            X.7vW r13 = r6.A0i
            if (r13 == 0) goto L_0x03cd
            X.7vW r0 = r6.A00()
            boolean r1 = X.0qQ.A0K(r0, r13)
            r0 = 8
            if (r1 == 0) goto L_0x03ca
            r0 = 0
        L_0x03ca:
            r13.setVisibility(r0)
        L_0x03cd:
            X.7vW r0 = r6.A00()
            if (r0 == 0) goto L_0x03ec
            boolean r0 = r15.A02()
            X.7vW r1 = r6.A00()
            if (r0 == 0) goto L_0x04a8
            if (r1 == 0) goto L_0x03e3
            r0 = 4
            r1.setVisibility(r0)
        L_0x03e3:
            X.7vW r0 = r6.A00()
            if (r0 == 0) goto L_0x03ec
            r0.setEnabled(r4)
        L_0x03ec:
            boolean r14 = r6.A0E(r3)
            boolean r13 = r6.A0D(r3)
            X.7vW r1 = r6.A0f
            if (r1 == 0) goto L_0x0405
            r0 = 8
            if (r13 == 0) goto L_0x03fd
            r0 = 0
        L_0x03fd:
            r1.setVisibility(r0)
            if (r14 == 0) goto L_0x0405
            r1.setLabel(r11)
        L_0x0405:
            X.7vW r13 = r6.A0g
            if (r13 == 0) goto L_0x0419
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x0414
            X.80E r1 = X.AnonymousClass80E.OPAL
            r0 = 0
            if (r9 != r1) goto L_0x0416
        L_0x0414:
            r0 = 8
        L_0x0416:
            r13.setVisibility(r0)
        L_0x0419:
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x049e
            X.0Tu r14 = X.0Tu.A06
            r0 = 36320313629286624(0x810922000120e0, double:3.032450817100436E-306)
            boolean r0 = X.182.A06(r14, r10, r0)
            if (r0 == 0) goto L_0x049e
            X.80E r0 = X.AnonymousClass80E.CLOSE_FRIENDS_ENABLED_ONLY
            if (r9 == r0) goto L_0x049e
            if (r12 == 0) goto L_0x0435
            r12.setLabel(r11)
        L_0x0435:
            if (r16 == 0) goto L_0x04e4
            X.0eM r9 = r6.A0S
            java.lang.Object r0 = r9.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r2 = r33
            if (r33 == 0) goto L_0x0476
            boolean r0 = X.00l.A0W(r2)
            if (r0 != 0) goto L_0x0476
            r0 = -2
            r1.width = r0
            java.lang.Object r0 = r9.getValue()
            X.0qQ.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            java.lang.Object r1 = r9.getValue()
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r6.A09
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
        L_0x046d:
            int r0 = r2.getColor(r0)
            r1.setTextColor(r0)
            goto L_0x01a3
        L_0x0476:
            r1.width = r4
            java.lang.Object r4 = r9.getValue()
            X.0qQ.A07(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r2 = r6.A09
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131974365(0x7f1358dd, float:1.9585792E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setText(r0)
            java.lang.Object r1 = r9.getValue()
            X.0qQ.A07(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131099826(0x7f0600b2, float:1.7812016E38)
            goto L_0x046d
        L_0x049e:
            X.80E r0 = X.AnonymousClass80E.HALL_PASS_ONLY
            if (r9 == r0) goto L_0x0435
            if (r13 == 0) goto L_0x0435
            r13.setLabel(r11)
            goto L_0x0435
        L_0x04a8:
            if (r1 == 0) goto L_0x04ad
            r1.setVisibility(r4)
        L_0x04ad:
            X.7vW r0 = r6.A00()
            if (r0 == 0) goto L_0x03ec
            r0.setEnabled(r3)
            goto L_0x03ec
        L_0x04b8:
            if (r12 == 0) goto L_0x04bd
            r12.setVisibility(r2)
        L_0x04bd:
            X.7vW r0 = r6.A0j
            if (r0 == 0) goto L_0x03a5
            r0.setVisibility(r2)
            goto L_0x03a5
        L_0x04c6:
            if (r1 == 0) goto L_0x0379
            r1.setLabel(r11)
            goto L_0x0379
        L_0x04cd:
            X.7vW r0 = r6.A0M
            if (r0 == 0) goto L_0x0379
            r0.setVisibility(r2)
            goto L_0x0379
        L_0x04d6:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = r6.A0G
            r0.setVisibility(r2)
            X.3oV r0 = r6.A0D
            r0.setVisibility(r2)
            if (r13 == 0) goto L_0x04e4
            goto L_0x0435
        L_0x04e4:
            X.0eM r0 = r6.A0R
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0eM r0 = r6.A0S
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            goto L_0x0502
        L_0x04fe:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = r6.A0G
            r8 = 8
        L_0x0502:
            r0.setVisibility(r2)
            goto L_0x01a3
        L_0x0507:
            if (r12 == 0) goto L_0x015e
            goto L_0x0587
        L_0x050a:
            X.7vg r12 = r6.A04
            if (r12 == 0) goto L_0x052b
            X.4DH r9 = r12.A00
            boolean r8 = r9.mDetached
            if (r8 != 0) goto L_0x052b
            boolean r8 = r9.isAdded()
            if (r8 == 0) goto L_0x052b
            X.0eM r8 = r12.A05
            java.lang.Object r8 = r8.getValue()
            X.8Ce r8 = (X.AnonymousClass8Ce) r8
            X.05G r9 = r8.A03
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            r9.Epw(r8)
        L_0x052b:
            X.0eM r14 = r6.A0Y
            java.lang.Object r10 = r14.getValue()
            android.view.View r10 = (android.view.View) r10
            X.0eM r8 = r6.A0U
            java.lang.Object r9 = r8.getValue()
            X.0qQ.A07(r9)
            android.view.View r9 = (android.view.View) r9
            X.0eM r8 = r6.A0X
            r18 = r8
            java.lang.Object r8 = r18.getValue()
            X.0qQ.A07(r8)
            android.view.View r8 = (android.view.View) r8
            android.view.View[] r8 = new android.view.View[]{r10, r9, r8}
            java.util.ArrayList r11 = X.0sr.A1M(r8)
            X.8Oh r15 = r6.A0E
            X.4yO r9 = r15.A00()
            X.9QA r8 = X.AnonymousClass9QA.A00
            boolean r8 = X.0qQ.A0K(r9, r8)
            if (r8 == 0) goto L_0x0572
            com.instagram.common.session.UserSession r13 = r6.A0C
            X.0Tu r10 = X.0Tu.A05
            r8 = 36320214845038702(0x81090b0001206e, double:3.0323883455442776E-306)
            boolean r8 = X.182.A06(r10, r13, r8)
            r16 = 1
            if (r8 != 0) goto L_0x0574
        L_0x0572:
            r16 = 0
        L_0x0574:
            if (r12 == 0) goto L_0x011d
            X.0eM r8 = r12.A04
            java.lang.Object r8 = r8.getValue()
            X.0qQ.A07(r8)
            android.view.View r8 = (android.view.View) r8
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x011d
        L_0x0587:
            X.0eM r8 = r12.A04
            java.lang.Object r8 = r8.getValue()
            X.0qQ.A07(r8)
            android.view.View r8 = (android.view.View) r8
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x015e
            X.0eM r8 = r6.A0R
            java.lang.Object r9 = r8.getValue()
            X.0qQ.A07(r9)
            android.view.View r9 = (android.view.View) r9
            X.0eM r8 = r6.A0S
            java.lang.Object r8 = r8.getValue()
            X.0qQ.A07(r8)
            android.view.View r8 = (android.view.View) r8
            android.view.View[] r8 = new android.view.View[]{r9, r8}
            X.0qQ.A0B(r8, r1)
            r9 = 0
        L_0x05b6:
            r1 = r8[r9]
            if (r1 == 0) goto L_0x05c1
            android.view.View[] r1 = new android.view.View[]{r1}
            X.C294975nL.A06(r1, r3)
        L_0x05c1:
            int r9 = r9 + 1
            if (r9 >= r7) goto L_0x015e
            goto L_0x05b6
        L_0x05c6:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r2.A02
            if (r0 == 0) goto L_0x05cd
            r0.setEnabled(r7)
        L_0x05cd:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r2.A01
            if (r0 == 0) goto L_0x05d4
            r0.setEnabled(r7)
        L_0x05d4:
            if (r46 == 0) goto L_0x0605
            X.AME r0 = new X.AME
            r0.<init>(r6)
        L_0x05db:
            X.AnonymousClass0fU.A00(r0, r2)
            X.3oV r4 = r6.A0D
            android.view.View r1 = r4.getView()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r46 == 0) goto L_0x05eb
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x05eb:
            r1.setAlpha(r0)
            android.view.View r3 = r4.getView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r2 = 0
            int r1 = r3.getChildCount()
        L_0x05f9:
            if (r2 >= r1) goto L_0x0607
            android.view.View r0 = r3.getChildAt(r2)
            r0.setEnabled(r7)
            int r2 = r2 + 1
            goto L_0x05f9
        L_0x0605:
            r0 = 0
            goto L_0x05db
        L_0x0607:
            android.view.View r1 = r4.getView()
            X.8q4 r0 = new X.8q4
            r0.<init>(r6, r5)
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x0614:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C346607vS.FJo(android.text.Spannable, X.82p, X.80V, X.80X, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
