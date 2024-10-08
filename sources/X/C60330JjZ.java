package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.JjZ  reason: case insensitive filesystem */
public final class C60330JjZ extends 2YL implements C229122ms {
    public static final ImmutableList A0E;
    public final C3515589i A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final MusicProduct A03;
    public final AnonymousClass4DH A04;
    public final UserSession A05;
    public final C60329JjY A06;
    public final AnonymousClass0r6 A07;
    public final AnonymousClass0r6 A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;
    public final ImmutableList A0D;

    public final void A01(C62550Khg khg) {
        0qQ.A0B(khg, 0);
        C60328JjX A002 = A00(khg, this);
        this.A0B.Epw(khg);
        05G r3 = this.A0A;
        05G r2 = A002.A08;
        JTT.A1X(r2, r3);
        JTT.A1X(A002.A07, this.A09);
        if (r3.getValue() == C62514Kh4.UNINITIALIZED) {
            r2.Epw(C62514Kh4.LOADING);
            A002.A04.A00(true);
        }
        if (r3.getValue() == C62514Kh4.LOADED) {
            A002.A02();
        }
    }

    public final boolean CKB() {
        return false;
    }

    public final boolean CWV() {
        return false;
    }

    static {
        ImmutableList of = ImmutableList.of(C62550Khg.FOR_YOU, C62550Khg.SAVED);
        0qQ.A07(of);
        A0E = of;
    }

    public C60330JjZ(C3515589i r14, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AnonymousClass4DH r18, UserSession userSession, C60329JjY jjY) {
        Object kvp;
        MusicProduct musicProduct2 = musicProduct;
        AnonymousClass4DH r3 = r18;
        UserSession userSession2 = userSession;
        C51974G9v.A1P(r3, userSession2, musicProduct2, immutableList);
        ImmutableList immutableList3 = immutableList2;
        C60329JjY jjY2 = jjY;
        AnonymousClass7TF.A1E(immutableList3, 5, jjY2);
        this.A04 = r3;
        this.A05 = userSession2;
        this.A03 = musicProduct2;
        this.A02 = immutableList;
        this.A01 = immutableList3;
        this.A00 = r14;
        this.A06 = jjY2;
        ImmutableList immutableList4 = A0E;
        02z A012 = 106.A01(immutableList4.get(0));
        this.A0B = A012;
        this.A0C = 10b.A03(A012);
        02z A10 = DbS.A10(C62514Kh4.UNINITIALIZED);
        this.A0A = A10;
        this.A08 = A10;
        02z A1J = JTO.A1J();
        this.A09 = A1J;
        this.A07 = A1J;
        ArrayList A0r = AnonymousClass7TG.A0r(immutableList4);
        Iterator it = immutableList4.iterator();
        while (it.hasNext()) {
            C62550Khg khg = (C62550Khg) it.next();
            0qQ.A0A(khg);
            int ordinal = khg.ordinal();
            if (ordinal == 0) {
                AnonymousClass4DH r11 = this.A04;
                UserSession userSession3 = this.A05;
                MusicProduct musicProduct3 = this.A03;
                kvp = new KVP(this.A00, this.A02, this.A01, musicProduct3, r11, userSession3);
            } else if (ordinal == 2) {
                AnonymousClass4DH r9 = this.A04;
                UserSession userSession4 = this.A05;
                kvp = new KVO(this.A02, this.A03, r9, userSession4, this.A06);
            } else {
                throw C51973G9u.A0g(khg, AnonymousClass000.A00(485), AnonymousClass7TE.A1A());
            }
            A0r.add(kvp);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0r);
        this.A0D = copyOf;
        Iterator it2 = copyOf.iterator();
        while (it2.hasNext()) {
            C60328JjX jjX = (C60328JjX) it2.next();
            0qQ.A0A(jjX);
            DbY.A19(this, new C66929MfO(this, jjX, (AnonymousClass4D7) null, 39), jjX.A06);
            DbY.A19(this, new C66929MfO(this, jjX, (AnonymousClass4D7) null, 40), jjX.A05);
        }
        A01((C62550Khg) this.A0C.getValue());
    }

    public static final C60328JjX A00(C62550Khg khg, C60330JjZ jjZ) {
        Iterator it = jjZ.A0D.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C60328JjX jjX = (C60328JjX) next;
            if (jjX.A01() == khg) {
                0qQ.A07(next);
                return jjX;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean CJz() {
        return !JTO.A13(this.A09).isEmpty();
    }

    public final boolean CT5() {
        return AnonymousClass7TF.A1W(this.A0A.getValue(), C62514Kh4.FAILED);
    }

    public final void CgO() {
        A00((C62550Khg) this.A0B.getValue(), this).A04.ACw();
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1W(this.A0A.getValue(), C62514Kh4.LOADING);
    }
}
