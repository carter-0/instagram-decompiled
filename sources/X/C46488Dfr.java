package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Dfr  reason: case insensitive filesystem */
public abstract class C46488Dfr {
    public static final void A00(C71662eb r5, C67077Mhs mhs, DcN dcN) {
        int i;
        AnonymousClass7TF.A1H(r5, mhs);
        if (dcN == null) {
            r5.A02();
            return;
        }
        r5.A03(0);
        boolean z = dcN.A03;
        boolean z2 = dcN.A04;
        mhs.A02 = z;
        mhs.A03 = z2;
        int i2 = dcN.A00;
        int i3 = dcN.A02;
        mhs.A00 = i2;
        mhs.A01 = i3;
        r5.A01().setBackground(mhs);
        View A01 = r5.A01();
        if (z2) {
            i = R.id.thread_indicator_status_circle_and_dot;
            if (!z) {
                i = R.id.thread_indicator_status_circle;
            }
        } else {
            i = R.id.thread_indicator_status_nothing;
            if (z) {
                i = R.id.thread_indicator_status_dot;
            }
        }
        A01.setId(i);
        View A012 = r5.A01();
        0qQ.A07(A012);
        ViewGroup.MarginLayoutParams A0H = DbX.A0H(A012);
        A0H.setMargins(0, 0, dcN.A01, 0);
        A012.setLayoutParams(A0H);
    }
}
