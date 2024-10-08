package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.sliderview.RulerView;
import com.instagram.creation.video.ui.FilmstripScrollView;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.KPj  reason: case insensitive filesystem */
public final class C61870KPj extends C61347K3p implements C41838B2t, MUV, C352278Cs {
    public static final LNE A0Z = new Object();
    public static final String __redex_internal_original_name = "VideoTrimFragment";
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public Animation A0D;
    public LinearLayout A0E;
    public FilmstripScrollView A0F;
    public C378369Pn A0G;
    public ClipInfo A0H;
    public boolean A0I;
    public double[] A0J;
    public double A0K;
    public double A0L;
    public int A0M;
    public int A0N;
    public long A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public Animation A0S;
    public ProgressBar A0T;
    public RulerView A0U;
    public C3499682q A0V;
    public AnonymousClass3Q2 A0W;
    public final Runnable A0X = new C65907M3w(this);
    public final AnonymousClass0eM A0Y = DbS.A0I(new C58683Ivs(this, 3), new C58683Ivs(this, 4), MMY.A00(this, (Object) null, 36), DbS.A0z(C60263JiK.class));

    public final void APo(Bitmap bitmap, int i, int i2) {
        View view;
        0qQ.A0B(bitmap, 0);
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null && linearLayout.hashCode() == i2) {
            LinearLayout linearLayout2 = this.A0E;
            if (linearLayout2 != null) {
                view = linearLayout2.getChildAt(i);
            } else {
                view = null;
            }
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageBitmap(bitmap);
        }
    }

    public final void Dq5(double[] dArr) {
        double d;
        if (this.mView != null) {
            LinearLayout linearLayout = this.A0E;
            if (linearLayout == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (linearLayout.getChildCount() == 0) {
                float f = this.A00;
                int i = this.A07;
                double[] dArr2 = new double[i];
                float f2 = f / 2.0f;
                int length = dArr.length - 1;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i2 + 1;
                    double d2 = dArr[i2];
                    double d3 = (double) f2;
                    if (d2 > d3) {
                        dArr2[i3] = d2;
                    } else {
                        if (d2 <= d3 && d3 <= dArr[i4]) {
                            if (Math.abs(d2 - d3) < Math.abs(dArr[i4] - d3)) {
                                d = dArr[i2];
                            } else {
                                d = dArr[i4];
                            }
                            dArr2[i3] = d;
                        }
                        i2 = i4;
                    }
                    f2 += f;
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i4;
                }
                while (i3 < i) {
                    dArr2[i3] = dArr[length];
                    i3++;
                }
                for (int i5 = 0; i5 < i; i5++) {
                    dArr2[i5] = dArr2[i5] * 1000.0d;
                }
                this.A0J = dArr2;
                this.A0J = dArr2;
                LP1 lp1 = this.A07;
                if (lp1 != null) {
                    lp1.A04 = dArr2;
                    lp1.A00();
                }
                double[] dArr3 = this.A0J;
                if (dArr3 != null) {
                    int length2 = dArr3.length;
                    for (int i6 = 0; i6 < length2; i6++) {
                        ImageView imageView = new ImageView(requireContext());
                        imageView.setBackgroundResource(R.drawable.trim_frame_bg);
                        JTP.A14(imageView, (int) this.A0L, (int) this.A0K);
                        imageView.setPadding(0, 0, 0, 0);
                        LinearLayout linearLayout2 = this.A0E;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(imageView);
                        }
                    }
                }
                A09(this, AnonymousClass05K.A01);
                int A002 = ((int) A00(this)) + (this.A02 * 2);
                int i7 = this.A0N;
                if (A002 < i7) {
                    LinearLayout linearLayout3 = this.A0E;
                    if (linearLayout3 != null) {
                        0nA.A0a(linearLayout3, i7 - A002);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                ClipInfo clipInfo = this.A0H;
                if (clipInfo == null) {
                    0qQ.A0F("clipInfo");
                    throw AnonymousClass00P.createAndThrow();
                }
                double d4 = (double) clipInfo.A08;
                int i8 = clipInfo.A07;
                double d5 = (double) (this.A01 * IgNetworkConsentStorage.MAX_ENTRIES);
                double d6 = (double) this.A03;
                double d7 = ((((((double) i8) * 1.0d) / d5) * d6) - d4) + ((double) this.A02);
                A07(this, (int) Math.min((((((double) (clipInfo.A05 - i8)) * 1.0d) / d5) * d6) + d7, A00(this) + d7));
                A08(this, (int) d7);
                View view = this.A0C;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.A0B;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.import_filmstrip_slide_in_right);
                loadAnimation.setAnimationListener(new LZA(this, d4));
                View view3 = this.A0R;
                if (view3 != null) {
                    view3.startAnimation(loadAnimation);
                }
            }
        } else if (isResumed()) {
            C59689JTv.A0C(C60960kU.A00, "view_is_null");
            DbT.A1J(this);
        }
    }

    public final void DxO(String str) {
    }

    public final void DxW(int i) {
    }

    public final void Dy0() {
    }

    public final void Dy2() {
    }

    public final String getModuleName() {
        return "video_trim";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.A00;
        if (view2 != null) {
            JWN.A04(view2);
            LNE lne = A0Z;
            Context requireContext = requireContext();
            ClipInfo clipInfo = this.A0H;
            if (clipInfo == null) {
                0qQ.A0F("clipInfo");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A0L = lne.A01(requireContext, A0A(), clipInfo);
            this.A0K = (double) JTR.A0R(this).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
            LP1 lp1 = this.A07;
            if (lp1 != null) {
                lp1.A02 = this;
            }
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.post(this.A0X);
                AnonymousClass0eM r1 = this.A0Y;
                if (((C60263JiK) r1.getValue()).A02()) {
                    DbZ.A1C(this, new MGY(this, (AnonymousClass4D7) null, 9), ((C60263JiK) r1.getValue()).A01);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final double A00(C61870KPj kPj) {
        LinearLayout linearLayout = kPj.A0E;
        if (linearLayout != null) {
            return ((double) linearLayout.getChildCount()) * kPj.A0L;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final double A01(C61870KPj kPj) {
        FilmstripScrollView filmstripScrollView = kPj.A0F;
        if (filmstripScrollView != null) {
            double scrollX = ((((double) ((filmstripScrollView.getScrollX() + kPj.A08) - kPj.A02)) * 1.0d) / ((double) kPj.A03)) * ((double) (kPj.A01 * IgNetworkConsentStorage.MAX_ENTRIES));
            ClipInfo clipInfo = kPj.A0H;
            if (clipInfo != null) {
                return Math.max(Math.min(scrollX, (double) clipInfo.A0A), 500.0d);
            }
            0qQ.A0F("clipInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final double A02(C61870KPj kPj) {
        FilmstripScrollView filmstripScrollView = kPj.A0F;
        if (filmstripScrollView != null) {
            double max = Math.max(0.0d, ((((double) ((filmstripScrollView.getScrollX() + kPj.A09) - kPj.A02)) * 1.0d) / ((double) kPj.A03)) * ((double) (kPj.A01 * IgNetworkConsentStorage.MAX_ENTRIES)));
            ClipInfo clipInfo = kPj.A0H;
            if (clipInfo != null) {
                return Math.min(max, ((double) clipInfo.A0A) - 500.0d);
            }
            0qQ.A0F("clipInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A03(int i) {
        View view = this.A0A;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = (i - view.getPaddingLeft()) + this.A0M;
            view.requestLayout();
        }
    }

    private final void A04(int i) {
        ClipInfo clipInfo = this.A0H;
        if (clipInfo == null) {
            0qQ.A0F("clipInfo");
            throw AnonymousClass00P.createAndThrow();
        }
        int i2 = clipInfo.A07;
        if (i < i2) {
            i = i2;
        }
        if (this.mView != null) {
            A03((int) (((A00(this) - ((double) (this.A0M * 2))) * ((double) i)) / ((double) this.A0O)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.Kom] */
    private final void A05(int i, int i2) {
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            double d = this.A0L;
            double d2 = this.A0K;
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                int hashCode = linearLayout.hashCode();
                ? obj = new Object();
                obj.A04 = i;
                obj.A02 = i2;
                obj.A01 = d;
                obj.A00 = d2;
                obj.A03 = hashCode;
                lp1.A02(obj);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A06(C61870KPj kPj) {
        AnonymousClass7TF.A16(kPj.A0A);
        View view = kPj.A0A;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = kPj.A0A;
        if (view2 != null) {
            Animation animation = kPj.A0S;
            if (animation == null) {
                0qQ.A0F("playIndicatorFadeInAnimation");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view2.startAnimation(animation);
            }
        }
    }

    public static final void A07(C61870KPj kPj, int i) {
        ViewGroup.LayoutParams layoutParams;
        Drawable background;
        kPj.A08 = i;
        ProgressBar progressBar = kPj.A0T;
        if (progressBar != null) {
            progressBar.setProgress(i - kPj.A09);
        }
        View view = kPj.A0C;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams != null) {
            int i2 = kPj.A08;
            View view2 = kPj.A0C;
            if (view2 == null || (background = view2.getBackground()) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            marginLayoutParams.leftMargin = i2 - (background.getIntrinsicWidth() / 2);
        }
        View view3 = kPj.A0C;
        if (view3 != null) {
            view3.requestLayout();
        }
        View view4 = kPj.A0Q;
        if (!(view4 == null || (layoutParams = view4.getLayoutParams()) == null)) {
            FilmstripScrollView filmstripScrollView = kPj.A0F;
            if (filmstripScrollView != null) {
                layoutParams.width = filmstripScrollView.getWidth() - kPj.A08;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        View view5 = kPj.A0Q;
        if (view5 != null) {
            view5.requestLayout();
        }
        FilmstripScrollView filmstripScrollView2 = kPj.A0F;
        if (filmstripScrollView2 != null) {
            filmstripScrollView2.invalidate();
        }
    }

    public static final void A08(C61870KPj kPj, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Drawable background;
        kPj.A09 = i;
        FilmstripScrollView filmstripScrollView = kPj.A0F;
        if (filmstripScrollView != null) {
            kPj.A03((filmstripScrollView.getScrollX() + kPj.A09) - kPj.A02);
            ProgressBar progressBar = kPj.A0T;
            if (progressBar != null) {
                progressBar.setMax(kPj.A0N - kPj.A09);
                ProgressBar progressBar2 = kPj.A0T;
                if (progressBar2 != null) {
                    progressBar2.setProgress(kPj.A08 - kPj.A09);
                }
                ProgressBar progressBar3 = kPj.A0T;
                ViewGroup.LayoutParams layoutParams3 = null;
                if (progressBar3 != null) {
                    layoutParams = progressBar3.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = kPj.A09;
                }
                View view = kPj.A0B;
                if (view != null) {
                    layoutParams3 = view.getLayoutParams();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                if (marginLayoutParams2 != null) {
                    int i2 = kPj.A09;
                    View view2 = kPj.A0B;
                    if (view2 == null || (background = view2.getBackground()) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    marginLayoutParams2.leftMargin = i2 - (background.getIntrinsicWidth() / 2);
                }
                View view3 = kPj.A0B;
                if (view3 != null) {
                    view3.requestLayout();
                }
                View view4 = kPj.A0P;
                if (!(view4 == null || (layoutParams2 = view4.getLayoutParams()) == null)) {
                    layoutParams2.width = kPj.A09;
                }
                View view5 = kPj.A0P;
                if (view5 != null) {
                    view5.requestLayout();
                }
                FilmstripScrollView filmstripScrollView2 = kPj.A0F;
                if (filmstripScrollView2 != null) {
                    filmstripScrollView2.invalidate();
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public static final void A09(C61870KPj kPj, Integer num) {
        LP1 lp1 = kPj.A07;
        if (lp1 != null) {
            lp1.A00();
        }
        LinearLayout linearLayout = kPj.A0E;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            FilmstripScrollView filmstripScrollView = kPj.A0F;
            if (filmstripScrollView != null) {
                int width = ((int) (((double) filmstripScrollView.getWidth()) / kPj.A0L)) + 1;
                FilmstripScrollView filmstripScrollView2 = kPj.A0F;
                if (filmstripScrollView2 != null) {
                    int scrollX = (int) (((double) filmstripScrollView2.getScrollX()) / kPj.A0L);
                    int i = childCount - 1;
                    int min = Math.min(i, (scrollX + width) - 1);
                    int max = Math.max(0, scrollX - width);
                    int max2 = Math.max(0, scrollX - 1);
                    int min2 = Math.min(min + 1, i);
                    int min3 = Math.min(width + min, i);
                    kPj.A05(scrollX, min);
                    if (num == AnonymousClass05K.A01) {
                        kPj.A05(min2, min3);
                        kPj.A05(max2, max);
                        return;
                    }
                    kPj.A05(max2, max);
                    kPj.A05(min2, min3);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void DyY() {
        View view = this.A0A;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.A0A;
        if (view2 != null) {
            Animation animation = this.A0D;
            if (animation == null) {
                0qQ.A0F("playIndicatorFadeOutAnimation");
                throw AnonymousClass00P.createAndThrow();
            } else {
                view2.startAnimation(animation);
            }
        }
    }

    public final void DyQ() {
        A06(this);
        ClipInfo clipInfo = this.A0H;
        if (clipInfo == null) {
            0qQ.A0F("clipInfo");
            throw AnonymousClass00P.createAndThrow();
        } else {
            A04(clipInfo.A07);
        }
    }

    public final AnonymousClass0wW getSession() {
        return A0A();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(986663679);
        C61870KPj.super.onCreate(bundle);
        this.A0V = JTR.A0k(0mE.A01(requireContext(), C267844cJ.class));
        UserSession CCy = ((C267854cK) 0mE.A01(requireContext(), C267854cK.class)).CCy();
        0qQ.A0B(CCy, 0);
        this.A01 = CCy;
        setModuleNameV2("video_trim");
        this.A0S = AnimationUtils.loadAnimation(requireContext(), R.anim.import_play_fade_in);
        this.A0D = AnimationUtils.loadAnimation(requireContext(), R.anim.import_play_fade_out);
        this.A0M = JTP.A04(DbV.A05(this));
        AnonymousClass0fD.A09(579643463, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ea, code lost:
        if (r12.A0W == null) goto L_0x01ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = 1342957617(0x500be831, float:9.3889997E9)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r2 = 0
            X.0qQ.A0B(r13, r2)
            X.C61870KPj.super.onCreateView(r13, r14, r15)
            X.3Q2 r1 = X.JTT.A0e(r12)
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L_0x01f4
            r12.A0W = r1
            java.lang.String r11 = "pendingMedia"
            r5 = 0
            com.instagram.pendingmedia.model.ClipInfo r3 = r1.A1N
            r12.A0H = r3
            java.lang.String r10 = "clipInfo"
            if (r3 == 0) goto L_0x01e0
            int r0 = r3.A08
            r12.A06 = r0
            int r0 = r3.A07
            r12.A05 = r0
            int r0 = r3.A05
            r12.A04 = r0
            long r0 = r3.A0A
            r12.A0O = r0
            com.instagram.common.session.UserSession r0 = r12.A0A()
            int r0 = X.LNE.A00(r0, r3)
            r12.A01 = r0
            com.instagram.pendingmedia.model.ClipInfo r7 = r12.A0H
            if (r7 == 0) goto L_0x01e0
            com.instagram.common.session.UserSession r6 = r12.A0A()
            long r0 = r7.A0A
            float r3 = (float) r0
            int r0 = X.LNE.A00(r6, r7)
            float r0 = (float) r0
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r9
            float r3 = r3 / r0
            r8 = 1090519040(0x41000000, float:8.0)
            int r0 = X.AnonymousClass7TE.A06(r8, r3)
            r12.A07 = r0
            com.instagram.pendingmedia.model.ClipInfo r7 = r12.A0H
            if (r7 == 0) goto L_0x01e0
            com.instagram.common.session.UserSession r6 = r12.A0A()
            long r0 = r7.A0A
            float r3 = (float) r0
            int r0 = X.LNE.A00(r6, r7)
            float r0 = (float) r0
            float r0 = r0 * r9
            float r0 = r3 / r0
            int r0 = X.AnonymousClass7TE.A06(r8, r0)
            float r0 = (float) r0
            float r0 = r0 * r9
            float r3 = r3 / r0
            r12.A00 = r3
            X.LFb r0 = r12.A04
            if (r0 == 0) goto L_0x007b
            X.9Pn r5 = r0.A03
        L_0x007b:
            r12.A0G = r5
            r3 = 1
            if (r5 == 0) goto L_0x0083
            r5.A09(r3)
        L_0x0083:
            android.content.Context r0 = r12.requireContext()
            boolean r10 = X.JWN.A05(r0)
            r0 = 2131625775(0x7f0e072f, float:1.8878767E38)
            if (r10 == 0) goto L_0x0093
            r0 = 2131625773(0x7f0e072d, float:1.8878763E38)
        L_0x0093:
            android.view.View r5 = r13.inflate(r0, r14, r2)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r6 = r12.A06
            if (r6 == 0) goto L_0x01e4
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r6 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r6
            boolean r0 = r6.A04
            if (r0 != r3) goto L_0x01e4
            X.3Q2 r0 = r12.A0W
            if (r0 == 0) goto L_0x01ec
            X.3QG r0 = r0.A1i
            int r2 = r0.A01
            int r1 = r0.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r6.A02
            X.C63122Krq.A00(r0, r2, r1)
        L_0x00b0:
            X.9Pn r0 = r12.A0G
            if (r0 == 0) goto L_0x00ba
            r0.A06(r12)
            r0.A07(r12)
        L_0x00ba:
            r0 = 2131432840(0x7f0b1588, float:1.8487449E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r12.A0E = r0
            int r1 = r12.A01
            r0 = 30
            r9 = 10
            if (r1 > r0) goto L_0x00ce
            r9 = 5
        L_0x00ce:
            X.Lkq r8 = new X.Lkq
            r8.<init>(r9)
            android.content.res.Resources r0 = X.DbV.A05(r12)
            android.util.DisplayMetrics r7 = r0.getDisplayMetrics()
            r0 = 2131442829(0x7f0b3c8d, float:1.8507709E38)
            android.view.View r2 = r5.requireViewById(r0)
            com.instagram.creation.base.ui.sliderview.RulerView r2 = (com.instagram.creation.base.ui.sliderview.RulerView) r2
            r12.A0U = r2
            java.lang.String r6 = "rulerView"
            if (r2 == 0) goto L_0x01dc
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.A01 = r1
            r0 = 0
            r2.A00 = r0
            r2.A02 = r1
            r2.A07 = r9
            r2.A09 = r8
            android.content.res.Resources r1 = X.JTR.A0R(r12)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            r12.A02 = r0
            com.instagram.creation.base.ui.sliderview.RulerView r2 = r12.A0U
            if (r2 == 0) goto L_0x01dc
            r2.A05 = r0
            int r1 = r7.widthPixels
            int r0 = r0 * 2
            int r1 = r1 - r0
            int r0 = r12.A01
            int r1 = r1 / r0
            r2.A03 = r1
            r0 = 2131432844(0x7f0b158c, float:1.8487457E38)
            android.view.View r2 = r5.requireViewById(r0)
            com.instagram.creation.video.ui.FilmstripScrollView r2 = (com.instagram.creation.video.ui.FilmstripScrollView) r2
            r12.A0F = r2
            if (r2 == 0) goto L_0x0127
            X.L16 r0 = new X.L16
            r0.<init>(r12)
            r2.A00 = r0
        L_0x0127:
            r0 = 2131432837(0x7f0b1585, float:1.8487443E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0Q = r0
            r0 = 2131432836(0x7f0b1584, float:1.848744E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0P = r0
            r0 = 2131443233(0x7f0b3e21, float:1.8508528E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0C = r0
            r0 = 2131443232(0x7f0b3e20, float:1.8508526E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0B = r0
            r0 = 2131432843(0x7f0b158b, float:1.8487455E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0A = r0
            r0 = 2131432845(0x7f0b158d, float:1.8487459E38)
            android.view.View r0 = r5.requireViewById(r0)
            r12.A0R = r0
            int r0 = r12.A01
            int r1 = r1 * r0
            r12.A03 = r1
            int r0 = X.JTT.A06(r12)
            r12.A0N = r0
            r0 = 2131443234(0x7f0b3e22, float:1.850853E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r12.A0T = r1
            if (r1 == 0) goto L_0x017a
            int r0 = r12.A03
            r1.setMax(r0)
        L_0x017a:
            if (r10 != 0) goto L_0x0197
            android.view.View r0 = r12.A0R
            if (r0 == 0) goto L_0x0197
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 == 0) goto L_0x0197
            android.content.res.Resources r0 = X.DbV.A05(r12)
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            r0 = 1115947008(0x42840000, float:66.0)
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r1)
            int r0 = (int) r0
            r2.height = r0
        L_0x0197:
            android.content.Context r1 = r12.requireContext()
            X.Jdb r0 = new X.Jdb
            r0.<init>(r12)
            android.view.GestureDetector r3 = new android.view.GestureDetector
            r3.<init>(r1, r0)
            android.content.Context r1 = r12.requireContext()
            X.Jda r0 = new X.Jda
            r0.<init>(r12)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            r2.<init>(r1, r0)
            r0 = 2
            X.LYj r1 = new X.LYj
            r1.<init>(r0, r2, r3, r12)
            android.view.View r0 = r12.A0C
            if (r0 == 0) goto L_0x01c0
            r0.setOnTouchListener(r1)
        L_0x01c0:
            android.view.View r0 = r12.A0Q
            if (r0 == 0) goto L_0x01c7
            r0.setOnTouchListener(r1)
        L_0x01c7:
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x01ce
            r0.setOnTouchListener(r1)
        L_0x01ce:
            android.view.View r0 = r12.A0P
            if (r0 == 0) goto L_0x01d5
            r0.setOnTouchListener(r1)
        L_0x01d5:
            r0 = -1366443196(0xffffffffae8dbb44, float:-6.445203E-11)
            X.AnonymousClass0fD.A09(r0, r4)
            return r5
        L_0x01dc:
            X.0qQ.A0F(r6)
            goto L_0x01ef
        L_0x01e0:
            X.0qQ.A0F(r10)
            goto L_0x01ef
        L_0x01e4:
            X.9Pn r0 = r12.A0G
            if (r0 == 0) goto L_0x00b0
            X.3Q2 r0 = r12.A0W
            if (r0 != 0) goto L_0x00b0
        L_0x01ec:
            X.0qQ.A0F(r11)
        L_0x01ef:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x01f4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 388403864(0x17269298, float:5.382252E-25)
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61870KPj.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-223253481);
        super.onDestroyView();
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            lp1.A02 = null;
            lp1.A04 = null;
            lp1.A00();
        }
        this.A07 = null;
        FilmstripScrollView filmstripScrollView = this.A0F;
        if (filmstripScrollView != null) {
            filmstripScrollView.A00 = null;
            C378369Pn r1 = this.A0G;
            if (r1 != null) {
                r1.A06((C41838B2t) null);
                r1.A0N.clear();
                C378459Pw r0 = r1.A08;
                if (r0 != null) {
                    r0.A0A.clear();
                }
            }
            this.A0G = null;
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.removeCallbacks(this.A0X);
            }
            this.A0E = null;
            this.A0F = null;
            this.A0R = null;
            this.A0Q = null;
            this.A0P = null;
            this.A0A = null;
            View view = this.A0C;
            if (view != null) {
                view.setOnTouchListener((View.OnTouchListener) null);
            }
            this.A0C = null;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setOnTouchListener((View.OnTouchListener) null);
            }
            this.A0B = null;
            this.A0T = null;
            AnonymousClass0fD.A09(1311275998, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(-863457531, A022);
        throw A0y;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2095778849);
        LP1 lp1 = this.A07;
        if (lp1 != null) {
            lp1.A00();
        }
        C61870KPj.super.onPause();
        AnonymousClass0fD.A09(1633896488, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1722916628);
        super.onResume();
        C378379Po r1 = this.A05;
        if (r1 != null) {
            C378369Pn r0 = this.A0G;
            if (r0 != null) {
                r1.A06 = r0;
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A09(1771801817, A022);
                throw A0y;
            }
        }
        if (A00(this) > 0.0d && this.A07 != null) {
            A09(this, AnonymousClass05K.A01);
        }
        AnonymousClass0fD.A09(-89953815, A022);
    }

    public final void Dxn(int i) {
        A04(i);
    }
}
