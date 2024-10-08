package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.35m  reason: invalid class name and case insensitive filesystem */
public final class C2368835m implements 27S {
    public final /* synthetic */ AnonymousClass35W A00;

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        Context context;
        0qQ.A0B(obj, 0);
        AnonymousClass35W r3 = this.A00;
        Fragment fragment = (Fragment) r3.A0b.get();
        if (fragment == null || (context = fragment.getContext()) == null || C267044ar.A00(context, r3.A0T)) {
            return false;
        }
        return true;
    }

    public C2368835m(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(946914763);
        int A032 = AnonymousClass0fD.A03(-527147372);
        0qQ.A0B(obj, 0);
        C227812jx r0 = (C227812jx) this.A00.A0b.get();
        if (r0 == null) {
            i = 1320429505;
        } else {
            AnonymousClass2rI r4 = (AnonymousClass2rI) r0.getAdapter();
            if (r4 != null) {
                AnonymousClass3UO r3 = AnonymousClass3UO.CI_UPSELL;
                AnonymousClass3UH r1 = r4.A05;
                if (r1 != null) {
                    C266934aa A002 = r4.A0S.A00(r1);
                    if (A002.A02 >= 0 && !r1.A08()) {
                        List list = r1.A0P;
                        if (list != null) {
                            ListIterator listIterator = list.listIterator();
                            while (true) {
                                if (listIterator.hasNext()) {
                                    if (((AnonymousClass3UI) listIterator.next()).A07 == r3) {
                                        listIterator.remove();
                                        A002.A08 = true;
                                        r4.notifyDataSetChangedSmart();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
            }
            i = 2011621188;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(1969101644, A03);
    }
}
