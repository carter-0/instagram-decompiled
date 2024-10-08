package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.49s  reason: invalid class name and case insensitive filesystem */
public final class C2614749s implements C2614849t {
    public AnonymousClass4AZ A00;
    public List A01 = 0sn.A00;
    public boolean A02;
    public AnonymousClass4AE A03;
    public final Fragment A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final NotesRepository A07;
    public final AnonymousClass4AD A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass07V A0A;
    public final 0h9 A0B;
    public final AnonymousClass4AF A0C;

    public C2614749s(Fragment fragment, AnonymousClass0iw r17, UserSession userSession) {
        UserSession userSession2 = userSession;
        this.A06 = userSession2;
        AnonymousClass0iw r10 = r17;
        this.A05 = r10;
        Fragment fragment2 = fragment;
        this.A04 = fragment2;
        0h9 r4 = new 0h9(this);
        this.A0B = r4;
        this.A07 = AnonymousClass43C.A00(userSession2);
        C377239Lb r7 = new C377239Lb(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C377219Kz(new C377219Kz(fragment2, 0), 1));
        C227862kA r0 = new C227862kA(new C377219Kz(A002, 2), r7, new C377409Ls(16, (Object) null, A002), new 0Yh(C2614949u.class));
        this.A09 = r0;
        C2614949u r1 = (C2614949u) r0.getValue();
        AnonymousClass4AE r02 = this.A03;
        0qQ.A0B(r1, 0);
        AnonymousClass4AC r12 = new AnonymousClass4AC(r1, r02);
        this.A08 = r12;
        this.A0C = new AnonymousClass4AF(fragment2, r10, userSession2, r12, (String) null, true);
        this.A0A = r4;
        A00(fragment2, new C376909Ju(this, (AnonymousClass4D7) null, 19));
        A00(fragment2, new C376909Ju(this, (AnonymousClass4D7) null, 20));
        A00(fragment2, new C376909Ju(this, (AnonymousClass4D7) null, 21));
    }

    public static final void A00(Fragment fragment, 0sL r4) {
        fragment.mViewLifecycleOwnerLiveData.A06(fragment, new AnonymousClass4JN(new C377259Ld(r4, 24)));
    }

    public static final void A01(C2614749s r21) {
        AnonymousClass4AZ r4;
        AnonymousClass4AS r0;
        boolean z;
        AnonymousClass60F r02;
        Boolean bool;
        C2614749s r1 = r21;
        if (!r1.A01.isEmpty()) {
            NotesRepository notesRepository = r1.A07;
            if (!((List) notesRepository.A0p.getValue()).isEmpty() && (r4 = r1.A00) != null) {
                UserSession userSession = r1.A06;
                Object obj = notesRepository.A0I.get(userSession.A06);
                ArrayList arrayList = new ArrayList();
                for (String A062 : r1.A01) {
                    C279864zZ A063 = notesRepository.A06(A062);
                    if (A063 != null) {
                        arrayList.add(A063);
                    }
                }
                if (r1.A02 && obj != null && !arrayList.contains(obj)) {
                    arrayList.add(0, obj);
                }
                ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    C279864zZ r9 = (C279864zZ) next;
                    int size = arrayList.size();
                    C300845y2 r03 = r9.A0A;
                    if (r03 == null || (r02 = r03.A0B) == null || (bool = r02.A00) == null) {
                        z = false;
                    } else {
                        z = bool.booleanValue();
                    }
                    arrayList2.add(AnonymousClass911.A00(r9, userSession, Integer.valueOf(i), size, 0, false, false, false, false, false, false, z, r9.A0R));
                    i = i2;
                }
                if (!r1.A02 || obj != null) {
                    r0 = null;
                } else {
                    r0 = new AnonymousClass4AS(0eE.A00(userSession).A00(), AnonymousClass4A2.A03(r1.A04.requireContext(), userSession, false, false, false, false, false), false);
                }
                r4.A00.A00(new C66980MgE((C61063Jw1) null, (AnonymousClass4A9) null, r0, (Integer) null, arrayList2, (List) null));
            }
        }
    }

    public final AnonymousClass4AF AmV() {
        return this.A0C;
    }

    public final AnonymousClass4AD BWa() {
        return this.A08;
    }

    public final boolean E2u() {
        return ((C2614949u) this.A09.getValue()).A07();
    }

    public final void FJa(AnonymousClass4AB r2, boolean z) {
        if (AnonymousClass4AJ.A0F(this.A06)) {
            ((C2614949u) this.A09.getValue()).A05(r2, z);
        }
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A0A;
    }

    public final void EjK(AnonymousClass4AE r1) {
        this.A03 = r1;
    }
}
