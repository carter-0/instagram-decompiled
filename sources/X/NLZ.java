package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

public final class NLZ extends C231632rz {
    public final Context A00;
    public final LayoutInflater A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLZ(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = LayoutInflater.from(context);
        this.A02 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1912403152);
        view.getTag().getClass();
        OD5 od5 = (OD5) obj;
        Context context = this.A00;
        C70630OEb oEb = (C70630OEb) view.getTag();
        CharSequence charSequence = od5.A01;
        CharSequence charSequence2 = od5.A00;
        OGX ogx = (OGX) obj2;
        Resources resources = context.getResources();
        int i2 = 0;
        oEb.A00.setPadding(0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A03)), 0, resources.getDimensionPixelSize(C66582MXn.A07(ogx.A00)));
        Integer num = ogx.A01;
        if (num != null) {
            oEb.A02.setTextSize(0, (float) C66581MXm.A03(resources, num));
        }
        TextView textView = oEb.A02;
        textView.setText(charSequence);
        oEb.A01.setText(charSequence2);
        if (ogx.A04) {
            i2 = 17;
        }
        textView.setGravity(i2);
        AnonymousClass0fD.A0A(-700852046, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r1 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View createView(int r8, android.view.ViewGroup r9) {
        /*
            r7 = this;
            r0 = -1603854331(0xffffffffa0672005, float:-1.9577055E-19)
            int r6 = X.AnonymousClass0fD.A03(r0)
            android.view.LayoutInflater r5 = r7.A01
            com.instagram.common.session.UserSession r4 = r7.A02
            r3 = 0
            if (r4 == 0) goto L_0x001e
            X.0Tu r2 = X.0Tu.A06
            r0 = 36328989463166670(0x81110600003ece, double:3.037937449380956E-306)
            boolean r1 = X.182.A06(r2, r4, r0)
            r0 = 2131628974(0x7f0e13ae, float:1.8885256E38)
            if (r1 != 0) goto L_0x0021
        L_0x001e:
            r0 = 2131628973(0x7f0e13ad, float:1.8885254E38)
        L_0x0021:
            android.view.View r1 = r5.inflate(r0, r3)
            X.OEb r0 = new X.OEb
            r0.<init>(r1)
            r1.setTag(r0)
            r0 = -1297424978(0xffffffffb2aaddae, float:-1.9891413E-8)
            X.AnonymousClass0fD.A0A(r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NLZ.createView(int, android.view.ViewGroup):android.view.View");
    }
}
