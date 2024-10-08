package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.8AL  reason: invalid class name */
public final class AnonymousClass8AL extends C232922uf implements AnonymousClass8AM, AnonymousClass8AN, AnonymousClass8AO {
    public C14238TsL A00;
    public C380619Yw A01;
    public C353358Hh A02;
    public C353308Hc A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public C64434Lbp A0F;
    public C3504884v A0G;
    public AnonymousClass825 A0H;
    public final int A0I;
    public final View A0J;
    public final LinearLayoutManager A0K;
    public final UserSession A0L;
    public final C357638Yz A0M;
    public final AnonymousClass8AR A0N;
    public final AnonymousClass8AT A0O;
    public final NestableSnapPickerRecyclerView A0P;
    public final AnonymousClass8AY A0Q;
    public final Runnable A0R;
    public final Runnable A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final Context A0W;
    public final C3495480u A0X;
    public final AnonymousClass8AK A0Y;
    public final AnonymousClass8AQ A0Z;
    public final boolean A0a;

    public final void CvH(float f) {
        if (f == 0.0f) {
            A04();
        }
    }

    private int A00() {
        int left;
        int i;
        int i2;
        int A1a = this.A0K.A1a();
        if (A1a == -1) {
            return 0;
        }
        AnonymousClass8AQ r4 = this.A0Z;
        int i3 = r4.A00;
        if (i3 == 0) {
            TargetViewSizeProvider targetViewSizeProvider = r4.A03;
            if (targetViewSizeProvider != null) {
                i2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K.getWidth();
            } else {
                i2 = r4.A01;
            }
            i3 = (i2 - r4.A02) / 2;
            r4.A00 = i3;
        }
        int i4 = i3 + (A1a * this.A0I);
        View childAt = this.A0P.getChildAt(0);
        if (this.A0U) {
            TargetViewSizeProvider targetViewSizeProvider2 = r4.A03;
            if (targetViewSizeProvider2 != null) {
                i = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getWidth();
            } else {
                i = r4.A01;
            }
            left = i - childAt.getRight();
        } else {
            left = childAt.getLeft();
        }
        return i4 - left;
    }

    private int A01() {
        boolean z = this.A0D;
        AnonymousClass8AY r0 = this.A0Q;
        if (r0 == null) {
            return 0;
        }
        List list = r0.A02;
        if (list.size() < (z ? 1 : 0) + true || (list.get(z) instanceof AnonymousClass8AT)) {
            return 0;
        }
        return ((2Rw) list.get(z)).getItemCount();
    }

    public static ArrayList A03(AnonymousClass8AL r5) {
        ArrayList arrayList = new ArrayList();
        LinearLayoutManager linearLayoutManager = r5.A0K;
        int A1b = linearLayoutManager.A1b();
        for (int A1a = linearLayoutManager.A1a(); A1a <= A1b; A1a++) {
            C249703kE A0X2 = r5.A0P.A0X(A1a, false);
            if (A0X2 instanceof C380619Yw) {
                arrayList.add(A0X2);
            }
        }
        return arrayList;
    }

    private void A04() {
        AnonymousClass8AY r2 = this.A0Q;
        C353358Hh r0 = this.A02;
        if (r0 != null && r2 != null) {
            r2.A02(r0);
            if (!this.A0B) {
                this.A0P.A16(this.A0N);
            }
            this.A0P.setAdapter(r2);
            this.A02 = null;
        }
    }

    public static void A07(AnonymousClass8AL r2, boolean z) {
        AnonymousClass8AT r1 = r2.A0O;
        if (!r1.A01 && z) {
            r1.A08.A03();
        }
        r1.A01 = z;
        r1.notifyItemChanged(0);
        C353308Hc r0 = r2.A03;
        if (r0 != null) {
            C353358Hh r12 = r0.A00;
            r12.A02 = !z;
            r12.notifyItemChanged(r12.A00);
        }
    }

    public final void A08(int i) {
        if (!this.A0a || this.A04 != null || i <= 0) {
            int max = Math.max(i * this.A0I, 0) - A00();
            this.A07 = true;
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
            if (this.A0U) {
                max = -max;
            }
            nestableSnapPickerRecyclerView.scrollBy(max, 0);
            this.A07 = false;
            return;
        }
        this.A04 = new C41027AnB(this, i);
    }

    public final void A09(C353308Hc r10, boolean z) {
        C353308Hc r0 = this.A03;
        if (r0 == r10) {
            boolean z2 = this.A0a;
            if (z2) {
                r0.getClass();
                this.A02 = r0.A00;
                EKg(0, A02(this));
                ArrayList A032 = A03(this);
                if (!A032.isEmpty()) {
                    C64434Lbp lbp = this.A0F;
                    if (lbp != null) {
                        Iterator it = lbp.A01.iterator();
                        while (it.hasNext()) {
                            2cs r2 = (2cs) it.next();
                            r2.A06(r2.A09.A00);
                        }
                    }
                    C64434Lbp lbp2 = new C64434Lbp(C71392co.A03(5.0d, 45.0d), C71392co.A03(5.0d, 65.0d));
                    for (int size = A032.size() - 1; size >= 0; size--) {
                        C380619Yw r02 = (C380619Yw) A032.get(size);
                        if (size == 0) {
                            r02.A02 = this;
                        }
                        lbp2.A01(r02);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = lbp2.A01;
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        2cs r22 = (2cs) it2.next();
                        r22.A06 = true;
                        r22.A08(1.0d, true);
                    }
                    lbp2.A00();
                    ((2cs) copyOnWriteArrayList.get(lbp2.A00)).A06(0.0d);
                } else {
                    A04();
                }
            }
            this.A0C = false;
            if (!z2) {
                A0B(z);
            }
        }
    }

    public final void A0A(C353308Hc r5, boolean z) {
        CameraAREffect cameraAREffect;
        Runnable runnable;
        if (this.A0C) {
            A09(this.A03, false);
        }
        this.A03 = r5;
        2Rw r3 = r5.A00;
        boolean z2 = this.A0a;
        if (z2) {
            this.A05 = false;
            if (this.A02 != null) {
                A04();
            }
            r3.A01 = false;
            AnonymousClass8AY r1 = this.A0Q;
            r1.getClass();
            r1.A03(r3, r1.A02.size());
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
            nestableSnapPickerRecyclerView.A15(this.A0N);
            if (this.A0D) {
                runnable = this.A0S;
            } else {
                runnable = this.A0R;
            }
            0nA.A0q(nestableSnapPickerRecyclerView, runnable);
        } else {
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView2 = this.A0P;
            if (nestableSnapPickerRecyclerView2.A0A != r3) {
                nestableSnapPickerRecyclerView2.setAdapter(r3);
            }
        }
        AnonymousClass8AK r0 = this.A0Y;
        if (r0 != null) {
            cameraAREffect = r0.Atq();
        } else {
            cameraAREffect = null;
        }
        A0D(cameraAREffect);
        this.A0C = true;
        if (!z2) {
            A0C(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r5.A08 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(boolean r6) {
        /*
            r5 = this;
            X.TsL r4 = r5.A00
            boolean r0 = r5.A0V
            r3 = 0
            if (r0 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x0053
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x0053
            X.8Yz r0 = r5.A0M
            r0.getClass()
            X.80m r0 = r0.A09
            java.lang.Object r1 = r0.A00
            java.util.Set r1 = (java.util.Set) r1
            X.8aL r0 = X.C358088aL.A0C
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0053
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            com.instagram.common.session.UserSession r0 = r5.A0L
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "mini_gallery_has_opened_mini_gallery_count_v2"
            int r1 = r1.getInt(r0, r3)
            r0 = 3
            if (r1 >= r0) goto L_0x0038
            boolean r0 = r5.A08
            r1 = 1
            if (r0 == 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            java.lang.Integer r0 = r4.A01
            if (r0 != r2) goto L_0x0041
            boolean r0 = r4.A02
            if (r1 == r0) goto L_0x0048
        L_0x0041:
            r4.A01 = r2
            r4.A02 = r1
            r4.notifyItemChanged(r3)
        L_0x0048:
            android.view.View r0 = r5.A0J
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r6)
            return
        L_0x0053:
            X.84v r0 = r5.A0G
            if (r0 == 0) goto L_0x0066
            X.05G r0 = r0.A0Z
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0066
            goto L_0x0048
        L_0x0066:
            android.view.View r0 = r5.A0J
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A05(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AL.A0B(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r5.A08 != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x003f
            X.TsL r4 = r5.A00
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x0035
            if (r4 == 0) goto L_0x0035
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            com.instagram.common.session.UserSession r0 = r5.A0L
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "mini_gallery_has_opened_mini_gallery_count_v2"
            r2 = 0
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 >= r0) goto L_0x0025
            boolean r0 = r5.A08
            r1 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            java.lang.Integer r0 = r4.A01
            if (r0 != r3) goto L_0x002e
            boolean r0 = r4.A02
            if (r1 == r0) goto L_0x0035
        L_0x002e:
            r4.A01 = r3
            r4.A02 = r1
            r4.notifyItemChanged(r2)
        L_0x0035:
            android.view.View r0 = r5.A0J
            android.view.View[] r1 = new android.view.View[]{r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r6)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AL.A0C(boolean):void");
    }

    public final boolean A0D(CameraAREffect cameraAREffect) {
        String canonicalPath;
        AnonymousClass8AY r2 = this.A0Q;
        if (!this.A0T || this.A0M == null || this.A0B || cameraAREffect == null || cameraAREffect.A0Z.get("galleryPicker") == null || r2 == null) {
            return false;
        }
        r2.A03(this.A0O, r2.A02.size());
        this.A0B = true;
        AnonymousClass825 r5 = this.A0H;
        if (r5 != null) {
            Context context = this.A0W;
            Resources resources = context.getResources();
            String str = cameraAREffect.A0K;
            0qQ.A0B(resources, 0);
            0qQ.A0B(str, 3);
            if (str.equals("389287015265096") && r5.A03) {
                File file = r5.A00;
                if (file == null || (canonicalPath = file.getCanonicalPath()) == null) {
                    Drawable A002 = AnonymousClass2dd.A00(resources, R.drawable.nature);
                    0qQ.A0C(A002, C273654mx.A00(352));
                    ((C262364Dk) A002).A01(new AZL(context, r5));
                    return true;
                }
                r5.A05.A01(0, canonicalPath, true);
            }
        }
        return true;
    }

    public final void ACy(int i) {
        if (!this.A0a || this.A05) {
            if (this.A0D) {
                i++;
            }
            int A022 = A02(this);
            if (A022 != i) {
                this.A07 = true;
                EKg(i, A022);
                this.A07 = false;
                return;
            }
            return;
        }
        this.A04 = new C41027AnB(this, i);
    }

    public final boolean CbK() {
        if (this.A0P.getScrollState() != 1) {
            return false;
        }
        return true;
    }

    public final void DmE(2cs r2) {
        C380619Yw r0 = this.A01;
        if (r0 != null) {
            r0.DmE(r2);
        }
    }

    public static int A02(AnonymousClass8AL r4) {
        int i;
        int A002 = r4.A00();
        if (r4.A0B) {
            int A012 = r4.A01() - (r4.A0D ^ true ? 1 : 0);
            if (A012 > 0) {
                int i2 = r4.A0I;
                i = (i2 / 2) + (A012 * i2);
            } else {
                i = 0;
            }
            if (A002 >= i) {
                return r4.A01() + (r4.A0D ? 1 : 0);
            }
        }
        int i3 = r4.A0I;
        return (A002 + (i3 / 2)) / i3;
    }

    public static void A05(AnonymousClass8AL r7) {
        ArrayList A032 = A03(r7);
        if (!A032.isEmpty()) {
            C353308Hc r0 = r7.A03;
            if (r0 != null) {
                r0.A00.A00 = A032.size() - 1;
            }
            r7.A0F = new C64434Lbp(C71392co.A03(5.0d, 45.0d), C71392co.A03(5.0d, 65.0d));
            Iterator it = A032.iterator();
            while (it.hasNext()) {
                r7.A0F.A01((C380619Yw) it.next());
            }
            Iterator it2 = r7.A0F.A01.iterator();
            while (it2.hasNext()) {
                2cs r2 = (2cs) it2.next();
                r2.A06 = true;
                r2.A08(0.0d, true);
            }
            r7.A0F.A01(r7);
            r7.A0F.A00();
            C64434Lbp lbp = r7.A0F;
            ((2cs) lbp.A01.get(lbp.A00)).A03();
            C353308Hc r1 = r7.A03;
            if (!r7.A0D && r1 != null) {
                r1.A00.A01 = true;
                Runnable runnable = r7.A04;
                if (runnable != null) {
                    runnable.run();
                    r7.A04 = null;
                }
                r7.A05 = true;
            }
            r7.A0A = false;
            r7.A06 = true;
        }
    }

    public static void A06(AnonymousClass8AL r6) {
        int i;
        int A002 = r6.A00();
        if (r6.A0B) {
            int A012 = r6.A01() - (r6.A0D ^ true ? 1 : 0);
            if (A012 > 0) {
                int i2 = r6.A0I;
                i = (i2 / 2) + (A012 * i2);
            } else {
                i = 0;
            }
            if (A002 >= i) {
                int A003 = r6.A00();
                A07(r6, true);
                int A013 = r6.A01() - (r6.A0D ^ true ? 1 : 0);
                int i3 = r6.A0I;
                int max = (A013 * i3) + (i3 / 2) + (Math.max(r6.A0O.A00, 0) / 2);
                if (A003 != max) {
                    int i4 = max - A003;
                    NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = r6.A0P;
                    if (r6.A0U) {
                        i4 = -i4;
                    }
                    nestableSnapPickerRecyclerView.A0u(i4, 0);
                    return;
                }
                return;
            }
        }
        A07(r6, false);
        int i5 = r6.A0I;
        int i6 = A002 % i5;
        if (i6 != 0) {
            NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView2 = r6.A0P;
            if (nestableSnapPickerRecyclerView2.getChildCount() >= 2) {
                int i7 = i5 / 2;
                int i8 = i5 - i6;
                if (i6 < i7) {
                    i8 = -i6;
                }
                if (r6.A0U) {
                    i8 = -i8;
                }
                nestableSnapPickerRecyclerView2.A0u(i8, 0);
            }
        }
    }

    public final void EKg(int i, int i2) {
        int i3;
        int A022 = A02(this);
        if (this.A0B && A022 >= A01()) {
            int i4 = this.A0I;
            i3 = (-((Math.max(this.A0O.A00, 0) / 2) + (i4 / 2))) + (i4 * ((i + (this.A0D ? 1 : 0)) - (A022 - 1)));
        } else if (i2 != i) {
            i3 = this.A0I * (i - i2);
        } else {
            return;
        }
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = this.A0P;
        if (this.A0U) {
            i3 = -i3;
        }
        nestableSnapPickerRecyclerView.A0u(i3, 0);
    }

    public final void DBT(View view) {
        A06(this);
    }

    public AnonymousClass8AL(Context context, View view, AnonymousClass07Z r19, GalleryPickerServiceDataSource galleryPickerServiceDataSource, UserSession userSession, C357638Yz r22, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8AH r24, X3Z x3z, AnonymousClass8AK r26, C3504884v r27, AnonymousClass825 r28, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        View view2 = view;
        AnonymousClass8AP r3 = new AnonymousClass8AP(this);
        this.A0X = r3;
        Context context2 = context;
        this.A0W = context2;
        UserSession userSession2 = userSession;
        this.A0L = userSession2;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        this.A0I = dimensionPixelSize;
        AnonymousClass8AQ r9 = new AnonymousClass8AQ(targetViewSizeProvider, 0nA.A09(context2), dimensionPixelSize);
        this.A0Z = r9;
        this.A0a = z;
        this.A0E = i;
        X3Z x3z2 = x3z;
        this.A0D = x3z != null;
        this.A0U = 0mk.A02(context2);
        this.A0Y = r26;
        C357638Yz r4 = r22;
        this.A0M = r4;
        view2 = view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2;
        this.A0J = view2;
        NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = (NestableSnapPickerRecyclerView) view2.requireViewById(R.id.recyclerview);
        this.A0P = nestableSnapPickerRecyclerView;
        this.A0N = new AnonymousClass8AR(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2, 0, false);
        this.A0K = linearLayoutManager;
        linearLayoutManager.A0v(true);
        int i3 = r9.A00;
        if (i3 == 0) {
            TargetViewSizeProvider targetViewSizeProvider2 = r9.A03;
            if (targetViewSizeProvider2 != null) {
                i2 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K.getWidth();
            } else {
                i2 = r9.A01;
            }
            i3 = (i2 - r9.A02) / 2;
            r9.A00 = i3;
        }
        nestableSnapPickerRecyclerView.A11(new AnonymousClass8AS(this, i3));
        nestableSnapPickerRecyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass825 r15 = r28;
        this.A0H = r15;
        this.A0O = new AnonymousClass8AT(galleryPickerServiceDataSource, userSession2, r24, this, r15);
        this.A0T = z2;
        C3504884v r7 = r27;
        this.A0G = r7;
        nestableSnapPickerRecyclerView.setItemAnimator((AnonymousClass3AS) null);
        if (z) {
            AnonymousClass8AY r2 = new AnonymousClass8AY();
            this.A0Q = r2;
            if (this.A0D) {
                x3z2.getClass();
                C14238TsL tsL = new C14238TsL(userSession2, x3z2);
                this.A00 = tsL;
                tsL.A00 = this.A0E;
                r2.A03(tsL, r2.A02.size());
            }
            nestableSnapPickerRecyclerView.setAdapter(r2);
        } else {
            0nA.A0p(nestableSnapPickerRecyclerView, new AnonymousClass8AU(this));
        }
        this.A0S = new AnonymousClass8AV(this);
        this.A0R = new AnonymousClass8AW(this);
        if (r22 != null) {
            r4.A0E(r3);
        }
        this.A0V = z3;
        if (r27 != null) {
            C226292g8.A00(19B.A00, r7.A0c).A06(r19, new C351718Aa(this));
        }
    }
}
