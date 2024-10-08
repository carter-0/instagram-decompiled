package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

/* renamed from: X.QBy  reason: case insensitive filesystem */
public final class C7414QBy extends AnonymousClass4DI {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.QBy] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        A00(this, AnonymousClass05K.A15, AnonymousClass05K.A01, new 0eP[0]);
        try {
            AnonymousClass0eM r5 = this.A00;
            CheckBox checkBox = (CheckBox) AnonymousClass7TE.A0b(view, ((C15048ULb) QD9.A00(r5).A06).A02);
            int intValue = ((QD9) r5.getValue()).A00.intValue();
            if (intValue == 0) {
                checkBox.setVisibility(0);
            } else if (intValue == 1) {
                Dba.A16(this, Pxh.A0O(this.A01).A04, new TYA(28, (Object) this, (Object) checkBox), 5);
            } else {
                throw AnonymousClass7TE.A1K();
            }
            View findViewById = view.findViewById(((C15048ULb) QD9.A00(r5).A06).A00);
            C11499SbM.A01(findViewById, 13, checkBox, this);
            C11497SbK.A01(view.findViewById(((C15048ULb) QD9.A00(r5).A06).A03), 20, this);
            Dba.A16(this, Pxh.A0O(this.A01).A07, new C58751Iwy(26, findViewById, this, checkBox), 5);
        } catch (Throwable th) {
            C51976G9y.A0T(this, th, this.A01);
        }
    }

    public static final void A00(C7414QBy qBy, Integer num, Integer num2, 0eP... r4) {
        Pxj.A1F(Pxh.A0O(qBy.A01), num, num2, AnonymousClass05K.A00, r4);
    }

    public C7414QBy() {
        C13348TVv tVv = new C13348TVv(this, 6);
        0eO r7 = 0eO.A02;
        AnonymousClass0eM A002 = C13348TVv.A00(tVv, r7, 7);
        0Yh A0z = DbS.A0z(C60104Jfk.class);
        this.A01 = new C227862kA(new C13348TVv(A002, 8), new TTP(37, A002, this), new TTP(36, (Object) null, A002), A0z);
        AnonymousClass0eM A003 = C13348TVv.A00(new C13348TVv(this, 5), r7, 9);
        0Yh A0z2 = DbS.A0z(QD9.class);
        this.A00 = new C227862kA(new C13348TVv(A003, 10), new TTP(39, A003, this), new TTP(38, (Object) null, A003), A0z2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(72621059);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(((C15048ULb) QD9.A00(this.A00).A06).A01, viewGroup, false);
        AnonymousClass0fD.A09(-1105035308, A02);
        return inflate;
    }
}
