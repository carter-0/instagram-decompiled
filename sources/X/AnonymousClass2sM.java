package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2sM  reason: invalid class name */
public final class AnonymousClass2sM extends C231632rz {
    public C2363633l A00;
    public C2357130x A01;
    public final AnonymousClass2r9 A02;
    public final Context A03;
    public final Fragment A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;

    public AnonymousClass2sM(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, AnonymousClass2r9 r6) {
        0qQ.A0B(context, 2);
        0qQ.A0B(fragment, 3);
        0qQ.A0B(r6, 5);
        this.A06 = userSession;
        this.A03 = context;
        this.A04 = fragment;
        this.A05 = r4;
        this.A02 = r6;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        DHK dhk = (DHK) obj;
        C57247IUi iUi = (C57247IUi) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(dhk, 1);
        0qQ.A0B(iUi, 2);
        if (iUi.CdP()) {
            r4.A7U(1);
            return;
        }
        r4.A7U(0);
        this.A02.A9R(dhk, iUi);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        boolean z;
        int A032 = AnonymousClass0fD.A03(-1066118191);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        if (i == 0) {
            DHK dhk = (DHK) obj;
            this.A02.EBq(view, (AnonymousClass3O9) obj);
            UserSession userSession = this.A06;
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.notes.NotesNetegoViewBinder.Holder");
            C261554Aa r7 = (C261554Aa) tag;
            C57247IUi iUi = (C57247IUi) obj2;
            C2357130x r5 = this.A01;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r7, 3);
            0qQ.A0B(dhk, 4);
            0qQ.A0B(iUi, 5);
            BBM bbm = dhk.A00;
            AnonymousClass9J1 r1 = bbm.A00;
            if (r1 != null) {
                AnonymousClass4AJ.A00.A0H(userSession);
                List<C279864zZ> list = (List) r1.A01;
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (C279864zZ r0 : list) {
                    arrayList.add(r0.A0H);
                }
                C2614749s r12 = r7.A02;
                Boolean bool = bbm.A02;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                r12.A01 = arrayList;
                r12.A02 = z;
                C2614749s.A01(r12);
                if (r5 != null) {
                    Boolean bool2 = bbm.A03;
                    if (bool2 != null && bool2.booleanValue()) {
                        TextView textView = r7.A01;
                        textView.setVisibility(0);
                        AnonymousClass0fU.A00(new C40009ANp(userSession, r5), textView);
                    }
                    ImageView imageView = r7.A00;
                    imageView.setVisibility(0);
                    AnonymousClass0fU.A00(new IBD(dhk, iUi, r5), imageView);
                }
            }
        } else {
            C2363633l r13 = this.A00;
            if (r13 != null) {
                r13.A01(view, this.A06, (DHK) obj, obj2);
            }
        }
        AnonymousClass0fD.A0A(-243947094, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A002;
        int A032 = AnonymousClass0fD.A03(-640171424);
        0qQ.A0B(viewGroup, 1);
        if (i == 0) {
            UserSession userSession = this.A06;
            AnonymousClass4DH r7 = this.A04;
            AnonymousClass0iw r8 = this.A05;
            Context context = this.A03;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r7, 1);
            0qQ.A0B(r8, 2);
            0qQ.A0B(context, 3);
            A002 = LayoutInflater.from(context).inflate(R.layout.notes_netego_view, viewGroup, false);
            0qQ.A07(A002);
            C2614749s r12 = new C2614749s(r7, r8, userSession);
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            2el A003 = 2el.A00();
            LayoutInflater from = LayoutInflater.from(context);
            0qQ.A07(from);
            AnonymousClass4AG r4 = new AnonymousClass4AG(from, A002, r7, r8, userSession, A003, (C67333Mm9) null, r12);
            r12.A00 = new AnonymousClass4AZ(r4);
            A002.setTag(new C261554Aa(A002, r4, r12));
        } else {
            A002 = C2363733m.A00(this.A03, viewGroup, "v1", 2);
        }
        AnonymousClass0fD.A0A(3270448, A032);
        return A002;
    }
}
