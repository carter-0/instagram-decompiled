package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IDa  reason: case insensitive filesystem */
public final class C56803IDa implements View.OnTouchListener {
    public boolean A00 = false;
    public final /* synthetic */ C55448Hhs A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ C276544tV A04;

    public C56803IDa(C55448Hhs hhs, C307786Rm r3, C276544tV r4, C276544tV r5) {
        this.A01 = hhs;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        1Ng A002;
        C57061INb iNb;
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            C275794rx r0 = this.A01.A00;
            if (r0 != null && r0.isShowing()) {
                z = true;
            }
            this.A00 = z;
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (this.A00) {
                A002 = AnonymousClass1Nd.A00(C308206Td.A0A(this.A02));
                iNb = new C57061INb(false);
            } else {
                Fragment A012 = 0hq.A01(view);
                View rootView = view.getRootView();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                C276544tV A07 = this.A04.A07(38);
                if (A07 == null) {
                    1Kn.A02("BKStoryViewerTooltipExtensionBinder", "tooltipData is null");
                    return false;
                }
                String str = "";
                String A0F = A07.A0F();
                if (A0F != null) {
                    str = A0F;
                }
                boolean A0R = A07.A0R(35, false);
                String A0K = A07.A0K(38);
                Bundle bundle = A012.mArguments;
                bundle.getClass();
                UserSession A06 = 09i.A0A.A06(bundle);
                Integer num = AnonymousClass05K.A01;
                C55887Hp8 hp8 = new C55887Hp8(rootView, A06, num, num);
                hp8.A02 = C54604HKn.A01;
                hp8.A06 = true;
                hp8.A05 = false;
                hp8.A07 = false;
                C275794rx r3 = new C275794rx(hp8);
                this.A01.A00 = r3;
                View contentView = r3.getContentView();
                if (contentView != null) {
                    TextView A0G = DbU.A0G(contentView, R.id.reel_tagging_bubble_title);
                    if (!TextUtils.isEmpty(str)) {
                        A0G.setText(str);
                    } else {
                        1Kn.A02("BKStoryViewerTooltipExtensionBinder", "title is empty/null");
                    }
                    if (A0R) {
                        A0G.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.reel_tagging_chevron, 0);
                    }
                    IgImageView A0b = DbT.A0b(contentView, R.id.reel_tagging_bubble_image);
                    if (!TextUtils.isEmpty(A0K)) {
                        A0b.setUrl(DbS.A0V(A0K), C308206Td.A07(this.A02));
                        A0b.setVisibility(0);
                    } else {
                        A0b.setVisibility(8);
                        0wb.A03("BKStoryViewerTooltipExtensionComponent", "profile_url is empty/null");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth() / 10, rootView.getHeight() / 10, Bitmap.Config.ARGB_8888);
                    if (rootView instanceof FrameLayout) {
                        rootView.setDrawingCacheEnabled(true);
                        rootView.draw(new Canvas(createBitmap));
                        rootView.setDrawingCacheEnabled(false);
                    }
                    BlurUtil.blurInPlace(createBitmap, 20);
                    C307786Rm r8 = this.A02;
                    Context context = r8.A00;
                    r3.A01(createBitmap, (((float) 0nA.A09(context)) * 1.0f) / ((float) createBitmap.getWidth()));
                    r3.A03 = new C57419IaP(this);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    contentView.measure(makeMeasureSpec, makeMeasureSpec);
                    int A022 = DbS.A02(context, 40);
                    boolean A1T = C51970G9q.A1T(((rawY - ((float) A022)) > ((float) contentView.getMeasuredHeight()) ? 1 : ((rawY - ((float) A022)) == ((float) contentView.getMeasuredHeight()) ? 0 : -1)));
                    float A032 = AnonymousClass7TE.A03(rootView);
                    if (!A1T) {
                        A022 = -A022;
                    }
                    r3.A02(rootView, ((int) rawX) - (rootView.getWidth() / 2), ((int) Math.min(A032, Math.max(0.0f, rawY + ((float) A022)))) - (rootView.getHeight() / 2), A1T);
                    A002 = AnonymousClass1Nd.A00(C308206Td.A0A(r8));
                    iNb = new C57061INb(true);
                }
            }
            A002.A00(iNb);
        }
        return false;
    }
}
