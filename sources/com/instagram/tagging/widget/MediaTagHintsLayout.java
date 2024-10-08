package com.instagram.tagging.widget;

import X.AnonymousClass05K;
import X.AnonymousClass3TF;
import X.AnonymousClass3W1;
import X.AnonymousClass47M;
import X.C247763gs;
import X.C294975nL;
import X.C65716LyW;
import X.C65721Lyb;
import X.PQN;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.model.Tag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraVideoCapturer;

public class MediaTagHintsLayout extends ViewGroup {
    public int A00 = CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    public int A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    public UserSession A02;
    public Runnable A03;
    public Runnable A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final int A06 = getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
    public final Map A07 = new HashMap();

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        for (Map.Entry entry : this.A07.entrySet()) {
            PointF A002 = ((Tag) entry.getKey()).A00();
            A002.getClass();
            int i7 = (int) (((float) i5) * A002.x);
            int i8 = (int) (((float) i6) * ((Tag) entry.getKey()).A00().y);
            int i9 = this.A06;
            ((View) entry.getValue()).layout(i7 - i9, i8 - i9, i7 + i9, i8 + i9);
        }
    }

    public static boolean A00(AnonymousClass3W1 r2, int i) {
        if (!r2.A23 || i != r2.A03 || r2.A0i != AnonymousClass3TF.IDLE || r2.A1z || r2.A20) {
            return true;
        }
        return false;
    }

    public final void A01() {
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A04 = null;
        }
        Runnable runnable2 = this.A03;
        if (runnable2 != null) {
            this.A05.removeCallbacks(runnable2);
            this.A03 = null;
        }
    }

    public final void A02(AnonymousClass47M r6, boolean z) {
        Integer num = r6.A01;
        Integer num2 = AnonymousClass05K.A01;
        if (num != num2) {
            r6.A01 = num2;
            int i = 0;
            if (z) {
                while (i < getChildCount()) {
                    getChildAt(i);
                    View childAt = getChildAt(i);
                    C65716LyW lyW = new C65716LyW(r6, this);
                    C294975nL A012 = C294975nL.A01(childAt, 1);
                    if (A012.A0W()) {
                        A012.A05 = new C65721Lyb(childAt, lyW, A012);
                    } else {
                        C247763gs.A04(childAt, new PQN(childAt, lyW));
                    }
                    i++;
                }
                return;
            }
            while (i < getChildCount()) {
                View childAt2 = getChildAt(i);
                childAt2.setScaleX(0.0f);
                childAt2.setScaleY(0.0f);
                childAt2.setVisibility(8);
                i++;
            }
            r6.A05 = true;
        }
    }

    public void setTags(List list) {
        Map map = this.A07;
        map.clear();
        removeAllViewsInLayout();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            if (tag.A00() != null) {
                Context context = getContext();
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(context.getDrawable(R.drawable.tag_hint_with_shadow));
                imageView.setAlpha(0.0f);
                map.put(tag, imageView);
                addView(imageView);
            }
        }
    }

    public MediaTagHintsLayout(Context context) {
        super(context);
    }

    public void setHideDelayMs(int i) {
        this.A00 = i;
    }

    public void setShowDelayMs(int i) {
        this.A01 = i;
    }

    public void setUserSession(UserSession userSession) {
        this.A02 = userSession;
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaTagHintsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
