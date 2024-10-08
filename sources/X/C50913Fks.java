package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: X.Fks  reason: case insensitive filesystem */
public final class C50913Fks implements C51916G7k {
    public final int A00;
    public final Object A01;

    public C50913Fks(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DFx() {
        if (1 - this.A00 == 0) {
            C47528E6o e6o = (C47528E6o) this.A01;
            if (e6o.A06) {
                C358448av r0 = e6o.A00;
                if (r0 == null) {
                    0qQ.A0F("searchLogger");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    r0.CkS();
                }
            }
        }
    }

    public final void Dhk(String str) {
        String str2;
        if (1 - this.A00 == 0) {
            C47528E6o e6o = (C47528E6o) this.A01;
            C358448av r0 = e6o.A00;
            if (r0 == null) {
                str2 = "searchLogger";
            } else {
                r0.CkH();
                if (e6o.A06) {
                    C14221Ts1 ts1 = e6o.A02;
                    if (ts1 != null) {
                        ts1.A06(str);
                    }
                } else if (!str.equals(e6o.A04)) {
                    1OC AMx = e6o.AMx(str, (String) null);
                    AMx.A00 = new C47690ECz(str, e6o, 3);
                    e6o.schedule(AMx);
                } else {
                    return;
                }
                E9N e9n = e6o.A03;
                if (e9n == null) {
                    str2 = "userListAdapter";
                } else {
                    e9n.A0B = false;
                    e9n.A07 = null;
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dhm(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                int length = str.length();
                Object obj = this.A01;
                if (length > 0) {
                    E7U e7u = (E7U) obj;
                    ArrayList arrayList = e7u.A0C;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        C232262tL r2 = (C232262tL) next;
                        if ((r2 instanceof C47240DtR) && Pattern.compile(Pattern.quote(str), 2).matcher(((C47240DtR) r2).A02).find()) {
                            A1C.add(next);
                        }
                    }
                    e7u.A0B(A1C);
                    return;
                }
                E7U e7u2 = (E7U) obj;
                e7u2.A0B(e7u2.A0C);
                e7u2.getRecyclerView().A0o(0);
                return;
            case 1:
                C47528E6o e6o = (C47528E6o) this.A01;
                E9N e9n = e6o.A03;
                str2 = "userListAdapter";
                if (e9n != null) {
                    e9n.A04 = null;
                    e9n.A0A = false;
                    if (str.length() == 0) {
                        e9n.A0R.clear();
                        e9n.A0S.clear();
                        e9n.A0B = false;
                        e9n.A07 = null;
                        e9n.clear();
                        e9n.notifyDataSetChangedSmart();
                        C47528E6o.A00(e6o);
                        if (e6o.A05) {
                            1NY A0M = DbZ.A0M(DbT.A0X(e6o.A0C));
                            A0M.A0A("discover/non_profiled/");
                            C47697EDg.A01(e6o, DbU.A0S(A0M, CDG.class, C45598CzA.class), 48);
                            return;
                        }
                        return;
                    } else if (e6o.A06) {
                        C14221Ts1 ts1 = e6o.A02;
                        if (ts1 != null) {
                            ts1.A06(str);
                        }
                        E9N e9n2 = e6o.A03;
                        if (e9n2 != null) {
                            e9n2.A0B = false;
                            e9n2.A07 = null;
                            C47528E6o.A00(e6o);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                C68483NKa nKa = (C68483NKa) this.A01;
                if (nKa.A0F) {
                    return;
                }
                if (str.length() == 0) {
                    nKa.A02((User) null, false);
                    return;
                }
                C60238Jhv jhv = nKa.A07;
                if (jhv == null) {
                    str2 = "viewModel";
                    break;
                } else {
                    jhv.A00(str);
                    return;
                }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
