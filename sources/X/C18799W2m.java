package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.SpritesheetInfo;
import org.webrtc.CameraCapturer;

/* renamed from: X.W2m  reason: case insensitive filesystem */
public final class C18799W2m {
    public IgImageView A00;
    public U1Z A01;
    public float A02 = -1.0f;
    public int A03 = -1;
    public int A04;
    public int A05;
    public boolean A06;
    public final PopupWindow A07;
    public final C17682VcD A08;
    public final U4i A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final View A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final boolean A0K;

    public C18799W2m(Context context, C17682VcD vcD, U4i u4i, int i) {
        int i2;
        this.A0F = context;
        this.A08 = vcD;
        this.A09 = u4i;
        View A0D2 = DbT.A0D(LayoutInflater.from(context), new LinearLayout(context), R.layout.insights_line_chart_tooltip_layout, false);
        this.A0G = A0D2;
        boolean z = vcD.A05;
        this.A0K = z;
        this.A04 = -1;
        SpritesheetInfo spritesheetInfo = vcD.A03;
        if (spritesheetInfo != null) {
            this.A00 = JTO.A0Y(A0D2, R.id.insights_line_chart_tooltip_thumbnail_view);
            this.A01 = new U1Z(spritesheetInfo, new C19670WdY(this), (float) AnonymousClass7TG.A03(context));
        }
        float[] fArr = vcD.A08;
        this.A02 = fArr[0];
        TextView A0d = AnonymousClass7TE.A0d(A0D2, R.id.insights_line_chart_tooltip_primary_text);
        this.A0I = A0d;
        this.A0H = AnonymousClass7TE.A0d(A0D2, R.id.insights_line_chart_tooltip_benchmark_text);
        TextView A0d2 = AnonymousClass7TE.A0d(A0D2, R.id.insights_line_chart_tooltip_timestamp_text);
        this.A0J = A0d2;
        A02(fArr[i]);
        A0d.setTextAppearance(R.style.igds_emphasized_body_1);
        DbY.A12(A0d, context);
        A0d2.setTextAppearance(R.style.PrivacyTextStyle);
        A03(vcD.A07[i]);
        A04(i);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + C51972G9s.A08(context);
        this.A0B = JTR.A07(context) + AnonymousClass7TF.A02(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0C = AnonymousClass7TG.A03(context);
        Resources resources = context.getResources();
        if (z) {
            i2 = R.dimen.achievements_list_container_height;
        } else {
            boolean z2 = vcD.A06;
            i2 = R.dimen.insights_line_retention_chart_tooltip_container_width;
            if (z2) {
                i2 = R.dimen.ai_agent_embodiment_video_container_size;
            }
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        this.A0E = dimensionPixelSize;
        context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        this.A0D = AnonymousClass7TG.A05(context);
        Rect rect = new Rect();
        Activity activity = (Activity) context;
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.A05 += rect.top;
        }
        this.A05 += DbT.A0K(activity).AYI();
        PopupWindow popupWindow = new PopupWindow(A0D2, dimensionPixelSize, -2, false);
        this.A07 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        A05(i);
    }

    private final int A00() {
        int[] iArr = new int[2];
        this.A09.getLocationOnScreen(iArr);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.A0E, AnonymousClass972.MUTABLE_FLAG_MASK);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view = this.A0G;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = view.getMeasuredHeight();
        if (this.A04 != measuredHeight) {
            this.A06 = true;
        }
        this.A04 = measuredHeight;
        int i = iArr[1];
        int i2 = (i - measuredHeight) + (this.A0D * 2);
        int i3 = this.A05;
        if (i < i3) {
            return -1;
        }
        if (i2 < i3) {
            return i3;
        }
        return i2;
    }

    private final int A01(int i) {
        float f;
        int i2 = this.A0B;
        int measuredWidth = (this.A09.getMeasuredWidth() - this.A0A) - i2;
        C17682VcD vcD = this.A08;
        float[] fArr = vcD.A07;
        float f2 = fArr[fArr.length - 1];
        float f3 = vcD.A01;
        float f4 = vcD.A00;
        if (f4 < f3) {
            f = 0.0f;
        } else {
            f = ((float) measuredWidth) * (((f2 - f3) * 1.0f) / (f4 - f3));
        }
        int i3 = vcD.A02;
        float f5 = (((float) (((int) f) - this.A0C)) * 1.0f) / ((float) (i3 - 1));
        float[] fArr2 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr2[i4] = ((float) i4) * f5;
        }
        return (int) ((fArr2[i] + ((float) i2)) - C13988Tno.A01(this.A0E));
    }

    private final void A02(float f) {
        TextView textView;
        String A0e;
        if (this.A0K) {
            int i = (int) f;
            Integer valueOf = Integer.valueOf(i);
            Context context = this.A0F;
            String A042 = C253673rC.A04(AnonymousClass7TF.A0A(context), valueOf, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
            textView = this.A0I;
            if (textView != null) {
                A0e = DbV.A0v(context.getResources(), A042, R.plurals.distribution_chart_views_text, i);
            } else {
                return;
            }
        } else {
            int i2 = (int) ((f / this.A02) * 100.0f);
            textView = this.A0I;
            if (textView != null) {
                A0e = AnonymousClass7TF.A0e(this.A0F.getResources(), String.valueOf(i2), 2131972369);
            } else {
                return;
            }
        }
        textView.setText(A0e);
    }

    private final void A03(float f) {
        String valueOf;
        if (this.A0K) {
            AnonymousClass7TH.A0R(this.A0J);
            return;
        }
        int i = (int) (f / 1000.0f);
        int i2 = i / 60;
        int i3 = i % 60;
        String valueOf2 = String.valueOf(i2);
        if (i3 < 10) {
            valueOf = 002.A00('0', i3);
        } else {
            valueOf = String.valueOf(i3);
        }
        TextView textView = this.A0J;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(this.A0F.getResources().getString(2131972370, new Object[]{valueOf2, valueOf}));
        }
    }

    private final void A04(int i) {
        Resources resources;
        int i2;
        String valueOf;
        Resources resources2;
        int i3;
        String A0e;
        TextView textView = this.A0H;
        if (textView != null) {
            DbS.A1C(textView);
            textView.setVisibility(8);
        }
        C17682VcD vcD = this.A08;
        for (PointF pointF : vcD.A04) {
            if (((int) vcD.A07[i]) == ((int) pointF.x)) {
                float f = pointF.y;
                if (f <= 1000000.0f) {
                    if (f > 0.0f) {
                        valueOf = String.valueOf((int) ((float) Math.rint((double) (f * 100.0f))));
                        if (textView != null) {
                            resources2 = this.A0F.getResources();
                            i3 = 2131960871;
                        } else {
                            return;
                        }
                    } else if (f < 0.0f) {
                        valueOf = String.valueOf((int) Math.abs((float) Math.rint((double) (f * 100.0f))));
                        if (textView != null) {
                            resources2 = this.A0F.getResources();
                            i3 = 2131960873;
                        } else {
                            return;
                        }
                    } else if (textView != null) {
                        resources = this.A0F.getResources();
                        i2 = 2131960870;
                    } else {
                        return;
                    }
                    A0e = AnonymousClass7TF.A0e(resources2, valueOf, i3);
                    textView.setText(A0e);
                    textView.setVisibility(0);
                    return;
                } else if (textView != null) {
                    resources = this.A0F.getResources();
                    i2 = 2131960872;
                } else {
                    return;
                }
                A0e = resources.getString(i2);
                textView.setText(A0e);
                textView.setVisibility(0);
                return;
            }
        }
    }

    public final void A05(int i) {
        VRW[] vrwArr;
        Rect rect = new Rect();
        U4i u4i = this.A09;
        u4i.getGlobalVisibleRect(rect);
        PopupWindow popupWindow = this.A07;
        popupWindow.setTouchInterceptor(new C18899WBr(3, rect, this));
        if (this.A03 != i) {
            C17682VcD vcD = this.A08;
            if (!vcD.A06 || (vrwArr = vcD.A09) == null || 03t.A06(vrwArr, i) == null) {
                A02(vcD.A08[i]);
                float[] fArr = vcD.A07;
                A03(fArr[i]);
                A04(i);
                U1Z u1z = this.A01;
                if (u1z != null) {
                    u1z.A00 = (int) (((float) u1z.A01.size()) * (((float) i) / ((float) fArr.length)));
                    u1z.invalidateSelf();
                }
            } else {
                VRW vrw = vrwArr[i];
                TextView textView = this.A0I;
                if (textView != null) {
                    textView.setText(vrw.A00);
                }
                TextView textView2 = this.A0J;
                if (textView2 != null) {
                    textView2.setText(vrw.A01);
                }
            }
            this.A03 = i;
        }
        if (A00() == -1) {
            popupWindow.dismiss();
        } else if (!popupWindow.isShowing()) {
            popupWindow.showAtLocation(u4i, 0, A01(i), A00());
        } else if (this.A06) {
            popupWindow.dismiss();
            popupWindow.showAtLocation(u4i, 0, A01(i), A00());
            this.A06 = false;
        } else {
            popupWindow.update(A01(i), A00(), this.A0E, -2);
        }
    }
}
