package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3UE  reason: invalid class name */
public abstract class AnonymousClass3UE {
    public static ArrayList A04(User user, List list) {
        ImageUrl Bh3;
        ArrayList arrayList = new ArrayList();
        if (list.size() < 2) {
            if (list.isEmpty()) {
                Bh3 = user.Bh3();
            } else {
                Bh3 = ((AnonymousClass171) list.get(0)).Bh3();
            }
            arrayList.add(Bh3);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AnonymousClass171) it.next()).Bh3());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r6.size() < 2) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A06(com.instagram.user.model.User r5, java.util.List r6, boolean r7) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r6 == 0) goto L_0x0028
            java.util.Iterator r3 = r6.iterator()
        L_0x000b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.next()
            X.170 r0 = (X.AnonymousClass170) r0
            java.lang.String r2 = r0.getId()
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            X.48P r0 = new X.48P
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x000b
        L_0x0028:
            r3 = 0
            if (r6 == 0) goto L_0x003e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x003e
            if (r7 != 0) goto L_0x003d
            int r1 = r6.size()
            r0 = 2
            if (r1 >= r0) goto L_0x003d
        L_0x003a:
            r4.add(r3)
        L_0x003d:
            return r4
        L_0x003e:
            com.instagram.common.typedurl.ImageUrl r2 = r5.Bh3()
            java.lang.String r1 = r5.getId()
            X.48P r0 = new X.48P
            r0.<init>(r2, r1)
            if (r7 == 0) goto L_0x0051
            r4.add(r0)
            return r4
        L_0x0051:
            r4.add(r0)
            goto L_0x003a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UE.A06(com.instagram.user.model.User, java.util.List, boolean):java.util.ArrayList");
    }

    public static AnonymousClass34S A00(ImageUrl imageUrl, User user, String str, String str2, List list) {
        ImageUrl imageUrl2;
        AnonymousClass34S A01 = A01(imageUrl, user, str, str2, list);
        Object obj = A01.A00;
        ImageUrl imageUrl3 = null;
        if (obj != null) {
            imageUrl2 = ((AnonymousClass48P) obj).A00;
        } else {
            imageUrl2 = null;
        }
        Object obj2 = A01.A01;
        if (obj2 != null) {
            imageUrl3 = ((AnonymousClass48P) obj2).A00;
        }
        return new AnonymousClass34S(imageUrl2, imageUrl3);
    }

    public static AnonymousClass34S A01(ImageUrl imageUrl, User user, String str, String str2, List list) {
        AnonymousClass48P r2;
        AnonymousClass48P r3;
        String id;
        ImageUrl Bh3;
        AnonymousClass48P r32 = null;
        if (list.isEmpty()) {
            return new AnonymousClass34S(new AnonymousClass48P(user.Bh3(), user.getId()), (Object) null);
        }
        if (list.size() == 1) {
            AnonymousClass170 r22 = (AnonymousClass170) list.get(0);
            if (r22.getId().equals(str)) {
                r3 = new AnonymousClass48P(r22.Bh3(), r22.getId());
                id = user.getId();
                Bh3 = user.Bh3();
            } else {
                r3 = new AnonymousClass48P(user.Bh3(), user.getId());
                id = r22.getId();
                Bh3 = r22.Bh3();
            }
            r2 = new AnonymousClass48P(Bh3, id);
        } else {
            if (str2 == null || imageUrl == null || str2.equals(str)) {
                r2 = null;
            } else {
                r2 = new AnonymousClass48P(imageUrl, str2);
            }
            if (user.getId().equals(str)) {
                r32 = new AnonymousClass48P(user.Bh3(), user.getId());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass170 r4 = (AnonymousClass170) it.next();
                if (r4.getId().equals(str)) {
                    r3 = new AnonymousClass48P(r4.Bh3(), r4.getId());
                    if (r2 != null) {
                        break;
                    }
                } else {
                    if (r2 == null) {
                        r2 = new AnonymousClass48P(r4.Bh3(), r4.getId());
                    }
                    if (r3 != null) {
                        break;
                    }
                }
            }
        }
        return new AnonymousClass34S(r3, r2);
    }

    public static AnonymousClass34S A02(ImageUrl imageUrl, User user, String str, List list) {
        ImageUrl imageUrl2;
        AnonymousClass34S A03 = A03(imageUrl, user, str, list);
        Object obj = A03.A00;
        ImageUrl imageUrl3 = null;
        if (obj != null) {
            imageUrl2 = ((AnonymousClass48P) obj).A00;
        } else {
            imageUrl2 = null;
        }
        Object obj2 = A03.A01;
        if (obj2 != null) {
            imageUrl3 = ((AnonymousClass48P) obj2).A00;
        }
        return new AnonymousClass34S(imageUrl2, imageUrl3);
    }

    public static AnonymousClass34S A03(ImageUrl imageUrl, User user, String str, List list) {
        AnonymousClass48P r0;
        AnonymousClass48P r3 = null;
        if (list.isEmpty()) {
            r0 = new AnonymousClass48P(user.Bh3(), user.getId());
        } else if (list.size() == 1) {
            r0 = new AnonymousClass48P(((AnonymousClass171) list.get(0)).Bh3(), ((AnonymousClass17B) list.get(0)).getId());
        } else {
            Iterator it = list.iterator();
            if (str == null || imageUrl == null || str.equals(user.getId())) {
                AnonymousClass170 r02 = (AnonymousClass170) it.next();
                r0 = new AnonymousClass48P(r02.Bh3(), r02.getId());
            } else {
                r0 = new AnonymousClass48P(imageUrl, str);
            }
            while (it.hasNext() && (r3 == null || r0.A00.equals(r3.A00))) {
                AnonymousClass170 r1 = (AnonymousClass170) it.next();
                r3 = new AnonymousClass48P(r1.Bh3(), r1.getId());
            }
        }
        return new AnonymousClass34S(r0, r3);
    }

    public static ArrayList A05(User user, List list, boolean z) {
        ImageUrl imageUrl;
        ArrayList A06 = A06(user, list, z);
        ArrayList arrayList = new ArrayList(A06.size());
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            AnonymousClass48P r0 = (AnonymousClass48P) it.next();
            if (r0 != null) {
                imageUrl = r0.A00;
            } else {
                imageUrl = null;
            }
            arrayList.add(imageUrl);
        }
        return arrayList;
    }

    public static List A07(UserSession userSession, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass17B r3 = (AnonymousClass17B) list.get(i);
            if (userSession.A06.equals(r3.getId())) {
                if (list.size() > 1) {
                    0wb.A04("DirectUserListUtil_filtered_current_user", 002.A0O("Filtered current user from list of size: ", list.size()), 1);
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.remove(r3);
                return arrayList;
            }
        }
        return list;
    }
}
