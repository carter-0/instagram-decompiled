package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Fcq  reason: case insensitive filesystem */
public final class C50504Fcq implements C66491MTu {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C50504Fcq(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public final void D1x(Context context) {
        FragmentActivity A06;
        AnonymousClass6W8 A0Y;
        if (this.A00 != 0) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            String str = this.A03;
            A1C.add(str);
            HashMap A1E = AnonymousClass7TE.A1E();
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.add(this.A02);
            A1E.put(str, A1F);
            C309416Ye A0i = DbS.A0i();
            A0i.A0O = A1C;
            A0i.A0Q = A1C;
            DbY.A1R(A0i);
            A0i.A03(AnonymousClass3BQ.IN_APP_NOTIFICATION);
            A0i.A02 = new AnonymousClass3BN();
            A0i.A0T = A1E;
            A0i.A0V = true;
            A06 = 2MD.A01().A06();
            if (A06 != null) {
                A0Y = DbW.A0W(A06, A0i.A00(), ((Fd0) this.A01).A00, TransparentModalActivity.class, "reel_viewer");
            } else {
                return;
            }
        } else {
            A06 = 2MD.A01().A06();
            F3W A032 = IgFragmentFactoryImpl.A00().A03(this.A03);
            A032.A0N = true;
            String str2 = this.A02;
            A032.A09 = str2;
            A032.A0G = str2;
            A032.A0T = true;
            A0Y = DbV.A0Y(A06, A032.A00(), ((C50512Fcy) this.A01).A00, ModalActivity.class, "single_media_feed");
        }
        A0Y.A0C(A06);
    }

    public final void onDismiss() {
    }
}
