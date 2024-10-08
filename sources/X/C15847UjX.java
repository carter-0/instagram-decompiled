package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.user.model.User;

/* renamed from: X.UjX  reason: case insensitive filesystem */
public final class C15847UjX extends AnonymousClass3NK {
    public final /* synthetic */ C19476WaO A00;
    public final /* synthetic */ Us7 A01;
    public final /* synthetic */ C15370UbN A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C15847UjX(C19476WaO waO, Us7 us7, C15370UbN ubN, String str, String str2) {
        this.A01 = us7;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = ubN;
        this.A00 = waO;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Cv2, java.lang.Object] */
    public final boolean Dqe(View view) {
        String str;
        Us7 us7 = this.A01;
        ImageView imageView = us7.A01;
        boolean z = !imageView.isSelected();
        imageView.setSelected(z);
        TextView textView = us7.A02;
        if (z) {
            str = this.A04;
        } else {
            str = this.A03;
        }
        textView.setText(str);
        C15370UbN ubN = this.A02;
        C19476WaO waO = this.A00;
        AnonymousClass0eM r4 = ubN.A07;
        AnonymousClass2fH A002 = AnonymousClass2fH.A00(AnonymousClass7TE.A0l(r4));
        String str2 = waO.A00.A06;
        if (str2 != null) {
            String str3 = ubN.A03;
            Boolean valueOf = Boolean.valueOf(z);
            ? obj = new Object();
            obj.A01 = str2;
            obj.A02 = str3;
            obj.A00 = valueOf;
            A002.A0D(str2, obj);
            1OC A003 = C17033VFh.A00(AnonymousClass7TE.A0l(r4), obj);
            A003.A00 = new C15584UfC(obj, A002, ubN, z);
            ubN.schedule(A003);
            VUA vua = ubN.A02;
            if (vua != null) {
                C19476WaO waO2 = vua.A00;
                BGi bGi = waO2.A00;
                User user = bGi.A00;
                String str4 = bGi.A05;
                String str5 = bGi.A06;
                String str6 = bGi.A07;
                String str7 = bGi.A08;
                String str8 = bGi.A09;
                waO2.A00 = V8D.A00(user, bGi.A01, bGi.A02, valueOf, bGi.A04, str4, str5, str6, str7, str8, bGi.A0A, bGi.A0B, bGi.A0C);
            }
            return true;
        }
        throw AnonymousClass7TE.A0y();
    }
}
