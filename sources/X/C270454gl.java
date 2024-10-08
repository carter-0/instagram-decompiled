package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.4gl  reason: invalid class name and case insensitive filesystem */
public final class C270454gl {
    public View A00;
    public C262204Co A01;
    public boolean A02;
    public final C67961ye A03;

    public C270454gl(Context context, C67961ye r6) {
        this.A03 = r6;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_video_placeholder, (ViewGroup) null, false);
        AnonymousClass0fU.A00(new C56735IAe(context), inflate.findViewById(R.id.zero_video_placeholder));
        this.A00 = inflate;
    }

    public static final void A00(C270454gl r2) {
        Object obj;
        AnonymousClass0Ud A002 = AnonymousClass3OC.A00();
        if (A002 != null) {
            obj = A002.getValue();
        } else {
            obj = null;
        }
        if (obj != AnonymousClass3OD.FREE || !r2.A02) {
            View view = r2.A00;
            if (view.getParent() != null) {
                r2.A03.removeView(view);
                return;
            }
            return;
        }
        View view2 = r2.A00;
        if (view2.getParent() == null) {
            r2.A03.addView(view2);
        }
    }
}
