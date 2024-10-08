package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

public final class W69 implements Handler.Callback {
    public final int A00;

    public W69(int i) {
        this.A00 = i;
    }

    public final boolean handleMessage(Message message) {
        ValueAnimator valueAnimator;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (this.A00 != 0) {
            int i = message.what;
            if (i == 0) {
                W1m w1m = (W1m) message.obj;
                U4W u4w = w1m.A09;
                u4w.A02 = new WMV(w1m);
                if (u4w.getParent() == null) {
                    2dP layoutParams = u4w.getLayoutParams();
                    if (layoutParams instanceof 2dP) {
                        2dP r4 = layoutParams;
                        BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                        baseTransientBottomBar$Behavior.A00.A00 = w1m.A04;
                        baseTransientBottomBar$Behavior.A04 = new WMS(w1m);
                        r4.A00(baseTransientBottomBar$Behavior);
                        r4.A03 = 80;
                    }
                    W1m.A02(w1m);
                    u4w.setVisibility(4);
                    w1m.A07.addView(u4w);
                }
                if (u4w.isLaidOut()) {
                    W1m.A01(w1m);
                    return true;
                }
                u4w.A03 = new WMW(w1m);
                return true;
            } else if (i != 1) {
                return false;
            } else {
                W1m w1m2 = (W1m) message.obj;
                int i2 = message.arg1;
                AccessibilityManager accessibilityManager = w1m2.A08;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    U4W u4w2 = w1m2.A09;
                    if (u4w2.getVisibility() == 0) {
                        if (u4w2.A00 == 1) {
                            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                            valueAnimator.setInterpolator(AnonymousClass6Y2.A03);
                            valueAnimator.addUpdateListener(new W4Q(w1m2, 4));
                            valueAnimator.setDuration(75);
                            valueAnimator.addListener(new U0E(w1m2, i2, 0));
                        } else {
                            valueAnimator = new ValueAnimator();
                            int height = u4w2.getHeight();
                            ViewGroup.LayoutParams layoutParams2 = u4w2.getLayoutParams();
                            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            }
                            valueAnimator.setIntValues(new int[]{0, height});
                            valueAnimator.setInterpolator(AnonymousClass6Y2.A02);
                            valueAnimator.setDuration(250);
                            valueAnimator.addListener(new U0E(w1m2, i2, 1));
                            valueAnimator.addUpdateListener(new W4Q(w1m2, 5));
                        }
                        valueAnimator.start();
                        return true;
                    }
                }
                w1m2.A05();
                return true;
            }
        } else if (message.what != 1) {
            return false;
        } else {
            QHQ qhq = (QHQ) message.obj;
            qhq.A00.A00(qhq);
            return true;
        }
    }
}
