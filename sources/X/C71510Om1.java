package X;

import android.content.Context;
import android.util.Patterns;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Om1  reason: case insensitive filesystem */
public final class C71510Om1 implements C66951r5 {
    public static final Set A06 = 0sc.A07(new Short[]{307, 810, 13636, 485, 360});
    public final 0wc A00;
    public final 0lg A01;
    public final Set A02;
    public final Context A03;
    public final C71509Om0 A04 = new C71509Om0(this);
    public final Set A05;

    public static final void A00(0Df r9, C71510Om1 om1, String str) {
        Integer num;
        C69267NiT niT;
        if (!om1.A05.contains(str)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            om1.A02(r9, A1C);
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                0qQ.A0B(A18, 0);
                Iterator it2 = DbV.A18(A18, " ").iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String A182 = AnonymousClass7TE.A18(it2);
                        0qQ.A0B(A182, 0);
                        C70755OKb oKb = C70397O4z.A01;
                        ReentrantReadWriteLock reentrantReadWriteLock = oKb.A01;
                        reentrantReadWriteLock.readLock().lock();
                        Object obj = oKb.A00.get(A182);
                        reentrantReadWriteLock.readLock().unlock();
                        if (obj != null) {
                            if (DbV.A1b(A182, Patterns.WEB_URL)) {
                                num = AnonymousClass05K.A0C;
                                break;
                            } else if (DbV.A1b(A182, Patterns.EMAIL_ADDRESS)) {
                                num = AnonymousClass05K.A01;
                                break;
                            }
                        }
                    } else {
                        if (A18.length() > 25) {
                            C70755OKb oKb2 = C70397O4z.A00;
                            try {
                                ReentrantReadWriteLock reentrantReadWriteLock2 = oKb2.A01;
                                reentrantReadWriteLock2.readLock().lock();
                                Iterator A0s = AnonymousClass7TF.A0s(oKb2.A00);
                                while (true) {
                                    niT = null;
                                    if (!A0s.hasNext()) {
                                        break;
                                    }
                                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                                    if (00l.A0d(A18, (CharSequence) A1J.getKey(), false)) {
                                        niT = (C69267NiT) A1J.getValue();
                                        break;
                                    }
                                }
                                reentrantReadWriteLock2.readLock().unlock();
                                if (!(niT == null || C70363O3p.A00[niT.ordinal()] == -1)) {
                                    num = AnonymousClass05K.A00;
                                }
                            } catch (Throwable th) {
                                oKb2.A01.readLock().unlock();
                                throw th;
                            }
                        }
                        num = AnonymousClass05K.A0N;
                    }
                }
                A0r.add(new O5f(num));
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next : A0r) {
                if (((O5f) next).A00 != AnonymousClass05K.A0N) {
                    A1C2.add(next);
                }
            }
            Iterator it3 = A1C2.iterator();
            while (it3.hasNext()) {
                it3.next();
                0wc r2 = om1.A00;
                r2.A00(r2.A00, "igd_client_message_content_detection");
            }
        }
    }

    private final void A01(Object obj, ArrayList arrayList) {
        String obj2;
        if (obj instanceof AnonymousClass0Jz) {
            A02((AnonymousClass0Jz) obj, arrayList);
            return;
        }
        if (obj instanceof String) {
            if (((CharSequence) obj).length() != 0) {
                String str = (String) obj;
                try {
                    boolean contains = this.A02.contains(new URL(str).getHost());
                    if (DbV.A1b(str, Patterns.WEB_URL) && contains) {
                        return;
                    }
                } catch (MalformedURLException unused) {
                }
            } else {
                return;
            }
        } else if ((obj instanceof CharSequence) && (obj2 = obj.toString()) != null && obj2.length() != 0) {
            String obj3 = obj.toString();
            try {
                boolean contains2 = this.A02.contains(new URL(obj3).getHost());
                if (DbV.A1b(obj3, Patterns.WEB_URL) && contains2) {
                    return;
                }
            } catch (MalformedURLException unused2) {
            }
            obj = obj.toString();
        } else {
            return;
        }
        arrayList.add(obj);
    }

    public final void A02(AnonymousClass0Jz r5, ArrayList arrayList) {
        if (r5 != null) {
            int i = 0;
            if (r5 instanceof 0Df) {
                0Df r52 = (0Df) r5;
                int i2 = r52.A00;
                while (i < i2) {
                    A01(r52.A0C(i), arrayList);
                    i++;
                }
            } else if (r5 instanceof 0Dv) {
                ArrayList arrayList2 = ((0Dv) r5).A00;
                int size = arrayList2.size();
                while (i < size) {
                    A01(arrayList2.get(i), arrayList);
                    i++;
                }
            }
        }
    }

    public final Integer AFG() {
        int i = 0;
        if (182.A06(0Tu.A05, this.A01, 36325854137300260L)) {
            i = 20;
        }
        return Integer.valueOf(i);
    }

    public final 1r7 BpI() {
        return this.A04;
    }

    public C71510Om1(Context context, 0lg r6) {
        AnonymousClass7TG.A1O(r6, context);
        this.A01 = r6;
        this.A03 = context;
        this.A00 = (0wc) r6.A01(0wc.class, new MMK(this, 10));
        0Tu r3 = 0Tu.A05;
        this.A05 = 094.A01("igd_client_message_content_detection", 00k.A0k(DbV.A18(182.A04(r3, r6, 36888804090512181L), ",")));
        this.A02 = 00k.A0k(DbV.A18(182.A04(r3, r6, 36888804090577718L), ","));
    }
}
