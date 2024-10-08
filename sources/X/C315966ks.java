package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.instagram.android.R;

/* renamed from: X.6ks  reason: invalid class name and case insensitive filesystem */
public final class C315966ks {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05 = 0;
    public int A06;
    public int A07;
    public GestureDetector A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final C315956kr A0D;

    public C315966ks(Context context, C315956kr r8) {
        this.A0C = context;
        this.A0D = r8;
        this.A07 = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.config_minScalingSpan);
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i > 18) {
            this.A0A = true;
            if (this.A08 == null) {
                this.A08 = new GestureDetector(this.A0C, new C315976kt(this), (Handler) null);
            }
            if (i > 22) {
                this.A0B = true;
            }
        }
    }
}
