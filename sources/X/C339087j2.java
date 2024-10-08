package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.7j2  reason: invalid class name and case insensitive filesystem */
public class C339087j2 {
    public final C339057iz A00;
    public final int A01;
    public final Integer A02;
    public final C62320sa A03;
    public final C62320sa A04;

    public void A00(UserSession userSession, C339807kC r9) {
        int i = this.A01;
        Integer num = this.A02;
        boolean booleanValue = ((Boolean) this.A04.invoke()).booleanValue();
        C62320sa r3 = this.A03;
        r9.A06.setVisibility(8);
        IgSimpleImageView igSimpleImageView = r9.A07;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(i);
        IgTextView igTextView = r9.A08;
        if (num == null) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
            igTextView.setText(num.intValue());
            igTextView.setVisibility(0);
        }
        C339817kD.A00(r9, r3, booleanValue);
    }

    public C339087j2(C339057iz r1, Integer num, C62320sa r3, C62320sa r4, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = r1;
        this.A04 = r3;
        this.A03 = r4;
    }
}
