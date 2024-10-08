package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.E6t  reason: case insensitive filesystem */
public final class C47532E6t extends C273374mT implements CallerContextable {
    public static final ImmutableList A02;
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public C319866rM A00;
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return "contact_sheet";
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.E6t, androidx.fragment.app.Fragment, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.contact_options_rv);
        DbU.A15(getContext(), recyclerView, 1, false);
        Bundle requireArguments = requireArguments();
        ArrayList<Integer> integerArrayList = requireArguments.getIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST");
        if (integerArrayList == null) {
            throw AnonymousClass7TE.A0z("Missing Action Ids.");
        } else if (DbT.A1b(integerArrayList)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (DbT.A1b(integerArrayList)) {
                Iterator<Integer> it = integerArrayList.iterator();
                while (it.hasNext()) {
                    int A0M = AnonymousClass7TE.A0M(it.next());
                    C318666pK[] values = C318666pK.values();
                    int length = values.length;
                    int i = 0;
                    while (i < length) {
                        C318666pK r1 = values[i];
                        if (r1.A00 == A0M) {
                            A1C.add(r1);
                        } else {
                            i++;
                        }
                    }
                    throw AnonymousClass7TE.A0w("Invalid Button Id");
                }
            }
            boolean z = requireArguments.getBoolean("ContactOptionsFragment.REQUEST_CONTACT_ENABLED", false);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            if (z) {
                C249803kO it2 = A02.iterator();
                0qQ.A07(it2);
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!A1C.contains(next)) {
                        0qQ.A0A(next);
                        A1C2.add(next);
                    }
                }
            }
            AnonymousClass0eM r2 = this.A01;
            05G r0 = ((C46755Dki) r2.getValue()).A03;
            19B r12 = 19B.A00;
            C226292g8.A00(r12, r0).A06(this, new C50137FQu(0, this, recyclerView, A1C2, A1C));
            C50139FQw.A00(this, C226292g8.A00(r12, ((C46755Dki) r2.getValue()).A04), 36);
            C46755Dki dki = (C46755Dki) r2.getValue();
            17i r02 = dki.A01;
            String str = dki.A02;
            User A022 = r02.A02(str);
            if (A022 == null) {
                AnonymousClass441.A02.A02(dki.A00, new C51020FnC(dki, 3), str);
            } else {
                dki.A03.Epw(new C49507Ewm(A022, true));
            }
        } else {
            throw AnonymousClass7TE.A0z("Missing Action Ids.");
        }
    }

    static {
        ImmutableList of = ImmutableList.of(C318666pK.CALL, C318666pK.A08);
        0qQ.A07(of);
        A02 = of;
    }

    public C47532E6t() {
        C51763G0f g0f = new C51763G0f(this, 33);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51763G0f(new C51763G0f(this, 30), 31));
        this.A01 = DbS.A0I(new C51763G0f(A002, 32), g0f, new MJ4(23, (Object) null, A002), DbS.A0z(C46755Dki.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(575852606);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_contact_options_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1232582509, A022);
        return inflate;
    }
}
