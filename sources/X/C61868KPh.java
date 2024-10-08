package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.KPh  reason: case insensitive filesystem */
public final class C61868KPh extends C61347K3p implements SeekBar.OnSeekBarChangeListener, C13825Thv, B28, MUV {
    public static final String __redex_internal_original_name = "VideoCoverFragment";
    public double A00;
    public float A01;
    public int A02;
    public View A03;
    public LinearLayout A04;
    public SeekBar A05;
    public C59986Jcv A06;
    public ClipInfo A07;
    public AnonymousClass3Q2 A08;
    public C8826RBc A09;
    public double A0A;
    public double[] A0B;
    public final Handler A0C = new Handler(Looper.getMainLooper(), new W6B(this, 4));
    public final Runnable A0D = new C65899M3o(this);
    public final C64698LgT A0E = C64698LgT.A00(this, 56);

    public final void APo(Bitmap bitmap, int i, int i2) {
        0qQ.A0B(bitmap, 0);
        LinearLayout linearLayout = this.A04;
        if (linearLayout == null) {
            throw AnonymousClass7TE.A0y();
        } else if (linearLayout.hashCode() == i2) {
            LinearLayout linearLayout2 = this.A04;
            0qQ.A0A(linearLayout2);
            View childAt = linearLayout2.getChildAt(i);
            0qQ.A0C(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) childAt;
            imageView.setImageBitmap(bitmap);
            imageView.setImageAlpha(128);
        }
    }

    public final void Ddj(AnonymousClass9RG r13, AnonymousClass9R7 r14) {
        float f = JWE.A03(JTU.A0L(requireActivity())).A00;
        UserSession A0A2 = A0A();
        Context requireContext = requireContext();
        AnonymousClass3Q2 A0e = JTT.A0e(this);
        if (A0e != null) {
            this.A09 = new C8826RBc(requireContext, A0A2, r13, r14, this, new C65828M0u(requireContext(), A0A(), A0e, f), requireArguments().getBoolean("VideoCoverFragmentBase.SAVE_AND_FINISH", false));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String getModuleName() {
        return "video_scrubber";
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.A00;
        if (view2 != null) {
            JWN.A04(view2);
            int i = 0;
            view.requireViewById(R.id.filmstrip_keyframes_holder_shadow).setVisibility(0);
            DbT.A1B(DbV.A05(this), view.requireViewById(R.id.filmstrip_keyframes_holder).getLayoutParams(), R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            C63955LFb lFb = this.A04;
            if (lFb != null) {
                lFb.A01(this);
                C63955LFb lFb2 = this.A04;
                if (lFb2 != null) {
                    this.A03 = lFb2.A00();
                    this.A01 = JWE.A03(JTU.A0L(requireContext())).A00;
                    this.A04 = (LinearLayout) view.requireViewById(R.id.filmstrip_keyframes_holder);
                    View view3 = this.A00;
                    0qQ.A0A(view3);
                    View requireViewById = view3.requireViewById(R.id.seek_frame_indicator);
                    this.A03 = requireViewById;
                    0qQ.A0A(requireViewById);
                    requireViewById.setVisibility(0);
                    SeekBar seekBar = (SeekBar) view.requireViewById(R.id.scrubber_seekbar);
                    this.A05 = seekBar;
                    0qQ.A0A(seekBar);
                    seekBar.setOnSeekBarChangeListener(this);
                    ClipInfo clipInfo = this.A07;
                    0qQ.A0A(clipInfo);
                    if (JTO.A09(clipInfo) > 0) {
                        int i2 = this.A02;
                        ClipInfo clipInfo2 = this.A07;
                        0qQ.A0A(clipInfo2);
                        ClipInfo clipInfo3 = this.A07;
                        0qQ.A0A(clipInfo3);
                        i = ((i2 - clipInfo2.A07) * 100) / JTO.A09(clipInfo3);
                    }
                    SeekBar seekBar2 = this.A05;
                    0qQ.A0A(seekBar2);
                    seekBar2.setProgress(i);
                    this.A06 = new C59986Jcv(JTR.A0R(this));
                    SeekBar seekBar3 = this.A05;
                    0qQ.A0A(seekBar3);
                    int i3 = seekBar3.getLayoutParams().height;
                    C59986Jcv jcv = this.A06;
                    0qQ.A0A(jcv);
                    jcv.A06 = i3;
                    jcv.A03 = i3;
                    SeekBar seekBar4 = this.A05;
                    0qQ.A0A(seekBar4);
                    seekBar4.setThumb(this.A06);
                    C267834cI requireActivity = requireActivity();
                    0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider");
                    requireActivity.EBv(new C65901M3q(this));
                    this.A00 = ((double) JTT.A06(this)) / 7.5d;
                    this.A0A = (double) JTR.A0R(this).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                    LP1 lp1 = this.A07;
                    if (lp1 != null) {
                        lp1.A02 = this;
                        LinearLayout linearLayout = this.A04;
                        if (linearLayout != null) {
                            linearLayout.post(this.A0D);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    View view4 = this.A00;
                    if (view4 != null) {
                        JWN.A04(view4);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.Kom] */
    private final void A00() {
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            lp1.A00();
            LinearLayout linearLayout = this.A04;
            if (linearLayout != null) {
                int childCount = linearLayout.getChildCount();
                LP1 lp12 = this.A07;
                0qQ.A0A(lp12);
                int i = childCount - 1;
                double d = this.A00;
                double d2 = this.A0A;
                LinearLayout linearLayout2 = this.A04;
                if (linearLayout2 != null) {
                    int hashCode = linearLayout2.hashCode();
                    ? obj = new Object();
                    obj.A04 = 0;
                    obj.A02 = i;
                    obj.A01 = d;
                    obj.A00 = d2;
                    obj.A03 = hashCode;
                    lp12.A02(obj);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void CLS() {
        this.A0C.sendEmptyMessage(5);
    }

    public final void DYn() {
        this.A0C.post(new C65900M3p(this));
    }

    public final void Ddk() {
        C8826RBc rBc = this.A09;
        if (rBc != null) {
            rBc.A0D = true;
        }
        this.A09 = null;
    }

    public final void Dq5(double[] dArr) {
        LP1 lp1 = this.A07;
        if (this.mView != null) {
            LinearLayout linearLayout = this.A04;
            if (linearLayout == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (linearLayout.getChildCount() == 0 && lp1 != null) {
                LinearLayout linearLayout2 = this.A04;
                if (linearLayout2 != null) {
                    int width = ((int) (((double) linearLayout2.getWidth()) / this.A00)) + 1;
                    ClipInfo clipInfo = this.A07;
                    0qQ.A0A(clipInfo);
                    int i = clipInfo.A07;
                    ClipInfo clipInfo2 = this.A07;
                    0qQ.A0A(clipInfo2);
                    long j = (long) ((clipInfo2.A05 - i) / width);
                    double[] dArr2 = new double[width];
                    for (int i2 = 0; i2 < width; i2++) {
                        dArr2[i2] = (double) (((long) i) + (((long) i2) * j));
                    }
                    this.A0B = dArr2;
                    lp1.A04 = dArr2;
                    lp1.A00();
                    Context requireContext = requireContext();
                    double[] dArr3 = this.A0B;
                    0qQ.A0A(dArr3);
                    int length = dArr3.length;
                    int i3 = 0;
                    while (i3 < length) {
                        ImageView imageView = new ImageView(requireContext);
                        Drawable drawable = requireContext.getDrawable(R.drawable.trim_frame_bg);
                        if (drawable != null) {
                            DbX.A11(requireContext, drawable, R.color.grey_2);
                            imageView.setBackground(drawable);
                            JTP.A14(imageView, (int) this.A00, (int) this.A0A);
                            imageView.setPadding(0, 0, 0, 0);
                            LinearLayout linearLayout3 = this.A04;
                            0qQ.A0A(linearLayout3);
                            linearLayout3.addView(imageView);
                            i3++;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    A00();
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final void EK8() {
        ConstrainedTextureView constrainedTextureView = this.A03;
        if (constrainedTextureView != null) {
            Bitmap bitmap = constrainedTextureView.getBitmap();
            ConstrainedTextureView constrainedTextureView2 = this.A03;
            0qQ.A0A(constrainedTextureView2);
            Matrix transform = constrainedTextureView2.getTransform((Matrix) null);
            0qQ.A07(transform);
            this.A0C.postAtFrontOfQueue(new C66033M8s(bitmap, transform, this));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void Eub() {
        this.A0C.sendEmptyMessage(6);
    }

    public final void FLP() {
        this.A0C.postDelayed(new C65903M3s(this), 50);
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C8826RBc rBc;
        if (z && (rBc = this.A09) != null) {
            ClipInfo clipInfo = this.A07;
            0qQ.A0A(clipInfo);
            int i2 = clipInfo.A07;
            ClipInfo clipInfo2 = this.A07;
            0qQ.A0A(clipInfo2);
            int A092 = i2 + ((JTO.A09(clipInfo2) * i) / 100);
            this.A02 = A092;
            rBc.A0A(A092);
            AnonymousClass3Q2 A0e = JTT.A0e(this);
            if (A0e != null) {
                A0e.A05 = this.A02;
                A0e.A5L = true;
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final AnonymousClass0wW getSession() {
        return A0A();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1372858377);
        C61868KPh.super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        0qQ.A0B(A0U, 0);
        this.A01 = A0U;
        setModuleNameV2("video_scrubber");
        JWB.A00(this, A0A());
        AnonymousClass0fD.A09(-1276991601, A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = -1636003731(0xffffffff9e7c906d, float:-1.33706355E-20)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.C61868KPh.super.onCreateView(r7, r8, r9)
            X.3Q2 r1 = X.JTT.A0e(r6)
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x0074
            r6.A08 = r1
            java.lang.String r5 = "pendingMedia"
            com.instagram.pendingmedia.model.ClipInfo r4 = r1.A1N
            r6.A07 = r4
            if (r4 == 0) goto L_0x006c
            int r0 = r1.A05
            int r1 = r6.A02
            if (r1 != 0) goto L_0x002b
            if (r1 == r0) goto L_0x002b
            r6.A02 = r0
            r1 = r0
        L_0x002b:
            X.0qQ.A0A(r4)
            int r0 = r4.A07
            if (r1 >= r0) goto L_0x0047
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A07
            X.0qQ.A0A(r0)
            int r0 = r0.A07
        L_0x0039:
            r6.A02 = r0
        L_0x003b:
            X.3Q2 r1 = r6.A08
            if (r1 != 0) goto L_0x005a
            X.0qQ.A0F(r5)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0047:
            int r1 = r6.A02
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A07
            X.0qQ.A0A(r0)
            int r0 = r0.A05
            if (r1 <= r0) goto L_0x003b
            com.instagram.pendingmedia.model.ClipInfo r0 = r6.A07
            X.0qQ.A0A(r0)
            int r0 = r0.A05
            goto L_0x0039
        L_0x005a:
            int r0 = r6.A02
            r1.A05 = r0
            r0 = 2131625767(0x7f0e0727, float:1.8878751E38)
            android.view.View r1 = r7.inflate(r0, r8, r3)
            r0 = 1128104820(0x433d8374, float:189.51349)
            X.AnonymousClass0fD.A09(r0, r2)
            return r1
        L_0x006c:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -839187376(0xffffffffcdfb0450, float:-5.2642048E8)
            goto L_0x007b
        L_0x0074:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1686284651(0xffffffff9b7d5695, float:-2.0955646E-22)
        L_0x007b:
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61868KPh.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-194994998);
        super.onDestroy();
        this.A0C.removeCallbacksAndMessages((Object) null);
        AnonymousClass0fD.A09(-586954709, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(384772904);
        super.onDestroyView();
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            linearLayout.removeCallbacks(this.A0D);
        }
        this.A04 = null;
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            lp1.A02 = null;
            lp1.A04 = null;
            lp1.A00();
        }
        this.A07 = null;
        this.A06 = null;
        this.A03 = null;
        this.A03 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(935545386, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1789040774);
        C61868KPh.super.onPause();
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            lp1.A00();
        }
        AnonymousClass1Nd.A00(A0A()).A02(this.A0E, C64632LfK.class);
        AnonymousClass0fD.A09(-1512561829, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(185230207);
        super.onResume();
        C378379Po r0 = this.A05;
        if (r0 != null) {
            r0.A06 = this;
            if (!requireArguments().getBoolean("VideoCoverFragmentBase.SAVE_AND_FINISH", false)) {
                AnonymousClass1Nd.A00(A0A()).A01(this.A0E, C64632LfK.class);
            }
            LinearLayout linearLayout = this.A04;
            if (linearLayout != null) {
                if (((double) linearLayout.getChildCount()) * this.A00 > 0.0d && this.A07 != null) {
                    A00();
                }
                AnonymousClass0fD.A09(-877610039, A022);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-1124771070, A022);
        throw A0y;
    }
}
