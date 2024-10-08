package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.6Uv  reason: invalid class name and case insensitive filesystem */
public abstract class C308586Uv {
    public static final /* synthetic */ AnonymousClass0YZ[] A0I;
    public int A00;
    public int A01;
    public C64113LOb A02;
    public C62320sa A03;
    public 0sK A04;
    public 0sK A05;
    public boolean A06;
    public final C252063oV A07;
    public final C308606Ux A08;
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 32));
    public final AnonymousClass0eM A0A = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 33));
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 34));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 35));
    public final 0s0 A0D;
    public final C262224Cq A0E = 19E.A02(AnonymousClass12T.A00.A04);
    public final C308596Uw A0F;
    public final AnonymousClass0eM A0G;
    public final 0s0 A0H;

    static {
        Class<C308586Uv> cls = C308586Uv.class;
        A0I = new AnonymousClass0YZ[]{new 015(cls, "loadingState", "getLoadingState()Lcom/instagram/reels/viewer/superlative/SuperlativeHolder$LoadingState;", 0), new 015(cls, "isVideoReady", "isVideoReady()Z", 0)};
    }

    public static final C308616Uy A00(C308586Uv r3) {
        return (C308616Uy) r3.A0H.CDM(r3, A0I[0]);
    }

    public static final void A01(C308616Uy r3, C308586Uv r4) {
        r4.A0H.Epx(r4, r3, A0I[0]);
    }

    public static final void A02(C308586Uv r3) {
        AnonymousClass6V8 r1;
        C62320sa r0;
        if (((Boolean) r3.A0D.CDM(r3, A0I[1])).booleanValue() && A00(r3) == C308616Uy.COMPLETE) {
            C62320sa r02 = r3.A03;
            if (r02 != null) {
                r02.invoke();
            }
            ((View) r3.A0A.getValue()).setVisibility(8);
            Object value = r3.A0B.getValue();
            0qQ.A07(value);
            ((View) value).setVisibility(8);
            r3.A04().setVisibility(0);
            r1 = (AnonymousClass6V8) r3.A0C.getValue();
            r0 = AnonymousClass6V9.A00;
        } else if (A00(r3) == C308616Uy.FAILED) {
            ((View) r3.A0A.getValue()).setVisibility(0);
            ((View) r3.A09.getValue()).setVisibility(8);
            Object value2 = r3.A0B.getValue();
            0qQ.A07(value2);
            ((View) value2).setVisibility(0);
            r3.A04().setVisibility(4);
            r1 = (AnonymousClass6V8) r3.A0C.getValue();
            r0 = C41639Axr.A00;
        } else {
            return;
        }
        AnonymousClass6V8.A00(r1, r0);
    }

    public static final void A03(C308586Uv r2) {
        Object value = r2.A0B.getValue();
        0qQ.A07(value);
        ((View) value).setVisibility(8);
        r2.A04().setVisibility(4);
        ((View) r2.A0A.getValue()).setVisibility(0);
        ((View) r2.A09.getValue()).setVisibility(0);
        A01(C308616Uy.A04, r2);
        r2.A08.A01.clear();
        r2.A00 = 0;
        r2.A06 = false;
        C64113LOb lOb = r2.A02;
        if (lOb == null) {
            0qQ.A0F("superlativeRenderer");
            throw AnonymousClass00P.createAndThrow();
        }
        C309626Yz r0 = lOb.A00;
        if (r0 != null) {
            ReelViewerFragment reelViewerFragment = r0.A00;
            ((C313046fl) reelViewerFragment.mViewPager).A02.post(reelViewerFragment.A3L);
        }
    }

    public final ViewGroup A04() {
        return (ViewGroup) this.A0G.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r1.A01 == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r3 = this;
            X.3oV r0 = r3.A07
            r2 = 0
            r0.setVisibility(r2)
            X.6Uy r1 = A00(r3)
            X.6Uy r0 = X.C308616Uy.COMPLETE
            if (r1 != r0) goto L_0x0026
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0026
        L_0x0012:
            X.0eM r0 = r3.A0B
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.IAd r0 = new X.IAd
            r0.<init>(r3)
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x0026:
            X.LOb r1 = r3.A02
            if (r1 == 0) goto L_0x0035
            boolean r0 = r1.A02
            r1.A02 = r2
            if (r0 != 0) goto L_0x0012
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0035
            goto L_0x0012
        L_0x0035:
            X.0eM r0 = r3.A0C
            java.lang.Object r1 = r0.getValue()
            X.6V8 r1 = (X.AnonymousClass6V8) r1
            X.Axr r0 = X.C41639Axr.A00
            X.AnonymousClass6V8.A00(r1, r0)
            android.view.ViewGroup r1 = r3.A04()
            r0 = 4
            r1.setVisibility(r0)
            X.0eM r0 = r3.A0B
            java.lang.Object r1 = r0.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            X.0eM r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            X.0eM r0 = r3.A09
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308586Uv.A05():void");
    }

    public final void A06(C64113LOb lOb, C62320sa r27) {
        C64113LOb lOb2 = lOb;
        this.A02 = lOb2;
        int i = this.A01;
        if (i == 0 && lOb2.A04 == C16522UwR.END_SUMMARY) {
            this.A01 = lOb2.A03.A01.size();
        } else {
            List list = lOb2.A03.A01;
            if (i > list.size() && lOb2.A04 == C16522UwR.END_SUMMARY) {
                this.A01 = list.size();
                A01(C308616Uy.A04, this);
                A03(this);
            }
        }
        A05();
        Context context = A04().getContext();
        0qQ.A07(context);
        if (!C61970qY.A0F(context) && A00(this) != C308616Uy.COMPLETE) {
            A01(C308616Uy.FAILED, this);
        } else if (A00(this) == C308616Uy.A04) {
            A01(C308616Uy.STARTED, this);
            r27.invoke();
            C308606Ux r12 = this.A08;
            for (I05 i05 : r12.A01) {
                1Xj r10 = i05.A03;
                if (r10 != null) {
                    IgImageView igImageView = i05.A02;
                    AnonymousClass0iw r8 = i05.A01;
                    String str = i05.A05;
                    boolean z = i05.A07;
                    boolean z2 = i05.A06;
                    float f = i05.A00;
                    C308596Uw r11 = r12.A00;
                    if (!igImageView.isLaidOut() || igImageView.isLayoutRequested()) {
                        igImageView.addOnLayoutChangeListener(new LYR(r8, igImageView, r10, r11, r12, str, f, z2, z));
                    } else {
                        ExtendedImageUrl A1m = r10.A1m(igImageView.getWidth());
                        if (z2 || z) {
                            C308606Ux.A00(r8, A1m, igImageView, r11, r12, str, f, z, z2);
                        } else if (A1m != null) {
                            igImageView.A0E = new C64859LjL(r11);
                            igImageView.setUrl(A1m, r8);
                        } else {
                            igImageView.setVisibility(4);
                            C14164Tr2.A01(str, "Null image");
                        }
                    }
                } else {
                    Integer num = i05.A04;
                    if (num != null) {
                        IgImageView igImageView2 = i05.A02;
                        Context context2 = igImageView2.getContext();
                        Resources resources = context2.getResources();
                        int intValue = num.intValue();
                        Drawable drawable = resources.getDrawable(intValue);
                        if (drawable instanceof C262364Dk) {
                            ((C262364Dk) drawable).A01(new C64862LjO(r12, i05));
                        } else {
                            Bitmap decodeResource = BitmapFactory.decodeResource(context2.getResources(), intValue);
                            if (decodeResource != null) {
                                igImageView2.setImageBitmap(decodeResource);
                                r12.A00.A01();
                            }
                        }
                    }
                }
            }
            return;
        } else if (A00(this) != C308616Uy.FAILED) {
            return;
        }
        A02(this);
    }

    public final void A07(I05 i05) {
        this.A08.A01.add(i05);
    }

    public C308586Uv(ViewStub viewStub, int i) {
        C308596Uw r1 = new C308596Uw(this);
        this.A0F = r1;
        this.A08 = new C308606Ux(r1);
        this.A07 = 2b1.A01(viewStub, false, false);
        this.A0G = AnonymousClass0eN.A01(new C377319Lj(this, i, 16));
        this.A0H = new C308626Uz(C308616Uy.A04);
        this.A0D = new AnonymousClass6V0(this, false);
    }
}
