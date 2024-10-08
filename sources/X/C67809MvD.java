package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.textview.UpdatableButton;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.MvD  reason: case insensitive filesystem */
public final class C67809MvD extends 2Rw {
    public String A00 = "";
    public ArrayList A01;
    public Set A02 = 0sl.A00;
    public final UserSession A03;
    public final AnonymousClass2r8 A04;
    public final Context A05;

    public C67809MvD(Context context, UserSession userSession, AnonymousClass2r8 r4) {
        0qQ.A0B(context, 2);
        this.A03 = userSession;
        this.A05 = context;
        this.A04 = r4;
    }

    public final void onBindViewHolder(C249703kE r8, int i) {
        ArrayList arrayList;
        C74530PwP pwP;
        0qQ.A0B(r8, 0);
        if ((r8 instanceof C68029Myv) && (arrayList = this.A01) != null && (pwP = (C74530PwP) arrayList.get(i)) != null) {
            C68029Myv myv = (C68029Myv) r8;
            N5I n5i = (N5I) pwP;
            myv.A04.setUrl(DbS.A0V(n5i.A03), this.A04.A02);
            myv.A03.setText(n5i.A07);
            Context context = this.A05;
            boolean z = false;
            String A012 = C66637Ma6.A01(AnonymousClass7TF.A0A(context), Integer.valueOf(n5i.A00), false);
            if (A012 == null) {
                A012 = "";
            }
            IgTextView igTextView = myv.A02;
            igTextView.setText(n5i.A05);
            Boolean bool = n5i.A01;
            if (bool != null) {
                z = bool.booleanValue();
            }
            C244273av.A0C(igTextView, z);
            myv.A01.setText(A012);
            boolean contains = this.A02.contains(n5i.A06);
            UpdatableButton updatableButton = myv.A05;
            int i2 = 2131974675;
            if (contains) {
                i2 = 2131974678;
            }
            C66581MXm.A15(context, updatableButton, i2);
            updatableButton.setIsBlueButton(!contains);
            AnonymousClass0fU.A00(new C71344Oit(i, 6, pwP, this), updatableButton);
            AnonymousClass0fU.A00(new C71344Oit(i, 7, pwP, this), myv.A00);
        }
    }

    public final void A00() {
        this.A02 = 1bJ.A00(this.A04.A03).A0C.A0D(AnonymousClass43A.A00);
        notifyDataSetChanged();
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(-572866522);
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        AnonymousClass0fD.A0A(-1761580533, A032);
        return i;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C68029Myv(DbT.A0D(LayoutInflater.from(this.A05), viewGroup, R.layout.suggested_channels_card, C66580MXl.A1Y(viewGroup)));
    }
}
