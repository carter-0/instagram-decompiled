package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nwa  reason: case insensitive filesystem */
public abstract class C70058Nwa {
    public static final Object A00(C254703su r13, String str) {
        if (str != null && r13.A10 == 2FW.A0y) {
            Object obj = r13.A1T;
            if (obj instanceof List) {
                0qQ.A0C(obj, AnonymousClass000.A00(12));
                Iterator A1H = C51966G9m.A1H(obj);
                while (A1H.hasNext()) {
                    Object next = A1H.next();
                    if (next instanceof C254873tC) {
                        C254873tC r3 = (C254873tC) next;
                        if (r3.A02 == 9) {
                            long j = r3.A0D;
                            if (j == Long.parseLong(str)) {
                                String A0Q = 002.A0Q("instagram://media_viewer?media_fbid=", j);
                                C254883tD r5 = r3.A0Q;
                                ExtendedImageUrl extendedImageUrl = r3.A0X;
                                GifUrlImpl gifUrlImpl = r3.A0Z;
                                if (gifUrlImpl == null) {
                                    gifUrlImpl = null;
                                }
                                return AnonymousClass7TE.A1I(new C254873tC(extendedImageUrl, r5, gifUrlImpl, A0Q, r3.A08, 4, j, r3.A0K, r3.A04()));
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return r13.A1T;
    }
}
