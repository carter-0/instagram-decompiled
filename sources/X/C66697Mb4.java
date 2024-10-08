package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mb4  reason: case insensitive filesystem */
public abstract class C66697Mb4 {
    public static final C69597Nof A00(UserSession userSession, AnonymousClass4AN r10, C74514Pw9 pw9, C74516PwB pwB) {
        String str;
        ImageUrl imageUrl;
        ImageUrl imageUrl2;
        ImageUrl imageUrl3 = null;
        if (pw9 != null) {
            str = pw9.BsJ();
            if (!pw9.CU3()) {
                imageUrl = pw9.BsN();
            }
            imageUrl = null;
        } else {
            str = null;
            imageUrl = null;
        }
        0eE r6 = AnonymousClass0t1.A01;
        User A01 = r6.A01(userSession);
        List BkC = pwB.BkC();
        pwB.CUG();
        AnonymousClass34S A03 = AnonymousClass3UE.A03(imageUrl, A01, str, BkC);
        ImageUrl AsU = pwB.AsU();
        int C6a = pwB.C6a();
        if (!(C6a == 28 || C6a == 29)) {
            if (C6a != 32) {
                if (C6a != 61) {
                    if (C6a != 62) {
                        if (!pwB.CUG()) {
                            Object obj = A03.A00;
                            if (obj != null) {
                                return new C66695Mb2(r10.E6y((AnonymousClass48P) obj));
                            }
                            throw new IllegalStateException("Required value was null.");
                        } else if (182.A06(0Tu.A05, userSession, 36327670908205671L)) {
                            ArrayList A06 = AnonymousClass3UE.A06(r6.A01(userSession), pwB.BkC(), !pwB.CUG());
                            ArrayList arrayList = new ArrayList(0Yv.A1E(A06, 10));
                            Iterator it = A06.iterator();
                            while (it.hasNext()) {
                                AnonymousClass48P r0 = (AnonymousClass48P) it.next();
                                if (r0 != null) {
                                    imageUrl2 = r10.E6y(r0);
                                } else {
                                    imageUrl2 = null;
                                }
                                arrayList.add(imageUrl2);
                            }
                            return new C68779NWo(arrayList);
                        } else {
                            Object obj2 = A03.A00;
                            if (obj2 != null) {
                                ImageUrl E6y = r10.E6y((AnonymousClass48P) obj2);
                                AnonymousClass48P r02 = (AnonymousClass48P) A03.A01;
                                if (r02 != null) {
                                    imageUrl3 = r10.E6y(r02);
                                }
                                return new C66824MdG(E6y, imageUrl3);
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
            }
            User A012 = r6.A01(userSession);
            List BkC2 = pwB.BkC();
            String AsX = pwB.AsX();
            if (AsX != null) {
                AnonymousClass34S A013 = AnonymousClass3UE.A01(imageUrl, A012, AsX, str, BkC2);
                Object obj3 = A013.A00;
                if (obj3 != null) {
                    ImageUrl E6y2 = r10.E6y((AnonymousClass48P) obj3);
                    AnonymousClass48P r03 = (AnonymousClass48P) A013.A01;
                    if (r03 != null) {
                        imageUrl3 = r10.E6y(r03);
                    }
                    return new C66824MdG(E6y2, imageUrl3);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (AsU == null) {
            Object obj4 = A03.A00;
            if (obj4 != null) {
                AsU = r10.E6y((AnonymousClass48P) obj4);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return new C66695Mb2(AsU);
    }
}
