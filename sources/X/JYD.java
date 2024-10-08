package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.mpfacade.touch.TouchEventForwardingView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class JYD implements MV4, C352908Fn, C3493580b {
    public static final C71392co A0f = C71392co.A03(4.0d, 15.0d);
    public C3497981v A00;
    public C347087wF A01 = C347087wF.A0I;
    public Integer A02 = AnonymousClass05K.A01;
    public boolean A03 = true;
    public final double A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final Context A08;
    public final View A09;
    public final ImageView A0A;
    public final ConstraintLayout A0B;
    public final ConstraintLayout A0C;
    public final GridLayoutManager A0D;
    public final C340297l2 A0E;
    public final AnonymousClass82X A0F;
    public final TouchEventForwardingView A0G;
    public final UserSession A0H;
    public final AnonymousClass4D6 A0I;
    public final C357638Yz A0J;
    public final TargetViewSizeProvider A0K;
    public final AnonymousClass8AL A0L;
    public final C59792JYl A0M;
    public final MultiTouchRecyclerView A0N;
    public final MultiTouchRecyclerView A0O;
    public final C59943Jc9 A0P;
    public final C353278Gz A0Q;
    public final AnonymousClass80U A0R;
    public final LayoutImageView A0S;
    public final ShutterButton A0T;
    public final String A0U;
    public final ArrayList A0V = AnonymousClass7TE.A1C();
    public final Queue A0W = new LinkedList();
    public final Queue A0X = new LinkedList();
    public final AnonymousClass0eM A0Y = AnonymousClass0eN.A01(new MM9(this, 44));
    public final View A0Z;
    public final View A0a;
    public final ViewStub A0b;
    public final C355568Qm A0c;
    public final C352888Fl A0d;
    public final C3495780x A0e;

    private final void A0H(C347087wF r7) {
        A0E(this, false);
        if (!A0J(this)) {
            A0C(this, r7);
        }
        this.A01 = r7;
        GridLayoutManager gridLayoutManager = this.A0D;
        gridLayoutManager.A1v(r7.A00);
        C320806sz r0 = this.A01.A04;
        if (r0 == null) {
            r0 = new C320806sz();
        }
        gridLayoutManager.A01 = r0;
        C63809L7p A012 = A01(this);
        if (A0J(this)) {
            A06(this);
            A0A(this, 0);
        } else {
            int i = (int) A012.A03;
            int i2 = (int) A012.A00;
            MM9 mm9 = new MM9(this, 45);
            this.A03 = false;
            A0G(this, false);
            A0B(this, i, i2);
            11Z.A04(new JYF(this, mm9), 100);
        }
        A0I(A012, A012, false);
    }

    private final C3497981v A00() {
        ViewStub viewStub;
        C3497981v r3 = this.A00;
        if (r3 != null) {
            return r3;
        }
        View findViewById = this.A0a.findViewById(R.id.mid_capture_cancel_button);
        if (findViewById == null && ((viewStub = this.A0b) == null || (findViewById = viewStub.inflate()) == null)) {
            throw AnonymousClass7TE.A0y();
        }
        C3497981v r32 = new C3497981v(findViewById);
        AnonymousClass8GF CrP = r32.CrP();
        CrP.A00 = new C40302AZr(this, 1);
        CrP.A00();
        this.A00 = r32;
        return r32;
    }

    public static final C63809L7p A01(JYD jyd) {
        return jyd.A0P.A04(jyd.A01, jyd.A0M.getItemCount());
    }

    public static final void A02(DialogInterface.OnClickListener onClickListener, JYD jyd) {
        C358248ab A0Y2 = DbS.A0Y(jyd.A08);
        A0Y2.A09(2131964669);
        A0Y2.A08(2131964668);
        A0Y2.A0K(onClickListener, 2131964667);
        A0Y2.A0O((DialogInterface.OnClickListener) null, C358278ae.DEFAULT, 2131964666);
        A0Y2.A04();
        DbT.A1V(A0Y2);
    }

    public static final void A03(Bitmap bitmap, JYD jyd, String str) {
        int A0k;
        CameraAREffect cameraAREffect;
        C62948Kp0 A002;
        C59792JYl jYl = jyd.A0M;
        int itemCount = jYl.getItemCount();
        C59943Jc9 jc9 = jyd.A0P;
        C71492dQ A032 = jc9.A03(jyd.A01, itemCount);
        String str2 = null;
        if (A032 == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("User imported single gallery photo but layoutParams is null. layoutConfiguration=");
            A1A.append(jyd.A01.A05);
            A1A.append(" sectionIndex=");
            A1A.append(itemCount);
            A1A.append(" imagePreviewLayoutParamSize=");
            A1A.append(jc9.A04.size());
            A1A.append(" cameraDestination=");
            C357638Yz r1 = jyd.A0J;
            A1A.append(((C279284yO) r1.A08.A00).A02);
            A1A.append(" isVideoLayout=");
            A1A.append(C357638Yz.A03(C358088aL.A0z, r1));
            0kD.A07("LayoutCaptureController", A1A.toString(), (Throwable) null);
            return;
        }
        String str3 = str;
        if (!(str == null || (A002 = C59737JVv.A00((Context) null, jyd.A0H, str, true)) == null)) {
            str2 = A002.A01();
        }
        C63809L7p A012 = A01(jyd);
        if (str == null) {
            A0k = 1;
            cameraAREffect = jyd.A0F.A05.A09;
        } else {
            A0k = C51967G9n.A0k();
            cameraAREffect = null;
        }
        C63873LAc lAc = new C63873LAc(bitmap, (Matrix) null, A032, new AnonymousClass34S(A0k, cameraAREffect), A012, (C349307zv) null, str3, str2);
        LinkedList linkedList = jYl.A08;
        linkedList.addLast(lAc);
        jYl.notifyItemInserted(linkedList.size() - 1);
        A0D(jyd, A012);
    }

    public static final void A04(View view, AnonymousClass34S r6, JYD jyd) {
        Number number = (Number) r6.A00;
        if (AnonymousClass7TE.A1a(r6.A01)) {
            C294975nL A0A2 = JTP.A0b(view).A0A();
            0qQ.A0A(number);
            float floatValue = number.floatValue();
            A0A2.A0P(floatValue, AnonymousClass7TE.A02(jyd.A0Z) / 2.0f);
            A0A2.A0Q(floatValue, 0.0f);
            A0A2.A0H();
            return;
        }
        float floatValue2 = number.floatValue();
        view.setScaleX(floatValue2);
        view.setScaleY(floatValue2);
        view.setPivotX(AnonymousClass7TE.A02(jyd.A0Z) / 2.0f);
        view.setPivotY(0.0f);
    }

    public static final void A05(C358088aL r8, JYD jyd, int i) {
        String str;
        C358088aL r2 = C358088aL.A10;
        if (r8 == r2) {
            if (!C357638Yz.A03(C358088aL.A0z, jyd.A0J)) {
                return;
            }
        }
        if (r8 == C358088aL.A0U) {
            if (!C357638Yz.A03(C358088aL.A0T, jyd.A0J)) {
                return;
            }
        }
        List list = jyd.A0P.A01;
        int i2 = i;
        if (list.size() <= i) {
            if (r8 == r2) {
                str = "video layout variants";
            } else {
                str = "layout variants";
            }
            0kD.A07("LayoutCaptureController.handleLayoutConfigurationChange", 002.A0y("Assign to ig_camera_experience_formats_android Oncall. cameraTool: ", str, ". index: ", ". getActiveLayoutConfigurations().size: ", i2, list.size()), (Throwable) null);
            return;
        }
        C347087wF r22 = (C347087wF) list.get(i);
        if (r22 != jyd.A01) {
            C340297l2 r1 = jyd.A0E;
            if (r1.CVP()) {
                r1.A07();
            }
            27p.A01(jyd.A0H).A0I();
            jyd.A0H(r22);
        }
    }

    public static final void A06(JYD jyd) {
        C59943Jc9 jc9 = jyd.A0P;
        List A002 = C59943Jc9.A00(jc9, jyd.A01);
        if (A002 != null) {
            int size = A002.size();
            int i = 0;
            while (i < size) {
                LayoutInflater from = LayoutInflater.from(jyd.A08);
                ConstraintLayout constraintLayout = jyd.A0C;
                View inflate = from.inflate(R.layout.layout_flash_overlay, constraintLayout, false);
                C71492dQ A032 = jc9.A03(jyd.A01, i);
                if (A032 != null) {
                    inflate.setLayoutParams(A032);
                    inflate.setBackgroundColor(-1291845632);
                    inflate.setVisibility(0);
                    constraintLayout.addView(inflate);
                    jyd.A0V.add(inflate);
                    i++;
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.JYD r6) {
        /*
            X.JYl r2 = r6.A0M
            int r1 = r2.getItemCount()
            X.Jc9 r5 = r6.A0P
            X.7wF r0 = r6.A01
            r3 = 0
            java.util.List r0 = X.C59943Jc9.A00(r5, r0)
            if (r0 == 0) goto L_0x007a
            int r0 = r0.size()
            r4 = 1
            if (r1 != r0) goto L_0x006b
            X.7wF r1 = r6.A01
            int r0 = r2.getItemCount()
            int r0 = r0 - r4
            X.L7p r1 = r5.A04(r1, r0)
            boolean r0 = A0J(r6)
            if (r0 == 0) goto L_0x0031
            int r0 = r2.getItemCount()
            int r0 = r0 - r4
        L_0x002e:
            A0A(r6, r0)
        L_0x0031:
            A0G(r6, r4)
            X.L7p r0 = A01(r6)
            r6.A0I(r1, r0, r4)
            int r0 = r2.getItemCount()
            if (r0 == 0) goto L_0x004c
            int r1 = r2.getItemCount()
            X.7wF r0 = r6.A01
            int r0 = r0.A03
            int r0 = r0 - r4
            if (r1 != r0) goto L_0x0056
        L_0x004c:
            X.80U r1 = r6.A0R
            X.8SD r0 = new X.8SD
            r0.<init>()
            r1.E3H(r0)
        L_0x0056:
            int r0 = r2.getItemCount()
            if (r0 != 0) goto L_0x0067
            X.8Gz r2 = r6.A0Q
            r1 = -1
            X.05G r0 = r2.A07
            X.JTP.A1W(r0, r1)
            r2.A01(r3)
        L_0x0067:
            A09(r6)
            return
        L_0x006b:
            X.L7p r1 = A01(r6)
            boolean r0 = A0J(r6)
            if (r0 == 0) goto L_0x0031
            int r0 = r2.getItemCount()
            goto L_0x002e
        L_0x007a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYD.A07(X.JYD):void");
    }

    public static final void A08(JYD jyd) {
        jyd.A0T.setVisibility(0);
        jyd.A0C.setVisibility(8);
        jyd.A0N.setVisibility(8);
        jyd.A0B.setVisibility(8);
        jyd.A0A.setVisibility(8);
        A0E(jyd, false);
        AnonymousClass0eM r1 = jyd.A0Y;
        if (((Dialog) r1.getValue()).isShowing()) {
            AnonymousClass7TF.A1N(r1);
        }
    }

    public static final void A09(JYD jyd) {
        jyd.A0T.setMultiCaptureProgress(((float) jyd.A0M.getItemCount()) / ((float) jyd.A01.A03));
    }

    public static final void A0A(JYD jyd, int i) {
        ArrayList arrayList = jyd.A0V;
        int size = arrayList.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
        View view = (View) arrayList.get(i);
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void A0C(JYD jyd, C347087wF r8) {
        View inflate;
        C59943Jc9 jc9 = jyd.A0P;
        0qQ.A0B(r8, 0);
        Object obj = jc9.A03.get(r8);
        if (obj != null) {
            Iterator A1H = C51966G9m.A1H(obj);
            while (A1H.hasNext()) {
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) A1H.next();
                Queue queue = jyd.A0X;
                if (!queue.isEmpty()) {
                    inflate = (View) queue.poll();
                } else {
                    inflate = LayoutInflater.from(jyd.A08).inflate(R.layout.layout_format_section_divider, jyd.A0B, false);
                }
                if (inflate != null) {
                    inflate.setLayoutParams(layoutParams);
                    inflate.setAlpha(0.0f);
                    DbY.A0G(inflate).setDuration(500);
                    jyd.A0B.addView(inflate);
                }
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0D(JYD jyd, C63809L7p l7p) {
        Object obj;
        C59792JYl jYl = jyd.A0M;
        int itemCount = jYl.getItemCount();
        List A002 = C59943Jc9.A00(jyd.A0P, jyd.A01);
        if (A002 != null) {
            int size = A002.size();
            boolean A0J2 = A0J(jyd);
            if (itemCount < size) {
                if (A0J2) {
                    A0A(jyd, jYl.getItemCount());
                }
                jyd.A0I(l7p, A01(jyd), true);
            } else {
                if (A0J2) {
                    Iterator A1G = AnonymousClass7TE.A1G(jyd.A0V);
                    while (A1G.hasNext()) {
                        ((View) AnonymousClass7TF.A0a(A1G)).setVisibility(4);
                    }
                }
                ConstraintLayout constraintLayout = jyd.A0C;
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    if (childAt.getTag(320099960) != null) {
                        constraintLayout.removeView(childAt);
                    }
                }
                AnonymousClass80U r2 = jyd.A0R;
                if (C357638Yz.A03(C358088aL.A0z, jyd.A0J)) {
                    obj = new Object();
                } else {
                    obj = new Object();
                }
                r2.E3H(obj);
                1Av A003 = 1Au.A00(jyd.A0H);
                0s0 r3 = A003.A3l;
                AnonymousClass0YZ[] r22 = 1Av.A8a;
                if (!AnonymousClass7TG.A1a(A003, r3, r22, 19)) {
                    AnonymousClass7TF.A1J(A003, r3, r22, 19, true);
                    Context context = jyd.A08;
                    View inflate = LayoutInflater.from(context).inflate(R.layout.quick_capture_nux_message_box, constraintLayout, false);
                    0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    0nA.A0e(inflate, DbS.A02(context, 52));
                    LY8.A00(inflate.requireViewById(R.id.nux_ok_button), 59, inflate, jyd);
                    DbT.A18(context, DbU.A0G(inflate, R.id.nux_title), 2131964673);
                    DbT.A18(context, DbU.A0G(inflate, R.id.nux_message), 2131964672);
                    constraintLayout.addView(inflate);
                    inflate.setAlpha(0.0f);
                    DbY.A0G(inflate).start();
                }
            }
            A09(jyd);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0E(JYD jyd, boolean z) {
        ConstraintLayout constraintLayout = jyd.A0B;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            jyd.A0X.offer(constraintLayout.getChildAt(i));
        }
        constraintLayout.removeAllViews();
        jyd.A0C.removeAllViews();
        jyd.A0V.clear();
        C59792JYl jYl = jyd.A0M;
        jYl.A09.clear();
        LinkedList linkedList = jYl.A08;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = ((C63873LAc) it.next()).A00;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        linkedList.clear();
        jYl.notifyDataSetChanged();
        C353278Gz r2 = jyd.A0Q;
        JTP.A1W(r2.A07, -1);
        r2.A01(false);
        C340297l2 r0 = jyd.A0E;
        if (z) {
            View view = r0.A0F;
            0qQ.A07(view);
            AnonymousClass8LZ.A02(view, view.getWidth());
            return;
        }
        View view2 = r0.A0F;
        0qQ.A07(view2);
        AnonymousClass8LZ.A00(view2);
    }

    public static final void A0F(JYD jyd, boolean z) {
        jyd.A01 = C347087wF.A0I;
        ShutterButton shutterButton = jyd.A0T;
        shutterButton.setMode(C301685zn.READY_TO_SHOOT);
        jyd.A0C.setVisibility(8);
        jyd.A0N.setVisibility(8);
        jyd.A0B.setVisibility(8);
        jyd.A0A.setVisibility(8);
        if (z) {
            27p.A01(jyd.A0H).A0c();
        }
        shutterButton.setEnabled(true);
    }

    public static final void A0G(JYD jyd, boolean z) {
        View A002 = jyd.A0E.A0H.A00();
        int i = 4;
        if (z) {
            i = 0;
        }
        A002.setVisibility(i);
    }

    private final void A0I(C63809L7p l7p, C63809L7p l7p2, boolean z) {
        float f;
        float f2;
        float f3 = l7p2.A02;
        float f4 = l7p.A03;
        Float valueOf = Float.valueOf(f4);
        float f5 = l7p2.A03;
        Float valueOf2 = Float.valueOf(f5);
        float f6 = l7p.A00;
        Float valueOf3 = Float.valueOf(f6);
        float f7 = l7p2.A00;
        Float valueOf4 = Float.valueOf(f7);
        boolean A032 = C357638Yz.A03(C358088aL.A0z, this.A0J);
        if (z) {
            if (!A032) {
                float f8 = f3 + f7;
                float f9 = (float) this.A07;
                if (f8 < f9) {
                    f2 = 0.0f;
                } else {
                    f2 = f8 - f9;
                }
                f3 -= f2;
                JYG.A01(this.A0C, this, f2);
            }
            if (!A0J(this)) {
                float f10 = l7p2.A01;
                if (valueOf == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (valueOf3 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (valueOf2 == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                } else if (valueOf4 != null) {
                    if (f4 / f6 != f5 / f7) {
                        this.A0T.setEnabled(false);
                    }
                    C294975nL A0A2 = JTP.A0c(this.A0E.A0F, 0).A0E(A0f).A0A();
                    A0A2.A0R(f4, f5);
                    A0A2.A0N(f6, f7);
                    A0A2.A0J(f10);
                    A0A2.A0K(f3);
                    C65724Lye.A00(A0A2, this, 9);
                    TouchEventForwardingView touchEventForwardingView = this.A0G;
                    touchEventForwardingView.setTranslationX(f10);
                    touchEventForwardingView.setTranslationY(f3);
                    0nA.A0g(touchEventForwardingView, (int) f5, (int) f7);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        } else {
            if (!A032) {
                float f11 = f3 + f7;
                float f12 = (float) this.A07;
                if (f11 < f12) {
                    f = 0.0f;
                } else {
                    f = f11 - f12;
                }
                f3 -= f;
                float f13 = -f;
                this.A0C.setTranslationY(f13);
                this.A0N.setTranslationY(f13);
                this.A0B.setTranslationY(f13);
                this.A0A.setTranslationY(f13);
            }
            if (!A0J(this)) {
                float f14 = l7p2.A01;
                View view = this.A0E.A0F;
                view.setTranslationX(f14);
                view.setTranslationY(f3);
                TouchEventForwardingView touchEventForwardingView2 = this.A0G;
                touchEventForwardingView2.setTranslationX(f14);
                touchEventForwardingView2.setTranslationY(f3);
            }
        }
    }

    public static final boolean A0J(JYD jyd) {
        if (!C357638Yz.A03(C358088aL.A0z, jyd.A0J) || jyd.A02 != AnonymousClass05K.A01) {
            return false;
        }
        return true;
    }

    public final void A0K(boolean z) {
        C358088aL r2;
        ImageView imageView;
        int i;
        C358088aL r0;
        C347087wF[] r02;
        C59944JcA jcA;
        C347087wF r03;
        if (!z || this.A0M.getItemCount() == 0) {
            C357638Yz r5 = this.A0J;
            C358088aL r4 = C358088aL.A0z;
            if (C357638Yz.A03(r4, r5)) {
                r2 = C358088aL.A10;
            } else {
                r2 = C358088aL.A0U;
            }
            C347087wF[] r04 = C347077wE.A03;
            ArrayList A1C = AnonymousClass7TE.A1C();
            C358088aL r3 = C358088aL.A10;
            if (r2 != r3) {
                018.A18(A1C, C347077wE.A01);
                r04 = C347077wE.A02;
            }
            018.A18(A1C, r04);
            int size = A1C.size();
            C59943Jc9 jc9 = this.A0P;
            List list = jc9.A01;
            if (size != list.size()) {
                jc9.A02.clear();
                jc9.A03.clear();
                jc9.A04.clear();
                list.clear();
                if (C357638Yz.A03(r4, r5)) {
                    r0 = r3;
                } else {
                    r0 = C358088aL.A0U;
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (r0 == r3) {
                    r02 = C347077wE.A03;
                } else {
                    018.A18(A1C2, C347077wE.A01);
                    r02 = C347077wE.A02;
                }
                018.A18(A1C2, r02);
                Iterator it = A1C2.iterator();
                while (it.hasNext()) {
                    C369378uV r05 = C369378uV.$redex_init_class;
                    switch (((C347087wF) it.next()).ordinal()) {
                        case 0:
                            jc9.A07();
                            continue;
                        case 1:
                            jcA = jc9.A00;
                            r03 = C347087wF.A0E;
                            break;
                        case 2:
                            jc9.A06();
                            continue;
                        case 3:
                            jcA = jc9.A00;
                            r03 = C347087wF.A0D;
                            break;
                        case 4:
                            jc9.A09();
                            continue;
                        case 5:
                            jcA = jc9.A00;
                            r03 = C347087wF.A0B;
                            break;
                        case 6:
                            jc9.A05();
                            continue;
                        case 7:
                            jcA = jc9.A00;
                            r03 = C347087wF.A0A;
                            break;
                        case 8:
                            jc9.A08();
                            continue;
                        case 9:
                            jcA = jc9.A00;
                            r03 = C347087wF.A0C;
                            break;
                        default:
                            0kD.A07("LayoutCaptureController", "Unsupported variant attempted to add", (Throwable) null);
                            continue;
                    }
                    C59943Jc9.A01(jc9, C59944JcA.A00(jcA, r03));
                }
            }
            this.A0C.setVisibility(0);
            this.A0N.setVisibility(0);
            this.A0B.setVisibility(0);
            C340297l2 r8 = this.A0E;
            boolean A1V = AnonymousClass7TF.A1V(r8.A0H.A00);
            int i2 = ((int) this.A06) / 10;
            int i3 = ((int) this.A05) / 10;
            if (A1V) {
                r8.A0L(new K04(this, 8), i2, i3);
            } else {
                Bitmap A0A2 = r8.A0A(i2, i3);
                if (A0A2 != null) {
                    BlurUtil.blurInPlace(A0A2, 6);
                    imageView = this.A0A;
                    imageView.setImageBitmap(A0A2);
                    i = 0;
                } else {
                    imageView = this.A0A;
                    i = 8;
                }
                imageView.setVisibility(i);
            }
            C347087wF r1 = this.A01;
            if (r1 != C347087wF.A0I) {
                A0H(r1);
            }
            if (!C357638Yz.A03(r4, r5)) {
                r3 = C358088aL.A0U;
            }
            A05(r3, this, r5.A04(r3));
            ShutterButton shutterButton = this.A0T;
            shutterButton.setMultiCaptureProgress(0.0f);
            shutterButton.setEnabled(true);
            if (z) {
                AnonymousClass29X r42 = 27p.A01(this.A0H).A0D;
                0Aj A0e2 = AnonymousClass7TE.A0e(r42.A01, "ig_camera_start_session");
                if (A0e2.isSampled()) {
                    JTO.A1T(A0e2, "IG_CAMERA_START_LAYOUT_SESSION");
                    JTO.A1Q(A0e2, "LAYOUT");
                    AnonymousClass283 r22 = r42.A04;
                    JTO.A1S(A0e2, JTP.A0p(r22));
                    AnonymousClass7TE.A1W(A0e2, "camera_position", JTR.A0C(r22));
                    JTQ.A12(A0e2, r42);
                    JTS.A15(r22.A09, A0e2, 1);
                    AnonymousClass7TH.A0U(A0e2);
                    JTO.A1P(28t.A05, A0e2);
                    A0e2.AAJ("search_session_id", r22.A0P);
                    C51965G9l.A1A(C59725JVj.PRE_CAPTURE, A0e2);
                    JTS.A16(A0e2);
                    A0e2.AAJ("discovery_session_id", r22.A0O);
                    AnonymousClass7TG.A1D(A0e2, "nav_chain", DbS.A0k());
                }
            }
        }
    }

    public final C340297l2 Ajh() {
        return this.A0d.A06;
    }

    public final boolean CRJ() {
        C357638Yz r2 = this.A0J;
        if (!C357638Yz.A03(C358088aL.A0T, r2)) {
            return C357638Yz.A03(C358088aL.A0z, r2);
        }
        return true;
    }

    public final boolean CRZ() {
        AnonymousClass80V Atr = this.A0R.Atr();
        C369378uV r0 = C369378uV.$redex_init_class;
        int ordinal = Atr.ordinal();
        if (ordinal == 48 || ordinal == 52 || ordinal == 8) {
            return true;
        }
        return false;
    }

    public final boolean CeF() {
        return this.A0d.CeF();
    }

    public final void DC8() {
        this.A0N.A00 = false;
    }

    public final void DWx(String str) {
        11Z.A02(new C65864M2f(this));
    }

    public final void DWy(C352218Cl r2) {
        this.A0d.DWy(r2);
        11Z.A02(new C65865M2g(this));
    }

    public final void DmR(C249703kE r3) {
        this.A0N.A00 = true;
        this.A0c.A07(r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r8 == r5) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void Dmx(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            X.80V r8 = (X.AnonymousClass80V) r8
            r2 = 1
            X.0qQ.A0B(r8, r2)
            X.80V r5 = X.AnonymousClass80V.LAYOUT_COMPLETE
            r4 = 1
            r3 = 0
            r6.A03 = r2
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_CAPTURE
            if (r8 == r0) goto L_0x001f
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_RECORDING
            if (r8 == r0) goto L_0x001f
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_COMPLETE
            if (r8 == r0) goto L_0x001f
            X.80V r0 = X.AnonymousClass80V.LAYOUT_CAPTURE
            if (r8 == r0) goto L_0x001f
            r1 = 0
            if (r8 != r5) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r6.A0T
            r0.A0H = r1
            X.8uV r0 = X.C369378uV.$redex_init_class
            int r0 = r8.ordinal()
            switch(r0) {
                case 2: goto L_0x006b;
                case 3: goto L_0x006b;
                case 11: goto L_0x0085;
                case 47: goto L_0x002e;
                case 48: goto L_0x003e;
                case 50: goto L_0x0036;
                case 51: goto L_0x0036;
                case 52: goto L_0x003e;
                default: goto L_0x002d;
            }
        L_0x002d:
            return
        L_0x002e:
            X.81v r0 = r6.A00()
            r0.Eql(r2, r3)
            return
        L_0x0036:
            X.81v r0 = r6.A00()
            r0.Eql(r3, r3)
            return
        L_0x003e:
            X.8AL r0 = r6.A0L
            r0.A0B(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r1 = 0
            X.JYG.A01(r0, r6, r1)
            X.7l2 r0 = r6.A0E
            android.view.View r0 = r0.A0F
            r0.setX(r1)
            r0.setY(r1)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r0 = r6.A0G
            r0.setX(r1)
            r0.setY(r1)
            X.81v r1 = r6.A00()
            X.80V r0 = X.AnonymousClass80V.VIDEO_LAYOUT_COMPLETE
            if (r8 != r0) goto L_0x0064
            r4 = 0
        L_0x0064:
            r1.Eql(r4, r3)
            A0G(r6, r3)
            return
        L_0x006b:
            X.81v r0 = r6.A00()
            r0.Eql(r3, r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0B
            r0.setVisibility(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r0.setVisibility(r3)
            com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView r0 = r6.A0N
            X.AnonymousClass7TG.A1A(r0, r3)
            A0G(r6, r2)
            return
        L_0x0085:
            X.81v r0 = r6.A00()
            r0.Eql(r3, r3)
            float r0 = r6.A06
            int r1 = (int) r0
            float r0 = r6.A05
            int r0 = (int) r0
            A0B(r6, r1, r0)
            com.instagram.common.session.UserSession r0 = r6.A0H
            X.27r r0 = X.27p.A01(r0)
            r0.A0c()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0B
            r1 = 8
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r0.setVisibility(r1)
            com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView r0 = r6.A0N
            X.AnonymousClass7TE.A1U(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYD.Dmx(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public static final void A0B(JYD jyd, int i, int i2) {
        if (A0J(jyd)) {
            i = (int) jyd.A06;
            i2 = (int) jyd.A05;
        }
        View view = jyd.A0E.A0F;
        0qQ.A07(view);
        0nA.A0g(view, i, i2);
        0nA.A0g(jyd.A0G, i, i2);
    }

    public final void A0L(boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        A0E(this, z3);
        ImageView imageView = this.A0A;
        Drawable drawable = imageView.getDrawable();
        if (!(drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null)) {
            bitmap.recycle();
        }
        imageView.setImageBitmap((Bitmap) null);
        if (z2) {
            JYG.A01(this.A0C, this, 0.0f);
            View view = this.A0E.A0F;
            view.setX(0.0f);
            view.setY(0.0f);
            TouchEventForwardingView touchEventForwardingView = this.A0G;
            touchEventForwardingView.setX(0.0f);
            touchEventForwardingView.setY(0.0f);
            GA1 ga1 = new GA1(23, this, z);
            this.A03 = false;
            A0G(this, false);
            A0B(this, (int) this.A06, (int) this.A05);
            11Z.A04(new JYF(this, ga1), 100);
            return;
        }
        A0F(this, z);
    }

    public JYD(Context context, View view, Fragment fragment, C340297l2 r28, AnonymousClass82X r29, TouchEventForwardingView touchEventForwardingView, UserSession userSession, AnonymousClass4D6 r32, C71662eb r33, C357638Yz r34, TargetViewSizeProvider targetViewSizeProvider, C352888Fl r36, AnonymousClass8AL r37, AnonymousClass80U r38, C3495780x r39, ShutterButton shutterButton, String str) {
        double d;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass80U r6 = r38;
        Context context2 = context;
        AnonymousClass7TF.A1D(context2, 2, r6);
        C357638Yz r8 = r34;
        AnonymousClass8AL r1 = r37;
        AnonymousClass82X r16 = r29;
        AnonymousClass4D6 r9 = r32;
        C51974G9v.A1Q(r16, r1, r8, r9);
        ShutterButton shutterButton2 = shutterButton;
        C3495780x r5 = r39;
        TouchEventForwardingView touchEventForwardingView2 = touchEventForwardingView;
        View view2 = view;
        C51974G9v.A1R(view2, touchEventForwardingView2, shutterButton2, r5);
        0qQ.A0B(targetViewSizeProvider2, 15);
        Fragment fragment2 = fragment;
        C71662eb r22 = r33;
        C51969G9p.A1S(r22, 16, fragment2);
        this.A0H = userSession2;
        this.A08 = context2;
        this.A0U = str;
        this.A0R = r6;
        this.A0d = r36;
        C340297l2 r23 = r28;
        this.A0E = r23;
        this.A0F = r16;
        this.A0L = r1;
        this.A0J = r8;
        this.A0I = r9;
        this.A0a = view2;
        this.A0G = touchEventForwardingView2;
        this.A0T = shutterButton2;
        this.A0e = r5;
        this.A0K = targetViewSizeProvider2;
        View A0F2 = DbY.A0F(view2, R.id.layout_format_capture_container_stub);
        0qQ.A0C(A0F2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.A0C = (ConstraintLayout) A0F2;
        FragmentActivity fragmentActivity = this.A08;
        0qQ.A0C(fragmentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C59792JYl jYl = new C59792JYl(fragment2, fragmentActivity, userSession2, this, new MBH(this, 3));
        this.A0M = jYl;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context2, this.A01.A00);
        this.A0D = gridLayoutManager;
        MultiTouchRecyclerView multiTouchRecyclerView = (MultiTouchRecyclerView) r22.A01();
        multiTouchRecyclerView.setLayoutManager(gridLayoutManager);
        multiTouchRecyclerView.setAdapter(jYl);
        this.A0N = multiTouchRecyclerView;
        C355568Qm r0 = new C355568Qm(new C59942Jc6(jYl));
        this.A0c = r0;
        r0.A0A(multiTouchRecyclerView);
        AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K;
        float height = (float) r12.getHeight();
        this.A05 = height;
        float width = (float) r12.getWidth();
        this.A06 = width;
        if (AnonymousClass0Ke.A00(context2) >= 2016) {
            d = 1.0d;
        } else {
            d = 1.333d;
        }
        this.A04 = d;
        View A0V2 = JTR.A0V(view2, R.id.layout_camera_preview_animation_stub);
        0qQ.A0C(A0V2, "null cannot be cast to non-null type com.instagram.creation.photo.crop.LayoutImageView");
        this.A0S = (LayoutImageView) A0V2;
        this.A0b = DbS.A0F(view2, R.id.layout_capture_cancel_button_stub);
        int[] iArr = new int[2];
        shutterButton2.getLocationOnScreen(iArr);
        this.A07 = iArr[1];
        this.A0Z = view2.requireViewById(R.id.camera_stub_constraint_layout);
        this.A0B = (ConstraintLayout) view2.requireViewById(R.id.layout_format_divider_container);
        this.A09 = view2.requireViewById(R.id.layout_format_capture_container);
        this.A0O = (MultiTouchRecyclerView) view2.requireViewById(R.id.layout_format_capture_recycler_view);
        View A0V3 = JTR.A0V(view2, R.id.layout_format_capture_blurred_background_stub);
        0qQ.A0C(A0V3, "null cannot be cast to non-null type android.widget.ImageView");
        this.A0A = (ImageView) A0V3;
        this.A0P = new C59943Jc9(context2, width, height);
        C358088aL r02 = C358088aL.A0U;
        C357638Yz.A00(r02, r8).A01(new C59736JVu(this, 3));
        C358088aL r2 = C358088aL.A0q;
        C357638Yz.A00(r2, r8).A01(new C59736JVu(this, 4));
        C358088aL r24 = C358088aL.A10;
        C357638Yz.A00(r24, r8).A01(new C59736JVu(this, 5));
        r6.A7w(this);
        C353278Gz A002 = new 2YN(fragment2).A00(C353278Gz.class);
        this.A0Q = A002;
        DbZ.A1C(fragment2, new C66163MGa(this, (AnonymousClass4D7) null, 36), 0u9.A04(A002.A04));
        Dba.A16(fragment2, r5.A03, new C66309MMs(this, 24), 64);
        View view3 = r23.A0F;
        0qQ.A07(view3);
        view3.setOutlineProvider((ViewOutlineProvider) null);
        view3.setClipToOutline(false);
    }
}
